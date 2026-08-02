package xsna;

import android.util.Base64;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkPaymentToken;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import org.json.JSONObject;

/* compiled from: PayOperationRequestBody.kt */
/* loaded from: classes6.dex */
public final class wr90 {
    public final VkCheckoutPayMethod a;
    public final String b;
    public final jwu0 c;
    public final VkTransactionInfo.Currency d;
    public final VkMerchantInfo e;
    public final VkTransactionInfo f;
    public final de g;
    public final Integer h;
    public final String i;
    public final VkPaymentToken j;
    public final VkExtraPaymentOptions k;
    public final boolean l;

    public wr90(VkCheckoutPayMethod vkCheckoutPayMethod, String str, jwu0 jwu0Var, VkTransactionInfo.Currency currency, VkMerchantInfo vkMerchantInfo, VkTransactionInfo vkTransactionInfo, de deVar, Integer num, String str2, VkPaymentToken vkPaymentToken, VkExtraPaymentOptions vkExtraPaymentOptions, boolean z) {
        this.a = vkCheckoutPayMethod;
        this.b = str;
        this.c = jwu0Var;
        this.d = currency;
        this.e = vkMerchantInfo;
        this.f = vkTransactionInfo;
        this.g = deVar;
        this.h = num;
        this.i = str2;
        this.j = vkPaymentToken;
        this.k = vkExtraPaymentOptions;
        this.l = z;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        VkExtraPaymentOptions vkExtraPaymentOptions = this.k;
        if (vkExtraPaymentOptions != null) {
            jSONObject.put("issuer_id", vkExtraPaymentOptions.f);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("method", this.a.h());
        String str = this.b;
        if (str != null) {
            jSONObject2.put(DomainCampaignEx.KEY_BIND_ID, str);
        }
        jwu0 jwu0Var = this.c;
        if (jwu0Var != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cvv", jwu0Var.a);
            jSONObject3.put("exp_date", jwu0Var.b);
            jSONObject3.put("pan", jwu0Var.c);
            jSONObject3.put("add_card", jwu0Var.d);
            jSONObject2.put("card_data", jSONObject3);
        }
        jSONObject2.put("spend_bonus", this.l);
        Integer num = this.h;
        if (num != null) {
            jSONObject2.put("charge_amount", num.intValue());
        }
        VkPaymentToken vkPaymentToken = this.j;
        if (vkPaymentToken != null) {
            jSONObject2.put("payment_token", new JSONObject().put("token", Base64.encodeToString(vkPaymentToken.a.getBytes(emb.b), 2)).put("token_type", vkPaymentToken.b.h()));
        }
        de deVar = this.g;
        if (deVar instanceof ecv0) {
            jSONObject2.put("pin", ((ecv0) deVar).b);
        } else if (deVar instanceof dcv0) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("token", ((dcv0) deVar).b);
            jSONObject4.put("device_id", this.i);
            jSONObject2.put("token_info", jSONObject4);
        } else {
            s3q0 s3q0Var = s3q0.a;
        }
        jSONObject.put("user_data", jSONObject2);
        JSONObject jSONObject5 = new JSONObject();
        VkMerchantInfo vkMerchantInfo = this.e;
        int i = vkMerchantInfo.b;
        String str2 = vkMerchantInfo.c;
        jSONObject5.put("merchant_id", i);
        String str3 = vkMerchantInfo.d;
        if (!drm0.N(str3)) {
            jSONObject5.put("merchant_user_id", str3);
        }
        VkTransactionInfo vkTransactionInfo = this.f;
        jSONObject5.put("amount", vkTransactionInfo.b);
        jSONObject5.put("order_id", vkTransactionInfo.c);
        jSONObject5.put(InAppPurchaseMetaData.KEY_CURRENCY, this.d);
        if (vkExtraPaymentOptions != null) {
            jSONObject5.put("need_hold", vkExtraPaymentOptions.b);
            jSONObject5.put("description", vkExtraPaymentOptions.e);
            String str4 = vkExtraPaymentOptions.d;
            if (str4 != null) {
                try {
                    jSONObject5.put("extra", new JSONObject(str4));
                } catch (Throwable unused) {
                }
            }
        }
        jSONObject.put("merchant_data", jSONObject5);
        if (!drm0.N(str2)) {
            jSONObject.put("merchant_signature", str2);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr90)) {
            return false;
        }
        wr90 wr90Var = (wr90) obj;
        return this.a == wr90Var.a && epx.f(this.b, wr90Var.b) && epx.f(this.c, wr90Var.c) && this.d == wr90Var.d && epx.f(this.e, wr90Var.e) && epx.f(this.f, wr90Var.f) && epx.f(this.g, wr90Var.g) && epx.f(this.h, wr90Var.h) && epx.f(this.i, wr90Var.i) && epx.f(this.j, wr90Var.j) && epx.f(this.k, wr90Var.k) && this.l == wr90Var.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        jwu0 jwu0Var = this.c;
        int hashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (jwu0Var == null ? 0 : jwu0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        de deVar = this.g;
        int hashCode4 = (hashCode3 + (deVar == null ? 0 : deVar.hashCode())) * 31;
        Integer num = this.h;
        int a = urd0.a((hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.i);
        VkPaymentToken vkPaymentToken = this.j;
        int hashCode5 = (a + (vkPaymentToken == null ? 0 : vkPaymentToken.hashCode())) * 31;
        VkExtraPaymentOptions vkExtraPaymentOptions = this.k;
        return Boolean.hashCode(this.l) + ((hashCode5 + (vkExtraPaymentOptions != null ? vkExtraPaymentOptions.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayOperationRequestBody(method=");
        sb.append(this.a);
        sb.append(", bindId=");
        sb.append(this.b);
        sb.append(", cardData=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", merchantConfiguration=");
        sb.append(this.e);
        sb.append(", transactionInfo=");
        sb.append(this.f);
        sb.append(", walletAuthMethod=");
        sb.append(this.g);
        sb.append(", chargeAmount=");
        sb.append(this.h);
        sb.append(", deviceId=");
        sb.append(this.i);
        sb.append(", paymentToken=");
        sb.append(this.j);
        sb.append(", extraPaymentOptions=");
        sb.append(this.k);
        sb.append(", spendBonus=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
