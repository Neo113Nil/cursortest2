package defpackage;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import java.util.HashMap;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes14.dex */
public final class ipf0 {
    public final a630 a;
    public final u8w b;

    public ipf0(a630 a630Var, u8w u8wVar) {
        this.a = a630Var;
        this.b = u8wVar;
    }

    public final void a(dpf0 dpf0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        List list = dpf0Var.e;
        String str = dpf0Var.b;
        String str2 = dpf0Var.a;
        Integer valueOf = Integer.valueOf(dpf0Var.d);
        String id = promoPlaqueAnalytics$Screen.getId();
        String str3 = dpf0Var.c;
        u8w u8wVar = this.b;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action_types", list);
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("promo_id", str2);
        }
        hashMap.put("promo_index", valueOf);
        if (id != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, id);
        }
        if (str3 != null) {
            hashMap.put(ACSPConstants.STATUS, str3);
        }
        u8wVar.a.a("RideDetails.PromoPlaque.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(dpf0 dpf0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        String str = dpf0Var.a;
        String str2 = dpf0Var.b;
        a630 a630Var = this.a;
        a630Var.getClass();
        if (jl40.l(str, "money_not_enough_informer")) {
            a630Var.a(str2, "OrderCard.NotEnoughFunds.Shown");
        }
        List list = dpf0Var.e;
        Integer valueOf = Integer.valueOf(dpf0Var.d);
        String id = promoPlaqueAnalytics$Screen != null ? promoPlaqueAnalytics$Screen.getId() : null;
        String str3 = dpf0Var.c;
        u8w u8wVar = this.b;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action_types", list);
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        if (str != null) {
            hashMap.put("promo_id", str);
        }
        hashMap.put("promo_index", valueOf);
        if (id != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, id);
        }
        if (str3 != null) {
            hashMap.put(ACSPConstants.STATUS, str3);
        }
        u8wVar.a.a("RideDetails.PromoPlaque.Shown", hashMap, 1, new HashMap());
    }
}
