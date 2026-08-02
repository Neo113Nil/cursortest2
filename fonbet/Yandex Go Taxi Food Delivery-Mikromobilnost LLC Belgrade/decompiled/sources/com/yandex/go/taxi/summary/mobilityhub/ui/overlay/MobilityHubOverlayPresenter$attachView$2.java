package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rv20;
import defpackage.sv20;
import defpackage.tse;
import defpackage.wls;
import defpackage.xur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubOverlayPresenter$attachView$2", f = "MobilityHubOverlayPresenter.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubOverlayPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ rv20 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ sv20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubOverlayPresenter$attachView$2(sv20 sv20Var, rv20 rv20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sv20Var;
        this.$mvpView = rv20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobilityHubOverlayPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobilityHubOverlayPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(this.this$0.D.k()), new MobilityHubOverlayPresenter$attachView$2$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null));
            rv20 rv20Var = this.$mvpView;
            sv20 sv20Var = this.this$0;
            o oVar = new o(X, new MobilityHubOverlayPresenter$attachView$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            xur xurVar = new xur(12, rv20Var, sv20Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(xurVar, this) == coroutineSingletons) {
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
