package yads;

import kotlin.time.DurationUnit;
import xsna.eoo;
import xsna.swe0;
import xsna.zno;

/* loaded from: classes10.dex */
public abstract class z11 {
    public static final int a;
    public static final int b;

    static {
        zno.a aVar = zno.c;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long e = eoo.e(10, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        a = (int) swe0.i(zno.l(e, durationUnit2), -2147483648L, 2147483647L);
        b = (int) swe0.i(zno.l(eoo.e(30, durationUnit), durationUnit2), -2147483648L, 2147483647L);
        swe0.i(zno.l(eoo.e(3, durationUnit), durationUnit2), -2147483648L, 2147483647L);
    }
}
