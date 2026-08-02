package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SnapshotStateList.kt */
/* loaded from: classes11.dex */
public final class stm0<T> implements List<T>, jcy {
    public final SnapshotStateList<T> b;
    public final int c;
    public int d;
    public int e;

    /* compiled from: SnapshotStateList.kt */
    public static final class a implements ListIterator<T>, gcy {
        public final /* synthetic */ Ref$IntRef b;
        public final /* synthetic */ stm0<T> c;

        public a(Ref$IntRef ref$IntRef, stm0<T> stm0Var) {
            this.b = ref$IntRef;
            this.c = stm0Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b.element < this.c.e - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            Ref$IntRef ref$IntRef = this.b;
            int i = ref$IntRef.element + 1;
            stm0<T> stm0Var = this.c;
            m200.c(i, stm0Var.e);
            ref$IntRef.element = i;
            return stm0Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b.element + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Ref$IntRef ref$IntRef = this.b;
            int i = ref$IntRef.element;
            stm0<T> stm0Var = this.c;
            m200.c(i, stm0Var.e);
            ref$IntRef.element = i - 1;
            return stm0Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b.element;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public stm0(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.b = snapshotStateList;
        this.c = i;
        this.d = ((euk0) qak0.h(snapshotStateList.b)).e;
        this.e = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        c();
        int i = this.c + this.e;
        SnapshotStateList<T> snapshotStateList = this.b;
        snapshotStateList.add(i, t);
        this.e++;
        this.d = m200.t(snapshotStateList);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.e, collection);
    }

    public final void c() {
        if (m200.t(this.b) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.e > 0) {
            c();
            int i = this.e;
            int i2 = this.c;
            SnapshotStateList<T> snapshotStateList = this.b;
            snapshotStateList.a(i2, i + i2);
            this.e = 0;
            this.d = m200.t(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        c();
        m200.c(i, this.e);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i = this.e;
        int i2 = this.c;
        Iterator<Integer> it = swe0.q(i2, i + i2).iterator();
        while (it.hasNext()) {
            int nextInt = ((z8x) it).nextInt();
            if (epx.f(obj, this.b.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i = this.e;
        int i2 = this.c;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (epx.f(obj, this.b.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        c();
        SnapshotStateList<T> snapshotStateList = this.b;
        int i2 = this.c;
        int i3 = this.e + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(snapshotStateList.b);
                i = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            e1a0 builder = c0a0Var.builder();
            builder.subList(i2, i3).retainAll(collection);
            c0a0 d = builder.d();
            if (epx.f(d, c0a0Var)) {
                break;
            }
            euk0 euk0Var2 = snapshotStateList.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, snapshotStateList, j), i, d, true);
            }
            qak0.n(j, snapshotStateList);
        } while (!e);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.d = ((euk0) qak0.h(this.b.b)).e;
            this.e -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        m200.c(i, this.e);
        c();
        int i2 = i + this.c;
        SnapshotStateList<T> snapshotStateList = this.b;
        T t2 = snapshotStateList.set(i2, t);
        this.d = m200.t(snapshotStateList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.e)) {
            gxc0.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i3 = this.c;
        return new stm0(this.b, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        c();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new a(ref$IntRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        c();
        int i2 = i + this.c;
        SnapshotStateList<T> snapshotStateList = this.b;
        boolean addAll = snapshotStateList.addAll(i2, collection);
        if (addAll) {
            this.e = collection.size() + this.e;
            this.d = m200.t(snapshotStateList);
        }
        return addAll;
    }

    @Override // java.util.List
    public final T remove(int i) {
        c();
        int i2 = this.c + i;
        SnapshotStateList<T> snapshotStateList = this.b;
        T remove = snapshotStateList.remove(i2);
        this.e--;
        this.d = m200.t(snapshotStateList);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        c();
        int i2 = this.c + i;
        SnapshotStateList<T> snapshotStateList = this.b;
        snapshotStateList.add(i2, t);
        this.e++;
        this.d = m200.t(snapshotStateList);
    }
}
