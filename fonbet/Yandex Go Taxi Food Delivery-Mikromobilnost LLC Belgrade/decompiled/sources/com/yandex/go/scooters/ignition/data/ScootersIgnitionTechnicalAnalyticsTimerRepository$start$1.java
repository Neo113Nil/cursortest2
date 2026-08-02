package com.yandex.go.scooters.ignition.data;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "ignitionEnabled", "experiment", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTimerRepository$start$1", f = "ScootersIgnitionTechnicalAnalyticsTimerRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionTechnicalAnalyticsTimerRepository$start$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public ScootersIgnitionTechnicalAnalyticsTimerRepository$start$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ScootersIgnitionTechnicalAnalyticsTimerRepository$start$1 scootersIgnitionTechnicalAnalyticsTimerRepository$start$1 = new ScootersIgnitionTechnicalAnalyticsTimerRepository$start$1(3, (Continuation) obj3);
        scootersIgnitionTechnicalAnalyticsTimerRepository$start$1.Z$0 = booleanValue;
        scootersIgnitionTechnicalAnalyticsTimerRepository$start$1.L$0 = (ScootersIgnitionExperiment) obj2;
        return scootersIgnitionTechnicalAnalyticsTimerRepository$start$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z && scootersIgnitionExperiment.m);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
