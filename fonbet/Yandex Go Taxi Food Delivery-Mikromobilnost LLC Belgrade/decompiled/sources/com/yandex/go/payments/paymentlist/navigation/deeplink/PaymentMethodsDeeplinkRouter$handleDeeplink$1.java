package com.yandex.go.payments.paymentlist.navigation.deeplink;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.deeplink.PaymentMethodsDeeplinkRouter", f = "PaymentMethodsDeeplinkRouter.kt", l = {HProv.ALG_SID_SHA3_384, HProv.ALG_SID_KECCAK_224, 109, HProv.PP_INFO, HProv.PP_CONTAINER_EXTENSION}, m = "handleDeeplink", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsDeeplinkRouter$handleDeeplink$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsDeeplinkRouter$handleDeeplink$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.P(this.this$0, null, this);
    }
}
