package com.yandex.go.payments.paymentlist.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListSourceInteractorImpl", f = "PaymentMethodsListSourceInteractorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59}, m = "invalidatePaymentMethodsAfterDeletion", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
