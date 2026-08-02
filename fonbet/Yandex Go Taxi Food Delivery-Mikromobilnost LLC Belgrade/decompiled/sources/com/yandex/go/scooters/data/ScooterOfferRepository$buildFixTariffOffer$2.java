package com.yandex.go.scooters.data;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import defpackage.c5p0;
import defpackage.cmt;
import defpackage.cyn0;
import defpackage.fpm0;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qoh;
import defpackage.r7p0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Lcpm0;", "Lb4p0;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$buildFixTariffOffer$2", f = "ScootersOfferRepository.kt", l = {139, 142, 151, 165, 166}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$buildFixTariffOffer$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $destination;
    final /* synthetic */ boolean $instantStart;
    final /* synthetic */ ScootersInsuranceType $insuranceType;
    final /* synthetic */ String $openReason;
    final /* synthetic */ m6a0 $paymentMethod;
    final /* synthetic */ List<r7p0> $vehicleNumbers;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$buildFixTariffOffer$2(a aVar, zzs zzsVar, String str, m6a0 m6a0Var, List list, ScootersInsuranceType scootersInsuranceType, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$destination = zzsVar;
        this.$openReason = str;
        this.$paymentMethod = m6a0Var;
        this.$vehicleNumbers = list;
        this.$insuranceType = scootersInsuranceType;
        this.$instantStart = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScooterOfferRepository$buildFixTariffOffer$2 scooterOfferRepository$buildFixTariffOffer$2 = new ScooterOfferRepository$buildFixTariffOffer$2(this.this$0, this.$destination, this.$openReason, this.$paymentMethod, this.$vehicleNumbers, this.$insuranceType, this.$instantStart, continuation);
        scooterOfferRepository$buildFixTariffOffer$2.L$0 = obj;
        return scooterOfferRepository$buildFixTariffOffer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$buildFixTariffOffer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01a6, code lost:
    
        if (r3 != r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        ScootersOfferApi scootersOfferApi;
        fpm0 fpm0Var;
        Object h;
        ScootersOfferApi scootersOfferApi2;
        Map<String, String> map;
        int i;
        Object a2;
        noh nohVar4;
        noh nohVar5;
        noh nohVar6;
        noh h2;
        Object s;
        Object k;
        Object obj2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$preOfferExperimentsAsync$1(this.this$0, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$insuranceExperimentAsync$1(this.this$0, null), 3);
            qoh h5 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$insurancePriceTextAsync$1(this.this$0, null), 3);
            a aVar = this.this$0;
            ScootersOfferApi scootersOfferApi3 = aVar.a;
            ru.yandex.taxi.scooters.data.a aVar2 = aVar.e;
            this.L$0 = tseVar;
            this.L$1 = h3;
            this.L$2 = h4;
            this.L$3 = h5;
            this.L$4 = scootersOfferApi3;
            this.label = 1;
            a = aVar2.a(true, this);
            if (a != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h4;
                nohVar3 = h5;
                scootersOfferApi = scootersOfferApi3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            scootersOfferApi = (ScootersOfferApi) this.L$4;
            noh nohVar7 = (noh) this.L$3;
            noh nohVar8 = (noh) this.L$2;
            noh nohVar9 = (noh) this.L$1;
            kotlin.b.b(obj);
            nohVar = nohVar9;
            nohVar2 = nohVar8;
            nohVar3 = nohVar7;
            a = obj;
        } else {
            if (i2 == 2) {
                map = (Map) this.L$6;
                ScootersOfferApi scootersOfferApi4 = (ScootersOfferApi) this.L$5;
                fpm0 fpm0Var2 = (fpm0) this.L$4;
                nohVar3 = (noh) this.L$3;
                nohVar2 = (noh) this.L$2;
                nohVar = (noh) this.L$1;
                kotlin.b.b(obj);
                fpm0Var = fpm0Var2;
                scootersOfferApi2 = scootersOfferApi4;
                h = obj;
                zzs a3 = ((mo21) h).a();
                c5p0 c5p0Var = new c5p0(this.$destination);
                CreateOfferType createOfferType = CreateOfferType.FIX_POINT;
                cyn0 b = this.this$0.g.b();
                String str = b == null ? b.a : null;
                String str2 = this.$openReason;
                m6a0 m6a0Var = this.$paymentMethod;
                List<r7p0> list = this.$vehicleNumbers;
                ScootersInsuranceType scootersInsuranceType = this.$insuranceType;
                boolean z = this.$instantStart;
                fpm0Var.getClass();
                cmt<CreateOffersV1Response> b2 = scootersOfferApi2.b(map, fpm0.a(str2, a3, m6a0Var, list, createOfferType, c5p0Var, scootersInsuranceType, str, z));
                this.L$0 = tseVar;
                this.L$1 = nohVar;
                this.L$2 = nohVar2;
                this.L$3 = nohVar3;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                i = 3;
                this.label = 3;
                a2 = ru.yandex.taxi.network.api.a.a(b2, null, this);
                if (a2 != coroutineSingletons) {
                    nohVar4 = nohVar3;
                    nohVar5 = nohVar2;
                    nohVar6 = nohVar;
                    CreateOffersV1Response createOffersV1Response = (CreateOffersV1Response) a2;
                    qoh h6 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$scooterOffersAsync$1(this.this$0, createOffersV1Response, null), i);
                    h2 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1(this.this$0, createOffersV1Response, nohVar6, nohVar5, nohVar4, null), i);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = h2;
                    this.label = 4;
                    s = h6.s(this);
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.L$7;
                    kotlin.b.b(obj);
                    k = obj;
                    return new Pair(obj2, k);
                }
                h2 = (noh) this.L$6;
                kotlin.b.b(obj);
                s = obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = s;
                this.label = 5;
                k = h2.k(this);
                if (k != coroutineSingletons) {
                    obj2 = s;
                    return new Pair(obj2, k);
                }
                return coroutineSingletons;
            }
            noh nohVar10 = (noh) this.L$3;
            noh nohVar11 = (noh) this.L$2;
            noh nohVar12 = (noh) this.L$1;
            kotlin.b.b(obj);
            nohVar4 = nohVar10;
            i = 3;
            nohVar5 = nohVar11;
            nohVar6 = nohVar12;
            a2 = obj;
            CreateOffersV1Response createOffersV1Response2 = (CreateOffersV1Response) a2;
            qoh h62 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$scooterOffersAsync$1(this.this$0, createOffersV1Response2, null), i);
            h2 = tje.h(tseVar, null, null, new ScooterOfferRepository$buildFixTariffOffer$2$scooterTariffsAsync$1(this.this$0, createOffersV1Response2, nohVar6, nohVar5, nohVar4, null), i);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = h2;
            this.label = 4;
            s = h62.s(this);
        }
        Map<String, String> map2 = (Map) a;
        a aVar3 = this.this$0;
        fpm0Var = aVar3.d;
        po21 po21Var = aVar3.c;
        this.L$0 = tseVar;
        this.L$1 = nohVar;
        this.L$2 = nohVar2;
        this.L$3 = nohVar3;
        this.L$4 = fpm0Var;
        this.L$5 = scootersOfferApi;
        this.L$6 = map2;
        this.label = 2;
        h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
        if (h != coroutineSingletons) {
            scootersOfferApi2 = scootersOfferApi;
            map = map2;
            zzs a32 = ((mo21) h).a();
            c5p0 c5p0Var2 = new c5p0(this.$destination);
            CreateOfferType createOfferType2 = CreateOfferType.FIX_POINT;
            cyn0 b3 = this.this$0.g.b();
            if (b3 == null) {
            }
            String str22 = this.$openReason;
            m6a0 m6a0Var2 = this.$paymentMethod;
            List<r7p0> list2 = this.$vehicleNumbers;
            ScootersInsuranceType scootersInsuranceType2 = this.$insuranceType;
            boolean z2 = this.$instantStart;
            fpm0Var.getClass();
            cmt<CreateOffersV1Response> b22 = scootersOfferApi2.b(map, fpm0.a(str22, a32, m6a0Var2, list2, createOfferType2, c5p0Var2, scootersInsuranceType2, str, z2));
            this.L$0 = tseVar;
            this.L$1 = nohVar;
            this.L$2 = nohVar2;
            this.L$3 = nohVar3;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            i = 3;
            this.label = 3;
            a2 = ru.yandex.taxi.network.api.a.a(b22, null, this);
            if (a2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
