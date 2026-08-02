package xsna;

import java.util.Arrays;

/* compiled from: TrieNode.kt */
/* loaded from: classes11.dex */
public final class gqp0<K, V> {
    public static final gqp0 e = new gqp0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final d02 c;
    public Object[] d;

    /* compiled from: TrieNode.kt */
    public static final class a<K, V> {
        public gqp0<K, V> a;
        public final int b;

        public a(gqp0<K, V> gqp0Var, int i) {
            this.a = gqp0Var;
            this.b = i;
        }
    }

    public gqp0(int i, int i2, Object[] objArr, d02 d02Var) {
        this.a = i;
        this.b = i2;
        this.c = d02Var;
        this.d = objArr;
    }

    public static gqp0 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, d02 d02Var) {
        if (i3 > 30) {
            return new gqp0(0, 0, new Object[]{obj, obj2, obj3, obj4}, d02Var);
        }
        int j = sdi.j(i, i3);
        int j2 = sdi.j(i2, i3);
        if (j != j2) {
            return new gqp0((1 << j) | (1 << j2), 0, j < j2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, d02Var);
        }
        return new gqp0(0, 1 << j, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, d02Var)}, d02Var);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, d02 d02Var) {
        Object obj = this.d[i];
        gqp0 j = j(obj != null ? obj.hashCode() : 0, obj, x(i), i3, k, v, i4 + 5, d02Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i, objArr2, i + 2, i5);
        objArr2[t - 1] = j;
        jw5.h(objArr, t, objArr2, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(K k) {
        i9x p = swe0.p(2, swe0.q(0, this.d.length));
        int i = p.b;
        int i2 = p.c;
        int i3 = p.d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!epx.f(k, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i, int i2, Object obj) {
        int j = 1 << sdi.j(i, i2);
        if (h(j)) {
            return epx.f(obj, this.d[f(j)]);
        }
        if (!i(j)) {
            return false;
        }
        gqp0<K, V> s = s(t(j));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(gqp0<K, V> gqp0Var) {
        if (this == gqp0Var) {
            return true;
        }
        if (this.b != gqp0Var.b || this.a != gqp0Var.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != gqp0Var.d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int j = 1 << sdi.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (epx.f(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(j)) {
            return null;
        }
        gqp0<K, V> s = s(t(j));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        i9x p = swe0.p(2, swe0.q(0, s.d.length));
        int i3 = p.b;
        int i4 = p.c;
        int i5 = p.d;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!epx.f(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final gqp0<K, V> k(int i, az90<K, V> az90Var) {
        az90Var.e(az90Var.g - 1);
        az90Var.e = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != az90Var.c) {
            return new gqp0<>(0, 0, sdi.b(i, objArr), az90Var.c);
        }
        this.d = sdi.b(i, objArr);
        return this;
    }

    public final gqp0<K, V> l(int i, K k, V v, int i2, az90<K, V> az90Var) {
        az90<K, V> az90Var2;
        gqp0<K, V> l;
        int j = 1 << sdi.j(i, i2);
        boolean h = h(j);
        d02 d02Var = this.c;
        if (h) {
            int f = f(j);
            if (!epx.f(k, this.d[f])) {
                az90Var.e(az90Var.g + 1);
                d02 d02Var2 = az90Var.c;
                if (d02Var != d02Var2) {
                    return new gqp0<>(this.a ^ j, this.b | j, a(f, j, i, k, v, i2, d02Var2), d02Var2);
                }
                this.d = a(f, j, i, k, v, i2, d02Var2);
                this.a ^= j;
                this.b |= j;
                return this;
            }
            az90Var.e = x(f);
            if (x(f) == v) {
                return this;
            }
            if (d02Var == az90Var.c) {
                this.d[f + 1] = v;
                return this;
            }
            az90Var.f++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = v;
            return new gqp0<>(this.a, this.b, copyOf, az90Var.c);
        }
        if (!i(j)) {
            az90Var.e(az90Var.g + 1);
            d02 d02Var3 = az90Var.c;
            int f2 = f(j);
            if (d02Var != d02Var3) {
                return new gqp0<>(this.a | j, this.b, sdi.a(k, v, this.d, f2), d02Var3);
            }
            this.d = sdi.a(k, v, this.d, f2);
            this.a |= j;
            return this;
        }
        int t = t(j);
        gqp0<K, V> s = s(t);
        if (i2 == 30) {
            i9x p = swe0.p(2, swe0.q(0, s.d.length));
            int i3 = p.b;
            int i4 = p.c;
            int i5 = p.d;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!epx.f(k, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                az90Var.e = s.x(i3);
                if (s.c == az90Var.c) {
                    s.d[i3 + 1] = v;
                    l = s;
                } else {
                    az90Var.f++;
                    Object[] objArr2 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    copyOf2[i3 + 1] = v;
                    l = new gqp0<>(0, 0, copyOf2, az90Var.c);
                }
                az90Var2 = az90Var;
            }
            az90Var.e(az90Var.g + 1);
            l = new gqp0<>(0, 0, sdi.a(k, v, s.d, 0), az90Var.c);
            az90Var2 = az90Var;
        } else {
            az90Var2 = az90Var;
            l = s.l(i, k, v, i2 + 5, az90Var2);
        }
        return s == l ? this : r(t, l, az90Var2.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [xsna.gqp0, xsna.gqp0<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [xsna.gqp0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [xsna.gqp0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [xsna.gqp0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [xsna.gqp0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [xsna.gqp0] */
    /* JADX WARN: Type inference failed for: r5v29, types: [xsna.gqp0] */
    public final gqp0<K, V> m(gqp0<K, V> gqp0Var, int i, zyl zylVar, az90<K, V> az90Var) {
        ?? r17;
        ?? j;
        if (this == gqp0Var) {
            zylVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            d02 d02Var = az90Var.c;
            int i3 = gqp0Var.b;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + gqp0Var.d.length);
            int length = this.d.length;
            i9x p = swe0.p(2, swe0.q(0, gqp0Var.d.length));
            int i4 = p.b;
            int i5 = p.c;
            int i6 = p.d;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(gqp0Var.d[i4])) {
                        zylVar.a++;
                    } else {
                        Object[] objArr2 = gqp0Var.d;
                        copyOf[length] = objArr2[i4];
                        copyOf[length + 1] = objArr2[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == gqp0Var.d.length ? gqp0Var : length == copyOf.length ? new gqp0<>(0, 0, copyOf, d02Var) : new gqp0<>(0, 0, Arrays.copyOf(copyOf, length), d02Var);
            }
        } else {
            int i7 = this.b | gqp0Var.b;
            int i8 = this.a;
            int i9 = gqp0Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (epx.f(this.d[f(lowestOneBit)], gqp0Var.d[gqp0Var.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                gxc0.b("Check failed.");
            }
            gqp0<K, V> gqp0Var2 = (epx.f(this.c, az90Var.c) && this.a == i12 && this.b == i7) ? this : new gqp0<>(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr3 = gqp0Var2.d;
                int length2 = (objArr3.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (gqp0Var.i(lowestOneBit2)) {
                        j = j.m(gqp0Var.s(gqp0Var.t(lowestOneBit2)), i + 5, zylVar, az90Var);
                        r17 = objArr3;
                    } else if (gqp0Var.h(lowestOneBit2)) {
                        int f = gqp0Var.f(lowestOneBit2);
                        Object obj = gqp0Var.d[f];
                        V x = gqp0Var.x(f);
                        int i15 = az90Var.g;
                        r17 = objArr3;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, az90Var);
                        if (az90Var.g == i15) {
                            zylVar.a++;
                        }
                    } else {
                        r17 = objArr3;
                    }
                } else {
                    r17 = objArr3;
                    if (gqp0Var.i(lowestOneBit2)) {
                        gqp0<K, V> s = gqp0Var.s(gqp0Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                zylVar.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, az90Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = gqp0Var.f(lowestOneBit2);
                        Object obj4 = gqp0Var.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, gqp0Var.x(f4), i + 5, az90Var.c);
                    }
                }
                r17[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (gqp0Var.h(lowestOneBit3)) {
                    int f5 = gqp0Var.f(lowestOneBit3);
                    Object[] objArr4 = gqp0Var2.d;
                    objArr4[i18] = gqp0Var.d[f5];
                    objArr4[i18 + 1] = gqp0Var.x(f5);
                    if (h(lowestOneBit3)) {
                        zylVar.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr5 = gqp0Var2.d;
                    objArr5[i18] = this.d[f6];
                    objArr5[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(gqp0Var2)) {
                return gqp0Var.e(gqp0Var2) ? gqp0Var : gqp0Var2;
            }
        }
        return this;
    }

    public final gqp0<K, V> n(int i, K k, int i2, az90<K, V> az90Var) {
        gqp0<K, V> n;
        int j = 1 << sdi.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (epx.f(k, this.d[f])) {
                return p(f, j, az90Var);
            }
        } else if (i(j)) {
            int t = t(j);
            gqp0<K, V> s = s(t);
            if (i2 == 30) {
                i9x p = swe0.p(2, swe0.q(0, s.d.length));
                int i3 = p.b;
                int i4 = p.c;
                int i5 = p.d;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!epx.f(k, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, az90Var);
                }
                n = s;
                break;
            }
            n = s.n(i, k, i2 + 5, az90Var);
            return q(s, n, t, j, az90Var.c);
        }
        return this;
    }

    public final gqp0<K, V> o(int i, K k, V v, int i2, az90<K, V> az90Var) {
        gqp0<K, V> gqp0Var;
        gqp0<K, V> o;
        int j = 1 << sdi.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (epx.f(k, this.d[f]) && epx.f(v, x(f))) {
                return p(f, j, az90Var);
            }
        } else if (i(j)) {
            int t = t(j);
            gqp0<K, V> s = s(t);
            if (i2 == 30) {
                i9x p = swe0.p(2, swe0.q(0, s.d.length));
                int i3 = p.b;
                int i4 = p.c;
                int i5 = p.d;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!epx.f(k, s.d[i3]) || !epx.f(v, s.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            o = s.k(i3, az90Var);
                            break;
                        }
                    }
                    gqp0Var = s;
                }
                o = s;
                gqp0Var = s;
            } else {
                gqp0Var = s;
                o = gqp0Var.o(i, k, v, i2 + 5, az90Var);
            }
            return q(gqp0Var, o, t, j, az90Var.c);
        }
        return this;
    }

    public final gqp0<K, V> p(int i, int i2, az90<K, V> az90Var) {
        az90Var.e(az90Var.g - 1);
        az90Var.e = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != az90Var.c) {
            return new gqp0<>(i2 ^ this.a, this.b, sdi.b(i, objArr), az90Var.c);
        }
        this.d = sdi.b(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final gqp0<K, V> q(gqp0<K, V> gqp0Var, gqp0<K, V> gqp0Var2, int i, int i2, d02 d02Var) {
        d02 d02Var2 = this.c;
        if (gqp0Var2 != null) {
            return (d02Var2 == d02Var || gqp0Var != gqp0Var2) ? r(i, gqp0Var2, d02Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (d02Var2 != d02Var) {
            return new gqp0<>(this.a, i2 ^ this.b, sdi.c(i, objArr), d02Var);
        }
        this.d = sdi.c(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final gqp0<K, V> r(int i, gqp0<K, V> gqp0Var, d02 d02Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && gqp0Var.d.length == 2 && gqp0Var.b == 0) {
            gqp0Var.a = this.b;
            return gqp0Var;
        }
        if (this.c == d02Var) {
            objArr[i] = gqp0Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = gqp0Var;
        return new gqp0<>(this.a, this.b, copyOf, d02Var);
    }

    public final gqp0<K, V> s(int i) {
        return (gqp0) this.d[i];
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        r14.a = w(r12, r4, r14.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a u(Object obj, int i, int i2, Object obj2) {
        a u;
        int j = 1 << sdi.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (!epx.f(obj, this.d[f])) {
                return new a(new gqp0(this.a ^ j, this.b | j, a(f, j, i, obj, obj2, i2, null), null), 1);
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new a(new gqp0(this.a, this.b, copyOf, null), 0);
            }
        } else {
            if (!i(j)) {
                return new a(new gqp0(this.a | j, this.b, sdi.a(obj, obj2, this.d, f(j)), null), 1);
            }
            int t = t(j);
            gqp0<K, V> s = s(t);
            if (i2 == 30) {
                i9x p = swe0.p(2, swe0.q(0, s.d.length));
                int i3 = p.b;
                int i4 = p.c;
                int i5 = p.d;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!epx.f(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (obj2 == s.x(i3)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        u = new a(new gqp0(0, 0, copyOf2, null), 0);
                    }
                }
                u = new a(new gqp0(0, 0, sdi.a(obj, obj2, s.d, 0), null), 1);
                break;
            }
            u = s.u(obj, i, i2 + 5, obj2);
        }
        return null;
    }

    public final gqp0 v(int i, int i2, Object obj) {
        gqp0<K, V> v;
        int j = 1 << sdi.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (epx.f(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new gqp0(this.a ^ j, this.b, sdi.b(f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(j)) {
            int t = t(j);
            gqp0<K, V> s = s(t);
            if (i2 == 30) {
                i9x p = swe0.p(2, swe0.q(0, s.d.length));
                int i3 = p.b;
                int i4 = p.c;
                int i5 = p.d;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!epx.f(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new gqp0<>(0, 0, sdi.b(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new gqp0(this.a, j ^ this.b, sdi.c(t, objArr3), null);
                }
                return null;
            }
            if (s != v) {
                return w(t, j, v);
            }
        }
        return this;
    }

    public final gqp0<K, V> w(int i, int i2, gqp0<K, V> gqp0Var) {
        Object[] objArr = gqp0Var.d;
        if (objArr.length != 2 || gqp0Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = gqp0Var;
            return new gqp0<>(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            gqp0Var.a = this.b;
            return gqp0Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        jw5.h(copyOf2, i + 2, copyOf2, i + 1, objArr3.length);
        jw5.h(copyOf2, f + 2, copyOf2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new gqp0<>(this.a ^ i2, i2 ^ this.b, copyOf2, null);
    }

    public final V x(int i) {
        return (V) this.d[i + 1];
    }
}
