package xsna;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Lambda;
import xsna.b0a0;

/* compiled from: PersistentVectorBuilder.kt */
/* loaded from: classes8.dex */
public final class d1a0<E> extends yf<E> implements b0a0.a<E> {
    public b0a0<? extends E> b;
    public Object[] c;
    public Object[] d;
    public int e;
    public fto0 f;
    public Object[] g;
    public Object[] h;
    public int i;

    /* compiled from: PersistentVectorBuilder.kt */
    public static final class a extends Lambda implements izs<E, Boolean> {
        final /* synthetic */ Collection<E> $elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.$elements = collection;
        }

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.$elements.contains(obj));
        }
    }

    public static void a(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, E e, wou wouVar) {
        int q = alk.q(i2, i);
        Object[] j = j(objArr);
        if (i == 0) {
            if (j != objArr) {
                ((AbstractList) this).modCount++;
            }
            wouVar.b = j[q];
            j[q] = e;
            return j;
        }
        Object obj = j[q];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        j[q] = A((Object[]) obj, i - 5, i2, e, wouVar);
        return j;
    }

    public final void B(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] l;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] j = j(objArr);
        objArr2[0] = j;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            jw5.h(j, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                l = j;
            } else {
                l = l();
                i3--;
                objArr2[i3] = l;
            }
            int i7 = i2 - i6;
            jw5.h(j, 0, objArr3, i7, i2);
            jw5.h(j, size + 1, l, i4, i7);
            objArr3 = l;
        }
        Iterator<? extends E> it = collection.iterator();
        a(j, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] l2 = l();
            a(l2, 0, it);
            objArr2[i8] = l2;
        }
        a(objArr3, 0, it);
    }

    public final int C() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int C = C();
        if (C < 32) {
            Object[] j = j(this.h);
            j[C] = e;
            this.h = j;
            this.i = size() + 1;
        } else {
            s(this.g, this.h, m(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int C = C();
        Iterator<? extends E> it = collection.iterator();
        if (32 - C >= collection.size()) {
            Object[] j = j(this.h);
            a(j, C, it);
            this.h = j;
            this.i = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + C) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] j2 = j(this.h);
        a(j2, C, it);
        objArr[0] = j2;
        for (int i = 1; i < size; i++) {
            Object[] l = l();
            a(l, 0, it);
            objArr[i] = l;
        }
        this.g = r(this.g, z(), objArr);
        Object[] l2 = l();
        a(l2, 0, it);
        this.h = l2;
        this.i = collection.size() + size();
        return true;
    }

    @Override // xsna.b0a0.a
    public final b0a0<E> build() {
        b1a0 k3k0Var;
        Object[] objArr = this.g;
        if (objArr == this.c && this.h == this.d) {
            k3k0Var = this.b;
        } else {
            this.f = new fto0();
            this.c = objArr;
            Object[] objArr2 = this.h;
            this.d = objArr2;
            k3k0Var = objArr == null ? objArr2.length == 0 ? k3k0.c : new k3k0(Arrays.copyOf(this.h, size())) : new b1a0(objArr, size(), this.e, objArr2);
        }
        this.b = k3k0Var;
        return (b0a0<E>) k3k0Var;
    }

    public final int d() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] e(Object[] objArr, int i, int i2, Object obj, wou wouVar) {
        int q = alk.q(i2, i);
        if (i == 0) {
            wouVar.b = objArr[31];
            Object[] j = j(objArr);
            System.arraycopy(objArr, q, j, q + 1, 31 - q);
            j[q] = obj;
            return j;
        }
        Object[] j2 = j(objArr);
        int i3 = i - 5;
        Object obj2 = j2[q];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        j2[q] = e((Object[]) obj2, i3, i2, obj, wouVar);
        int i4 = q + 1;
        while (i4 < 32) {
            int i5 = i4 + 1;
            Object obj3 = j2[i4];
            if (obj3 == null) {
                break;
            }
            j2[i4] = e((Object[]) obj3, i3, 0, wouVar.b, wouVar);
            i4 = i5;
        }
        return j2;
    }

    public final void f(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        gf i5 = i(z() >> 5);
        int i6 = i3;
        Object[] objArr3 = objArr2;
        while (i5.b - 1 != i4) {
            Object[] objArr4 = (Object[]) i5.previous();
            jw5.h(objArr4, 0, objArr3, 32 - i2, 32);
            objArr3 = k(i2, objArr4);
            i6--;
            objArr[i6] = objArr3;
        }
        Object[] objArr5 = (Object[]) i5.previous();
        int z = i3 - (((z() >> 5) - 1) - i4);
        if (z < i3) {
            objArr2 = objArr[z];
        }
        B(collection, i, objArr5, 32, objArr, z, objArr2);
    }

    public final void g(int i, Object obj, Object[] objArr) {
        int C = C();
        Object[] j = j(this.h);
        if (C < 32) {
            jw5.h(this.h, i + 1, j, i, C);
            j[i] = obj;
            this.g = objArr;
            this.h = j;
            this.i = size() + 1;
            return;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[31];
        jw5.h(objArr2, i + 1, j, i, 31);
        j[i] = obj;
        s(objArr, j, m(obj2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        tci.a(i, size());
        if (z() <= i) {
            objArr = this.h;
        } else {
            objArr = this.g;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object obj = objArr[alk.q(i, i2)];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // xsna.yf
    public final int getSize() {
        return this.i;
    }

    public final boolean h(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f;
    }

    public final gf i(int i) {
        if (this.g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int z = z() >> 5;
        tci.b(i, z);
        int i2 = this.e;
        if (i2 == 0) {
            return new ttj0(this.g, i);
        }
        return new eqp0(this.g, i, z, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr) {
        if (objArr == null) {
            return l();
        }
        if (h(objArr)) {
            return objArr;
        }
        Object[] l = l();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        jw5.k(objArr, 0, l, length, 6);
        return l;
    }

    public final Object[] k(int i, Object[] objArr) {
        if (h(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] l = l();
        System.arraycopy(objArr, 0, l, i, 32 - i);
        return l;
    }

    public final Object[] l() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final Object[] m(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f;
        return objArr;
    }

    public final Object[] n(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int q = alk.q(i, i2);
        Object obj = objArr[q];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object n = n(i, i2 - 5, (Object[]) obj);
        if (q < 31) {
            int i3 = q + 1;
            if (objArr[i3] != null) {
                if (h(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] l = l();
                System.arraycopy(objArr, 0, l, 0, i3);
                objArr = l;
            }
        }
        if (n == objArr[q]) {
            return objArr;
        }
        Object[] j = j(objArr);
        j[q] = n;
        return j;
    }

    public final Object[] o(Object[] objArr, int i, int i2, wou wouVar) {
        Object[] o;
        int q = alk.q(i2 - 1, i);
        if (i == 5) {
            wouVar.b = objArr[q];
            o = null;
        } else {
            Object obj = objArr[q];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            o = o((Object[]) obj, i - 5, i2, wouVar);
        }
        if (o == null && q == 0) {
            return null;
        }
        Object[] j = j(objArr);
        j[q] = o;
        return j;
    }

    public final void p(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            this.g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.h = objArr;
            this.i = i;
            this.e = i2;
            return;
        }
        wou wouVar = new wou(obj);
        Object[] o = o(objArr, i2, i, wouVar);
        Object obj2 = wouVar.b;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.h = (Object[]) obj2;
        this.i = i;
        if (o[1] == null) {
            this.g = (Object[]) o[0];
            this.e = i2 - 5;
        } else {
            this.g = o;
            this.e = i2;
        }
    }

    public final Object[] q(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] j = j(objArr);
        int q = alk.q(i, i2);
        int i3 = i2 - 5;
        j[q] = q((Object[]) j[q], i, i3, it);
        while (true) {
            q++;
            if (q >= 32 || !it.hasNext()) {
                break;
            }
            j[q] = q((Object[]) j[q], 0, i3, it);
        }
        return j;
    }

    public final Object[] r(Object[] objArr, int i, Object[][] objArr2) {
        wk3 wk3Var = new wk3(objArr2);
        int i2 = i >> 5;
        int i3 = this.e;
        Object[] q = i2 < (1 << i3) ? q(objArr, i, i3, wk3Var) : j(objArr);
        while (wk3Var.hasNext()) {
            this.e += 5;
            q = m(q);
            int i4 = this.e;
            q(q, 1 << i4, i4, wk3Var);
        }
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r0 != r15) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (w(r1, r15, r5) != r15) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r0 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection<? extends Object> collection) {
        a aVar = new a(collection);
        int C = C();
        Object[] objArr = null;
        wou wouVar = new wou(objArr);
        boolean z = false;
        if (this.g != null) {
            gf i = i(0);
            int i2 = 32;
            while (i2 == 32 && i.hasNext()) {
                i2 = v(aVar, (Object[]) i.next(), 32, wouVar);
            }
            if (i2 != 32) {
                int i3 = (i.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (i.hasNext()) {
                    i4 = u(aVar, (Object[]) i.next(), 32, i4, wouVar, arrayList2, arrayList);
                }
                d1a0<E> d1a0Var = this;
                int u = d1a0Var.u(aVar, d1a0Var.h, C, i4, wouVar, arrayList2, arrayList);
                Object obj = wouVar.b;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, u, 32, (Object) null);
                Object[] q = arrayList.isEmpty() ? d1a0Var.g : q(d1a0Var.g, i3, d1a0Var.e, arrayList.iterator());
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (size != 0) {
                    int i5 = size - 1;
                    while (true) {
                        int i6 = d1a0Var.e;
                        if ((i5 >> i6) != 0) {
                            objArr = n(i5, i6, q);
                            break;
                        }
                        d1a0Var.e = i6 - 5;
                        Object[] objArr3 = q[0];
                        if (objArr3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                        q = objArr3;
                    }
                } else {
                    d1a0Var.e = 0;
                }
                d1a0Var.g = objArr;
                d1a0Var.h = objArr2;
                d1a0Var.i = size + u;
                z = true;
                if (z) {
                    ((AbstractList) d1a0Var).modCount++;
                }
                return z;
            }
            int w = w(aVar, C, wouVar);
            if (w == 0) {
                p(size(), this.e, this.g);
            }
        }
    }

    @Override // xsna.yf
    public final E removeAt(int i) {
        tci.a(i, size());
        ((AbstractList) this).modCount++;
        int z = z();
        if (i >= z) {
            return (E) y(this.g, z, this.e, i - z);
        }
        wou wouVar = new wou(this.h[0]);
        y(x(this.g, this.e, i, wouVar), z, this.e, 0);
        return (E) wouVar.b;
    }

    public final void s(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.e;
        if (size > (1 << i)) {
            this.g = t(m(objArr), objArr2, this.e + 5);
            this.h = objArr3;
            this.e += 5;
            this.i = size() + 1;
            return;
        }
        if (objArr == null) {
            this.g = objArr2;
            this.h = objArr3;
            this.i = size() + 1;
        } else {
            this.g = t(objArr, objArr2, i);
            this.h = objArr3;
            this.i = size() + 1;
        }
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        tci.a(i, size());
        if (z() > i) {
            wou wouVar = new wou(null);
            this.g = A(this.g, this.e, i, e, wouVar);
            return (E) wouVar.b;
        }
        Object[] j = j(this.h);
        if (j != this.h) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) j[i2];
        j[i2] = e;
        this.h = j;
        return e2;
    }

    public final Object[] t(Object[] objArr, Object[] objArr2, int i) {
        int q = alk.q(size() - 1, i);
        Object[] j = j(objArr);
        if (i == 5) {
            j[q] = objArr2;
            return j;
        }
        j[q] = t((Object[]) j[q], objArr2, i - 5);
        return j;
    }

    public final int u(a aVar, Object[] objArr, int i, int i2, wou wouVar, ArrayList arrayList, ArrayList arrayList2) {
        if (h(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = wouVar.b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            Object obj2 = objArr[i3];
            if (((Boolean) aVar.invoke(obj2)).booleanValue()) {
                i3 = i4;
            } else {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : l();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i3 = i4;
                i2++;
            }
        }
        wouVar.b = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int v(a aVar, Object[] objArr, int i, wou wouVar) {
        int i2 = 0;
        Object[] objArr2 = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) aVar.invoke(obj)).booleanValue()) {
                if (z) {
                    i2 = i4;
                } else {
                    objArr2 = j(objArr);
                    z = true;
                    i3 = i2;
                    i2 = i4;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArr2[i3] = obj;
                i3 = i2;
                i2 = i4;
            } else {
                i2 = i4;
            }
        }
        wouVar.b = objArr2;
        return i3;
    }

    public final int w(a aVar, int i, wou wouVar) {
        int v = v(aVar, this.h, i, wouVar);
        if (v == i) {
            return i;
        }
        Object obj = wouVar.b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, v, i, (Object) null);
        this.h = objArr;
        this.i = size() - (i - v);
        return v;
    }

    public final Object[] x(Object[] objArr, int i, int i2, wou wouVar) {
        int q = alk.q(i2, i);
        if (i == 0) {
            Object obj = objArr[q];
            Object[] j = j(objArr);
            int i3 = q + 1;
            System.arraycopy(objArr, i3, j, q, 32 - i3);
            j[31] = wouVar.b;
            wouVar.b = obj;
            return j;
        }
        int q2 = objArr[31] == null ? alk.q(z() - 1, i) : 31;
        Object[] j2 = j(objArr);
        int i4 = i - 5;
        int i5 = q + 1;
        if (i5 <= q2) {
            while (true) {
                int i6 = q2 - 1;
                Object obj2 = j2[q2];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                j2[q2] = x((Object[]) obj2, i4, 0, wouVar);
                if (q2 == i5) {
                    break;
                }
                q2 = i6;
            }
        }
        Object obj3 = j2[q];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        j2[q] = x((Object[]) obj3, i4, i2, wouVar);
        return j2;
    }

    public final Object y(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.h[0];
            p(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[i3];
        Object[] j = j(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, j, i3, size - i4);
        j[size - 1] = null;
        this.g = objArr;
        this.h = j;
        this.i = (i + size) - 1;
        this.e = i2;
        return obj2;
    }

    public final int z() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        tci.b(i, size());
        return new h1a0(this, i);
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        tci.b(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int z = z();
        if (i >= z) {
            g(i - z, e, this.g);
        } else {
            wou wouVar = new wou(null);
            g(0, wouVar.b, e(this.g, this.e, i, e, wouVar));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        d1a0<E> d1a0Var;
        Object[] l;
        tci.b(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            z();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.h;
            Object[] j = j(objArr);
            System.arraycopy(objArr, i3, j, size2 + 1, C() - i3);
            a(j, i3, collection.iterator());
            this.h = j;
            this.i = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int C = C();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= z()) {
            l = l();
            collection2 = collection;
            B(collection2, i, this.h, C, objArr2, size, l);
            d1a0Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            d1a0Var = this;
            if (size3 > C) {
                int i4 = size3 - C;
                Object[] k = k(i4, d1a0Var.h);
                d1a0Var.f(collection2, i, i4, objArr2, size, k);
                objArr2 = objArr2;
                l = k;
            } else {
                Object[] objArr3 = d1a0Var.h;
                l = l();
                int i5 = C - size3;
                System.arraycopy(objArr3, i5, l, 0, C - i5);
                int i6 = 32 - i5;
                Object[] k2 = k(i6, d1a0Var.h);
                int i7 = size - 1;
                objArr2[i7] = k2;
                d1a0Var.f(collection2, i, i6, objArr2, i7, k2);
                collection2 = collection2;
            }
        }
        d1a0Var.g = r(d1a0Var.g, i2, objArr2);
        d1a0Var.h = l;
        d1a0Var.i = collection2.size() + size();
        return true;
    }
}
