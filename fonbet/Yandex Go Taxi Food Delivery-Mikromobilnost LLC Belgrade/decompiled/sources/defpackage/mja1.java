package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.collections.a;
import yads.je2;

/* loaded from: classes11.dex */
public abstract class mja1 {
    public static ovi0 a(String str, kfv kfvVar, int i) {
        if ((i & 2) != 0) {
            kfvVar = null;
        }
        return new ovi0(str, str, kfvVar);
    }

    public static pvi0 b(String str, jfv jfvVar, int i) {
        if ((i & 2) != 0) {
            jfvVar = null;
        }
        return new pvi0(str, str, jfvVar);
    }

    public static int c(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static q681 d(Set set, ag71 ag71Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof q681)) {
                return new fa81(set2, ag71Var);
            }
            q681 q681Var = (q681) set2;
            ag71 ag71Var2 = q681Var.b;
            ag71Var2.getClass();
            return new fa81((SortedSet) q681Var.a, new je2(Arrays.asList(ag71Var2, ag71Var)));
        }
        if (!(set instanceof q681)) {
            set.getClass();
            return new q681(set, ag71Var);
        }
        q681 q681Var2 = (q681) set;
        ag71 ag71Var3 = q681Var2.b;
        ag71Var3.getClass();
        return new q681(q681Var2.a, new je2(Arrays.asList(ag71Var3, ag71Var)));
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final Object f(m5x m5xVar, List list) {
        if (list.isEmpty()) {
            return m5xVar;
        }
        String str = (String) list.get(0);
        List J = a.J(list, 1);
        j5x j5xVar = (j5x) m5xVar.a.get(str);
        if (j5xVar != null) {
            if (J.isEmpty()) {
                if (j5xVar instanceof o6x) {
                    return ((o6x) j5xVar).a;
                }
                if (j5xVar instanceof i5x) {
                    return Long.valueOf(((i5x) j5xVar).a);
                }
                if (j5xVar instanceof h5x) {
                    return Double.valueOf(((h5x) j5xVar).a);
                }
                if (j5xVar instanceof w4x) {
                    return Boolean.valueOf(((w4x) j5xVar).a);
                }
                if ((j5xVar instanceof m5x) || (j5xVar instanceof v4x)) {
                    return j5xVar;
                }
                w511.b();
                return null;
            }
            if (j5xVar instanceof m5x) {
                return f((m5x) j5xVar, J);
            }
        }
        return null;
    }

    public static void g(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMaxScrollX(i);
    }

    public static void h(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMaxScrollY(i);
    }

    public static void i(AccessibilityEvent accessibilityEvent, View view, int i) {
        accessibilityEvent.setSource(view, i);
    }
}
