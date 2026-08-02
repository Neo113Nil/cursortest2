package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class o7r0 {
    public final pho a;

    public /* synthetic */ o7r0(pho phoVar) {
        this.a = phoVar;
    }

    public static void f(o7r0 o7r0Var, ArrayList arrayList, Integer num, String str) {
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gx01) it.next()).j);
        }
        hashMap.put("route_options_list", arrayList2);
        hashMap.put("route_distance", num);
        if (str != null) {
            hashMap.put("filter_id", str);
        }
        o7r0Var.a.a("TransitRoutesHub.RouteOption.Tapped", hashMap, 2, new HashMap());
    }

    public void a(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV2, String str, Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, transitRoutesHubAnalytics$RouteSelectorErrorReasonV2.getEventValue());
        if (str != null) {
            hashMap.put("filter_id", str);
        }
        if (num != null) {
            hashMap.put("route_distance", num);
        }
        this.a.a("TransitRoutesHub.ErrorCard.Shown", hashMap, 2, new HashMap());
    }

    public void b(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV2, TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration, String str, TransitRoutesHubAnalytics$MobilityHubOrigin transitRoutesHubAnalytics$MobilityHubOrigin, String str2, List list, String str3, Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, transitRoutesHubAnalytics$RouteSelectorErrorReasonV2.getEventValue());
        if (str2 != null) {
            hashMap.put("filter_id", str2);
        }
        hashMap.put("selected_transport_list", list);
        if (str3 != null) {
            hashMap.put("time_filter", str3);
        }
        if (num != null) {
            hashMap.put("route_distance", num);
        }
        hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
        hashMap.put("hub_session_id", str);
        hashMap.put("origin", transitRoutesHubAnalytics$MobilityHubOrigin.getEventValue());
        this.a.a("TransitRoutesHub.ErrorCard.Shown", hashMap, 5, new HashMap());
    }

    public void c(String str, TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration, String str2, TransitRoutesHubAnalytics$MobilityHubOrigin transitRoutesHubAnalytics$MobilityHubOrigin) {
        HashMap p = x4e.p("button", str);
        p.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
        p.put("hub_session_id", str2);
        p.put("origin", transitRoutesHubAnalytics$MobilityHubOrigin.getEventValue());
        this.a.a("TransitRoutesHub.Map.Zoom.Tapped", p, 2, new HashMap());
    }

    public void d(ArrayList arrayList, Integer num, String str) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gx01) it.next()).j);
        }
        hashMap.put("route_options_list", arrayList2);
        hashMap.put("route_distance", num);
        if (str != null) {
            hashMap.put("filter_id", str);
        }
        this.a.a("TransitRoutesHub.RouteOption.Shown", hashMap, 2, new HashMap());
    }

    public void e(ArrayList arrayList, TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration, String str, TransitRoutesHubAnalytics$MobilityHubOrigin transitRoutesHubAnalytics$MobilityHubOrigin, Integer num, String str2, List list) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((hx01) it.next()).o);
        }
        hashMap.put("route_options_list", arrayList2);
        if (num != null) {
            hashMap.put("route_distance", num);
        }
        if (str2 != null) {
            hashMap.put("filter_id", str2);
        }
        hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
        hashMap.put("hub_session_id", str);
        if (list != null) {
            hashMap.put("selected_transport_list", list);
        }
        hashMap.put("origin", transitRoutesHubAnalytics$MobilityHubOrigin.getEventValue());
        this.a.a("TransitRoutesHub.RouteOption.Shown", hashMap, 4, new HashMap());
    }

    public void g(ArrayList arrayList, TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration, String str, String str2, TransitRoutesHubAnalytics$MobilityHubOrigin transitRoutesHubAnalytics$MobilityHubOrigin) {
        HashMap hashMap = new HashMap();
        hashMap.put("options_list", arrayList);
        hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
        hashMap.put("hub_session_id", str);
        hashMap.put("button", str2);
        hashMap.put("origin", transitRoutesHubAnalytics$MobilityHubOrigin.getEventValue());
        this.a.a("TransitRoutesHub.TransportTypeSelector.Button.Tapped", hashMap, 2, new HashMap());
    }
}
