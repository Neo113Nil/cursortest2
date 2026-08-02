package yads;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public abstract class pz2 {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mz2 a(Set set, ph2 ph2Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof mz2) {
                mz2 mz2Var = (mz2) sortedSet;
                ph2 ph2Var2 = mz2Var.c;
                ph2Var2.getClass();
                ph2Var.getClass();
                return new nz2((SortedSet) mz2Var.b, new qh2(Arrays.asList(ph2Var2, ph2Var)));
            }
            sortedSet.getClass();
            ph2Var.getClass();
            return new nz2(sortedSet, ph2Var);
        }
        if (set instanceof mz2) {
            mz2 mz2Var2 = (mz2) set;
            ph2 ph2Var3 = mz2Var2.c;
            ph2Var3.getClass();
            ph2Var.getClass();
            return new mz2((Set) mz2Var2.b, new qh2(Arrays.asList(ph2Var3, ph2Var)));
        }
        set.getClass();
        ph2Var.getClass();
        return new mz2(set, ph2Var);
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static Set a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
