package xsna;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PersistentVector.kt */
/* loaded from: classes11.dex */
public final class c1a0<E> extends fg<E> {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public c1a0(Object[] objArr, int i, int i2, Object[] objArr2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (!(size() > 32)) {
            gxc0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    public static Object[] b(Object[] objArr, int i, int i2, Object obj, up70 up70Var) {
        int m = xus.m(i2, i);
        if (i == 0) {
            Object[] copyOf = m == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            jw5.h(objArr, m + 1, copyOf, m, 31);
            up70Var.b = objArr[31];
            copyOf[m] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        copyOf2[m] = b((Object[]) objArr[m], i3, i2, obj, up70Var);
        while (true) {
            m++;
            if (m >= 32 || copyOf2[m] == null) {
                break;
            }
            copyOf2[m] = b((Object[]) objArr[m], i3, 0, up70Var.b, up70Var);
        }
        return copyOf2;
    }

    public static Object[] d(Object[] objArr, int i, int i2, up70 up70Var) {
        Object[] d;
        int m = xus.m(i2, i);
        if (i == 5) {
            up70Var.b = objArr[m];
            d = null;
        } else {
            d = d((Object[]) objArr[m], i - 5, i2, up70Var);
        }
        if (d == null && m == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[m] = d;
        return copyOf;
    }

    public static Object[] j(Object[] objArr, int i, int i2, Object obj) {
        int m = xus.m(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[m] = obj;
            return copyOf;
        }
        copyOf[m] = j((Object[]) copyOf[m], i - 5, i2, obj);
        return copyOf;
    }

    @Override // java.util.Collection, java.util.List, xsna.c0a0
    public final c0a0<E> add(E e) {
        int size = size() - i();
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[size] = e;
            return new c1a0(objArr, size() + 1, this.e, copyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e;
        return e(objArr, objArr2, objArr3);
    }

    @Override // xsna.c0a0
    public final e1a0 builder() {
        return new e1a0(this, this.b, this.c, this.e);
    }

    public final c1a0 c(int i, Object obj, Object[] objArr) {
        int size = size() - i();
        Object[] objArr2 = this.c;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            jw5.h(objArr2, i + 1, copyOf, i, size);
            copyOf[i] = obj;
            return new c1a0(objArr, size() + 1, this.e, copyOf);
        }
        Object obj2 = objArr2[31];
        jw5.h(objArr2, i + 1, copyOf, i, size - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return e(objArr, copyOf, objArr3);
    }

    public final c1a0<E> e(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.e;
        if (size <= (1 << i)) {
            return new c1a0<>(f(objArr, objArr2, i), size() + 1, i, objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new c1a0<>(f(objArr4, objArr2, i2), size() + 1, i2, objArr3);
    }

    public final Object[] f(Object[] objArr, Object[] objArr2, int i) {
        int m = xus.m(size() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[m] = objArr2;
            return copyOf;
        }
        copyOf[m] = f((Object[]) copyOf[m], objArr2, i - 5);
        return copyOf;
    }

    public final Object[] g(Object[] objArr, int i, int i2, up70 up70Var) {
        int m = xus.m(i2, i);
        if (i == 0) {
            Object[] copyOf = m == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            jw5.h(objArr, m, copyOf, m + 1, 32);
            copyOf[31] = up70Var.b;
            up70Var.b = objArr[m];
            return copyOf;
        }
        int m2 = objArr[31] == null ? xus.m(i() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = m + 1;
        if (i4 <= m2) {
            while (true) {
                copyOf2[m2] = g((Object[]) copyOf2[m2], i3, 0, up70Var);
                if (m2 == i4) {
                    break;
                }
                m2--;
            }
        }
        copyOf2[m] = g((Object[]) copyOf2[m], i3, i2, up70Var);
        return copyOf2;
    }

    @Override // xsna.c0a0
    public final c0a0<E> g9(int i) {
        dz5.k(i, size());
        int i2 = i();
        Object[] objArr = this.b;
        int i3 = this.e;
        return i >= i2 ? h(objArr, i2, i3, i - i2) : h(g(objArr, i3, i, new up70(this.c[0])), i2, i3, 0);
    }

    @Override // xsna.ff, java.util.List
    public final E get(int i) {
        Object[] objArr;
        dz5.k(i, size());
        if (i() <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[xus.m(i, i2)];
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.d;
    }

    public final fg h(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object obj = null;
        if (size != 1) {
            Object[] objArr2 = this.c;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                jw5.h(objArr2, i3, copyOf, i3 + 1, size);
            }
            copyOf[i4] = null;
            return new c1a0(objArr, (i + size) - 1, i2, copyOf);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new l3k0(objArr);
        }
        up70 up70Var = new up70(obj);
        Object[] d = d(objArr, i2, i - 1, up70Var);
        Object[] objArr3 = (Object[]) up70Var.b;
        return d[1] == null ? new c1a0((Object[]) d[0], i, i2 - 5, objArr3) : new c1a0(d, i, i2, objArr3);
    }

    public final int i() {
        return (size() - 1) & (-32);
    }

    @Override // xsna.ff, java.util.List
    public final ListIterator<E> listIterator(int i) {
        dz5.l(i, size());
        return new g1a0(this.b, i, this.c, size(), (this.e / 5) + 1);
    }

    @Override // xsna.c0a0
    public final c0a0 q2(dg dgVar) {
        e1a0 e1a0Var = new e1a0(this, this.b, this.c, this.e);
        e1a0Var.z(dgVar);
        return e1a0Var.d();
    }

    @Override // xsna.ff, java.util.List, xsna.c0a0
    public final c0a0<E> set(int i, E e) {
        dz5.k(i, size());
        int i2 = i();
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.e;
        if (i2 > i) {
            return new c1a0(j(objArr, i3, i, e), size(), i3, objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = e;
        return new c1a0(objArr, size(), i3, copyOf);
    }

    @Override // java.util.List, xsna.c0a0
    public final c0a0<E> add(int i, E e) {
        dz5.l(i, size());
        if (i == size()) {
            return add((c1a0<E>) e);
        }
        int i2 = i();
        Object[] objArr = this.b;
        if (i >= i2) {
            return c(i - i2, e, objArr);
        }
        up70 up70Var = new up70(null);
        return c(0, up70Var.b, b(objArr, this.e, i, e, up70Var));
    }
}
