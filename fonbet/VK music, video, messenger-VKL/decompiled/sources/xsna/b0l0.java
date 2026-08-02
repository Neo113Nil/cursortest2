package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;

/* compiled from: Statused.kt */
/* loaded from: classes6.dex */
public class b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus a;

    public b0l0(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus) {
        this.a = vkCheckoutResponseStatus;
    }

    public VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.a;
    }

    public final boolean b() {
        return a() == VkCheckoutResponse.VkCheckoutResponseStatus.OK;
    }
}
