package com.yandex.go.taxi.order.change.common.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "it", "Lkotlin/Pair;", "", "Lcom/yandex/go/taxi/order/models/api/e;", "Lo2y0;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.common.domain.OrderChangesPollWatcher$attach$1$1$1$3", f = "OrderChangesPollWatcher.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderChangesPollWatcher$attach$1$1$1$3 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $holder;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderChangesPollWatcher$attach$1$1$1$3(o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.$holder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderChangesPollWatcher$attach$1$1$1$3 orderChangesPollWatcher$attach$1$1$1$3 = new OrderChangesPollWatcher$attach$1$1$1$3(this.$holder, continuation);
        orderChangesPollWatcher$attach$1$1$1$3.L$0 = obj;
        return orderChangesPollWatcher$attach$1$1$1$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderChangesPollWatcher$attach$1$1$1$3) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(taxiOrder.i.e(), this.$holder);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
