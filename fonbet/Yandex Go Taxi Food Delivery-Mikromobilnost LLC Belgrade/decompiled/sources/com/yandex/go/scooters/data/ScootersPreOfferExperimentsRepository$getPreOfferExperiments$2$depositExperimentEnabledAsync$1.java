package com.yandex.go.scooters.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rko0;
import defpackage.tdn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$depositExperimentEnabledAsync$1", f = "ScootersPreOfferExperimentsRepository.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$depositExperimentEnabledAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ rko0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$depositExperimentEnabledAsync$1(rko0 rko0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rko0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$depositExperimentEnabledAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$depositExperimentEnabledAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tdn0 tdn0Var = this.this$0.b;
        this.label = 1;
        Object f = tdn0Var.a.f(this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
