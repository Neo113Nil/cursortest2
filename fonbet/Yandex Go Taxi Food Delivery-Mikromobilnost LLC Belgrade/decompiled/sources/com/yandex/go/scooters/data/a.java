package com.yandex.go.scooters.data;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferParams;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import defpackage.bvf0;
import defpackage.c5p0;
import defpackage.cmt;
import defpackage.d5p0;
import defpackage.fpm0;
import defpackage.m6a0;
import defpackage.m7n0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.r3b1;
import defpackage.r7p0;
import defpackage.r86;
import defpackage.rko0;
import defpackage.tcc;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;
import ru.yandex.taxi.scooters.data.p;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersOfferApi a;
    public final com.yandex.go.scooters.data.mapper.a b;
    public final po21 c;
    public final fpm0 d;
    public final ru.yandex.taxi.scooters.data.a e;
    public final h f;
    public final p g;
    public final rko0 h;
    public final com.yandex.go.scooters.offers.v2.analytics.c i;
    public final com.yandex.go.scooters.insurance.data.b j;
    public final m7n0 k;

    public a(ScootersOfferApi scootersOfferApi, com.yandex.go.scooters.data.mapper.a aVar, po21 po21Var, fpm0 fpm0Var, ru.yandex.taxi.scooters.data.a aVar2, h hVar, p pVar, rko0 rko0Var, com.yandex.go.scooters.offers.v2.analytics.c cVar, com.yandex.go.scooters.insurance.data.b bVar, m7n0 m7n0Var) {
        this.a = scootersOfferApi;
        this.b = aVar;
        this.c = po21Var;
        this.d = fpm0Var;
        this.e = aVar2;
        this.f = hVar;
        this.g = pVar;
        this.h = rko0Var;
        this.i = cVar;
        this.j = bVar;
        this.k = m7n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r7.a(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ScooterOfferRepository$bookScooterOffer$1 scooterOfferRepository$bookScooterOffer$1;
        int i;
        ScootersOfferApi scootersOfferApi;
        r86 r86Var;
        if (continuationImpl instanceof ScooterOfferRepository$bookScooterOffer$1) {
            scooterOfferRepository$bookScooterOffer$1 = (ScooterOfferRepository$bookScooterOffer$1) continuationImpl;
            int i2 = scooterOfferRepository$bookScooterOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterOfferRepository$bookScooterOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scooterOfferRepository$bookScooterOffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferRepository$bookScooterOffer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r86 r86Var2 = new r86(str, str2);
                    scooterOfferRepository$bookScooterOffer$1.L$0 = null;
                    scooterOfferRepository$bookScooterOffer$1.L$1 = null;
                    scootersOfferApi = this.a;
                    scooterOfferRepository$bookScooterOffer$1.L$2 = scootersOfferApi;
                    scooterOfferRepository$bookScooterOffer$1.L$3 = r86Var2;
                    scooterOfferRepository$bookScooterOffer$1.label = 1;
                    Object a = this.e.a(false, scooterOfferRepository$bookScooterOffer$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        r86Var = r86Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                r86Var = (r86) scooterOfferRepository$bookScooterOffer$1.L$3;
                scootersOfferApi = (ScootersOfferApi) scooterOfferRepository$bookScooterOffer$1.L$2;
                kotlin.b.b(obj);
                cmt<zy11> c = scootersOfferApi.c(r86Var, (Map) obj);
                scooterOfferRepository$bookScooterOffer$1.L$0 = null;
                scooterOfferRepository$bookScooterOffer$1.L$1 = null;
                scooterOfferRepository$bookScooterOffer$1.L$2 = null;
                scooterOfferRepository$bookScooterOffer$1.L$3 = null;
                scooterOfferRepository$bookScooterOffer$1.label = 2;
            }
        }
        scooterOfferRepository$bookScooterOffer$1 = new ScooterOfferRepository$bookScooterOffer$1(this, continuationImpl);
        Object obj2 = scooterOfferRepository$bookScooterOffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferRepository$bookScooterOffer$1.label;
        if (i != 0) {
        }
        cmt<zy11> c2 = scootersOfferApi.c(r86Var, (Map) obj2);
        scooterOfferRepository$bookScooterOffer$1.L$0 = null;
        scooterOfferRepository$bookScooterOffer$1.L$1 = null;
        scooterOfferRepository$bookScooterOffer$1.L$2 = null;
        scooterOfferRepository$bookScooterOffer$1.L$3 = null;
        scooterOfferRepository$bookScooterOffer$1.label = 2;
    }

    public final Object b(String str, zzs zzsVar, ScootersInsuranceType scootersInsuranceType, m6a0 m6a0Var, List list, boolean z, Continuation continuation) {
        return bvf0.n(new ScooterOfferRepository$buildFixTariffOffer$2(this, zzsVar, str, m6a0Var, list, scootersInsuranceType, z, null), continuation);
    }

    public final Object c(String str, ScootersInsuranceType scootersInsuranceType, m6a0 m6a0Var, List list, boolean z, Continuation continuation) {
        return bvf0.n(new ScooterOfferRepository$createScooterOffer$2(this, str, m6a0Var, list, null, scootersInsuranceType, z, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6 A[LOOP:0: B:26:0x00f0->B:28:0x00f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, m6a0 m6a0Var, List list, ContinuationImpl continuationImpl) {
        ScooterOfferRepository$getAlternativeOffer$1 scooterOfferRepository$getAlternativeOffer$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersOfferApi scootersOfferApi;
        m6a0 m6a0Var2;
        List list2;
        String str3;
        String str4;
        fpm0 fpm0Var;
        d5p0 d5p0Var;
        ScootersOfferApi scootersOfferApi2;
        ScootersAlternativeOfferParams scootersAlternativeOfferParams;
        if (continuationImpl instanceof ScooterOfferRepository$getAlternativeOffer$1) {
            scooterOfferRepository$getAlternativeOffer$1 = (ScooterOfferRepository$getAlternativeOffer$1) continuationImpl;
            int i2 = scooterOfferRepository$getAlternativeOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterOfferRepository$getAlternativeOffer$1.label = i2 - Integer.MIN_VALUE;
                obj = scooterOfferRepository$getAlternativeOffer$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferRepository$getAlternativeOffer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scooterOfferRepository$getAlternativeOffer$1.L$0 = str;
                    scooterOfferRepository$getAlternativeOffer$1.L$1 = str2;
                    scooterOfferRepository$getAlternativeOffer$1.L$2 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$3 = m6a0Var;
                    scooterOfferRepository$getAlternativeOffer$1.L$4 = list;
                    scootersOfferApi = this.a;
                    scooterOfferRepository$getAlternativeOffer$1.L$5 = scootersOfferApi;
                    fpm0 fpm0Var2 = this.d;
                    scooterOfferRepository$getAlternativeOffer$1.L$6 = fpm0Var2;
                    scooterOfferRepository$getAlternativeOffer$1.label = 1;
                    Object h = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(scooterOfferRepository$getAlternativeOffer$1);
                    if (h != coroutineSingletons) {
                        m6a0Var2 = m6a0Var;
                        list2 = list;
                        str3 = str;
                        str4 = str2;
                        obj = h;
                        fpm0Var = fpm0Var2;
                        d5p0Var = null;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    scootersAlternativeOfferParams = (ScootersAlternativeOfferParams) scooterOfferRepository$getAlternativeOffer$1.L$6;
                    scootersOfferApi2 = (ScootersOfferApi) scooterOfferRepository$getAlternativeOffer$1.L$5;
                    kotlin.b.b(obj);
                    cmt<ScootersAlternativeOfferResponse> a = scootersOfferApi2.a((Map) obj, scootersAlternativeOfferParams);
                    scooterOfferRepository$getAlternativeOffer$1.L$0 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$1 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$2 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$3 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$4 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$5 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$6 = null;
                    scooterOfferRepository$getAlternativeOffer$1.label = 3;
                    Object a2 = ru.yandex.taxi.network.api.a.a(a, null, scooterOfferRepository$getAlternativeOffer$1);
                    return a2 != coroutineSingletons ? coroutineSingletons : a2;
                }
                fpm0Var = (fpm0) scooterOfferRepository$getAlternativeOffer$1.L$6;
                ScootersOfferApi scootersOfferApi3 = (ScootersOfferApi) scooterOfferRepository$getAlternativeOffer$1.L$5;
                list2 = (List) scooterOfferRepository$getAlternativeOffer$1.L$4;
                m6a0Var2 = (m6a0) scooterOfferRepository$getAlternativeOffer$1.L$3;
                d5p0 d5p0Var2 = (d5p0) scooterOfferRepository$getAlternativeOffer$1.L$2;
                String str5 = (String) scooterOfferRepository$getAlternativeOffer$1.L$1;
                String str6 = (String) scooterOfferRepository$getAlternativeOffer$1.L$0;
                kotlin.b.b(obj);
                scootersOfferApi = scootersOfferApi3;
                d5p0Var = d5p0Var2;
                str4 = str5;
                str3 = str6;
                zzs a3 = ((mo21) obj).a();
                fpm0Var.getClass();
                List f = r3b1.f(m6a0Var2);
                CreateOfferType createOfferType = !(d5p0Var instanceof c5p0) ? CreateOfferType.TO_DESTINATION_OFFER : null;
                List<r7p0> list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (r7p0 r7p0Var : list3) {
                    arrayList.add(new ScootersAlternativeOfferParams.Vehicle(r7p0Var.a, r7p0Var.b.k()));
                }
                ScootersAlternativeOfferParams scootersAlternativeOfferParams2 = new ScootersAlternativeOfferParams(str3, arrayList, createOfferType, a3, str4, f);
                scooterOfferRepository$getAlternativeOffer$1.L$0 = null;
                scooterOfferRepository$getAlternativeOffer$1.L$1 = null;
                scooterOfferRepository$getAlternativeOffer$1.L$2 = null;
                scooterOfferRepository$getAlternativeOffer$1.L$3 = null;
                scooterOfferRepository$getAlternativeOffer$1.L$4 = null;
                scooterOfferRepository$getAlternativeOffer$1.L$5 = scootersOfferApi;
                scooterOfferRepository$getAlternativeOffer$1.L$6 = scootersAlternativeOfferParams2;
                scooterOfferRepository$getAlternativeOffer$1.label = 2;
                obj = this.e.a(false, scooterOfferRepository$getAlternativeOffer$1);
                if (obj != coroutineSingletons) {
                    scootersOfferApi2 = scootersOfferApi;
                    scootersAlternativeOfferParams = scootersAlternativeOfferParams2;
                    cmt<ScootersAlternativeOfferResponse> a4 = scootersOfferApi2.a((Map) obj, scootersAlternativeOfferParams);
                    scooterOfferRepository$getAlternativeOffer$1.L$0 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$1 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$2 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$3 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$4 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$5 = null;
                    scooterOfferRepository$getAlternativeOffer$1.L$6 = null;
                    scooterOfferRepository$getAlternativeOffer$1.label = 3;
                    Object a22 = ru.yandex.taxi.network.api.a.a(a4, null, scooterOfferRepository$getAlternativeOffer$1);
                    if (a22 != coroutineSingletons) {
                    }
                }
            }
        }
        scooterOfferRepository$getAlternativeOffer$1 = new ScooterOfferRepository$getAlternativeOffer$1(this, continuationImpl);
        obj = scooterOfferRepository$getAlternativeOffer$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferRepository$getAlternativeOffer$1.label;
        if (i != 0) {
        }
        zzs a32 = ((mo21) obj).a();
        fpm0Var.getClass();
        List f2 = r3b1.f(m6a0Var2);
        if (!(d5p0Var instanceof c5p0)) {
        }
        List<r7p0> list32 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
        while (r1.hasNext()) {
        }
        ScootersAlternativeOfferParams scootersAlternativeOfferParams22 = new ScootersAlternativeOfferParams(str3, arrayList2, createOfferType, a32, str4, f2);
        scooterOfferRepository$getAlternativeOffer$1.L$0 = null;
        scooterOfferRepository$getAlternativeOffer$1.L$1 = null;
        scooterOfferRepository$getAlternativeOffer$1.L$2 = null;
        scooterOfferRepository$getAlternativeOffer$1.L$3 = null;
        scooterOfferRepository$getAlternativeOffer$1.L$4 = null;
        scooterOfferRepository$getAlternativeOffer$1.L$5 = scootersOfferApi;
        scooterOfferRepository$getAlternativeOffer$1.L$6 = scootersAlternativeOfferParams22;
        scooterOfferRepository$getAlternativeOffer$1.label = 2;
        obj = this.e.a(false, scooterOfferRepository$getAlternativeOffer$1);
        if (obj != coroutineSingletons) {
        }
    }
}
