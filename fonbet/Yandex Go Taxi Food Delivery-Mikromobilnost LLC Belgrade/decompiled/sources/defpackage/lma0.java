package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.impl.ui.payments.checkout.PaymentsCheckoutFlexModalView;

/* loaded from: classes13.dex */
public final class lma0 extends m230 implements bgc0 {
    public final Context E;
    public final hma0 F;
    public final qma0 G;
    public final w030 H;
    public final b I;
    public final qcc0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final mg80 M;
    public final wbc0 N;
    public final boolean O;

    public lma0(Context context, hma0 hma0Var, qma0 qma0Var, w030 w030Var, b bVar, qcc0 qcc0Var, yvf0 yvf0Var, yvf0 yvf0Var2, mg80 mg80Var, wbc0 wbc0Var) {
        super(null);
        this.E = context;
        this.F = hma0Var;
        this.G = qma0Var;
        this.H = w030Var;
        this.I = bVar;
        this.J = qcc0Var;
        this.K = yvf0Var;
        this.L = yvf0Var2;
        this.M = mg80Var;
        this.N = wbc0Var;
        this.O = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.M.b();
        this.N.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        wbc0 wbc0Var = this.N;
        svj svjVar = ((ima0) obj).c;
        synchronized (wbc0Var.a) {
            wbc0Var.b.addLast(svjVar);
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.O;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ima0 ima0Var = (ima0) obj;
        jsj jsjVar = new jsj(this.E);
        String str = ima0Var.b;
        y7c0 y7c0Var = ima0Var.a;
        aq80 aq80Var = new aq80(this);
        boj0 boj0Var = this.G.a;
        pma0 pma0Var = new pma0(str, y7c0Var, aq80Var, jsjVar, (dac0) ((xvf0) boj0Var.b).get(), (lcc0) ((gga0) boj0Var.c).get(), (mcc0) ((xvf0) boj0Var.w).get(), (oep0) ((xvf0) boj0Var.x).get(), (jio) ((xvf0) boj0Var.y).get(), (wbc0) ((xvf0) boj0Var.z).get());
        mma0 mma0Var = this.F.a;
        return new PaymentsCheckoutFlexModalView((Context) mma0Var.a.get(), (c2x0) mma0Var.b.get(), pma0Var, jsjVar);
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return true;
    }
}
