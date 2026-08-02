package com.yandex.go.summary.interactor.core;

import defpackage.eci0;
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
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryUiEventsInteractor$collectSummaryUiEvents$2", f = "SummaryUiEventsInteractor.kt", l = {311}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryUiEventsInteractor$collectSummaryUiEvents$2 extends SuspendLambda implements wls {
    final /* synthetic */ oiv0 $summaryNavigator;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryUiEventsInteractor$collectSummaryUiEvents$2(v vVar, oiv0 oiv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$summaryNavigator = oiv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryUiEventsInteractor$collectSummaryUiEvents$2(this.this$0, this.$summaryNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryUiEventsInteractor$collectSummaryUiEvents$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v vVar = this.this$0;
            eci0 eci0Var = vVar.c.b;
            oiv0 oiv0Var = this.$summaryNavigator;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(eci0Var, new SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            u uVar = new u(vVar, oiv0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(uVar, this) == coroutineSingletons) {
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
