package com.yandex.go.scooters.insurance.suggest.v2;

import defpackage.agd;
import defpackage.gun0;
import defpackage.hun0;
import defpackage.mvg;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.oun0;
import defpackage.qun0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2Router$content$1$1$1", f = "ScootersInsuranceSuggestV2Router.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestV2Router$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qun0 $action;
    final /* synthetic */ hun0 $innerNavigator;
    final /* synthetic */ d $scootersInsuranceSuggestV2UiActionInteractor;
    final /* synthetic */ oun0 $screenStateRepository;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestV2Router$content$1$1$1(d dVar, qun0 qun0Var, hun0 hun0Var, oun0 oun0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersInsuranceSuggestV2UiActionInteractor = dVar;
        this.$action = qun0Var;
        this.$innerNavigator = hun0Var;
        this.$screenStateRepository = oun0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsuranceSuggestV2Router$content$1$1$1(this.$scootersInsuranceSuggestV2UiActionInteractor, this.$action, this.$innerNavigator, this.$screenStateRepository, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestV2Router$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.$scootersInsuranceSuggestV2UiActionInteractor;
            qun0 qun0Var = this.$action;
            hun0 hun0Var = this.$innerNavigator;
            oun0 oun0Var = this.$screenStateRepository;
            n3o0 n3o0Var = ((gun0) ((agd) this.$this_buildContent).a).a;
            this.label = 1;
            if (dVar.a(qun0Var, hun0Var, oun0Var, n3o0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
