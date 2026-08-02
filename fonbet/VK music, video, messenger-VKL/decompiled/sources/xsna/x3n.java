package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.m2n;
import xsna.xn60;

/* compiled from: DiscoverMediaMviActionMapper.kt */
/* loaded from: classes4.dex */
public final class x3n {
    public static m2n a(xn60 xn60Var) {
        if (xn60Var instanceof xn60.a) {
            return new m2n.a((xn60.a) xn60Var);
        }
        if (xn60Var instanceof xn60.d) {
            return new m2n.d((xn60.d) xn60Var);
        }
        if (xn60Var instanceof xn60.b) {
            return new m2n.b((xn60.b) xn60Var);
        }
        if (xn60Var instanceof xn60.c) {
            return new m2n.c.a((xn60.c) xn60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
