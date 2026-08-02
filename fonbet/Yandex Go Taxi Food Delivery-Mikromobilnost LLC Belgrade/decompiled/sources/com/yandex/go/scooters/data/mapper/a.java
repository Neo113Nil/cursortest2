package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import com.yandex.go.scooters.data.model.Subscription;
import defpackage.avj0;
import defpackage.b4p0;
import defpackage.b590;
import defpackage.bvf0;
import defpackage.cno0;
import defpackage.cpm0;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.dcc0;
import defpackage.dpm0;
import defpackage.e1f0;
import defpackage.eer;
import defpackage.evu0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.fxi;
import defpackage.gk90;
import defpackage.gvu0;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.h5w;
import defpackage.hhs;
import defpackage.ihs;
import defpackage.jhs;
import defpackage.jl40;
import defpackage.k2b1;
import defpackage.kyh0;
import defpackage.mf1;
import defpackage.n3o0;
import defpackage.nt60;
import defpackage.ny61;
import defpackage.otn0;
import defpackage.p6p0;
import defpackage.pdc;
import defpackage.q1f0;
import defpackage.q3p0;
import defpackage.q531;
import defpackage.q7p0;
import defpackage.qco0;
import defpackage.qko0;
import defpackage.qoi0;
import defpackage.r7p0;
import defpackage.rcc;
import defpackage.stn0;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.tpw0;
import defpackage.tr60;
import defpackage.u4w;
import defpackage.vj90;
import defpackage.w511;
import defpackage.xdf;
import defpackage.xzt0;
import defpackage.y1b1;
import defpackage.y2p0;
import defpackage.ycc;
import defpackage.z531;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.scooters.data.model.OfferType;
import ru.yandex.taxi.scooters.data.model.VehicleType;
import ru.yandex.taxi.scooters.domain.model.ScootersInsuranceVersion;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes13.dex */
public final class a {
    public final zuj0 a;
    public final pdc b;
    public final xdf c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final d e;
    public final q3p0 f;
    public final c g;
    public final cno0 h;
    public final e i;
    public final com.yandex.go.scooters.insurance.data.b j;

    public a(zuj0 zuj0Var, pdc pdcVar, xdf xdfVar, ru.yandex.taxi.widget.utils.e eVar, d dVar, q3p0 q3p0Var, c cVar, cno0 cno0Var, e eVar2, com.yandex.go.scooters.insurance.data.b bVar) {
        this.a = zuj0Var;
        this.b = pdcVar;
        this.c = xdfVar;
        this.d = eVar;
        this.e = dVar;
        this.f = q3p0Var;
        this.g = cVar;
        this.h = cno0Var;
        this.i = eVar2;
        this.j = bVar;
    }

    public static FormattedText j(String str, String str2, FormattedText formattedText) {
        Iterable singletonList;
        if (str2 == null || str2.length() == 0) {
            return f9s.a(formattedText, new dcc0(str, 25));
        }
        List<o> list = formattedText.a;
        ArrayList arrayList = new ArrayList();
        for (o oVar : list) {
            if (oVar instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) oVar;
                String str3 = hVar.a;
                int H = evu0.H(str3, str, 0, false, 6);
                if (H >= 0) {
                    String v = cvu0.v(str3, str, "", false);
                    String A0 = gvu0.A0(H, v);
                    String r0 = gvu0.r0(H, v);
                    ListBuilder listBuilder = new ListBuilder(3);
                    if (A0.length() != 0) {
                        listBuilder.add(FormattedText.h.e(hVar, A0, null, null, 2046));
                    }
                    FormattedText.VerticalAlignment verticalAlignment = FormattedText.VerticalAlignment.CENTER;
                    Integer num = hVar.d;
                    listBuilder.add(new FormattedText.d(str2, verticalAlignment, hVar.g, num != null ? num.intValue() : 16, 40));
                    if (r0.length() != 0) {
                        listBuilder.add(FormattedText.h.e(hVar, r0, null, null, 2046));
                    }
                    singletonList = listBuilder.j();
                } else {
                    singletonList = Collections.singletonList(oVar);
                }
            } else {
                singletonList = Collections.singletonList(oVar);
            }
            ycc.r(singletonList, arrayList);
        }
        return new FormattedText(arrayList);
    }

    public final Object a(tr60 tr60Var, fef fefVar, boolean z, Continuation continuation) {
        nt60 nt60Var = tr60Var.p;
        List list = nt60Var != null ? nt60Var.h : null;
        List list2 = list;
        c cVar = this.g;
        if (list2 == null || list2.isEmpty()) {
            return cVar.b(nt60Var != null ? nt60Var.g : null, fefVar, z, (ContinuationImpl) continuation);
        }
        return cVar.c(list, fefVar, z, (ContinuationImpl) continuation);
    }

    public final String b(tr60 tr60Var, fef fefVar) {
        q1f0 q1f0Var = tr60Var.j;
        if (q1f0Var == null) {
            return null;
        }
        return this.h.b(fefVar, "%s", new e1f0(Integer.valueOf(q1f0Var.c).doubleValue()));
    }

    public final ArrayList c(CreateOffersV1Response createOffersV1Response) {
        Class cls;
        OfferType offerType;
        List list = createOffersV1Response.a;
        List list2 = createOffersV1Response.b;
        if (list.isEmpty() || list2.isEmpty()) {
            ny61.r("No offers or scooters in response");
            return null;
        }
        List list3 = createOffersV1Response.a;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            q531 q531Var = (q531) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (jl40.l(((tr60) obj).b, q531Var.a)) {
                    arrayList2.add(obj);
                }
            }
            String str = q531Var.b;
            z531 z531Var = q531Var.g;
            r7p0 r7p0Var = new r7p0(str, q531Var.c);
            String str2 = q531Var.b;
            ScootersVehicleType scootersVehicleType = q531Var.d == VehicleType.BIKE ? ScootersVehicleType.BIKE : ScootersVehicleType.SCOOTER;
            int i = z531Var != null ? z531Var.a : 0;
            int i2 = kyh0.scooters_distance_template;
            avj0 avj0Var = (avj0) this.a;
            Iterator it2 = it;
            String.format(avj0Var.h(i2), Arrays.copyOf(new Object[]{Integer.valueOf(z531Var != null ? (int) z531Var.b : 0)}, 1));
            List list4 = list2;
            t7s.d(z531Var != null ? z531Var.c : 0L, avj0Var.h(kyh0.scooters_remain_time_minutes_template), avj0Var.h(kyh0.scooters_remain_time_hours_template));
            q7p0 q7p0Var = new q7p0(z531Var != null ? z531Var.b : 0.0f, z531Var != null ? z531Var.c : 0L, i);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                tr60 tr60Var = (tr60) it3.next();
                String str3 = tr60Var.d;
                Pair pair = (str3 == null || (offerType = tr60Var.i) == null) ? null : new Pair(offerType, str3);
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            int d = gw00.d(tcc.n(arrayList3, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Pair pair2 = (Pair) it4.next();
                int i3 = dpm0.a[((OfferType) pair2.getFirst()).ordinal()];
                if (i3 == 1) {
                    cls = eer.class;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    cls = xzt0.class;
                }
                linkedHashMap.put(qoi0.a(cls), (String) pair2.getSecond());
            }
            String str4 = q531Var.i;
            zzs zzsVar = q531Var.f;
            if (zzsVar == null) {
                zzsVar = zzs.f;
            }
            zzs zzsVar2 = zzsVar;
            fxi fxiVar = createOffersV1Response.h;
            arrayList.add(new cpm0(r7p0Var, str2, scootersVehicleType, q7p0Var, linkedHashMap, str4, zzsVar2, fxiVar != null ? fxiVar.a : null));
            list2 = list4;
            it = it2;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(u4w u4wVar, String str, ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment, CharSequence charSequence, p6p0 p6p0Var, fef fefVar, ContinuationImpl continuationImpl) {
        ScooterOfferMapper$mapToScootersOfferInsurance$1 scooterOfferMapper$mapToScootersOfferInsurance$1;
        int i;
        ScootersInsuranceType e;
        h5w.b bVar;
        h5w.a aVar;
        jhs jhsVar;
        h5w.a aVar2;
        ScootersInsuranceVersion scootersInsuranceVersion;
        int i2;
        h5w.b bVar2;
        CharSequence charSequence2;
        jhs jhsVar2;
        ScootersInsuranceVersion scootersInsuranceVersion2;
        ScootersInsuranceType scootersInsuranceType;
        int i3;
        u4w.a aVar3;
        String str2;
        otn0 otn0Var;
        otn0 otn0Var2;
        stn0 stn0Var;
        u4w.b bVar3;
        otn0 otn0Var3;
        int i4;
        u4w u4wVar2 = u4wVar;
        if (continuationImpl instanceof ScooterOfferMapper$mapToScootersOfferInsurance$1) {
            scooterOfferMapper$mapToScootersOfferInsurance$1 = (ScooterOfferMapper$mapToScootersOfferInsurance$1) continuationImpl;
            int i5 = scooterOfferMapper$mapToScootersOfferInsurance$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                scooterOfferMapper$mapToScootersOfferInsurance$1.label = i5 - Integer.MIN_VALUE;
                ScooterOfferMapper$mapToScootersOfferInsurance$1 scooterOfferMapper$mapToScootersOfferInsurance$12 = scooterOfferMapper$mapToScootersOfferInsurance$1;
                Object obj = scooterOfferMapper$mapToScootersOfferInsurance$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferMapper$mapToScootersOfferInsurance$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (scootersClientInsuranceNewExperiment == null || !scootersClientInsuranceNewExperiment.b) {
                        return n3o0.g;
                    }
                    if (u4wVar2 == null || (str2 = u4wVar2.a) == null || (e = k2b1.e(str2)) == null) {
                        e = k2b1.e(str);
                    }
                    ScootersInsuranceType scootersInsuranceType2 = e;
                    ScootersInsuranceVersion scootersInsuranceVersion3 = p6p0Var.g.d;
                    ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion fullInsuranceSuggestion = scootersClientInsuranceNewExperiment.f;
                    jhs ihsVar = (fullInsuranceSuggestion == null || scootersInsuranceType2 != ScootersInsuranceType.STANDART) ? hhs.a : new ihs(fullInsuranceSuggestion.a, fullInsuranceSuggestion.b);
                    int i6 = (u4wVar2 == null || !u4wVar2.b) ? 0 : 1;
                    long j = (u4wVar2 == null || (aVar3 = u4wVar2.d) == null) ? 0L : aVar3.a;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$0 = u4wVar2;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$1 = null;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$2 = null;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$3 = null;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$4 = null;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$5 = null;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$6 = null;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$7 = scootersInsuranceType2;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$8 = scootersInsuranceVersion3;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$9 = charSequence;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.L$10 = ihsVar;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.I$0 = i6;
                    scooterOfferMapper$mapToScootersOfferInsurance$12.label = 1;
                    h5w h5wVar = scootersClientInsuranceNewExperiment.h;
                    if (y1b1.a(h5wVar)) {
                        int i7 = dpm0.b[scootersInsuranceType2.ordinal()];
                        if (i7 != 1) {
                            if (i7 == 2 && h5wVar != null && (bVar2 = h5wVar.d) != null) {
                                aVar = bVar2.b;
                                h5w.a aVar4 = aVar;
                                jhsVar = ihsVar;
                                aVar2 = aVar4;
                            }
                            jhsVar = ihsVar;
                            aVar2 = null;
                        } else {
                            if (h5wVar != null && (bVar = h5wVar.d) != null) {
                                aVar = bVar.a;
                                h5w.a aVar42 = aVar;
                                jhsVar = ihsVar;
                                aVar2 = aVar42;
                            }
                            jhsVar = ihsVar;
                            aVar2 = null;
                        }
                        if (aVar2 == null) {
                            scootersInsuranceVersion = scootersInsuranceVersion3;
                            i2 = i6;
                            obj = null;
                        } else {
                            scootersInsuranceVersion = scootersInsuranceVersion3;
                            i2 = i6;
                            obj = bvf0.n(new ScooterOfferMapper$mapToOptionItemConfig$2(this, aVar2, scootersClientInsuranceNewExperiment, fefVar, j, null), scooterOfferMapper$mapToScootersOfferInsurance$12);
                        }
                    } else {
                        scootersInsuranceVersion = scootersInsuranceVersion3;
                        obj = null;
                        jhsVar = ihsVar;
                        i2 = i6;
                    }
                    if (obj != coroutineSingletons) {
                        charSequence2 = charSequence;
                        jhsVar2 = jhsVar;
                        scootersInsuranceVersion2 = scootersInsuranceVersion;
                        scootersInsuranceType = scootersInsuranceType2;
                        i3 = i2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = scooterOfferMapper$mapToScootersOfferInsurance$12.I$0;
                    otn0Var3 = (otn0) scooterOfferMapper$mapToScootersOfferInsurance$12.L$12;
                    jhsVar2 = (jhs) scooterOfferMapper$mapToScootersOfferInsurance$12.L$11;
                    charSequence2 = (CharSequence) scooterOfferMapper$mapToScootersOfferInsurance$12.L$10;
                    scootersInsuranceVersion2 = (ScootersInsuranceVersion) scooterOfferMapper$mapToScootersOfferInsurance$12.L$9;
                    scootersInsuranceType = (ScootersInsuranceType) scooterOfferMapper$mapToScootersOfferInsurance$12.L$8;
                    kotlin.b.b(obj);
                    otn0Var2 = otn0Var3;
                    stn0Var = (stn0) obj;
                    i3 = i4;
                    return new n3o0(scootersInsuranceType, scootersInsuranceVersion2, charSequence2, jhsVar2, i3 == 0, otn0Var2, stn0Var);
                }
                i3 = scooterOfferMapper$mapToScootersOfferInsurance$12.I$0;
                jhsVar2 = (jhs) scooterOfferMapper$mapToScootersOfferInsurance$12.L$10;
                charSequence2 = (CharSequence) scooterOfferMapper$mapToScootersOfferInsurance$12.L$9;
                scootersInsuranceVersion2 = (ScootersInsuranceVersion) scooterOfferMapper$mapToScootersOfferInsurance$12.L$8;
                scootersInsuranceType = (ScootersInsuranceType) scooterOfferMapper$mapToScootersOfferInsurance$12.L$7;
                u4w u4wVar3 = (u4w) scooterOfferMapper$mapToScootersOfferInsurance$12.L$0;
                kotlin.b.b(obj);
                u4wVar2 = u4wVar3;
                otn0Var = (otn0) obj;
                if (u4wVar2 != null || (bVar3 = u4wVar2.c) == null) {
                    otn0Var2 = otn0Var;
                    stn0Var = null;
                    return new n3o0(scootersInsuranceType, scootersInsuranceVersion2, charSequence2, jhsVar2, i3 == 0, otn0Var2, stn0Var);
                }
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$0 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$1 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$2 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$3 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$4 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$5 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$6 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$7 = null;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$8 = scootersInsuranceType;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$9 = scootersInsuranceVersion2;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$10 = charSequence2;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$11 = jhsVar2;
                scooterOfferMapper$mapToScootersOfferInsurance$12.L$12 = otn0Var;
                scooterOfferMapper$mapToScootersOfferInsurance$12.I$0 = i3;
                scooterOfferMapper$mapToScootersOfferInsurance$12.label = 2;
                Object n = bVar3.a.a.isEmpty() ? null : bvf0.n(new ScooterOfferMapper$mapToProviderInfo$2(bVar3, this, null), scooterOfferMapper$mapToScootersOfferInsurance$12);
                if (n != coroutineSingletons) {
                    int i8 = i3;
                    otn0Var3 = otn0Var;
                    obj = n;
                    i4 = i8;
                    otn0Var2 = otn0Var3;
                    stn0Var = (stn0) obj;
                    i3 = i4;
                    return new n3o0(scootersInsuranceType, scootersInsuranceVersion2, charSequence2, jhsVar2, i3 == 0, otn0Var2, stn0Var);
                }
                return coroutineSingletons;
            }
        }
        scooterOfferMapper$mapToScootersOfferInsurance$1 = new ScooterOfferMapper$mapToScootersOfferInsurance$1(this, continuationImpl);
        ScooterOfferMapper$mapToScootersOfferInsurance$1 scooterOfferMapper$mapToScootersOfferInsurance$122 = scooterOfferMapper$mapToScootersOfferInsurance$1;
        Object obj2 = scooterOfferMapper$mapToScootersOfferInsurance$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferMapper$mapToScootersOfferInsurance$122.label;
        if (i != 0) {
        }
        otn0Var = (otn0) obj2;
        if (u4wVar2 != null) {
        }
        otn0Var2 = otn0Var;
        stn0Var = null;
        return new n3o0(scootersInsuranceType, scootersInsuranceVersion2, charSequence2, jhsVar2, i3 == 0, otn0Var2, stn0Var);
    }

    public final Object e(CreateOffersV1Response createOffersV1Response, Continuation continuation) {
        Subscription subscription = createOffersV1Response.d;
        fef h = gwk0.h(createOffersV1Response.c);
        e eVar = this.i;
        eVar.getClass();
        return bvf0.n(new ScootersSubscriptionMapper$prepareSubscription$2(subscription, eVar, h, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(CreateOffersV1Response createOffersV1Response, qko0 qko0Var, ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment, CharSequence charSequence, p6p0 p6p0Var, qco0 qco0Var, ContinuationImpl continuationImpl) {
        ScooterOfferMapper$mapToTariffs$1 scooterOfferMapper$mapToTariffs$1;
        int i;
        qco0 qco0Var2;
        Object obj;
        fef fefVar;
        qko0 qko0Var2;
        Object obj2;
        Object obj3;
        List list;
        CreateOffersV1Response createOffersV1Response2 = createOffersV1Response;
        if (continuationImpl instanceof ScooterOfferMapper$mapToTariffs$1) {
            scooterOfferMapper$mapToTariffs$1 = (ScooterOfferMapper$mapToTariffs$1) continuationImpl;
            int i2 = scooterOfferMapper$mapToTariffs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterOfferMapper$mapToTariffs$1.label = i2 - Integer.MIN_VALUE;
                ScooterOfferMapper$mapToTariffs$1 scooterOfferMapper$mapToTariffs$12 = scooterOfferMapper$mapToTariffs$1;
                Object obj4 = scooterOfferMapper$mapToTariffs$12.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferMapper$mapToTariffs$12.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    fef h = gwk0.h(createOffersV1Response2.c);
                    List list2 = createOffersV1Response2.b;
                    String str = createOffersV1Response2.g;
                    scooterOfferMapper$mapToTariffs$12.L$0 = createOffersV1Response2;
                    scooterOfferMapper$mapToTariffs$12.L$1 = qko0Var;
                    scooterOfferMapper$mapToTariffs$12.L$2 = null;
                    scooterOfferMapper$mapToTariffs$12.L$3 = null;
                    scooterOfferMapper$mapToTariffs$12.L$4 = null;
                    qco0Var2 = qco0Var;
                    scooterOfferMapper$mapToTariffs$12.L$5 = qco0Var2;
                    scooterOfferMapper$mapToTariffs$12.L$6 = h;
                    scooterOfferMapper$mapToTariffs$12.label = 1;
                    Object l = l(list2, h, str, qko0Var, scootersClientInsuranceNewExperiment, charSequence, p6p0Var, scooterOfferMapper$mapToTariffs$12);
                    if (l != obj5) {
                        obj = l;
                        fefVar = h;
                        qko0Var2 = qko0Var;
                    }
                    return obj5;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) scooterOfferMapper$mapToTariffs$12.L$7;
                    kotlin.b.b(obj4);
                    return kotlin.collections.a.m0((List) obj4, list);
                }
                fef fefVar2 = (fef) scooterOfferMapper$mapToTariffs$12.L$6;
                qco0 qco0Var3 = (qco0) scooterOfferMapper$mapToTariffs$12.L$5;
                qko0Var2 = (qko0) scooterOfferMapper$mapToTariffs$12.L$1;
                CreateOffersV1Response createOffersV1Response3 = (CreateOffersV1Response) scooterOfferMapper$mapToTariffs$12.L$0;
                kotlin.b.b(obj4);
                obj = obj4;
                qco0Var2 = qco0Var3;
                fefVar = fefVar2;
                createOffersV1Response2 = createOffersV1Response3;
                List list3 = (List) obj;
                if (qco0Var2 != null) {
                    return list3;
                }
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((b4p0) obj2) instanceof xzt0) {
                        break;
                    }
                }
                b4p0 b4p0Var = (b4p0) obj2;
                if (b4p0Var == null) {
                    b4p0Var = (b4p0) kotlin.collections.a.P(list3);
                }
                List list4 = createOffersV1Response2.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list4) {
                    if (hashSet.add(((tr60) obj6).i)) {
                        arrayList.add(obj6);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (((tr60) obj3).i == OfferType.STANDARD_OFFER) {
                        break;
                    }
                }
                tr60 tr60Var = (tr60) obj3;
                if (tr60Var == null) {
                    tr60Var = (tr60) kotlin.collections.a.P(arrayList);
                }
                ScootersSurgeExperiment scootersSurgeExperiment = qko0Var2 != null ? qko0Var2.b : null;
                scooterOfferMapper$mapToTariffs$12.L$0 = null;
                scooterOfferMapper$mapToTariffs$12.L$1 = null;
                scooterOfferMapper$mapToTariffs$12.L$2 = null;
                scooterOfferMapper$mapToTariffs$12.L$3 = null;
                scooterOfferMapper$mapToTariffs$12.L$4 = null;
                scooterOfferMapper$mapToTariffs$12.L$5 = null;
                scooterOfferMapper$mapToTariffs$12.L$6 = null;
                scooterOfferMapper$mapToTariffs$12.L$7 = list3;
                scooterOfferMapper$mapToTariffs$12.L$8 = null;
                scooterOfferMapper$mapToTariffs$12.L$9 = null;
                scooterOfferMapper$mapToTariffs$12.L$10 = null;
                scooterOfferMapper$mapToTariffs$12.label = 2;
                obj4 = k(qco0Var2, b4p0Var, tr60Var, scootersSurgeExperiment, fefVar, scooterOfferMapper$mapToTariffs$12);
                if (obj4 != obj5) {
                    list = list3;
                    return kotlin.collections.a.m0((List) obj4, list);
                }
                return obj5;
            }
        }
        scooterOfferMapper$mapToTariffs$1 = new ScooterOfferMapper$mapToTariffs$1(this, continuationImpl);
        ScooterOfferMapper$mapToTariffs$1 scooterOfferMapper$mapToTariffs$122 = scooterOfferMapper$mapToTariffs$1;
        Object obj42 = scooterOfferMapper$mapToTariffs$122.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferMapper$mapToTariffs$122.label;
        if (i != 0) {
        }
        List list32 = (List) obj;
        if (qco0Var2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(nt60 nt60Var, fef fefVar, y2p0 y2p0Var, ContinuationImpl continuationImpl) {
        ScooterOfferMapper$prepareBookSubtitleForTariffItem$1 scooterOfferMapper$prepareBookSubtitleForTariffItem$1;
        int i;
        CharSequence charSequence;
        if (continuationImpl instanceof ScooterOfferMapper$prepareBookSubtitleForTariffItem$1) {
            scooterOfferMapper$prepareBookSubtitleForTariffItem$1 = (ScooterOfferMapper$prepareBookSubtitleForTariffItem$1) continuationImpl;
            int i2 = scooterOfferMapper$prepareBookSubtitleForTariffItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterOfferMapper$prepareBookSubtitleForTariffItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scooterOfferMapper$prepareBookSubtitleForTariffItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferMapper$prepareBookSubtitleForTariffItem$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (nt60Var == null) {
                        return "";
                    }
                    FormattedText formattedText = nt60Var.d;
                    if (formattedText != null && !formattedText.a.isEmpty()) {
                        FormattedText j = j("$PACKAGE_SURGE_ICON$", y2p0Var != null ? y2p0Var.f : null, j("$RIDING_SURGE_ICON$", y2p0Var != null ? y2p0Var.d : null, j("$UNLOCK_SURGE_ICON$", y2p0Var != null ? y2p0Var.e : null, f9s.c(this.c, fefVar, formattedText))));
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$0 = nt60Var;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$1 = fefVar;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$2 = null;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$3 = null;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$4 = null;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$5 = null;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$6 = null;
                        scooterOfferMapper$prepareBookSubtitleForTariffItem$1.label = 1;
                        obj = this.d.t(j, scooterOfferMapper$prepareBookSubtitleForTariffItem$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    charSequence = (CharSequence) obj2;
                    if (charSequence == null) {
                        return this.h.d(fefVar, nt60Var.c);
                    }
                    return charSequence;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fefVar = (fef) scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$1;
                nt60Var = (nt60) scooterOfferMapper$prepareBookSubtitleForTariffItem$1.L$0;
                kotlin.b.b(obj);
                obj2 = obj;
                charSequence = (CharSequence) obj2;
                if (charSequence == null) {
                }
            }
        }
        scooterOfferMapper$prepareBookSubtitleForTariffItem$1 = new ScooterOfferMapper$prepareBookSubtitleForTariffItem$1(this, continuationImpl);
        Object obj3 = scooterOfferMapper$prepareBookSubtitleForTariffItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferMapper$prepareBookSubtitleForTariffItem$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        obj22 = obj3;
        charSequence = (CharSequence) obj22;
        if (charSequence == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(nt60 nt60Var, fef fefVar, y2p0 y2p0Var, ContinuationImpl continuationImpl) {
        ScooterOfferMapper$prepareBookTitleForTariffItem$1 scooterOfferMapper$prepareBookTitleForTariffItem$1;
        int i;
        CharSequence charSequence;
        if (continuationImpl instanceof ScooterOfferMapper$prepareBookTitleForTariffItem$1) {
            scooterOfferMapper$prepareBookTitleForTariffItem$1 = (ScooterOfferMapper$prepareBookTitleForTariffItem$1) continuationImpl;
            int i2 = scooterOfferMapper$prepareBookTitleForTariffItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterOfferMapper$prepareBookTitleForTariffItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scooterOfferMapper$prepareBookTitleForTariffItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferMapper$prepareBookTitleForTariffItem$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (nt60Var == null) {
                        return "";
                    }
                    FormattedText formattedText = nt60Var.b;
                    if (formattedText != null && !formattedText.a.isEmpty()) {
                        FormattedText j = j("$PACKAGE_SURGE_ICON$", y2p0Var != null ? y2p0Var.f : null, j("$RIDING_SURGE_ICON$", y2p0Var != null ? y2p0Var.d : null, j("$UNLOCK_SURGE_ICON$", y2p0Var != null ? y2p0Var.e : null, f9s.c(this.c, fefVar, formattedText))));
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$0 = nt60Var;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$1 = fefVar;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$2 = null;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$3 = null;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$4 = null;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$5 = null;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.L$6 = null;
                        scooterOfferMapper$prepareBookTitleForTariffItem$1.label = 1;
                        obj = this.d.t(j, scooterOfferMapper$prepareBookTitleForTariffItem$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    charSequence = (CharSequence) obj2;
                    if (charSequence == null) {
                        return this.h.d(fefVar, nt60Var.a);
                    }
                    return charSequence;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fefVar = (fef) scooterOfferMapper$prepareBookTitleForTariffItem$1.L$1;
                nt60Var = (nt60) scooterOfferMapper$prepareBookTitleForTariffItem$1.L$0;
                kotlin.b.b(obj);
                obj2 = obj;
                charSequence = (CharSequence) obj2;
                if (charSequence == null) {
                }
            }
        }
        scooterOfferMapper$prepareBookTitleForTariffItem$1 = new ScooterOfferMapper$prepareBookTitleForTariffItem$1(this, continuationImpl);
        Object obj3 = scooterOfferMapper$prepareBookTitleForTariffItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferMapper$prepareBookTitleForTariffItem$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        obj22 = obj3;
        charSequence = (CharSequence) obj22;
        if (charSequence == null) {
        }
    }

    public final Object i(nt60 nt60Var, fef fefVar, Continuation continuation) {
        FormattedText formattedText;
        return jl40.l(nt60Var != null ? nt60Var.f : null, FormattedText.c) ? this.h.d(fefVar, nt60Var.e) : (nt60Var == null || (formattedText = nt60Var.f) == null) ? "" : this.d.t(f9s.c(this.c, fefVar, formattedText), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03f0  */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, y2p0] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x03bf -> B:11:0x03c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x03df -> B:12:0x03d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(qco0 qco0Var, b4p0 b4p0Var, tr60 tr60Var, ScootersSurgeExperiment scootersSurgeExperiment, fef fefVar, ContinuationImpl continuationImpl) {
        ScooterOfferMapper$toScooterTariffs$2 scooterOfferMapper$toScooterTariffs$2;
        int i;
        FormattedText formattedText;
        fef fefVar2;
        Iterator it;
        ScooterOfferMapper$toScooterTariffs$2 scooterOfferMapper$toScooterTariffs$22;
        ArrayList arrayList;
        b4p0 b4p0Var2;
        tr60 tr60Var2;
        ScootersSurgeExperiment scootersSurgeExperiment2;
        Object obj;
        String str;
        ArrayList arrayList2;
        CoroutineSingletons coroutineSingletons;
        ru.yandex.taxi.widget.utils.e eVar;
        String str2;
        vj90 vj90Var;
        FormattedText formattedText2;
        String str3;
        ArrayList arrayList3;
        Iterator it2;
        tr60 tr60Var3;
        y2p0 y2p0Var;
        String str4;
        b4p0 b4p0Var3;
        CharSequence charSequence;
        String str5;
        CharSequence charSequence2;
        CoroutineSingletons coroutineSingletons2;
        String str6;
        String str7;
        y2p0 y2p0Var2;
        CharSequence charSequence3;
        b4p0 b4p0Var4;
        Iterator it3;
        Object obj2;
        Iterator it4;
        vj90 vj90Var2;
        FormattedText formattedText3;
        y2p0 y2p0Var3;
        b4p0 b4p0Var5;
        tr60 tr60Var4;
        String str8;
        String str9;
        String str10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        CoroutineSingletons coroutineSingletons3;
        ru.yandex.taxi.widget.utils.e eVar2;
        Object obj3;
        List W;
        ArrayList arrayList6;
        ?? y2p0Var4;
        String str11;
        String str12;
        String str13;
        CharSequence charSequence4;
        a aVar = this;
        if (continuationImpl instanceof ScooterOfferMapper$toScooterTariffs$2) {
            scooterOfferMapper$toScooterTariffs$2 = (ScooterOfferMapper$toScooterTariffs$2) continuationImpl;
            int i2 = scooterOfferMapper$toScooterTariffs$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterOfferMapper$toScooterTariffs$2.label = i2 - Integer.MIN_VALUE;
                Object obj4 = scooterOfferMapper$toScooterTariffs$2.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferMapper$toScooterTariffs$2.label;
                xdf xdfVar = aVar.c;
                ru.yandex.taxi.widget.utils.e eVar3 = aVar.d;
                String str14 = "";
                if (i != 0) {
                    formattedText = null;
                    kotlin.b.b(obj4);
                    List list = qco0Var.h;
                    ArrayList arrayList7 = new ArrayList(tcc.n(list, 10));
                    fefVar2 = fefVar;
                    it = list.iterator();
                    scooterOfferMapper$toScooterTariffs$22 = scooterOfferMapper$toScooterTariffs$2;
                    arrayList = arrayList7;
                    b4p0Var2 = b4p0Var;
                    tr60Var2 = tr60Var;
                    scootersSurgeExperiment2 = scootersSurgeExperiment;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    ?? r1 = (Collection) scooterOfferMapper$toScooterTariffs$2.L$24;
                    String str15 = (String) scooterOfferMapper$toScooterTariffs$2.L$18;
                    String str16 = (String) scooterOfferMapper$toScooterTariffs$2.L$17;
                    String str17 = (String) scooterOfferMapper$toScooterTariffs$2.L$16;
                    y2p0 y2p0Var5 = (y2p0) scooterOfferMapper$toScooterTariffs$2.L$15;
                    FormattedText formattedText4 = (FormattedText) scooterOfferMapper$toScooterTariffs$2.L$14;
                    vj90 vj90Var3 = (vj90) scooterOfferMapper$toScooterTariffs$2.L$10;
                    it4 = (Iterator) scooterOfferMapper$toScooterTariffs$2.L$8;
                    ?? r12 = (Collection) scooterOfferMapper$toScooterTariffs$2.L$7;
                    fef fefVar3 = (fef) scooterOfferMapper$toScooterTariffs$2.L$4;
                    ScootersSurgeExperiment scootersSurgeExperiment3 = (ScootersSurgeExperiment) scooterOfferMapper$toScooterTariffs$2.L$3;
                    tr60Var4 = (tr60) scooterOfferMapper$toScooterTariffs$2.L$2;
                    b4p0Var5 = (b4p0) scooterOfferMapper$toScooterTariffs$2.L$1;
                    kotlin.b.b(obj4);
                    eVar2 = eVar3;
                    y2p0Var3 = y2p0Var5;
                    formattedText3 = formattedText4;
                    vj90Var2 = vj90Var3;
                    obj3 = obj4;
                    scooterOfferMapper$toScooterTariffs$22 = scooterOfferMapper$toScooterTariffs$2;
                    coroutineSingletons3 = coroutineSingletons4;
                    str2 = "";
                    str9 = str16;
                    str8 = str17;
                    arrayList4 = r1;
                    arrayList5 = r12;
                    fefVar2 = fefVar3;
                    str10 = str15;
                    scootersSurgeExperiment2 = scootersSurgeExperiment3;
                    it2 = it4;
                    obj = obj3;
                    str = str10;
                    str3 = str9;
                    b4p0Var3 = b4p0Var5;
                    formattedText2 = formattedText3;
                    coroutineSingletons = coroutineSingletons3;
                    y2p0Var = y2p0Var3;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    tr60Var3 = tr60Var4;
                    eVar = eVar2;
                    str4 = str8;
                    vj90Var = vj90Var2;
                    charSequence = (CharSequence) obj;
                    if (charSequence != null) {
                    }
                    if (formattedText2 != null) {
                    }
                    b4p0 b4p0Var6 = b4p0Var3;
                    coroutineSingletons2 = coroutineSingletons;
                    str6 = str5;
                    str7 = str;
                    y2p0Var2 = y2p0Var;
                    arrayList = arrayList3;
                    charSequence3 = charSequence2;
                    b4p0Var4 = b4p0Var6;
                    it3 = it2;
                    obj2 = null;
                    String str18 = str6;
                    ArrayList arrayList8 = arrayList2;
                    String str19 = r21;
                    String str20 = str7;
                    vj90 vj90Var4 = r23;
                    ?? r9 = (CharSequence) obj2;
                    if (r9 != 0) {
                    }
                    charSequence4 = vj90Var4.h;
                    if (charSequence4.length() == 0) {
                    }
                    CharSequence charSequence5 = charSequence4;
                    kotlinx.serialization.json.c cVar = b4p0Var4.h;
                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                    String str21 = b4p0Var4.i;
                    List list2 = vj90Var4.m;
                    String str22 = vj90Var4.c;
                    n3o0 n3o0Var = n3o0.g;
                    r1.b(tr60Var3, fefVar2);
                    arrayList8.add(new b590(str18, str19, str20, charSequence3, r29, charSequence5, cVar, str21, list2, y2p0Var2, n3o0Var, fefVar2, vj90Var4, str22));
                    aVar = r1;
                    b4p0Var2 = b4p0Var4;
                    tr60Var2 = tr60Var3;
                    it = it3;
                    str14 = str2;
                    eVar3 = eVar;
                    coroutineSingletons4 = coroutineSingletons5;
                    formattedText = null;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r4 = (Collection) scooterOfferMapper$toScooterTariffs$2.L$25;
                    CharSequence charSequence6 = (CharSequence) scooterOfferMapper$toScooterTariffs$2.L$24;
                    String str23 = (String) scooterOfferMapper$toScooterTariffs$2.L$18;
                    String str24 = (String) scooterOfferMapper$toScooterTariffs$2.L$17;
                    String str25 = (String) scooterOfferMapper$toScooterTariffs$2.L$16;
                    y2p0 y2p0Var6 = (y2p0) scooterOfferMapper$toScooterTariffs$2.L$15;
                    vj90 vj90Var5 = (vj90) scooterOfferMapper$toScooterTariffs$2.L$10;
                    Iterator it5 = (Iterator) scooterOfferMapper$toScooterTariffs$2.L$8;
                    ?? r13 = (Collection) scooterOfferMapper$toScooterTariffs$2.L$7;
                    fef fefVar4 = (fef) scooterOfferMapper$toScooterTariffs$2.L$4;
                    ScootersSurgeExperiment scootersSurgeExperiment4 = (ScootersSurgeExperiment) scooterOfferMapper$toScooterTariffs$2.L$3;
                    tr60 tr60Var5 = (tr60) scooterOfferMapper$toScooterTariffs$2.L$2;
                    b4p0 b4p0Var7 = (b4p0) scooterOfferMapper$toScooterTariffs$2.L$1;
                    kotlin.b.b(obj4);
                    vj90 vj90Var6 = vj90Var5;
                    a aVar2 = aVar;
                    coroutineSingletons2 = coroutineSingletons4;
                    arrayList2 = r4;
                    String str26 = str24;
                    str7 = str23;
                    Object t = obj4;
                    tr60Var3 = tr60Var5;
                    scootersSurgeExperiment2 = scootersSurgeExperiment4;
                    eVar = eVar3;
                    str2 = "";
                    str6 = str25;
                    it2 = it5;
                    arrayList3 = r13;
                    y2p0 y2p0Var7 = y2p0Var6;
                    fefVar2 = fefVar4;
                    ArrayList arrayList9 = arrayList3;
                    it3 = it2;
                    obj2 = t;
                    arrayList = arrayList9;
                    y2p0Var2 = y2p0Var7;
                    charSequence3 = charSequence6;
                    scooterOfferMapper$toScooterTariffs$22 = scooterOfferMapper$toScooterTariffs$2;
                    b4p0Var4 = b4p0Var7;
                    String str182 = str6;
                    ArrayList arrayList82 = arrayList2;
                    String str192 = str26;
                    String str202 = str7;
                    vj90 vj90Var42 = vj90Var6;
                    ?? r92 = (CharSequence) obj2;
                    String str27 = r92 != 0 ? str2 : r92;
                    charSequence4 = vj90Var42.h;
                    if (charSequence4.length() == 0) {
                        charSequence4 = vj90Var42.f;
                    }
                    CharSequence charSequence52 = charSequence4;
                    kotlinx.serialization.json.c cVar2 = b4p0Var4.h;
                    CoroutineSingletons coroutineSingletons52 = coroutineSingletons2;
                    String str212 = b4p0Var4.i;
                    List list22 = vj90Var42.m;
                    String str222 = vj90Var42.c;
                    n3o0 n3o0Var2 = n3o0.g;
                    aVar2.b(tr60Var3, fefVar2);
                    arrayList82.add(new b590(str182, str192, str202, charSequence3, str27, charSequence52, cVar2, str212, list22, y2p0Var2, n3o0Var2, fefVar2, vj90Var42, str222));
                    aVar = aVar2;
                    b4p0Var2 = b4p0Var4;
                    tr60Var2 = tr60Var3;
                    it = it3;
                    str14 = str2;
                    eVar3 = eVar;
                    coroutineSingletons4 = coroutineSingletons52;
                    formattedText = null;
                    if (it.hasNext()) {
                        vj90Var = (vj90) it.next();
                        str2 = str14;
                        CoroutineSingletons coroutineSingletons6 = coroutineSingletons4;
                        ru.yandex.taxi.widget.utils.e eVar4 = eVar3;
                        W = evu0.W(vj90Var.e, new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
                        gk90 gk90Var = vj90Var.j;
                        FormattedText formattedText5 = gk90Var == null ? formattedText : gk90Var.a;
                        FormattedText formattedText6 = gk90Var == null ? formattedText : gk90Var.b;
                        Double d = vj90Var.n;
                        if (d == null || scootersSurgeExperiment2 == null) {
                            it4 = it;
                            arrayList6 = arrayList;
                        } else {
                            it4 = it;
                            arrayList6 = arrayList;
                            double doubleValue = d.doubleValue();
                            aVar.f.getClass();
                            if (scootersSurgeExperiment2.b) {
                                ScootersSurgeExperiment.SurgeSettings a = q3p0.a(doubleValue, scootersSurgeExperiment2);
                                String str28 = a.d;
                                String Y = d6z.Y(scootersSurgeExperiment2, a.e);
                                String str29 = a.f;
                                ScootersSurgeExperiment.SurgeSettings.Content content = a.h;
                                List list3 = content.d;
                                List list4 = content.e;
                                ListBuilder a2 = rcc.a();
                                a2.addAll(q3p0.c(list3, scootersSurgeExperiment2));
                                a2.addAll(q3p0.c(list4, scootersSurgeExperiment2));
                                y2p0Var4 = new y2p0(doubleValue, str28, Y, null, null, str29, q3p0.b(a, scootersSurgeExperiment2, a2.j()));
                                str11 = vj90Var.a;
                                str12 = (String) kotlin.collections.a.P(W);
                                str13 = W.size() <= 1 ? (String) W.get(1) : str2;
                                if (formattedText5 != null || formattedText5.a.isEmpty()) {
                                    FormattedText formattedText7 = formattedText6;
                                    arrayList3 = arrayList6;
                                    tr60 tr60Var6 = tr60Var2;
                                    coroutineSingletons = coroutineSingletons6;
                                    str = str13;
                                    y2p0Var = y2p0Var4;
                                    tr60Var3 = tr60Var6;
                                    b4p0Var3 = b4p0Var2;
                                    obj = null;
                                    eVar = eVar4;
                                    formattedText2 = formattedText7;
                                    arrayList2 = arrayList3;
                                    str4 = str11;
                                    it2 = it4;
                                    str3 = str12;
                                    charSequence = (CharSequence) obj;
                                    if (charSequence != null) {
                                        str26 = str3;
                                        charSequence2 = vj90Var.i;
                                        if (charSequence2 == null || charSequence2.length() == 0) {
                                            str5 = str4;
                                            vj90Var6 = vj90Var;
                                            aVar2 = this;
                                            charSequence2 = ((avj0) aVar2.a).h(kyh0.scooters_pass_type_pass_button_title);
                                        } else {
                                            str5 = str4;
                                            vj90Var6 = vj90Var;
                                            aVar2 = this;
                                        }
                                    } else {
                                        str5 = str4;
                                        str26 = str3;
                                        vj90Var6 = vj90Var;
                                        aVar2 = this;
                                        charSequence2 = charSequence;
                                    }
                                    if (formattedText2 != null || formattedText2.a.isEmpty()) {
                                        b4p0 b4p0Var62 = b4p0Var3;
                                        coroutineSingletons2 = coroutineSingletons;
                                        str6 = str5;
                                        str7 = str;
                                        y2p0Var2 = y2p0Var;
                                        arrayList = arrayList3;
                                        charSequence3 = charSequence2;
                                        b4p0Var4 = b4p0Var62;
                                        it3 = it2;
                                        obj2 = null;
                                        String str1822 = str6;
                                        ArrayList arrayList822 = arrayList2;
                                        String str1922 = str26;
                                        String str2022 = str7;
                                        vj90 vj90Var422 = vj90Var6;
                                        ?? r922 = (CharSequence) obj2;
                                        if (r922 != 0) {
                                        }
                                        charSequence4 = vj90Var422.h;
                                        if (charSequence4.length() == 0) {
                                        }
                                        CharSequence charSequence522 = charSequence4;
                                        kotlinx.serialization.json.c cVar22 = b4p0Var4.h;
                                        CoroutineSingletons coroutineSingletons522 = coroutineSingletons2;
                                        String str2122 = b4p0Var4.i;
                                        List list222 = vj90Var422.m;
                                        String str2222 = vj90Var422.c;
                                        n3o0 n3o0Var22 = n3o0.g;
                                        aVar2.b(tr60Var3, fefVar2);
                                        arrayList822.add(new b590(str1822, str1922, str2022, charSequence3, str27, charSequence522, cVar22, str2122, list222, y2p0Var2, n3o0Var22, fefVar2, vj90Var422, str2222));
                                        aVar = aVar2;
                                        b4p0Var2 = b4p0Var4;
                                        tr60Var2 = tr60Var3;
                                        it = it3;
                                        str14 = str2;
                                        eVar3 = eVar;
                                        coroutineSingletons4 = coroutineSingletons522;
                                        formattedText = null;
                                        if (it.hasNext()) {
                                            return arrayList;
                                        }
                                    } else {
                                        FormattedText j = j("$PACKAGE_SURGE_ICON$", y2p0Var != null ? y2p0Var.f : null, j("$RIDING_SURGE_ICON$", y2p0Var != null ? y2p0Var.d : null, j("$UNLOCK_SURGE_ICON$", y2p0Var != null ? y2p0Var.e : null, f9s.c(xdfVar, fefVar2, formattedText2))));
                                        scooterOfferMapper$toScooterTariffs$22.L$0 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$1 = b4p0Var3;
                                        scooterOfferMapper$toScooterTariffs$22.L$2 = tr60Var3;
                                        scooterOfferMapper$toScooterTariffs$22.L$3 = scootersSurgeExperiment2;
                                        scooterOfferMapper$toScooterTariffs$22.L$4 = fefVar2;
                                        scooterOfferMapper$toScooterTariffs$22.L$5 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$6 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$7 = arrayList3;
                                        scooterOfferMapper$toScooterTariffs$22.L$8 = it2;
                                        scooterOfferMapper$toScooterTariffs$22.L$9 = null;
                                        b4p0 b4p0Var8 = b4p0Var3;
                                        scooterOfferMapper$toScooterTariffs$22.L$10 = vj90Var6;
                                        scooterOfferMapper$toScooterTariffs$22.L$11 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$12 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$13 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$14 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$15 = y2p0Var;
                                        str6 = str5;
                                        scooterOfferMapper$toScooterTariffs$22.L$16 = str6;
                                        scooterOfferMapper$toScooterTariffs$22.L$17 = str26;
                                        String str30 = str;
                                        scooterOfferMapper$toScooterTariffs$22.L$18 = str30;
                                        str7 = str30;
                                        scooterOfferMapper$toScooterTariffs$22.L$19 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$20 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$21 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$22 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$23 = null;
                                        scooterOfferMapper$toScooterTariffs$22.L$24 = charSequence2;
                                        scooterOfferMapper$toScooterTariffs$22.L$25 = arrayList2;
                                        scooterOfferMapper$toScooterTariffs$22.label = 2;
                                        t = eVar.t(j, scooterOfferMapper$toScooterTariffs$22);
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (t == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        CharSequence charSequence7 = charSequence2;
                                        y2p0Var7 = y2p0Var;
                                        scooterOfferMapper$toScooterTariffs$2 = scooterOfferMapper$toScooterTariffs$22;
                                        charSequence6 = charSequence7;
                                        b4p0Var7 = b4p0Var8;
                                        ArrayList arrayList92 = arrayList3;
                                        it3 = it2;
                                        obj2 = t;
                                        arrayList = arrayList92;
                                        y2p0Var2 = y2p0Var7;
                                        charSequence3 = charSequence6;
                                        scooterOfferMapper$toScooterTariffs$22 = scooterOfferMapper$toScooterTariffs$2;
                                        b4p0Var4 = b4p0Var7;
                                        String str18222 = str6;
                                        ArrayList arrayList8222 = arrayList2;
                                        String str19222 = str26;
                                        String str20222 = str7;
                                        vj90 vj90Var4222 = vj90Var6;
                                        ?? r9222 = (CharSequence) obj2;
                                        if (r9222 != 0) {
                                        }
                                        charSequence4 = vj90Var4222.h;
                                        if (charSequence4.length() == 0) {
                                        }
                                        CharSequence charSequence5222 = charSequence4;
                                        kotlinx.serialization.json.c cVar222 = b4p0Var4.h;
                                        CoroutineSingletons coroutineSingletons5222 = coroutineSingletons2;
                                        String str21222 = b4p0Var4.i;
                                        List list2222 = vj90Var4222.m;
                                        String str22222 = vj90Var4222.c;
                                        n3o0 n3o0Var222 = n3o0.g;
                                        aVar2.b(tr60Var3, fefVar2);
                                        arrayList8222.add(new b590(str18222, str19222, str20222, charSequence3, str27, charSequence5222, cVar222, str21222, list2222, y2p0Var2, n3o0Var222, fefVar2, vj90Var4222, str22222));
                                        aVar = aVar2;
                                        b4p0Var2 = b4p0Var4;
                                        tr60Var2 = tr60Var3;
                                        it = it3;
                                        str14 = str2;
                                        eVar3 = eVar;
                                        coroutineSingletons4 = coroutineSingletons5222;
                                        formattedText = null;
                                        if (it.hasNext()) {
                                        }
                                    }
                                } else {
                                    FormattedText j2 = j("$PACKAGE_SURGE_ICON$", y2p0Var4 != 0 ? y2p0Var4.f : formattedText, j("$RIDING_SURGE_ICON$", y2p0Var4 != 0 ? y2p0Var4.d : formattedText, j("$UNLOCK_SURGE_ICON$", y2p0Var4 != 0 ? y2p0Var4.e : formattedText, f9s.c(xdfVar, fefVar2, formattedText5))));
                                    FormattedText formattedText8 = formattedText;
                                    scooterOfferMapper$toScooterTariffs$22.L$0 = formattedText8;
                                    scooterOfferMapper$toScooterTariffs$22.L$1 = b4p0Var2;
                                    scooterOfferMapper$toScooterTariffs$22.L$2 = tr60Var2;
                                    scooterOfferMapper$toScooterTariffs$22.L$3 = scootersSurgeExperiment2;
                                    scooterOfferMapper$toScooterTariffs$22.L$4 = fefVar2;
                                    scooterOfferMapper$toScooterTariffs$22.L$5 = formattedText8;
                                    scooterOfferMapper$toScooterTariffs$22.L$6 = formattedText8;
                                    arrayList4 = arrayList6;
                                    scooterOfferMapper$toScooterTariffs$22.L$7 = arrayList4;
                                    b4p0 b4p0Var9 = b4p0Var2;
                                    scooterOfferMapper$toScooterTariffs$22.L$8 = it4;
                                    scooterOfferMapper$toScooterTariffs$22.L$9 = formattedText8;
                                    scooterOfferMapper$toScooterTariffs$22.L$10 = vj90Var;
                                    scooterOfferMapper$toScooterTariffs$22.L$11 = formattedText8;
                                    scooterOfferMapper$toScooterTariffs$22.L$12 = formattedText8;
                                    scooterOfferMapper$toScooterTariffs$22.L$13 = formattedText8;
                                    FormattedText formattedText9 = formattedText6;
                                    scooterOfferMapper$toScooterTariffs$22.L$14 = formattedText9;
                                    scooterOfferMapper$toScooterTariffs$22.L$15 = y2p0Var4;
                                    scooterOfferMapper$toScooterTariffs$22.L$16 = str11;
                                    scooterOfferMapper$toScooterTariffs$22.L$17 = str12;
                                    scooterOfferMapper$toScooterTariffs$22.L$18 = str13;
                                    scooterOfferMapper$toScooterTariffs$22.L$19 = null;
                                    scooterOfferMapper$toScooterTariffs$22.L$20 = null;
                                    scooterOfferMapper$toScooterTariffs$22.L$21 = null;
                                    scooterOfferMapper$toScooterTariffs$22.L$22 = null;
                                    scooterOfferMapper$toScooterTariffs$22.L$23 = null;
                                    scooterOfferMapper$toScooterTariffs$22.L$24 = arrayList4;
                                    scooterOfferMapper$toScooterTariffs$22.L$25 = null;
                                    scooterOfferMapper$toScooterTariffs$22.label = 1;
                                    eVar2 = eVar4;
                                    obj3 = eVar2.t(j2, scooterOfferMapper$toScooterTariffs$22);
                                    tr60Var4 = tr60Var2;
                                    coroutineSingletons3 = coroutineSingletons6;
                                    if (obj3 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    formattedText3 = formattedText9;
                                    vj90Var2 = vj90Var;
                                    b4p0Var5 = b4p0Var9;
                                    str8 = str11;
                                    y2p0Var3 = y2p0Var4;
                                    str9 = str12;
                                    str10 = str13;
                                    arrayList5 = arrayList4;
                                    it2 = it4;
                                    obj = obj3;
                                    str = str10;
                                    str3 = str9;
                                    b4p0Var3 = b4p0Var5;
                                    formattedText2 = formattedText3;
                                    coroutineSingletons = coroutineSingletons3;
                                    y2p0Var = y2p0Var3;
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    tr60Var3 = tr60Var4;
                                    eVar = eVar2;
                                    str4 = str8;
                                    vj90Var = vj90Var2;
                                    charSequence = (CharSequence) obj;
                                    if (charSequence != null) {
                                    }
                                    if (formattedText2 != null) {
                                    }
                                    b4p0 b4p0Var622 = b4p0Var3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    str6 = str5;
                                    str7 = str;
                                    y2p0Var2 = y2p0Var;
                                    arrayList = arrayList3;
                                    charSequence3 = charSequence2;
                                    b4p0Var4 = b4p0Var622;
                                    it3 = it2;
                                    obj2 = null;
                                    String str182222 = str6;
                                    ArrayList arrayList82222 = arrayList2;
                                    String str192222 = str26;
                                    String str202222 = str7;
                                    vj90 vj90Var42222 = vj90Var6;
                                    ?? r92222 = (CharSequence) obj2;
                                    if (r92222 != 0) {
                                    }
                                    charSequence4 = vj90Var42222.h;
                                    if (charSequence4.length() == 0) {
                                    }
                                    CharSequence charSequence52222 = charSequence4;
                                    kotlinx.serialization.json.c cVar2222 = b4p0Var4.h;
                                    CoroutineSingletons coroutineSingletons52222 = coroutineSingletons2;
                                    String str212222 = b4p0Var4.i;
                                    List list22222 = vj90Var42222.m;
                                    String str222222 = vj90Var42222.c;
                                    n3o0 n3o0Var2222 = n3o0.g;
                                    aVar2.b(tr60Var3, fefVar2);
                                    arrayList82222.add(new b590(str182222, str192222, str202222, charSequence3, str27, charSequence52222, cVar2222, str212222, list22222, y2p0Var2, n3o0Var2222, fefVar2, vj90Var42222, str222222));
                                    aVar = aVar2;
                                    b4p0Var2 = b4p0Var4;
                                    tr60Var2 = tr60Var3;
                                    it = it3;
                                    str14 = str2;
                                    eVar3 = eVar;
                                    coroutineSingletons4 = coroutineSingletons52222;
                                    formattedText = null;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        y2p0Var4 = formattedText;
                        str11 = vj90Var.a;
                        str12 = (String) kotlin.collections.a.P(W);
                        if (W.size() <= 1) {
                        }
                        if (formattedText5 != null) {
                        }
                        FormattedText formattedText72 = formattedText6;
                        arrayList3 = arrayList6;
                        tr60 tr60Var62 = tr60Var2;
                        coroutineSingletons = coroutineSingletons6;
                        str = str13;
                        y2p0Var = y2p0Var4;
                        tr60Var3 = tr60Var62;
                        b4p0Var3 = b4p0Var2;
                        obj = null;
                        eVar = eVar4;
                        formattedText2 = formattedText72;
                        arrayList2 = arrayList3;
                        str4 = str11;
                        it2 = it4;
                        str3 = str12;
                        charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                        }
                        if (formattedText2 != null) {
                        }
                        b4p0 b4p0Var6222 = b4p0Var3;
                        coroutineSingletons2 = coroutineSingletons;
                        str6 = str5;
                        str7 = str;
                        y2p0Var2 = y2p0Var;
                        arrayList = arrayList3;
                        charSequence3 = charSequence2;
                        b4p0Var4 = b4p0Var6222;
                        it3 = it2;
                        obj2 = null;
                        String str1822222 = str6;
                        ArrayList arrayList822222 = arrayList2;
                        String str1922222 = str26;
                        String str2022222 = str7;
                        vj90 vj90Var422222 = vj90Var6;
                        ?? r922222 = (CharSequence) obj2;
                        if (r922222 != 0) {
                        }
                        charSequence4 = vj90Var422222.h;
                        if (charSequence4.length() == 0) {
                        }
                        CharSequence charSequence522222 = charSequence4;
                        kotlinx.serialization.json.c cVar22222 = b4p0Var4.h;
                        CoroutineSingletons coroutineSingletons522222 = coroutineSingletons2;
                        String str2122222 = b4p0Var4.i;
                        List list222222 = vj90Var422222.m;
                        String str2222222 = vj90Var422222.c;
                        n3o0 n3o0Var22222 = n3o0.g;
                        aVar2.b(tr60Var3, fefVar2);
                        arrayList822222.add(new b590(str1822222, str1922222, str2022222, charSequence3, str27, charSequence522222, cVar22222, str2122222, list222222, y2p0Var2, n3o0Var22222, fefVar2, vj90Var422222, str2222222));
                        aVar = aVar2;
                        b4p0Var2 = b4p0Var4;
                        tr60Var2 = tr60Var3;
                        it = it3;
                        str14 = str2;
                        eVar3 = eVar;
                        coroutineSingletons4 = coroutineSingletons522222;
                        formattedText = null;
                        if (it.hasNext()) {
                        }
                    }
                }
            }
        }
        scooterOfferMapper$toScooterTariffs$2 = new ScooterOfferMapper$toScooterTariffs$2(aVar, continuationImpl);
        Object obj42 = scooterOfferMapper$toScooterTariffs$2.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferMapper$toScooterTariffs$2.label;
        xdf xdfVar2 = aVar.c;
        ru.yandex.taxi.widget.utils.e eVar32 = aVar.d;
        String str142 = "";
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0ad8  */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v160, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v247, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r20v27, types: [eer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0c09 -> B:12:0x0c1f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x061f -> B:16:0x0c50). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, fef fefVar, String str, qko0 qko0Var, ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment, CharSequence charSequence, p6p0 p6p0Var, ContinuationImpl continuationImpl) {
        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$1;
        int i;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2;
        CharSequence charSequence2;
        p6p0 p6p0Var2;
        ArrayList arrayList;
        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$12;
        Iterator it;
        fef fefVar2;
        String str2;
        qko0 qko0Var2;
        CoroutineSingletons coroutineSingletons;
        cno0 cno0Var;
        tr60 tr60Var;
        Iterator it2;
        p6p0 p6p0Var3;
        int i2;
        String str3;
        String str4;
        String str5;
        Integer num;
        y2p0 y2p0Var;
        ArrayList arrayList2;
        CharSequence charSequence3;
        Object obj;
        String str6;
        String str7;
        qko0 qko0Var3;
        fef fefVar3;
        CoroutineSingletons coroutineSingletons2;
        CharSequence charSequence4;
        tr60 tr60Var2;
        ArrayList arrayList3;
        p6p0 p6p0Var4;
        Iterator it3;
        Object obj2;
        CoroutineSingletons coroutineSingletons3;
        CharSequence charSequence5;
        CharSequence charSequence6;
        String str8;
        tr60 tr60Var3;
        Iterator it4;
        p6p0 p6p0Var5;
        String str9;
        Object obj3;
        String str10;
        int i3;
        y2p0 y2p0Var2;
        String str11;
        ArrayList arrayList4;
        Integer num2;
        Integer num3;
        tr60 tr60Var4;
        CoroutineSingletons coroutineSingletons4;
        String str12;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        String str13;
        String str14;
        y2p0 y2p0Var3;
        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$13;
        String str15;
        int i4;
        Iterator it5;
        Object obj4;
        kotlinx.serialization.json.c cVar;
        Object obj5;
        List list2;
        String str16;
        CharSequence charSequence10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        String str17;
        String str18;
        Integer num4;
        y2p0 y2p0Var4;
        Iterator it6;
        a aVar;
        p6p0 p6p0Var6;
        CoroutineSingletons coroutineSingletons5;
        CoroutineSingletons coroutineSingletons6;
        String str19;
        cno0 cno0Var2;
        Iterator it7;
        ArrayList arrayList5;
        p6p0 p6p0Var7;
        int i5;
        String str20;
        Integer num5;
        String str21;
        y2p0 y2p0Var5;
        CharSequence charSequence13;
        tr60 tr60Var5;
        fef fefVar4;
        String str22;
        Object obj6;
        CoroutineSingletons coroutineSingletons7;
        String str23;
        CharSequence charSequence14;
        cno0 cno0Var3;
        Integer num6;
        y2p0 y2p0Var6;
        tr60 tr60Var6;
        Iterator it8;
        ArrayList arrayList6;
        p6p0 p6p0Var8;
        CharSequence charSequence15;
        String str24;
        Object obj7;
        String str25;
        String str26;
        String str27;
        int i6;
        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$14;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment3;
        y2p0 y2p0Var7;
        CoroutineSingletons coroutineSingletons8;
        String str28;
        kotlinx.serialization.json.c cVar2;
        CharSequence charSequence16;
        String str29;
        CharSequence charSequence17;
        String str30;
        String str31;
        String str32;
        fef fefVar5;
        Iterator it9;
        Integer num7;
        int i7;
        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$15;
        tr60 tr60Var7;
        Object obj8;
        Object d;
        CoroutineSingletons coroutineSingletons9;
        a aVar2;
        String str33;
        fef fefVar6;
        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$16;
        y2p0 y2p0Var8;
        String str34;
        kotlinx.serialization.json.c cVar3;
        CharSequence charSequence18;
        String str35;
        List list3;
        String str36;
        CharSequence charSequence19;
        Integer num8;
        String str37;
        String str38;
        String str39;
        Object a;
        CoroutineSingletons coroutineSingletons10;
        Integer num9;
        String str40;
        Integer num10;
        String str41;
        y2p0 y2p0Var9;
        String d2;
        String str42;
        Object i8;
        CoroutineSingletons coroutineSingletons11;
        double d3;
        fef fefVar7;
        ArrayList arrayList7;
        xzt0 xzt0Var;
        Object d4;
        String str43;
        Object a2;
        Object i9;
        CoroutineSingletons coroutineSingletons12;
        Object g;
        tr60 tr60Var8;
        int i10;
        int i11;
        p6p0 p6p0Var9;
        Iterator it10;
        ArrayList arrayList8;
        y2p0 y2p0Var10;
        int i12;
        y2p0 y2p0Var11;
        String str44;
        a aVar3 = this;
        if (continuationImpl instanceof ScooterOfferMapper$toScooterTariffs$1) {
            scooterOfferMapper$toScooterTariffs$1 = (ScooterOfferMapper$toScooterTariffs$1) continuationImpl;
            int i13 = scooterOfferMapper$toScooterTariffs$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                scooterOfferMapper$toScooterTariffs$1.label = i13 - Integer.MIN_VALUE;
                Object obj9 = scooterOfferMapper$toScooterTariffs$1.result;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterOfferMapper$toScooterTariffs$1.label;
                String str45 = "";
                cno0 cno0Var4 = aVar3.h;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj9);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj10 : list) {
                            if (hashSet.add(((tr60) obj10).i)) {
                                arrayList9.add(obj10);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it11 = arrayList9.iterator();
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment;
                        charSequence2 = charSequence;
                        p6p0Var2 = p6p0Var;
                        arrayList = arrayList10;
                        scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$1;
                        it = it11;
                        fefVar2 = fefVar;
                        str2 = str;
                        qko0Var2 = qko0Var;
                        if (!it.hasNext()) {
                            tr60 tr60Var9 = (tr60) it.next();
                            OfferType offerType = tr60Var9.i;
                            String str46 = tr60Var9.g;
                            str5 = str45;
                            String str47 = tr60Var9.f;
                            Integer num11 = tr60Var9.k;
                            CoroutineSingletons coroutineSingletons14 = coroutineSingletons13;
                            String str48 = tr60Var9.e;
                            nt60 nt60Var = tr60Var9.p;
                            if (offerType == null) {
                                ArrayList arrayList11 = arrayList;
                                aVar2 = aVar3;
                                arrayList7 = arrayList11;
                                fefVar7 = fefVar2;
                                coroutineSingletons9 = coroutineSingletons14;
                                xzt0Var = null;
                                cno0Var3 = cno0Var4;
                                if (xzt0Var != null) {
                                }
                                a aVar4 = aVar2;
                                arrayList = arrayList7;
                                aVar3 = aVar4;
                                coroutineSingletons13 = coroutineSingletons9;
                                str45 = str5;
                                cno0Var4 = cno0Var3;
                                fefVar2 = fefVar7;
                                if (!it.hasNext()) {
                                }
                            } else {
                                if (nt60Var == null) {
                                    ny61.r("No texts for offer of scooters card V2");
                                    return null;
                                }
                                tpw0 tpw0Var = tr60Var9.q;
                                ScootersSurgeExperiment scootersSurgeExperiment = qko0Var2 != null ? qko0Var2.b : null;
                                if (qko0Var2 != null) {
                                    tr60Var8 = tr60Var9;
                                    if (qko0Var2.a) {
                                        i10 = 1;
                                        if (scootersSurgeExperiment != null || tpw0Var == null) {
                                            i11 = i10;
                                            p6p0Var9 = p6p0Var2;
                                            it10 = it;
                                            arrayList8 = arrayList;
                                            qko0Var3 = qko0Var2;
                                            charSequence3 = charSequence2;
                                            y2p0Var10 = null;
                                        } else {
                                            aVar3.f.getClass();
                                            if (scootersSurgeExperiment.b) {
                                                it10 = it;
                                                ScootersSurgeExperiment.SurgeSettings a3 = q3p0.a(tpw0Var.b, scootersSurgeExperiment);
                                                arrayList8 = arrayList;
                                                ScootersSurgeExperiment.SurgeSettings a4 = q3p0.a(tpw0Var.a, scootersSurgeExperiment);
                                                charSequence3 = charSequence2;
                                                p6p0Var9 = p6p0Var2;
                                                ScootersSurgeExperiment.SurgeSettings a5 = q3p0.a(tpw0Var.c, scootersSurgeExperiment);
                                                i11 = i10;
                                                qko0Var3 = qko0Var2;
                                                double d5 = tpw0Var.b;
                                                String str49 = a4.d;
                                                String Y = d6z.Y(scootersSurgeExperiment, a4.e);
                                                String str50 = a4.f;
                                                String str51 = a5.f;
                                                ScootersSurgeExperiment.SurgeSettings.Content content = a3.h;
                                                List list4 = content.d;
                                                List list5 = tpw0Var.d;
                                                List list6 = content.e;
                                                ListBuilder a6 = rcc.a();
                                                a6.addAll(q3p0.c(list4, scootersSurgeExperiment));
                                                ScootersSurgeExperiment scootersSurgeExperiment2 = list5 != null ? null : scootersSurgeExperiment;
                                                if (list5 == null) {
                                                    list5 = list6;
                                                }
                                                a6.addAll(q3p0.c(list5, scootersSurgeExperiment2));
                                                y2p0Var11 = new y2p0(d5, str49, Y, str50, str51, null, q3p0.b(a3, scootersSurgeExperiment, a6.j()));
                                            } else {
                                                i11 = i10;
                                                p6p0Var9 = p6p0Var2;
                                                it10 = it;
                                                arrayList8 = arrayList;
                                                y2p0Var11 = null;
                                                qko0Var3 = qko0Var2;
                                                charSequence3 = charSequence2;
                                            }
                                            y2p0Var10 = y2p0Var11;
                                        }
                                        i12 = dpm0.a[offerType.ordinal()];
                                        if (i12 == 1) {
                                            tr60 tr60Var10 = tr60Var8;
                                            Iterator it12 = it10;
                                            ArrayList arrayList12 = arrayList8;
                                            p6p0 p6p0Var10 = p6p0Var9;
                                            cno0Var2 = cno0Var4;
                                            String d6 = cno0Var2.d(fefVar2, str46);
                                            scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar2;
                                            scooterOfferMapper$toScooterTariffs$12.L$2 = str2;
                                            scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                                            scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                                            scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                                            scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var10;
                                            scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList12;
                                            scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$11 = it12;
                                            scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var10;
                                            scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var10;
                                            scooterOfferMapper$toScooterTariffs$12.L$19 = str48;
                                            scooterOfferMapper$toScooterTariffs$12.L$20 = num11;
                                            scooterOfferMapper$toScooterTariffs$12.L$21 = str47;
                                            scooterOfferMapper$toScooterTariffs$12.L$22 = d6;
                                            scooterOfferMapper$toScooterTariffs$12.L$23 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$24 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$25 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$26 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$27 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$28 = null;
                                            scooterOfferMapper$toScooterTariffs$12.I$0 = i11;
                                            scooterOfferMapper$toScooterTariffs$12.label = 6;
                                            Object h = aVar3.h(nt60Var, fefVar2, y2p0Var10, scooterOfferMapper$toScooterTariffs$12);
                                            fef fefVar8 = fefVar2;
                                            if (h == coroutineSingletons14) {
                                                return coroutineSingletons14;
                                            }
                                            coroutineSingletons6 = coroutineSingletons14;
                                            it7 = it12;
                                            charSequence13 = charSequence3;
                                            str19 = d6;
                                            num5 = num11;
                                            str21 = str48;
                                            arrayList5 = arrayList12;
                                            tr60Var5 = tr60Var10;
                                            str22 = str47;
                                            obj6 = h;
                                            y2p0Var5 = y2p0Var10;
                                            p6p0Var7 = p6p0Var10;
                                            str20 = str2;
                                            fefVar4 = fefVar8;
                                            i5 = i11;
                                            CharSequence charSequence20 = (CharSequence) obj6;
                                            num9 = tr60Var5.l;
                                            nt60 nt60Var2 = tr60Var5.p;
                                            if (num9 == null) {
                                                str40 = str22;
                                                num10 = num5;
                                                str41 = str21;
                                                y2p0Var9 = y2p0Var5;
                                                d2 = cno0Var2.a(fefVar4, kyh0.scooters_fix_price_template, new e1f0(num9.doubleValue()));
                                            } else {
                                                str40 = str22;
                                                num10 = num5;
                                                str41 = str21;
                                                y2p0Var9 = y2p0Var5;
                                                d2 = (nt60Var2 == null || (str42 = nt60Var2.c) == null) ? null : cno0Var2.d(fefVar4, str42);
                                                if (d2 == null) {
                                                    d2 = str5;
                                                }
                                            }
                                            scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar4;
                                            scooterOfferMapper$toScooterTariffs$12.L$2 = str20;
                                            scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                                            scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                                            scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence13;
                                            scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var7;
                                            scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList5;
                                            scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$11 = it7;
                                            scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var5;
                                            scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                                            y2p0 y2p0Var12 = y2p0Var9;
                                            scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var12;
                                            String str52 = str41;
                                            scooterOfferMapper$toScooterTariffs$12.L$19 = str52;
                                            Integer num12 = num10;
                                            scooterOfferMapper$toScooterTariffs$12.L$20 = num12;
                                            p6p0 p6p0Var11 = p6p0Var7;
                                            scooterOfferMapper$toScooterTariffs$12.L$21 = str40;
                                            scooterOfferMapper$toScooterTariffs$12.L$22 = str19;
                                            scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence20;
                                            scooterOfferMapper$toScooterTariffs$12.L$24 = d2;
                                            scooterOfferMapper$toScooterTariffs$12.I$0 = i5;
                                            scooterOfferMapper$toScooterTariffs$12.label = 7;
                                            i8 = i(nt60Var2, fefVar4, scooterOfferMapper$toScooterTariffs$12);
                                            Iterator it13 = it7;
                                            coroutineSingletons11 = coroutineSingletons6;
                                            if (i8 != coroutineSingletons11) {
                                                return coroutineSingletons11;
                                            }
                                            cno0Var3 = cno0Var2;
                                            num6 = num12;
                                            tr60Var6 = tr60Var5;
                                            i6 = i5;
                                            str25 = str19;
                                            str26 = str40;
                                            coroutineSingletons7 = coroutineSingletons11;
                                            str23 = d2;
                                            y2p0Var6 = y2p0Var12;
                                            arrayList6 = arrayList5;
                                            scooterOfferMapper$toScooterTariffs$14 = scooterOfferMapper$toScooterTariffs$12;
                                            p6p0Var8 = p6p0Var11;
                                            charSequence14 = charSequence20;
                                            charSequence15 = charSequence13;
                                            obj7 = i8;
                                            str27 = str52;
                                            scootersClientInsuranceNewExperiment3 = scootersClientInsuranceNewExperiment2;
                                            str24 = str20;
                                            it8 = it13;
                                            CharSequence charSequence21 = (CharSequence) obj7;
                                            cVar2 = tr60Var6.r;
                                            str39 = tr60Var6.c;
                                            if (str39 == null) {
                                                str39 = str5;
                                            }
                                            boolean z = i6 == 0;
                                            String str53 = str39;
                                            scooterOfferMapper$toScooterTariffs$14.L$0 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$1 = fefVar4;
                                            scooterOfferMapper$toScooterTariffs$14.L$2 = str24;
                                            scooterOfferMapper$toScooterTariffs$14.L$3 = qko0Var3;
                                            scooterOfferMapper$toScooterTariffs$14.L$4 = scootersClientInsuranceNewExperiment3;
                                            scooterOfferMapper$toScooterTariffs$14.L$5 = charSequence15;
                                            scooterOfferMapper$toScooterTariffs$14.L$6 = p6p0Var8;
                                            scooterOfferMapper$toScooterTariffs$14.L$7 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$8 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$9 = arrayList6;
                                            scooterOfferMapper$toScooterTariffs$14.L$10 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$11 = it8;
                                            scooterOfferMapper$toScooterTariffs$14.L$12 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$13 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$14 = tr60Var6;
                                            scooterOfferMapper$toScooterTariffs$14.L$15 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$16 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$17 = null;
                                            scooterOfferMapper$toScooterTariffs$14.L$18 = y2p0Var6;
                                            scooterOfferMapper$toScooterTariffs$14.L$19 = str27;
                                            scooterOfferMapper$toScooterTariffs$14.L$20 = num6;
                                            scooterOfferMapper$toScooterTariffs$14.L$21 = str26;
                                            scooterOfferMapper$toScooterTariffs$14.L$22 = str25;
                                            CharSequence charSequence22 = charSequence14;
                                            scooterOfferMapper$toScooterTariffs$14.L$23 = charSequence22;
                                            y2p0 y2p0Var13 = y2p0Var6;
                                            scooterOfferMapper$toScooterTariffs$14.L$24 = str23;
                                            scooterOfferMapper$toScooterTariffs$14.L$25 = charSequence21;
                                            scooterOfferMapper$toScooterTariffs$14.L$26 = cVar2;
                                            scooterOfferMapper$toScooterTariffs$14.L$27 = str53;
                                            int i14 = i6;
                                            scooterOfferMapper$toScooterTariffs$14.I$0 = i14;
                                            scooterOfferMapper$toScooterTariffs$14.label = 8;
                                            Iterator it14 = it8;
                                            a = a(tr60Var6, fefVar4, z, scooterOfferMapper$toScooterTariffs$14);
                                            tr60 tr60Var11 = tr60Var6;
                                            coroutineSingletons10 = coroutineSingletons7;
                                            if (a != coroutineSingletons10) {
                                                str29 = str23;
                                                i7 = i14;
                                                coroutineSingletons8 = coroutineSingletons10;
                                                str30 = str25;
                                                str31 = str26;
                                                y2p0Var7 = y2p0Var13;
                                                str28 = str53;
                                                charSequence16 = charSequence21;
                                                obj8 = a;
                                                num7 = num6;
                                                str32 = str27;
                                                it9 = it14;
                                                fefVar5 = fefVar4;
                                                charSequence17 = charSequence22;
                                                tr60Var7 = tr60Var11;
                                                scooterOfferMapper$toScooterTariffs$15 = scooterOfferMapper$toScooterTariffs$14;
                                                List list7 = (List) obj8;
                                                u4w u4wVar = tr60Var7.s;
                                                scooterOfferMapper$toScooterTariffs$15.L$0 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$1 = fefVar5;
                                                scooterOfferMapper$toScooterTariffs$15.L$2 = str24;
                                                scooterOfferMapper$toScooterTariffs$15.L$3 = qko0Var3;
                                                scooterOfferMapper$toScooterTariffs$15.L$4 = scootersClientInsuranceNewExperiment3;
                                                scooterOfferMapper$toScooterTariffs$15.L$5 = charSequence15;
                                                scooterOfferMapper$toScooterTariffs$15.L$6 = p6p0Var8;
                                                scooterOfferMapper$toScooterTariffs$15.L$7 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$8 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$9 = arrayList6;
                                                scooterOfferMapper$toScooterTariffs$15.L$10 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$11 = it9;
                                                scooterOfferMapper$toScooterTariffs$15.L$12 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$13 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$14 = tr60Var7;
                                                scooterOfferMapper$toScooterTariffs$15.L$15 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$16 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$17 = null;
                                                scooterOfferMapper$toScooterTariffs$15.L$18 = y2p0Var7;
                                                scooterOfferMapper$toScooterTariffs$15.L$19 = str32;
                                                scooterOfferMapper$toScooterTariffs$15.L$20 = num7;
                                                scooterOfferMapper$toScooterTariffs$15.L$21 = str31;
                                                scooterOfferMapper$toScooterTariffs$15.L$22 = str30;
                                                CharSequence charSequence23 = charSequence17;
                                                scooterOfferMapper$toScooterTariffs$15.L$23 = charSequence23;
                                                String str54 = str31;
                                                scooterOfferMapper$toScooterTariffs$15.L$24 = str29;
                                                scooterOfferMapper$toScooterTariffs$15.L$25 = charSequence16;
                                                scooterOfferMapper$toScooterTariffs$15.L$26 = cVar2;
                                                scooterOfferMapper$toScooterTariffs$15.L$27 = str28;
                                                scooterOfferMapper$toScooterTariffs$15.L$28 = list7;
                                                scooterOfferMapper$toScooterTariffs$15.I$0 = i7;
                                                scooterOfferMapper$toScooterTariffs$15.label = 9;
                                                fef fefVar9 = fefVar5;
                                                String str55 = str24;
                                                ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$17 = scooterOfferMapper$toScooterTariffs$15;
                                                d = d(u4wVar, str55, scootersClientInsuranceNewExperiment3, charSequence15, p6p0Var8, fefVar9, scooterOfferMapper$toScooterTariffs$17);
                                                CoroutineSingletons coroutineSingletons15 = coroutineSingletons8;
                                                String str56 = str30;
                                                coroutineSingletons9 = coroutineSingletons15;
                                                aVar2 = this;
                                                str33 = str55;
                                                fefVar6 = fefVar9;
                                                scooterOfferMapper$toScooterTariffs$16 = scooterOfferMapper$toScooterTariffs$17;
                                                if (d != coroutineSingletons9) {
                                                    return coroutineSingletons9;
                                                }
                                                y2p0Var8 = y2p0Var7;
                                                str34 = str28;
                                                cVar3 = cVar2;
                                                charSequence18 = charSequence16;
                                                str35 = str54;
                                                list3 = list7;
                                                str36 = str32;
                                                charSequence19 = charSequence23;
                                                num8 = num7;
                                                str37 = str29;
                                                str38 = str56;
                                                n3o0 n3o0Var = (n3o0) d;
                                                aVar2.b(tr60Var7, fefVar6);
                                                boolean z2 = tr60Var7.h;
                                                str44 = tr60Var7.m;
                                                if (str44 == null) {
                                                    str44 = str5;
                                                }
                                                fefVar7 = fefVar6;
                                                ?? eerVar = new eer(str36, num8, str35, str38, charSequence19, str37, charSequence18, cVar3, str34, list3, y2p0Var8, n3o0Var, fefVar7, z2, new mf1((byte) 0, 10, str44), tr60Var7.o);
                                                qko0Var2 = qko0Var3;
                                                p6p0Var2 = p6p0Var8;
                                                arrayList7 = arrayList6;
                                                str2 = str33;
                                                scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$16;
                                                scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment3;
                                                it = it9;
                                                xzt0Var = eerVar;
                                                charSequence2 = charSequence15;
                                                if (xzt0Var != null) {
                                                    arrayList7.add(xzt0Var);
                                                }
                                                a aVar42 = aVar2;
                                                arrayList = arrayList7;
                                                aVar3 = aVar42;
                                                coroutineSingletons13 = coroutineSingletons9;
                                                str45 = str5;
                                                cno0Var4 = cno0Var3;
                                                fefVar2 = fefVar7;
                                                if (!it.hasNext()) {
                                                    return arrayList;
                                                }
                                            }
                                            return coroutineSingletons10;
                                        }
                                        if (i12 != 2) {
                                            w511.b();
                                            return null;
                                        }
                                        String d7 = cno0Var4.d(fefVar2, str46);
                                        scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar2;
                                        scooterOfferMapper$toScooterTariffs$12.L$2 = str2;
                                        scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                                        scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                                        scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                                        p6p0 p6p0Var12 = p6p0Var9;
                                        scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var12;
                                        scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                                        ArrayList arrayList13 = arrayList8;
                                        scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList13;
                                        scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                                        Iterator it15 = it10;
                                        scooterOfferMapper$toScooterTariffs$12.L$11 = it15;
                                        scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                                        tr60 tr60Var12 = tr60Var8;
                                        scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var12;
                                        scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var10;
                                        str7 = str48;
                                        scooterOfferMapper$toScooterTariffs$12.L$19 = str7;
                                        scooterOfferMapper$toScooterTariffs$12.L$20 = num11;
                                        scooterOfferMapper$toScooterTariffs$12.L$21 = str47;
                                        scooterOfferMapper$toScooterTariffs$12.L$22 = d7;
                                        scooterOfferMapper$toScooterTariffs$12.L$23 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$24 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$25 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$26 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$27 = null;
                                        scooterOfferMapper$toScooterTariffs$12.L$28 = null;
                                        scooterOfferMapper$toScooterTariffs$12.I$0 = i11;
                                        scooterOfferMapper$toScooterTariffs$12.label = 1;
                                        Object h2 = aVar3.h(nt60Var, fefVar2, y2p0Var10, scooterOfferMapper$toScooterTariffs$12);
                                        coroutineSingletons12 = coroutineSingletons14;
                                        if (h2 != coroutineSingletons12) {
                                            String str57 = str2;
                                            fefVar3 = fefVar2;
                                            tr60Var = tr60Var12;
                                            y2p0Var = y2p0Var10;
                                            str3 = str57;
                                            coroutineSingletons = coroutineSingletons12;
                                            cno0Var = cno0Var4;
                                            p6p0Var3 = p6p0Var12;
                                            arrayList2 = arrayList13;
                                            it2 = it15;
                                            str4 = str47;
                                            i2 = i11;
                                            str6 = d7;
                                            num = num11;
                                            obj = h2;
                                            CharSequence charSequence24 = (CharSequence) obj;
                                            nt60 nt60Var3 = tr60Var.p;
                                            scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar3;
                                            scooterOfferMapper$toScooterTariffs$12.L$2 = str3;
                                            scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                                            scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                                            scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                                            scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var3;
                                            scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList2;
                                            scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$11 = it2;
                                            scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var;
                                            scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                                            scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var;
                                            scooterOfferMapper$toScooterTariffs$12.L$19 = str7;
                                            scooterOfferMapper$toScooterTariffs$12.L$20 = num;
                                            scooterOfferMapper$toScooterTariffs$12.L$21 = str4;
                                            scooterOfferMapper$toScooterTariffs$12.L$22 = str6;
                                            scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence24;
                                            p6p0 p6p0Var13 = p6p0Var3;
                                            scooterOfferMapper$toScooterTariffs$12.I$0 = i2;
                                            scooterOfferMapper$toScooterTariffs$12.label = 2;
                                            tr60 tr60Var13 = tr60Var;
                                            g = g(nt60Var3, fefVar3, y2p0Var, scooterOfferMapper$toScooterTariffs$12);
                                            ArrayList arrayList14 = arrayList2;
                                            coroutineSingletons12 = coroutineSingletons;
                                            if (g != coroutineSingletons12) {
                                                obj2 = g;
                                                coroutineSingletons2 = coroutineSingletons12;
                                                it3 = it2;
                                                tr60Var2 = tr60Var13;
                                                p6p0Var4 = p6p0Var13;
                                                charSequence4 = charSequence24;
                                                arrayList3 = arrayList14;
                                                CharSequence charSequence25 = (CharSequence) obj2;
                                                nt60 nt60Var4 = tr60Var2.p;
                                                scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar3;
                                                scooterOfferMapper$toScooterTariffs$12.L$2 = str3;
                                                scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                                                scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                                                scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                                                scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var4;
                                                scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList3;
                                                scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$11 = it3;
                                                scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var2;
                                                scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                                                scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var;
                                                scooterOfferMapper$toScooterTariffs$12.L$19 = str7;
                                                scooterOfferMapper$toScooterTariffs$12.L$20 = num;
                                                scooterOfferMapper$toScooterTariffs$12.L$21 = str4;
                                                scooterOfferMapper$toScooterTariffs$12.L$22 = str6;
                                                CharSequence charSequence26 = charSequence4;
                                                scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence26;
                                                p6p0 p6p0Var14 = p6p0Var4;
                                                scooterOfferMapper$toScooterTariffs$12.L$24 = charSequence25;
                                                scooterOfferMapper$toScooterTariffs$12.I$0 = i2;
                                                scooterOfferMapper$toScooterTariffs$12.label = 3;
                                                tr60 tr60Var14 = tr60Var2;
                                                i9 = i(nt60Var4, fefVar3, scooterOfferMapper$toScooterTariffs$12);
                                                Iterator it16 = it3;
                                                coroutineSingletons12 = coroutineSingletons2;
                                                if (i9 != coroutineSingletons12) {
                                                    charSequence6 = charSequence26;
                                                    p6p0Var5 = p6p0Var14;
                                                    coroutineSingletons3 = coroutineSingletons12;
                                                    y2p0Var2 = y2p0Var;
                                                    i3 = i2;
                                                    tr60Var3 = tr60Var14;
                                                    charSequence5 = charSequence25;
                                                    obj3 = i9;
                                                    str10 = str4;
                                                    str8 = str7;
                                                    num2 = num;
                                                    str11 = str6;
                                                    arrayList4 = arrayList3;
                                                    str9 = str3;
                                                    it4 = it16;
                                                    CharSequence charSequence27 = (CharSequence) obj3;
                                                    str43 = tr60Var3.c;
                                                    if (str43 == null) {
                                                        str43 = str5;
                                                    }
                                                    boolean z3 = i3 == 0;
                                                    String str58 = str43;
                                                    scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar3;
                                                    scooterOfferMapper$toScooterTariffs$12.L$2 = str9;
                                                    scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                                                    scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                                                    scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                                                    scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var5;
                                                    scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList4;
                                                    scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$11 = it4;
                                                    scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var3;
                                                    scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                                                    scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var2;
                                                    scooterOfferMapper$toScooterTariffs$12.L$19 = str8;
                                                    scooterOfferMapper$toScooterTariffs$12.L$20 = num2;
                                                    scooterOfferMapper$toScooterTariffs$12.L$21 = str10;
                                                    scooterOfferMapper$toScooterTariffs$12.L$22 = str11;
                                                    CharSequence charSequence28 = charSequence6;
                                                    scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence28;
                                                    String str59 = str8;
                                                    scooterOfferMapper$toScooterTariffs$12.L$24 = charSequence5;
                                                    scooterOfferMapper$toScooterTariffs$12.L$25 = charSequence27;
                                                    scooterOfferMapper$toScooterTariffs$12.L$26 = str58;
                                                    int i15 = i3;
                                                    scooterOfferMapper$toScooterTariffs$12.I$0 = i15;
                                                    scooterOfferMapper$toScooterTariffs$12.label = 4;
                                                    Iterator it17 = it4;
                                                    a2 = a(tr60Var3, fefVar3, z3, scooterOfferMapper$toScooterTariffs$12);
                                                    tr60 tr60Var15 = tr60Var3;
                                                    coroutineSingletons10 = coroutineSingletons3;
                                                    if (a2 != coroutineSingletons10) {
                                                        charSequence8 = charSequence5;
                                                        i4 = i15;
                                                        coroutineSingletons4 = coroutineSingletons10;
                                                        y2p0Var3 = y2p0Var2;
                                                        str13 = str11;
                                                        num3 = num2;
                                                        it5 = it17;
                                                        tr60Var4 = tr60Var15;
                                                        charSequence9 = charSequence28;
                                                        scooterOfferMapper$toScooterTariffs$13 = scooterOfferMapper$toScooterTariffs$12;
                                                        str14 = str10;
                                                        str15 = str59;
                                                        str12 = str58;
                                                        charSequence7 = charSequence27;
                                                        obj4 = a2;
                                                        List list8 = (List) obj4;
                                                        kotlinx.serialization.json.c cVar4 = tr60Var4.r;
                                                        u4w u4wVar2 = tr60Var4.s;
                                                        scooterOfferMapper$toScooterTariffs$13.L$0 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$1 = fefVar3;
                                                        scooterOfferMapper$toScooterTariffs$13.L$2 = str9;
                                                        scooterOfferMapper$toScooterTariffs$13.L$3 = qko0Var3;
                                                        scooterOfferMapper$toScooterTariffs$13.L$4 = scootersClientInsuranceNewExperiment2;
                                                        scooterOfferMapper$toScooterTariffs$13.L$5 = charSequence3;
                                                        scooterOfferMapper$toScooterTariffs$13.L$6 = p6p0Var5;
                                                        scooterOfferMapper$toScooterTariffs$13.L$7 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$8 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$9 = arrayList4;
                                                        scooterOfferMapper$toScooterTariffs$13.L$10 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$11 = it5;
                                                        scooterOfferMapper$toScooterTariffs$13.L$12 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$13 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$14 = tr60Var4;
                                                        scooterOfferMapper$toScooterTariffs$13.L$15 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$16 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$17 = null;
                                                        scooterOfferMapper$toScooterTariffs$13.L$18 = y2p0Var3;
                                                        scooterOfferMapper$toScooterTariffs$13.L$19 = str15;
                                                        scooterOfferMapper$toScooterTariffs$13.L$20 = num3;
                                                        scooterOfferMapper$toScooterTariffs$13.L$21 = str14;
                                                        scooterOfferMapper$toScooterTariffs$13.L$22 = str13;
                                                        CharSequence charSequence29 = charSequence9;
                                                        scooterOfferMapper$toScooterTariffs$13.L$23 = charSequence29;
                                                        str17 = str13;
                                                        scooterOfferMapper$toScooterTariffs$13.L$24 = charSequence8;
                                                        scooterOfferMapper$toScooterTariffs$13.L$25 = charSequence7;
                                                        scooterOfferMapper$toScooterTariffs$13.L$26 = str12;
                                                        scooterOfferMapper$toScooterTariffs$13.L$27 = list8;
                                                        scooterOfferMapper$toScooterTariffs$13.L$28 = cVar4;
                                                        scooterOfferMapper$toScooterTariffs$13.I$0 = i4;
                                                        scooterOfferMapper$toScooterTariffs$13.label = 5;
                                                        p6p0 p6p0Var15 = p6p0Var5;
                                                        d4 = d(u4wVar2, str9, scootersClientInsuranceNewExperiment2, charSequence3, p6p0Var15, fefVar3, scooterOfferMapper$toScooterTariffs$13);
                                                        it6 = it5;
                                                        coroutineSingletons5 = coroutineSingletons4;
                                                        aVar = this;
                                                        if (d4 != coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        y2p0Var4 = y2p0Var3;
                                                        str16 = str12;
                                                        charSequence10 = charSequence7;
                                                        list2 = list8;
                                                        cVar = cVar4;
                                                        obj5 = d4;
                                                        charSequence12 = charSequence29;
                                                        num4 = num3;
                                                        charSequence11 = charSequence8;
                                                        p6p0Var6 = p6p0Var15;
                                                        str18 = str14;
                                                        String str60 = str15;
                                                        n3o0 n3o0Var2 = (n3o0) obj5;
                                                        aVar.b(tr60Var4, fefVar3);
                                                        q1f0 q1f0Var = tr60Var4.j;
                                                        d3 = q1f0Var == null ? q1f0Var.c : 0;
                                                        p6p0 p6p0Var16 = p6p0Var6;
                                                        double d8 = q1f0Var == null ? q1f0Var.a : 0;
                                                        if (d3 <= 0.0d) {
                                                            cno0 cno0Var5 = cno0Var;
                                                            cno0Var5.a(fefVar3, kyh0.scooters_price_template_with_min_cost, new e1f0(d3), new e1f0(d8));
                                                            fefVar7 = fefVar3;
                                                            str2 = str9;
                                                            coroutineSingletons9 = coroutineSingletons5;
                                                            arrayList7 = arrayList4;
                                                            qko0Var2 = qko0Var3;
                                                            cno0Var3 = cno0Var5;
                                                            scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$13;
                                                            charSequence2 = charSequence3;
                                                            it = it6;
                                                            p6p0Var2 = p6p0Var16;
                                                            aVar2 = aVar;
                                                            xzt0Var = new xzt0(str60, num4, str18, str17, charSequence12, charSequence11, charSequence10, cVar, str16, list2, y2p0Var4, n3o0Var2, fefVar7);
                                                        } else {
                                                            cno0 cno0Var6 = cno0Var;
                                                            cno0Var6.a(fefVar3, kyh0.scooters_price_template_without_min_cost, new e1f0(d8));
                                                            fefVar7 = fefVar3;
                                                            str2 = str9;
                                                            coroutineSingletons9 = coroutineSingletons5;
                                                            arrayList7 = arrayList4;
                                                            qko0Var2 = qko0Var3;
                                                            cno0Var3 = cno0Var6;
                                                            scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$13;
                                                            charSequence2 = charSequence3;
                                                            it = it6;
                                                            p6p0Var2 = p6p0Var16;
                                                            aVar2 = aVar;
                                                            xzt0Var = new xzt0(str60, num4, str18, str17, charSequence12, charSequence11, charSequence10, cVar, str16, list2, y2p0Var4, n3o0Var2, fefVar7);
                                                        }
                                                        if (xzt0Var != null) {
                                                        }
                                                        a aVar422 = aVar2;
                                                        arrayList = arrayList7;
                                                        aVar3 = aVar422;
                                                        coroutineSingletons13 = coroutineSingletons9;
                                                        str45 = str5;
                                                        cno0Var4 = cno0Var3;
                                                        fefVar2 = fefVar7;
                                                        if (!it.hasNext()) {
                                                        }
                                                    }
                                                    return coroutineSingletons10;
                                                }
                                            }
                                        }
                                        return coroutineSingletons12;
                                    }
                                } else {
                                    tr60Var8 = tr60Var9;
                                }
                                i10 = 0;
                                if (scootersSurgeExperiment != null) {
                                }
                                i11 = i10;
                                p6p0Var9 = p6p0Var2;
                                it10 = it;
                                arrayList8 = arrayList;
                                qko0Var3 = qko0Var2;
                                charSequence3 = charSequence2;
                                y2p0Var10 = null;
                                i12 = dpm0.a[offerType.ordinal()];
                                if (i12 == 1) {
                                }
                            }
                        }
                        break;
                    case 1:
                        int i16 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        String str61 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str62 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num13 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str63 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var14 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var16 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it18 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r13 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var17 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence30 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment4 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var4 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str64 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar10 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons = coroutineSingletons13;
                        cno0Var = cno0Var4;
                        tr60Var = tr60Var16;
                        it2 = it18;
                        p6p0Var3 = p6p0Var17;
                        i2 = i16;
                        str3 = str64;
                        str4 = str62;
                        str5 = "";
                        num = num13;
                        y2p0Var = y2p0Var14;
                        arrayList2 = r13;
                        charSequence3 = charSequence30;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment4;
                        obj = obj9;
                        scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$1;
                        str6 = str61;
                        str7 = str63;
                        qko0Var3 = qko0Var4;
                        fefVar3 = fefVar10;
                        CharSequence charSequence242 = (CharSequence) obj;
                        nt60 nt60Var32 = tr60Var.p;
                        scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar3;
                        scooterOfferMapper$toScooterTariffs$12.L$2 = str3;
                        scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                        scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                        scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var3;
                        scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList2;
                        scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$11 = it2;
                        scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var;
                        scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var;
                        scooterOfferMapper$toScooterTariffs$12.L$19 = str7;
                        scooterOfferMapper$toScooterTariffs$12.L$20 = num;
                        scooterOfferMapper$toScooterTariffs$12.L$21 = str4;
                        scooterOfferMapper$toScooterTariffs$12.L$22 = str6;
                        scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence242;
                        p6p0 p6p0Var132 = p6p0Var3;
                        scooterOfferMapper$toScooterTariffs$12.I$0 = i2;
                        scooterOfferMapper$toScooterTariffs$12.label = 2;
                        tr60 tr60Var132 = tr60Var;
                        g = g(nt60Var32, fefVar3, y2p0Var, scooterOfferMapper$toScooterTariffs$12);
                        ArrayList arrayList142 = arrayList2;
                        coroutineSingletons12 = coroutineSingletons;
                        if (g != coroutineSingletons12) {
                        }
                        return coroutineSingletons12;
                    case 2:
                        int i17 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        CharSequence charSequence31 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str65 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str66 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num14 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str67 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var15 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var17 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it19 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r14 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var18 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence32 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment5 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var5 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str68 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar11 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons2 = coroutineSingletons13;
                        charSequence4 = charSequence31;
                        cno0Var = cno0Var4;
                        tr60Var2 = tr60Var17;
                        arrayList3 = r14;
                        p6p0Var4 = p6p0Var18;
                        i2 = i17;
                        str3 = str68;
                        str5 = "";
                        num = num14;
                        str7 = str67;
                        y2p0Var = y2p0Var15;
                        it3 = it19;
                        charSequence3 = charSequence32;
                        qko0Var3 = qko0Var5;
                        obj2 = obj9;
                        scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$1;
                        str4 = str66;
                        fefVar3 = fefVar11;
                        str6 = str65;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment5;
                        CharSequence charSequence252 = (CharSequence) obj2;
                        nt60 nt60Var42 = tr60Var2.p;
                        scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar3;
                        scooterOfferMapper$toScooterTariffs$12.L$2 = str3;
                        scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                        scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                        scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var4;
                        scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList3;
                        scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$11 = it3;
                        scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var2;
                        scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var;
                        scooterOfferMapper$toScooterTariffs$12.L$19 = str7;
                        scooterOfferMapper$toScooterTariffs$12.L$20 = num;
                        scooterOfferMapper$toScooterTariffs$12.L$21 = str4;
                        scooterOfferMapper$toScooterTariffs$12.L$22 = str6;
                        CharSequence charSequence262 = charSequence4;
                        scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence262;
                        p6p0 p6p0Var142 = p6p0Var4;
                        scooterOfferMapper$toScooterTariffs$12.L$24 = charSequence252;
                        scooterOfferMapper$toScooterTariffs$12.I$0 = i2;
                        scooterOfferMapper$toScooterTariffs$12.label = 3;
                        tr60 tr60Var142 = tr60Var2;
                        i9 = i(nt60Var42, fefVar3, scooterOfferMapper$toScooterTariffs$12);
                        Iterator it162 = it3;
                        coroutineSingletons12 = coroutineSingletons2;
                        if (i9 != coroutineSingletons12) {
                        }
                        return coroutineSingletons12;
                    case 3:
                        int i18 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        CharSequence charSequence33 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$24;
                        CharSequence charSequence34 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str69 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str70 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num15 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str71 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var16 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var18 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it20 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r15 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var19 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence35 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment6 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var6 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str72 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar12 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons3 = coroutineSingletons13;
                        charSequence5 = charSequence33;
                        charSequence6 = charSequence34;
                        cno0Var = cno0Var4;
                        str8 = str71;
                        tr60Var3 = tr60Var18;
                        it4 = it20;
                        p6p0Var5 = p6p0Var19;
                        charSequence3 = charSequence35;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment6;
                        str9 = str72;
                        obj3 = obj9;
                        str10 = str70;
                        i3 = i18;
                        qko0Var3 = qko0Var6;
                        str5 = "";
                        y2p0Var2 = y2p0Var16;
                        str11 = str69;
                        arrayList4 = r15;
                        num2 = num15;
                        scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$1;
                        fefVar3 = fefVar12;
                        CharSequence charSequence272 = (CharSequence) obj3;
                        str43 = tr60Var3.c;
                        if (str43 == null) {
                        }
                        if (i3 == 0) {
                        }
                        String str582 = str43;
                        scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar3;
                        scooterOfferMapper$toScooterTariffs$12.L$2 = str9;
                        scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                        scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence3;
                        scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var5;
                        scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList4;
                        scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$11 = it4;
                        scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var3;
                        scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var2;
                        scooterOfferMapper$toScooterTariffs$12.L$19 = str8;
                        scooterOfferMapper$toScooterTariffs$12.L$20 = num2;
                        scooterOfferMapper$toScooterTariffs$12.L$21 = str10;
                        scooterOfferMapper$toScooterTariffs$12.L$22 = str11;
                        CharSequence charSequence282 = charSequence6;
                        scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence282;
                        String str592 = str8;
                        scooterOfferMapper$toScooterTariffs$12.L$24 = charSequence5;
                        scooterOfferMapper$toScooterTariffs$12.L$25 = charSequence272;
                        scooterOfferMapper$toScooterTariffs$12.L$26 = str582;
                        int i152 = i3;
                        scooterOfferMapper$toScooterTariffs$12.I$0 = i152;
                        scooterOfferMapper$toScooterTariffs$12.label = 4;
                        Iterator it172 = it4;
                        a2 = a(tr60Var3, fefVar3, z3, scooterOfferMapper$toScooterTariffs$12);
                        tr60 tr60Var152 = tr60Var3;
                        coroutineSingletons10 = coroutineSingletons3;
                        if (a2 != coroutineSingletons10) {
                        }
                        return coroutineSingletons10;
                    case 4:
                        int i19 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        String str73 = (String) scooterOfferMapper$toScooterTariffs$1.L$26;
                        CharSequence charSequence36 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$25;
                        CharSequence charSequence37 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$24;
                        CharSequence charSequence38 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str74 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str75 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        num3 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str76 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var17 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60Var4 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it21 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r1 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var20 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence39 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment7 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var7 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str77 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar13 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons4 = coroutineSingletons13;
                        str12 = str73;
                        charSequence7 = charSequence36;
                        cno0Var = cno0Var4;
                        charSequence8 = charSequence37;
                        charSequence9 = charSequence38;
                        str13 = str74;
                        str14 = str75;
                        y2p0Var3 = y2p0Var17;
                        arrayList4 = r1;
                        p6p0Var5 = p6p0Var20;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment7;
                        qko0Var3 = qko0Var7;
                        str9 = str77;
                        scooterOfferMapper$toScooterTariffs$13 = scooterOfferMapper$toScooterTariffs$1;
                        str15 = str76;
                        fefVar3 = fefVar13;
                        charSequence3 = charSequence39;
                        i4 = i19;
                        str5 = "";
                        it5 = it21;
                        obj4 = obj9;
                        List list82 = (List) obj4;
                        kotlinx.serialization.json.c cVar42 = tr60Var4.r;
                        u4w u4wVar22 = tr60Var4.s;
                        scooterOfferMapper$toScooterTariffs$13.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$1 = fefVar3;
                        scooterOfferMapper$toScooterTariffs$13.L$2 = str9;
                        scooterOfferMapper$toScooterTariffs$13.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$13.L$4 = scootersClientInsuranceNewExperiment2;
                        scooterOfferMapper$toScooterTariffs$13.L$5 = charSequence3;
                        scooterOfferMapper$toScooterTariffs$13.L$6 = p6p0Var5;
                        scooterOfferMapper$toScooterTariffs$13.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$9 = arrayList4;
                        scooterOfferMapper$toScooterTariffs$13.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$11 = it5;
                        scooterOfferMapper$toScooterTariffs$13.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$14 = tr60Var4;
                        scooterOfferMapper$toScooterTariffs$13.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$17 = null;
                        scooterOfferMapper$toScooterTariffs$13.L$18 = y2p0Var3;
                        scooterOfferMapper$toScooterTariffs$13.L$19 = str15;
                        scooterOfferMapper$toScooterTariffs$13.L$20 = num3;
                        scooterOfferMapper$toScooterTariffs$13.L$21 = str14;
                        scooterOfferMapper$toScooterTariffs$13.L$22 = str13;
                        CharSequence charSequence292 = charSequence9;
                        scooterOfferMapper$toScooterTariffs$13.L$23 = charSequence292;
                        str17 = str13;
                        scooterOfferMapper$toScooterTariffs$13.L$24 = charSequence8;
                        scooterOfferMapper$toScooterTariffs$13.L$25 = charSequence7;
                        scooterOfferMapper$toScooterTariffs$13.L$26 = str12;
                        scooterOfferMapper$toScooterTariffs$13.L$27 = list82;
                        scooterOfferMapper$toScooterTariffs$13.L$28 = cVar42;
                        scooterOfferMapper$toScooterTariffs$13.I$0 = i4;
                        scooterOfferMapper$toScooterTariffs$13.label = 5;
                        p6p0 p6p0Var152 = p6p0Var5;
                        d4 = d(u4wVar22, str9, scootersClientInsuranceNewExperiment2, charSequence3, p6p0Var152, fefVar3, scooterOfferMapper$toScooterTariffs$13);
                        it6 = it5;
                        coroutineSingletons5 = coroutineSingletons4;
                        aVar = this;
                        if (d4 != coroutineSingletons5) {
                        }
                        break;
                    case 5:
                        kotlinx.serialization.json.c cVar5 = (kotlinx.serialization.json.c) scooterOfferMapper$toScooterTariffs$1.L$28;
                        List list9 = (List) scooterOfferMapper$toScooterTariffs$1.L$27;
                        String str78 = (String) scooterOfferMapper$toScooterTariffs$1.L$26;
                        CharSequence charSequence40 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$25;
                        CharSequence charSequence41 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$24;
                        CharSequence charSequence42 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str79 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str80 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num16 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        str15 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var18 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var19 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it22 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r12 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var21 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence43 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment8 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var8 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str81 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar14 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        cVar = cVar5;
                        obj5 = obj9;
                        list2 = list9;
                        str16 = str78;
                        charSequence10 = charSequence40;
                        charSequence11 = charSequence41;
                        charSequence12 = charSequence42;
                        str17 = str79;
                        str18 = str80;
                        num4 = num16;
                        y2p0Var4 = y2p0Var18;
                        qko0Var3 = qko0Var8;
                        str9 = str81;
                        tr60Var4 = tr60Var19;
                        it6 = it22;
                        arrayList4 = r12;
                        charSequence3 = charSequence43;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment8;
                        scooterOfferMapper$toScooterTariffs$13 = scooterOfferMapper$toScooterTariffs$1;
                        str5 = "";
                        fefVar3 = fefVar14;
                        aVar = aVar3;
                        cno0Var = cno0Var4;
                        p6p0Var6 = p6p0Var21;
                        coroutineSingletons5 = coroutineSingletons13;
                        String str602 = str15;
                        n3o0 n3o0Var22 = (n3o0) obj5;
                        aVar.b(tr60Var4, fefVar3);
                        q1f0 q1f0Var2 = tr60Var4.j;
                        d3 = q1f0Var2 == null ? q1f0Var2.c : 0;
                        p6p0 p6p0Var162 = p6p0Var6;
                        double d82 = q1f0Var2 == null ? q1f0Var2.a : 0;
                        if (d3 <= 0.0d) {
                        }
                        if (xzt0Var != null) {
                        }
                        a aVar4222 = aVar2;
                        arrayList = arrayList7;
                        aVar3 = aVar4222;
                        coroutineSingletons13 = coroutineSingletons9;
                        str45 = str5;
                        cno0Var4 = cno0Var3;
                        fefVar2 = fefVar7;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        int i20 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        String str82 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str83 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num17 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str84 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var19 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var20 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it23 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r132 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var22 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence44 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment9 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var9 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str85 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar15 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons6 = coroutineSingletons13;
                        str19 = str82;
                        cno0Var2 = cno0Var4;
                        it7 = it23;
                        arrayList5 = r132;
                        p6p0Var7 = p6p0Var22;
                        i5 = i20;
                        str20 = str85;
                        str5 = "";
                        num5 = num17;
                        str21 = str84;
                        y2p0Var5 = y2p0Var19;
                        charSequence13 = charSequence44;
                        qko0Var3 = qko0Var9;
                        scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$1;
                        tr60Var5 = tr60Var20;
                        fefVar4 = fefVar15;
                        str22 = str83;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment9;
                        obj6 = obj9;
                        CharSequence charSequence202 = (CharSequence) obj6;
                        num9 = tr60Var5.l;
                        nt60 nt60Var22 = tr60Var5.p;
                        if (num9 == null) {
                        }
                        scooterOfferMapper$toScooterTariffs$12.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$1 = fefVar4;
                        scooterOfferMapper$toScooterTariffs$12.L$2 = str20;
                        scooterOfferMapper$toScooterTariffs$12.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$12.L$4 = scootersClientInsuranceNewExperiment2;
                        scooterOfferMapper$toScooterTariffs$12.L$5 = charSequence13;
                        scooterOfferMapper$toScooterTariffs$12.L$6 = p6p0Var7;
                        scooterOfferMapper$toScooterTariffs$12.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$9 = arrayList5;
                        scooterOfferMapper$toScooterTariffs$12.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$11 = it7;
                        scooterOfferMapper$toScooterTariffs$12.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$14 = tr60Var5;
                        scooterOfferMapper$toScooterTariffs$12.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$12.L$17 = null;
                        y2p0 y2p0Var122 = y2p0Var9;
                        scooterOfferMapper$toScooterTariffs$12.L$18 = y2p0Var122;
                        String str522 = str41;
                        scooterOfferMapper$toScooterTariffs$12.L$19 = str522;
                        Integer num122 = num10;
                        scooterOfferMapper$toScooterTariffs$12.L$20 = num122;
                        p6p0 p6p0Var112 = p6p0Var7;
                        scooterOfferMapper$toScooterTariffs$12.L$21 = str40;
                        scooterOfferMapper$toScooterTariffs$12.L$22 = str19;
                        scooterOfferMapper$toScooterTariffs$12.L$23 = charSequence202;
                        scooterOfferMapper$toScooterTariffs$12.L$24 = d2;
                        scooterOfferMapper$toScooterTariffs$12.I$0 = i5;
                        scooterOfferMapper$toScooterTariffs$12.label = 7;
                        i8 = i(nt60Var22, fefVar4, scooterOfferMapper$toScooterTariffs$12);
                        Iterator it132 = it7;
                        coroutineSingletons11 = coroutineSingletons6;
                        if (i8 != coroutineSingletons11) {
                        }
                        break;
                    case 7:
                        int i21 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        String str86 = (String) scooterOfferMapper$toScooterTariffs$1.L$24;
                        CharSequence charSequence45 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str87 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str88 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num18 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str89 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var20 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var21 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it24 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r152 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var23 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence46 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment10 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var10 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str90 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar16 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons7 = coroutineSingletons13;
                        str23 = str86;
                        charSequence14 = charSequence45;
                        cno0Var3 = cno0Var4;
                        num6 = num18;
                        y2p0Var6 = y2p0Var20;
                        tr60Var6 = tr60Var21;
                        it8 = it24;
                        arrayList6 = r152;
                        p6p0Var8 = p6p0Var23;
                        charSequence15 = charSequence46;
                        str24 = str90;
                        obj7 = obj9;
                        str25 = str87;
                        str26 = str88;
                        str27 = str89;
                        i6 = i21;
                        qko0Var3 = qko0Var10;
                        scooterOfferMapper$toScooterTariffs$14 = scooterOfferMapper$toScooterTariffs$1;
                        str5 = "";
                        scootersClientInsuranceNewExperiment3 = scootersClientInsuranceNewExperiment10;
                        fefVar4 = fefVar16;
                        CharSequence charSequence212 = (CharSequence) obj7;
                        cVar2 = tr60Var6.r;
                        str39 = tr60Var6.c;
                        if (str39 == null) {
                        }
                        if (i6 == 0) {
                        }
                        String str532 = str39;
                        scooterOfferMapper$toScooterTariffs$14.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$1 = fefVar4;
                        scooterOfferMapper$toScooterTariffs$14.L$2 = str24;
                        scooterOfferMapper$toScooterTariffs$14.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$14.L$4 = scootersClientInsuranceNewExperiment3;
                        scooterOfferMapper$toScooterTariffs$14.L$5 = charSequence15;
                        scooterOfferMapper$toScooterTariffs$14.L$6 = p6p0Var8;
                        scooterOfferMapper$toScooterTariffs$14.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$9 = arrayList6;
                        scooterOfferMapper$toScooterTariffs$14.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$11 = it8;
                        scooterOfferMapper$toScooterTariffs$14.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$14 = tr60Var6;
                        scooterOfferMapper$toScooterTariffs$14.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$17 = null;
                        scooterOfferMapper$toScooterTariffs$14.L$18 = y2p0Var6;
                        scooterOfferMapper$toScooterTariffs$14.L$19 = str27;
                        scooterOfferMapper$toScooterTariffs$14.L$20 = num6;
                        scooterOfferMapper$toScooterTariffs$14.L$21 = str26;
                        scooterOfferMapper$toScooterTariffs$14.L$22 = str25;
                        CharSequence charSequence222 = charSequence14;
                        scooterOfferMapper$toScooterTariffs$14.L$23 = charSequence222;
                        y2p0 y2p0Var132 = y2p0Var6;
                        scooterOfferMapper$toScooterTariffs$14.L$24 = str23;
                        scooterOfferMapper$toScooterTariffs$14.L$25 = charSequence212;
                        scooterOfferMapper$toScooterTariffs$14.L$26 = cVar2;
                        scooterOfferMapper$toScooterTariffs$14.L$27 = str532;
                        int i142 = i6;
                        scooterOfferMapper$toScooterTariffs$14.I$0 = i142;
                        scooterOfferMapper$toScooterTariffs$14.label = 8;
                        Iterator it142 = it8;
                        a = a(tr60Var6, fefVar4, z, scooterOfferMapper$toScooterTariffs$14);
                        tr60 tr60Var112 = tr60Var6;
                        coroutineSingletons10 = coroutineSingletons7;
                        if (a != coroutineSingletons10) {
                        }
                        return coroutineSingletons10;
                    case 8:
                        int i22 = scooterOfferMapper$toScooterTariffs$1.I$0;
                        String str91 = (String) scooterOfferMapper$toScooterTariffs$1.L$27;
                        kotlinx.serialization.json.c cVar6 = (kotlinx.serialization.json.c) scooterOfferMapper$toScooterTariffs$1.L$26;
                        CharSequence charSequence47 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$25;
                        String str92 = (String) scooterOfferMapper$toScooterTariffs$1.L$24;
                        CharSequence charSequence48 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str93 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str94 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num19 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str95 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0Var7 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var22 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it25 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r16 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var24 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence49 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment11 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var11 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        String str96 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar17 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        coroutineSingletons8 = coroutineSingletons13;
                        str28 = str91;
                        cVar2 = cVar6;
                        charSequence16 = charSequence47;
                        str29 = str92;
                        charSequence17 = charSequence48;
                        str30 = str93;
                        str31 = str94;
                        str32 = str95;
                        str24 = str96;
                        fefVar5 = fefVar17;
                        it9 = it25;
                        arrayList6 = r16;
                        p6p0Var8 = p6p0Var24;
                        qko0Var3 = qko0Var11;
                        cno0Var3 = cno0Var4;
                        num7 = num19;
                        i7 = i22;
                        charSequence15 = charSequence49;
                        scooterOfferMapper$toScooterTariffs$15 = scooterOfferMapper$toScooterTariffs$1;
                        str5 = "";
                        tr60Var7 = tr60Var22;
                        scootersClientInsuranceNewExperiment3 = scootersClientInsuranceNewExperiment11;
                        obj8 = obj9;
                        List list72 = (List) obj8;
                        u4w u4wVar3 = tr60Var7.s;
                        scooterOfferMapper$toScooterTariffs$15.L$0 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$1 = fefVar5;
                        scooterOfferMapper$toScooterTariffs$15.L$2 = str24;
                        scooterOfferMapper$toScooterTariffs$15.L$3 = qko0Var3;
                        scooterOfferMapper$toScooterTariffs$15.L$4 = scootersClientInsuranceNewExperiment3;
                        scooterOfferMapper$toScooterTariffs$15.L$5 = charSequence15;
                        scooterOfferMapper$toScooterTariffs$15.L$6 = p6p0Var8;
                        scooterOfferMapper$toScooterTariffs$15.L$7 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$8 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$9 = arrayList6;
                        scooterOfferMapper$toScooterTariffs$15.L$10 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$11 = it9;
                        scooterOfferMapper$toScooterTariffs$15.L$12 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$13 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$14 = tr60Var7;
                        scooterOfferMapper$toScooterTariffs$15.L$15 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$16 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$17 = null;
                        scooterOfferMapper$toScooterTariffs$15.L$18 = y2p0Var7;
                        scooterOfferMapper$toScooterTariffs$15.L$19 = str32;
                        scooterOfferMapper$toScooterTariffs$15.L$20 = num7;
                        scooterOfferMapper$toScooterTariffs$15.L$21 = str31;
                        scooterOfferMapper$toScooterTariffs$15.L$22 = str30;
                        CharSequence charSequence232 = charSequence17;
                        scooterOfferMapper$toScooterTariffs$15.L$23 = charSequence232;
                        String str542 = str31;
                        scooterOfferMapper$toScooterTariffs$15.L$24 = str29;
                        scooterOfferMapper$toScooterTariffs$15.L$25 = charSequence16;
                        scooterOfferMapper$toScooterTariffs$15.L$26 = cVar2;
                        scooterOfferMapper$toScooterTariffs$15.L$27 = str28;
                        scooterOfferMapper$toScooterTariffs$15.L$28 = list72;
                        scooterOfferMapper$toScooterTariffs$15.I$0 = i7;
                        scooterOfferMapper$toScooterTariffs$15.label = 9;
                        fef fefVar92 = fefVar5;
                        String str552 = str24;
                        ScooterOfferMapper$toScooterTariffs$1 scooterOfferMapper$toScooterTariffs$172 = scooterOfferMapper$toScooterTariffs$15;
                        d = d(u4wVar3, str552, scootersClientInsuranceNewExperiment3, charSequence15, p6p0Var8, fefVar92, scooterOfferMapper$toScooterTariffs$172);
                        CoroutineSingletons coroutineSingletons152 = coroutineSingletons8;
                        String str562 = str30;
                        coroutineSingletons9 = coroutineSingletons152;
                        aVar2 = this;
                        str33 = str552;
                        fefVar6 = fefVar92;
                        scooterOfferMapper$toScooterTariffs$16 = scooterOfferMapper$toScooterTariffs$172;
                        if (d != coroutineSingletons9) {
                        }
                        break;
                    case 9:
                        List list10 = (List) scooterOfferMapper$toScooterTariffs$1.L$28;
                        String str97 = (String) scooterOfferMapper$toScooterTariffs$1.L$27;
                        kotlinx.serialization.json.c cVar7 = (kotlinx.serialization.json.c) scooterOfferMapper$toScooterTariffs$1.L$26;
                        CharSequence charSequence50 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$25;
                        String str98 = (String) scooterOfferMapper$toScooterTariffs$1.L$24;
                        CharSequence charSequence51 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$23;
                        String str99 = (String) scooterOfferMapper$toScooterTariffs$1.L$22;
                        String str100 = (String) scooterOfferMapper$toScooterTariffs$1.L$21;
                        Integer num20 = (Integer) scooterOfferMapper$toScooterTariffs$1.L$20;
                        String str101 = (String) scooterOfferMapper$toScooterTariffs$1.L$19;
                        y2p0 y2p0Var21 = (y2p0) scooterOfferMapper$toScooterTariffs$1.L$18;
                        tr60 tr60Var23 = (tr60) scooterOfferMapper$toScooterTariffs$1.L$14;
                        Iterator it26 = (Iterator) scooterOfferMapper$toScooterTariffs$1.L$11;
                        ?? r17 = (Collection) scooterOfferMapper$toScooterTariffs$1.L$9;
                        p6p0 p6p0Var25 = (p6p0) scooterOfferMapper$toScooterTariffs$1.L$6;
                        CharSequence charSequence52 = (CharSequence) scooterOfferMapper$toScooterTariffs$1.L$5;
                        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment12 = (ScootersClientInsuranceNewExperiment) scooterOfferMapper$toScooterTariffs$1.L$4;
                        qko0 qko0Var12 = (qko0) scooterOfferMapper$toScooterTariffs$1.L$3;
                        str33 = (String) scooterOfferMapper$toScooterTariffs$1.L$2;
                        fef fefVar18 = (fef) scooterOfferMapper$toScooterTariffs$1.L$1;
                        kotlin.b.b(obj9);
                        y2p0Var8 = y2p0Var21;
                        coroutineSingletons9 = coroutineSingletons13;
                        list3 = list10;
                        num8 = num20;
                        str38 = str99;
                        str36 = str101;
                        str35 = str100;
                        str34 = str97;
                        cVar3 = cVar7;
                        charSequence18 = charSequence50;
                        str37 = str98;
                        charSequence19 = charSequence51;
                        qko0Var3 = qko0Var12;
                        fefVar6 = fefVar18;
                        it9 = it26;
                        arrayList6 = r17;
                        p6p0Var8 = p6p0Var25;
                        aVar2 = aVar3;
                        scooterOfferMapper$toScooterTariffs$16 = scooterOfferMapper$toScooterTariffs$1;
                        str5 = "";
                        cno0Var3 = cno0Var4;
                        tr60Var7 = tr60Var23;
                        charSequence15 = charSequence52;
                        scootersClientInsuranceNewExperiment3 = scootersClientInsuranceNewExperiment12;
                        d = obj9;
                        n3o0 n3o0Var3 = (n3o0) d;
                        aVar2.b(tr60Var7, fefVar6);
                        boolean z22 = tr60Var7.h;
                        str44 = tr60Var7.m;
                        if (str44 == null) {
                        }
                        fefVar7 = fefVar6;
                        ?? eerVar2 = new eer(str36, num8, str35, str38, charSequence19, str37, charSequence18, cVar3, str34, list3, y2p0Var8, n3o0Var3, fefVar7, z22, new mf1((byte) 0, 10, str44), tr60Var7.o);
                        qko0Var2 = qko0Var3;
                        p6p0Var2 = p6p0Var8;
                        arrayList7 = arrayList6;
                        str2 = str33;
                        scooterOfferMapper$toScooterTariffs$12 = scooterOfferMapper$toScooterTariffs$16;
                        scootersClientInsuranceNewExperiment2 = scootersClientInsuranceNewExperiment3;
                        it = it9;
                        xzt0Var = eerVar2;
                        charSequence2 = charSequence15;
                        if (xzt0Var != null) {
                        }
                        a aVar42222 = aVar2;
                        arrayList = arrayList7;
                        aVar3 = aVar42222;
                        coroutineSingletons13 = coroutineSingletons9;
                        str45 = str5;
                        cno0Var4 = cno0Var3;
                        fefVar2 = fefVar7;
                        if (!it.hasNext()) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scooterOfferMapper$toScooterTariffs$1 = new ScooterOfferMapper$toScooterTariffs$1(aVar3, continuationImpl);
        Object obj92 = scooterOfferMapper$toScooterTariffs$1.result;
        CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterOfferMapper$toScooterTariffs$1.label;
        String str452 = "";
        cno0 cno0Var42 = aVar3.h;
        switch (i) {
        }
    }
}
