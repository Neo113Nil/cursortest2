package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.f9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uqn0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiStateMapper$mapToUiState$2$buttonTextAsync$1", f = "ScootersIgnitionControllingUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiStateMapper$mapToUiState$2$buttonTextAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    final /* synthetic */ boolean $firstShowing;
    final /* synthetic */ boolean $ignitionEnabled;
    int label;
    final /* synthetic */ uqn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiStateMapper$mapToUiState$2$buttonTextAsync$1(uqn0 uqn0Var, boolean z, boolean z2, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uqn0Var;
        this.$firstShowing = z;
        this.$ignitionEnabled = z2;
        this.$experiment = scootersIgnitionExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingUiStateMapper$mapToUiState$2$buttonTextAsync$1(this.this$0, this.$firstShowing, this.$ignitionEnabled, this.$experiment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingUiStateMapper$mapToUiState$2$buttonTextAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        uqn0 uqn0Var = this.this$0;
        boolean z = this.$firstShowing;
        boolean z2 = this.$ignitionEnabled;
        ScootersIgnitionExperiment scootersIgnitionExperiment = this.$experiment;
        uqn0Var.getClass();
        return ru.yandex.taxi.widget.c.f(uqn0Var.b, f9s.e(z ? scootersIgnitionExperiment.r.a.c : z2 ? scootersIgnitionExperiment.r.b.c.b : scootersIgnitionExperiment.r.b.c.a, scootersIgnitionExperiment), false, null, 14).toString();
    }
}
