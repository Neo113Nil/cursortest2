package com.yandex.go.chargers.orchestrator_user_events.domain;

import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import com.yandex.go.chargers.orchestrator_user_events.data.ChargersOrchestratorUserEventsApi;
import com.yandex.go.chargers.orchestrator_user_events.data.model.ChargersOrchestratorCreateEventRequest;
import com.yandex.go.chargers.orchestrator_user_events.data.model.OrchestratorUserEventDto;
import defpackage.bo5;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.orchestrator_user_events.domain.ChargersOrchestratorUserEventsInteractorImpl$sendUserEvent$1", f = "ChargersOrchestratorUserEventsInteractorImpl.kt", l = {27, 29}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOrchestratorUserEventsInteractorImpl$sendUserEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOrchestratorUserEventType $eventType;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOrchestratorUserEventsInteractorImpl$sendUserEvent$1(b bVar, ChargersOrchestratorUserEventType chargersOrchestratorUserEventType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$eventType = chargersOrchestratorUserEventType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOrchestratorUserEventsInteractorImpl$sendUserEvent$1(this.this$0, this.$eventType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOrchestratorUserEventsInteractorImpl$sendUserEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersOrchestratorUserEventType chargersOrchestratorUserEventType;
        b bVar;
        ChargersOrchestratorCreateEventRequest chargersOrchestratorCreateEventRequest;
        bo5 bo5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    b bVar2 = this.this$0;
                    ChargersOrchestratorUserEventType chargersOrchestratorUserEventType2 = this.$eventType;
                    a aVar = bVar2.a;
                    this.L$0 = bVar2;
                    this.L$1 = chargersOrchestratorUserEventType2;
                    this.label = 1;
                    Object a = aVar.a(chargersOrchestratorUserEventType2, this);
                    if (a != coroutineSingletons) {
                        bVar = bVar2;
                        obj = a;
                        r1 = chargersOrchestratorUserEventType2;
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        chargersOrchestratorUserEventType = (ChargersOrchestratorUserEventType) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            return zy11Var;
                        } catch (Throwable th2) {
                            th = th2;
                            jst.e.k(th, "Failed to send orchestrator user event: " + chargersOrchestratorUserEventType);
                            return zy11Var;
                        }
                    }
                    ChargersOrchestratorUserEventType chargersOrchestratorUserEventType3 = (ChargersOrchestratorUserEventType) this.L$1;
                    bVar = (b) this.L$0;
                    kotlin.b.b(obj);
                    r1 = chargersOrchestratorUserEventType3;
                }
                Object d = ru.yandex.taxi.network.api.a.d(((ChargersOrchestratorUserEventsApi) bo5Var.a.get()).a(chargersOrchestratorCreateEventRequest), this);
                if (d != coroutineSingletons) {
                    d = zy11Var;
                }
                return d == coroutineSingletons ? coroutineSingletons : zy11Var;
            } catch (Throwable th3) {
                th = th3;
                chargersOrchestratorUserEventType = r1;
                jst.e.k(th, "Failed to send orchestrator user event: " + chargersOrchestratorUserEventType);
                return zy11Var;
            }
            chargersOrchestratorCreateEventRequest = new ChargersOrchestratorCreateEventRequest(Collections.singletonList((OrchestratorUserEventDto) obj));
            bo5Var = bVar.b;
            this.L$0 = r1;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
