package com.yandex.go.payments.paymentlist.data;

import defpackage.bms;
import defpackage.dvx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qaa0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqaa0;", "paymentMethodsGeoParams", "Ldvx;", "launchInfo", "Lzy11;", "<unused var>", "Lkotlin/Pair;", "<anonymous>", "(Lcom/yandex/go/payments/paymentlist/domain/PaymentMethodsGeoParams;Lru/yandex/taxi/launch/LaunchInfo;V)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$listenForPaymentMethods$2", f = "PaymentMethodsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsRepositoryImpl$listenForPaymentMethods$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PaymentMethodsRepositoryImpl$listenForPaymentMethods$2 paymentMethodsRepositoryImpl$listenForPaymentMethods$2 = new PaymentMethodsRepositoryImpl$listenForPaymentMethods$2(4, (Continuation) obj4);
        paymentMethodsRepositoryImpl$listenForPaymentMethods$2.L$0 = (qaa0) obj;
        paymentMethodsRepositoryImpl$listenForPaymentMethods$2.L$1 = (dvx) obj2;
        return paymentMethodsRepositoryImpl$listenForPaymentMethods$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qaa0 qaa0Var = (qaa0) this.L$0;
        dvx dvxVar = (dvx) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(qaa0Var, dvxVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
