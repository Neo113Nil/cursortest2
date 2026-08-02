package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p6p0;
import defpackage.qco0;
import defpackage.qko0;
import defpackage.sco0;
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
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1", f = "ScootersOfferRepository.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384, 81, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $insuranceExperimentAsync;
    final /* synthetic */ noh $insurancePriceTextAsync;
    final /* synthetic */ noh $passesAsync;
    final /* synthetic */ noh $preOfferExperimentsAsync;
    final /* synthetic */ CreateOffersV1Response $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1(a aVar, CreateOffersV1Response createOffersV1Response, noh nohVar, noh nohVar2, noh nohVar3, noh nohVar4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = createOffersV1Response;
        this.$preOfferExperimentsAsync = nohVar;
        this.$insuranceExperimentAsync = nohVar2;
        this.$insurancePriceTextAsync = nohVar3;
        this.$passesAsync = nohVar4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1(this.this$0, this.$response, this.$preOfferExperimentsAsync, this.$insuranceExperimentAsync, this.$insurancePriceTextAsync, this.$passesAsync, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k;
        com.yandex.go.scooters.data.mapper.a aVar;
        CreateOffersV1Response createOffersV1Response;
        Object k2;
        CreateOffersV1Response createOffersV1Response2;
        qko0 qko0Var;
        Object k3;
        qko0 qko0Var2;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment;
        Object k4;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2;
        qko0 qko0Var3;
        CharSequence charSequence;
        CreateOffersV1Response createOffersV1Response3;
        p6p0 p6p0Var;
        com.yandex.go.scooters.data.mapper.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.data.mapper.a aVar3 = this.this$0.b;
            CreateOffersV1Response createOffersV1Response4 = this.$response;
            noh nohVar = this.$preOfferExperimentsAsync;
            this.L$0 = aVar3;
            this.L$1 = createOffersV1Response4;
            this.label = 1;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                aVar = aVar3;
                createOffersV1Response = createOffersV1Response4;
            }
        }
        if (i != 1) {
            if (i == 2) {
                qko0Var = (qko0) this.L$2;
                CreateOffersV1Response createOffersV1Response5 = (CreateOffersV1Response) this.L$1;
                com.yandex.go.scooters.data.mapper.a aVar4 = (com.yandex.go.scooters.data.mapper.a) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar4;
                createOffersV1Response2 = createOffersV1Response5;
                k2 = obj;
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment3 = (ScootersClientInsuranceNewExperiment) k2;
                noh nohVar2 = this.$insurancePriceTextAsync;
                this.L$0 = aVar;
                this.L$1 = createOffersV1Response2;
                this.L$2 = qko0Var;
                this.L$3 = scootersClientInsuranceNewExperiment3;
                this.label = 3;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    qko0Var2 = qko0Var;
                    scootersClientInsuranceNewExperiment = scootersClientInsuranceNewExperiment3;
                    CharSequence charSequence2 = (CharSequence) k3;
                    p6p0 a = this.this$0.f.a();
                    noh nohVar3 = this.$passesAsync;
                    this.L$0 = aVar;
                    this.L$1 = createOffersV1Response2;
                    this.L$2 = qko0Var2;
                    this.L$3 = scootersClientInsuranceNewExperiment;
                    this.L$4 = charSequence2;
                    this.L$5 = a;
                    this.label = 4;
                    k4 = nohVar3.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6p0 p6p0Var2 = (p6p0) this.L$5;
                CharSequence charSequence3 = (CharSequence) this.L$4;
                scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) this.L$3;
                qko0 qko0Var4 = (qko0) this.L$2;
                CreateOffersV1Response createOffersV1Response6 = (CreateOffersV1Response) this.L$1;
                com.yandex.go.scooters.data.mapper.a aVar5 = (com.yandex.go.scooters.data.mapper.a) this.L$0;
                kotlin.b.b(obj);
                aVar2 = aVar5;
                createOffersV1Response3 = createOffersV1Response6;
                p6p0Var = p6p0Var2;
                qko0Var3 = qko0Var4;
                charSequence = charSequence3;
                k4 = obj;
                sco0 sco0Var = (sco0) k4;
                qco0 qco0Var = !(sco0Var instanceof qco0) ? (qco0) sco0Var : null;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 5;
                qco0 qco0Var2 = qco0Var;
                Object f = aVar2.f(createOffersV1Response3, qko0Var3, scootersClientInsuranceNewExperiment2, charSequence, p6p0Var, qco0Var2, this);
                return f != coroutineSingletons ? coroutineSingletons : f;
            }
            scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) this.L$3;
            qko0 qko0Var5 = (qko0) this.L$2;
            CreateOffersV1Response createOffersV1Response7 = (CreateOffersV1Response) this.L$1;
            com.yandex.go.scooters.data.mapper.a aVar6 = (com.yandex.go.scooters.data.mapper.a) this.L$0;
            kotlin.b.b(obj);
            aVar = aVar6;
            createOffersV1Response2 = createOffersV1Response7;
            qko0Var2 = qko0Var5;
            k3 = obj;
            CharSequence charSequence22 = (CharSequence) k3;
            p6p0 a2 = this.this$0.f.a();
            noh nohVar32 = this.$passesAsync;
            this.L$0 = aVar;
            this.L$1 = createOffersV1Response2;
            this.L$2 = qko0Var2;
            this.L$3 = scootersClientInsuranceNewExperiment;
            this.L$4 = charSequence22;
            this.L$5 = a2;
            this.label = 4;
            k4 = nohVar32.k(this);
            if (k4 != coroutineSingletons) {
                scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment;
                qko0Var3 = qko0Var2;
                charSequence = charSequence22;
                com.yandex.go.scooters.data.mapper.a aVar7 = aVar;
                createOffersV1Response3 = createOffersV1Response2;
                p6p0Var = a2;
                aVar2 = aVar7;
                sco0 sco0Var2 = (sco0) k4;
                if (!(sco0Var2 instanceof qco0)) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 5;
                qco0 qco0Var22 = qco0Var;
                Object f2 = aVar2.f(createOffersV1Response3, qko0Var3, scootersClientInsuranceNewExperiment2, charSequence, p6p0Var, qco0Var22, this);
                if (f2 != coroutineSingletons) {
                }
            }
        }
        createOffersV1Response = (CreateOffersV1Response) this.L$1;
        com.yandex.go.scooters.data.mapper.a aVar8 = (com.yandex.go.scooters.data.mapper.a) this.L$0;
        kotlin.b.b(obj);
        aVar = aVar8;
        k = obj;
        qko0 qko0Var6 = (qko0) k;
        noh nohVar4 = this.$insuranceExperimentAsync;
        this.L$0 = aVar;
        this.L$1 = createOffersV1Response;
        this.L$2 = qko0Var6;
        this.label = 2;
        k2 = nohVar4.k(this);
        if (k2 != coroutineSingletons) {
            createOffersV1Response2 = createOffersV1Response;
            qko0Var = qko0Var6;
            ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment32 = (ScootersClientInsuranceNewExperiment) k2;
            noh nohVar22 = this.$insurancePriceTextAsync;
            this.L$0 = aVar;
            this.L$1 = createOffersV1Response2;
            this.L$2 = qko0Var;
            this.L$3 = scootersClientInsuranceNewExperiment32;
            this.label = 3;
            k3 = nohVar22.k(this);
            if (k3 != coroutineSingletons) {
            }
        }
    }
}
