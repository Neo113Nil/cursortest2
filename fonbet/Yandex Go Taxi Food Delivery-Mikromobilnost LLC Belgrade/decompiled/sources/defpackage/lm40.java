package defpackage;

/* loaded from: classes10.dex */
public abstract class lm40 {
    public static final long a = uh6.E(14);

    public static final long a(long j, long j2) {
        if (!sty0.d(j2)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) sty0.e(j2)) + '.');
        }
        if (sty0.d(j)) {
            vg10.s("Cannot convert Em to Px when style.fontSize is Em (", sty0.e(j2), "). Please declare the style.fontSize with Sp units instead.");
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float c = sty0.c(j2);
            uh6.g(j);
            return uh6.K(sty0.c(j) * c, j3);
        }
        float c2 = sty0.c(j2);
        long j4 = a;
        uh6.g(j4);
        return uh6.K(sty0.c(j4) * c2, j4 & 1095216660480L);
    }
}
