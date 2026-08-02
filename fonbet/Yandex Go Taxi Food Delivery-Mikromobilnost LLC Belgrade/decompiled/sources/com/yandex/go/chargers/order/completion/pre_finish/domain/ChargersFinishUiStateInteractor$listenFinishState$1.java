package com.yandex.go.chargers.order.completion.pre_finish.domain;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardState;
import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import defpackage.em9;
import defpackage.jl40;
import defpackage.l1a;
import defpackage.m1a;
import defpackage.mvg;
import defpackage.n1a;
import defpackage.ny61;
import defpackage.o1a;
import defpackage.p1a;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1a;", "it", "Lzy11;", "<anonymous>", "(Lp1a;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishUiStateInteractor$listenFinishState$1", f = "ChargersFinishUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishUiStateInteractor$listenFinishState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishUiStateInteractor$listenFinishState$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFinishUiStateInteractor$listenFinishState$1 chargersFinishUiStateInteractor$listenFinishState$1 = new ChargersFinishUiStateInteractor$listenFinishState$1(this.this$0, continuation);
        chargersFinishUiStateInteractor$listenFinishState$1.L$0 = obj;
        return chargersFinishUiStateInteractor$listenFinishState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersFinishUiStateInteractor$listenFinishState$1 chargersFinishUiStateInteractor$listenFinishState$1 = (ChargersFinishUiStateInteractor$listenFinishState$1) create((p1a) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersFinishUiStateInteractor$listenFinishState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p1a p1aVar = (p1a) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        em9 em9Var = bVar.b;
        bVar.getClass();
        if (jl40.l(p1aVar, n1a.a)) {
            em9Var.l(ChargersAnalytics$ChargersFinishCardState.FinishingInit);
        } else if (p1aVar instanceof m1a) {
            em9Var.l(ChargersAnalytics$ChargersFinishCardState.FinishingInProgress);
        } else if (p1aVar instanceof o1a) {
            ((com.yandex.go.chargers.orchestrator_user_events.domain.b) bVar.h).a(ChargersOrchestratorUserEventType.ORDER_FINISH);
            em9Var.l(ChargersAnalytics$ChargersFinishCardState.FinishingSuccess);
            em9Var.k(ChargersAnalytics$ChargersFinishCardCloseReason.OrderFinished);
        } else {
            if (!(p1aVar instanceof l1a)) {
                w511.b();
                return null;
            }
            em9Var.k(ChargersAnalytics$ChargersFinishCardCloseReason.Error);
        }
        return zy11.a;
    }
}
