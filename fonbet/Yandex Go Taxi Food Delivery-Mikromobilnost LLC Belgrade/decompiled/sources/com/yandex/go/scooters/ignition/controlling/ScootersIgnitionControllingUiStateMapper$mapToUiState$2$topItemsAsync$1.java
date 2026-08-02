package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.bvf0;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lqqn0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiStateMapper$mapToUiState$2$topItemsAsync$1", f = "ScootersIgnitionControllingUiStateMapper.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiStateMapper$mapToUiState$2$topItemsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    final /* synthetic */ boolean $firstShowing;
    int label;
    final /* synthetic */ uqn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiStateMapper$mapToUiState$2$topItemsAsync$1(uqn0 uqn0Var, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = uqn0Var;
        this.$firstShowing = z;
        this.$experiment = scootersIgnitionExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingUiStateMapper$mapToUiState$2$topItemsAsync$1(this.this$0, this.$experiment, continuation, this.$firstShowing);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingUiStateMapper$mapToUiState$2$topItemsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        uqn0 uqn0Var = this.this$0;
        boolean z = this.$firstShowing;
        ScootersIgnitionExperiment scootersIgnitionExperiment = this.$experiment;
        this.label = 1;
        uqn0Var.getClass();
        Object n = bvf0.n(new ScootersIgnitionControllingUiStateMapper$mapToTopItems$2(uqn0Var, scootersIgnitionExperiment, null, z), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
