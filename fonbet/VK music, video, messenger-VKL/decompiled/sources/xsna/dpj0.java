package xsna;

import com.ironsource.B5;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.kt */
/* loaded from: classes.dex */
public class dpj0<K, V> {
    public int[] b;
    public Object[] c;
    public int d;

    public dpj0() {
        this(0);
    }

    public final int a(V v) {
        int i = this.d * 2;
        Object[] objArr = this.c;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (v.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.d;
        int[] iArr = this.b;
        if (iArr.length < i) {
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i * 2);
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int b = ey2.b(i2, i, this.b);
        if (b < 0 || epx.f(obj, this.c[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.b[i3] == i) {
            if (epx.f(obj, this.c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b - 1; i4 >= 0 && this.b[i4] == i; i4--) {
            if (epx.f(obj, this.c[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.d > 0) {
            this.b = ey2.b;
            this.c = ey2.d;
            this.d = 0;
        }
        if (this.d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k) {
        return d(k) >= 0;
    }

    public boolean containsValue(V v) {
        return a(v) >= 0;
    }

    public final int d(K k) {
        return k == null ? e() : c(k.hashCode(), k);
    }

    public final int e() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int b = ey2.b(i, 0, this.b);
        if (b < 0 || this.c[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.b[i2] == 0) {
            if (this.c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b - 1; i3 >= 0 && this.b[i3] == 0; i3--) {
            if (this.c[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof dpj0) {
                int i = this.d;
                if (i != ((dpj0) obj).d) {
                    return false;
                }
                dpj0 dpj0Var = (dpj0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    K f = f(i2);
                    V j = j(i2);
                    Object obj2 = dpj0Var.get(f);
                    if (j == null) {
                        if (obj2 != null || !dpj0Var.containsKey(f)) {
                            return false;
                        }
                    } else if (!j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                K f2 = f(i4);
                V j2 = j(i4);
                Object obj3 = ((Map) obj).get(f2);
                if (j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f2)) {
                        return false;
                    }
                } else if (!j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final K f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.d) {
            z = true;
        }
        if (z) {
            return (K) this.c[i << 1];
        }
        alk.B("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void g(dpj0<? extends K, ? extends V> dpj0Var) {
        int i = dpj0Var.d;
        b(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(dpj0Var.f(i2), dpj0Var.j(i2));
            }
        } else if (i > 0) {
            jw5.e(0, 0, i, dpj0Var.b, this.b);
            jw5.h(dpj0Var.c, 0, this.c, 0, i << 1);
            this.d = i;
        }
    }

    public V get(K k) {
        int d = d(k);
        if (d >= 0) {
            return (V) this.c[(d << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int d = d(obj);
        return d >= 0 ? (V) this.c[(d << 1) + 1] : v;
    }

    public V h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            alk.B("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.c;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i4 = i2 - 1;
        int[] iArr = this.b;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                jw5.e(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.c;
                jw5.h(objArr2, i3, objArr2, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.c;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.b = Arrays.copyOf(iArr, i7);
            this.c = Arrays.copyOf(this.c, i7 << 1);
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                jw5.e(0, 0, i, iArr, this.b);
                jw5.h(objArr, 0, this.c, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                jw5.e(i, i8, i2, iArr, this.b);
                jw5.h(objArr, i3, this.c, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i4;
        return v;
    }

    public int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public V i(int i, V v) {
        boolean z = false;
        if (i >= 0 && i < this.d) {
            z = true;
        }
        if (!z) {
            alk.B("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public final V j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.d) {
            z = true;
        }
        if (z) {
            return (V) this.c[(i << 1) + 1];
        }
        alk.B("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public V put(K k, V v) {
        int i = this.d;
        int hashCode = k != null ? k.hashCode() : 0;
        int c = k != null ? c(hashCode, k) : e();
        if (c >= 0) {
            int i2 = (c << 1) + 1;
            Object[] objArr = this.c;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~c;
        int[] iArr = this.b;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.b = Arrays.copyOf(iArr, i4);
            this.c = Arrays.copyOf(this.c, i4 << 1);
            if (i != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.b;
            int i5 = i3 + 1;
            jw5.e(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.c;
            jw5.h(objArr2, i5 << 1, objArr2, i3 << 1, this.d << 1);
        }
        int i6 = this.d;
        if (i == i6) {
            int[] iArr3 = this.b;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.c;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.d = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(K k) {
        int d = d(k);
        if (d >= 0) {
            return h(d);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int d = d(k);
        if (d >= 0) {
            return i(d, v);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append(B5.U);
            V j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public dpj0(int i) {
        this.b = i == 0 ? ey2.b : new int[i];
        this.c = i == 0 ? ey2.d : new Object[i << 1];
    }

    public final boolean remove(K k, V v) {
        int d = d(k);
        if (d < 0 || !epx.f(v, j(d))) {
            return false;
        }
        h(d);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int d = d(k);
        if (d < 0 || !epx.f(v, j(d))) {
            return false;
        }
        i(d, v2);
        return true;
    }
}
