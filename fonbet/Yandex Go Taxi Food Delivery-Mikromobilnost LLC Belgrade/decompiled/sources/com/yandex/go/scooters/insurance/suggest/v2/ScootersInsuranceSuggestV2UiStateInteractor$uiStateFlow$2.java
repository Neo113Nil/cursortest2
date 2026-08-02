package com.yandex.go.scooters.insurance.suggest.v2;

import defpackage.bvf0;
import defpackage.dms;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tun0;
import defpackage.ysn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$FullInsuranceSuggestion$UpsaleWindow;", "insuranceUpsaleWindow", "Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment;", "localizedExperiment", "", "isLoading", "Lsun0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$FullInsuranceSuggestion$UpsaleWindow;Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment;Z)Lsun0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2", f = "ScootersInsuranceSuggestV2UiStateInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2 extends SuspendLambda implements dms {
    final /* synthetic */ fef $currencyRules;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ tun0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2(tun0 tun0Var, fef fefVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = tun0Var;
        this.$currencyRules = fefVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        ScootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2 scootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2 = new ScootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2(this.this$0, this.$currencyRules, (Continuation) obj5);
        scootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2.L$0 = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow) obj2;
        scootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2.L$1 = (ScootersClientInsuranceNewExperiment) obj3;
        scootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2.Z$0 = booleanValue;
        return scootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow) this.L$0;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        ysn0 ysn0Var = this.this$0.c.a().g;
        g gVar = this.this$0.d;
        fef fefVar = this.$currencyRules;
        long j = ysn0Var.b;
        long j2 = ysn0Var.c;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.Z$0 = z;
        this.label = 1;
        gVar.getClass();
        Object n = bvf0.n(new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2(gVar, upsaleWindow, scootersClientInsuranceNewExperiment, fefVar, z, j2, j, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
