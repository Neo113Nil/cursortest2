package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.hct0;

/* compiled from: VideoRelatedVideosMoreActionsReducer.kt */
/* loaded from: classes7.dex */
public final class ict0 extends dm50<lct0, hct0, kct0> {
    @Override // xsna.dm50
    public final kct0 c(kct0 kct0Var, hct0 hct0Var) {
        kct0 kct0Var2 = kct0Var;
        hct0 hct0Var2 = hct0Var;
        if (!(hct0Var2 instanceof hct0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new kct0(kct0Var2.b, ((hct0.a) hct0Var2).b);
    }

    @Override // xsna.dm50
    public final lct0 d() {
        return new lct0(e(new q520(29)));
    }

    @Override // xsna.dm50
    public final void h(kct0 kct0Var, lct0 lct0Var) {
        f(lct0Var.a, kct0Var);
    }
}
