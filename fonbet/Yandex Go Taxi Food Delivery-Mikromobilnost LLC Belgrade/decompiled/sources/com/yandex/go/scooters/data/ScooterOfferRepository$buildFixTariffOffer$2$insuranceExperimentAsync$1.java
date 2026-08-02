package com.yandex.go.scooters.data;

import defpackage.m7n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$buildFixTariffOffer$2$insuranceExperimentAsync$1", f = "ScootersOfferRepository.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$buildFixTariffOffer$2$insuranceExperimentAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$buildFixTariffOffer$2$insuranceExperimentAsync$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScooterOfferRepository$buildFixTariffOffer$2$insuranceExperimentAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$buildFixTariffOffer$2$insuranceExperimentAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        m7n0 m7n0Var = this.this$0.k;
        this.label = 1;
        Object b = m7n0Var.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
