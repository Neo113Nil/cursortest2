package com.yandex.go.payments.paymentlist.ui;

import defpackage.e6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.ui.PaymentMethodLargestContentfulListener$createObserver$1$onStateChanged$1", f = "PaymentMethodLargestContentfulListener.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodLargestContentfulListener$createObserver$1$onStateChanged$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e6a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodLargestContentfulListener$createObserver$1$onStateChanged$1(e6a0 e6a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e6a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodLargestContentfulListener$createObserver$1$onStateChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodLargestContentfulListener$createObserver$1$onStateChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.payments.data.c cVar = this.this$0.c;
            this.label = 1;
            obj = cVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            ((com.yandex.go.payments.paymentlist.data.c) this.this$0.b).p();
        }
        return zy11.a;
    }
}
