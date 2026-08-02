package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class b3b0 extends b9 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int w;

    public b3b0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.w = i2;
        if (!(size() > 32)) {
            khe0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    public static Object[] a(Object[] objArr, int i, int i2, Object obj, vh vhVar) {
        int v = dai0.v(i2, i);
        if (i == 0) {
            Object[] copyOf = v == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            f73.g(objArr, v + 1, copyOf, v, 31);
            vhVar.a = objArr[31];
            copyOf[v] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        copyOf2[v] = a((Object[]) objArr[v], i3, i2, obj, vhVar);
        while (true) {
            v++;
            if (v >= 32 || copyOf2[v] == null) {
                break;
            }
            copyOf2[v] = a((Object[]) objArr[v], i3, 0, vhVar.a, vhVar);
        }
        return copyOf2;
    }

    public static Object[] f(Object[] objArr, int i, int i2, vh vhVar) {
        Object[] f;
        int v = dai0.v(i2, i);
        if (i == 5) {
            vhVar.a = objArr[v];
            f = null;
        } else {
            f = f((Object[]) objArr[v], i - 5, i2, vhVar);
        }
        if (f == null && v == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[v] = f;
        return copyOf;
    }

    public static Object[] l(Object[] objArr, int i, int i2, Object obj) {
        int v = dai0.v(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[v] = obj;
            return copyOf;
        }
        copyOf[v] = l((Object[]) copyOf[v], i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.n2b0
    public final n2b0 O0(a9 a9Var) {
        c3b0 c3b0Var = new c3b0(this, this.a, this.b, this.w);
        c3b0Var.C(a9Var);
        return c3b0Var.a();
    }

    @Override // java.util.List, defpackage.n2b0
    public final n2b0 add(int i, Object obj) {
        sb2.g(i, size());
        if (i == size()) {
            return add(obj);
        }
        int k = k();
        Object[] objArr = this.a;
        if (i >= k) {
            return b(i - k, obj, objArr);
        }
        vh vhVar = new vh(null);
        return b(0, vhVar.a, a(objArr, this.w, i, obj, vhVar));
    }

    public final b3b0 b(int i, Object obj, Object[] objArr) {
        int size = size() - k();
        Object[] objArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            f73.g(objArr2, i + 1, copyOf, i, size);
            copyOf[i] = obj;
            return new b3b0(objArr, copyOf, size() + 1, this.w);
        }
        Object obj2 = objArr2[31];
        f73.g(objArr2, i + 1, copyOf, i, size - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return g(objArr, copyOf, objArr3);
    }

    @Override // defpackage.n2b0
    public final c3b0 builder() {
        return new c3b0(this, this.a, this.b, this.w);
    }

    public final b3b0 g(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.w;
        if (size <= (1 << i)) {
            return new b3b0(h(i, objArr, objArr2), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new b3b0(h(i2, objArr4, objArr2), objArr3, size() + 1, i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sb2.f(i, size());
        if (k() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.w; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[dai0.v(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.c;
    }

    public final Object[] h(int i, Object[] objArr, Object[] objArr2) {
        int v = dai0.v(size() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[v] = objArr2;
            return copyOf;
        }
        copyOf[v] = h(i - 5, (Object[]) copyOf[v], objArr2);
        return copyOf;
    }

    @Override // defpackage.n2b0
    public final n2b0 h1(int i) {
        sb2.f(i, size());
        int k = k();
        int i2 = this.w;
        Object[] objArr = this.a;
        return i >= k ? j(k, i2, i - k, objArr) : j(k, i2, 0, i(objArr, i2, i, new vh(this.b[0])));
    }

    public final Object[] i(Object[] objArr, int i, int i2, vh vhVar) {
        int v = dai0.v(i2, i);
        if (i == 0) {
            Object[] copyOf = v == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            f73.g(objArr, v, copyOf, v + 1, 32);
            copyOf[31] = vhVar.a;
            vhVar.a = objArr[v];
            return copyOf;
        }
        int v2 = objArr[31] == null ? dai0.v(k() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = v + 1;
        if (i4 <= v2) {
            while (true) {
                copyOf2[v2] = i((Object[]) copyOf2[v2], i3, 0, vhVar);
                if (v2 == i4) {
                    break;
                }
                v2--;
            }
        }
        copyOf2[v] = i((Object[]) copyOf2[v], i3, i2, vhVar);
        return copyOf2;
    }

    public final b9 j(int i, int i2, int i3, Object[] objArr) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                f73.g(objArr2, i3, copyOf, i3 + 1, size);
            }
            copyOf[i4] = null;
            return new b3b0(objArr, copyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new zws0(objArr);
        }
        vh vhVar = new vh(null);
        Object[] f = f(objArr, i2, i - 1, vhVar);
        Object[] objArr3 = (Object[]) vhVar.a;
        return f[1] == null ? new b3b0((Object[]) f[0], objArr3, i, i2 - 5) : new b3b0(f, objArr3, i, i2);
    }

    public final int k() {
        return (size() - 1) & (-32);
    }

    @Override // defpackage.k8, java.util.List
    public final ListIterator listIterator(int i) {
        sb2.g(i, size());
        return new d3b0(this.a, i, this.b, size(), (this.w / 5) + 1);
    }

    @Override // defpackage.k8, java.util.List, defpackage.n2b0
    public final n2b0 set(int i, Object obj) {
        sb2.f(i, size());
        int k = k();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i2 = this.w;
        if (k > i) {
            return new b3b0(l(objArr, i2, i, obj), objArr2, size(), i2);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new b3b0(objArr, copyOf, size(), i2);
    }

    @Override // java.util.Collection, java.util.List, defpackage.n2b0
    public final n2b0 add(Object obj) {
        int size = size() - k();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[size] = obj;
            return new b3b0(objArr, copyOf, size() + 1, this.w);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return g(objArr, objArr2, objArr3);
    }
}
