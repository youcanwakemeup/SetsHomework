import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 10, 4, 5, 5, 6, 8));
        List<String> str = new ArrayList<>(List.of("abc", "abc", "abc", "bc", "adsa", "abc", "rsdfds"));
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        System.out.println(oddNumbers(nums));
        System.out.println(evenIncreasingNoDuplicatesNumbers(nums));
        System.out.println(noDuplicatesStrings(str));
        System.out.println(countDuplicates(strings));

    }
    public static List<Integer> oddNumbers(List<Integer> nums) {
        System.out.println("Задача 1");
        List<Integer> oddNums = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 1) {
                oddNums.add(num);
            }
        }
        return oddNums;
    }

    public static Set<Integer> evenIncreasingNoDuplicatesNumbers(List <Integer> nums) {
        System.out.println("Задача 2");
        Set<Integer> evenIncreasingNoDuplicatesNums = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenIncreasingNoDuplicatesNums.add(num);
            }
        }
        return evenIncreasingNoDuplicatesNums;
    }

    public static Set<String> noDuplicatesStrings(List <String> str) {
        System.out.println("Задача 3");
        return new HashSet<>(str);
        // идея сама подсказала, изначально было так:
        //for (String s : str) {
        //    strings.add(s);
        //}
        //return strings;
    }

    public static Map<String, Integer> countDuplicates(List<String> str) {
        Map<String, Integer> duplicates = new HashMap<>();
        for (String s : str) {
            if (duplicates.containsKey(s)) {
                duplicates.put(s, duplicates.get(s) + 1);
            }
            else {
                duplicates.put(s, 1);
            }
        }
        return duplicates;
    }
}