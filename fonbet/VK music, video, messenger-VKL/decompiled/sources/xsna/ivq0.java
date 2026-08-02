package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.bwq0;
import xsna.lwq0;
import xsna.pvq0;

/* compiled from: UserProfileWallActor.kt */
/* loaded from: classes4.dex */
public final class ivq0 extends al50<dwq0, pvq0.e, on50, lwq0, bwq0, svq0> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        pvq0.e eVar = (pvq0.e) lj50Var;
        if (eVar instanceof pvq0.e.b) {
            e(new bwq0.a.h());
            return;
        }
        if (eVar instanceof pvq0.e.a) {
            e(new bwq0.a.e());
            return;
        }
        if (eVar instanceof pvq0.e.c) {
            e(new bwq0.a.i());
            return;
        }
        if (eVar instanceof pvq0.e.C3533e) {
            e(new bwq0.a.n());
            return;
        }
        if (eVar instanceof pvq0.e.d) {
            e(new bwq0.a.l());
            return;
        }
        if (!(eVar instanceof pvq0.e.f)) {
            if (!(eVar instanceof pvq0.e.g)) {
                throw new NoWhenBranchMatchedException();
            }
            e(new bwq0.a.p(null));
        } else {
            boolean f = epx.f(((dwq0) this.b.getCurrentState()).k, Boolean.FALSE);
            e(new bwq0.a.o());
            if (!f) {
                a(lwq0.c.e.b);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
