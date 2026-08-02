package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.trc0;
import xsna.xn60;

/* compiled from: PostponedPostsMviListActor.kt */
/* loaded from: classes4.dex */
public final class dsc0 extends al50<nsc0, trc0.d, on50, zsc0, lsc0, wrc0> {
    public final go60 c;

    public dsc0(esc0 esc0Var, sj50<nsc0, on50, zsc0, lsc0, wrc0> sj50Var) {
        super(sj50Var);
        this.c = new go60(new dht(this, esc0Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        xn60.d dVar;
        trc0.d dVar2 = (trc0.d) lj50Var;
        if (dVar2.equals(trc0.d.a.b)) {
            dVar = xn60.d.a.b;
        } else if (dVar2.equals(trc0.d.b.b)) {
            dVar = xn60.d.b.b;
        } else {
            if (!dVar2.equals(trc0.d.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = xn60.d.c.b;
        }
        this.c.p(dVar);
    }
}
