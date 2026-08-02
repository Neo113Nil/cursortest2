package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.q7n;

/* compiled from: DiscoverSimilarFeedMviLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class a8n extends al50<l8n, q7n.c, on50, z8n, j8n, t7n> {
    public final sj50<l8n, on50, z8n, j8n, t7n> c;
    public final tq60 d;

    public a8n(hap hapVar, sj50<l8n, on50, z8n, j8n, t7n> sj50Var, AtomicReference<wn60> atomicReference) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new tq60(new dht(this, hapVar), atomicReference);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        q7n.c cVar = (q7n.c) lj50Var;
        if (!(cVar instanceof q7n.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.d.p(((q7n.c.a) cVar).b);
    }
}
