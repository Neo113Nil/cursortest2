package com.yandex.go.superapp.order.multi.old.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.f;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.router.OrderListViewHoldersRouter$onCancelWalkingRoute$1", f = "OrderListViewHoldersRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderListViewHoldersRouter$onCancelWalkingRoute$1 extends SuspendLambda implements tls {
    final /* synthetic */ o2y0 $orderHolder;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListViewHoldersRouter$onCancelWalkingRoute$1(a aVar, o2y0 o2y0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderListViewHoldersRouter$onCancelWalkingRoute$1(this.this$0, this.$orderHolder, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        OrderListViewHoldersRouter$onCancelWalkingRoute$1 orderListViewHoldersRouter$onCancelWalkingRoute$1 = (OrderListViewHoldersRouter$onCancelWalkingRoute$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        orderListViewHoldersRouter$onCancelWalkingRoute$1.invokeSuspend(zy11Var);
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
        ((f) this.this$0.a).a0(this.$orderHolder);
        return zy11.a;
    }
}
