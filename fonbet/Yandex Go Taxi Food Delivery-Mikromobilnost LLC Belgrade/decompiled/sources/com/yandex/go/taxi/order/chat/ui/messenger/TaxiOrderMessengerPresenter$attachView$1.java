package com.yandex.go.taxi.order.chat.ui.messenger;

import com.yandex.go.taxi.order.details.v1.elements.driver.e;
import defpackage.bax0;
import defpackage.k3y0;
import defpackage.m3y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.ui.messenger.TaxiOrderMessengerPresenter$attachView$1", f = "TaxiOrderMessengerPresenter.kt", l = {228}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderMessengerPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ k3y0 $mvpView;
    final /* synthetic */ o2y0 $orderHolder;
    Object L$0;
    int label;
    final /* synthetic */ m3y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderMessengerPresenter$attachView$1(m3y0 m3y0Var, o2y0 o2y0Var, k3y0 k3y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m3y0Var;
        this.$orderHolder = o2y0Var;
        this.$mvpView = k3y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderMessengerPresenter$attachView$1(this.this$0, this.$orderHolder, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderMessengerPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 c = ((e) this.this$0.z).c(this.$orderHolder.b());
            k3y0 k3y0Var = this.$mvpView;
            o oVar = new o(c, new TaxiOrderMessengerPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(k3y0Var, this.this$0, null));
            bax0 bax0Var = new bax0(13, k3y0Var);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(bax0Var, this) == coroutineSingletons) {
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
