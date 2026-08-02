package xsna;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* compiled from: JavaBigDecimalFromCharSequence.java */
/* loaded from: classes12.dex */
public final class fxx extends bg {
    public static BigDecimal c(int i, CharSequence charSequence) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        long j2;
        if (i > 1292782635) {
            throw new NumberFormatException("illegal syntax");
        }
        int i10 = 0;
        char a = bg.a(0, i, charSequence);
        boolean z4 = true;
        boolean z5 = a == '-';
        if (z5 || a == '+') {
            a = bg.a(1, i, charSequence);
            if (a == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i11 = i2;
        while (true) {
            i3 = i - 8;
            if (i11 >= i3) {
                break;
            }
            boolean z6 = true;
            for (int i12 = i10; i12 < 8; i12++) {
                z6 &= '0' == charSequence.charAt(i12 + i11);
            }
            if (!z6) {
                break;
            }
            i11 += 8;
            i10 = 0;
        }
        while (i11 < i && charSequence.charAt(i11) == '0') {
            i11++;
        }
        int i13 = i11;
        while (true) {
            if (i13 >= i3) {
                z = z4;
                break;
            }
            boolean z7 = z4;
            int i14 = 0;
            while (i14 < 8) {
                z7 &= gcd0.l(charSequence.charAt(i14 + i13));
                i14++;
                z4 = z4;
            }
            z = z4;
            if (!z7) {
                break;
            }
            i13 += 8;
            z4 = z;
        }
        while (i13 < i) {
            a = charSequence.charAt(i13);
            if (!gcd0.l(a)) {
                break;
            }
            i13++;
        }
        if (a == '.') {
            int i15 = i13 + 1;
            while (i15 < i3) {
                boolean z8 = z;
                for (int i16 = 0; i16 < 8; i16++) {
                    z8 &= '0' == charSequence.charAt(i16 + i15) ? z : false;
                }
                if (!z8) {
                    break;
                }
                i15 += 8;
            }
            while (i15 < i && charSequence.charAt(i15) == '0') {
                i15++;
            }
            int i17 = i15;
            while (i17 < i3) {
                boolean z9 = z;
                for (int i18 = 0; i18 < 8; i18++) {
                    z9 &= gcd0.l(charSequence.charAt(i18 + i17));
                }
                if (!z9) {
                    break;
                }
                i17 += 8;
            }
            while (i17 < i) {
                a = charSequence.charAt(i17);
                if (!gcd0.l(a)) {
                    break;
                }
                i17++;
            }
            int i19 = i15;
            i4 = i13;
            i13 = i17;
            i5 = i19;
        } else {
            i4 = -1;
            i5 = -1;
        }
        if (i4 < 0) {
            i5 = i13;
            i6 = i13 - i11;
            j = 0;
            i4 = i5;
        } else {
            i6 = i11 == i4 ? i13 - i5 : (i13 - i11) - 1;
            j = (i4 - i13) + 1;
        }
        if ((a | ' ') == 101) {
            int i20 = i13 + 1;
            char a2 = bg.a(i20, i, charSequence);
            boolean z10 = a2 == '-' ? z : false;
            if (z10 || a2 == '+') {
                i20 = i13 + 2;
                a2 = bg.a(i20, i, charSequence);
            }
            boolean z11 = !gcd0.l(a2);
            long j3 = 0;
            while (true) {
                if (j3 < 2147483647L) {
                    i9 = i20;
                    z3 = z10;
                    j3 = ((j3 * 10) + a2) - 48;
                } else {
                    i9 = i20;
                    z3 = z10;
                }
                j2 = j3;
                i8 = i9 + 1;
                char a3 = bg.a(i8, i, charSequence);
                if (!gcd0.l(a3)) {
                    break;
                }
                j3 = j2;
                i20 = i8;
                a2 = a3;
                z10 = z3;
            }
            if (z3) {
                j2 = -j2;
            }
            j += j2;
            i7 = i13;
            z2 = z11;
        } else {
            i7 = i;
            i8 = i13;
            z2 = false;
        }
        if (z2 || i8 < i) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i7 - i2 == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j < -2147483648L || j > 2147483647L || i6 > 1292782621) {
            throw new NumberFormatException("value exceeds limits");
        }
        return d(charSequence, i11, i4, i5, i7, z5, (int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BigDecimal d(CharSequence charSequence, int i, int i2, int i3, int i4, boolean z, int i5) {
        BigInteger bigInteger;
        TreeMap treeMap;
        BigInteger r;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        if (i8 <= 0) {
            bigInteger = BigInteger.ZERO;
        } else {
            if (i8 > 400) {
                BigInteger bigInteger2 = alq.a;
                treeMap = new TreeMap();
                treeMap.put(0, BigInteger.ONE);
                treeMap.put(16, alq.b);
                alq.c(treeMap, i, i2);
                bigInteger = hpt0.r(charSequence, i, i2, treeMap);
                if (i6 > 0) {
                    if (i7 > 400) {
                        if (treeMap == null) {
                            BigInteger bigInteger3 = alq.a;
                            treeMap = new TreeMap();
                            treeMap.put(0, BigInteger.ONE);
                            treeMap.put(16, alq.b);
                        }
                        alq.c(treeMap, i3, i4);
                        r = hpt0.r(charSequence, i3, i4, treeMap);
                    } else {
                        r = hpt0.r(charSequence, i3, i4, null);
                    }
                    if (bigInteger.signum() != 0) {
                        r = x6r.k(bigInteger, alq.a(treeMap, i6)).add(r);
                    }
                    bigInteger = r;
                }
                if (z) {
                    bigInteger = bigInteger.negate();
                }
                return new BigDecimal(bigInteger, -i5);
            }
            bigInteger = hpt0.r(charSequence, i, i2, null);
        }
        treeMap = null;
        if (i6 > 0) {
        }
        if (z) {
        }
        return new BigDecimal(bigInteger, -i5);
    }
}
