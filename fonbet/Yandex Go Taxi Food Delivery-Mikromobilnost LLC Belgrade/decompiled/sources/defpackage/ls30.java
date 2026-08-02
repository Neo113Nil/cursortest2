package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.masstransit.analytic.MasstransitPurchaseAnalytics$PurchaseScenariosSource;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class ls30 {
    public final u8w a;

    public ls30(u8w u8wVar) {
        this.a = u8wVar;
    }

    public final void a(List list, MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MtTransportType) it.next()).getMapkitType());
        }
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("scenario_transport_types", arrayList);
        hashMap.put("source", masstransitPurchaseAnalytics$PurchaseScenariosSource.getEventValue());
        u8wVar.a.a("MasstransitPurchase.Scenarios.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource) {
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", masstransitPurchaseAnalytics$PurchaseScenariosSource.getEventValue());
        u8wVar.a.a("MasstransitPurchase.Scenarios.BackTapped", hashMap, 1, new HashMap());
    }

    public final void c(ArrayList arrayList, MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource) {
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d410(Collections.singletonList(((MtTransportType) it.next()).getMapkitType())));
        }
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((d410) it2.next()).b);
        }
        hashMap.put("shown_scenarios", arrayList3);
        hashMap.put("source", masstransitPurchaseAnalytics$PurchaseScenariosSource.getEventValue());
        u8wVar.a.a("MasstransitPurchase.Scenarios.Shown", hashMap, 1, new HashMap());
    }
}
