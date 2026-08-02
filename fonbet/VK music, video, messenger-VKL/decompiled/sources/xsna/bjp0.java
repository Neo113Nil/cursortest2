package xsna;

import com.huawei.hms.adapter.internal.CommonCode;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import org.json.JSONObject;

/* compiled from: TransactionStatusRequest.kt */
/* loaded from: classes6.dex */
public final class bjp0 extends v2c<TransactionStatusResponse> {
    public final VkCheckoutPayMethod b;
    public final String c;
    public final int d;
    public final String e;

    /* compiled from: TransactionStatusRequest.kt */
    public static final class a extends a3c<TransactionStatusResponse> {
        @Override // xsna.a3c
        public final TransactionStatusResponse c(JSONObject jSONObject) {
            return new TransactionStatusResponse(jSONObject);
        }
    }

    public bjp0(VkCheckoutPayMethod vkCheckoutPayMethod, String str, int i, cbv0 cbv0Var) {
        this.b = vkCheckoutPayMethod;
        this.c = str;
        this.d = i;
        this.e = cbv0Var.c.c;
    }

    @Override // xsna.v2c
    public final ara<TransactionStatusResponse> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.e;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        return super.i().put(CommonCode.MapKey.TRANSACTION_ID, this.c).put("method", this.b.h()).put("merchant_id", this.d);
    }
}
