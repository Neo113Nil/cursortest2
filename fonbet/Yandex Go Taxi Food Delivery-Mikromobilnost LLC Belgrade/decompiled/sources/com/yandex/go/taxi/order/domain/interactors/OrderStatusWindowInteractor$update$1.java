package com.yandex.go.taxi.order.domain.interactors;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xh60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.interactors.OrderStatusWindowInteractor$update$1", f = "OrderStatusWindowInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusWindowInteractor$update$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusWindowInteractor$update$1(i iVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStatusWindowInteractor$update$1(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStatusWindowInteractor$update$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            TaxiOrder taxiOrder = this.$order;
            this.label = 1;
            a = i.a(iVar, taxiOrder, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        xh60 xh60Var = (xh60) a;
        TaxiOrder taxiOrder2 = this.$order;
        taxiOrder2.getClass();
        synchronized (taxiOrder2) {
            TaxiOrderLocalData taxiOrderLocalData = taxiOrder2.l;
            taxiOrderLocalData.getClass();
            taxiOrder2.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, xh60Var != null ? gw00.e(new Pair(xh60Var.a, xh60Var.b)) : null, -1, 8388607);
        }
        this.this$0.b.g(this.$order);
        return zy11.a;
    }
}
