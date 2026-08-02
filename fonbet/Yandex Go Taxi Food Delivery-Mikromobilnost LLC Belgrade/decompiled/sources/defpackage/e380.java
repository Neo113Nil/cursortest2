package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class e380 {
    public final b1 a;

    public e380(b1 b1Var) {
        this.a = b1Var;
    }

    public final void a(boolean z, boolean z2, String str, String str2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean valueOf2 = Boolean.valueOf(z);
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("option_name", str2);
        }
        hashMap.put("option_shown", valueOf);
        hashMap.put("tariff_card_shown", valueOf2);
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        b1Var.a.a("CompaundOption.Selection.Shown", hashMap, 1, new HashMap());
    }
}
