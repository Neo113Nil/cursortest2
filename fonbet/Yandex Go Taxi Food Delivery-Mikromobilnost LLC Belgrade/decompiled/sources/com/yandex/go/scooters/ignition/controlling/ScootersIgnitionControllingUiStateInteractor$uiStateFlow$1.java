package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.drn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqn0;
import defpackage.uqn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ignitionEnabled", "Ldrn0;", "optionsStateHolder", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment;", "experiment", "Lrqn0;", "<anonymous>", "(ZLdrn0;Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment;)Lrqn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiStateInteractor$uiStateFlow$1", f = "ScootersIgnitionControllingUiStateInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ sqn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiStateInteractor$uiStateFlow$1(sqn0 sqn0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = sqn0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ScootersIgnitionControllingUiStateInteractor$uiStateFlow$1 scootersIgnitionControllingUiStateInteractor$uiStateFlow$1 = new ScootersIgnitionControllingUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        scootersIgnitionControllingUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        scootersIgnitionControllingUiStateInteractor$uiStateFlow$1.L$0 = (drn0) obj2;
        scootersIgnitionControllingUiStateInteractor$uiStateFlow$1.L$1 = (ScootersIgnitionExperiment) obj3;
        return scootersIgnitionControllingUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        drn0 drn0Var = (drn0) this.L$0;
        ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) this.L$1;
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
        sqn0 sqn0Var = this.this$0;
        uqn0 uqn0Var = sqn0Var.e;
        boolean z2 = !sqn0Var.b.a();
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = z;
        this.label = 1;
        uqn0Var.getClass();
        Object n = bvf0.n(new ScootersIgnitionControllingUiStateMapper$mapToUiState$2(uqn0Var, drn0Var, z2, z, scootersIgnitionExperiment, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
