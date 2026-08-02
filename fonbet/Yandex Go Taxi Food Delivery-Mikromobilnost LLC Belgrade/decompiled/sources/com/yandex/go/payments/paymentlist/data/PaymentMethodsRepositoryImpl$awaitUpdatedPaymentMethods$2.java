package com.yandex.go.payments.paymentlist.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vda0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvda0;", "it", "", "<anonymous>", "(Lvda0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2", f = "PaymentMethodsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $startTime;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2(long j, Continuation continuation) {
        super(2, continuation);
        this.$startTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2 paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2 = new PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2(this.$startTime, continuation);
        paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2.L$0 = obj;
        return paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2) create((vda0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vda0 vda0Var = (vda0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(vda0Var.b >= this.$startTime);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
