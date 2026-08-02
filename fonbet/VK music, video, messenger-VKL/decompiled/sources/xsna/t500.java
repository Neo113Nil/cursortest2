package xsna;

import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: longSaturatedMath.kt */
/* loaded from: classes8.dex */
public final class t500 {
    public static final long a(long j) {
        if (j < 0) {
            zno.a aVar = zno.c;
            return zno.e;
        }
        zno.a aVar2 = zno.c;
        return zno.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(long j, long j2, DurationUnit durationUnit) {
        long j3;
        long b;
        long l = zno.l(j2, durationUnit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (!zno.g(j2) || (j ^ l) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        if (((l - 1) | 1) != Long.MAX_VALUE) {
            long j4 = j + l;
            return ((l ^ j4) & (j ^ j4)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j4;
        }
        if ((((int) j2) & 1) == 0) {
            b = eoo.c((j2 >> 1) / 2);
        } else {
            if (!zno.g(j2)) {
                long j5 = j2 >> 1;
                long j6 = 2;
                long j7 = j5 / j6;
                if (-4611686018426L > j7 || j7 >= 4611686018427L) {
                    j3 = 1;
                    b = eoo.b(j7);
                } else {
                    j3 = 1;
                    long j8 = 1000000;
                    b = eoo.c((j7 * j8) + (((j5 - (j7 * j6)) * j8) / j6));
                }
                long l2 = zno.l(b, durationUnit);
                return ((l2 - j3) | j3) != Long.MAX_VALUE ? l2 : b(b(j, b, durationUnit), zno.h(j2, b), durationUnit);
            }
            b = zno.j(Integer.signum(2), j2);
        }
        j3 = 1;
        long l22 = zno.l(b, durationUnit);
        if (((l22 - j3) | j3) != Long.MAX_VALUE) {
        }
    }

    public static final long c(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return eoo.f(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return zno.n(a(j3));
        }
        long convert = durationUnit.h().convert(1L, durationUnit2.h());
        long j4 = (j / convert) - (j2 / convert);
        long j5 = (j % convert) - (j2 % convert);
        zno.a aVar = zno.c;
        return zno.i(eoo.f(j4, durationUnit2), eoo.f(j5, durationUnit));
    }
}
