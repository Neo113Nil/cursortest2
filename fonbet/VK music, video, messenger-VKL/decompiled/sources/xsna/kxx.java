package xsna;

import java.math.BigInteger;

/* compiled from: JavaBigIntegerParser.java */
/* loaded from: classes12.dex */
public final class kxx {
    public static final jxx a = new jxx();

    public static BigInteger a(String str) {
        int length = str.length();
        a.getClass();
        if (length >= 0) {
            try {
                if (length <= str.length() && length <= 1292782622) {
                    int i = 0;
                    char charAt = str.charAt(0);
                    boolean z = charAt == '-';
                    if (z || charAt == '+') {
                        if (bg.a(1, length, str) == 0) {
                            throw new NumberFormatException("illegal syntax");
                        }
                        i = 1;
                    }
                    return jxx.c(str, i, length, z);
                }
            } catch (ArithmeticException e) {
                NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
                numberFormatException.initCause(e);
                throw numberFormatException;
            }
        }
        throw new IllegalArgumentException("offset < 0 or length > str.length");
    }
}
