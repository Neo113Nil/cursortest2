package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.q7n;
import xsna.xn60;

/* compiled from: DiscoverSimilarFeedMviListActor.kt */
/* loaded from: classes4.dex */
public final class b8n extends al50<l8n, q7n.d, on50, z8n, j8n, t7n> {
    public final go60 c;

    public b8n(hap hapVar, sj50<l8n, on50, z8n, j8n, t7n> sj50Var) {
        super(sj50Var);
        this.c = new go60(new dht(this, hapVar));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        xn60.d dVar;
        q7n.d dVar2 = (q7n.d) lj50Var;
        if (dVar2.equals(q7n.d.a.b)) {
            dVar = xn60.d.a.b;
        } else if (dVar2.equals(q7n.d.b.b)) {
            dVar = xn60.d.b.b;
        } else {
            if (!dVar2.equals(q7n.d.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = xn60.d.c.b;
        }
        this.c.p(dVar);
    }
}
