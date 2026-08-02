package defpackage;

import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import com.yandex.go.places.organization.card.impl.ui.card.map.overlay.c;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.y;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.d;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final /* synthetic */ class bw20 implements GeoObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bw20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapListener
    public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fw20 fw20Var = ((d) obj).a;
                o7r0 o7r0Var = fw20Var.G;
                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = TransitRoutesHubAnalytics$HubGeneration.Second;
                String a = fw20Var.H.a.a();
                TransitRoutesHubAnalytics$MobilityHubOrigin a2 = rnb1.a(fw20Var.I);
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
                hashMap.put("hub_session_id", a);
                hashMap.put("origin", a2.getEventValue());
                o7r0Var.a.a("TransitRoutesHub.Map.Tapped", hashMap, 2, new HashMap());
                break;
            case 1:
                c cVar = ((vf80) obj).A;
                if (cVar.C) {
                    ((ve80) cVar.B).a.r(new qu(9));
                    break;
                }
                break;
            default:
                y yVar = (y) obj;
                yVar.l.getClass();
                qi80 qi80Var = null;
                hl00 hl00Var = (hl00) il00.b(geoObjectTapEvent).orElse(null);
                String str = hl00Var != null ? hl00Var.a : null;
                if (str != null && !evu0.J(str)) {
                    qi80Var = new qi80(str, null);
                }
                if (qi80Var != null) {
                    yVar.j = true;
                    hhs0 hhs0Var = yVar.k;
                    y yVar2 = (y) hhs0Var.c;
                    if (((cwv0) hhs0Var.b) == null) {
                        hhs0Var.b = new cwv0(yVar2.a.a(), yVar2.b.a(), yVar2.c.a(), yVar2.d.a(), yVar2.e.a());
                    }
                    tuv0 tuv0Var = yVar.f;
                    je80 je80Var = je80.u;
                    he80 he80Var = new he80();
                    he80Var.a = true;
                    he80Var.f = true;
                    he80Var.g = false;
                    he80Var.o = true;
                    he80Var.p = OrganizationCardSliderPinDisplayStrategy.SELECTED_PIN_ONLY;
                    he80Var.r = true;
                    tuv0Var.l(new v6c0(qi80Var, he80Var.a()));
                    break;
                }
                break;
        }
        return false;
    }
}
