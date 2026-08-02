package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.bu60;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.qqd;
import defpackage.tcc;
import defpackage.xbt;
import defpackage.xfd0;
import defpackage.yfd0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements xbt {
    public final b a;
    public final List b;
    public final xfd0 c;

    public a(b bVar, List list, xfd0 xfd0Var) {
        this.a = bVar;
        this.b = list;
        this.c = xfd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.xbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        BackendGetPresaleInteractor$getPresale$1 backendGetPresaleInteractor$getPresale$1;
        int i;
        PlusPayPresale plusPayPresale;
        if (continuationImpl instanceof BackendGetPresaleInteractor$getPresale$1) {
            backendGetPresaleInteractor$getPresale$1 = (BackendGetPresaleInteractor$getPresale$1) continuationImpl;
            int i2 = backendGetPresaleInteractor$getPresale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                backendGetPresaleInteractor$getPresale$1.label = i2 - Integer.MIN_VALUE;
                Object obj = backendGetPresaleInteractor$getPresale$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = backendGetPresaleInteractor$getPresale$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
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
                    backendGetPresaleInteractor$getPresale$1.L$0 = null;
                    backendGetPresaleInteractor$getPresale$1.L$1 = null;
                    backendGetPresaleInteractor$getPresale$1.label = 1;
                    obj = this.a.a(t, productTarget, sessionId, backendGetPresaleInteractor$getPresale$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        plusPayPresale = (PlusPayPresale) backendGetPresaleInteractor$getPresale$1.L$2;
                        kotlin.b.b(obj);
                        PlusPayPresale plusPayPresale2 = (PlusPayPresale) obj;
                        xfd0 xfd0Var = this.c;
                        if (plusPayPresale2 == null) {
                            ((yfd0) xfd0Var).a.c(plusPayPresale.getSuggestedOffer().getMeta().getSessionId(), EvgenOffersAnalytics$LoadReason.Presale, plusPayPresale.getSuggestedOffer().getMeta().getProductTarget(), "In-app store returned empty list of offers");
                        }
                        ((yfd0) xfd0Var).a.d(plusPayPresale.getSuggestedOffer().getMeta().getSessionId(), plusPayPresale.getSuggestedOffer().getMeta().getProductTarget(), plusPayPresale.getSuggestedOffer().getMeta().getOffersBatchId(), Collections.singletonList(plusPayPresale.getSuggestedOffer().getPositionId()));
                        return plusPayPresale2;
                    }
                    kotlin.b.b(obj);
                }
                plusPayPresale = (PlusPayPresale) obj;
                backendGetPresaleInteractor$getPresale$1.L$0 = null;
                backendGetPresaleInteractor$getPresale$1.L$1 = null;
                backendGetPresaleInteractor$getPresale$1.L$2 = plusPayPresale;
                backendGetPresaleInteractor$getPresale$1.label = 2;
                obj = b(plusPayPresale, backendGetPresaleInteractor$getPresale$1);
            }
        }
        backendGetPresaleInteractor$getPresale$1 = new BackendGetPresaleInteractor$getPresale$1(this, continuationImpl);
        Object obj3 = backendGetPresaleInteractor$getPresale$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = backendGetPresaleInteractor$getPresale$1.label;
        if (i != 0) {
        }
        plusPayPresale = (PlusPayPresale) obj3;
        backendGetPresaleInteractor$getPresale$1.L$0 = null;
        backendGetPresaleInteractor$getPresale$1.L$1 = null;
        backendGetPresaleInteractor$getPresale$1.L$2 = plusPayPresale;
        backendGetPresaleInteractor$getPresale$1.label = 2;
        obj3 = b(plusPayPresale, backendGetPresaleInteractor$getPresale$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:10:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayPresale plusPayPresale, ContinuationImpl continuationImpl) {
        BackendGetPresaleInteractor$processPresale$1 backendGetPresaleInteractor$processPresale$1;
        int i;
        PlusPayPresale plusPayPresale2;
        PlusPayCompositeOffers.Offer offer;
        PlusPayCompositeOffers plusPayCompositeOffers;
        Iterator it;
        int i2;
        if (continuationImpl instanceof BackendGetPresaleInteractor$processPresale$1) {
            backendGetPresaleInteractor$processPresale$1 = (BackendGetPresaleInteractor$processPresale$1) continuationImpl;
            int i3 = backendGetPresaleInteractor$processPresale$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                backendGetPresaleInteractor$processPresale$1.label = i3 - Integer.MIN_VALUE;
                Object obj = backendGetPresaleInteractor$processPresale$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = backendGetPresaleInteractor$processPresale$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayCompositeOffers.Offer suggestedOffer = plusPayPresale.getSuggestedOffer();
                    plusPayPresale2 = plusPayPresale;
                    offer = suggestedOffer;
                    plusPayCompositeOffers = new PlusPayCompositeOffers(suggestedOffer.getMeta().getSessionId(), suggestedOffer.getMeta().getOffersBatchId(), Collections.singletonList(suggestedOffer), suggestedOffer.getMeta().getProductTarget());
                    it = this.b.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = backendGetPresaleInteractor$processPresale$1.I$0;
                    it = (Iterator) backendGetPresaleInteractor$processPresale$1.L$6;
                    PlusPayCompositeOffers.Offer offer2 = (PlusPayCompositeOffers.Offer) backendGetPresaleInteractor$processPresale$1.L$1;
                    PlusPayPresale plusPayPresale3 = (PlusPayPresale) backendGetPresaleInteractor$processPresale$1.L$0;
                    kotlin.b.b(obj);
                    offer = offer2;
                    plusPayPresale2 = plusPayPresale3;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        qqd qqdVar = (qqd) it.next();
                        backendGetPresaleInteractor$processPresale$1.L$0 = plusPayPresale2;
                        backendGetPresaleInteractor$processPresale$1.L$1 = offer;
                        backendGetPresaleInteractor$processPresale$1.L$2 = null;
                        backendGetPresaleInteractor$processPresale$1.L$3 = null;
                        backendGetPresaleInteractor$processPresale$1.L$4 = null;
                        backendGetPresaleInteractor$processPresale$1.L$5 = null;
                        backendGetPresaleInteractor$processPresale$1.L$6 = it;
                        backendGetPresaleInteractor$processPresale$1.L$7 = null;
                        backendGetPresaleInteractor$processPresale$1.L$8 = null;
                        backendGetPresaleInteractor$processPresale$1.L$9 = null;
                        backendGetPresaleInteractor$processPresale$1.I$0 = i2;
                        backendGetPresaleInteractor$processPresale$1.I$1 = 0;
                        backendGetPresaleInteractor$processPresale$1.label = 1;
                        obj = qqdVar.a(plusPayCompositeOffers, backendGetPresaleInteractor$processPresale$1);
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
                            String b = bu60.b(offer);
                            if (linkedHashMap.containsKey(b)) {
                                return PlusPayPresale.copy$default(plusPayPresale2, (PlusPayCompositeOffers.Offer) kotlin.collections.b.g(b, linkedHashMap), 0L, null, 6, null);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        backendGetPresaleInteractor$processPresale$1 = new BackendGetPresaleInteractor$processPresale$1(this, continuationImpl);
        Object obj3 = backendGetPresaleInteractor$processPresale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = backendGetPresaleInteractor$processPresale$1.label;
        if (i != 0) {
        }
    }
}
