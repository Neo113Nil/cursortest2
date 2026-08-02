package com.yandex.go.scooters.insurance.suggest.v2;

import defpackage.c6z;
import defpackage.f9s;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vun0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$subtitleAsync$1", f = "ScootersInsuranceSuggestV2UiStateMapper.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$subtitleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ long $insurancePriceCoverage;
    final /* synthetic */ ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow $insuranceUpsaleWindow;
    final /* synthetic */ c6z $localizedExperiment;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$subtitleAsync$1(g gVar, ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow, c6z c6zVar, fef fefVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$insuranceUpsaleWindow = upsaleWindow;
        this.$localizedExperiment = c6zVar;
        this.$currencyRules = fefVar;
        this.$insurancePriceCoverage = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$subtitleAsync$1(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, this.$insurancePriceCoverage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$subtitleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        g gVar = this.this$0;
        ru.yandex.taxi.widget.c cVar = gVar.b;
        FormattedText a = f9s.a(f9s.c(gVar.a, this.$currencyRules, f9s.e(this.$insuranceUpsaleWindow.c, this.$localizedExperiment)), new vun0(this.this$0, this.$insurancePriceCoverage, 1));
        this.label = 1;
        Object e = ru.yandex.taxi.widget.c.e(cVar, a, null, false, this, 30);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
