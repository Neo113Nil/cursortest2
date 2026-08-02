package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class h4j {
    public final pho a;

    public h4j(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, String str3, String str4, boolean z) {
        HashMap u = g8e.u(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str, PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, str2);
        u.put("title", str3);
        u.put("body", str4);
        u.put("is_sddmultislot", Boolean.valueOf(z));
        this.a.a("DetailedTariffSettings.Option.Tapped", u, 1, new HashMap());
    }
}
