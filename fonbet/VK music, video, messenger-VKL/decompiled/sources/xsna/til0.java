package xsna;

import com.android.billingclient.api.BillingClient;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.data.Subscription;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: StoreGetSubscription.java */
/* loaded from: classes15.dex */
public final class til0 extends rsg0<Subscription> {
    public til0(int i) {
        super("store.getStockItems");
        C(i, "product_ids");
        K("type", BillingClient.FeatureType.SUBSCRIPTIONS);
        C(1, "force_inapp");
        BuildInfo.Client client = BuildInfo.a;
        K("merchant", BuildInfo.v());
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return new Subscription(jSONObject.getJSONObject("response").getJSONArray("items").getJSONObject(0));
        } catch (Exception e) {
            L.i(e);
            return null;
        }
    }

    @Override // xsna.xz2
    public final void n() {
        C(!vx2.d.o() ? 1 : 0, "no_inapp");
    }
}
