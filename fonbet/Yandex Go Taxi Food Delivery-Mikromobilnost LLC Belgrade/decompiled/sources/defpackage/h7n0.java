package defpackage;

import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.subscription.api.ScootersSubscriptionEntryPoint;
import com.yandex.go.scooters.subscription.api.ScootersSubscriptionPayload$SubscriptionFromScreen;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class h7n0 implements n6n0 {
    public final o6n0 a;
    public final /* synthetic */ g b;

    public h7n0(g gVar, o6n0 o6n0Var) {
        this.b = gVar;
        this.a = o6n0Var;
    }

    public final void c(pio0 pio0Var) {
        g gVar = this.b;
        y4c0 a = gVar.L.a();
        gVar.r0 = a;
        gVar.A(a, pio0Var, new cb0(19, gVar, a));
    }

    public final void d() {
        ((nro0) ((p7g) this.b.T(this.a).k).A0.get()).a(zy11.a);
    }

    public final void e(eer eerVar, vbn0 vbn0Var, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason, zzs zzsVar) {
        this.b.r(new t6n0(new fcj0(eerVar, zzsVar, scootersTariffFixSelectionAnalytics$FixSelectionOpenReason, ((o4o0) ((r0) this.a.a).getValue()).c, vbn0Var), 0));
    }

    public final void f(Throwable th, List list, boolean z) {
        g gVar = this.b;
        gVar.A((m950) gVar.Z.get(), new zjn0(th, list, 4), new x6n0(this, z, gVar));
    }

    public final void g(InsuranceOpenReason insuranceOpenReason, n3o0 n3o0Var) {
        g gVar = this.b;
        gVar.A((m950) gVar.W.get(), new ptn0(new ktn0(insuranceOpenReason), n3o0Var), new y6n0(0));
    }

    public final void h(ueo0 ueo0Var) {
        g gVar = this.b;
        gVar.A((m950) gVar.N.get(), new veo0(ueo0Var, ScootersPassesFromScreen.OFFER_CARD, null), sy60.Q2);
    }

    public final void i(c3o c3oVar) {
        g gVar = this.b;
        gVar.A((m950) gVar.e0.get(), new hdo0(c3oVar), sy60.Q2);
    }

    public final void j(ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint, wwo0 wwo0Var, boolean z) {
        g gVar = this.b;
        gVar.A((m950) gVar.b0.get(), new axo0(wwo0Var != null ? wwo0Var.b : null, wwo0Var != null ? wwo0Var.d : null, z, scootersSubscriptionEntryPoint, ScootersSubscriptionPayload$SubscriptionFromScreen.OFFER, wwo0Var != null ? wwo0Var.c : null), new cb0(18, gVar, this));
    }

    public final void k() {
        r2p0 r2p0Var = new r2p0(null, ScootersSupportEntryPoint.CARD);
        g gVar = this.b;
        gVar.A((m950) gVar.Q.get(), r2p0Var, sy60.Q2);
    }
}
