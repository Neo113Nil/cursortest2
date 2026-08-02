package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardButtonName;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardStatus;

/* loaded from: classes6.dex */
public final class mb11 {
    public final pho a;

    public mb11(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lb11) it.next()).d);
        }
        hashMap.put("card_list", arrayList2);
        this.a.a("TransportVertical.ManageCards.Shown", hashMap, 1, new HashMap());
    }

    public final void b(ArrayList arrayList, TransportVerticalAnalytics$TransportCardButtonName transportVerticalAnalytics$TransportCardButtonName) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lb11) it.next()).d);
        }
        hashMap.put("card_list", arrayList2);
        hashMap.put("selected_card_id", "");
        hashMap.put("button_name", transportVerticalAnalytics$TransportCardButtonName.getEventValue());
        this.a.a("TransportVertical.ManageCards.Tapped", hashMap, 1, new HashMap());
    }

    public final void c(String str, TransportVerticalAnalytics$TransportCardStatus transportVerticalAnalytics$TransportCardStatus, kb11 kb11Var) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("card_id", str);
        }
        if (transportVerticalAnalytics$TransportCardStatus != null) {
            hashMap.put("card_status", transportVerticalAnalytics$TransportCardStatus.getEventValue());
        }
        if (kb11Var != null) {
            hashMap.put("card_balance", kb11Var.d);
        }
        this.a.a("TransportVertical.PaymentCard.Tapped", hashMap, 1, new HashMap());
    }
}
