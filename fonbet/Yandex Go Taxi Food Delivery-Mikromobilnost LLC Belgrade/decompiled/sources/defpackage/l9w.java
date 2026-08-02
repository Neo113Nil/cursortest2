package defpackage;

import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.intercity.IntercityToSummaryNavigationSource;

/* loaded from: classes14.dex */
public final class l9w {
    public final jj3 a;
    public final ra00 b;
    public final yvf0 c;
    public final yvf0 d;
    public final dqe0 e;
    public final icv0 f;
    public final kpi0 g;
    public final oep0 h;

    public l9w(jj3 jj3Var, ra00 ra00Var, yvf0 yvf0Var, yvf0 yvf0Var2, dqe0 dqe0Var, icv0 icv0Var, kpi0 kpi0Var, oep0 oep0Var) {
        this.a = jj3Var;
        this.b = ra00Var;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = dqe0Var;
        this.f = icv0Var;
        this.g = kpi0Var;
        this.h = oep0Var;
    }

    public final void a(IntercityToSummaryNavigationSource intercityToSummaryNavigationSource, String str, String str2, sls slsVar) {
        this.a.c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new u50(this, intercityToSummaryNavigationSource, str, str2, slsVar, 10)), false, false, 28));
    }
}
