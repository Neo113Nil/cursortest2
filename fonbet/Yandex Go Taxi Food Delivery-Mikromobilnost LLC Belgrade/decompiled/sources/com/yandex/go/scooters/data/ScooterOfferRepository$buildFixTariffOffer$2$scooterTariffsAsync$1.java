package com.yandex.go.scooters.data;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p6p0;
import defpackage.qko0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lb4p0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1", f = "ScootersOfferRepository.kt", l = {157, HProv.PP_LICENSE, 159, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $insuranceExperimentAsync;
    final /* synthetic */ noh $insurancePriceTextAsync;
    final /* synthetic */ noh $preOfferExperimentsAsync;
    final /* synthetic */ CreateOffersV1Response $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1(a aVar, CreateOffersV1Response createOffersV1Response, noh nohVar, noh nohVar2, noh nohVar3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = createOffersV1Response;
        this.$preOfferExperimentsAsync = nohVar;
        this.$insuranceExperimentAsync = nohVar2;
        this.$insurancePriceTextAsync = nohVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1(this.this$0, this.$response, this.$preOfferExperimentsAsync, this.$insuranceExperimentAsync, this.$insurancePriceTextAsync, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CreateOffersV1Response createOffersV1Response;
        com.yandex.go.scooters.data.mapper.a aVar;
        qko0 qko0Var;
        CreateOffersV1Response createOffersV1Response2;
        Object k;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment;
        com.yandex.go.scooters.data.mapper.a aVar2;
        qko0 qko0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.data.mapper.a aVar3 = this.this$0.b;
            createOffersV1Response = this.$response;
            noh nohVar = this.$preOfferExperimentsAsync;
            this.L$0 = aVar3;
            this.L$1 = createOffersV1Response;
            this.label = 1;
            Object k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
                aVar = aVar3;
                obj = k2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) this.L$3;
                qko0 qko0Var3 = (qko0) this.L$2;
                createOffersV1Response2 = (CreateOffersV1Response) this.L$1;
                com.yandex.go.scooters.data.mapper.a aVar4 = (com.yandex.go.scooters.data.mapper.a) this.L$0;
                kotlin.b.b(obj);
                qko0Var2 = qko0Var3;
                aVar2 = aVar4;
                scootersClientInsuranceNewExperiment = scootersClientInsuranceNewExperiment2;
                p6p0 a = this.this$0.f.a();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                Object f = aVar2.f(createOffersV1Response2, qko0Var2, scootersClientInsuranceNewExperiment, (CharSequence) obj, a, null, this);
                return f != coroutineSingletons ? coroutineSingletons : f;
            }
            qko0Var = (qko0) this.L$2;
            createOffersV1Response2 = (CreateOffersV1Response) this.L$1;
            aVar = (com.yandex.go.scooters.data.mapper.a) this.L$0;
            kotlin.b.b(obj);
            ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment3 = (ScootersClientInsuranceNewExperiment) obj;
            noh nohVar2 = this.$insurancePriceTextAsync;
            this.L$0 = aVar;
            this.L$1 = createOffersV1Response2;
            this.L$2 = qko0Var;
            this.L$3 = scootersClientInsuranceNewExperiment3;
            this.label = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
                scootersClientInsuranceNewExperiment = scootersClientInsuranceNewExperiment3;
                obj = k;
                aVar2 = aVar;
                qko0Var2 = qko0Var;
                p6p0 a2 = this.this$0.f.a();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                Object f2 = aVar2.f(createOffersV1Response2, qko0Var2, scootersClientInsuranceNewExperiment, (CharSequence) obj, a2, null, this);
                if (f2 != coroutineSingletons) {
                }
            }
        }
        createOffersV1Response = (CreateOffersV1Response) this.L$1;
        aVar = (com.yandex.go.scooters.data.mapper.a) this.L$0;
        kotlin.b.b(obj);
        qko0 qko0Var4 = (qko0) obj;
        noh nohVar3 = this.$insuranceExperimentAsync;
        this.L$0 = aVar;
        this.L$1 = createOffersV1Response;
        this.L$2 = qko0Var4;
        this.label = 2;
        Object k3 = nohVar3.k(this);
        if (k3 != coroutineSingletons) {
            CreateOffersV1Response createOffersV1Response3 = createOffersV1Response;
            qko0Var = qko0Var4;
            obj = k3;
            createOffersV1Response2 = createOffersV1Response3;
            ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment32 = (ScootersClientInsuranceNewExperiment) obj;
            noh nohVar22 = this.$insurancePriceTextAsync;
            this.L$0 = aVar;
            this.L$1 = createOffersV1Response2;
            this.L$2 = qko0Var;
            this.L$3 = scootersClientInsuranceNewExperiment32;
            this.label = 3;
            k = nohVar22.k(this);
            if (k != coroutineSingletons) {
            }
        }
    }
}
