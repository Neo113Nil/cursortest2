package com.yandex.go.taxi.order.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.kc00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ra80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lra80;", "orderViewState", "Lzy11;", "<anonymous>", "(Lra80;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.view.OrderViewStateRepository$refreshMapOverlayFlow$1", f = "OrderViewStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderViewStateRepository$refreshMapOverlayFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onLinkedOrder;
    final /* synthetic */ Runnable $onSuperAppList;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderViewStateRepository$refreshMapOverlayFlow$1(Runnable runnable, l lVar, Runnable runnable2, Continuation continuation) {
        super(2, continuation);
        this.$onLinkedOrder = runnable;
        this.this$0 = lVar;
        this.$onSuperAppList = runnable2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderViewStateRepository$refreshMapOverlayFlow$1 orderViewStateRepository$refreshMapOverlayFlow$1 = new OrderViewStateRepository$refreshMapOverlayFlow$1(this.$onLinkedOrder, this.this$0, this.$onSuperAppList, continuation);
        orderViewStateRepository$refreshMapOverlayFlow$1.L$0 = obj;
        return orderViewStateRepository$refreshMapOverlayFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderViewStateRepository$refreshMapOverlayFlow$1 orderViewStateRepository$refreshMapOverlayFlow$1 = (OrderViewStateRepository$refreshMapOverlayFlow$1) create((ra80) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderViewStateRepository$refreshMapOverlayFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ra80 ra80Var = (ra80) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (ra80Var.d == DetailsOpenReason.LINKED_ORDER) {
            this.$onLinkedOrder.run();
        } else if (ra80Var.a == OrderScreen.ORDER_LIST) {
            ic00 ic00Var = ((kc00) this.this$0.e).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                this.$onSuperAppList.run();
            }
        }
        return zy11.a;
    }
}
