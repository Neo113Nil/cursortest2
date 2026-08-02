package com.yandex.go.taxi.order.details.v1.domain;

import defpackage.e430;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le430;", "modeStyle", "Lzy11;", "<anonymous>", "(Le430;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.domain.OrderDetailsCardInteractor$subscribeForTotwUpdates$1", f = "OrderDetailsCardInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDetailsCardInteractor$subscribeForTotwUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsCardInteractor$subscribeForTotwUpdates$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderDetailsCardInteractor$subscribeForTotwUpdates$1 orderDetailsCardInteractor$subscribeForTotwUpdates$1 = new OrderDetailsCardInteractor$subscribeForTotwUpdates$1(this.this$0, continuation);
        orderDetailsCardInteractor$subscribeForTotwUpdates$1.L$0 = obj;
        return orderDetailsCardInteractor$subscribeForTotwUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderDetailsCardInteractor$subscribeForTotwUpdates$1 orderDetailsCardInteractor$subscribeForTotwUpdates$1 = (OrderDetailsCardInteractor$subscribeForTotwUpdates$1) create((e430) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderDetailsCardInteractor$subscribeForTotwUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e430 e430Var = (e430) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        p0c0 e = this.this$0.g.e(e430Var.c);
        p0c0 a = this.this$0.g.a(e430Var.c);
        this.this$0.c.e(e.c);
        this.this$0.e.g(a.c);
        return zy11.a;
    }
}
