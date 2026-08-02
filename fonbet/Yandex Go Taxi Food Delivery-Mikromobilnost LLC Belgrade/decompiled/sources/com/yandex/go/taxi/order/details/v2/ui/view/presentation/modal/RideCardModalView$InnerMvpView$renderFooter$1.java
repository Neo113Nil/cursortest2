package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import com.yandex.go.taxi.order.details.v2.analytics.g;
import defpackage.dgk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView$InnerMvpView$renderFooter$1", f = "RideCardModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardModalView$InnerMvpView$renderFooter$1 extends SuspendLambda implements wls {
    final /* synthetic */ dgk0 $uiState;
    int label;
    final /* synthetic */ RideCardModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardModalView$InnerMvpView$renderFooter$1(RideCardModalView rideCardModalView, dgk0 dgk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rideCardModalView;
        this.$uiState = dgk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardModalView$InnerMvpView$renderFooter$1(this.this$0, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardModalView$InnerMvpView$renderFooter$1 rideCardModalView$InnerMvpView$renderFooter$1 = (RideCardModalView$InnerMvpView$renderFooter$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardModalView$InnerMvpView$renderFooter$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g gVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gVar = this.this$0.rideCardAnalyticsInteractor;
        gVar.e(this.$uiState.e);
        return zy11.a;
    }
}
