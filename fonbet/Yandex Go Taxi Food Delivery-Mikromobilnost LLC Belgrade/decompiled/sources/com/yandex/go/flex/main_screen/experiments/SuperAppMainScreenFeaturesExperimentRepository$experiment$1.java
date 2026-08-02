package com.yandex.go.flex.main_screen.experiments;

import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenFeaturesExperimentRepository$experiment$1", f = "SuperAppMainScreenFeaturesExperimentRepository.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenFeaturesExperimentRepository$experiment$1 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenFeaturesExperimentRepository$experiment$1(j jVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperAppMainScreenFeaturesExperimentRepository$experiment$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperAppMainScreenFeaturesExperimentRepository$experiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment2 = new SuperAppMainScreenFeaturesExperiment(0);
            t1b0 e = ((jbh) this.this$0.a).e(superAppMainScreenFeaturesExperiment2);
            this.L$0 = superAppMainScreenFeaturesExperiment2;
            this.label = 1;
            Object b = e.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            superAppMainScreenFeaturesExperiment = superAppMainScreenFeaturesExperiment2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) this.L$0;
            kotlin.b.b(obj);
        }
        if (((SuperAppMainScreenFeaturesExperiment) obj) == superAppMainScreenFeaturesExperiment) {
            return null;
        }
        return obj;
    }
}
