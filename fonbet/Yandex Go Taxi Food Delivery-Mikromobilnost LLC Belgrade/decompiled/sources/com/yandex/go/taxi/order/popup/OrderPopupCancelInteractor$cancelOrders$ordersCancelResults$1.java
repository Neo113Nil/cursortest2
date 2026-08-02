package com.yandex.go.taxi.order.popup;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lnoh;", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1", f = "OrderPopupCancelInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<o2y0> $orders;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$orders = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1 orderPopupCancelInteractor$cancelOrders$ordersCancelResults$1 = new OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1(this.$orders, this.this$0, continuation);
        orderPopupCancelInteractor$cancelOrders$ordersCancelResults$1.L$0 = obj;
        return orderPopupCancelInteractor$cancelOrders$ordersCancelResults$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<o2y0> list = this.$orders;
        a aVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1$1$1(aVar, (o2y0) it.next(), null), 3));
        }
        return arrayList;
    }
}
