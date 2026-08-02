package com.yandex.go.payments.paymentlist.experiments.info_modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.experiments.info_modal.PaymentMethodSelectionInfoModalExperimentProvider", f = "PaymentMethodSelectionInfoModalExperimentProvider.kt", l = {20}, m = "getModalDescription", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
