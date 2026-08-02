package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class gmi {
    public final lx4 a;
    public final o61 b;

    public gmi(lx4 lx4Var, o61 o61Var) {
        this.a = lx4Var;
        this.b = o61Var;
    }

    public final void a(int i, String str) {
        Integer valueOf = Integer.valueOf(i);
        o61 o61Var = this.b;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("selected_time_option", valueOf);
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        o61Var.a.a("DeliveryCargoHour.TimeCard.Shown", hashMap, 1, new HashMap());
    }

    public final void b(String str) {
        o61 o61Var = this.b;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("selected_time_option", 0);
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        o61Var.a.a("DeliveryCargoHour.TimeCard.Tapped", hashMap, 1, new HashMap());
    }
}
