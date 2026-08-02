package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.lg60;
import xsna.pf60;

/* compiled from: NewsfeedCustomUpdaterActor.kt */
/* loaded from: classes4.dex */
public final class yg60 extends al50<xf60, pf60.e, on50, lg60, vf60, rf60> {
    public final sj50<xf60, on50, lg60, vf60, rf60> c;

    public yg60(sj50<xf60, on50, lg60, vf60, rf60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        pf60.e eVar = (pf60.e) lj50Var;
        if (eVar instanceof pf60.e.b) {
            ((pf60.e.b) eVar).getClass();
            a(new lg60.a.d());
        } else {
            if (!(eVar instanceof pf60.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(lg60.a.c.b);
        }
    }
}
