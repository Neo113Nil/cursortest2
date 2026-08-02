package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkPaymentToken;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DmrVkPayCheckoutApiImpl.kt */
/* loaded from: classes6.dex */
public final class ksn {
    public final cbv0 a;

    public ksn(cbv0 cbv0Var) {
        this.a = cbv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, xsna.wr90] */
    public static io.reactivex.rxjava3.core.x b(ksn ksnVar, VkCheckoutPayMethod vkCheckoutPayMethod, String str, jwu0 jwu0Var, VkTransactionInfo vkTransactionInfo, VkMerchantInfo vkMerchantInfo, de deVar, Integer num, VkPaymentToken vkPaymentToken, VkExtraPaymentOptions vkExtraPaymentOptions, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        jwu0 jwu0Var2 = (i & 4) != 0 ? null : jwu0Var;
        de deVar2 = (i & 32) != 0 ? null : deVar;
        Integer num2 = (i & 64) != 0 ? null : num;
        VkPaymentToken vkPaymentToken2 = (i & 128) != 0 ? null : vkPaymentToken;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? wr90Var = new wr90(vkCheckoutPayMethod, str2, jwu0Var2, vkTransactionInfo.d, vkMerchantInfo, vkTransactionInfo, deVar2, num2, dgn0.e(), vkPaymentToken2, vkExtraPaymentOptions, false);
        ref$ObjectRef.element = wr90Var;
        cbv0 cbv0Var = ksnVar.a;
        return cbv0Var.b ? new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(px2.c(new qst(wr90Var, cbv0Var), dgn0.c()).m0(), new lf1(new vfk(ref$ObjectRef, 5), 23)), new com.vk.movika.sdk.base.ui.p0(new v63(ksnVar, ref$ObjectRef, vkCheckoutPayMethod, 8), 17)) : ksnVar.a(wr90Var, vkCheckoutPayMethod);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(wr90 wr90Var, VkCheckoutPayMethod vkCheckoutPayMethod) {
        return px2.c(new vr90(wr90Var, this.a), dgn0.c()).U(new qa(new vam(vkCheckoutPayMethod, 6), 19)).m0().l(new e05(new f57(20), 21));
    }
}
