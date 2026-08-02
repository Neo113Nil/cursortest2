package com.yandex.go.scooters.data.mapper;

import defpackage.epm0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.h5w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScooterOfferMapper$mapToOptionItemConfig$2$trailLabelAsync$1", f = "ScooterOfferMapper.kt", l = {531}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferMapper$mapToOptionItemConfig$2$trailLabelAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ h5w.a $experimentOfferItemConfig;
    final /* synthetic */ ScootersClientInsuranceNewExperiment $insuranceExperiment;
    final /* synthetic */ long $insurancePrice;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferMapper$mapToOptionItemConfig$2$trailLabelAsync$1(a aVar, h5w.a aVar2, ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment, fef fefVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$experimentOfferItemConfig = aVar2;
        this.$insuranceExperiment = scootersClientInsuranceNewExperiment;
        this.$currencyRules = fefVar;
        this.$insurancePrice = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScooterOfferMapper$mapToOptionItemConfig$2$trailLabelAsync$1(this.this$0, this.$experimentOfferItemConfig, this.$insuranceExperiment, this.$currencyRules, this.$insurancePrice, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferMapper$mapToOptionItemConfig$2$trailLabelAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.widget.utils.e eVar = this.this$0.d;
        FormattedText a = f9s.a(f9s.d(f9s.e(this.$experimentOfferItemConfig.c, this.$insuranceExperiment), this.$currencyRules, this.this$0.c, this.$insurancePrice), new epm0(this.this$0, this.$insurancePrice, 2));
        this.label = 1;
        Object t = eVar.t(a, this);
        return t == coroutineSingletons ? coroutineSingletons : t;
    }
}
