package com.yandex.go.scooters.ignition.domain;

import defpackage.arn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1", f = "ScootersIgnitionExperimentListenerInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $experimentEnabled;
    int label;
    final /* synthetic */ arn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1(arn0 arn0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = arn0Var;
        this.$experimentEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1(this.this$0, this.$experimentEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1 scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1 = (ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.scooters.ignition.data.d dVar = (com.yandex.go.scooters.ignition.data.d) this.this$0.f.get();
        boolean z = this.$experimentEnabled;
        dVar.getClass();
        com.yandex.go.scooters.ignition.data.d.d(dVar, z, false, 2);
        return zy11.a;
    }
}
