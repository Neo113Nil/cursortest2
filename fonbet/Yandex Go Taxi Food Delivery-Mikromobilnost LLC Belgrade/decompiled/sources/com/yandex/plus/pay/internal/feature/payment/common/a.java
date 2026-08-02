package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.fdd0;
import defpackage.kxw;
import defpackage.mdd0;
import defpackage.mxw;
import defpackage.nq80;
import defpackage.nxw;
import defpackage.ny61;
import defpackage.pq80;
import defpackage.s5f;
import defpackage.tcc;
import defpackage.xca1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a implements s5f {
    public final String a;
    public final com.yandex.plus.pay.graphql.invoice.a b;
    public final nq80 c;
    public final fdd0 d;
    public final mdd0 e;

    public a(String str, com.yandex.plus.pay.graphql.invoice.a aVar, nq80 nq80Var, fdd0 fdd0Var, mdd0 mdd0Var) {
        this.a = str;
        this.b = aVar;
        this.c = nq80Var;
        this.d = fdd0Var;
        this.e = mdd0Var;
    }

    public static nxw c(List list) {
        List<PlusPayAdditionalOffer> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (PlusPayAdditionalOffer plusPayAdditionalOffer : list2) {
            arrayList.add(new mxw(plusPayAdditionalOffer.getOffer().getOfferName(), plusPayAdditionalOffer.getOffer().getOffersBatchId(), plusPayAdditionalOffer.getOffer().getPositionId()));
        }
        return new nxw(arrayList);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(5:10|11|12|13|(2:15|16)(2:18|19))(2:20|21))(14:22|23|(1:25)(1:43)|26|(2:29|27)|30|31|32|33|34|(1:36)|37|13|(0)(0))))|50|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0054, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0055, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0050, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0051, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, String str, Map map, boolean z, List list, ContinuationImpl continuationImpl) {
        CreateInvoiceInteractorImpl$createInvoice$1 createInvoiceInteractorImpl$createInvoice$1;
        int i;
        mdd0 mdd0Var;
        Object failure;
        Throwable a;
        try {
            if (continuationImpl instanceof CreateInvoiceInteractorImpl$createInvoice$1) {
                createInvoiceInteractorImpl$createInvoice$1 = (CreateInvoiceInteractorImpl$createInvoice$1) continuationImpl;
                int i2 = createInvoiceInteractorImpl$createInvoice$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    createInvoiceInteractorImpl$createInvoice$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = createInvoiceInteractorImpl$createInvoice$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = createInvoiceInteractorImpl$createInvoice$1.label;
                    mdd0 mdd0Var2 = this.e;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        mdd0Var = mdd0Var2;
                        a = Result.a(obj);
                        if (a == null) {
                            mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Error creating invoice", a, 8);
                            throw xca1.e(a);
                        }
                        PlusPayInvoice a2 = this.d.a((kxw) obj);
                        mdd0.c(mdd0Var, PayCoreLogTag.PAYMENT, "Create invoice result: " + a2);
                        return a2;
                    }
                    kotlin.b.b(obj);
                    mdd0.c(mdd0Var2, PayCoreLogTag.PAYMENT, "Creating invoice");
                    com.yandex.plus.pay.graphql.invoice.a aVar = this.b;
                    String sessionId = offer.getMeta().getSessionId();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String activeTariffId = offer.getActiveTariffId();
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = offer.getMeta().getProductTarget();
                    String a3 = ((pq80) this.c).a(plusPayPaymentAnalyticsParams, offer);
                    String str2 = this.a;
                    String offersBatchId = offer.getMeta().getOffersBatchId();
                    String positionId = offer.getPositionId();
                    nxw c = c(list);
                    createInvoiceInteractorImpl$createInvoice$1.L$0 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$1 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$2 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$3 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$4 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$5 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$6 = null;
                    createInvoiceInteractorImpl$createInvoice$1.L$7 = null;
                    createInvoiceInteractorImpl$createInvoice$1.Z$0 = z;
                    createInvoiceInteractorImpl$createInvoice$1.I$0 = 0;
                    createInvoiceInteractorImpl$createInvoice$1.I$1 = 0;
                    createInvoiceInteractorImpl$createInvoice$1.label = 1;
                    CreateInvoiceInteractorImpl$createInvoice$1 createInvoiceInteractorImpl$createInvoice$12 = createInvoiceInteractorImpl$createInvoice$1;
                    mdd0Var = mdd0Var2;
                    try {
                        failure = aVar.a(sessionId, id, activeTariffId, arrayList, str, productTarget, a3, str2, offersBatchId, positionId, map, z, c, createInvoiceInteractorImpl$createInvoice$12);
                        if (failure == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (TimeoutCancellationException e) {
                        e = e;
                        failure = new Result.Failure(e);
                        obj = failure;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        failure = new Result.Failure(th);
                        obj = failure;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                    }
                    obj = failure;
                    a = Result.a(obj);
                    if (a == null) {
                    }
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e2) {
            throw e2;
        }
        createInvoiceInteractorImpl$createInvoice$1 = new CreateInvoiceInteractorImpl$createInvoice$1(this, continuationImpl);
        Object obj2 = createInvoiceInteractorImpl$createInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createInvoiceInteractorImpl$createInvoice$1.label;
        mdd0 mdd0Var22 = this.e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|8|(1:(2:11|12)(2:20|21))(8:22|23|(1:25)(1:34)|26|(2:29|27)|30|31|(1:33))|13|(2:15|16)(2:18|19)))|42|6|7|8|(0)(0)|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, Map map, ContinuationImpl continuationImpl) {
        CreateInvoiceInteractorImpl$createSilentInvoice$1 createInvoiceInteractorImpl$createSilentInvoice$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof CreateInvoiceInteractorImpl$createSilentInvoice$1) {
            createInvoiceInteractorImpl$createSilentInvoice$1 = (CreateInvoiceInteractorImpl$createSilentInvoice$1) continuationImpl;
            int i2 = createInvoiceInteractorImpl$createSilentInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createInvoiceInteractorImpl$createSilentInvoice$1.label = i2 - Integer.MIN_VALUE;
                CreateInvoiceInteractorImpl$createSilentInvoice$1 createInvoiceInteractorImpl$createSilentInvoice$12 = createInvoiceInteractorImpl$createSilentInvoice$1;
                Object obj = createInvoiceInteractorImpl$createSilentInvoice$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createInvoiceInteractorImpl$createSilentInvoice$12.label;
                mdd0 mdd0Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mdd0.c(mdd0Var, PayCoreLogTag.PAYMENT, "Creating silent invoice");
                    com.yandex.plus.pay.graphql.invoice.a aVar = this.b;
                    String sessionId = offer.getMeta().getSessionId();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String activeTariffId = offer.getActiveTariffId();
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    String str = id;
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = offer.getMeta().getProductTarget();
                    String a2 = ((pq80) this.c).a(plusPayPaymentAnalyticsParams, offer);
                    String str2 = this.a;
                    String offersBatchId = offer.getMeta().getOffersBatchId();
                    String positionId = offer.getPositionId();
                    createInvoiceInteractorImpl$createSilentInvoice$12.L$0 = null;
                    createInvoiceInteractorImpl$createSilentInvoice$12.L$1 = null;
                    createInvoiceInteractorImpl$createSilentInvoice$12.L$2 = null;
                    createInvoiceInteractorImpl$createSilentInvoice$12.L$3 = null;
                    createInvoiceInteractorImpl$createSilentInvoice$12.L$4 = null;
                    createInvoiceInteractorImpl$createSilentInvoice$12.L$5 = null;
                    createInvoiceInteractorImpl$createSilentInvoice$12.I$0 = 0;
                    createInvoiceInteractorImpl$createSilentInvoice$12.I$1 = 0;
                    createInvoiceInteractorImpl$createSilentInvoice$12.label = 1;
                    obj = aVar.b(sessionId, str, activeTariffId, arrayList, productTarget, a2, str2, offersBatchId, positionId, map, createInvoiceInteractorImpl$createSilentInvoice$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a == null) {
                    mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Error creating silent invoice", a, 8);
                    throw xca1.e(a);
                }
                PlusPayInvoice a3 = this.d.a((kxw) obj);
                mdd0.c(mdd0Var, PayCoreLogTag.PAYMENT, "Create silent invoice result: " + a3);
                return a3;
            }
        }
        createInvoiceInteractorImpl$createSilentInvoice$1 = new CreateInvoiceInteractorImpl$createSilentInvoice$1(this, continuationImpl);
        CreateInvoiceInteractorImpl$createSilentInvoice$1 createInvoiceInteractorImpl$createSilentInvoice$122 = createInvoiceInteractorImpl$createSilentInvoice$1;
        Object obj2 = createInvoiceInteractorImpl$createSilentInvoice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createInvoiceInteractorImpl$createSilentInvoice$122.label;
        mdd0 mdd0Var2 = this.e;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a == null) {
        }
    }
}
