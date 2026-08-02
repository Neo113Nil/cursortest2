package xsna;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet.jvm.kt */
/* loaded from: classes.dex */
public final class el3<E> implements Collection<E>, Set<E>, hcy, pcy {
    public int[] b;
    public Object[] c;
    public int d;

    /* compiled from: ArraySet.jvm.kt */
    public final class a extends ttw<E> {
        public a() {
            super(el3.this.d);
        }

        @Override // xsna.ttw
        public final E a(int i) {
            return (E) el3.this.c[i];
        }

        @Override // xsna.ttw
        public final void b(int i) {
            el3.this.d(i);
        }
    }

    public el3() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int G;
        int i2 = this.d;
        if (e == null) {
            G = fl3.G(this, null, 0);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            G = fl3.G(this, e, hashCode);
        }
        if (G >= 0) {
            return false;
        }
        int i3 = ~G;
        int[] iArr = this.b;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.c;
            int[] iArr2 = new int[i4];
            this.b = iArr2;
            this.c = new Object[i4];
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                jw5.i(0, iArr.length, 6, iArr, iArr2);
                jw5.k(objArr, 0, this.c, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.b;
            int i5 = i3 + 1;
            jw5.e(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.c;
            jw5.h(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.d;
        if (i2 == i6) {
            int[] iArr4 = this.b;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.c[i3] = e;
                this.d = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        c(collection.size() + this.d);
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final void c(int i) {
        int i2 = this.d;
        int[] iArr = this.b;
        if (iArr.length < i) {
            Object[] objArr = this.c;
            int[] iArr2 = new int[i];
            this.b = iArr2;
            this.c = new Object[i];
            if (i2 > 0) {
                jw5.i(0, i2, 6, iArr, iArr2);
                jw5.k(objArr, 0, this.c, this.d, 6);
            }
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.d != 0) {
            this.b = ey2.b;
            this.c = ey2.d;
            this.d = 0;
        }
        if (this.d != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? fl3.G(this, null, 0) : fl3.G(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final E d(int i) {
        int i2 = this.d;
        Object[] objArr = this.c;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
            return e;
        }
        int i3 = i2 - 1;
        int[] iArr = this.b;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                jw5.e(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.c;
                jw5.h(objArr2, i, objArr2, i4, i2);
            }
            this.c[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.b = iArr2;
            this.c = new Object[i5];
            if (i > 0) {
                jw5.i(0, i, 6, iArr, iArr2);
                jw5.k(objArr, 0, this.c, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                jw5.e(i, i6, i2, iArr, this.b);
                jw5.h(objArr, i, this.c, i6, i2);
            }
        }
        if (i2 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i3;
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.d != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.c[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.b;
        int i = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int G = obj == null ? fl3.G(this, null, 0) : fl3.G(this, obj, obj.hashCode());
        if (G < 0) {
            return false;
        }
        d(G);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        boolean z = false;
        for (int i = this.d - 1; -1 < i; i--) {
            if (!j5g.P(collection, this.c[i])) {
                d(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return jw5.m(0, this.d, this.c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 14);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public el3(int i) {
        this.b = ey2.b;
        this.c = ey2.d;
        if (i > 0) {
            this.b = new int[i];
            this.c = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = (T[]) l370.E(this.d, tArr);
        jw5.h(this.c, 0, tArr2, 0, this.d);
        return tArr2;
    }
}
