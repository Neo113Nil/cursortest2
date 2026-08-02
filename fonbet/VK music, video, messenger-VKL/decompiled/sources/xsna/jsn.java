package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkPaymentToken;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: DmrCheckoutDataSource.kt */
/* loaded from: classes6.dex */
public final class jsn implements m4c {
    public final ksn a;
    public final b b;
    public final VkMerchantInfo c;
    public final VkExtraPaymentOptions d;

    /* compiled from: DmrCheckoutDataSource.kt */
    public static final class a extends Exception {
    }

    /* compiled from: DmrCheckoutDataSource.kt */
    public static final class b {
        public final VkPayCheckoutConfig a;
        public final VkTransactionInfo b;

        public b(VkPayCheckoutConfig vkPayCheckoutConfig, VkTransactionInfo vkTransactionInfo) {
            this.a = vkPayCheckoutConfig;
            this.b = vkTransactionInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UtilConfig(config=" + this.a + ", transactionInfo=" + this.b + ')';
        }
    }

    public jsn(ksn ksnVar, b bVar) {
        this.a = ksnVar;
        this.b = bVar;
        VkPayCheckoutConfig vkPayCheckoutConfig = bVar.a;
        this.c = vkPayCheckoutConfig.b;
        this.d = vkPayCheckoutConfig.e;
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> a(de deVar) {
        VkTransactionInfo vkTransactionInfo = this.b.b;
        return ksn.b(this.a, VkCheckoutPayMethod.WALLET, null, null, vkTransactionInfo, this.c, deVar, null, null, this.d, 198);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<gt9> b(String str) {
        return px2.c(new ct9(str, this.a.a), dgn0.c()).m0().l(new lp0(new ak(21), 19)).l(new q40(new ykb(str, 2), 13));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> c(String str) {
        VkTransactionInfo vkTransactionInfo = this.b.b;
        return ksn.b(this.a, VkCheckoutPayMethod.BIND_ID, str, null, vkTransactionInfo, this.c, null, null, null, this.d, 228);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<zla0> d() {
        return px2.c(new ama0(this.a.a), dgn0.c()).m0().l(new ux0(new pl2(24), 23));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> e(String str) {
        VkTransactionInfo vkTransactionInfo = this.b.b;
        return ksn.b(this.a, VkCheckoutPayMethod.TOKEN, null, null, vkTransactionInfo, this.c, null, null, new VkPaymentToken(str, VkPaymentToken.TokenType.GOOGLE_PAY), this.d, 102);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<w1p0> f(String str) {
        return px2.c(new x1p0(str, dgn0.e(), this.a.a), dgn0.c()).m0().l(new ql2(new wq3(23), 17));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<ajp0> g(VkCheckoutPayMethod vkCheckoutPayMethod, String str) {
        return px2.c(new bjp0(vkCheckoutPayMethod, str, this.b.a.b.b, this.a.a), dgn0.c()).m0().l(new nm3(new x90(16), 11)).l(new o40(new dh5(21), 17));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> h(jwu0 jwu0Var) {
        VkTransactionInfo vkTransactionInfo = this.b.b;
        return ksn.b(this.a, VkCheckoutPayMethod.NEW_CARD, null, jwu0Var, vkTransactionInfo, this.c, null, null, null, this.d, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> i(hcv0 hcv0Var) {
        VkTransactionInfo vkTransactionInfo = this.b.b;
        return ksn.b(this.a, VkCheckoutPayMethod.WALLET_NEW_CARD, null, hcv0Var.c, vkTransactionInfo, this.c, hcv0Var.a, Integer.valueOf(hcv0Var.b), null, this.d, 130);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<ixw> init() {
        sgn0 sgn0Var = e370.g;
        if (sgn0Var == null) {
            sgn0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.single.f0 q = sgn0Var.c().l(new com.vk.movika.sdk.base.hooks.f(new dj1(29), 16)).q(io.reactivex.rxjava3.schedulers.a.b());
        ksn ksnVar = this.a;
        return io.reactivex.rxjava3.core.x.B(q, px2.c(new vyw(ksnVar.a), dgn0.c()).m0().l(new xl0(new rl2(ksnVar), 20)), new qs6(this, 11)).q(new io.reactivex.rxjava3.internal.schedulers.f());
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<tr90> j(gcv0 gcv0Var) {
        VkTransactionInfo vkTransactionInfo = this.b.b;
        return ksn.b(this.a, VkCheckoutPayMethod.WALLET_BIND_ID, gcv0Var.c, null, vkTransactionInfo, this.c, gcv0Var.a, Integer.valueOf(gcv0Var.b), null, this.d, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<b0l0> k(String str, String str2) {
        return px2.c(new ila0(str, str2, this.a.a), dgn0.c()).m0().l(new bk1(new nk(20), 15)).l(new ed(new oj(21), 13));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<b0l0> l(String str) {
        return px2.c(new sax0(str, this.a.a), dgn0.c()).m0().l(new tp1(new ci3(25), 11)).l(new m40(new od3(27), 12));
    }

    @Override // xsna.m4c
    public final io.reactivex.rxjava3.core.x<b0l0> m(String str, String str2, String str3) {
        return px2.c(new mna0(str, str2, str3, this.a.a), dgn0.c()).m0().l(new h7(new gv3(20), 19)).l(new com.vk.movika.sdk.base.hooks.k(new nj(18), 23));
    }
}
