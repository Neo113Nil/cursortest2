package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes14.dex */
public final class o61 {
    public final pho a;

    public /* synthetic */ o61(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(o61 o61Var, String str) {
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", str);
        o61Var.a.a("ArbitraryTips.ErrorValues", hashMap, 1, new HashMap());
    }

    public static void b(o61 o61Var, String str, Integer num) {
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("tips_type", str);
        }
        if (num != null) {
            hashMap.put("tips_value", num);
        }
        o61Var.a.a("ArbitraryTips.SelectButtonTapped", hashMap, 1, new HashMap());
    }

    public static void c(o61 o61Var, String str, String str2, Integer num, int i) {
        if ((i & 8) != 0) {
            num = null;
        }
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button", str);
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        if (num != null) {
            hashMap.put("tips", num);
        }
        o61Var.a.a("DefaultTipsModalCard.Tapped", hashMap, 1, new HashMap());
    }

    public void d(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("promocode", str);
        }
        if (str2 != null) {
            hashMap.put(Constants.KEY_SERVICE, str2);
        }
        if (str3 != null) {
            hashMap.put(ClidProvider.STATE, str3);
        }
        if (str4 != null) {
            hashMap.put("type_error", str4);
        }
        this.a.a("EnterPromoCodeCard.Activated", hashMap, 1, new HashMap());
    }

    public void e(Double d, String str) {
        HashMap hashMap = new HashMap();
        if (d != null) {
            hashMap.put("duration", d);
        }
        x4e.B(this.a, str, hashMap, 1);
    }
}
