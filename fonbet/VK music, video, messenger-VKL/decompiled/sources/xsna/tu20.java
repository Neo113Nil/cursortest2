package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.CreditCard;
import com.vk.superapp.vkpay.checkout.data.model.NoVkPay;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import kotlin.NoWhenBranchMatchedException;
import xsna.bbv0;

/* compiled from: MockCheckoutDataSource.kt */
/* loaded from: classes6.dex */
public final class tu20 implements m4c {
    public static tr90 n(VkCheckoutPayMethod vkCheckoutPayMethod) {
        return new tr90(VkCheckoutResponse.VkCheckoutResponseStatus.OK, TransactionStatusResponse.VkCheckoutTransactionStatus.PROCESSING, "", vkCheckoutPayMethod, 0);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> a(de deVar) {
        return io.reactivex.rxjava3.core.x.k(n(VkCheckoutPayMethod.WALLET));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<gt9> b(String str) {
        return io.reactivex.rxjava3.core.x.k(new gt9(VkCheckoutResponse.VkCheckoutResponseStatus.OK, str));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> c(String str) {
        return io.reactivex.rxjava3.core.x.k(n(VkCheckoutPayMethod.BIND_ID));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<zla0> d() {
        return io.reactivex.rxjava3.core.x.k(new zla0(VkCheckoutResponse.VkCheckoutResponseStatus.OK, ""));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> e(String str) {
        return io.reactivex.rxjava3.core.x.k(n(VkCheckoutPayMethod.TOKEN));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<w1p0> f(String str) {
        return io.reactivex.rxjava3.core.x.k(new w1p0(VkCheckoutResponse.VkCheckoutResponseStatus.OK, "", 0L));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<ajp0> g(VkCheckoutPayMethod vkCheckoutPayMethod, String str) {
        return io.reactivex.rxjava3.core.x.k(new ajp0(VkCheckoutResponse.VkCheckoutResponseStatus.OK, TransactionStatusResponse.VkCheckoutTransactionStatus.DONE, "", new xou0("", "", "")));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> h(jwu0 jwu0Var) {
        return io.reactivex.rxjava3.core.x.k(n(VkCheckoutPayMethod.NEW_CARD));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> i(hcv0 hcv0Var) {
        return io.reactivex.rxjava3.core.x.k(n(VkCheckoutPayMethod.WALLET_NEW_CARD));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<ixw> init() {
        boolean z;
        bbv0.g.getClass();
        VkPayCheckoutConfig.Environment environment = bbv0.a.f().b.d;
        if (environment instanceof VkPayCheckoutConfig.Environment.Sandbox) {
            z = ((VkPayCheckoutConfig.Environment.Sandbox) environment).d;
        } else {
            if (!(environment instanceof VkPayCheckoutConfig.Environment.Production)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return io.reactivex.rxjava3.core.x.k(new ixw(VkCheckoutResponse.VkCheckoutResponseStatus.OK, "", e43.l(z ? NoVkPay.c : new VkPay(1234, 300, true, 300), new Card("0", "2451", "05/12", CreditCard.VISA), new Card("1", "9999", "05/12", CreditCard.DISCOVER), new Card("2", "7777", "01/01", CreditCard.MASTERCARD), new Card("3", "7777", "01/01", CreditCard.MIR))));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> j(gcv0 gcv0Var) {
        return io.reactivex.rxjava3.core.x.k(n(VkCheckoutPayMethod.WALLET_BIND_ID));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<b0l0> k(String str, String str2) {
        return io.reactivex.rxjava3.core.x.k(new b0l0(VkCheckoutResponse.VkCheckoutResponseStatus.OK));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<b0l0> l(String str) {
        return io.reactivex.rxjava3.core.x.k(new b0l0(VkCheckoutResponse.VkCheckoutResponseStatus.OK));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<b0l0> m(String str, String str2, String str3) {
        return io.reactivex.rxjava3.core.x.k(new b0l0(VkCheckoutResponse.VkCheckoutResponseStatus.OK));
    }
}
