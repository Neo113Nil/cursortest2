package com.yandex.go.taxi.summary.mobilityhub.experiment;

import defpackage.h2v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment;", "expV2", "Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubVerticalOnSummaryExperiment;", "expV1", "Lh2v;", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment;Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubVerticalOnSummaryExperiment;)Lh2v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.experiment.HubVerticalOnSummaryExperimentRepository$configFlow$1", f = "HubVerticalOnSummaryExperimentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubVerticalOnSummaryExperimentRepository$configFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubVerticalOnSummaryExperimentRepository$configFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HubVerticalOnSummaryExperimentRepository$configFlow$1 hubVerticalOnSummaryExperimentRepository$configFlow$1 = new HubVerticalOnSummaryExperimentRepository$configFlow$1(this.this$0, (Continuation) obj3);
        hubVerticalOnSummaryExperimentRepository$configFlow$1.L$0 = (HubV2VerticalOnSummaryExperiment) obj;
        hubVerticalOnSummaryExperimentRepository$configFlow$1.L$1 = (HubVerticalOnSummaryExperiment) obj2;
        return hubVerticalOnSummaryExperimentRepository$configFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HubV2VerticalOnSummaryExperiment hubV2VerticalOnSummaryExperiment = (HubV2VerticalOnSummaryExperiment) this.L$0;
        HubVerticalOnSummaryExperiment hubVerticalOnSummaryExperiment = (HubVerticalOnSummaryExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        h2v c = g.c(hubV2VerticalOnSummaryExperiment);
        if (c != null) {
            return c;
        }
        this.this$0.getClass();
        return g.b(hubVerticalOnSummaryExperiment);
    }
}
