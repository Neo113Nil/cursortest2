package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.trc0;

/* compiled from: PostponedPostsMviLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class csc0 extends al50<nsc0, trc0.c, on50, zsc0, lsc0, wrc0> {
    public final sj50<nsc0, on50, zsc0, lsc0, wrc0> c;
    public final tq60 d;

    public csc0(esc0 esc0Var, sj50<nsc0, on50, zsc0, lsc0, wrc0> sj50Var, AtomicReference<wn60> atomicReference) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new tq60(new dht(this, esc0Var), atomicReference);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        trc0.c cVar = (trc0.c) lj50Var;
        if (!(cVar instanceof trc0.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.d.p(((trc0.c.a) cVar).b);
    }
}
