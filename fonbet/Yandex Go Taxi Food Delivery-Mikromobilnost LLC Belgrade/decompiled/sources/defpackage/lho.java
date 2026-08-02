package defpackage;

import com.yandex.plus.home.analytics.evgen.a;
import com.yandex.plus.home.internal.di.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class lho {
    public final vit a;
    public final a b;

    public lho(vit vitVar, a aVar, rho rhoVar) {
        this.a = vitVar;
        this.b = aVar;
    }

    public static HashMap a(int i, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", Integer.valueOf(i));
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, EvgenAnalytics$EvgenOfferType evgenAnalytics$EvgenOfferType) {
        LinkedHashMap x = g8e.x("from", str);
        x.put("offer_type", evgenAnalytics$EvgenOfferType.getEventValue());
        x.put("_meta", a(1, new HashMap()));
        d("PlusHome.BuySubscription.SuccessScreen.Button.Clicked", x);
    }

    public final void c(String str, EvgenAnalytics$EvgenOfferType evgenAnalytics$EvgenOfferType) {
        LinkedHashMap x = g8e.x("from", str);
        x.put("offer_type", evgenAnalytics$EvgenOfferType.getEventValue());
        x.put("_meta", a(1, new HashMap()));
        d("PlusHome.BuySubscription.SuccessScreen.Shown", x);
    }

    public final void d(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll((Map) this.b.a().a);
        hashMap.putAll(new qho().a);
        ((b) this.a.b).c().reportEvent(str, hashMap);
    }
}
