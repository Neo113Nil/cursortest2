package com.yandex.go.payments.paymentlist.navigation;

import defpackage.k5g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pba0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$withLoading$1", f = "PaymentMethodsListRouter.kt", l = {776}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListRouter$withLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListRouter$withLoading$1(tls tlsVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsListRouter$withLoading$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsListRouter$withLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pba0 pba0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar = this.$action;
            this.label = 1;
            if (tlsVar.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        k5g k5gVar = this.this$0.p0;
        if (k5gVar != null && (pba0Var = (pba0) ((xvf0) k5gVar.g).get()) != null) {
            pba0Var.a(false);
        }
        return zy11.a;
    }
}
