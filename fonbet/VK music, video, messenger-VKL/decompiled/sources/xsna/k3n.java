package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.ds60;
import xsna.jm50;
import xsna.l5n;

/* compiled from: DiscoverMediaExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class k3n extends evg0<t4n, on50, l5n.a, l5n, h4n, e3n> {
    public final jq60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k3n(es60 es60Var, z3n z3nVar, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new jq60(es60Var.d, es60Var.e, es60Var.l, es60Var.h, aVar, new eht(this, z3nVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        l5n.a aVar = (l5n.a) hn50Var;
        boolean z = aVar instanceof l5n.a.C3232a;
        jq60 jq60Var = this.f;
        if (z) {
            return jq60Var.d(ds60.a.C2747a.b);
        }
        if (aVar instanceof l5n.a.b) {
            return jq60Var.d(ds60.a.b.b);
        }
        if (aVar instanceof l5n.a.c) {
            return awg0.a.b(this, wjs0.b, null, null, new ho1(this, 19), 3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
