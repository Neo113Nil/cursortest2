package com.yandex.go.taxi.order.map.curtain.floating.button;

import defpackage.hz70;
import defpackage.iz70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liz70;", "uiState", "Lzy11;", "<anonymous>", "(Liz70;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3", f = "OrderMapCurtainHideFloatingButtonViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ hz70 $mvpView;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3(hz70 hz70Var, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = hz70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3 orderMapCurtainHideFloatingButtonViewPresenter$attachView$3 = new OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3(this.$mvpView, continuation);
        orderMapCurtainHideFloatingButtonViewPresenter$attachView$3.L$0 = obj;
        return orderMapCurtainHideFloatingButtonViewPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3 orderMapCurtainHideFloatingButtonViewPresenter$attachView$3 = (OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3) create((iz70) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderMapCurtainHideFloatingButtonViewPresenter$attachView$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iz70 iz70Var = (iz70) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        hz70 hz70Var = this.$mvpView;
        if (iz70Var != null) {
            hz70Var.ud();
            this.$mvpView.p5(iz70Var);
        } else {
            hz70Var.A5();
        }
        return zy11.a;
    }
}
