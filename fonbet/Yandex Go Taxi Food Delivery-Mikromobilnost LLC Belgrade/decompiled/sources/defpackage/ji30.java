package defpackage;

import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.overlay.a;
import ru.yandex.taxi.masstransit.router.b;

/* loaded from: classes6.dex */
public final class ji30 implements cp30 {
    public final /* synthetic */ dp30 a;
    public final /* synthetic */ b b;

    public ji30(dp30 dp30Var, b bVar) {
        this.a = dp30Var;
        this.b = bVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        b bVar = this.b;
        s440 s440Var = bVar.O;
        a aVar = bVar.V;
        if (aVar != null) {
            m010 m010Var = aVar.w;
            y35 y35Var = aVar.A;
            if (y35Var == null) {
                y35.a.getClass();
                y35Var = x35.b;
            }
            m010Var.c.c(y35Var.b(), EmptyList.a, false);
        }
        bVar.M.b(null);
        bVar.L.b(qoi0.a(a.class));
        if (!s440Var.a) {
            bVar.F.c();
        } else {
            bVar.P(this.a);
            s440Var.a = false;
        }
    }

    @Override // defpackage.cp30
    public final void m() {
        qse0 dse0Var;
        dp30 dp30Var = this.a;
        k140 k140Var = dp30Var.b;
        if ((k140Var instanceof i140 ? (i140) k140Var : null) != null) {
            b bVar = this.b;
            bVar.M.b(null);
            ((tq30) bVar.I.get()).a(rq30.a);
            bov0 bov0Var = new bov0(true, (khv0) new bhv0(0), (ijv0) djv0.a, 8);
            k9s0 k9s0Var = k9s0.f;
            k9s0 F = egz.F(bov0Var);
            List list = ((k) bVar.P).j().a;
            if (list.isEmpty()) {
                jst.e.f("TRANSPORT_HUB_ROUTING:MT_OVERLAY", "TransportHubRouting", "verticals not ready");
            }
            if (eja1.x(list)) {
                bVar.Q.a(HubOpenReason.SUPERAPP_DISCOVERY_MAP);
                dse0Var = new ose0(F);
            } else {
                dse0Var = new dse0(F);
            }
            ((pep0) bVar.H).f((m950) bVar.K.get(), new hre0(qtb1.M, dse0Var, "open_summary_from_superapp_discovery_map", false, dab1.b), hxx.a);
            bVar.P(dp30Var);
            bVar.O.a = false;
        }
    }
}
