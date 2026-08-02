package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: MutableVector.kt */
/* loaded from: classes11.dex */
public final class ci50<T> implements RandomAccess {
    public T[] b;
    public a c;
    public int d = 0;

    /* compiled from: MutableVector.kt */
    public static final class a<T> implements List<T>, jcy {
        public final ci50<T> b;

        public a(ci50<T> ci50Var) {
            this.b = ci50Var;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.b.b(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            ci50<T> ci50Var = this.b;
            return ci50Var.e(ci50Var.d, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.b.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            ci50<T> ci50Var = this.b;
            ci50Var.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!ci50Var.h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            di50.a(i, this);
            return this.b.b[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.b.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.b.d == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            ci50<T> ci50Var = this.b;
            T[] tArr = ci50Var.b;
            for (int i = ci50Var.d - 1; i >= 0; i--) {
                if (epx.f(obj, tArr[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.b.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            ci50<T> ci50Var = this.b;
            ci50Var.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = ci50Var.d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ci50Var.j(it.next());
            }
            return i != ci50Var.d;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            ci50<T> ci50Var = this.b;
            int i = ci50Var.d;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(ci50Var.b[i2])) {
                    ci50Var.k(i2);
                }
            }
            return i != ci50Var.d;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            di50.a(i, this);
            T[] tArr = this.b.b;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b.d;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            di50.b(i, i2, this);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.b.a(i, t);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List
        public final T remove(int i) {
            di50.a(i, this);
            return this.b.k(i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            return this.b.e(i, collection);
        }
    }

    /* compiled from: MutableVector.kt */
    public static final class b<T> implements List<T>, jcy {
        public final Object b;
        public final int c;
        public int d;

        public b(List<T> list, int i, int i2) {
            this.b = list;
            this.c = i;
            this.d = i2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.d;
            this.d = i + 1;
            this.b.add(i, t);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            this.b.addAll(i + this.c, collection);
            int size = collection.size();
            this.d += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.d - 1;
            int i2 = this.c;
            if (i2 <= i) {
                while (true) {
                    this.b.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.d = i2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.d;
            for (int i2 = this.c; i2 < i; i2++) {
                if (epx.f(this.b.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T get(int i) {
            di50.a(i, this);
            return (T) this.b.get(i + this.c);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.d;
            int i2 = this.c;
            for (int i3 = i2; i3 < i; i3++) {
                if (epx.f(this.b.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.d == this.c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.d - 1;
            int i2 = this.c;
            if (i2 > i) {
                return -1;
            }
            while (!epx.f(this.b.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.d;
            for (int i2 = this.c; i2 < i; i2++) {
                ?? r2 = this.b;
                if (epx.f(r2.get(i2), obj)) {
                    r2.remove(i2);
                    this.d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i = this.d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.d;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i = this.d;
            int i2 = i - 1;
            int i3 = this.c;
            if (i3 <= i2) {
                while (true) {
                    ?? r3 = this.b;
                    if (!collection.contains(r3.get(i2))) {
                        r3.remove(i2);
                        this.d--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.d;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i, T t) {
            di50.a(i, this);
            return (T) this.b.set(i + this.c, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.d - this.c;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            di50.b(i, i2, this);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i, T t) {
            this.b.add(i + this.c, t);
            this.d++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.b.addAll(this.d, collection);
            int size = collection.size();
            this.d += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i) {
            di50.a(i, this);
            this.d--;
            return (T) this.b.remove(i + this.c);
        }
    }

    /* compiled from: MutableVector.kt */
    public static final class c<T> implements ListIterator<T>, gcy {
        public final Object b;
        public int c;

        public c(List<T> list, int i) {
            this.b = list;
            this.c = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t) {
            this.b.add(this.c, t);
            this.c++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.b.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.c > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.c;
            this.c = i + 1;
            return (T) this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.c;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.c - 1;
            this.c = i;
            return (T) this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.c - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.c - 1;
            this.c = i;
            this.b.remove(i);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t) {
            this.b.set(this.c, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ci50(Object[] objArr) {
        this.b = objArr;
    }

    public final void a(int i, T t) {
        int i2 = this.d + 1;
        if (this.b.length < i2) {
            m(i2);
        }
        T[] tArr = this.b;
        int i3 = this.d;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + 1, i3 - i);
        }
        tArr[i] = t;
        this.d++;
    }

    public final void b(Object obj) {
        int i = this.d + 1;
        if (this.b.length < i) {
            m(i);
        }
        Object[] objArr = (T[]) this.b;
        int i2 = this.d;
        objArr[i2] = obj;
        this.d = i2 + 1;
    }

    public final void c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.d + size;
        if (this.b.length < i2) {
            m(i2);
        }
        Object[] objArr = (T[]) this.b;
        int i3 = this.d;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.d += size;
    }

    public final void d(int i, ci50 ci50Var) {
        int i2 = ci50Var.d;
        if (i2 == 0) {
            return;
        }
        int i3 = this.d + i2;
        if (this.b.length < i3) {
            m(i3);
        }
        T[] tArr = this.b;
        int i4 = this.d;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + i2, i4 - i);
        }
        System.arraycopy(ci50Var.b, 0, tArr, i, i2);
        this.d += i2;
    }

    public final boolean e(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.d + size;
        if (this.b.length < i3) {
            m(i3);
        }
        T[] tArr = this.b;
        int i4 = this.d;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            tArr[i2 + i] = t;
            i2 = i5;
        }
        this.d += size;
        return true;
    }

    public final List<T> f() {
        a aVar = this.c;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.c = aVar2;
        return aVar2;
    }

    public final void g() {
        T[] tArr = this.b;
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.d = 0;
    }

    public final boolean h(T t) {
        int i = this.d - 1;
        if (i >= 0) {
            for (int i2 = 0; !epx.f(this.b[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(T t) {
        T[] tArr = this.b;
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (epx.f(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(T t) {
        int i = i(t);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final T k(int i) {
        T[] tArr = this.b;
        T t = tArr[i];
        int i2 = this.d;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(tArr, i3, tArr, i, i2 - i3);
        }
        int i4 = this.d - 1;
        this.d = i4;
        tArr[i4] = null;
        return t;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.d;
            if (i2 < i3) {
                T[] tArr = this.b;
                System.arraycopy(tArr, i2, tArr, i, i3 - i2);
            }
            int i4 = this.d;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.b[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.d = i5;
        }
    }

    public final void m(int i) {
        T[] tArr = this.b;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.b = tArr2;
    }
}
