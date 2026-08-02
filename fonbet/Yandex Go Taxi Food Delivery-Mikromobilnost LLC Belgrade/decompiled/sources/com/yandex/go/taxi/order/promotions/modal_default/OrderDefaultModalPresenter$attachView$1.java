package com.yandex.go.taxi.order.promotions.modal_default;

import com.yandex.go.taxi.order.promotions.modal_default.interactor.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qr70;
import defpackage.rr70;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.modal_default.OrderDefaultModalPresenter$attachView$1", f = "OrderDefaultModalPresenter.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDefaultModalPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ qr70 $mvpView;
    int label;
    final /* synthetic */ rr70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDefaultModalPresenter$attachView$1(rr70 rr70Var, qr70 qr70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rr70Var;
        this.$mvpView = qr70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDefaultModalPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDefaultModalPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rr70 rr70Var = this.this$0;
            c cVar = rr70Var.A;
            com.yandex.go.taxi.order.promotions.modal_default.interactor.b bVar = new com.yandex.go.taxi.order.promotions.modal_default.interactor.b(cVar.a.a(), cVar, rr70Var.x);
            v41 v41Var = new v41(12, this.$mvpView);
            this.label = 1;
            if (bVar.collect(v41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
