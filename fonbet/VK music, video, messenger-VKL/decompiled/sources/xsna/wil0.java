package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import org.json.JSONObject;

/* compiled from: StorePurchase.java */
/* loaded from: classes15.dex */
public final class wil0 extends rsg0<nge0> {
    public wil0(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        super("store.purchase");
        K("type", str4);
        if (i != -12845212) {
            C(i, "product_id");
        }
        BuildInfo.Client client = BuildInfo.a;
        K("merchant", BuildInfo.v());
        if (str != null) {
            K("merchant_product_id", str);
            K("merchant_transaction_id", str2);
            K("receipt", str3);
        }
        C(0, "force_inapp");
        C(!vx2.d.o() ? 1 : 0, "no_inapp");
        K("mytracker_id", str5);
        if (str6 == null || str6.isEmpty()) {
            return;
        }
        K("referrer", str6);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return new nge0(jSONObject.getJSONObject("response"));
    }
}
