package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.go.beginners.safety.analytics.SafeNewbiesAnalytics$SafeNewbiesNameInputSource;
import com.yandex.go.beginners.safety.name.ui.a;
import com.yandex.go.beginners.safety.name.ui.b;
import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import com.yandex.go.taxi.order.cancel.v3.ui.d;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import defpackage.agd;
import defpackage.etm0;
import defpackage.gum0;
import defpackage.l0p0;
import defpackage.mtm0;
import defpackage.oy7;
import defpackage.rbd;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.ttm0;
import defpackage.uyj;
import defpackage.yfd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class oy7 extends pgd {
    public final /* synthetic */ int F = 1;
    public final w030 G;
    public final Context H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final wfd L;

    public oy7(ContextThemeWrapper contextThemeWrapper, w030 w030Var, co40 co40Var, tt2 tt2Var, t4 t4Var) {
        super(0);
        this.H = contextThemeWrapper;
        this.G = w030Var;
        this.I = t4Var;
        py7 py7Var = new py7();
        this.J = py7Var;
        d dVar = new d(py7Var, tt2Var);
        this.K = new jy7(co40Var, py7Var, new pm5(17, this));
        this.L = new p1b(dVar, new my7(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public void G(Object obj) {
        switch (this.F) {
            case 1:
                svl0 svl0Var = (svl0) obj;
                super.G(svl0Var);
                epl0 epl0Var = (epl0) this.K;
                SafeNewbiesAnalytics$SafeNewbiesNameInputSource safeNewbiesAnalytics$SafeNewbiesNameInputSource = SafeNewbiesAnalytics$SafeNewbiesNameInputSource.SafeNewbies;
                epl0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("source", safeNewbiesAnalytics$SafeNewbiesNameInputSource.getEventValue());
                epl0Var.a.a("SafeNewbies.NameInput.Shown", hashMap, 1, new HashMap());
                b bVar = (b) this.I;
                bVar.getClass();
                jwl0 jwl0Var = new jwl0(svl0Var.b, svl0Var.a);
                r0 r0Var = bVar.c;
                r0Var.getClass();
                r0Var.m(null, jwl0Var);
                break;
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.F;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                py7 py7Var = (py7) obj2;
                r0 r0Var = py7Var.a;
                r0Var.getClass();
                r0Var.m(null, qy7.e);
                py7Var.c.l((CancelReasonsGrouped) obj);
                break;
            case 3:
                o7r0 o7r0Var = (o7r0) this.I;
                List<TransportSelectorOptionDto> list = ((TransportSelectorPayloadDto) obj).e;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (TransportSelectorOptionDto transportSelectorOptionDto : list) {
                    arrayList.add(gw00.e(new Pair(transportSelectorOptionDto.a, Boolean.valueOf(transportSelectorOptionDto.d))));
                }
                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = TransitRoutesHubAnalytics$HubGeneration.Second;
                String a = ((dxu) obj2).a.a();
                TransitRoutesHubAnalytics$MobilityHubOrigin a2 = rnb1.a((a2v) this.K);
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("options_list", arrayList);
                hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
                hashMap.put("hub_session_id", a);
                hashMap.put("origin", a2.getEventValue());
                o7r0Var.a.a("TransitRoutesHub.TransportTypeSelector.Shown", hashMap, 2, new HashMap());
                break;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
        }
        return (mu5) this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
        }
        return this.G;
    }

    public oy7(Context context, w030 w030Var, o7r0 o7r0Var, dxu dxuVar, a2v a2vVar, bb11 bb11Var, za11 za11Var) {
        super(0);
        this.H = context;
        this.G = w030Var;
        this.I = o7r0Var;
        this.J = dxuVar;
        this.K = a2vVar;
        this.L = new mu5(new zjy0(13, za11Var, bb11Var, this));
    }

    public oy7(Context context, w030 w030Var, b bVar, a aVar, epl0 epl0Var) {
        super(0);
        this.H = context;
        this.G = w030Var;
        this.I = bVar;
        this.J = aVar;
        this.K = epl0Var;
        this.L = new mu5(new ohk0(19, this));
    }

    public oy7(final gum0 gum0Var, final com.yandex.go.scooters.passes.active.v3.d dVar, Context context, w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, m580 m580Var) {
        super(0);
        this.H = context;
        this.G = w030Var;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = m580Var;
        this.L = new mu5(new tls() { // from class: com.yandex.go.scooters.passes.active.v3.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final oy7 oy7Var = oy7.this;
                final etm0 etm0Var = new etm0(oy7Var);
                final mtm0 mtm0Var = new mtm0();
                gum0 gum0Var2 = gum0Var;
                tpr a = gum0Var2.b.a();
                f fVar = new f(kotlinx.coroutines.flow.e.d((r0) gum0Var2.c.b));
                l0p0 l0p0Var = gum0Var2.e;
                ScootersSuperPassLegalTermsExperiment.Companion.getClass();
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(a, fVar, com.yandex.go.scooters.utils.a.a(l0p0Var, ScootersSuperPassLegalTermsExperiment.g), mtm0Var.a, new ScootersActivePassesV3UiStateInteractor$uiStateFlow$2(gum0Var2, null)));
                gum0Var2.a.getClass();
                ((agd) yfdVar).c = kotlinx.coroutines.flow.e.F(t, uyj.a);
                final d dVar2 = dVar;
                tls tlsVar = new tls() { // from class: com.yandex.go.scooters.passes.active.v3.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(oy7.this.o(), null, null, new ScootersActivePassesV3Router$content$1$1$1(dVar2, (ttm0) obj2, yfdVar, etm0Var, mtm0Var, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar = (agd) yfdVar;
                agdVar.e = tlsVar;
                rbd.a.getClass();
                agdVar.g = rbd.b;
                return zy11.a;
            }
        });
    }
}
