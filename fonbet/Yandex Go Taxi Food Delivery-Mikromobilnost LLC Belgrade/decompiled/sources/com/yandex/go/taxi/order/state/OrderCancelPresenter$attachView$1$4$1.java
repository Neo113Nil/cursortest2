package com.yandex.go.taxi.order.state;

import defpackage.il70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ul70;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.OrderCancelPresenter$attachView$1$4$1", f = "OrderCancelPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelPresenter$attachView$1$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ ul70 $it;
    final /* synthetic */ il70 $mvpView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelPresenter$attachView$1$4$1(il70 il70Var, ul70 ul70Var, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = il70Var;
        this.$it = ul70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancelPresenter$attachView$1$4$1(this.$mvpView, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderCancelPresenter$attachView$1$4$1 orderCancelPresenter$attachView$1$4$1 = (OrderCancelPresenter$attachView$1$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderCancelPresenter$attachView$1$4$1.invokeSuspend(zy11Var);
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
        this.$mvpView.render(this.$it);
        return zy11.a;
    }
}
