package defpackage;

import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public abstract class gl71 {
    public static final int a;
    public static final int b;

    static {
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long U = kp50.U(10, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        a = e3n.n(U, durationUnit2);
        b = e3n.n(kp50.U(30, durationUnit), durationUnit2);
        e3n.n(kp50.U(3, durationUnit), durationUnit2);
    }
}
