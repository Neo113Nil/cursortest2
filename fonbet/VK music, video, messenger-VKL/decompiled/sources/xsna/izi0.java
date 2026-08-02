package xsna;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class izi0 extends oa01 {
    public static HashSet d(Object... objArr) {
        HashSet hashSet = new HashSet(on00.e(objArr.length));
        rl3.p0(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet e(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(objArr.length));
        rl3.p0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet f(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && epx.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set g(Set set, Iterable iterable) {
        Collection<?> B = g5g.B(iterable);
        if (B.isEmpty()) {
            return j5g.S0(set);
        }
        if (!(B instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(B);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) B).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set i(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(objArr.length));
        rl3.p0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet j(Set set, Iterable iterable) {
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        g5g.y(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet k(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set l(Object... objArr) {
        return rl3.y0(objArr);
    }

    public static Set m(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
