package com.yandex.go.payments.superapp.payment;

import com.google.common.collect.ImmutableSet;
import defpackage.ey90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.superapp.payment.PaymentComponentHolderImpl$init$1", f = "PaymentComponentHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentComponentHolderImpl$init$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ey90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentComponentHolderImpl$init$1(ey90 ey90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ey90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentComponentHolderImpl$init$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentComponentHolderImpl$init$1 paymentComponentHolderImpl$init$1 = (PaymentComponentHolderImpl$init$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentComponentHolderImpl$init$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Iterator<E> it = ImmutableSet.q((com.yandex.go.payments.superapp.a) ((xvf0) this.this$0.b.n).get()).iterator();
        while (it.hasNext()) {
            ((com.yandex.go.payments.superapp.a) it.next()).b();
        }
        return zy11.a;
    }
}
