package xsna;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PersistentVectorBuilder.kt */
/* loaded from: classes11.dex */
public final class e1a0<E> extends yf<E> implements Collection, hcy {
    public c0a0<? extends E> b;
    public Object[] c;
    public Object[] d;
    public int e;
    public d02 f = new d02();
    public Object[] g;
    public Object[] h;
    public int i;

    public e1a0(fg fgVar, Object[] objArr, Object[] objArr2, int i) {
        this.b = fgVar;
        this.c = objArr;
        this.d = objArr2;
        this.e = i;
        this.g = objArr;
        this.h = objArr2;
        this.i = fgVar.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, up70 up70Var) {
        int m = xus.m(i2, i);
        if (i == 0) {
            Object obj = objArr[m];
            Object[] m2 = m(objArr);
            int i3 = m + 1;
            System.arraycopy(objArr, i3, m2, m, 32 - i3);
            m2[31] = up70Var.b;
            up70Var.b = obj;
            return m2;
        }
        int m3 = objArr[31] == null ? xus.m(C() - 1, i) : 31;
        Object[] m4 = m(objArr);
        int i4 = i - 5;
        int i5 = m + 1;
        if (i5 <= m3) {
            while (true) {
                m4[m3] = A((Object[]) m4[m3], i4, 0, up70Var);
                if (m3 == i5) {
                    break;
                }
                m3--;
            }
        }
        m4[m] = A((Object[]) m4[m], i4, i2, up70Var);
        return m4;
    }

    public final Object B(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.h[0];
            s(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[i3];
        Object[] m = m(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, m, i3, size - i4);
        m[size - 1] = null;
        this.g = objArr;
        this.h = m;
        this.i = (i + size) - 1;
        this.e = i2;
        return obj2;
    }

    public final int C() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i, int i2, E e, up70 up70Var) {
        int m = xus.m(i2, i);
        Object[] m2 = m(objArr);
        if (i != 0) {
            m2[m] = D((Object[]) m2[m], i - 5, i2, e, up70Var);
            return m2;
        }
        if (m2 != objArr) {
            ((AbstractList) this).modCount++;
        }
        up70Var.b = m2[m];
        m2[m] = e;
        return m2;
    }

    public final void E(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] o;
        if (i3 < 1) {
            gxc0.a("requires at least one nullBuffer");
        }
        Object[] m = m(objArr);
        objArr2[0] = m;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            jw5.h(m, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                o = m;
            } else {
                o = o();
                i3--;
                objArr2[i3] = o;
            }
            int i7 = i2 - i6;
            jw5.h(m, 0, objArr3, i7, i2);
            jw5.h(m, size + 1, o, i4, i7);
            objArr3 = o;
        }
        Iterator<? extends E> it = collection.iterator();
        e(m, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] o2 = o();
            e(o2, 0, it);
            objArr2[i8] = o2;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int F = F();
        if (F < 32) {
            Object[] m = m(this.h);
            m[F] = e;
            this.h = m;
            this.i = size() + 1;
        } else {
            v(this.g, this.h, p(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int F = F();
        Iterator<? extends E> it = collection.iterator();
        if (32 - F >= collection.size()) {
            Object[] m = m(this.h);
            e(m, F, it);
            this.h = m;
            this.i = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + F) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] m2 = m(this.h);
        e(m2, F, it);
        objArr[0] = m2;
        for (int i = 1; i < size; i++) {
            Object[] o = o();
            e(o, 0, it);
            objArr[i] = o;
        }
        this.g = u(this.g, C(), objArr);
        Object[] o2 = o();
        e(o2, 0, it);
        this.h = o2;
        this.i = collection.size() + size();
        return true;
    }

    public final c0a0<E> d() {
        c1a0 l3k0Var;
        Object[] objArr = this.g;
        if (objArr == this.c && this.h == this.d) {
            l3k0Var = this.b;
        } else {
            this.f = new d02();
            this.c = objArr;
            Object[] objArr2 = this.h;
            this.d = objArr2;
            l3k0Var = objArr == null ? objArr2.length == 0 ? l3k0.c : new l3k0(Arrays.copyOf(this.h, size())) : new c1a0(objArr, size(), this.e, objArr2);
        }
        this.b = l3k0Var;
        return (c0a0<E>) l3k0Var;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        dz5.k(i, size());
        if (C() <= i) {
            objArr = this.h;
        } else {
            objArr = this.g;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[xus.m(i, i2)];
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // xsna.yf
    public final int getSize() {
        return this.i;
    }

    public final void h(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.g == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        hf l = l(C() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (l.b - 1 != i4) {
            Object[] objArr4 = (Object[]) l.previous();
            jw5.h(objArr4, 0, objArr3, 32 - i2, 32);
            objArr3 = n(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) l.previous();
        int C = i3 - (((C() >> 5) - 1) - i4);
        if (C < i3) {
            objArr2 = objArr[C];
        }
        E(collection, i, objArr5, 32, objArr, C, objArr2);
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, up70 up70Var) {
        Object obj2;
        int m = xus.m(i2, i);
        if (i == 0) {
            up70Var.b = objArr[31];
            Object[] m2 = m(objArr);
            System.arraycopy(objArr, m, m2, m + 1, 31 - m);
            m2[m] = obj;
            return m2;
        }
        Object[] m3 = m(objArr);
        int i3 = i - 5;
        m3[m] = i((Object[]) m3[m], i3, i2, obj, up70Var);
        while (true) {
            m++;
            if (m >= 32 || (obj2 = m3[m]) == null) {
                break;
            }
            m3[m] = i((Object[]) obj2, i3, 0, up70Var.b, up70Var);
        }
        return m3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj, Object[] objArr) {
        int F = F();
        Object[] m = m(this.h);
        if (F < 32) {
            jw5.h(this.h, i + 1, m, i, F);
            m[i] = obj;
            this.g = objArr;
            this.h = m;
            this.i = size() + 1;
            return;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[31];
        jw5.h(objArr2, i + 1, m, i, 31);
        m[i] = obj;
        v(objArr, m, p(obj2));
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f;
    }

    public final hf l(int i) {
        Object[] objArr = this.g;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int C = C() >> 5;
        dz5.l(i, C);
        int i2 = this.e;
        return i2 == 0 ? new utj0(objArr, i) : new fqp0(objArr, i, C, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] o = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        jw5.k(objArr, 0, o, length, 6);
        return o;
    }

    public final Object[] n(int i, Object[] objArr) {
        if (k(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] o = o();
        System.arraycopy(objArr, 0, o, i, 32 - i);
        return o;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f;
        return objArr;
    }

    public final Object[] q(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            gxc0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int m = xus.m(i, i2);
        Object q = q(i, i2 - 5, (Object[]) objArr[m]);
        if (m < 31) {
            int i3 = m + 1;
            if (objArr[i3] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] o = o();
                System.arraycopy(objArr, 0, o, 0, i3);
                objArr = o;
            }
        }
        if (q == objArr[m]) {
            return objArr;
        }
        Object[] m2 = m(objArr);
        m2[m] = q;
        return m2;
    }

    public final Object[] r(Object[] objArr, int i, int i2, up70 up70Var) {
        Object[] r;
        int m = xus.m(i2 - 1, i);
        if (i == 5) {
            up70Var.b = objArr[m];
            r = null;
        } else {
            r = r((Object[]) objArr[m], i - 5, i2, up70Var);
        }
        if (r == null && m == 0) {
            return null;
        }
        Object[] m2 = m(objArr);
        m2[m] = r;
        return m2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        return z(new al(1, collection));
    }

    @Override // xsna.yf
    public final E removeAt(int i) {
        dz5.k(i, size());
        ((AbstractList) this).modCount++;
        int C = C();
        if (i >= C) {
            return (E) B(this.g, C, this.e, i - C);
        }
        up70 up70Var = new up70(this.h[0]);
        B(A(this.g, this.e, i, up70Var), C, this.e, 0);
        return (E) up70Var.b;
    }

    public final void s(int i, int i2, Object[] objArr) {
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
        up70 up70Var = new up70(obj);
        Object[] r = r(objArr, i2, i, up70Var);
        this.h = (Object[]) up70Var.b;
        this.i = i;
        if (r[1] == null) {
            this.g = (Object[]) r[0];
            this.e = i2 - 5;
        } else {
            this.g = r;
            this.e = i2;
        }
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        dz5.k(i, size());
        if (C() > i) {
            up70 up70Var = new up70(null);
            this.g = D(this.g, this.e, i, e, up70Var);
            return (E) up70Var.b;
        }
        Object[] m = m(this.h);
        if (m != this.h) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) m[i2];
        m[i2] = e;
        this.h = m;
        return e2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            gxc0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            gxc0.a("negative shift");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] m = m(objArr);
        int m2 = xus.m(i, i2);
        int i3 = i2 - 5;
        m[m2] = t((Object[]) m[m2], i, i3, it);
        while (true) {
            m2++;
            if (m2 >= 32 || !it.hasNext()) {
                break;
            }
            m[m2] = t((Object[]) m[m2], 0, i3, it);
        }
        return m;
    }

    public final Object[] u(Object[] objArr, int i, Object[][] objArr2) {
        wk3 wk3Var = new wk3(objArr2);
        int i2 = i >> 5;
        int i3 = this.e;
        Object[] t = i2 < (1 << i3) ? t(objArr, i, i3, wk3Var) : m(objArr);
        while (wk3Var.hasNext()) {
            this.e += 5;
            t = p(t);
            int i4 = this.e;
            t(t, 1 << i4, i4, wk3Var);
        }
        return t;
    }

    public final void v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.e;
        if (size > (1 << i)) {
            this.g = w(p(objArr), objArr2, this.e + 5);
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
            this.g = w(objArr, objArr2, i);
            this.h = objArr3;
            this.i = size() + 1;
        }
    }

    public final Object[] w(Object[] objArr, Object[] objArr2, int i) {
        int m = xus.m(size() - 1, i);
        Object[] m2 = m(objArr);
        if (i == 5) {
            m2[m] = objArr2;
            return m2;
        }
        m2[m] = w((Object[]) m2[m], objArr2, i - 5);
        return m2;
    }

    public final int x(izs izsVar, Object[] objArr, int i, int i2, up70 up70Var, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) up70Var.b;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) izsVar.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        up70Var.b = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int y(izs<? super E, Boolean> izsVar, Object[] objArr, int i, up70 up70Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (izsVar.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = m(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        up70Var.b = objArr2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r0 != r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r0 != r8) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(izs<? super E, Boolean> izsVar) {
        int i;
        izs<? super E, Boolean> izsVar2 = izsVar;
        int F = F();
        Object[] objArr = null;
        up70 up70Var = new up70(objArr);
        boolean z = false;
        if (this.g == null) {
            int y = y(izsVar2, this.h, F, up70Var);
            if (y == F) {
                y = F;
            } else {
                Object[] objArr2 = (Object[]) up70Var.b;
                Arrays.fill(objArr2, y, F, (Object) null);
                this.h = objArr2;
                this.i = size() - (F - y);
            }
        } else {
            hf l = l(0);
            int i2 = 32;
            while (i2 == 32 && l.hasNext()) {
                i2 = y(izsVar2, (Object[]) l.next(), 32, up70Var);
            }
            if (i2 == 32) {
                int y2 = y(izsVar2, this.h, F, up70Var);
                if (y2 == F) {
                    y2 = F;
                } else {
                    Object[] objArr3 = (Object[]) up70Var.b;
                    Arrays.fill(objArr3, y2, F, (Object) null);
                    this.h = objArr3;
                    this.i = size() - (F - y2);
                }
                if (y2 == 0) {
                    s(size(), this.e, this.g);
                }
            } else {
                int i3 = (l.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (l.hasNext()) {
                    i4 = x(izsVar2, (Object[]) l.next(), 32, i4, up70Var, arrayList2, arrayList);
                    izsVar2 = izsVar;
                }
                int x = x(izsVar, this.h, F, i4, up70Var, arrayList2, arrayList);
                Object[] objArr4 = (Object[]) up70Var.b;
                Arrays.fill(objArr4, x, 32, (Object) null);
                Object[] t = arrayList.isEmpty() ? this.g : t(this.g, i3, this.e, arrayList.iterator());
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    gxc0.a("invalid size");
                }
                if (size == 0) {
                    this.e = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.e;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.e = i - 5;
                        t = t[0];
                    }
                    objArr = q(i5, i, t);
                }
                this.g = objArr;
                this.h = objArr4;
                this.i = size + x;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        dz5.l(i, size());
        return new i1a0(this, i);
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        dz5.l(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int C = C();
        if (i >= C) {
            j(i - C, e, this.g);
        } else {
            up70 up70Var = new up70(null);
            j(0, up70Var.b, i(this.g, this.e, i, e, up70Var));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        e1a0<E> e1a0Var;
        Object[] o;
        dz5.l(i, size());
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
            C();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.h;
            Object[] m = m(objArr);
            System.arraycopy(objArr, i3, m, size2 + 1, F() - i3);
            e(m, i3, collection.iterator());
            this.h = m;
            this.i = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int F = F();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= C()) {
            o = o();
            collection2 = collection;
            E(collection2, i, this.h, F, objArr2, size, o);
            e1a0Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            e1a0Var = this;
            if (size3 > F) {
                int i4 = size3 - F;
                Object[] n = n(i4, e1a0Var.h);
                e1a0Var.h(collection2, i, i4, objArr2, size, n);
                objArr2 = objArr2;
                o = n;
            } else {
                Object[] objArr3 = e1a0Var.h;
                o = o();
                int i5 = F - size3;
                System.arraycopy(objArr3, i5, o, 0, F - i5);
                int i6 = 32 - i5;
                Object[] n2 = n(i6, e1a0Var.h);
                int i7 = size - 1;
                objArr2[i7] = n2;
                e1a0Var.h(collection2, i, i6, objArr2, i7, n2);
                collection2 = collection2;
            }
        }
        e1a0Var.g = u(e1a0Var.g, i2, objArr2);
        e1a0Var.h = o;
        e1a0Var.i = collection2.size() + size();
        return true;
    }
}
