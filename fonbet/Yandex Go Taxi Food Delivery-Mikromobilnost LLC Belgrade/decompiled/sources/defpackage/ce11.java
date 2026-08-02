package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ce11 {
    public static final ce11 e = new ce11(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final kx40 c;
    public Object[] d;

    public ce11(int i, int i2, Object[] objArr, kx40 kx40Var) {
        this.a = i;
        this.b = i2;
        this.c = kx40Var;
        this.d = objArr;
    }

    public static ce11 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, kx40 kx40Var) {
        if (i3 > 30) {
            return new ce11(0, 0, new Object[]{obj, obj2, obj3, obj4}, kx40Var);
        }
        int B = udq0.B(i, i3);
        int B2 = udq0.B(i2, i3);
        if (B != B2) {
            return new ce11((1 << B) | (1 << B2), 0, B < B2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, kx40Var);
        }
        return new ce11(0, 1 << B, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, kx40Var)}, kx40Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, kx40 kx40Var) {
        Object obj3 = this.d[i];
        ce11 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, kx40Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        f73.l(objArr, 0, objArr2, i, 6);
        f73.g(objArr, i, objArr2, i + 2, i5);
        objArr2[t - 1] = j;
        f73.g(objArr, t, objArr2, i5, objArr.length);
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

    public final boolean c(Object obj) {
        b6w m = y6i0.m(y6i0.n(0, this.d.length), 2);
        int i = m.a;
        int i2 = m.b;
        int i3 = m.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!jl40.l(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int B = 1 << udq0.B(i, i2);
        if (h(B)) {
            return jl40.l(obj, this.d[f(B)]);
        }
        if (!i(B)) {
            return false;
        }
        ce11 s = s(t(B));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(ce11 ce11Var) {
        if (this == ce11Var) {
            return true;
        }
        if (this.b == ce11Var.b && this.a == ce11Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == ce11Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int B = 1 << udq0.B(i, i2);
        if (h(B)) {
            int f = f(B);
            if (jl40.l(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(B)) {
            return null;
        }
        ce11 s = s(t(B));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        b6w m = y6i0.m(y6i0.n(0, s.d.length), 2);
        int i3 = m.a;
        int i4 = m.b;
        int i5 = m.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!jl40.l(obj, s.d[i3])) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return s.x(i3);
        }
        return null;
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final ce11 k(int i, d2b0 d2b0Var) {
        d2b0Var.c(d2b0Var.y - 1);
        d2b0Var.w = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != d2b0Var.b) {
            return new ce11(0, 0, udq0.c(i, objArr), d2b0Var.b);
        }
        this.d = udq0.c(i, objArr);
        return this;
    }

    public final ce11 l(int i, Object obj, Object obj2, int i2, d2b0 d2b0Var) {
        d2b0 d2b0Var2;
        ce11 l;
        int B = 1 << udq0.B(i, i2);
        boolean h = h(B);
        kx40 kx40Var = this.c;
        if (h) {
            int f = f(B);
            if (!jl40.l(obj, this.d[f])) {
                d2b0Var.c(d2b0Var.y + 1);
                kx40 kx40Var2 = d2b0Var.b;
                if (kx40Var != kx40Var2) {
                    return new ce11(this.a ^ B, this.b | B, a(f, B, i, obj, obj2, i2, kx40Var2), kx40Var2);
                }
                this.d = a(f, B, i, obj, obj2, i2, kx40Var2);
                this.a ^= B;
                this.b |= B;
                return this;
            }
            d2b0Var.w = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (kx40Var == d2b0Var.b) {
                this.d[f + 1] = obj2;
                return this;
            }
            d2b0Var.x++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new ce11(this.a, this.b, copyOf, d2b0Var.b);
        }
        if (!i(B)) {
            d2b0Var.c(d2b0Var.y + 1);
            kx40 kx40Var3 = d2b0Var.b;
            int f2 = f(B);
            Object[] objArr2 = this.d;
            if (kx40Var != kx40Var3) {
                return new ce11(this.a | B, this.b, udq0.b(f2, obj, obj2, objArr2), kx40Var3);
            }
            this.d = udq0.b(f2, obj, obj2, objArr2);
            this.a |= B;
            return this;
        }
        int t = t(B);
        ce11 s = s(t);
        if (i2 == 30) {
            b6w m = y6i0.m(y6i0.n(0, s.d.length), 2);
            int i3 = m.a;
            int i4 = m.b;
            int i5 = m.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!jl40.l(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                d2b0Var.w = s.x(i3);
                if (s.c == d2b0Var.b) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    d2b0Var.x++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new ce11(0, 0, copyOf2, d2b0Var.b);
                }
                d2b0Var2 = d2b0Var;
            }
            d2b0Var.c(d2b0Var.y + 1);
            l = new ce11(0, 0, udq0.b(0, obj, obj2, s.d), d2b0Var.b);
            d2b0Var2 = d2b0Var;
        } else {
            d2b0Var2 = d2b0Var;
            l = s.l(i, obj, obj2, i2 + 5, d2b0Var2);
        }
        return s == l ? this : r(t, l, d2b0Var2.b);
    }

    public final ce11 m(ce11 ce11Var, int i, dwi dwiVar, d2b0 d2b0Var) {
        Object[] objArr;
        ce11 j;
        if (this == ce11Var) {
            dwiVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            kx40 kx40Var = d2b0Var.b;
            int i3 = ce11Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + ce11Var.d.length);
            int length = this.d.length;
            b6w m = y6i0.m(y6i0.n(0, ce11Var.d.length), 2);
            int i4 = m.a;
            int i5 = m.b;
            int i6 = m.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(ce11Var.d[i4])) {
                        dwiVar.a++;
                    } else {
                        Object[] objArr3 = ce11Var.d;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == ce11Var.d.length ? ce11Var : length == copyOf.length ? new ce11(0, 0, copyOf, kx40Var) : new ce11(0, 0, Arrays.copyOf(copyOf, length), kx40Var);
            }
        } else {
            int i7 = this.b | ce11Var.b;
            int i8 = this.a;
            int i9 = ce11Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (jl40.l(this.d[f(lowestOneBit)], ce11Var.d[ce11Var.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                khe0.b("Check failed.");
            }
            ce11 ce11Var2 = (jl40.l(this.c, d2b0Var.b) && this.a == i12 && this.b == i7) ? this : new ce11(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = ce11Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (ce11Var.i(lowestOneBit2)) {
                        j = j.m(ce11Var.s(ce11Var.t(lowestOneBit2)), i + 5, dwiVar, d2b0Var);
                        objArr = objArr4;
                    } else if (ce11Var.h(lowestOneBit2)) {
                        int f = ce11Var.f(lowestOneBit2);
                        Object obj = ce11Var.d[f];
                        Object x = ce11Var.x(f);
                        int i15 = d2b0Var.y;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, d2b0Var);
                        if (d2b0Var.y == i15) {
                            dwiVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (ce11Var.i(lowestOneBit2)) {
                        ce11 s = ce11Var.s(ce11Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                dwiVar.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, d2b0Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = ce11Var.f(lowestOneBit2);
                        Object obj4 = ce11Var.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, ce11Var.x(f4), i + 5, d2b0Var.b);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (ce11Var.h(lowestOneBit3)) {
                    int f5 = ce11Var.f(lowestOneBit3);
                    Object[] objArr5 = ce11Var2.d;
                    objArr5[i18] = ce11Var.d[f5];
                    objArr5[i18 + 1] = ce11Var.x(f5);
                    if (h(lowestOneBit3)) {
                        dwiVar.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = ce11Var2.d;
                    objArr6[i18] = this.d[f6];
                    objArr6[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(ce11Var2)) {
                return ce11Var.e(ce11Var2) ? ce11Var : ce11Var2;
            }
        }
        return this;
    }

    public final ce11 n(int i, Object obj, int i2, d2b0 d2b0Var) {
        ce11 n;
        int B = 1 << udq0.B(i, i2);
        if (h(B)) {
            int f = f(B);
            if (jl40.l(obj, this.d[f])) {
                return p(f, B, d2b0Var);
            }
        } else if (i(B)) {
            int t = t(B);
            ce11 s = s(t);
            if (i2 == 30) {
                b6w m = y6i0.m(y6i0.n(0, s.d.length), 2);
                int i3 = m.a;
                int i4 = m.b;
                int i5 = m.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!jl40.l(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, d2b0Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, d2b0Var);
            return q(s, n, t, B, d2b0Var.b);
        }
        return this;
    }

    public final ce11 o(int i, Object obj, Object obj2, int i2, d2b0 d2b0Var) {
        d2b0 d2b0Var2;
        ce11 o;
        int B = 1 << udq0.B(i, i2);
        if (h(B)) {
            int f = f(B);
            return (jl40.l(obj, this.d[f]) && jl40.l(obj2, x(f))) ? p(f, B, d2b0Var) : this;
        }
        if (!i(B)) {
            return this;
        }
        int t = t(B);
        ce11 s = s(t);
        if (i2 == 30) {
            b6w m = y6i0.m(y6i0.n(0, s.d.length), 2);
            int i3 = m.a;
            int i4 = m.b;
            int i5 = m.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!jl40.l(obj, s.d[i3]) || !jl40.l(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o = s.k(i3, d2b0Var);
                        break;
                    }
                }
                d2b0Var2 = d2b0Var;
            }
            o = s;
            d2b0Var2 = d2b0Var;
        } else {
            d2b0Var2 = d2b0Var;
            o = s.o(i, obj, obj2, i2 + 5, d2b0Var2);
        }
        return q(s, o, t, B, d2b0Var2.b);
    }

    public final ce11 p(int i, int i2, d2b0 d2b0Var) {
        d2b0Var.c(d2b0Var.y - 1);
        d2b0Var.w = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != d2b0Var.b) {
            return new ce11(i2 ^ this.a, this.b, udq0.c(i, objArr), d2b0Var.b);
        }
        this.d = udq0.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final ce11 q(ce11 ce11Var, ce11 ce11Var2, int i, int i2, kx40 kx40Var) {
        kx40 kx40Var2 = this.c;
        if (ce11Var2 != null) {
            return (kx40Var2 == kx40Var || ce11Var != ce11Var2) ? r(i, ce11Var2, kx40Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (kx40Var2 != kx40Var) {
            return new ce11(this.a, this.b ^ i2, udq0.d(i, objArr), kx40Var);
        }
        this.d = udq0.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final ce11 r(int i, ce11 ce11Var, kx40 kx40Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && ce11Var.d.length == 2 && ce11Var.b == 0) {
            ce11Var.a = this.b;
            return ce11Var;
        }
        if (this.c == kx40Var) {
            objArr[i] = ce11Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = ce11Var;
        return new ce11(this.a, this.b, copyOf, kx40Var);
    }

    public final ce11 s(int i) {
        return (ce11) this.d[i];
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.b = w(r11, r4, (defpackage.ce11) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ysl u(int i, Object obj, Object obj2, int i2) {
        ysl u;
        int i3 = 1;
        int B = 1 << udq0.B(i, i2);
        int i4 = 0;
        if (h(B)) {
            int f = f(B);
            if (!jl40.l(obj, this.d[f])) {
                return new ysl(i3, new ce11(this.a ^ B, this.b | B, a(f, B, i, obj, obj2, i2, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new ysl(i4, new ce11(this.a, this.b, copyOf, null));
            }
        } else {
            if (!i(B)) {
                return new ysl(i3, new ce11(this.a | B, this.b, udq0.b(f(B), obj, obj2, this.d), null));
            }
            int t = t(B);
            ce11 s = s(t);
            if (i2 == 30) {
                b6w m = y6i0.m(y6i0.n(0, s.d.length), 2);
                int i5 = m.a;
                int i6 = m.b;
                int i7 = m.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!jl40.l(obj, s.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == s.x(i5)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i5 + 1] = obj2;
                        u = new ysl(i4, new ce11(0, 0, copyOf2, null));
                    }
                }
                u = new ysl(i3, new ce11(0, 0, udq0.b(0, obj, obj2, s.d), null));
                break;
            }
            u = s.u(i, obj, obj2, i2 + 5);
        }
        return null;
    }

    public final ce11 v(int i, int i2, Object obj) {
        ce11 v;
        int B = 1 << udq0.B(i, i2);
        if (h(B)) {
            int f = f(B);
            if (!jl40.l(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length == 2) {
                return null;
            }
            return new ce11(this.a ^ B, this.b, udq0.c(f, objArr), null);
        }
        if (!i(B)) {
            return this;
        }
        int t = t(B);
        ce11 s = s(t);
        if (i2 == 30) {
            b6w m = y6i0.m(y6i0.n(0, s.d.length), 2);
            int i3 = m.a;
            int i4 = m.b;
            int i5 = m.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!jl40.l(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                Object[] objArr2 = s.d;
                v = objArr2.length == 2 ? null : new ce11(0, 0, udq0.c(i3, objArr2), null);
            }
            v = s;
            break;
        }
        v = s.v(i, i2 + 5, obj);
        if (v != null) {
            return s != v ? w(t, B, v) : this;
        }
        Object[] objArr3 = this.d;
        if (objArr3.length == 1) {
            return null;
        }
        return new ce11(this.a, this.b ^ B, udq0.d(t, objArr3), null);
    }

    public final ce11 w(int i, int i2, ce11 ce11Var) {
        Object[] objArr = ce11Var.d;
        if (objArr.length != 2 || ce11Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = ce11Var;
            return new ce11(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            ce11Var.a = this.b;
            return ce11Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        f73.g(copyOf2, i + 2, copyOf2, i + 1, objArr3.length);
        f73.g(copyOf2, f + 2, copyOf2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new ce11(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
