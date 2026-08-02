package com.yandex.go.taxi.order;

import defpackage.bpt0;
import defpackage.mvg;
import defpackage.ny61;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.OrderStatusController$updateSync$2", f = "OrderStatusController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusController$updateSync$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $expirationIntervalInMillis;
    final /* synthetic */ String $from;
    final /* synthetic */ List<String> $orderIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusController$updateSync$2(List list, y yVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.$orderIds = list;
        this.this$0 = yVar;
        this.$from = str;
        this.$expirationIntervalInMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderStatusController$updateSync$2 orderStatusController$updateSync$2 = new OrderStatusController$updateSync$2(this.$orderIds, this.this$0, this.$from, this.$expirationIntervalInMillis, continuation);
        orderStatusController$updateSync$2.L$0 = obj;
        return orderStatusController$updateSync$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderStatusController$updateSync$2 orderStatusController$updateSync$2 = (OrderStatusController$updateSync$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderStatusController$updateSync$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List J0;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        for (String str : this.$orderIds) {
            this.this$0.e.h(str, this.$from);
            this.this$0.c(str);
        }
        y yVar = this.this$0;
        synchronized (yVar.q) {
            J0 = kotlin.collections.a.J0(yVar.r.values());
        }
        List list = J0;
        long j = this.$expirationIntervalInMillis;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.N(tseVar, null, null, new OrderStatusController$updateSync$2$1$1((bpt0) it.next(), j, null), 3));
        }
        return zy11.a;
    }
}
