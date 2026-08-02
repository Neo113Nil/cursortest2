package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.utils.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class cwt0 extends uc5 {
    public final AppAnalyticsReporter B;
    public final tfl0 C;
    public final zvt0 D;
    public final j3h E;

    public cwt0(AppAnalyticsReporter appAnalyticsReporter, tfl0 tfl0Var, zvt0 zvt0Var, j3h j3hVar, ewt0 ewt0Var) {
        super(new fet0(10), ewt0Var);
        this.B = appAnalyticsReporter;
        this.C = tfl0Var;
        this.D = zvt0Var;
        this.E = j3hVar;
        appAnalyticsReporter.C.a.a("hiding_balances.fullscreen.shown", null);
    }

    public final void b0() {
        this.B.C.a.a("hiding_balances.fullscreen.close.click", null);
        b bVar = (b) this.D;
        ew2 ew2Var = bVar.f.d;
        kgx kgxVar = com.ybsdk.persistence.b.l[1];
        ew2Var.d(false);
        r0 r0Var = ((vvt0) bVar.d).d;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.C.e();
    }

    public final void c0() {
        this.B.C.a.a("hiding_balances.fullscreen.ok.click", null);
        this.D.getClass();
        this.C.e();
    }

    public final void d0() {
        this.B.C.a.a("hiding_balances.fullscreen.do_not_show_again.click", null);
        ew2 ew2Var = ((b) this.D).f.g;
        kgx kgxVar = com.ybsdk.persistence.b.l[4];
        ew2Var.d(true);
        this.C.e();
    }
}
