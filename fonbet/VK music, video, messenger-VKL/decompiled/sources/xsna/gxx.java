package xsna;

import java.math.BigDecimal;

/* compiled from: JavaBigDecimalParser.java */
/* loaded from: classes12.dex */
public final class gxx {
    public static final fxx a = new fxx();

    public static BigDecimal a(String str) throws NumberFormatException {
        int i;
        long j;
        int i2;
        long j2;
        long j3;
        int i3;
        long j4;
        boolean z;
        int i4;
        int length = str.length();
        a.getClass();
        try {
            if (length >= 32) {
                return fxx.c(length, str);
            }
            char a2 = bg.a(0, length, str);
            boolean z2 = true;
            boolean z3 = a2 == '-';
            if (z3 || a2 == '+') {
                a2 = bg.a(1, length, str);
                if (a2 == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
                i = 1;
            } else {
                i = 0;
            }
            boolean z4 = false;
            int i5 = i;
            long j5 = 0;
            int i6 = -1;
            while (true) {
                if (i5 >= length) {
                    j = 0;
                    break;
                }
                a2 = str.charAt(i5);
                if (!gcd0.l(a2)) {
                    j = 0;
                    if (a2 != '.') {
                        break;
                    }
                    z4 |= i6 >= 0 ? z2 : false;
                    int i7 = i5;
                    while (true) {
                        if (i7 >= length - 4) {
                            z = z2;
                            i4 = i;
                            break;
                        }
                        z = z2;
                        i4 = i;
                        int i8 = i7 + 4;
                        long charAt = (str.charAt(i7 + 2) << 16) | str.charAt(i7 + 1) | (str.charAt(i7 + 3) << 32) | (str.charAt(i8) << 48);
                        long j6 = charAt - 13511005043687472L;
                        int i9 = (((charAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                        if (i9 < 0) {
                            break;
                        }
                        j5 = (j5 * 10000) + i9;
                        i7 = i8;
                        z2 = z;
                        i = i4;
                    }
                    i6 = i5;
                    i5 = i7;
                } else {
                    j5 = ((j5 * 10) + a2) - 48;
                    z = z2;
                    i4 = i;
                }
                i5++;
                z2 = z;
                i = i4;
            }
            boolean z5 = z2;
            int i10 = i;
            if (i6 < 0) {
                i2 = i5 - i10;
                i6 = i5;
                j2 = j;
            } else {
                i2 = (i5 - i10) - 1;
                j2 = (i6 - i5) + 1;
            }
            long j7 = 2147483647L;
            if ((a2 | ' ') == 101) {
                int i11 = i5 + 1;
                char a3 = bg.a(i11, length, str);
                boolean z6 = a3 == '-' ? z5 : false;
                if (z6 || a3 == '+') {
                    i11 = i5 + 2;
                    a3 = bg.a(i11, length, str);
                }
                z4 |= !gcd0.l(a3);
                while (true) {
                    if (j < j7) {
                        j3 = j7;
                        j = ((j * 10) + a3) - 48;
                    } else {
                        j3 = j7;
                    }
                    j4 = j;
                    i11++;
                    char a4 = bg.a(i11, length, str);
                    if (!gcd0.l(a4)) {
                        break;
                    }
                    j = j4;
                    j7 = j3;
                    a3 = a4;
                }
                if (z6) {
                    j4 = -j4;
                }
                j2 += j4;
                int i12 = i5;
                i5 = i11;
                i3 = i12;
            } else {
                j3 = 2147483647L;
                i3 = length;
            }
            if (z4 || i5 < length || i2 == 0 || i2 > 1292782621) {
                throw new NumberFormatException("illegal syntax");
            }
            if (j2 <= -2147483648L || j2 > j3) {
                throw new NumberFormatException("value exceeds limits");
            }
            if (i2 > 18) {
                return fxx.d(str, i10, i6, i6 + 1, i3, z3, (int) j2);
            }
            if (z3) {
                j5 = -j5;
            }
            return new BigDecimal(j5).scaleByPowerOfTen((int) j2);
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }
}
