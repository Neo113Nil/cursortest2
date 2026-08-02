package xsna;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ObjectList.kt */
/* loaded from: classes11.dex */
public final class fh50<E> extends rp70<E> {
    public b<E> c;

    /* compiled from: ObjectList.kt */
    public static final class a<T> implements ListIterator<T>, gcy {
        public final Object b;
        public int c;

        public a(List<T> list, int i) {
            this.b = list;
            this.c = i - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t) {
            int i = this.c + 1;
            this.c = i;
            this.b.add(i, t);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.b.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.c >= 0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.c + 1;
            this.c = i;
            return (T) this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.c + 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.c;
            this.c = i - 1;
            return (T) this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.c;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.b.remove(this.c);
            this.c--;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t) {
            this.b.set(this.c, t);
        }
    }

    /* compiled from: ObjectList.kt */
    public static final class b<T> implements List<T>, jcy {
        public final fh50<T> b;

        public b(fh50<T> fh50Var) {
            this.b = fh50Var;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            int i2;
            fh50<T> fh50Var = this.b;
            if (i < 0 || i > (i2 = fh50Var.b)) {
                StringBuilder b = ji.b(i, "Index ", " must be in 0..");
                b.append(fh50Var.b);
                alk.D(b.toString());
                throw null;
            }
            int i3 = i2 + 1;
            Object[] objArr = fh50Var.a;
            if (objArr.length < i3) {
                fh50Var.q(i3, objArr);
            }
            Object[] objArr2 = fh50Var.a;
            int i4 = fh50Var.b;
            if (i != i4) {
                jw5.h(objArr2, i + 1, objArr2, i, i4);
            }
            objArr2[i] = t;
            fh50Var.b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            fh50<T> fh50Var = this.b;
            if (i < 0 || i > fh50Var.b) {
                StringBuilder b = ji.b(i, "Index ", " must be in 0..");
                b.append(fh50Var.b);
                alk.D(b.toString());
                throw null;
            }
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            int size = collection.size() + fh50Var.b;
            Object[] objArr = fh50Var.a;
            if (objArr.length < size) {
                fh50Var.q(size, objArr);
            }
            Object[] objArr2 = fh50Var.a;
            if (i != fh50Var.b) {
                jw5.h(objArr2, collection.size() + i, objArr2, i, fh50Var.b);
            }
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            fh50Var.b = collection.size() + fh50Var.b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.b.m();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.b(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            fh50<T> fh50Var = this.b;
            fh50Var.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!fh50Var.b(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            sp70.a(i, this);
            return this.b.d(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.b.e(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.b.f();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            fh50<T> fh50Var = this.b;
            if (obj == null) {
                Object[] objArr = fh50Var.a;
                for (int i = fh50Var.b - 1; -1 < i; i--) {
                    if (objArr[i] == null) {
                        return i;
                    }
                }
            } else {
                Object[] objArr2 = fh50Var.a;
                for (int i2 = fh50Var.b - 1; -1 < i2; i2--) {
                    if (obj.equals(objArr2[i2])) {
                        return i2;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.b.n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            fh50<T> fh50Var = this.b;
            int i = fh50Var.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                fh50Var.n(it.next());
            }
            return i != fh50Var.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            fh50<T> fh50Var = this.b;
            int i = fh50Var.b;
            Object[] objArr = fh50Var.a;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(objArr[i2])) {
                    fh50Var.o(i2);
                }
            }
            return i != fh50Var.b;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            sp70.a(i, this);
            return this.b.r(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b.b;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            sp70.b(i, i2, this);
            return new c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this, i);
        }

        @Override // java.util.List
        public final T remove(int i) {
            sp70.a(i, this);
            return this.b.o(i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.b.j(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            fh50<T> fh50Var = this.b;
            int i = fh50Var.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                fh50Var.j(it.next());
            }
            return i != fh50Var.b;
        }
    }

    /* compiled from: ObjectList.kt */
    public static final class c<T> implements List<T>, jcy {
        public final Object b;
        public final int c;
        public int d;

        public c(List<T> list, int i, int i2) {
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
            this.d = collection.size() + this.d;
            return collection.size() > 0;
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
        public final boolean containsAll(Collection<? extends Object> collection) {
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
            sp70.a(i, this);
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
            return new a(this, 0);
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
            return new a(this, 0);
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
        public final boolean removeAll(Collection<? extends Object> collection) {
            int i = this.d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.d;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
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
            sp70.a(i, this);
            return (T) this.b.set(i + this.c, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.d - this.c;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            sp70.b(i, i2, this);
            return new c(this, i, i2);
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
            return new a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.b.addAll(this.d, collection);
            this.d = collection.size() + this.d;
            return collection.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i) {
            sp70.a(i, this);
            this.d--;
            return (T) this.b.remove(i + this.c);
        }
    }

    public fh50() {
        this((Object) null);
    }

    @Override // xsna.rp70
    public final b a() {
        b<E> bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.c = bVar2;
        return bVar2;
    }

    public final void j(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            q(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void k(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            q(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void l(rp70 rp70Var) {
        if (rp70Var.f()) {
            return;
        }
        int i = this.b + rp70Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            q(i, objArr);
        }
        jw5.h(rp70Var.a, this.b, this.a, 0, rp70Var.b);
        this.b += rp70Var.b;
    }

    public final void m() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    public final boolean n(E e) {
        int e2 = e(e);
        if (e2 < 0) {
            return false;
        }
        o(e2);
        return true;
    }

    public final E o(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            i(i);
            throw null;
        }
        Object[] objArr = this.a;
        E e = (E) objArr[i];
        if (i != i2 - 1) {
            jw5.h(objArr, i, objArr, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return e;
    }

    public final void p(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder a2 = odj.a(i, i2, "Start (", ") and end (", ") must be in 0..");
            a2.append(this.b);
            alk.D(a2.toString());
            throw null;
        }
        if (i2 < i) {
            alk.B("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                jw5.h(objArr, i, objArr, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            Arrays.fill(this.a, i5, i4, (Object) null);
            this.b = i5;
        }
    }

    public final void q(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final E r(int i, E e) {
        if (i < 0 || i >= this.b) {
            i(i);
            throw null;
        }
        Object[] objArr = this.a;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        return e2;
    }

    public fh50(int i) {
        this.a = i == 0 ? sp70.a : new Object[i];
    }

    public /* synthetic */ fh50(Object obj) {
        this(16);
    }
}
