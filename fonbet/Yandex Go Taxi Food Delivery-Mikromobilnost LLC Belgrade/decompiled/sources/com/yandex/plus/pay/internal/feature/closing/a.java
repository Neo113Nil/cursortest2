package com.yandex.plus.pay.internal.feature.closing;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.bu60;
import defpackage.c5t;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.qfd0;
import defpackage.qqd;
import defpackage.rfd0;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements c5t {
    public final b a;
    public final List b;
    public final qfd0 c;

    public a(b bVar, List list, qfd0 qfd0Var) {
        this.a = bVar;
        this.b = list;
        this.c = qfd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        GetClosingOfferInteractorImpl$getClosingOffer$1 getClosingOfferInteractorImpl$getClosingOffer$1;
        Object obj;
        int i;
        Object b;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayClosingOffer plusPayClosingOffer;
        PlusPayClosingOffer plusPayClosingOffer2;
        if (continuationImpl instanceof GetClosingOfferInteractorImpl$getClosingOffer$1) {
            getClosingOfferInteractorImpl$getClosingOffer$1 = (GetClosingOfferInteractorImpl$getClosingOffer$1) continuationImpl;
            int i2 = getClosingOfferInteractorImpl$getClosingOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getClosingOfferInteractorImpl$getClosingOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getClosingOfferInteractorImpl$getClosingOffer$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClosingOfferInteractorImpl$getClosingOffer$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj2);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    if (tariffOffer != null) {
                        t.add(tariffOffer.getId());
                    }
                    Iterator<T> it = offer.getOptionOffers().iterator();
                    while (it.hasNext()) {
                        t.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = offer.getMeta().getProductTarget();
                    String sessionId = offer.getMeta().getSessionId();
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$0 = offer;
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$1 = null;
                    getClosingOfferInteractorImpl$getClosingOffer$1.label = 1;
                    obj2 = this.a.a(t, productTarget, sessionId, getClosingOfferInteractorImpl$getClosingOffer$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        plusPayClosingOffer = (PlusPayClosingOffer) getClosingOfferInteractorImpl$getClosingOffer$1.L$2;
                        offer2 = (PlusPayCompositeOffers.Offer) getClosingOfferInteractorImpl$getClosingOffer$1.L$0;
                        kotlin.b.b(obj2);
                        plusPayClosingOffer2 = (PlusPayClosingOffer) obj2;
                        qfd0 qfd0Var = this.c;
                        if (plusPayClosingOffer2 == null) {
                            ((rfd0) qfd0Var).a.c(offer2.getMeta().getSessionId(), EvgenOffersAnalytics$LoadReason.ClosingOffer, plusPayClosingOffer.getOffer().getMeta().getProductTarget(), "In-app store returned empty list of offers");
                        }
                        ((rfd0) qfd0Var).a.d(offer2.getMeta().getSessionId(), plusPayClosingOffer.getOffer().getMeta().getProductTarget(), plusPayClosingOffer.getOffer().getMeta().getOffersBatchId(), Collections.singletonList(plusPayClosingOffer.getOffer().getPositionId()));
                        return plusPayClosingOffer2;
                    }
                    offer = (PlusPayCompositeOffers.Offer) getClosingOfferInteractorImpl$getClosingOffer$1.L$0;
                    kotlin.b.b(obj2);
                }
                PlusPayClosingOffer plusPayClosingOffer3 = (PlusPayClosingOffer) obj2;
                getClosingOfferInteractorImpl$getClosingOffer$1.L$0 = offer;
                getClosingOfferInteractorImpl$getClosingOffer$1.L$1 = null;
                getClosingOfferInteractorImpl$getClosingOffer$1.L$2 = plusPayClosingOffer3;
                getClosingOfferInteractorImpl$getClosingOffer$1.label = 2;
                b = b(offer, plusPayClosingOffer3, getClosingOfferInteractorImpl$getClosingOffer$1);
                if (b != obj) {
                    offer2 = offer;
                    plusPayClosingOffer = plusPayClosingOffer3;
                    obj2 = b;
                    plusPayClosingOffer2 = (PlusPayClosingOffer) obj2;
                    qfd0 qfd0Var2 = this.c;
                    if (plusPayClosingOffer2 == null) {
                    }
                    ((rfd0) qfd0Var2).a.d(offer2.getMeta().getSessionId(), plusPayClosingOffer.getOffer().getMeta().getProductTarget(), plusPayClosingOffer.getOffer().getMeta().getOffersBatchId(), Collections.singletonList(plusPayClosingOffer.getOffer().getPositionId()));
                    return plusPayClosingOffer2;
                }
                return obj;
            }
        }
        getClosingOfferInteractorImpl$getClosingOffer$1 = new GetClosingOfferInteractorImpl$getClosingOffer$1(this, continuationImpl);
        Object obj22 = getClosingOfferInteractorImpl$getClosingOffer$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClosingOfferInteractorImpl$getClosingOffer$1.label;
        if (i != 0) {
        }
        PlusPayClosingOffer plusPayClosingOffer32 = (PlusPayClosingOffer) obj22;
        getClosingOfferInteractorImpl$getClosingOffer$1.L$0 = offer;
        getClosingOfferInteractorImpl$getClosingOffer$1.L$1 = null;
        getClosingOfferInteractorImpl$getClosingOffer$1.L$2 = plusPayClosingOffer32;
        getClosingOfferInteractorImpl$getClosingOffer$1.label = 2;
        b = b(offer, plusPayClosingOffer32, getClosingOfferInteractorImpl$getClosingOffer$1);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c4 -> B:10:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, PlusPayClosingOffer plusPayClosingOffer, ContinuationImpl continuationImpl) {
        GetClosingOfferInteractorImpl$processClosingOffer$1 getClosingOfferInteractorImpl$processClosingOffer$1;
        int i;
        PlusPayClosingOffer plusPayClosingOffer2;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayCompositeOffers plusPayCompositeOffers;
        Iterator it;
        int i2;
        if (continuationImpl instanceof GetClosingOfferInteractorImpl$processClosingOffer$1) {
            getClosingOfferInteractorImpl$processClosingOffer$1 = (GetClosingOfferInteractorImpl$processClosingOffer$1) continuationImpl;
            int i3 = getClosingOfferInteractorImpl$processClosingOffer$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getClosingOfferInteractorImpl$processClosingOffer$1.label = i3 - Integer.MIN_VALUE;
                Object obj = getClosingOfferInteractorImpl$processClosingOffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClosingOfferInteractorImpl$processClosingOffer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayCompositeOffers.Offer offer3 = plusPayClosingOffer.getOffer();
                    plusPayClosingOffer2 = plusPayClosingOffer;
                    offer2 = offer3;
                    plusPayCompositeOffers = new PlusPayCompositeOffers(offer.getMeta().getSessionId(), offer3.getMeta().getOffersBatchId(), Collections.singletonList(offer3), offer3.getMeta().getProductTarget());
                    it = this.b.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = getClosingOfferInteractorImpl$processClosingOffer$1.I$0;
                    it = (Iterator) getClosingOfferInteractorImpl$processClosingOffer$1.L$7;
                    PlusPayCompositeOffers.Offer offer4 = (PlusPayCompositeOffers.Offer) getClosingOfferInteractorImpl$processClosingOffer$1.L$2;
                    PlusPayClosingOffer plusPayClosingOffer3 = (PlusPayClosingOffer) getClosingOfferInteractorImpl$processClosingOffer$1.L$1;
                    kotlin.b.b(obj);
                    offer2 = offer4;
                    plusPayClosingOffer2 = plusPayClosingOffer3;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        qqd qqdVar = (qqd) it.next();
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$0 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$1 = plusPayClosingOffer2;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$2 = offer2;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$3 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$4 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$5 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$6 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$7 = it;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$8 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$9 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.L$10 = null;
                        getClosingOfferInteractorImpl$processClosingOffer$1.I$0 = i2;
                        getClosingOfferInteractorImpl$processClosingOffer$1.I$1 = 0;
                        getClosingOfferInteractorImpl$processClosingOffer$1.label = 1;
                        obj = qqdVar.a(plusPayCompositeOffers, getClosingOfferInteractorImpl$processClosingOffer$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
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
                            String b = bu60.b(offer2);
                            if (linkedHashMap.containsKey(b)) {
                                return PlusPayClosingOffer.copy$default(plusPayClosingOffer2, null, null, null, (PlusPayCompositeOffers.Offer) kotlin.collections.b.g(b, linkedHashMap), null, null, null, null, 247, null);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        getClosingOfferInteractorImpl$processClosingOffer$1 = new GetClosingOfferInteractorImpl$processClosingOffer$1(this, continuationImpl);
        Object obj3 = getClosingOfferInteractorImpl$processClosingOffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClosingOfferInteractorImpl$processClosingOffer$1.label;
        if (i != 0) {
        }
    }
}
