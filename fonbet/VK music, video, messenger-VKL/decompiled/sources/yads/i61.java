package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class i61 {
    public static final h61 a = new h61(dp2.E, dp2.D, dp2.F, dp2.G);
    public static final h61 b = new h61(dp2.p, dp2.o, dp2.q, dp2.r);

    public static h61 a(va vaVar) {
        int ordinal = vaVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return a;
        }
        if (ordinal == 2) {
            return b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
