package com.yandex.plus.pay.internal.feature.offers.post;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import defpackage.bt90;
import defpackage.bu60;
import defpackage.bwt;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.j73;
import defpackage.jl40;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.pcd0;
import defpackage.qcd0;
import defpackage.qqd;
import defpackage.tcc;
import defpackage.tse0;
import defpackage.yqx0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a implements qqd {
    public final ocd0 a;
    public final mdd0 b;
    public final yqx0 c;

    public a(ocd0 ocd0Var, mdd0 mdd0Var, yqx0 yqx0Var) {
        this.a = ocd0Var;
        this.b = mdd0Var;
        this.c = yqx0Var;
    }

    public static List c(bwt bwtVar) {
        PlusPayCompositeOffers.Offer.Plan.Intro intro;
        Object obj;
        Object obj2;
        PlusPayCompositeOffers.Offer.Plan.Trial trial;
        pcd0 pcd0Var = (pcd0) kotlin.collections.a.b0(bwtVar.b());
        Iterator it = bwtVar.b().iterator();
        while (true) {
            intro = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((pcd0) obj).a.a.compareTo(BigDecimal.valueOf(0L)) == 0) {
                break;
            }
        }
        pcd0 pcd0Var2 = (pcd0) obj;
        Iterator it2 = bwtVar.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            pcd0 pcd0Var3 = (pcd0) obj2;
            if (!jl40.l(pcd0Var3, pcd0Var2) && !jl40.l(pcd0Var3, pcd0Var)) {
                break;
            }
        }
        pcd0 pcd0Var4 = (pcd0) obj2;
        if (pcd0Var2 != null) {
            String str = pcd0Var2.b;
            if (str == null) {
                ny61.g("Period must be set for subscription");
                return null;
            }
            trial = new PlusPayCompositeOffers.Offer.Plan.Trial(str);
        } else {
            trial = null;
        }
        if (pcd0Var4 != null) {
            String str2 = pcd0Var4.b;
            if (str2 == null) {
                ny61.g("Period must be set for subscription");
                return null;
            }
            qcd0 qcd0Var = pcd0Var4.a;
            intro = new PlusPayCompositeOffers.Offer.Plan.Intro(str2, new PlusPayPrice(qcd0Var.a, qcd0Var.b), pcd0Var4.c);
        }
        return j73.A(new PlusPayCompositeOffers.Offer.Plan[]{trial, intro});
    }

    public static boolean d(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if ((tariffOffer != null ? tariffOffer.getVendor() : null) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            return true;
        }
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
        if ((optionOffers instanceof Collection) && optionOffers.isEmpty()) {
            return false;
        }
        Iterator<T> it = optionOffers.iterator();
        while (it.hasNext()) {
            if (((PlusPayCompositeOffers.Offer.Option) it.next()).getVendor() == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.qqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers plusPayCompositeOffers, ContinuationImpl continuationImpl) {
        CorrectInAppOffersPostProcessor$apply$1 correctInAppOffersPostProcessor$apply$1;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers2;
        String str;
        String str2;
        if (continuationImpl instanceof CorrectInAppOffersPostProcessor$apply$1) {
            correctInAppOffersPostProcessor$apply$1 = (CorrectInAppOffersPostProcessor$apply$1) continuationImpl;
            int i2 = correctInAppOffersPostProcessor$apply$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                correctInAppOffersPostProcessor$apply$1.label = i2 - Integer.MIN_VALUE;
                Object obj = correctInAppOffersPostProcessor$apply$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = correctInAppOffersPostProcessor$apply$1.label;
                mdd0 mdd0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority = LogPriority.DEBUG;
                    mdd0Var.getClass();
                    ((ndd0) mdd0Var).a(logPriority, "CorrectInAppOffersPostProcessor", "Preparing in-app offers...");
                    String sessionId = plusPayCompositeOffers.getSessionId();
                    String offersBatchId = plusPayCompositeOffers.getOffersBatchId();
                    List offers = plusPayCompositeOffers.getOffers();
                    correctInAppOffersPostProcessor$apply$1.L$0 = plusPayCompositeOffers;
                    correctInAppOffersPostProcessor$apply$1.L$1 = sessionId;
                    correctInAppOffersPostProcessor$apply$1.L$2 = offersBatchId;
                    correctInAppOffersPostProcessor$apply$1.label = 1;
                    Object b = b(offers, correctInAppOffersPostProcessor$apply$1);
                    if (b == obj2) {
                        return obj2;
                    }
                    plusPayCompositeOffers2 = plusPayCompositeOffers;
                    str = sessionId;
                    obj = b;
                    str2 = offersBatchId;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) correctInAppOffersPostProcessor$apply$1.L$2;
                    str = (String) correctInAppOffersPostProcessor$apply$1.L$1;
                    plusPayCompositeOffers2 = (PlusPayCompositeOffers) correctInAppOffersPostProcessor$apply$1.L$0;
                    b.b(obj);
                }
                PlusPayCompositeOffers plusPayCompositeOffers3 = new PlusPayCompositeOffers(str, str2, (List) obj, plusPayCompositeOffers2.getTarget());
                LogPriority logPriority2 = LogPriority.DEBUG;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority2, "CorrectInAppOffersPostProcessor", "Preparing is done. Offers: " + plusPayCompositeOffers3);
                return plusPayCompositeOffers3;
            }
        }
        correctInAppOffersPostProcessor$apply$1 = new CorrectInAppOffersPostProcessor$apply$1(this, continuationImpl);
        Object obj3 = correctInAppOffersPostProcessor$apply$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = correctInAppOffersPostProcessor$apply$1.label;
        mdd0 mdd0Var2 = this.b;
        if (i != 0) {
        }
        PlusPayCompositeOffers plusPayCompositeOffers32 = new PlusPayCompositeOffers(str, str2, (List) obj3, plusPayCompositeOffers2.getTarget());
        LogPriority logPriority22 = LogPriority.DEBUG;
        mdd0Var2.getClass();
        ((ndd0) mdd0Var2).a(logPriority22, "CorrectInAppOffersPostProcessor", "Preparing is done. Offers: " + plusPayCompositeOffers32);
        return plusPayCompositeOffers32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        CorrectInAppOffersPostProcessor$correctOffers$1 correctInAppOffersPostProcessor$correctOffers$1;
        int i;
        ArrayList arrayList;
        String str;
        List<PlusPayCompositeOffers.Offer> list2;
        List list3;
        Result.Failure failure;
        ?? r10;
        List list4;
        Throwable a;
        Object obj;
        PlusPayPrice commonPrice;
        String commonPeriod;
        PlusPayPrice commonPrice2;
        String commonPeriod2;
        pcd0 pcd0Var;
        String str2;
        List<PlusPayCompositeOffers.Offer> list5 = list;
        try {
            if (continuationImpl instanceof CorrectInAppOffersPostProcessor$correctOffers$1) {
                correctInAppOffersPostProcessor$correctOffers$1 = (CorrectInAppOffersPostProcessor$correctOffers$1) continuationImpl;
                int i2 = correctInAppOffersPostProcessor$correctOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    correctInAppOffersPostProcessor$correctOffers$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = correctInAppOffersPostProcessor$correctOffers$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = correctInAppOffersPostProcessor$correctOffers$1.label;
                    mdd0 mdd0Var = this.b;
                    PlusPayCompositeOffers.Offer.Vendor vendor = null;
                    if (i != 0) {
                        b.b(obj2);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list5) {
                            if (d((PlusPayCompositeOffers.Offer) obj3)) {
                                arrayList2.add(obj3);
                            } else {
                                arrayList3.add(obj3);
                            }
                        }
                        Pair pair = new Pair(arrayList2, arrayList3);
                        List list6 = (List) pair.getFirst();
                        List list7 = (List) pair.getSecond();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : list6) {
                            PlusPayCompositeOffers.Offer offer = (PlusPayCompositeOffers.Offer) obj4;
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                            PlusPayCompositeOffers.Offer.Vendor vendor2 = tariffOffer != null ? tariffOffer.getVendor() : vendor;
                            PlusPayCompositeOffers.Offer.Vendor vendor3 = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
                            boolean z = vendor2 == vendor3 && offer.getOptionOffers().isEmpty();
                            boolean z2 = offer.getTariffOffer() == null && offer.getOptionOffers().size() == 1 && offer.getOptionOffers().get(0).getVendor() == vendor3;
                            if (z || z2) {
                                arrayList4.add(obj4);
                            } else {
                                arrayList5.add(obj4);
                            }
                            vendor = null;
                        }
                        Pair pair2 = new Pair(arrayList4, arrayList5);
                        List list8 = (List) pair2.getFirst();
                        for (PlusPayCompositeOffers.Offer offer2 : (List) pair2.getSecond()) {
                            LogPriority logPriority = LogPriority.WARNING;
                            mdd0Var.getClass();
                            ((ndd0) mdd0Var).a(logPriority, "CorrectInAppOffersPostProcessor", "Offer " + bu60.b(offer2) + " is not currently supported for in-app purchase, so, it is filtered out");
                        }
                        if (list8.isEmpty()) {
                            return list7;
                        }
                        arrayList = new ArrayList();
                        Iterator it = list8.iterator();
                        while (it.hasNext()) {
                            String a2 = bu60.a((PlusPayCompositeOffers.Offer) it.next());
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        try {
                            ocd0 ocd0Var = this.a;
                            PlusPayInAppProductType plusPayInAppProductType = PlusPayInAppProductType.SUBSCRIPTION;
                            correctInAppOffersPostProcessor$correctOffers$1.L$0 = list5;
                            str = null;
                            try {
                                correctInAppOffersPostProcessor$correctOffers$1.L$1 = null;
                                correctInAppOffersPostProcessor$correctOffers$1.L$2 = list7;
                                correctInAppOffersPostProcessor$correctOffers$1.L$3 = list8;
                                correctInAppOffersPostProcessor$correctOffers$1.L$4 = null;
                                correctInAppOffersPostProcessor$correctOffers$1.L$5 = arrayList;
                                correctInAppOffersPostProcessor$correctOffers$1.L$6 = null;
                                correctInAppOffersPostProcessor$correctOffers$1.L$7 = null;
                                correctInAppOffersPostProcessor$correctOffers$1.L$8 = null;
                                correctInAppOffersPostProcessor$correctOffers$1.I$0 = 0;
                                correctInAppOffersPostProcessor$correctOffers$1.I$1 = 0;
                                correctInAppOffersPostProcessor$correctOffers$1.label = 1;
                                obj2 = ocd0Var.a(arrayList, plusPayInAppProductType, correctInAppOffersPostProcessor$correctOffers$1);
                                if (obj2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                list2 = list8;
                                r10 = list7;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                list2 = list8;
                                list4 = list7;
                                failure = new Result.Failure(e);
                                r10 = list4;
                                obj2 = failure;
                                a = Result.a(obj2);
                                if (a != null) {
                                }
                                return r10;
                            } catch (Throwable th) {
                                th = th;
                                list2 = list8;
                                list3 = list7;
                                failure = new Result.Failure(th);
                                r10 = list3;
                                obj2 = failure;
                                a = Result.a(obj2);
                                if (a != null) {
                                }
                                return r10;
                            }
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            str = null;
                        } catch (Throwable th2) {
                            th = th2;
                            str = null;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r2 = (List) correctInAppOffersPostProcessor$correctOffers$1.L$5;
                        list2 = (List) correctInAppOffersPostProcessor$correctOffers$1.L$3;
                        List list9 = (List) correctInAppOffersPostProcessor$correctOffers$1.L$2;
                        List list10 = (List) correctInAppOffersPostProcessor$correctOffers$1.L$0;
                        try {
                            b.b(obj2);
                            r10 = list9;
                            str = null;
                            arrayList = r2;
                            list5 = list10;
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            list4 = list9;
                            str = null;
                            arrayList = r2;
                            list5 = list10;
                            failure = new Result.Failure(e);
                            r10 = list4;
                            obj2 = failure;
                            a = Result.a(obj2);
                            if (a != null) {
                            }
                            return r10;
                        } catch (Throwable th3) {
                            th = th3;
                            list3 = list9;
                            str = null;
                            arrayList = r2;
                            list5 = list10;
                            failure = new Result.Failure(th);
                            r10 = list3;
                            obj2 = failure;
                            a = Result.a(obj2);
                            if (a != null) {
                            }
                            return r10;
                        }
                    }
                    a = Result.a(obj2);
                    if (a != null) {
                        List list11 = (List) obj2;
                        LogPriority logPriority2 = LogPriority.DEBUG;
                        mdd0Var.getClass();
                        StringBuilder sb = new StringBuilder("Found in-app products: ");
                        List list12 = list11;
                        ArrayList arrayList6 = new ArrayList(tcc.n(list12, 10));
                        Iterator it2 = list12.iterator();
                        while (it2.hasNext()) {
                            arrayList6.add(((bwt) it2.next()).a.c);
                        }
                        sb.append(arrayList6);
                        ndd0 ndd0Var = (ndd0) mdd0Var;
                        ndd0Var.a(logPriority2, "CorrectInAppOffersPostProcessor", sb.toString());
                        ArrayList arrayList7 = new ArrayList(tcc.n(list12, 10));
                        Iterator it3 = list12.iterator();
                        while (it3.hasNext()) {
                            arrayList7.add(((bwt) it3.next()).a.c);
                        }
                        Set N0 = kotlin.collections.a.N0(arrayList7);
                        bwt bwtVar = (bwt) kotlin.collections.a.R(list11);
                        String lowerCase = (bwtVar == null || (pcd0Var = (pcd0) kotlin.collections.a.R(bwtVar.b())) == null || (str2 = pcd0Var.a.b) == null) ? str : str2.toLowerCase(Locale.ROOT);
                        List k0 = kotlin.collections.a.k0(arrayList, N0);
                        if (!k0.isEmpty()) {
                            ndd0Var.a(LogPriority.WARNING, "CorrectInAppOffersPostProcessor", tse0.k("Products ", " are requested but missed in response from store", k0));
                            List list13 = k0;
                            bt90 bt90Var = this.c.a;
                            if (lowerCase == null) {
                                lowerCase = "no_value";
                            }
                            List J0 = kotlin.collections.a.J0(list13);
                            LinkedHashMap y = g8e.y(AuthSdkActivity.RESPONSE_TYPE_CODE, "no_value", Constants.KEY_MESSAGE, "no_value");
                            y.put("currency", lowerCase);
                            y.put("additionalData", "no_value");
                            y.put("invalidProductIds", J0);
                            y.put("_meta", bt90.b(new HashMap()));
                            bt90Var.c("Error.Subscription.GooglePlay.Products.Fetch.InvalidProductIds", y);
                        }
                        List list14 = list11;
                        int d = gw00.d(tcc.n(list14, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (Object obj5 : list14) {
                            linkedHashMap.put(((bwt) obj5).a.c, obj5);
                        }
                        ArrayList arrayList8 = new ArrayList();
                        for (PlusPayCompositeOffers.Offer offer3 : list2) {
                            bwt bwtVar2 = (bwt) linkedHashMap.get(bu60.a(offer3));
                            if (bwtVar2 == null) {
                                obj = str;
                            } else if (offer3.getTariffOffer() != null) {
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer3.getTariffOffer();
                                pcd0 pcd0Var2 = (pcd0) kotlin.collections.a.b0(bwtVar2.b());
                                if (pcd0Var2 != null) {
                                    qcd0 qcd0Var = pcd0Var2.a;
                                    commonPrice2 = new PlusPayPrice(qcd0Var.a, qcd0Var.b);
                                } else {
                                    commonPrice2 = tariffOffer2.getCommonPrice();
                                }
                                PlusPayPrice plusPayPrice = commonPrice2;
                                if (pcd0Var2 == null || (commonPeriod2 = pcd0Var2.b) == null) {
                                    commonPeriod2 = tariffOffer2.getCommonPeriod();
                                }
                                obj = PlusPayCompositeOffers.Offer.copy$default(offer3, null, null, null, PlusPayCompositeOffers.Offer.Tariff.copy$default(tariffOffer2, null, null, null, null, null, null, plusPayPrice, commonPeriod2, c(bwtVar2), null, null, 1599, null), null, null, null, false, null, false, null, 2039, null);
                            } else {
                                PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) kotlin.collections.a.P(offer3.getOptionOffers());
                                pcd0 pcd0Var3 = (pcd0) kotlin.collections.a.b0(bwtVar2.b());
                                if (pcd0Var3 != null) {
                                    qcd0 qcd0Var2 = pcd0Var3.a;
                                    commonPrice = new PlusPayPrice(qcd0Var2.a, qcd0Var2.b);
                                } else {
                                    commonPrice = option.getCommonPrice();
                                }
                                PlusPayPrice plusPayPrice2 = commonPrice;
                                if (pcd0Var3 == null || (commonPeriod = pcd0Var3.b) == null) {
                                    commonPeriod = option.getCommonPeriod();
                                }
                                obj = PlusPayCompositeOffers.Offer.copy$default(offer3, null, null, null, null, Collections.singletonList(PlusPayCompositeOffers.Offer.Option.copy$default(option, null, null, null, null, null, null, plusPayPrice2, commonPeriod, c(bwtVar2), null, null, 1599, null)), null, null, false, null, false, null, 2031, null);
                            }
                            if (obj != null) {
                                arrayList8.add(obj);
                            }
                        }
                        int d2 = gw00.d(tcc.n(arrayList8, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                        Iterator it4 = arrayList8.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            linkedHashMap2.put(bu60.b((PlusPayCompositeOffers.Offer) next), next);
                        }
                        r10 = new ArrayList();
                        for (PlusPayCompositeOffers.Offer offer4 : list5) {
                            if (d(offer4)) {
                                offer4 = (PlusPayCompositeOffers.Offer) linkedHashMap2.get(bu60.b(offer4));
                            }
                            if (offer4 != null) {
                                r10.add(offer4);
                            }
                        }
                    } else {
                        LogPriority logPriority3 = LogPriority.ERROR;
                        mdd0Var.getClass();
                        ((ndd0) mdd0Var).b(logPriority3, "CorrectInAppOffersPostProcessor", "Error getting in-app products", a);
                    }
                    return r10;
                }
            }
            if (i != 0) {
            }
            a = Result.a(obj2);
            if (a != null) {
            }
            return r10;
        } catch (CancellationException e4) {
            throw e4;
        }
        correctInAppOffersPostProcessor$correctOffers$1 = new CorrectInAppOffersPostProcessor$correctOffers$1(this, continuationImpl);
        Object obj22 = correctInAppOffersPostProcessor$correctOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = correctInAppOffersPostProcessor$correctOffers$1.label;
        mdd0 mdd0Var2 = this.b;
        PlusPayCompositeOffers.Offer.Vendor vendor4 = null;
    }
}
