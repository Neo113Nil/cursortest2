package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.taw;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltaw;", "dashboardButtonAction", "Lzy11;", "<anonymous>", "(Ltaw;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$attachView$13", f = "IntercityDashboardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$attachView$13 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$attachView$13(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardPresenter$attachView$13 intercityDashboardPresenter$attachView$13 = new IntercityDashboardPresenter$attachView$13(this.this$0, continuation);
        intercityDashboardPresenter$attachView$13.L$0 = obj;
        return intercityDashboardPresenter$attachView$13;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IntercityDashboardPresenter$attachView$13 intercityDashboardPresenter$attachView$13 = (IntercityDashboardPresenter$attachView$13) create((taw) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        intercityDashboardPresenter$attachView$13.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        taw tawVar = (taw) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.Og(tawVar);
        return zy11.a;
    }
}
