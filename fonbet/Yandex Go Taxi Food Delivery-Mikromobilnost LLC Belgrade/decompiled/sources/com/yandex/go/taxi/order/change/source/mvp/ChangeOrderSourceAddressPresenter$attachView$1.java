package com.yandex.go.taxi.order.change.source.mvp;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.ac9;
import defpackage.bc9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wa4;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$attachView$1", f = "ChangeOrderSourceAddressPresenter.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ac9 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$attachView$1(ac9 ac9Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = ac9Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ac9 ac9Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ac9 ac9Var2 = this.$mvpView;
            d dVar = this.this$0;
            com.yandex.go.taxi.order.change.source.interactor.a aVar = dVar.y;
            bc9 bc9Var = dVar.x;
            this.L$0 = ac9Var2;
            this.label = 1;
            Object a = aVar.a(bc9Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            ac9Var = ac9Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ac9Var = (ac9) this.L$0;
            kotlin.b.b(obj);
        }
        ac9Var.showAvailableCircle((wa4) obj);
        return zy11.a;
    }
}
