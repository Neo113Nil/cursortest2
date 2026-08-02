package defpackage;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$DiscoveryOrganisationListActionType;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$MapButtonType;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardClickType;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardCloseReason;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListSortsCardCloseReason;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$PaymentResultStatus;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$PaymentScreenSource;
import com.yandex.go.places.models.domain.entities.PlacesMapOwner;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes13.dex */
public final class jio {
    public final PlacesMapOwner a;
    public final hsj b;
    public final wbc0 c;

    public jio(PlacesMapOwner placesMapOwner, hsj hsjVar, wbc0 wbc0Var) {
        this.a = placesMapOwner;
        this.b = hsjVar;
        this.c = wbc0Var;
    }

    public final void a(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason) {
        String i = i();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", discoveryAnalytics$OrganizationListFiltersCardCloseReason.getEventValue());
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.FiltersCard.Closed", hashMap, 2, new HashMap());
    }

    public final void b(DiscoveryAnalytics$OrganizationListFiltersCardClickType discoveryAnalytics$OrganizationListFiltersCardClickType, String str) {
        String i = i();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", discoveryAnalytics$OrganizationListFiltersCardClickType.getEventValue());
        if (str != null) {
            hashMap.put("filter_option_id", str);
        }
        hsjVar.a.a("Discovery.FiltersCard.Tapped", hashMap, 2, tse0.r("source", hashMap, i));
    }

    public final void c() {
        String i = i();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.MapOpenButton.Tapped", hashMap, 2, new HashMap());
    }

    public final void d(DiscoveryAnalytics$MapButtonType discoveryAnalytics$MapButtonType) {
        String i = i();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button", discoveryAnalytics$MapButtonType.getEventValue());
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.MapZoom.Tapped", hashMap, 2, new HashMap());
    }

    public final void e(String str, Map map) {
        String i = i();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("geosearch_context", str);
        }
        hashMap.put("action", map);
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.OrganisationList.Tapped", hashMap, 2, new HashMap());
    }

    public final void f(DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType, String str) {
        String i = i();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("type", discoveryAnalytics$DiscoveryOrganisationListActionType.getEventValue());
        MapBuilder j = mapBuilder.j();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("geosearch_context", str);
        }
        hashMap.put("source", i);
        hashMap.put("action", j);
        hsjVar.a.a("Discovery.OrganisationList.Tapped", hashMap, 3, new HashMap());
    }

    public final void g(String str, DiscoveryAnalytics$PaymentResultStatus discoveryAnalytics$PaymentResultStatus) {
        DiscoveryAnalytics$PaymentScreenSource j = j();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("source", j.getEventValue());
        hashMap.put(ACSPConstants.STATUS, discoveryAnalytics$PaymentResultStatus.getEventValue());
        hsjVar.a.a("Discovery.PaymentScreen.PaymentResult", hashMap, 1, new HashMap());
    }

    public final void h(DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason) {
        String i = i();
        hsj hsjVar = this.b;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", discoveryAnalytics$OrganizationListSortsCardCloseReason.getEventValue());
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.SortsCard.Closed", hashMap, 2, new HashMap());
    }

    public final String i() {
        return this.c.a().a();
    }

    public final DiscoveryAnalytics$PaymentScreenSource j() {
        String i = i();
        return jl40.l(i, "ConfirmCard") ? DiscoveryAnalytics$PaymentScreenSource.ConfirmCard : jl40.l(i, "Push") ? DiscoveryAnalytics$PaymentScreenSource.Push : jl40.l(i, "OrderHistory") ? DiscoveryAnalytics$PaymentScreenSource.OrderHistory : DiscoveryAnalytics$PaymentScreenSource.Tracker;
    }
}
