package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.q430;

/* compiled from: ModerationConfirmAdultReducer.kt */
/* loaded from: classes18.dex */
public final class r430 extends dm50<y430, q430, t430> {
    @Override // xsna.dm50
    public final t430 c(t430 t430Var, q430 q430Var) {
        t430 t430Var2 = t430Var;
        q430 q430Var2 = q430Var;
        if (q430Var2 instanceof q430.c) {
            return t430Var2;
        }
        if (q430Var2 instanceof q430.a) {
            return new t430(true);
        }
        if (q430Var2 instanceof q430.b) {
            return new t430(false);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final y430 d() {
        return new y430(e(new d4r(11)));
    }

    @Override // xsna.dm50
    public final void h(t430 t430Var, y430 y430Var) {
        f(y430Var.a, t430Var);
    }
}
