package defpackage;

import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
public final class gio {
    public final v5c0 a;
    public final lbd0 b;
    public final nbd0 c;

    public gio(v5c0 v5c0Var, lbd0 lbd0Var, nbd0 nbd0Var) {
        this.a = v5c0Var;
        this.b = lbd0Var;
        this.c = nbd0Var;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map) {
        LinkedHashMap y = g8e.y("session_id", str, Constants.KEY_SERVICE, str2);
        y.put("service_channel", str3);
        y.put("external_id", str4);
        y.put("test_ids", str5);
        y.put("triggered_test_ids", str6);
        y.put("external_test_ids", str7);
        y.put("external_triggered_test_ids", str8);
        y.put("custom_parameters", map);
        y.put("_meta", a(new HashMap()));
        e("PlusPayment.FrontSessionStart", y);
    }

    public final void c(String str, EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason, String str2, String str3) {
        LinkedHashMap x = g8e.x("session_id", str);
        x.put(CRLReasonCodeExtension.REASON, evgenOffersAnalytics$LoadReason.getEventValue());
        x.put("target", str2);
        x.put("error", str3);
        x.put("_meta", a(new HashMap()));
        e("PlusPayment.LoadOffers.ClientError", x);
    }

    public final void d(String str, String str2, String str3, List list) {
        LinkedHashMap y = g8e.y("session_id", str, "target", str2);
        y.put("offers_batch_id", str3);
        y.put("resulted_offer_position_ids", list);
        y.put("_meta", a(new HashMap()));
        e("PlusPayment.LoadOffers.Resulted", y);
    }

    public final void e(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll(this.b.a().a);
        hashMap.putAll(this.c.a().a);
        ((ped0) ((fad0) ((hhw) this.a.b).b).d.getValue()).b(new tbd0(PlusPayEvent$Type.DWH, str, hashMap, (Throwable) null));
    }
}
