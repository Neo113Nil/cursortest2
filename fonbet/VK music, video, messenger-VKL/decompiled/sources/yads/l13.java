package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public abstract class l13 {
    public static j13 a(j7 j7Var) {
        k7 k7Var;
        v13 v13Var = (j7Var == null || (k7Var = j7Var.b) == null) ? null : k7Var.b;
        int i = v13Var == null ? -1 : k13.a[v13Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new dn3();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new se0();
    }
}
