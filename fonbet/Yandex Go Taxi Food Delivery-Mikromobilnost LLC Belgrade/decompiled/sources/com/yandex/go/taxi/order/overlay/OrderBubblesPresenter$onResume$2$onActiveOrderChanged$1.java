package com.yandex.go.taxi.order.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.overlay.OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1", f = "OrderBubblesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $active;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1(g gVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$active = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1(this.this$0, this.$active, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1 orderBubblesPresenter$onResume$2$onActiveOrderChanged$1 = (OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderBubblesPresenter$onResume$2$onActiveOrderChanged$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        gVar.L = this.$active;
        EmptyList emptyList = EmptyList.a;
        gVar.O = emptyList;
        gVar.P = emptyList;
        gVar.Ng();
        n0 n0Var = gVar.J;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        gVar.Mg();
        return zy11Var;
    }
}
