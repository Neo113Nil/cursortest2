package xsna;

import com.ironsource.B5;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.data.VkCheckoutUserInfo;
import org.json.JSONObject;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.bex0;

/* compiled from: JsVkPayCheckoutDelegate.kt */
/* loaded from: classes6.dex */
public final class n7y {
    public final x6y a;
    public zav0 b;

    public n7y(x6y x6yVar) {
        this.a = x6yVar;
    }

    public static VkExtraPaymentOptions a(boolean z, String str, String str2, String str3, String str4) {
        return new VkExtraPaymentOptions(z, str.length() == 0 ? VkOrderDescription.NoDescription.b : new VkOrderDescription.Description(str, cqm0.a(str2)), cqm0.a(str4), cqm0.a(str3));
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.has("merchant_id") && jSONObject.has("merchant_signature") && jSONObject.has("order_id") && jSONObject.has("amount") && jSONObject.has(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final VkPayCheckoutConfig.Environment c(JsApiMethodType jsApiMethodType, String str) {
        switch (str.hashCode()) {
            case -2116737577:
                if (str.equals("prodWithTestMerchant")) {
                    return new VkPayCheckoutConfig.Environment.ProductionWithTestMerchant(VkPayCheckoutConfig.Domain.TEST);
                }
                break;
            case -879038190:
                if (str.equals("testWithTestMerchant")) {
                    gzs<s3q0> gzsVar = fkq0.a;
                    return new VkPayCheckoutConfig.Environment.Sandbox(new VkCheckoutUserInfo(new UserId(575385312L), "+79123456782"), true, false, true, VkPayCheckoutConfig.Domain.TEST);
                }
                break;
            case 3449687:
                if (str.equals(B5.t)) {
                    return new VkPayCheckoutConfig.Environment.Production();
                }
                break;
            case 3556498:
                if (str.equals(LoginRequest.CLIENT_NAME)) {
                    gzs<s3q0> gzsVar2 = fkq0.a;
                    return new VkPayCheckoutConfig.Environment.Sandbox(new VkCheckoutUserInfo(new UserId(575385312L), "+79123456782"), true, false, false, VkPayCheckoutConfig.Domain.TEST);
                }
                break;
        }
        bex0.a.a(this.a, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
        return null;
    }
}
