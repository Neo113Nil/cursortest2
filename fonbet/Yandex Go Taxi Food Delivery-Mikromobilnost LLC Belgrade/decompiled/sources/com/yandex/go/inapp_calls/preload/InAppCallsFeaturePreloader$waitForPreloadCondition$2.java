package com.yandex.go.inapp_calls.preload;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "experiment", "Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment;", "prefetch"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.preload.InAppCallsFeaturePreloader$waitForPreloadCondition$2", f = "InAppCallsFeaturePreloader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsFeaturePreloader$waitForPreloadCondition$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public InAppCallsFeaturePreloader$waitForPreloadCondition$2() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        InAppCallsFeaturePreloader$waitForPreloadCondition$2 inAppCallsFeaturePreloader$waitForPreloadCondition$2 = new InAppCallsFeaturePreloader$waitForPreloadCondition$2(3, (Continuation) obj3);
        inAppCallsFeaturePreloader$waitForPreloadCondition$2.L$0 = (InAppCallExperiment) obj;
        inAppCallsFeaturePreloader$waitForPreloadCondition$2.Z$0 = booleanValue;
        return inAppCallsFeaturePreloader$waitForPreloadCondition$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(z && inAppCallExperiment.getB());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
