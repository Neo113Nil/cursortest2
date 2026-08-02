package xsna;

import com.android.billingclient.api.BillingClient;
import com.coremedia.iso.boxes.FreeBox;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.PaymentType;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.stickers.StickerStockItem;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StoreGetStockItemByProductId.java */
/* loaded from: classes15.dex */
public final class ril0 extends rsg0<mge0> {

    /* compiled from: StoreGetStockItemByProductId.java */
    public static class a implements mge0 {
        public final int b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;

        /* compiled from: StoreGetStockItemByProductId.java */
        /* renamed from: xsna.ril0$a$a, reason: collision with other inner class name */
        public class C3611a extends aay<a> {
            @Override // xsna.aay
            public final a a(JSONObject jSONObject) throws JSONException {
                return new a(jSONObject);
            }
        }

        static {
            new C3611a();
        }

        public a(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("product");
            if (jSONObject2 != null) {
                this.b = jSONObject2.optInt("id", this.b);
                this.e = jSONObject2.optString("type", this.e);
                this.f = jSONObject2.optString("title", this.f);
                jSONObject2.optInt("votes");
            }
            jSONObject.optString("description");
            jSONObject.optString("author");
            this.c = jSONObject.optInt("can_purchase", 0) == 1;
            jSONObject.optInt(FreeBox.TYPE, 0);
            this.d = jSONObject.optString("merchant_product_id");
        }

        @Override // xsna.mge0
        public final String L4() {
            return this.d;
        }

        @Override // xsna.mge0
        public final String R8() {
            return "";
        }

        @Override // xsna.mge0
        public final String W6() {
            long j = vx2.d.c().b;
            return j + ",2," + this.b + StringUtils.COMMA + j;
        }

        @Override // xsna.mge0
        public final void cb(JSONObject jSONObject) {
            jSONObject.optString("price");
        }

        @Override // xsna.mge0
        public final boolean d1() {
            return false;
        }

        @Override // xsna.mge0
        public final int getId() {
            return this.b;
        }

        @Override // xsna.mge0
        public final String getType() {
            return this.e;
        }

        @Override // xsna.mge0
        public final boolean ma() {
            return this.c;
        }

        @Override // xsna.mge0
        public final String n() {
            return null;
        }

        @Override // xsna.mge0
        public final PaymentType u3() {
            return PaymentType.Inapp;
        }
    }

    public ril0() {
        super("store.getStockItemByProductId");
        BuildInfo.Client client = BuildInfo.a;
        K("merchant", BuildInfo.v());
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        String valueOf = String.valueOf(jSONObject2.getJSONObject("product").optString("type"));
        if (valueOf.equals("votes")) {
            return new a(jSONObject2);
        }
        if (valueOf.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
            return new Subscription(jSONObject2);
        }
        Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
        return StickerStockItem.a.a(jSONObject2);
    }
}
