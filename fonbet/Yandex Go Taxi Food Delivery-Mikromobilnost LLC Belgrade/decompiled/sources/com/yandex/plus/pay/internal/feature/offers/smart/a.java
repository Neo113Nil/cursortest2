package com.yandex.plus.pay.internal.feature.offers.smart;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayTestId;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.internal.model.SmartOffersBatch;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.bu60;
import defpackage.gfd0;
import defpackage.gio;
import defpackage.gw00;
import defpackage.hfd0;
import defpackage.jbd0;
import defpackage.k2d0;
import defpackage.mzs0;
import defpackage.ny61;
import defpackage.qqd;
import defpackage.qzs0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ut91;
import defpackage.ycc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements mzs0 {
    public final qzs0 a;
    public final List b;
    public final gfd0 c;

    public a(qzs0 qzs0Var, List list, gfd0 gfd0Var) {
        this.a = qzs0Var;
        this.b = list;
        this.c = gfd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e3 -> B:10:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, List list, PlusPaySmartOffer.TargetAndFeatures targetAndFeatures, ContinuationImpl continuationImpl) {
        SmartOffersInteractorImpl$applyPostProcessors$1 smartOffersInteractorImpl$applyPostProcessors$1;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers;
        Iterator it;
        int i2;
        List<PlusPaySmartOffer> list2;
        if (continuationImpl instanceof SmartOffersInteractorImpl$applyPostProcessors$1) {
            smartOffersInteractorImpl$applyPostProcessors$1 = (SmartOffersInteractorImpl$applyPostProcessors$1) continuationImpl;
            int i3 = smartOffersInteractorImpl$applyPostProcessors$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                smartOffersInteractorImpl$applyPostProcessors$1.label = i3 - Integer.MIN_VALUE;
                Object obj = smartOffersInteractorImpl$applyPostProcessors$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartOffersInteractorImpl$applyPostProcessors$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String batchId = ((PlusPaySmartOffer) kotlin.collections.a.P(list)).getMeta().getBatchId();
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((PlusPaySmartOffer) it2.next()).getCompositeOffer());
                    }
                    plusPayCompositeOffers = new PlusPayCompositeOffers(str, batchId, arrayList, targetAndFeatures.getTarget());
                    it = this.b.iterator();
                    i2 = 0;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = smartOffersInteractorImpl$applyPostProcessors$1.I$0;
                    it = (Iterator) smartOffersInteractorImpl$applyPostProcessors$1.L$7;
                    List list4 = (List) smartOffersInteractorImpl$applyPostProcessors$1.L$1;
                    kotlin.b.b(obj);
                    SmartOffersInteractorImpl$applyPostProcessors$1 smartOffersInteractorImpl$applyPostProcessors$12 = smartOffersInteractorImpl$applyPostProcessors$1;
                    int i5 = i4;
                    list2 = list4;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    i2 = i5;
                    smartOffersInteractorImpl$applyPostProcessors$1 = smartOffersInteractorImpl$applyPostProcessors$12;
                    it = it;
                    if (it.hasNext()) {
                        qqd qqdVar = (qqd) it.next();
                        smartOffersInteractorImpl$applyPostProcessors$1.L$0 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$1 = list2;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$2 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$3 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$4 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$5 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$6 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$7 = it;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$8 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$9 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.L$10 = null;
                        smartOffersInteractorImpl$applyPostProcessors$1.I$0 = i2;
                        smartOffersInteractorImpl$applyPostProcessors$1.I$1 = 0;
                        smartOffersInteractorImpl$applyPostProcessors$1.label = 1;
                        Object a = qqdVar.a(plusPayCompositeOffers, smartOffersInteractorImpl$applyPostProcessors$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        smartOffersInteractorImpl$applyPostProcessors$12 = smartOffersInteractorImpl$applyPostProcessors$1;
                        i5 = i2;
                        obj = a;
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        i2 = i5;
                        smartOffersInteractorImpl$applyPostProcessors$1 = smartOffersInteractorImpl$applyPostProcessors$12;
                        it = it;
                        if (it.hasNext()) {
                            List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
                            int d = gw00.d(tcc.n(offers, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                            for (Object obj2 : offers) {
                                linkedHashMap.put(bu60.b((PlusPayCompositeOffers.Offer) obj2), obj2);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (PlusPaySmartOffer plusPaySmartOffer : list2) {
                                String b = bu60.b(plusPaySmartOffer.getCompositeOffer());
                                PlusPaySmartOffer copy$default = linkedHashMap.containsKey(b) ? PlusPaySmartOffer.copy$default(plusPaySmartOffer, 0, null, null, null, null, false, null, null, null, null, (PlusPayCompositeOffers.Offer) kotlin.collections.b.g(b, linkedHashMap), 1023, null) : null;
                                if (copy$default != null) {
                                    arrayList2.add(copy$default);
                                }
                            }
                            return arrayList2;
                        }
                    }
                }
            }
        }
        smartOffersInteractorImpl$applyPostProcessors$1 = new SmartOffersInteractorImpl$applyPostProcessors$1(this, continuationImpl);
        Object obj3 = smartOffersInteractorImpl$applyPostProcessors$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersInteractorImpl$applyPostProcessors$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        if (r1 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Set set, Map map, PlusPayAnalyticsParams plusPayAnalyticsParams, boolean z, tls tlsVar, ContinuationImpl continuationImpl) {
        SmartOffersInteractorImpl$getOffers$1 smartOffersInteractorImpl$getOffers$1;
        int i;
        PlusPayAnalyticsParams plusPayAnalyticsParams2;
        tls tlsVar2;
        Object obj;
        boolean z2;
        if (continuationImpl instanceof SmartOffersInteractorImpl$getOffers$1) {
            smartOffersInteractorImpl$getOffers$1 = (SmartOffersInteractorImpl$getOffers$1) continuationImpl;
            int i2 = smartOffersInteractorImpl$getOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smartOffersInteractorImpl$getOffers$1.label = i2 - Integer.MIN_VALUE;
                SmartOffersInteractorImpl$getOffers$1 smartOffersInteractorImpl$getOffers$12 = smartOffersInteractorImpl$getOffers$1;
                Object obj2 = smartOffersInteractorImpl$getOffers$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartOffersInteractorImpl$getOffers$12.label;
                EmptySet emptySet = EmptySet.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set<PlusPayTestId> externalTestIds = plusPayAnalyticsParams.getExternalTestIds();
                    Set<String> externalFlags = plusPayAnalyticsParams.getExternalFlags();
                    String sessionId = plusPayAnalyticsParams.getSessionId();
                    smartOffersInteractorImpl$getOffers$12.L$0 = null;
                    smartOffersInteractorImpl$getOffers$12.L$1 = null;
                    smartOffersInteractorImpl$getOffers$12.L$2 = null;
                    plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                    smartOffersInteractorImpl$getOffers$12.L$3 = plusPayAnalyticsParams2;
                    tlsVar2 = tlsVar;
                    smartOffersInteractorImpl$getOffers$12.L$4 = tlsVar2;
                    smartOffersInteractorImpl$getOffers$12.Z$0 = z;
                    smartOffersInteractorImpl$getOffers$12.label = 1;
                    Object c = ((b) this.a).c(str, set, emptySet, externalTestIds, externalFlags, map, sessionId, z, smartOffersInteractorImpl$getOffers$12);
                    if (c != obj3) {
                        obj = c;
                        z2 = z;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return (List) obj2;
                }
                z2 = smartOffersInteractorImpl$getOffers$12.Z$0;
                tls tlsVar3 = (tls) smartOffersInteractorImpl$getOffers$12.L$4;
                PlusPayAnalyticsParams plusPayAnalyticsParams3 = (PlusPayAnalyticsParams) smartOffersInteractorImpl$getOffers$12.L$3;
                kotlin.b.b(obj2);
                tlsVar2 = tlsVar3;
                obj = obj2;
                plusPayAnalyticsParams2 = plusPayAnalyticsParams3;
                smartOffersInteractorImpl$getOffers$12.L$0 = null;
                smartOffersInteractorImpl$getOffers$12.L$1 = null;
                smartOffersInteractorImpl$getOffers$12.L$2 = null;
                smartOffersInteractorImpl$getOffers$12.L$3 = null;
                smartOffersInteractorImpl$getOffers$12.L$4 = null;
                smartOffersInteractorImpl$getOffers$12.L$5 = null;
                smartOffersInteractorImpl$getOffers$12.Z$0 = z2;
                smartOffersInteractorImpl$getOffers$12.label = 2;
                obj2 = c((SmartOffersBatch) obj, emptySet, plusPayAnalyticsParams2, tlsVar2, smartOffersInteractorImpl$getOffers$12);
            }
        }
        smartOffersInteractorImpl$getOffers$1 = new SmartOffersInteractorImpl$getOffers$1(this, continuationImpl);
        SmartOffersInteractorImpl$getOffers$1 smartOffersInteractorImpl$getOffers$122 = smartOffersInteractorImpl$getOffers$1;
        Object obj22 = smartOffersInteractorImpl$getOffers$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersInteractorImpl$getOffers$122.label;
        EmptySet emptySet2 = EmptySet.a;
        if (i != 0) {
        }
        smartOffersInteractorImpl$getOffers$122.L$0 = null;
        smartOffersInteractorImpl$getOffers$122.L$1 = null;
        smartOffersInteractorImpl$getOffers$122.L$2 = null;
        smartOffersInteractorImpl$getOffers$122.L$3 = null;
        smartOffersInteractorImpl$getOffers$122.L$4 = null;
        smartOffersInteractorImpl$getOffers$122.L$5 = null;
        smartOffersInteractorImpl$getOffers$122.Z$0 = z2;
        smartOffersInteractorImpl$getOffers$122.label = 2;
        obj22 = c((SmartOffersBatch) obj, emptySet2, plusPayAnalyticsParams2, tlsVar2, smartOffersInteractorImpl$getOffers$122);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01a7 -> B:10:0x01a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SmartOffersBatch smartOffersBatch, EmptySet emptySet, PlusPayAnalyticsParams plusPayAnalyticsParams, tls tlsVar, ContinuationImpl continuationImpl) {
        SmartOffersInteractorImpl$processSmartOffers$1 smartOffersInteractorImpl$processSmartOffers$1;
        int i;
        Iterator it;
        List list;
        String str;
        tls tlsVar2;
        Map map;
        String str2;
        String str3;
        SmartOffersInteractorImpl$processSmartOffers$1 smartOffersInteractorImpl$processSmartOffers$12;
        CoroutineSingletons coroutineSingletons;
        a aVar = this;
        if (continuationImpl instanceof SmartOffersInteractorImpl$processSmartOffers$1) {
            smartOffersInteractorImpl$processSmartOffers$1 = (SmartOffersInteractorImpl$processSmartOffers$1) continuationImpl;
            int i2 = smartOffersInteractorImpl$processSmartOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smartOffersInteractorImpl$processSmartOffers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = smartOffersInteractorImpl$processSmartOffers$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartOffersInteractorImpl$processSmartOffers$1.label;
                EmptyList emptyList = EmptyList.a;
                String str4 = "no_value";
                gfd0 gfd0Var = aVar.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String sessionId = smartOffersBatch.getSessionId();
                    String externalAnalyticsId = plusPayAnalyticsParams.getExternalAnalyticsId();
                    Set<PlusPayTestId> externalTestIds = plusPayAnalyticsParams.getExternalTestIds();
                    String m = externalTestIds != null ? ut91.m(externalTestIds) : null;
                    Set<PlusPayTestId> externalTriggeredTestIds = plusPayAnalyticsParams.getExternalTriggeredTestIds();
                    String m2 = externalTriggeredTestIds != null ? ut91.m(externalTriggeredTestIds) : null;
                    Map<String, String> clientParams = plusPayAnalyticsParams.getClientParams();
                    hfd0 hfd0Var = (hfd0) gfd0Var;
                    jbd0 jbd0Var = hfd0Var.b;
                    gio gioVar = hfd0Var.a;
                    String str5 = hfd0Var.c;
                    String str6 = hfd0Var.d;
                    if (str6 == null) {
                        str6 = "no_value";
                    }
                    if (externalAnalyticsId == null) {
                        externalAnalyticsId = "no_value";
                    }
                    String str7 = externalAnalyticsId;
                    k2d0 k2d0Var = (k2d0) jbd0Var.invoke();
                    String str8 = (k2d0Var == null || (str3 = k2d0Var.a) == null) ? "no_value" : str3;
                    k2d0 k2d0Var2 = (k2d0) jbd0Var.invoke();
                    gioVar.b(sessionId, str5, str6, str7, str8, (k2d0Var2 == null || (str2 = k2d0Var2.b) == null) ? "no_value" : str2, m == null ? "no_value" : m, m2 == null ? "no_value" : m2, clientParams);
                    if (smartOffersBatch.getOffers().isEmpty()) {
                        emptySet.getClass();
                        hfd0Var.a.c(sessionId, EvgenOffersAnalytics$LoadReason.Default, "no_value", "Backend returned empty list of offers");
                        hfd0Var.a(null, sessionId, emptyList);
                        return emptyList;
                    }
                    List<PlusPaySmartOffer> offers = smartOffersBatch.getOffers();
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : offers) {
                        PlusPaySmartOffer.TargetAndFeatures targetAndFeatures = ((PlusPaySmartOffer) obj2).getTargetAndFeatures();
                        Object obj3 = linkedHashMap.get(targetAndFeatures);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap.put(targetAndFeatures, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    Set keySet = linkedHashMap.keySet();
                    Set M0 = kotlin.collections.a.M0(emptySet);
                    ycc.r(keySet, M0);
                    it = M0.iterator();
                    list = arrayList;
                    str = sessionId;
                    tlsVar2 = tlsVar;
                    map = linkedHashMap;
                    while (it.hasNext()) {
                    }
                    return list;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PlusPaySmartOffer.TargetAndFeatures targetAndFeatures2 = (PlusPaySmartOffer.TargetAndFeatures) smartOffersInteractorImpl$processSmartOffers$1.L$10;
                it = (Iterator) smartOffersInteractorImpl$processSmartOffers$1.L$9;
                map = (Map) smartOffersInteractorImpl$processSmartOffers$1.L$7;
                list = (List) smartOffersInteractorImpl$processSmartOffers$1.L$6;
                str = (String) smartOffersInteractorImpl$processSmartOffers$1.L$4;
                tls tlsVar3 = (tls) smartOffersInteractorImpl$processSmartOffers$1.L$3;
                kotlin.b.b(obj);
                String str9 = "no_value";
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    List list3 = (List) tlsVar3.invoke(list2);
                    if (list3.isEmpty()) {
                        String target = targetAndFeatures2.getTarget();
                        hfd0 hfd0Var2 = (hfd0) gfd0Var;
                        smartOffersInteractorImpl$processSmartOffers$12 = smartOffersInteractorImpl$processSmartOffers$1;
                        coroutineSingletons = coroutineSingletons2;
                        hfd0Var2.a.c(str, EvgenOffersAnalytics$LoadReason.Default, target == null ? str9 : target, "Client filtered and got empty list of offers");
                        hfd0Var2.a(target, str, emptyList);
                    } else {
                        smartOffersInteractorImpl$processSmartOffers$12 = smartOffersInteractorImpl$processSmartOffers$1;
                        coroutineSingletons = coroutineSingletons2;
                    }
                    ((hfd0) gfd0Var).a(targetAndFeatures2.getTarget(), str, list3);
                    list.addAll(list3);
                } else {
                    String target2 = targetAndFeatures2.getTarget();
                    hfd0 hfd0Var3 = (hfd0) gfd0Var;
                    hfd0Var3.a.c(str, EvgenOffersAnalytics$LoadReason.Default, target2 == null ? str9 : target2, "In-app store returned empty list of offers");
                    hfd0Var3.a(target2, str, emptyList);
                    smartOffersInteractorImpl$processSmartOffers$12 = smartOffersInteractorImpl$processSmartOffers$1;
                    coroutineSingletons = coroutineSingletons2;
                }
                aVar = this;
                smartOffersInteractorImpl$processSmartOffers$1 = smartOffersInteractorImpl$processSmartOffers$12;
                tlsVar2 = tlsVar3;
                str4 = str9;
                coroutineSingletons2 = coroutineSingletons;
                while (it.hasNext()) {
                    targetAndFeatures2 = (PlusPaySmartOffer.TargetAndFeatures) it.next();
                    List list4 = (List) map.get(targetAndFeatures2);
                    if (list4 == null) {
                        String target3 = targetAndFeatures2.getTarget();
                        hfd0 hfd0Var4 = (hfd0) gfd0Var;
                        gio gioVar2 = hfd0Var4.a;
                        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason = EvgenOffersAnalytics$LoadReason.Default;
                        String str10 = str4;
                        if (target3 != null) {
                            str4 = target3;
                        }
                        gioVar2.c(str, evgenOffersAnalytics$LoadReason, str4, "Backend returned empty list of offers");
                        hfd0Var4.a(target3, str, emptyList);
                        str4 = str10;
                    } else {
                        str9 = str4;
                        smartOffersInteractorImpl$processSmartOffers$1.L$0 = null;
                        smartOffersInteractorImpl$processSmartOffers$1.L$1 = null;
                        smartOffersInteractorImpl$processSmartOffers$1.L$2 = null;
                        smartOffersInteractorImpl$processSmartOffers$1.L$3 = tlsVar2;
                        smartOffersInteractorImpl$processSmartOffers$1.L$4 = str;
                        smartOffersInteractorImpl$processSmartOffers$1.L$5 = null;
                        smartOffersInteractorImpl$processSmartOffers$1.L$6 = list;
                        smartOffersInteractorImpl$processSmartOffers$1.L$7 = map;
                        smartOffersInteractorImpl$processSmartOffers$1.L$8 = null;
                        smartOffersInteractorImpl$processSmartOffers$1.L$9 = it;
                        smartOffersInteractorImpl$processSmartOffers$1.L$10 = targetAndFeatures2;
                        smartOffersInteractorImpl$processSmartOffers$1.L$11 = null;
                        smartOffersInteractorImpl$processSmartOffers$1.label = 1;
                        Serializable a = aVar.a(str, list4, targetAndFeatures2, smartOffersInteractorImpl$processSmartOffers$1);
                        if (a == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        tlsVar3 = tlsVar2;
                        obj = a;
                        List list22 = (List) obj;
                        if (list22.isEmpty()) {
                        }
                        aVar = this;
                        smartOffersInteractorImpl$processSmartOffers$1 = smartOffersInteractorImpl$processSmartOffers$12;
                        tlsVar2 = tlsVar3;
                        str4 = str9;
                        coroutineSingletons2 = coroutineSingletons;
                        while (it.hasNext()) {
                        }
                    }
                }
                return list;
            }
        }
        smartOffersInteractorImpl$processSmartOffers$1 = new SmartOffersInteractorImpl$processSmartOffers$1(aVar, continuationImpl);
        Object obj4 = smartOffersInteractorImpl$processSmartOffers$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersInteractorImpl$processSmartOffers$1.label;
        EmptyList emptyList2 = EmptyList.a;
        String str42 = "no_value";
        gfd0 gfd0Var2 = aVar.c;
        if (i != 0) {
        }
    }
}
