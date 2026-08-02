package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.xby;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Li3a0;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.PaymentWidgetHolder$_widgetExternalEventFlow$2$1", f = "PaymentWidgetHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PaymentWidgetHolder$_widgetExternalEventFlow$2$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentWidgetHolder$_widgetExternalEventFlow$2$1 paymentWidgetHolder$_widgetExternalEventFlow$2$1 = new PaymentWidgetHolder$_widgetExternalEventFlow$2$1(3, (Continuation) obj3);
        paymentWidgetHolder$_widgetExternalEventFlow$2$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        paymentWidgetHolder$_widgetExternalEventFlow$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xby.d.k(th, "Payment widget external event flow failed");
        return zy11.a;
    }
}
