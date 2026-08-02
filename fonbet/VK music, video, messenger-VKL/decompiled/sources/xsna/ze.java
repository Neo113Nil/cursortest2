package xsna;

/* compiled from: AbstractJavaFloatingPointBitsFromCharSequence.java */
/* loaded from: classes12.dex */
public abstract class ze extends ge {
    public static int g(int i, int i2, CharSequence charSequence) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    public abstract long c();

    public abstract long d();

    public final long e(int i, CharSequence charSequence) {
        int i2;
        char a;
        int i3;
        long j;
        int i4;
        boolean z;
        int i5;
        int i6;
        long j2;
        boolean z2;
        int i7;
        ze zeVar;
        int i8;
        int i9;
        int i10;
        int min;
        int i11;
        int i12;
        int i13;
        boolean z3;
        CharSequence charSequence2;
        char c;
        CharSequence charSequence3 = charSequence;
        if (i < 0 || i > charSequence3.length() || i > 2147483643) {
            throw new IllegalArgumentException("offset < 0 or length > str.length");
        }
        int g = g(0, i, charSequence3);
        if (g == i) {
            throw new NumberFormatException("illegal syntax");
        }
        char charAt = charSequence3.charAt(g);
        boolean z4 = charAt == '-';
        if (z4 || charAt == '+') {
            i2 = g + 1;
            a = bg.a(i2, i, charSequence3);
            if (a == 0) {
                throw new NumberFormatException("illegal syntax");
            }
        } else {
            a = charAt;
            i2 = g;
        }
        if (a >= 'I') {
            if (charSequence3.charAt(i2) == 'N') {
                int i14 = i2 + 2;
                if (i14 < i && charSequence3.charAt(i2 + 1) == 'a' && charSequence3.charAt(i14) == 'N' && g(i2 + 3, i, charSequence3) == i) {
                    return c();
                }
            } else {
                int i15 = i2 + 7;
                if (i15 < i && charSequence3.charAt(i2) == 'I' && charSequence3.charAt(i2 + 1) == 'n' && charSequence3.charAt(i2 + 2) == 'f' && charSequence3.charAt(i2 + 3) == 'i' && charSequence3.charAt(i2 + 4) == 'n' && charSequence3.charAt(i2 + 5) == 'i' && charSequence3.charAt(i2 + 6) == 't' && charSequence3.charAt(i15) == 'y' && g(i2 + 8, i, charSequence3) == i) {
                    return z4 ? d() : f();
                }
            }
            throw new NumberFormatException("illegal syntax");
        }
        boolean z5 = a == '0';
        int i16 = -1;
        if (z5) {
            int i17 = i2 + 1;
            char a2 = bg.a(i17, i, charSequence3);
            if (a2 == 'x' || a2 == 'X') {
                int i18 = i2 + 2;
                int i19 = i18;
                long j3 = 0;
                char c2 = 0;
                boolean z6 = false;
                while (true) {
                    if (i19 >= i) {
                        i9 = 16;
                        break;
                    }
                    c2 = charSequence3.charAt(i19);
                    i9 = 16;
                    int b = bg.b(c2);
                    if (b < 0) {
                        if (b != -4) {
                            break;
                        }
                        z6 |= i16 >= 0;
                        int i20 = i19;
                        while (true) {
                            if (i20 >= i - 8) {
                                charSequence2 = charSequence3;
                                c = c2;
                                break;
                            }
                            c = c2;
                            charSequence2 = charSequence;
                            long C = gcd0.C((charSequence3.charAt(i20 + 6) << 32) | (charSequence3.charAt(i20 + 5) << 48) | (charSequence2.charAt(i20 + 7) << 16) | charSequence2.charAt(i20 + 8)) | (gcd0.C((((charSequence3.charAt(i20 + 2) << 32) | (charSequence3.charAt(i20 + 1) << 48)) | (charSequence3.charAt(i20 + 3) << 16)) | charSequence3.charAt(i20 + 4)) << 16);
                            if (C < 0) {
                                break;
                            }
                            j3 = (j3 << 32) + C;
                            i20 += 8;
                            charSequence3 = charSequence2;
                            c2 = c;
                        }
                        i16 = i19;
                        i19 = i20;
                    } else {
                        long j4 = (j3 << 4) | b;
                        charSequence2 = charSequence3;
                        c = c2;
                        j3 = j4;
                    }
                    i19++;
                    charSequence3 = charSequence2;
                    c2 = c;
                }
                CharSequence charSequence4 = charSequence3;
                if (i16 < 0) {
                    i10 = i19 - i18;
                    i16 = i19;
                    min = 0;
                } else {
                    i10 = (i19 - i18) - 1;
                    min = Math.min((i16 - i19) + 1, 1024) * 4;
                }
                boolean z7 = (c2 | ' ') == 112;
                if (z7) {
                    i11 = i19 + 1;
                    char a3 = bg.a(i11, i, charSequence4);
                    boolean z8 = a3 == '-';
                    if (z8 || a3 == '+') {
                        i11 = i19 + 2;
                        a3 = bg.a(i11, i, charSequence4);
                    }
                    boolean z9 = z6 | (!gcd0.l(a3));
                    int i21 = 0;
                    do {
                        if (i21 < 1024) {
                            i21 = ((i21 * 10) + a3) - 48;
                        }
                        i11++;
                        a3 = bg.a(i11, i, charSequence4);
                    } while (gcd0.l(a3));
                    if (z8) {
                        i21 = -i21;
                    }
                    min += i21;
                    int i22 = i21;
                    c2 = a3;
                    i12 = i22;
                    z6 = z9;
                } else {
                    i11 = i19;
                    i12 = 0;
                }
                if ((c2 == 'F') | (c2 == 'd') | (c2 == 'D') | (c2 == 'f')) {
                    i11++;
                }
                int g2 = g(i11, i, charSequence4);
                if (z6 || g2 < i || i10 == 0 || !z7) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (i10 > i9) {
                    long j5 = 0;
                    i13 = 0;
                    while (i18 < i19) {
                        int b2 = bg.b(charSequence4.charAt(i18));
                        if (b2 < 0) {
                            i13++;
                        } else {
                            if (Long.compareUnsigned(j5, 1000000000000000000L) >= 0) {
                                break;
                            }
                            j5 = (j5 << 4) | b2;
                        }
                        i18++;
                    }
                    j3 = j5;
                    z3 = i18 < i19;
                } else {
                    i18 = g2;
                    i13 = 0;
                    z3 = false;
                }
                return i(charSequence4, i, z4, j3, min, z3, (((i16 - i18) + i13) * 4) + i12);
            }
            i2 = i17;
        }
        int i23 = i2;
        long j6 = 0;
        char c3 = 0;
        boolean z10 = false;
        while (i23 < i) {
            c3 = charSequence3.charAt(i23);
            if (!gcd0.l(c3)) {
                if (c3 != '.') {
                    break;
                }
                z10 |= i16 >= 0;
                i16 = i23;
            } else {
                j6 = ((j6 * 10) + c3) - 48;
            }
            i23++;
        }
        if (i16 < 0) {
            j = 48;
            i4 = i23 - i2;
            i3 = 0;
            i16 = i23;
        } else {
            i3 = (i16 - i23) + 1;
            j = 48;
            i4 = (i23 - i2) - 1;
        }
        if ((c3 | ' ') == 101) {
            int i24 = i23 + 1;
            char a4 = bg.a(i24, i, charSequence3);
            boolean z11 = a4 == '-';
            if (z11 || a4 == '+') {
                i24 = i23 + 2;
                a4 = bg.a(i24, i, charSequence3);
            }
            z = (!gcd0.l(a4)) | z10;
            int i25 = 0;
            do {
                if (i25 < 1024) {
                    i25 = ((i25 * 10) + a4) - 48;
                }
                i24++;
                a4 = bg.a(i24, i, charSequence3);
            } while (gcd0.l(a4));
            if (z11) {
                i25 = -i25;
            }
            i3 += i25;
            i5 = i25;
            i6 = i24;
            c3 = a4;
        } else {
            z = z10;
            i5 = 0;
            i6 = i23;
        }
        if ((c3 == 'F') | (c3 == 'd') | (c3 == 'D') | (c3 == 'f')) {
            i6++;
        }
        int g3 = g(i6, i, charSequence3);
        if (z || g3 < i || (!z5 && i4 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i4 > 19) {
            long j7 = 0;
            int i26 = 0;
            while (i2 < i23) {
                char charAt2 = charSequence3.charAt(i2);
                if (charAt2 != '.') {
                    if (Long.compareUnsigned(j7, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j7 = ((j7 * 10) + charAt2) - j;
                } else {
                    i26++;
                }
                i2++;
            }
            i7 = (i16 - i2) + i26 + i5;
            j2 = j7;
            z2 = i2 < i23;
            i8 = i3;
            zeVar = this;
        } else {
            j2 = j6;
            z2 = false;
            i7 = 0;
            zeVar = this;
            i8 = i3;
        }
        return zeVar.h(charSequence3, i, z4, j2, i8, z2, i7);
    }

    public abstract long f();

    public abstract long h(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3);

    public abstract long i(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3);
}
