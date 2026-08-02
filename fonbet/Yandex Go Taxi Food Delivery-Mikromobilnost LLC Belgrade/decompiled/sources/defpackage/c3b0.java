package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class c3b0 extends v8 implements Collection, yfx {
    public int A;
    public n2b0 a;
    public Object[] b;
    public Object[] c;
    public int w;
    public kx40 x = new kx40();
    public Object[] y;
    public Object[] z;

    public c3b0(b9 b9Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = b9Var;
        this.b = objArr;
        this.c = objArr2;
        this.w = i;
        this.y = this.b;
        this.z = this.c;
        this.A = this.a.size();
    }

    public static void b(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(tls tlsVar, Object[] objArr, int i, vh vhVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = l(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        vhVar.a = objArr2;
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
    public final boolean C(tls tlsVar) {
        int i;
        tls tlsVar2 = tlsVar;
        int K = K();
        Object[] objArr = null;
        vh vhVar = new vh(null);
        boolean z = false;
        if (this.y == null) {
            int A = A(tlsVar2, this.z, K, vhVar);
            Object obj = vhVar.a;
            if (A == K) {
                A = K;
            } else {
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, A, K, (Object) null);
                this.z = objArr2;
                this.A = size() - (K - A);
            }
        } else {
            m8 k = k(0);
            int i2 = 32;
            while (i2 == 32 && k.hasNext()) {
                i2 = A(tlsVar2, (Object[]) k.next(), 32, vhVar);
            }
            if (i2 == 32) {
                int A2 = A(tlsVar2, this.z, K, vhVar);
                Object obj2 = vhVar.a;
                if (A2 == K) {
                    A2 = K;
                } else {
                    Object[] objArr3 = (Object[]) obj2;
                    Arrays.fill(objArr3, A2, K, (Object) null);
                    this.z = objArr3;
                    this.A = size() - (K - A2);
                }
                if (A2 == 0) {
                    s(size(), this.w, this.y);
                }
            } else {
                int i3 = (k.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (k.hasNext()) {
                    i4 = z(tlsVar2, (Object[]) k.next(), 32, i4, vhVar, arrayList2, arrayList);
                    tlsVar2 = tlsVar;
                }
                int z2 = z(tlsVar, this.z, K, i4, vhVar, arrayList2, arrayList);
                Object[] objArr4 = (Object[]) vhVar.a;
                Arrays.fill(objArr4, z2, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr5 = this.y;
                if (!isEmpty) {
                    objArr5 = t(objArr5, i3, this.w, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    khe0.a("invalid size");
                }
                if (size == 0) {
                    this.w = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.w;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.w = i - 5;
                        objArr5 = objArr5[0];
                    }
                    objArr = q(i5, i, objArr5);
                }
                this.y = objArr;
                this.z = objArr4;
                this.A = size + z2;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, vh vhVar) {
        int v = dai0.v(i2, i);
        if (i == 0) {
            Object obj = objArr[v];
            Object[] l = l(objArr);
            int i3 = v + 1;
            System.arraycopy(objArr, i3, l, v, 32 - i3);
            l[31] = vhVar.a;
            vhVar.a = obj;
            return l;
        }
        int v2 = objArr[31] == null ? dai0.v(H() - 1, i) : 31;
        Object[] l2 = l(objArr);
        int i4 = i - 5;
        int i5 = v + 1;
        if (i5 <= v2) {
            while (true) {
                l2[v2] = E((Object[]) l2[v2], i4, 0, vhVar);
                if (v2 == i5) {
                    break;
                }
                v2--;
            }
        }
        l2[v] = E((Object[]) l2[v], i4, i2, vhVar);
        return l2;
    }

    public final Object F(int i, int i2, int i3, Object[] objArr) {
        int size = size() - i;
        Object[] objArr2 = this.z;
        if (size == 1) {
            Object obj = objArr2[0];
            s(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] l = l(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, l, i3, size - i4);
        l[size - 1] = null;
        this.y = objArr;
        this.z = l;
        this.A = (i + size) - 1;
        this.w = i2;
        return obj2;
    }

    public final int H() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] I(Object[] objArr, int i, int i2, Object obj, vh vhVar) {
        int v = dai0.v(i2, i);
        Object[] l = l(objArr);
        if (i != 0) {
            l[v] = I((Object[]) l[v], i - 5, i2, obj, vhVar);
            return l;
        }
        if (l != objArr) {
            ((AbstractList) this).modCount++;
        }
        vhVar.a = l[v];
        l[v] = obj;
        return l;
    }

    public final void J(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] n;
        if (i3 < 1) {
            khe0.a("requires at least one nullBuffer");
        }
        Object[] l = l(objArr);
        objArr2[0] = l;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            f73.g(l, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                n = l;
            } else {
                n = n();
                i3--;
                objArr2[i3] = n;
            }
            int i7 = i2 - i6;
            f73.g(l, 0, objArr3, i7, i2);
            f73.g(l, size + 1, n, i4, i7);
            objArr3 = n;
        }
        Iterator it = collection.iterator();
        b(l, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] n2 = n();
            b(n2, 0, it);
            objArr2[i8] = n2;
        }
        b(objArr3, 0, it);
    }

    public final int K() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    public final n2b0 a() {
        n2b0 zws0Var;
        if (this.y == this.b && this.z == this.c) {
            zws0Var = this.a;
        } else {
            this.x = new kx40();
            Object[] objArr = this.y;
            this.b = objArr;
            Object[] objArr2 = this.z;
            this.c = objArr2;
            zws0Var = objArr == null ? objArr2.length == 0 ? zws0.b : new zws0(Arrays.copyOf(this.z, size())) : new b3b0(objArr, objArr2, size(), this.w);
        }
        this.a = zws0Var;
        return zws0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        sb2.g(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int H = H();
        if (i >= H) {
            i(i - H, obj, this.y);
        } else {
            vh vhVar = new vh(null);
            i(0, vhVar.a, h(this.y, this.w, i, obj, vhVar));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] n;
        sb2.g(i, size());
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
            H();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.z;
            Object[] l = l(objArr);
            System.arraycopy(objArr, i3, l, size2 + 1, K() - i3);
            b(l, i3, collection.iterator());
            this.z = l;
            this.A = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int K = K();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= H()) {
            n = n();
            collection2 = collection;
            J(collection2, i, this.z, K, objArr2, size, n);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.z;
            if (size3 > K) {
                int i4 = size3 - K;
                Object[] m = m(i4, objArr3);
                g(collection2, i, i4, objArr2, size, m);
                objArr2 = objArr2;
                n = m;
            } else {
                n = n();
                int i5 = K - size3;
                System.arraycopy(objArr3, i5, n, 0, K - i5);
                int i6 = 32 - i5;
                Object[] m2 = m(i6, this.z);
                int i7 = size - 1;
                objArr2[i7] = m2;
                g(collection2, i, i6, objArr2, i7, m2);
                collection2 = collection2;
            }
        }
        this.y = u(this.y, i2, objArr2);
        this.z = n;
        this.A = collection2.size() + size();
        return true;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.y == null) {
            ny61.r("root is null");
            return;
        }
        int i4 = i >> 5;
        m8 k = k(H() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (k.a - 1 != i4) {
            Object[] objArr4 = (Object[]) k.previous();
            f73.g(objArr4, 0, objArr3, 32 - i2, 32);
            objArr3 = m(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) k.previous();
        int H = i3 - (((H() >> 5) - 1) - i4);
        if (H < i3) {
            objArr2 = objArr[H];
        }
        J(collection, i, objArr5, 32, objArr, H, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sb2.f(i, size());
        if (H() <= i) {
            objArr = this.z;
        } else {
            Object[] objArr2 = this.y;
            for (int i2 = this.w; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[dai0.v(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.v8
    /* renamed from: getSize */
    public final int getLength() {
        return this.A;
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, vh vhVar) {
        Object obj2;
        int v = dai0.v(i2, i);
        if (i == 0) {
            vhVar.a = objArr[31];
            Object[] l = l(objArr);
            System.arraycopy(objArr, v, l, v + 1, 31 - v);
            l[v] = obj;
            return l;
        }
        Object[] l2 = l(objArr);
        int i3 = i - 5;
        l2[v] = h((Object[]) l2[v], i3, i2, obj, vhVar);
        while (true) {
            v++;
            if (v >= 32 || (obj2 = l2[v]) == null) {
                break;
            }
            l2[v] = h((Object[]) obj2, i3, 0, vhVar.a, vhVar);
        }
        return l2;
    }

    public final void i(int i, Object obj, Object[] objArr) {
        int K = K();
        Object[] l = l(this.z);
        Object[] objArr2 = this.z;
        if (K >= 32) {
            Object obj2 = objArr2[31];
            f73.g(objArr2, i + 1, l, i, 31);
            l[i] = obj;
            x(objArr, l, p(obj2));
            return;
        }
        f73.g(objArr2, i + 1, l, i, K);
        l[i] = obj;
        this.y = objArr;
        this.z = l;
        this.A = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.x;
    }

    public final m8 k(int i) {
        Object[] objArr = this.y;
        if (objArr == null) {
            ny61.r("Invalid root");
            return null;
        }
        int H = H() >> 5;
        sb2.g(i, H);
        int i2 = this.w;
        return i2 == 0 ? new dq6(i, objArr) : new be11(i, H, i2 / 5, objArr);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] n = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        f73.l(objArr, 0, n, length, 6);
        return n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        sb2.g(i, size());
        return new e3b0(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] n = n();
        System.arraycopy(objArr, 0, n, i, 32 - i);
        return n;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.x;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.x;
        return objArr;
    }

    public final Object[] q(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            khe0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int v = dai0.v(i, i2);
        Object q = q(i, i2 - 5, (Object[]) objArr[v]);
        if (v < 31) {
            int i3 = v + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] n = n();
                System.arraycopy(objArr, 0, n, 0, i3);
                objArr = n;
            }
        }
        if (q == objArr[v]) {
            return objArr;
        }
        Object[] l = l(objArr);
        l[v] = q;
        return l;
    }

    public final Object[] r(Object[] objArr, int i, int i2, vh vhVar) {
        Object[] r;
        int v = dai0.v(i2 - 1, i);
        if (i == 5) {
            vhVar.a = objArr[v];
            r = null;
        } else {
            r = r((Object[]) objArr[v], i - 5, i2, vhVar);
        }
        if (r == null && v == 0) {
            return null;
        }
        Object[] l = l(objArr);
        l[v] = r;
        return l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return C(new a9(1, collection));
    }

    @Override // defpackage.v8
    public final Object removeAt(int i) {
        sb2.f(i, size());
        ((AbstractList) this).modCount++;
        int H = H();
        if (i >= H) {
            return F(H, this.w, i - H, this.y);
        }
        vh vhVar = new vh(this.z[0]);
        F(H, this.w, 0, E(this.y, this.w, i, vhVar));
        return vhVar.a;
    }

    public final void s(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.z = objArr;
            this.A = i;
            this.w = i2;
            return;
        }
        vh vhVar = new vh(null);
        Object[] r = r(objArr, i2, i, vhVar);
        this.z = (Object[]) vhVar.a;
        this.A = i;
        if (r[1] == null) {
            this.y = (Object[]) r[0];
            this.w = i2 - 5;
        } else {
            this.y = r;
            this.w = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        sb2.f(i, size());
        if (H() > i) {
            vh vhVar = new vh(null);
            this.y = I(this.y, this.w, i, obj, vhVar);
            return vhVar.a;
        }
        Object[] l = l(this.z);
        if (l != this.z) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = l[i2];
        l[i2] = obj;
        this.z = l;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            khe0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            khe0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] l = l(objArr);
        int v = dai0.v(i, i2);
        int i3 = i2 - 5;
        l[v] = t((Object[]) l[v], i, i3, it);
        while (true) {
            v++;
            if (v >= 32 || !it.hasNext()) {
                break;
            }
            l[v] = t((Object[]) l[v], 0, i3, it);
        }
        return l;
    }

    public final Object[] u(Object[] objArr, int i, Object[][] objArr2) {
        h8 h8Var = new h8(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.w;
        Object[] t = i2 < (1 << i3) ? t(objArr, i, i3, h8Var) : l(objArr);
        while (h8Var.hasNext()) {
            this.w += 5;
            t = p(t);
            int i4 = this.w;
            t(t, 1 << i4, i4, h8Var);
        }
        return t;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.w;
        if (size > (1 << i)) {
            this.y = y(this.w + 5, p(objArr), objArr2);
            this.z = objArr3;
            this.w += 5;
            this.A = size() + 1;
            return;
        }
        if (objArr == null) {
            this.y = objArr2;
            this.z = objArr3;
            this.A = size() + 1;
        } else {
            this.y = y(i, objArr, objArr2);
            this.z = objArr3;
            this.A = size() + 1;
        }
    }

    public final Object[] y(int i, Object[] objArr, Object[] objArr2) {
        int v = dai0.v(size() - 1, i);
        Object[] l = l(objArr);
        if (i == 5) {
            l[v] = objArr2;
            return l;
        }
        l[v] = y(i - 5, (Object[]) l[v], objArr2);
        return l;
    }

    public final int z(tls tlsVar, Object[] objArr, int i, int i2, vh vhVar, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) vhVar.a;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        vhVar.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int K = K();
        if (K < 32) {
            Object[] l = l(this.z);
            l[K] = obj;
            this.z = l;
            this.A = size() + 1;
        } else {
            x(this.y, this.z, p(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int K = K();
        Iterator it = collection.iterator();
        if (32 - K >= collection.size()) {
            Object[] l = l(this.z);
            b(l, K, it);
            this.z = l;
            this.A = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + K) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] l2 = l(this.z);
        b(l2, K, it);
        objArr[0] = l2;
        for (int i = 1; i < size; i++) {
            Object[] n = n();
            b(n, 0, it);
            objArr[i] = n;
        }
        this.y = u(this.y, H(), objArr);
        Object[] n2 = n();
        b(n2, 0, it);
        this.z = n2;
        this.A = collection.size() + size();
        return true;
    }
}
