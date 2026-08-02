package xsna;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: TrieNode.kt */
/* loaded from: classes8.dex */
public final class hqp0<K, V> {
    public static final hqp0 e = new hqp0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final fto0 c;
    public Object[] d;

    public hqp0(int i, int i2, Object[] objArr, fto0 fto0Var) {
        this.a = i;
        this.b = i2;
        this.c = fto0Var;
        this.d = objArr;
    }

    public static hqp0 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, fto0 fto0Var) {
        if (i3 > 30) {
            return new hqp0(0, 0, new Object[]{obj, obj2, obj3, obj4}, fto0Var);
        }
        int z = zq70.z(i, i3);
        int z2 = zq70.z(i2, i3);
        if (z != z2) {
            return new hqp0((1 << z) | (1 << z2), 0, z < z2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, fto0Var);
        }
        return new hqp0(0, 1 << z, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, fto0Var)}, fto0Var);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, fto0 fto0Var) {
        Object obj = this.d[i];
        hqp0 k2 = k(obj == null ? 0 : obj.hashCode(), obj, v(i), i3, k, v, i4 + 5, fto0Var);
        int u = u(i2);
        int i5 = u + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i, objArr2, i + 2, i5);
        objArr2[u - 1] = k2;
        jw5.h(objArr, u, objArr2, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += t(i).b();
        }
        return bitCount;
    }

    public final int c(Object obj) {
        i9x p = swe0.p(2, swe0.q(0, this.d.length));
        int i = p.b;
        int i2 = p.c;
        int i3 = p.d;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (true) {
            int i4 = i + i3;
            if (epx.f(obj, this.d[i])) {
                return i;
            }
            if (i == i2) {
                return -1;
            }
            i = i4;
        }
    }

    public final boolean d(int i, int i2, Object obj) {
        int z = 1 << zq70.z(i, i2);
        if (i(z)) {
            return epx.f(obj, this.d[f(z)]);
        }
        if (!j(z)) {
            return false;
        }
        hqp0<K, V> t = t(u(z));
        return i2 == 30 ? t.c(obj) != -1 : t.d(i, i2 + 5, obj);
    }

    public final boolean e(hqp0<K, V> hqp0Var) {
        if (this == hqp0Var) {
            return true;
        }
        if (this.b == hqp0Var.b && this.a == hqp0Var.a) {
            int length = this.d.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (this.d[i] == hqp0Var.d[i]) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K1, V1> boolean g(hqp0<K1, V1> hqp0Var, wzs<? super V, ? super V1, Boolean> wzsVar) {
        int i;
        if (this == hqp0Var) {
            return true;
        }
        int i2 = this.a;
        if (i2 == hqp0Var.a && (i = this.b) == hqp0Var.b) {
            if (i2 != 0 || i != 0) {
                int bitCount = Integer.bitCount(i2) * 2;
                i9x p = swe0.p(2, swe0.q(0, bitCount));
                int i3 = p.b;
                int i4 = p.c;
                int i5 = p.d;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        int i6 = i3 + i5;
                        if (!epx.f(this.d[i3], hqp0Var.d[i3]) || !wzsVar.invoke(v(i3), hqp0Var.v(i3)).booleanValue()) {
                            break;
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 = i6;
                    }
                }
                int length = this.d.length;
                while (bitCount < length) {
                    int i7 = bitCount + 1;
                    if (t(bitCount).g(hqp0Var.t(bitCount), wzsVar)) {
                        bitCount = i7;
                    }
                }
                return true;
            }
            Object[] objArr = this.d;
            if (objArr.length == hqp0Var.d.length) {
                i9x p2 = swe0.p(2, swe0.q(0, objArr.length));
                if ((p2 instanceof Collection) && ((Collection) p2).isEmpty()) {
                    return true;
                }
                j9x it = p2.iterator();
                while (it.d) {
                    int nextInt = it.nextInt();
                    Object obj = hqp0Var.d[nextInt];
                    V1 v = hqp0Var.v(nextInt);
                    int c = c(obj);
                    if (!(c != -1 ? wzsVar.invoke(v(c), v).booleanValue() : false)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object h(int i, int i2, Object obj) {
        int z = 1 << zq70.z(i, i2);
        if (i(z)) {
            int f = f(z);
            if (epx.f(obj, this.d[f])) {
                return v(f);
            }
            return null;
        }
        if (!j(z)) {
            return null;
        }
        hqp0<K, V> t = t(u(z));
        if (i2 != 30) {
            return t.h(i, i2 + 5, obj);
        }
        int c = t.c(obj);
        if (c != -1) {
            return t.v(c);
        }
        return null;
    }

    public final boolean i(int i) {
        return (i & this.a) != 0;
    }

    public final boolean j(int i) {
        return (i & this.b) != 0;
    }

    public final hqp0<K, V> l(int i, zy90<K, V> zy90Var) {
        zy90Var.e(zy90Var.g - 1);
        zy90Var.e = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != zy90Var.c) {
            return new hqp0<>(0, 0, zq70.f(i, objArr), zy90Var.c);
        }
        this.d = zq70.f(i, objArr);
        return this;
    }

    public final hqp0<K, V> m(int i, K k, V v, int i2, zy90<K, V> zy90Var) {
        zy90<K, V> zy90Var2;
        hqp0<K, V> m;
        int z = 1 << zq70.z(i, i2);
        boolean i3 = i(z);
        fto0 fto0Var = this.c;
        if (i3) {
            int f = f(z);
            if (!epx.f(k, this.d[f])) {
                zy90Var.e(zy90Var.g + 1);
                fto0 fto0Var2 = zy90Var.c;
                if (fto0Var != fto0Var2) {
                    return new hqp0<>(this.a ^ z, this.b | z, a(f, z, i, k, v, i2, fto0Var2), fto0Var2);
                }
                this.d = a(f, z, i, k, v, i2, fto0Var2);
                this.a ^= z;
                this.b |= z;
                return this;
            }
            zy90Var.e = v(f);
            if (v(f) == v) {
                return this;
            }
            if (fto0Var == zy90Var.c) {
                this.d[f + 1] = v;
                return this;
            }
            zy90Var.f++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = v;
            return new hqp0<>(this.a, this.b, copyOf, zy90Var.c);
        }
        if (!j(z)) {
            zy90Var.e(zy90Var.g + 1);
            fto0 fto0Var3 = zy90Var.c;
            int f2 = f(z);
            if (fto0Var != fto0Var3) {
                return new hqp0<>(this.a | z, this.b, zq70.e(k, v, this.d, f2), fto0Var3);
            }
            this.d = zq70.e(k, v, this.d, f2);
            this.a |= z;
            return this;
        }
        int u = u(z);
        hqp0<K, V> t = t(u);
        if (i2 == 30) {
            int c = t.c(k);
            if (c != -1) {
                zy90Var.e = t.v(c);
                if (t.c == zy90Var.c) {
                    t.d[c + 1] = v;
                    m = t;
                } else {
                    zy90Var.f++;
                    Object[] objArr2 = t.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    copyOf2[c + 1] = v;
                    m = new hqp0<>(0, 0, copyOf2, zy90Var.c);
                }
            } else {
                zy90Var.e(zy90Var.g + 1);
                m = new hqp0<>(0, 0, zq70.e(k, v, t.d, 0), zy90Var.c);
            }
            zy90Var2 = zy90Var;
        } else {
            zy90Var2 = zy90Var;
            m = t.m(i, k, v, i2 + 5, zy90Var2);
        }
        return t == m ? this : s(u, m, zy90Var2.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r5v14, types: [xsna.hqp0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [xsna.hqp0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [xsna.hqp0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [xsna.hqp0] */
    /* JADX WARN: Type inference failed for: r5v29, types: [xsna.hqp0] */
    public final hqp0<K, V> n(hqp0<K, V> hqp0Var, int i, yyl yylVar, zy90<K, V> zy90Var) {
        ?? r17;
        hqp0<K, V> hqp0Var2;
        if (this == hqp0Var) {
            yylVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            fto0 fto0Var = zy90Var.c;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + hqp0Var.d.length);
            int length = this.d.length;
            i9x p = swe0.p(2, swe0.q(0, hqp0Var.d.length));
            int i3 = p.b;
            int i4 = p.c;
            int i5 = p.d;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    int i6 = i3 + i5;
                    if (c(hqp0Var.d[i3]) != -1) {
                        yylVar.a++;
                    } else {
                        Object[] objArr2 = hqp0Var.d;
                        copyOf[length] = objArr2[i3];
                        copyOf[length + 1] = objArr2[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 = i6;
                }
            }
            if (length != this.d.length) {
                if (length != hqp0Var.d.length) {
                    return length == copyOf.length ? new hqp0<>(0, 0, copyOf, fto0Var) : new hqp0<>(0, 0, Arrays.copyOf(copyOf, length), fto0Var);
                }
            }
            return this;
        }
        int i7 = this.b | hqp0Var.b;
        int i8 = this.a;
        int i9 = hqp0Var.a;
        int i10 = (i8 ^ i9) & (~i7);
        int i11 = i8 & i9;
        int i12 = i10;
        while (i11 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i11);
            if (epx.f(this.d[f(lowestOneBit)], hqp0Var.d[hqp0Var.f(lowestOneBit)])) {
                i12 |= lowestOneBit;
            } else {
                i7 |= lowestOneBit;
            }
            i11 ^= lowestOneBit;
        }
        if ((i7 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        hqp0<K, V> hqp0Var3 = (epx.f(this.c, zy90Var.c) && this.a == i12 && this.b == i7) ? this : new hqp0<>(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
        int i13 = i7;
        int i14 = 0;
        while (i13 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i13);
            Object[] objArr3 = hqp0Var3.d;
            int length2 = (objArr3.length - 1) - i14;
            if (j(lowestOneBit2)) {
                hqp0Var2 = t(u(lowestOneBit2));
                if (hqp0Var.j(lowestOneBit2)) {
                    hqp0Var2 = (hqp0<K, V>) hqp0Var2.n(hqp0Var.t(hqp0Var.u(lowestOneBit2)), i + 5, yylVar, zy90Var);
                    r17 = objArr3;
                } else if (hqp0Var.i(lowestOneBit2)) {
                    int f = hqp0Var.f(lowestOneBit2);
                    Object obj = hqp0Var.d[f];
                    V v = hqp0Var.v(f);
                    int i15 = zy90Var.g;
                    r17 = objArr3;
                    hqp0Var2 = (hqp0<K, V>) hqp0Var2.m(obj == null ? i2 : obj.hashCode(), obj, v, i + 5, zy90Var);
                    if (zy90Var.g == i15) {
                        yylVar.a++;
                    }
                } else {
                    r17 = objArr3;
                }
            } else {
                r17 = objArr3;
                if (hqp0Var.j(lowestOneBit2)) {
                    hqp0<K, V> t = hqp0Var.t(hqp0Var.u(lowestOneBit2));
                    if (i(lowestOneBit2)) {
                        int f2 = f(lowestOneBit2);
                        Object obj2 = this.d[f2];
                        int i16 = i + 5;
                        if (t.d(obj2 == null ? 0 : obj2.hashCode(), i16, obj2)) {
                            yylVar.a++;
                        } else {
                            hqp0Var2 = t.m(obj2 == null ? 0 : obj2.hashCode(), obj2, v(f2), i16, zy90Var);
                        }
                    }
                    hqp0Var2 = t;
                } else {
                    int f3 = f(lowestOneBit2);
                    Object obj3 = this.d[f3];
                    V v2 = v(f3);
                    int f4 = hqp0Var.f(lowestOneBit2);
                    Object obj4 = hqp0Var.d[f4];
                    hqp0Var2 = (hqp0<K, V>) k(obj3 == null ? 0 : obj3.hashCode(), obj3, v2, obj4 == null ? 0 : obj4.hashCode(), obj4, hqp0Var.v(f4), i + 5, zy90Var.c);
                }
            }
            r17[length2] = hqp0Var2;
            i14++;
            i13 ^= lowestOneBit2;
            i2 = 0;
        }
        int i17 = 0;
        while (i12 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i12);
            int i18 = i17 * 2;
            if (hqp0Var.i(lowestOneBit3)) {
                int f5 = hqp0Var.f(lowestOneBit3);
                Object[] objArr4 = hqp0Var3.d;
                objArr4[i18] = hqp0Var.d[f5];
                objArr4[i18 + 1] = hqp0Var.v(f5);
                if (i(lowestOneBit3)) {
                    yylVar.a++;
                }
            } else {
                int f6 = f(lowestOneBit3);
                Object[] objArr5 = hqp0Var3.d;
                objArr5[i18] = this.d[f6];
                objArr5[i18 + 1] = v(f6);
            }
            i17++;
            i12 ^= lowestOneBit3;
        }
        if (!e(hqp0Var3)) {
            return hqp0Var.e(hqp0Var3) ? hqp0Var : hqp0Var3;
        }
        return this;
    }

    public final hqp0<K, V> o(int i, K k, int i2, zy90<K, V> zy90Var) {
        hqp0<K, V> o;
        int z = 1 << zq70.z(i, i2);
        if (i(z)) {
            int f = f(z);
            if (epx.f(k, this.d[f])) {
                return q(f, z, zy90Var);
            }
        } else if (j(z)) {
            int u = u(z);
            hqp0<K, V> t = t(u);
            if (i2 == 30) {
                int c = t.c(k);
                o = c != -1 ? t.l(c, zy90Var) : t;
            } else {
                o = t.o(i, k, i2 + 5, zy90Var);
            }
            return r(t, o, u, z, zy90Var.c);
        }
        return this;
    }

    public final hqp0<K, V> p(int i, K k, V v, int i2, zy90<K, V> zy90Var) {
        hqp0<K, V> p;
        int z = 1 << zq70.z(i, i2);
        if (i(z)) {
            int f = f(z);
            if (epx.f(k, this.d[f]) && epx.f(v, v(f))) {
                return q(f, z, zy90Var);
            }
        } else if (j(z)) {
            int u = u(z);
            hqp0<K, V> t = t(u);
            if (i2 == 30) {
                int c = t.c(k);
                p = (c == -1 || !epx.f(v, t.v(c))) ? t : t.l(c, zy90Var);
            } else {
                p = t.p(i, k, v, i2 + 5, zy90Var);
            }
            return r(t, p, u, z, zy90Var.c);
        }
        return this;
    }

    public final hqp0<K, V> q(int i, int i2, zy90<K, V> zy90Var) {
        zy90Var.e(zy90Var.g - 1);
        zy90Var.e = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != zy90Var.c) {
            return new hqp0<>(i2 ^ this.a, this.b, zq70.f(i, objArr), zy90Var.c);
        }
        this.d = zq70.f(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final hqp0<K, V> r(hqp0<K, V> hqp0Var, hqp0<K, V> hqp0Var2, int i, int i2, fto0 fto0Var) {
        if (hqp0Var2 != null) {
            return hqp0Var != hqp0Var2 ? s(i, hqp0Var2, fto0Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != fto0Var) {
            Object[] objArr2 = new Object[objArr.length - 1];
            jw5.k(objArr, 0, objArr2, i, 6);
            jw5.h(objArr, i, objArr2, i + 1, objArr.length);
            return new hqp0<>(this.a, i2 ^ this.b, objArr2, fto0Var);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        jw5.k(objArr, 0, objArr3, i, 6);
        jw5.h(objArr, i, objArr3, i + 1, objArr.length);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final hqp0<K, V> s(int i, hqp0<K, V> hqp0Var, fto0 fto0Var) {
        fto0 fto0Var2 = hqp0Var.c;
        Object[] objArr = this.d;
        if (objArr.length == 1 && hqp0Var.d.length == 2 && hqp0Var.b == 0) {
            hqp0Var.a = this.b;
            return hqp0Var;
        }
        if (this.c == fto0Var) {
            objArr[i] = hqp0Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = hqp0Var;
        return new hqp0<>(this.a, this.b, copyOf, fto0Var);
    }

    public final hqp0<K, V> t(int i) {
        Object obj = this.d[i];
        if (obj != null) {
            return (hqp0) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int u(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    public final V v(int i) {
        return (V) this.d[i + 1];
    }
}
