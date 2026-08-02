package com.yandex.go.taxi.order.cancel.v2.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tk70;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltk70;", "it", "Lzy11;", "<anonymous>", "(Ltk70;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3", f = "OrderCancelModalContentRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3 orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3 = new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3(this.this$0, continuation);
        orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3.L$0 = obj;
        return orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3 orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3 = (OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3) create((tk70) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tk70 tk70Var = (tk70) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.f.l(tk70Var);
        return zy11.a;
    }
}
