package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class mx70 {
    public final pho a;

    public mx70(pho phoVar) {
        this.a = phoVar;
    }

    public static void b(mx70 mx70Var, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        mx70Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("InfoModalCardParams", str);
        }
        hashMap.put("source", str2);
        if (str3 != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
        }
        mx70Var.a.a("OrderInfoCard.Shown", hashMap, 1, new HashMap());
    }

    public final void a(String str, String str2) {
        HashMap u = g8e.u("type", "REORDER", "button", str);
        if (str2 != null) {
            u.put("modal_id", str2);
        }
        this.a.a("OrderInfoCard.Tapped", u, 1, new HashMap());
    }
}
