package com.yandex.go.taxi.order.repositories;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "orderInfo", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.repositories.OrderDataRepositoryImpl$statusInfoFlow$3", f = "OrderDataRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDataRepositoryImpl$statusInfoFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDataRepositoryImpl$statusInfoFlow$3(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderDataRepositoryImpl$statusInfoFlow$3 orderDataRepositoryImpl$statusInfoFlow$3 = new OrderDataRepositoryImpl$statusInfoFlow$3(this.this$0, continuation);
        orderDataRepositoryImpl$statusInfoFlow$3.L$0 = obj;
        return orderDataRepositoryImpl$statusInfoFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderDataRepositoryImpl$statusInfoFlow$3 orderDataRepositoryImpl$statusInfoFlow$3 = (OrderDataRepositoryImpl$statusInfoFlow$3) create((TaxiOrder) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderDataRepositoryImpl$statusInfoFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (taxiOrder.G()) {
            com.yandex.go.taxi.order.performer.b bVar = this.this$0.a;
            synchronized (bVar) {
                bVar.b.remove(taxiOrder);
            }
        }
        return zy11.a;
    }
}
