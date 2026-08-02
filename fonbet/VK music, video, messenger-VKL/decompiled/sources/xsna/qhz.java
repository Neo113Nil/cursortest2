package xsna;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: Lists.java */
/* loaded from: classes13.dex */
public final class qhz {

    /* compiled from: Lists.java */
    public static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final szs<? super F, ? extends T> function;

        /* compiled from: Lists.java */
        /* renamed from: xsna.qhz$a$a, reason: collision with other inner class name */
        public class C3563a extends ilp0<F, T> {
            public C3563a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // xsna.hlp0
            public final T a(F f) {
                return a.this.function.apply(f);
            }
        }

        public a(List<F> list, szs<? super F, ? extends T> szsVar) {
            list.getClass();
            this.fromList = list;
            this.function = szsVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new C3563a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    /* compiled from: Lists.java */
    public static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final szs<? super F, ? extends T> function;

        /* compiled from: Lists.java */
        public class a extends ilp0<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // xsna.hlp0
            public final T a(F f) {
                return b.this.function.apply(f);
            }
        }

        public b(List<F> list, szs<? super F, ? extends T> szsVar) {
            list.getClass();
            this.fromList = list;
            this.function = szsVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    public static boolean a(List<?> list, Object obj) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!pli.l(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<?> it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !pli.l(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static int b(ImmutableList immutableList, Object obj) {
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(immutableList.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int c(ImmutableList immutableList, Object obj) {
        for (int size = immutableList.size() - 1; size >= 0; size--) {
            if (obj.equals(immutableList.get(size))) {
                return size;
            }
        }
        return -1;
    }

    @SafeVarargs
    public static <E> ArrayList<E> d(E... eArr) {
        int length = eArr.length;
        k15.h(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(ipx.w(length + 5 + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static AbstractList e(List list, szs szsVar) {
        return list instanceof RandomAccess ? new a(list, szsVar) : new b(list, szsVar);
    }
}
