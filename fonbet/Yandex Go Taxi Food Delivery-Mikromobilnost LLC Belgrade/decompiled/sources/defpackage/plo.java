package defpackage;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class plo {
    public final long a;
    public final long b;

    public plo(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public static plo b(double d) {
        long j;
        long j2;
        long j3 = 1;
        if (d >= 9.223372036854776E18d || d <= -9.223372036854776E18d) {
            return new plo(d > 0.0d ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : Long.MIN_VALUE, 1L);
        }
        double abs = Math.abs(d);
        long j4 = 0;
        long j5 = 1;
        double d2 = abs;
        long j6 = 0;
        while (true) {
            double d3 = d2 % 1.0d;
            long j7 = (long) (d2 - d3);
            j = j6 + (j7 * j3);
            j2 = (j7 * j4) + j5;
            d2 = 1.0d / d3;
            long j8 = j3;
            if (Math.abs(abs - (j / j2)) <= 1.0E-8d * abs) {
                break;
            }
            j5 = j4;
            j3 = j;
            j6 = j8;
            j4 = j2;
        }
        if (d < 0.0d) {
            j = -j;
        }
        return new plo(j, j2);
    }

    public final double a() {
        return this.a / this.b;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }

    public /* synthetic */ plo(int i, long j, long j2) {
        this(j, j2);
    }
}
