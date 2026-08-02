package ru.ok.tensorflow.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class Functional {
    public static <T> boolean any(List<T> list, Predicate<T> predicate) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (predicate.apply(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            if (predicate.apply(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    public static <T1, T2, R> List<R> map2(List<T1> list, List<T2> list2, Function2<T1, T2, R> function2) {
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("List sized must be equal");
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(function2.apply(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static <T, R extends Comparable<R>> T max(List<T> list, Function<T, R> function) {
        T t = null;
        R r = null;
        for (T t2 : list) {
            R apply = function.apply(t2);
            if (r == null || apply.compareTo(r) > 0) {
                t = t2;
                r = apply;
            }
        }
        return t;
    }
}
