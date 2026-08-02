package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WalletPayMethod;
import com.vk.superapp.vkpay.checkout.feature.success.CheckoutStatusFragment;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PaymentData3DS;

/* compiled from: VkCheckoutRouter.kt */
/* loaded from: classes6.dex */
public interface kku0 {

    /* compiled from: VkCheckoutRouter.kt */
    public static final class a {
        public static void a(kku0 kku0Var, Status status) {
            kku0Var.f(status, new jku0(status.d()));
        }
    }

    void a(PayMethodData payMethodData);

    void b();

    void c();

    void d(VkCheckoutPayMethod vkCheckoutPayMethod, String str, String str2);

    void e(WalletPayMethod walletPayMethod);

    void f(Status status, CheckoutStatusFragment.OnBackPressedListener onBackPressedListener);

    void g();

    void h(PaymentData3DS paymentData3DS, String str);

    void i();

    void j(String str);
}
