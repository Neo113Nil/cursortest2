package xsna;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.random.Random;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: _Collections.kt */
/* loaded from: classes11.dex */
public class j5g extends g5g {
    public static <T> T A0(List<? extends T> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> B0(List<? extends T> list, k9x k9xVar) {
        return k9xVar.isEmpty() ? EmptyList.b : O0(list.subList(k9xVar.b, k9xVar.c + 1));
    }

    public static <T extends Comparable<? super T>> List<T> C0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            List<T> Q0 = Q0(iterable);
            g5g.K(Q0);
            return Q0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return O0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    public static List D0(Comparator comparator, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List Q0 = Q0(iterable);
            g5g.L(Q0, comparator);
            return Q0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return O0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        jw5.A(array, comparator);
        return Arrays.asList(array);
    }

    public static LinkedHashSet E0(Iterable iterable, Iterable iterable2) {
        Collection B = g5g.B(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!B.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static int F0(Iterable<Integer> iterable) {
        Iterator<Integer> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().intValue();
        }
        return i;
    }

    public static long G0(Iterable<Long> iterable) {
        Iterator<Long> it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().longValue();
        }
        return j;
    }

    public static <T> List<T> H0(Iterable<? extends T> iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.b;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return O0(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(X(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return e43.p(arrayList);
    }

    public static List I0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.b;
        }
        int size = list.size();
        if (i >= size) {
            return O0(list);
        }
        if (i == 1) {
            return Collections.singletonList(i0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] J0(ArrayList arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static void K0(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] L0(Collection<Float> collection) {
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static <T> boolean M(Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> HashSet<T> M0(Iterable<? extends T> iterable) {
        HashSet<T> hashSet = new HashSet<>(on00.e(c5g.u(iterable, 12)));
        K0(iterable, hashSet);
        return hashSet;
    }

    public static i5g N(Iterable iterable) {
        return new i5g(iterable);
    }

    public static int[] N0(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static double O(List list) {
        Iterator it = list.iterator();
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).longValue();
            i++;
            if (i < 0) {
                e43.s();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static <T> List<T> O0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            return e43.p(Q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.b;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> boolean P(Iterable<? extends T> iterable, T t) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : c0(iterable, t) >= 0;
    }

    public static long[] P0(Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static <T> int Q(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public static <T> List<T> Q0(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        K0(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> R(Iterable<? extends T> iterable) {
        return O0(R0(iterable));
    }

    public static <T> Set<T> R0(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        K0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> List<T> S(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return O0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return EmptyList.b;
            }
            if (size == 1) {
                return Collections.singletonList(h0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return e43.p(arrayList);
    }

    public static <T> Set<T> S0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            K0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : Collections.singleton(linkedHashSet.iterator().next()) : EmptySet.b;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.b;
        }
        if (size2 == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(on00.e(collection.size()));
        K0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static List T(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return H0(list2, size);
    }

    public static <T> Set<T> T0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> R0 = R0(iterable);
        g5g.y(iterable2, R0);
        return R0;
    }

    public static final Object U(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        h5g h5gVar = new h5g(i, 0);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            h5gVar.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            h5gVar.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        h5gVar.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList U0(Iterable iterable, int i, int i2, boolean z) {
        f2k0.a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b = f2k0.b(iterable.iterator(), i, i2, z, false);
            while (b.hasNext()) {
                arrayList.add((List) b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (i4 < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static <T> List<T> V(Iterable<? extends T> iterable) {
        ArrayList arrayList = new ArrayList();
        W(iterable, arrayList);
        return arrayList;
    }

    public static ArrayList V0(Iterable iterable, int i, int i2, boolean z, izs izsVar) {
        f2k0.a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b = f2k0.b(iterable.iterator(), i, i2, z, true);
            while (b.hasNext()) {
                arrayList.add(izsVar.invoke((List) b.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        nf30 nf30Var = new nf30(list);
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (!z && i4 < i) {
                break;
            }
            nf30Var.b(i3, i4 + i3);
            arrayList2.add(izsVar.invoke(nf30Var));
            i3 += i2;
        }
        return arrayList2;
    }

    public static void W(Iterable iterable, Collection collection) {
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static ytw W0(Iterable iterable) {
        return new ytw(new ac(iterable, 22));
    }

    public static <T> T X(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) Y((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static ArrayList X0(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(c5g.u(iterable, 10), c5g.u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> T Y(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static List Y0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList2.add(new Pair(next, next2));
            next = next2;
        }
        return arrayList2;
    }

    public static <T> T Z(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T a0(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object b0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> int c0(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (epx.f(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet d0(Iterable iterable, Iterable iterable2) {
        Collection B = g5g.B(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (B.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void e0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, izs izsVar) {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                bay.b(appendable, obj, izsVar);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void f0(Iterable iterable, Appendable appendable, String str, String str2, String str3, izs izsVar, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            izsVar = null;
        }
        e0(iterable, appendable, str4, str5, str6, -1, "...", izsVar);
    }

    public static String g0(Iterable iterable, String str, String str2, String str3, int i, izs izsVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str7 = (i2 & 16) != 0 ? "..." : "";
        if ((i2 & 32) != 0) {
            izsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        e0(iterable, sb, str4, str5, str6, i3, str7, izsVar);
        return sb.toString();
    }

    public static <T> T h0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) i0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T i0(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(e43.h(list));
    }

    public static <T> T j0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) ji.a(1, list);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T k0(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (T) ji.a(1, list);
    }

    public static <T extends Comparable<? super T>> T l0(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Float m0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable n0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static <T extends Comparable<? super T>> T o0(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Float p0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable q0(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object r0(Comparator comparator, Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList s0(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && epx.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> t0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection B = g5g.B(iterable2);
        if (B.isEmpty()) {
            return O0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!B.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static ArrayList u0(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            g5g.y(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList v0(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static <T> T w0(Collection<? extends T> collection, Random random) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) U(random.k(collection.size()), collection);
    }

    public static <T> T x0(Collection<? extends T> collection, Random random) {
        if (collection.isEmpty()) {
            return null;
        }
        return (T) U(random.k(collection.size()), collection);
    }

    public static <T> List<T> y0(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return O0(iterable);
        }
        List<T> Q0 = Q0(iterable);
        Collections.reverse(Q0);
        return Q0;
    }

    public static <T> T z0(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }
}
