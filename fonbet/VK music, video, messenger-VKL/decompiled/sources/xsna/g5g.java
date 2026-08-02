package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: _CollectionsJvm.kt */
/* loaded from: classes11.dex */
public class g5g extends f5g {
    public static boolean A(Collection collection, Object[] objArr) {
        return collection.addAll(Arrays.asList(objArr));
    }

    public static Collection B(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : j5g.O0(iterable);
    }

    public static final boolean C(Collection collection, izs izsVar, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) izsVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean D(List list, boolean z, izs izsVar) {
        int i;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof gcy) && !(list instanceof icy)) {
                ttp0.i(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                return C(list, izsVar, z);
            } catch (ClassCastException e) {
                epx.i(e, ttp0.class.getName());
                throw e;
            }
        }
        int h = e43.h(list);
        if (h >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (((Boolean) izsVar.invoke(obj)).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == h) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int h2 = e43.h(list);
        if (i > h2) {
            return true;
        }
        while (true) {
            list.remove(h2);
            if (h2 == i) {
                return true;
            }
            h2--;
        }
    }

    public static ArrayList E(Iterable iterable, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void F(Iterable iterable, Collection collection) {
        collection.removeAll(B(iterable));
    }

    public static Object G(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object H(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object I(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(e43.h(list));
    }

    public static Object J(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(e43.h(list));
    }

    public static void K(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void L(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final int w(int i, List list) {
        if (i >= 0 && i <= e43.h(list)) {
            return e43.h(list) - i;
        }
        StringBuilder b = ji.b(i, "Element index ", " must be in range [");
        b.append(new k9x(0, e43.h(list), 1));
        b.append("].");
        throw new IndexOutOfBoundsException(b.toString());
    }

    public static final int x(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder b = ji.b(i, "Position index ", " must be in range [");
        b.append(new k9x(0, list.size(), 1));
        b.append("].");
        throw new IndexOutOfBoundsException(b.toString());
    }

    public static void y(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void z(Collection collection, uki0 uki0Var) {
        Iterator it = uki0Var.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
