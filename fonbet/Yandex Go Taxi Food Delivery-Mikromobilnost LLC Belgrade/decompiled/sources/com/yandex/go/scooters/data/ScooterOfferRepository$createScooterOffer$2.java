package com.yandex.go.scooters.data;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import defpackage.cmt;
import defpackage.cyn0;
import defpackage.d5p0;
import defpackage.fpm0;
import defpackage.hbn0;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qoh;
import defpackage.r7p0;
import defpackage.sco0;
import defpackage.tje;
import defpackage.tse;
import defpackage.two0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhbn0;", "<anonymous>", "(Ltse;)Lhbn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$createScooterOffer$2", f = "ScootersOfferRepository.kt", l = {58, 61, 69, MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256, 90}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$createScooterOffer$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $instantStart;
    final /* synthetic */ ScootersInsuranceType $insuranceType;
    final /* synthetic */ String $openReason;
    final /* synthetic */ m6a0 $paymentMethod;
    final /* synthetic */ d5p0 $tariffFlow;
    final /* synthetic */ List<r7p0> $vehicleNumbers;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$createScooterOffer$2(a aVar, String str, m6a0 m6a0Var, List list, d5p0 d5p0Var, ScootersInsuranceType scootersInsuranceType, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$openReason = str;
        this.$paymentMethod = m6a0Var;
        this.$vehicleNumbers = list;
        this.$tariffFlow = d5p0Var;
        this.$insuranceType = scootersInsuranceType;
        this.$instantStart = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScooterOfferRepository$createScooterOffer$2 scooterOfferRepository$createScooterOffer$2 = new ScooterOfferRepository$createScooterOffer$2(this.this$0, this.$openReason, this.$paymentMethod, this.$vehicleNumbers, this.$tariffFlow, this.$insuranceType, this.$instantStart, continuation);
        scooterOfferRepository$createScooterOffer$2.L$0 = obj;
        return scooterOfferRepository$createScooterOffer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$createScooterOffer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018c, code lost:
    
        if (r10 != r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0255  */
    /* JADX WARN: Type inference failed for: r10v13, types: [noh] */
    /* JADX WARN: Type inference failed for: r3v25, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v15, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v7, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v4, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v4, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v8, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v7, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        qoh qohVar;
        ScootersOfferApi scootersOfferApi;
        qoh qohVar2;
        qoh qohVar3;
        Map<String, String> map;
        fpm0 fpm0Var;
        Object h;
        Object a2;
        qoh qohVar4;
        noh nohVar;
        CreateOffersV1Response createOffersV1Response;
        com.yandex.go.scooters.offers.v2.analytics.a aVar;
        noh h2;
        Object s;
        noh nohVar2;
        noh nohVar3;
        Object k;
        noh nohVar4;
        boolean z;
        noh nohVar5;
        sco0 sco0Var;
        Object k2;
        sco0 sco0Var2;
        List list;
        Object k3;
        List list2;
        com.yandex.go.scooters.offers.v2.analytics.a aVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h3 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$preOfferExperimentsAsync$1(this.this$0, null), 3);
                qoh h4 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$insuranceExperimentAsync$1(this.this$0, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$insurancePriceTextAsync$1(this.this$0, null), 3);
                a aVar3 = this.this$0;
                ScootersOfferApi scootersOfferApi2 = aVar3.a;
                ru.yandex.taxi.scooters.data.a aVar4 = aVar3.e;
                this.L$0 = tseVar;
                this.L$1 = h3;
                this.L$2 = h4;
                this.L$3 = h5;
                this.L$4 = scootersOfferApi2;
                this.label = 1;
                a = aVar4.a(true, this);
                if (a != coroutineSingletons) {
                    qohVar = h5;
                    scootersOfferApi = scootersOfferApi2;
                    qohVar2 = h3;
                    qohVar3 = h4;
                    map = (Map) a;
                    a aVar5 = this.this$0;
                    fpm0Var = aVar5.d;
                    po21 po21Var = aVar5.c;
                    this.L$0 = tseVar;
                    this.L$1 = qohVar2;
                    this.L$2 = qohVar3;
                    this.L$3 = qohVar;
                    this.L$4 = fpm0Var;
                    this.L$5 = scootersOfferApi;
                    this.L$6 = map;
                    this.label = 2;
                    h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
                    break;
                }
                return coroutineSingletons;
            case 1:
                ScootersOfferApi scootersOfferApi3 = (ScootersOfferApi) this.L$4;
                ?? r6 = (noh) this.L$3;
                ?? r7 = (noh) this.L$2;
                ?? r8 = (noh) this.L$1;
                kotlin.b.b(obj);
                qohVar2 = r8;
                qohVar3 = r7;
                qohVar = r6;
                scootersOfferApi = scootersOfferApi3;
                a = obj;
                map = (Map) a;
                a aVar52 = this.this$0;
                fpm0Var = aVar52.d;
                po21 po21Var2 = aVar52.c;
                this.L$0 = tseVar;
                this.L$1 = qohVar2;
                this.L$2 = qohVar3;
                this.L$3 = qohVar;
                this.L$4 = fpm0Var;
                this.L$5 = scootersOfferApi;
                this.L$6 = map;
                this.label = 2;
                h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var2).h(this);
                break;
            case 2:
                map = (Map) this.L$6;
                scootersOfferApi = (ScootersOfferApi) this.L$5;
                fpm0 fpm0Var2 = (fpm0) this.L$4;
                ?? r82 = (noh) this.L$3;
                ?? r9 = (noh) this.L$2;
                ?? r10 = (noh) this.L$1;
                kotlin.b.b(obj);
                fpm0Var = fpm0Var2;
                qohVar = r82;
                qohVar3 = r9;
                qohVar2 = r10;
                h = obj;
                zzs a3 = ((mo21) h).a();
                cyn0 b = this.this$0.g.b();
                String str = b != null ? b.a : null;
                String str2 = this.$openReason;
                m6a0 m6a0Var = this.$paymentMethod;
                List<r7p0> list3 = this.$vehicleNumbers;
                d5p0 d5p0Var = this.$tariffFlow;
                ScootersInsuranceType scootersInsuranceType = this.$insuranceType;
                boolean z2 = this.$instantStart;
                fpm0Var.getClass();
                cmt<CreateOffersV1Response> b2 = scootersOfferApi.b(map, fpm0.a(str2, a3, m6a0Var, list3, null, d5p0Var, scootersInsuranceType, str, z2));
                this.L$0 = tseVar;
                this.L$1 = qohVar2;
                this.L$2 = qohVar3;
                this.L$3 = qohVar;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                a2 = ru.yandex.taxi.network.api.a.a(b2, null, this);
                if (a2 != coroutineSingletons) {
                    qoh qohVar5 = qohVar2;
                    qohVar4 = qohVar;
                    nohVar = qohVar5;
                    createOffersV1Response = (CreateOffersV1Response) a2;
                    com.yandex.go.scooters.offers.v2.analytics.c cVar = this.this$0.i;
                    aVar = cVar.c;
                    if (aVar != null) {
                        cVar.c = com.yandex.go.scooters.offers.v2.analytics.a.a(aVar, null, 0L, 0L, System.currentTimeMillis(), 0L, 0L, 119);
                    }
                    qoh h6 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$passesAsync$1(this.this$0, createOffersV1Response, nohVar, null), 3);
                    qoh h7 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$scooterOffersAsync$1(this.this$0, createOffersV1Response, null), 3);
                    qoh h8 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1(this.this$0, createOffersV1Response, nohVar, qohVar3, qohVar4, h6, null), 3);
                    h2 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1(this.this$0, createOffersV1Response, null), 3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = createOffersV1Response;
                    this.L$5 = null;
                    this.L$6 = h7;
                    this.L$7 = h8;
                    this.L$8 = h2;
                    this.label = 4;
                    s = h6.s(this);
                    if (s != coroutineSingletons) {
                        nohVar2 = h7;
                        nohVar3 = h8;
                        sco0 sco0Var3 = (sco0) s;
                        boolean z3 = createOffersV1Response.f;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = nohVar3;
                        this.L$8 = h2;
                        this.L$9 = sco0Var3;
                        this.Z$0 = z3;
                        this.label = 5;
                        k = nohVar2.k(this);
                        if (k != coroutineSingletons) {
                            nohVar4 = h2;
                            z = z3;
                            nohVar5 = nohVar3;
                            sco0Var = sco0Var3;
                            List list4 = (List) k;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = nohVar4;
                            this.L$9 = sco0Var;
                            this.L$10 = list4;
                            this.Z$0 = z;
                            this.label = 6;
                            k2 = nohVar5.k(this);
                            if (k2 != coroutineSingletons) {
                                sco0Var2 = sco0Var;
                                list = list4;
                                List list5 = (List) k2;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = sco0Var2;
                                this.L$10 = list;
                                this.L$11 = list5;
                                this.Z$0 = z;
                                this.label = 7;
                                k3 = nohVar4.k(this);
                                if (k3 != coroutineSingletons) {
                                    list2 = list5;
                                    hbn0 hbn0Var = new hbn0(sco0Var2, z, list, list2, (two0) k3);
                                    com.yandex.go.scooters.offers.v2.analytics.c cVar2 = this.this$0.i;
                                    aVar2 = cVar2.c;
                                    if (aVar2 != null) {
                                        return hbn0Var;
                                    }
                                    cVar2.c = com.yandex.go.scooters.offers.v2.analytics.a.a(aVar2, null, 0L, 0L, 0L, System.currentTimeMillis(), 0L, 111);
                                    return hbn0Var;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                ?? r3 = (noh) this.L$3;
                ?? r62 = (noh) this.L$2;
                nohVar = (noh) this.L$1;
                kotlin.b.b(obj);
                qohVar4 = r3;
                qohVar3 = r62;
                a2 = obj;
                createOffersV1Response = (CreateOffersV1Response) a2;
                com.yandex.go.scooters.offers.v2.analytics.c cVar3 = this.this$0.i;
                aVar = cVar3.c;
                if (aVar != null) {
                }
                qoh h62 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$passesAsync$1(this.this$0, createOffersV1Response, nohVar, null), 3);
                qoh h72 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$scooterOffersAsync$1(this.this$0, createOffersV1Response, null), 3);
                qoh h82 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$scooterTariffsAsync$1(this.this$0, createOffersV1Response, nohVar, qohVar3, qohVar4, h62, null), 3);
                h2 = tje.h(tseVar, null, null, new ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1(this.this$0, createOffersV1Response, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = createOffersV1Response;
                this.L$5 = null;
                this.L$6 = h72;
                this.L$7 = h82;
                this.L$8 = h2;
                this.label = 4;
                s = h62.s(this);
                if (s != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                h2 = (noh) this.L$8;
                nohVar3 = (noh) this.L$7;
                nohVar2 = (noh) this.L$6;
                createOffersV1Response = (CreateOffersV1Response) this.L$4;
                kotlin.b.b(obj);
                s = obj;
                sco0 sco0Var32 = (sco0) s;
                boolean z32 = createOffersV1Response.f;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar3;
                this.L$8 = h2;
                this.L$9 = sco0Var32;
                this.Z$0 = z32;
                this.label = 5;
                k = nohVar2.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                z = this.Z$0;
                sco0Var = (sco0) this.L$9;
                noh nohVar6 = (noh) this.L$8;
                nohVar5 = (noh) this.L$7;
                kotlin.b.b(obj);
                nohVar4 = nohVar6;
                k = obj;
                List list42 = (List) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = nohVar4;
                this.L$9 = sco0Var;
                this.L$10 = list42;
                this.Z$0 = z;
                this.label = 6;
                k2 = nohVar5.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                z = this.Z$0;
                list = (List) this.L$10;
                sco0Var2 = (sco0) this.L$9;
                noh nohVar7 = (noh) this.L$8;
                kotlin.b.b(obj);
                nohVar4 = nohVar7;
                k2 = obj;
                List list52 = (List) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = sco0Var2;
                this.L$10 = list;
                this.L$11 = list52;
                this.Z$0 = z;
                this.label = 7;
                k3 = nohVar4.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                z = this.Z$0;
                List list6 = (List) this.L$11;
                list = (List) this.L$10;
                sco0Var2 = (sco0) this.L$9;
                kotlin.b.b(obj);
                k3 = obj;
                list2 = list6;
                hbn0 hbn0Var2 = new hbn0(sco0Var2, z, list, list2, (two0) k3);
                com.yandex.go.scooters.offers.v2.analytics.c cVar22 = this.this$0.i;
                aVar2 = cVar22.c;
                if (aVar2 != null) {
                }
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
