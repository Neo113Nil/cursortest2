package xsna;

import java.math.BigInteger;

/* compiled from: Rational.kt */
/* loaded from: classes3.dex */
public final class fye0 implements Comparable<fye0> {
    public final long b;
    public final long c;

    /* compiled from: Rational.kt */
    public static final class a {
        public static final boolean a(long j, long j2) {
            if (((Math.abs(j) | Math.abs(j2)) >>> 31) != 0) {
                boolean z = j2 == 0 || (j * j2) / j2 == j;
                boolean z2 = (j == Long.MIN_VALUE && j2 == -1) ? false : true;
                if (!z || !z2) {
                    return false;
                }
            }
            return true;
        }
    }

    public fye0(long j, long j2) {
        if (j2 == 0) {
            throw new ArithmeticException("Denominator must be not 0");
        }
        this.b = j;
        this.c = j2;
    }

    public final int a(long j, long j2) {
        long j3 = this.b;
        boolean a2 = a.a(j3, j2);
        long j4 = this.c;
        return Long.signum(j2) * Long.signum(j4) * ((a2 && a.a(j, j4)) ? Long.compare(j3 * j2, j * j4) : BigInteger.valueOf(j3).multiply(BigInteger.valueOf(j2)).compareTo(BigInteger.valueOf(j).multiply(BigInteger.valueOf(j4))));
    }

    @Override // java.lang.Comparable
    public final int compareTo(fye0 fye0Var) {
        fye0 fye0Var2 = fye0Var;
        if (fye0Var2 == null) {
            return 1;
        }
        return a(fye0Var2.b, fye0Var2.c);
    }
}
