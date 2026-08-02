package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.l5n;
import xsna.m2n;

/* compiled from: DiscoverMediaUpdaterActor.kt */
/* loaded from: classes4.dex */
public final class a6n extends al50<t4n, m2n.e, on50, l5n, h4n, e3n> {
    public final sj50<t4n, on50, l5n, h4n, e3n> c;

    public a6n(sj50<t4n, on50, l5n, h4n, e3n> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        m2n.e eVar = (m2n.e) lj50Var;
        if (!(eVar instanceof m2n.e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        a(new l5n.b.d(((m2n.e.a) eVar).b));
    }
}
