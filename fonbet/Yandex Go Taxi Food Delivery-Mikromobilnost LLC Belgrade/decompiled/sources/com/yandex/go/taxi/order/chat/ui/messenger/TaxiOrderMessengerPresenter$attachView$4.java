package com.yandex.go.taxi.order.chat.ui.messenger;

import defpackage.k3y0;
import defpackage.m3y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.ui.messenger.TaxiOrderMessengerPresenter$attachView$4", f = "TaxiOrderMessengerPresenter.kt", l = {233}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderMessengerPresenter$attachView$4 extends SuspendLambda implements wls {
    final /* synthetic */ k3y0 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ m3y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderMessengerPresenter$attachView$4(k3y0 k3y0Var, m3y0 m3y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m3y0Var;
        this.$mvpView = k3y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderMessengerPresenter$attachView$4(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderMessengerPresenter$attachView$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = new d(this.this$0.D.a.a());
            m3y0 m3y0Var = this.this$0;
            k3y0 k3y0Var = this.$mvpView;
            o oVar = new o(dVar, new TaxiOrderMessengerPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$1(null, m3y0Var));
            p9g0 p9g0Var = new p9g0(22, m3y0Var, k3y0Var);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(p9g0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
