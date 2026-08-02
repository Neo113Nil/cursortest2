package xsna;

import com.huawei.hms.adapter.internal.CommonCode;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import org.json.JSONObject;

/* compiled from: PayOperationNoMethodResponse.kt */
/* loaded from: classes6.dex */
public final class ur90 extends VkCheckoutResponse {
    public final JSONObject b;
    public final TransactionStatusResponse.VkCheckoutTransactionStatus c;
    public final String d;
    public final int e;

    public ur90(JSONObject jSONObject) {
        super(jSONObject);
        this.b = jSONObject;
        TransactionStatusResponse.VkCheckoutTransactionStatus.a aVar = TransactionStatusResponse.VkCheckoutTransactionStatus.Companion;
        String optString = jSONObject.optString("status");
        VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus = this.a;
        aVar.getClass();
        this.c = TransactionStatusResponse.VkCheckoutTransactionStatus.a.a(vkCheckoutResponseStatus, optString);
        this.d = jSONObject.optString(CommonCode.MapKey.TRANSACTION_ID);
        this.e = jSONObject.optInt("attempts_left", 0);
    }
}
