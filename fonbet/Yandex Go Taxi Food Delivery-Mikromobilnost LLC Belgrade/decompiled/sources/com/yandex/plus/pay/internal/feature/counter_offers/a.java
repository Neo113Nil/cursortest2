package com.yandex.plus.pay.internal.feature.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.bu60;
import defpackage.g8e;
import defpackage.gio;
import defpackage.gw00;
import defpackage.k5t;
import defpackage.ny61;
import defpackage.qqd;
import defpackage.sfd0;
import defpackage.tcc;
import defpackage.tfd0;
import defpackage.vdd0;
import defpackage.wdd0;
import defpackage.xdd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public final class a implements k5t {
    public final b a;
    public final List b;
    public final sfd0 c;

    public a(b bVar, List list, sfd0 sfd0Var) {
        this.a = bVar;
        this.b = list;
        this.c = sfd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011d A[LOOP:0: B:18:0x0117->B:20:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e A[LOOP:1: B:34:0x0168->B:36:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, vdd0] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, wdd0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayCounterOffersReason plusPayCounterOffersReason, ContinuationImpl continuationImpl) {
        GetCounterOffersInteractorImpl$getCounterOffers$1 getCounterOffersInteractorImpl$getCounterOffers$1;
        Object obj;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        PlusPayCounterOffers plusPayCounterOffers;
        Object b;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayCounterOffers plusPayCounterOffers2;
        Iterator<T> it;
        PlusPayCompositeOffers.Offer offer3;
        Iterator it2;
        xdd0 xdd0Var;
        PlusPayCompositeOffers.Offer.Meta meta;
        String productTarget;
        PlusPayCompositeOffers.Offer.Meta meta2;
        PlusPayCompositeOffers.Offer.Meta meta3;
        if (continuationImpl instanceof GetCounterOffersInteractorImpl$getCounterOffers$1) {
            getCounterOffersInteractorImpl$getCounterOffers$1 = (GetCounterOffersInteractorImpl$getCounterOffers$1) continuationImpl;
            int i2 = getCounterOffersInteractorImpl$getCounterOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCounterOffersInteractorImpl$getCounterOffers$1.label = i2 - Integer.MIN_VALUE;
                GetCounterOffersInteractorImpl$getCounterOffers$1 getCounterOffersInteractorImpl$getCounterOffers$12 = getCounterOffersInteractorImpl$getCounterOffers$1;
                Object obj2 = getCounterOffersInteractorImpl$getCounterOffers$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCounterOffersInteractorImpl$getCounterOffers$12.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj2);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    if (tariffOffer != null) {
                        t.add(tariffOffer.getId());
                    }
                    Iterator<T> it3 = offer.getOptionOffers().iterator();
                    while (it3.hasNext()) {
                        t.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    String productTarget2 = offer.getMeta().getProductTarget();
                    String sessionId = offer.getMeta().getSessionId();
                    String code = plusPayCounterOffersReason.getCode();
                    getCounterOffersInteractorImpl$getCounterOffers$12.L$0 = offer;
                    getCounterOffersInteractorImpl$getCounterOffers$12.L$1 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$12.L$2 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$12.L$3 = ref$ObjectRef2;
                    getCounterOffersInteractorImpl$getCounterOffers$12.label = 1;
                    Object a = this.a.a(productTarget2, sessionId, code, t, getCounterOffersInteractorImpl$getCounterOffers$12);
                    if (a != obj) {
                        obj2 = a;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayCounterOffers2 = (PlusPayCounterOffers) getCounterOffersInteractorImpl$getCounterOffers$12.L$4;
                    ref$ObjectRef = (Ref$ObjectRef) getCounterOffersInteractorImpl$getCounterOffers$12.L$3;
                    offer2 = (PlusPayCompositeOffers.Offer) getCounterOffersInteractorImpl$getCounterOffers$12.L$0;
                    kotlin.b.b(obj2);
                    PlusPayCounterOffers plusPayCounterOffers3 = (PlusPayCounterOffers) obj2;
                    if (ref$ObjectRef.element == 0 && plusPayCounterOffers3.getOffers().isEmpty()) {
                        ref$ObjectRef.element = wdd0.b;
                    }
                    tfd0 tfd0Var = (tfd0) this.c;
                    tfd0Var.getClass();
                    List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers2.getOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
                    it = offers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCounterOffers.CounterOffer) it.next()).getOffer());
                    }
                    offer3 = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(arrayList);
                    gio gioVar = tfd0Var.a;
                    String sessionId2 = offer2.getMeta().getSessionId();
                    String str = "no_value";
                    if (offer3 != null || (meta3 = offer3.getMeta()) == null || (r6 = meta3.getProductTarget()) == null) {
                        String str2 = "no_value";
                    }
                    if (offer3 != null || (meta2 = offer3.getMeta()) == null || (r11 = meta2.getOffersBatchId()) == null) {
                        String str3 = "no_value";
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer) it2.next()).getPositionId());
                    }
                    gioVar.d(sessionId2, str2, str3, arrayList2);
                    xdd0Var = (xdd0) ref$ObjectRef.element;
                    if (xdd0Var != null) {
                        tfd0Var.getClass();
                        List<PlusPayCounterOffers.CounterOffer> offers2 = plusPayCounterOffers3.getOffers();
                        ArrayList arrayList3 = new ArrayList(tcc.n(offers2, 10));
                        Iterator<T> it4 = offers2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((PlusPayCounterOffers.CounterOffer) it4.next()).getOffer());
                        }
                        PlusPayCompositeOffers.Offer offer4 = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(arrayList3);
                        gio gioVar2 = tfd0Var.a;
                        String sessionId3 = offer2.getMeta().getSessionId();
                        if (offer4 != null && (meta = offer4.getMeta()) != null && (productTarget = meta.getProductTarget()) != null) {
                            str = productTarget;
                        }
                        gioVar2.c(sessionId3, EvgenOffersAnalytics$LoadReason.ContrOffer, str, xdd0Var.a);
                    }
                    return plusPayCounterOffers3;
                }
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) getCounterOffersInteractorImpl$getCounterOffers$12.L$3;
                PlusPayCompositeOffers.Offer offer5 = (PlusPayCompositeOffers.Offer) getCounterOffersInteractorImpl$getCounterOffers$12.L$0;
                kotlin.b.b(obj2);
                ref$ObjectRef = ref$ObjectRef3;
                offer = offer5;
                plusPayCounterOffers = (PlusPayCounterOffers) obj2;
                if (plusPayCounterOffers.getOffers().isEmpty()) {
                    ref$ObjectRef.element = vdd0.b;
                }
                getCounterOffersInteractorImpl$getCounterOffers$12.L$0 = offer;
                getCounterOffersInteractorImpl$getCounterOffers$12.L$1 = null;
                getCounterOffersInteractorImpl$getCounterOffers$12.L$2 = null;
                getCounterOffersInteractorImpl$getCounterOffers$12.L$3 = ref$ObjectRef;
                getCounterOffersInteractorImpl$getCounterOffers$12.L$4 = plusPayCounterOffers;
                getCounterOffersInteractorImpl$getCounterOffers$12.I$0 = 0;
                getCounterOffersInteractorImpl$getCounterOffers$12.label = 2;
                b = b(offer, plusPayCounterOffers, getCounterOffersInteractorImpl$getCounterOffers$12);
                if (b != obj) {
                    offer2 = offer;
                    plusPayCounterOffers2 = plusPayCounterOffers;
                    obj2 = b;
                    PlusPayCounterOffers plusPayCounterOffers32 = (PlusPayCounterOffers) obj2;
                    if (ref$ObjectRef.element == 0) {
                        ref$ObjectRef.element = wdd0.b;
                    }
                    tfd0 tfd0Var2 = (tfd0) this.c;
                    tfd0Var2.getClass();
                    List<PlusPayCounterOffers.CounterOffer> offers3 = plusPayCounterOffers2.getOffers();
                    ArrayList arrayList4 = new ArrayList(tcc.n(offers3, 10));
                    it = offers3.iterator();
                    while (it.hasNext()) {
                    }
                    offer3 = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(arrayList4);
                    gio gioVar3 = tfd0Var2.a;
                    String sessionId22 = offer2.getMeta().getSessionId();
                    String str4 = "no_value";
                    if (offer3 != null) {
                    }
                    String str22 = "no_value";
                    if (offer3 != null) {
                    }
                    String str32 = "no_value";
                    ArrayList arrayList22 = new ArrayList(tcc.n(arrayList4, 10));
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                    }
                    gioVar3.d(sessionId22, str22, str32, arrayList22);
                    xdd0Var = (xdd0) ref$ObjectRef.element;
                    if (xdd0Var != null) {
                    }
                    return plusPayCounterOffers32;
                }
                return obj;
            }
        }
        getCounterOffersInteractorImpl$getCounterOffers$1 = new GetCounterOffersInteractorImpl$getCounterOffers$1(this, continuationImpl);
        GetCounterOffersInteractorImpl$getCounterOffers$1 getCounterOffersInteractorImpl$getCounterOffers$122 = getCounterOffersInteractorImpl$getCounterOffers$1;
        Object obj22 = getCounterOffersInteractorImpl$getCounterOffers$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCounterOffersInteractorImpl$getCounterOffers$122.label;
        if (i != 0) {
        }
        plusPayCounterOffers = (PlusPayCounterOffers) obj22;
        if (plusPayCounterOffers.getOffers().isEmpty()) {
        }
        getCounterOffersInteractorImpl$getCounterOffers$122.L$0 = offer;
        getCounterOffersInteractorImpl$getCounterOffers$122.L$1 = null;
        getCounterOffersInteractorImpl$getCounterOffers$122.L$2 = null;
        getCounterOffersInteractorImpl$getCounterOffers$122.L$3 = ref$ObjectRef;
        getCounterOffersInteractorImpl$getCounterOffers$122.L$4 = plusPayCounterOffers;
        getCounterOffersInteractorImpl$getCounterOffers$122.I$0 = 0;
        getCounterOffersInteractorImpl$getCounterOffers$122.label = 2;
        b = b(offer, plusPayCounterOffers, getCounterOffersInteractorImpl$getCounterOffers$122);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00ef -> B:10:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, PlusPayCounterOffers plusPayCounterOffers, ContinuationImpl continuationImpl) {
        GetCounterOffersInteractorImpl$processCounterOffers$1 getCounterOffersInteractorImpl$processCounterOffers$1;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers;
        PlusPayCounterOffers plusPayCounterOffers2;
        Iterator it;
        int i2;
        if (continuationImpl instanceof GetCounterOffersInteractorImpl$processCounterOffers$1) {
            getCounterOffersInteractorImpl$processCounterOffers$1 = (GetCounterOffersInteractorImpl$processCounterOffers$1) continuationImpl;
            int i3 = getCounterOffersInteractorImpl$processCounterOffers$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getCounterOffersInteractorImpl$processCounterOffers$1.label = i3 - Integer.MIN_VALUE;
                Object obj = getCounterOffersInteractorImpl$processCounterOffers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCounterOffersInteractorImpl$processCounterOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers.getOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
                    Iterator<T> it2 = offers.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((PlusPayCounterOffers.CounterOffer) it2.next()).getOffer());
                    }
                    PlusPayCompositeOffers.Offer offer2 = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(arrayList);
                    if (offer2 == null) {
                        return plusPayCounterOffers;
                    }
                    plusPayCompositeOffers = new PlusPayCompositeOffers(offer.getMeta().getSessionId(), offer2.getMeta().getOffersBatchId(), arrayList, offer2.getMeta().getProductTarget());
                    plusPayCounterOffers2 = plusPayCounterOffers;
                    it = this.b.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = getCounterOffersInteractorImpl$processCounterOffers$1.I$0;
                    it = (Iterator) getCounterOffersInteractorImpl$processCounterOffers$1.L$8;
                    PlusPayCounterOffers plusPayCounterOffers3 = (PlusPayCounterOffers) getCounterOffersInteractorImpl$processCounterOffers$1.L$1;
                    kotlin.b.b(obj);
                    plusPayCounterOffers2 = plusPayCounterOffers3;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        qqd qqdVar = (qqd) it.next();
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$0 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$1 = plusPayCounterOffers2;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$2 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$3 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$4 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$5 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$6 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$7 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$8 = it;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$9 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$10 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.L$11 = null;
                        getCounterOffersInteractorImpl$processCounterOffers$1.I$0 = i2;
                        getCounterOffersInteractorImpl$processCounterOffers$1.I$1 = 0;
                        getCounterOffersInteractorImpl$processCounterOffers$1.label = 1;
                        obj = qqdVar.a(plusPayCompositeOffers, getCounterOffersInteractorImpl$processCounterOffers$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        if (it.hasNext()) {
                            List<PlusPayCompositeOffers.Offer> offers2 = plusPayCompositeOffers.getOffers();
                            int d = gw00.d(tcc.n(offers2, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                            for (Object obj2 : offers2) {
                                linkedHashMap.put(bu60.b((PlusPayCompositeOffers.Offer) obj2), obj2);
                            }
                            List<PlusPayCounterOffers.CounterOffer> offers3 = plusPayCounterOffers2.getOffers();
                            ArrayList arrayList2 = new ArrayList();
                            for (PlusPayCounterOffers.CounterOffer counterOffer : offers3) {
                                String b = bu60.b(counterOffer.getOffer());
                                PlusPayCounterOffers.CounterOffer copy$default = linkedHashMap.containsKey(b) ? PlusPayCounterOffers.CounterOffer.copy$default(counterOffer, (PlusPayCompositeOffers.Offer) kotlin.collections.b.g(b, linkedHashMap), null, null, null, null, null, 62, null) : null;
                                if (copy$default != null) {
                                    arrayList2.add(copy$default);
                                }
                            }
                            return PlusPayCounterOffers.copy$default(plusPayCounterOffers2, null, null, arrayList2, null, null, 27, null);
                        }
                    }
                }
            }
        }
        getCounterOffersInteractorImpl$processCounterOffers$1 = new GetCounterOffersInteractorImpl$processCounterOffers$1(this, continuationImpl);
        Object obj3 = getCounterOffersInteractorImpl$processCounterOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCounterOffersInteractorImpl$processCounterOffers$1.label;
        if (i != 0) {
        }
    }
}
