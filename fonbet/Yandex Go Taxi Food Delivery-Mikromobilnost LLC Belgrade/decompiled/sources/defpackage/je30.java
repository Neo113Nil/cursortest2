package defpackage;

import android.content.Context;
import com.yandex.go.payments.transport.navigation.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.geopayment.checkout.k;
import ru.yandex.taxi.masstransit.geopayment.checkout.t;
import ru.yandex.taxi.masstransit.geopayment.checkout.u;
import ru.yandex.taxi.masstransit.geopayment.checkout.w;
import ru.yandex.taxi.masstransit.geopayment.linkcard.a;
import ru.yandex.taxi.masstransit.geopayment.linkcard.b;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class je30 extends m230 {
    public final w030 E;
    public final Context F;
    public final yd30 G;
    public final fe30 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final h3y L;
    public final yvf0 M;
    public final yvf0 N;
    public final a O;
    public final jn30 P;
    public final h Q;
    public final zuj0 R;
    public final k S;
    public final boolean T;
    public xga0 U;
    public e V;
    public b W;

    public je30(w030 w030Var, Context context, yd30 yd30Var, fe30 fe30Var, rx4 rx4Var, tj70 tj70Var, g3g g3gVar, h3y h3yVar, epf epfVar, i020 i020Var, a aVar, jn30 jn30Var, h hVar, zuj0 zuj0Var, k kVar) {
        super(null);
        this.E = w030Var;
        this.F = context;
        this.G = yd30Var;
        this.H = fe30Var;
        this.I = rx4Var;
        this.J = tj70Var;
        this.K = g3gVar;
        this.L = h3yVar;
        this.M = epfVar;
        this.N = i020Var;
        this.O = aVar;
        this.P = jn30Var;
        this.Q = hVar;
        this.R = zuj0Var;
        this.S = kVar;
        this.T = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        ae30 ae30Var = (ae30) obj;
        b bVar = this.W;
        if (bVar != null) {
            bVar.i();
        }
        e eVar = this.V;
        if (eVar != null) {
            eVar.i();
        }
        this.V = null;
        this.S.f(false);
        super.H(ae30Var);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.T;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ae30 ae30Var = (ae30) obj;
        String str = ae30Var.a;
        Object obj2 = ae30Var.c;
        String str2 = ae30Var.b;
        at20 at20Var = new at20(this, ae30Var, false);
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = ae30Var.e;
        pj40 pj40Var = ae30Var.d;
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus = ae30Var.f;
        pzf pzfVar = this.H.a;
        t tVar = new t(str, str2, obj2, pj40Var, at20Var, transportPaymentAnalytics$CheckoutScreenOpenReason, mtCheckoutDeeplinkStatus, (ru.yandex.taxi.design.utils.b) ((xvf0) pzfVar.a).get(), (pwy0) ((xvf0) pzfVar.c).get(), (k) ((xvf0) pzfVar.d).get(), (g) ((b3g) pzfVar.e).get(), (jj3) ((b3g) pzfVar.f).get(), (w) ((fy30) pzfVar.g).get(), (d411) ((xvf0) pzfVar.i).get(), (h) ((xvf0) pzfVar.h).get(), (zuj0) ((xvf0) pzfVar.j).get(), (s311) ((xvf0) pzfVar.k).get(), (wu30) ((xvf0) pzfVar.l).get(), (x830) ((xvf0) pzfVar.m).get(), (oep0) ((xvf0) pzfVar.b).get());
        ht10 ht10Var = this.G.a;
        return new MtCheckoutModalView(this.F, tVar, (c2x0) ((g3g) ht10Var.b).get(), (z0a0) ((f3g) ht10Var.c).get());
    }

    public final void T() {
        this.S.f(true);
        this.O.d(o(), new u(this));
    }
}
