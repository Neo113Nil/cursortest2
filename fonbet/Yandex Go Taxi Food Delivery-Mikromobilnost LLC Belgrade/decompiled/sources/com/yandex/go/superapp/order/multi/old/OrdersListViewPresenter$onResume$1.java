package com.yandex.go.superapp.order.multi.old;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qc80;
import defpackage.ra80;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lw201;", "models", "Lra80;", ClidProvider.STATE, "Lo2y0;", "selectedOrder", "Lqc80;", "<anonymous>", "(Ljava/util/List;Lra80;Lo2y0;)Lqc80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.OrdersListViewPresenter$onResume$1", f = "OrdersListViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdersListViewPresenter$onResume$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OrdersListViewPresenter$onResume$1 ordersListViewPresenter$onResume$1 = new OrdersListViewPresenter$onResume$1(4, (Continuation) obj4);
        ordersListViewPresenter$onResume$1.L$0 = (List) obj;
        ordersListViewPresenter$onResume$1.L$1 = (ra80) obj2;
        ordersListViewPresenter$onResume$1.L$2 = (o2y0) obj3;
        return ordersListViewPresenter$onResume$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        ra80 ra80Var = (ra80) this.L$1;
        o2y0 o2y0Var = (o2y0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new qc80(o2y0Var, list, ra80Var.a);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
