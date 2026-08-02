package com.yandex.go.taxi.order.ui.status;

import defpackage.d880;
import defpackage.m880;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ui.status.OrderStatusPresenter$observeOrderState$1$2$1", f = "OrderStatusPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusPresenter$observeOrderState$1$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m880 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusPresenter$observeOrderState$1$2$1(m880 m880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStatusPresenter$observeOrderState$1$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderStatusPresenter$observeOrderState$1$2$1 orderStatusPresenter$observeOrderState$1$2$1 = (OrderStatusPresenter$observeOrderState$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderStatusPresenter$observeOrderState$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ((d880) this.this$0.Dg()).dismissView();
        return zy11.a;
    }
}
