package com.yandex.go.summary.interactor.core;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oiv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1", f = "SummaryUiEventsInteractor.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $runnable;
    final /* synthetic */ oiv0 $summaryNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1(oiv0 oiv0Var, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.$summaryNavigator = oiv0Var;
        this.$runnable = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1(this.$summaryNavigator, this.$runnable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oiv0 oiv0Var = this.$summaryNavigator;
            Runnable runnable = this.$runnable;
            this.label = 1;
            if (oiv0Var.w(runnable, this) == coroutineSingletons) {
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
