package xsna;

import xsna.trc0;
import xsna.xn60;

/* compiled from: PostponedPostsMviExternalActionActor.kt */
/* loaded from: classes4.dex */
public final class yrc0 extends al50<nsc0, trc0.a, on50, zsc0, lsc0, wrc0> {
    public final sj50<nsc0, on50, zsc0, lsc0, wrc0> c;
    public final hq60 d;

    public yrc0(esc0 esc0Var, sj50<nsc0, on50, zsc0, lsc0, wrc0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new hq60(new dht(this, esc0Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        this.d.p(new xn60.a(((trc0.a) lj50Var).b.b));
    }
}
