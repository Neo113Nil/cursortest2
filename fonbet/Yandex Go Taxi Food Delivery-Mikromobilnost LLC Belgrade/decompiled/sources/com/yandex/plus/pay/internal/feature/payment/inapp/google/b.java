package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.exception.PlusPayGooglePlayErrorKind;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import com.yandex.plus.pay.inapp.api.PlusPayInAppReplacementParams$Strategy;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppBillingUnavailableException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppCancelException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppConnectionException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppInvalidSignatureException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppItemAlreadyOwnedException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppItemUnavailableException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppNotEnoughFundsException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppPurchaseNotFoundException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppPurchaseUnspecifiedStateException;
import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.bod0;
import defpackage.bu60;
import defpackage.bvf0;
import defpackage.bwt;
import defpackage.gzu0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.jse;
import defpackage.lod0;
import defpackage.mdd0;
import defpackage.nod0;
import defpackage.nq80;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.ood0;
import defpackage.pod0;
import defpackage.pq80;
import defpackage.qod0;
import defpackage.qqx0;
import defpackage.qv10;
import defpackage.rcd0;
import defpackage.rod0;
import defpackage.s1v0;
import defpackage.sod0;
import defpackage.t1v0;
import defpackage.tpr;
import defpackage.ucd0;
import defpackage.w511;
import defpackage.xqx0;
import defpackage.xvz;
import defpackage.ynd0;
import defpackage.zio;
import defpackage.zs90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b implements lod0 {
    public final PlusPayCompositeOffers.Offer a;
    public final PlusPayInAppReplacementParams b;
    public final PlusPayPaymentAnalyticsParams c;
    public final Map d;
    public final ocd0 e;
    public final gzu0 f;
    public final t1v0 g;
    public final com.yandex.plus.pay.internal.feature.cache.a h;
    public final nq80 i;
    public final qqx0 j;
    public final com.yandex.plus.experiments.impl.providers.a k;
    public final mdd0 l;
    public final com.yandex.plus.core.benchmark.a m;
    public final Set n;
    public final com.yandex.plus.core.benchmark.b o;
    public final String p;
    public final ike q;
    public final r0 r;
    public final String s;
    public final k t;

    public b(PlusPayCompositeOffers.Offer offer, PlusPayInAppReplacementParams plusPayInAppReplacementParams, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, UUID uuid, Map map, ocd0 ocd0Var, gzu0 gzu0Var, t1v0 t1v0Var, com.yandex.plus.pay.internal.feature.cache.a aVar, nq80 nq80Var, qqx0 qqx0Var, com.yandex.plus.experiments.impl.providers.a aVar2, mdd0 mdd0Var, com.yandex.plus.core.benchmark.a aVar3, Set set, jse jseVar) {
        this.a = offer;
        this.b = plusPayInAppReplacementParams;
        this.c = plusPayPaymentAnalyticsParams;
        this.d = map;
        this.e = ocd0Var;
        this.f = gzu0Var;
        this.g = t1v0Var;
        this.h = aVar;
        this.i = nq80Var;
        this.j = qqx0Var;
        this.k = aVar2;
        this.l = mdd0Var;
        this.m = aVar3;
        this.n = set;
        this.o = aVar3.c("Payment.InApp.Success");
        this.p = uuid.toString().toUpperCase(Locale.ROOT);
        this.q = qv10.e(jseVar);
        r0 c = bvf0.c(sod0.a);
        this.r = c;
        String a = bu60.a(offer);
        if (a == null) {
            ny61.g("product id for in-app purchase is not found");
            throw null;
        }
        this.s = a;
        this.t = new k(new o(new jqr(new n(e.Y(c, new TarifficatorGooglePaymentSession$flow$1(3, null)), new TarifficatorGooglePaymentSession$flow$2(this, jseVar, null)), new TarifficatorGooglePaymentSession$flow$3(this, null), 3), new TarifficatorGooglePaymentSession$flow$4(3, null)), new TarifficatorGooglePaymentSession$flow$5(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(1:(1:(1:(8:15|16|17|18|19|20|(3:22|(1:24)(2:26|(1:28)(2:29|(1:54)(2:35|(1:37)(2:38|(1:40)(2:41|(1:43)(2:44|(1:46)(5:47|(1:49)|50|(1:52)|53)))))))|25)|55)(2:58|59))(5:60|61|62|63|(3:65|(7:68|17|18|19|20|(0)|55)|67)(5:69|19|20|(0)|55)))(6:70|71|72|73|(3:75|63|(0)(0))|67))(8:76|77|78|79|80|81|(3:83|73|(0))|67))(2:92|93))(5:114|115|116|(1:118)|67)|94|(2:95|(2:97|(1:110)(2:101|102))(2:112|113))|103|(3:105|(6:107|78|79|80|81|(0))|67)(5:108|80|81|(0)|67)))|136|6|7|8|(0)(0)|94|(3:95|(0)(0)|110)|103|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0098, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0093, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0094, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00c3, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00bf, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0062, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x005f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00bf: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:133:0x00bf */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00c3: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:131:0x00c3 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0094: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:129:0x0094 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0098: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:127:0x0098 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015b A[Catch: all -> 0x0093, TimeoutCancellationException -> 0x0097, CancellationException -> 0x02d8, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x02d8, blocks: (B:16:0x005a, B:17:0x0251, B:61:0x008b, B:63:0x021a, B:65:0x0224, B:69:0x026c, B:71:0x00b7, B:73:0x01dd, B:77:0x00da, B:78:0x0174, B:81:0x0180, B:93:0x00f3, B:94:0x0131, B:95:0x0137, B:97:0x013d, B:99:0x0148, B:103:0x0157, B:105:0x015b, B:116:0x0112), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0224 A[Catch: all -> 0x0093, TimeoutCancellationException -> 0x0097, CancellationException -> 0x02d8, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x02d8, blocks: (B:16:0x005a, B:17:0x0251, B:61:0x008b, B:63:0x021a, B:65:0x0224, B:69:0x026c, B:71:0x00b7, B:73:0x01dd, B:77:0x00da, B:78:0x0174, B:81:0x0180, B:93:0x00f3, B:94:0x0131, B:95:0x0137, B:97:0x013d, B:99:0x0148, B:103:0x0157, B:105:0x015b, B:116:0x0112), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c A[Catch: all -> 0x0093, TimeoutCancellationException -> 0x0097, CancellationException -> 0x02d8, TRY_ENTER, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x02d8, blocks: (B:16:0x005a, B:17:0x0251, B:61:0x008b, B:63:0x021a, B:65:0x0224, B:69:0x026c, B:71:0x00b7, B:73:0x01dd, B:77:0x00da, B:78:0x0174, B:81:0x0180, B:93:0x00f3, B:94:0x0131, B:95:0x0137, B:97:0x013d, B:99:0x0148, B:103:0x0157, B:105:0x015b, B:116:0x0112), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d A[Catch: all -> 0x0093, TimeoutCancellationException -> 0x0097, CancellationException -> 0x02d8, TryCatch #6 {CancellationException -> 0x02d8, blocks: (B:16:0x005a, B:17:0x0251, B:61:0x008b, B:63:0x021a, B:65:0x0224, B:69:0x026c, B:71:0x00b7, B:73:0x01dd, B:77:0x00da, B:78:0x0174, B:81:0x0180, B:93:0x00f3, B:94:0x0131, B:95:0x0137, B:97:0x013d, B:99:0x0148, B:103:0x0157, B:105:0x015b, B:116:0x0112), top: B:8:0x002e }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v14, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, ContinuationImpl continuationImpl) {
        TarifficatorGooglePaymentSession$startPayment$1 tarifficatorGooglePaymentSession$startPayment$1;
        int i;
        Object failure;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Throwable a;
        Object pod0Var;
        b bVar2;
        int i2;
        Ref$ObjectRef ref$ObjectRef3;
        int i3;
        Iterator it;
        Object obj;
        rcd0 rcd0Var;
        int i4;
        int i5;
        b bVar3;
        Ref$ObjectRef ref$ObjectRef4;
        int i6;
        b bVar4;
        Ref$ObjectRef ref$ObjectRef5;
        int i7;
        Object a2;
        int i8;
        rcd0 rcd0Var2;
        Ref$ObjectRef ref$ObjectRef6;
        b bVar5;
        Object a3;
        int i9;
        b bVar6;
        PlusPaySubmitResult plusPaySubmitResult;
        PlusPaySubscriptionInfo plusPaySubscriptionInfo;
        PlusPaySubmitResult plusPaySubmitResult2;
        r0 r0Var = bVar.r;
        try {
            if (continuationImpl instanceof TarifficatorGooglePaymentSession$startPayment$1) {
                tarifficatorGooglePaymentSession$startPayment$1 = (TarifficatorGooglePaymentSession$startPayment$1) continuationImpl;
                int i10 = tarifficatorGooglePaymentSession$startPayment$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    tarifficatorGooglePaymentSession$startPayment$1.label = i10 - Integer.MIN_VALUE;
                    TarifficatorGooglePaymentSession$startPayment$1 tarifficatorGooglePaymentSession$startPayment$12 = tarifficatorGooglePaymentSession$startPayment$1;
                    Object obj2 = tarifficatorGooglePaymentSession$startPayment$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = tarifficatorGooglePaymentSession$startPayment$12.label;
                    zy11 zy11Var = zy11.a;
                    ?? r5 = 3;
                    r5 = 3;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        r0Var.getClass();
                        r0Var.m(null, sod0.a);
                        ((zio) bVar.j).g(bVar.a, bVar.p);
                        Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                        try {
                            ocd0 ocd0Var = bVar.e;
                            PlusPayInAppProductType plusPayInAppProductType = PlusPayInAppProductType.SUBSCRIPTION;
                            tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef7;
                            tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                            tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                            tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar;
                            tarifficatorGooglePaymentSession$startPayment$12.I$0 = 0;
                            tarifficatorGooglePaymentSession$startPayment$12.I$1 = 0;
                            tarifficatorGooglePaymentSession$startPayment$12.label = 1;
                            obj2 = ocd0Var.b(plusPayInAppProductType, tarifficatorGooglePaymentSession$startPayment$12);
                            if (obj2 != coroutineSingletons) {
                                bVar2 = bVar;
                                i2 = 0;
                                ref$ObjectRef3 = ref$ObjectRef7;
                                i3 = 0;
                            }
                            return coroutineSingletons;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            r5 = ref$ObjectRef7;
                            failure = new Result.Failure(e);
                            ref$ObjectRef = r5;
                            ref$ObjectRef2 = ref$ObjectRef;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return zy11Var;
                        } catch (Throwable th) {
                            th = th;
                            r5 = ref$ObjectRef7;
                            failure = new Result.Failure(th);
                            ref$ObjectRef = r5;
                            ref$ObjectRef2 = ref$ObjectRef;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return zy11Var;
                        }
                    }
                    if (i != 1) {
                        if (i == 2) {
                            i3 = tarifficatorGooglePaymentSession$startPayment$12.I$1;
                            i6 = tarifficatorGooglePaymentSession$startPayment$12.I$0;
                            bVar4 = (b) tarifficatorGooglePaymentSession$startPayment$12.L$3;
                            ref$ObjectRef5 = (Ref$ObjectRef) tarifficatorGooglePaymentSession$startPayment$12.L$0;
                            kotlin.b.b(obj2);
                            rcd0Var = (rcd0) obj2;
                            i4 = i3;
                            i5 = i6;
                            bVar3 = bVar4;
                            ref$ObjectRef4 = ref$ObjectRef5;
                            try {
                                r0 r0Var2 = bVar3.r;
                                PlusPayCompositeOffers.Offer offer = bVar3.a;
                                rod0 rod0Var = rod0.a;
                                r0Var2.getClass();
                                r0Var2.m(null, rod0Var);
                                String a4 = ((pq80) bVar3.i).a(bVar3.c, offer);
                                gzu0 gzu0Var = bVar3.f;
                                String sessionId = offer.getMeta().getSessionId();
                                String offersBatchId = offer.getMeta().getOffersBatchId();
                                String positionId = offer.getPositionId();
                                Map map = bVar3.d;
                                tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef4;
                                tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                                tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                                tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar3;
                                tarifficatorGooglePaymentSession$startPayment$12.L$4 = null;
                                tarifficatorGooglePaymentSession$startPayment$12.L$5 = rcd0Var;
                                tarifficatorGooglePaymentSession$startPayment$12.I$0 = i5;
                                tarifficatorGooglePaymentSession$startPayment$12.I$1 = i4;
                                tarifficatorGooglePaymentSession$startPayment$12.label = 3;
                                rcd0 rcd0Var3 = rcd0Var;
                                i7 = i5;
                                a2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.a) gzu0Var.a).a(rcd0Var3, a4, sessionId, offersBatchId, positionId, map, tarifficatorGooglePaymentSession$startPayment$12);
                                if (a2 != coroutineSingletons) {
                                    i8 = i4;
                                    obj2 = a2;
                                    rcd0Var2 = rcd0Var3;
                                    ref$ObjectRef6 = ref$ObjectRef4;
                                    bVar5 = bVar3;
                                    PlusPaySubmitResult plusPaySubmitResult3 = (PlusPaySubmitResult) obj2;
                                    ref$ObjectRef6.element = plusPaySubmitResult3.getInvoiceId();
                                    bVar5.f(plusPaySubmitResult3.getInvoiceId());
                                    t1v0 t1v0Var = bVar5.g;
                                    String invoiceId = plusPaySubmitResult3.getInvoiceId();
                                    Set set = bVar5.n;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef6;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar5;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$4 = plusPaySubmitResult3;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$5 = null;
                                    tarifficatorGooglePaymentSession$startPayment$12.L$6 = rcd0Var2;
                                    tarifficatorGooglePaymentSession$startPayment$12.I$0 = i7;
                                    tarifficatorGooglePaymentSession$startPayment$12.I$1 = i8;
                                    tarifficatorGooglePaymentSession$startPayment$12.label = 4;
                                    a3 = ((com.yandex.plus.pay.internal.feature.subscription.b) t1v0Var).a(invoiceId, set, s1v0.a, tarifficatorGooglePaymentSession$startPayment$12);
                                    if (a3 != coroutineSingletons) {
                                    }
                                }
                                return coroutineSingletons;
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                r5 = ref$ObjectRef4;
                                failure = new Result.Failure(e);
                                ref$ObjectRef = r5;
                                ref$ObjectRef2 = ref$ObjectRef;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = ref$ObjectRef4;
                                failure = new Result.Failure(th);
                                ref$ObjectRef = r5;
                                ref$ObjectRef2 = ref$ObjectRef;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                return zy11Var;
                            }
                        }
                        if (i == 3) {
                            i8 = tarifficatorGooglePaymentSession$startPayment$12.I$1;
                            int i11 = tarifficatorGooglePaymentSession$startPayment$12.I$0;
                            rcd0Var2 = (rcd0) tarifficatorGooglePaymentSession$startPayment$12.L$5;
                            bVar5 = (b) tarifficatorGooglePaymentSession$startPayment$12.L$3;
                            Ref$ObjectRef ref$ObjectRef8 = (Ref$ObjectRef) tarifficatorGooglePaymentSession$startPayment$12.L$0;
                            kotlin.b.b(obj2);
                            i7 = i11;
                            ref$ObjectRef6 = ref$ObjectRef8;
                            PlusPaySubmitResult plusPaySubmitResult32 = (PlusPaySubmitResult) obj2;
                            ref$ObjectRef6.element = plusPaySubmitResult32.getInvoiceId();
                            bVar5.f(plusPaySubmitResult32.getInvoiceId());
                            t1v0 t1v0Var2 = bVar5.g;
                            String invoiceId2 = plusPaySubmitResult32.getInvoiceId();
                            Set set2 = bVar5.n;
                            tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef6;
                            tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                            tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                            tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar5;
                            tarifficatorGooglePaymentSession$startPayment$12.L$4 = plusPaySubmitResult32;
                            tarifficatorGooglePaymentSession$startPayment$12.L$5 = null;
                            tarifficatorGooglePaymentSession$startPayment$12.L$6 = rcd0Var2;
                            tarifficatorGooglePaymentSession$startPayment$12.I$0 = i7;
                            tarifficatorGooglePaymentSession$startPayment$12.I$1 = i8;
                            tarifficatorGooglePaymentSession$startPayment$12.label = 4;
                            a3 = ((com.yandex.plus.pay.internal.feature.subscription.b) t1v0Var2).a(invoiceId2, set2, s1v0.a, tarifficatorGooglePaymentSession$startPayment$12);
                            if (a3 != coroutineSingletons) {
                                ref$ObjectRef2 = ref$ObjectRef6;
                                i9 = i8;
                                bVar6 = bVar5;
                                plusPaySubmitResult = plusPaySubmitResult32;
                                obj2 = a3;
                                plusPaySubscriptionInfo = (PlusPaySubscriptionInfo) obj2;
                                if (plusPaySubscriptionInfo.getStatus() == PlusPaySubscriptionInfo.SubscriptionStatus.HOLD) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            plusPaySubmitResult2 = (PlusPaySubmitResult) tarifficatorGooglePaymentSession$startPayment$12.L$4;
                            bVar6 = (b) tarifficatorGooglePaymentSession$startPayment$12.L$3;
                            Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) tarifficatorGooglePaymentSession$startPayment$12.L$0;
                            kotlin.b.b(obj2);
                            r5 = ref$ObjectRef9;
                            bVar6.e(plusPaySubmitResult2.getInvoiceId());
                            r0 r0Var3 = bVar6.r;
                            qod0 qod0Var = new qod0(plusPaySubmitResult2.getInvoiceId(), null);
                            r0Var3.getClass();
                            r0Var3.m(null, qod0Var);
                            ref$ObjectRef2 = r5;
                            failure = zy11Var;
                            a = Result.a(failure);
                            if (a != null) {
                                String str = (String) ref$ObjectRef2.element;
                                if (a instanceof PlusPayInAppBillingUnavailableException) {
                                    bVar.d("BILLING_UNAVAILABLE", str);
                                    pod0Var = new pod0(str, new ynd0(PlusPayGooglePlayErrorKind.BILLING_UNAVAILABLE));
                                } else if (a instanceof PlusPayInAppItemUnavailableException) {
                                    bVar.d("PRODUCT_UNAVAILABLE", str);
                                    pod0Var = new pod0(str, new ynd0(PlusPayGooglePlayErrorKind.PRODUCT_UNAVAILABLE));
                                } else if ((a instanceof PlusPayInAppInvalidSignatureException) || (a instanceof PlusPayInAppItemAlreadyOwnedException) || (a instanceof PlusPayInAppPurchaseNotFoundException)) {
                                    bVar.d("BILLING_INTERNAL_ERROR", str);
                                    pod0Var = new pod0(str, new ynd0(PlusPayGooglePlayErrorKind.BILLING_INTERNAL_ERROR));
                                } else if (a instanceof PlusPayInAppPurchaseUnspecifiedStateException) {
                                    bVar.d("PURCHASE_UNSPECIFIED_STATE", str);
                                    pod0Var = new pod0(str, new ynd0(PlusPayGooglePlayErrorKind.PURCHASE_UNSPECIFIED_STATE));
                                } else if (a instanceof PlusPayInAppNotEnoughFundsException) {
                                    bVar.d("NOT_ENOUGH_FUNDS", str);
                                    pod0Var = new pod0(str, new ynd0(PlusPayGooglePlayErrorKind.NOT_ENOUGH_FUNDS));
                                } else if (a instanceof PlusPayInAppConnectionException) {
                                    bVar.d("CONNECTION_ERROR", str);
                                    pod0Var = new pod0(str, new ynd0(PlusPayGooglePlayErrorKind.CONNECTION_ERROR));
                                } else if (a instanceof PlusPayInAppCancelException) {
                                    pod0Var = nod0.a;
                                } else {
                                    String message = a.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    bVar.d(message, str);
                                    String message2 = a.getMessage();
                                    pod0Var = new pod0(str, new bod0(message2 != null ? message2 : ""));
                                }
                                r0Var.getClass();
                                r0Var.m(null, pod0Var);
                            }
                            return zy11Var;
                        }
                        int i12 = tarifficatorGooglePaymentSession$startPayment$12.I$1;
                        int i13 = tarifficatorGooglePaymentSession$startPayment$12.I$0;
                        rcd0Var2 = (rcd0) tarifficatorGooglePaymentSession$startPayment$12.L$6;
                        plusPaySubmitResult = (PlusPaySubmitResult) tarifficatorGooglePaymentSession$startPayment$12.L$4;
                        b bVar7 = (b) tarifficatorGooglePaymentSession$startPayment$12.L$3;
                        ref$ObjectRef2 = (Ref$ObjectRef) tarifficatorGooglePaymentSession$startPayment$12.L$0;
                        kotlin.b.b(obj2);
                        i7 = i13;
                        i9 = i12;
                        bVar6 = bVar7;
                        plusPaySubscriptionInfo = (PlusPaySubscriptionInfo) obj2;
                        if (plusPaySubscriptionInfo.getStatus() == PlusPaySubscriptionInfo.SubscriptionStatus.HOLD) {
                            bVar6.d("subscriptionStatus=" + plusPaySubscriptionInfo.getStatus().name(), plusPaySubmitResult.getInvoiceId());
                            r0 r0Var4 = bVar6.r;
                            pod0 pod0Var2 = new pod0(plusPaySubmitResult.getInvoiceId(), new bod0("Invalid subscription status: " + plusPaySubscriptionInfo.getStatus().name() + ')'));
                            r0Var4.getClass();
                            r0Var4.m(null, pod0Var2);
                            failure = zy11Var;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return zy11Var;
                        }
                        r0 r0Var5 = bVar6.r;
                        ood0 ood0Var = ood0.a;
                        r0Var5.getClass();
                        r0Var5.m(null, ood0Var);
                        ocd0 ocd0Var2 = bVar6.e;
                        tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef2;
                        tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar6;
                        tarifficatorGooglePaymentSession$startPayment$12.L$4 = plusPaySubmitResult;
                        tarifficatorGooglePaymentSession$startPayment$12.L$5 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$6 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$7 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.I$0 = i7;
                        tarifficatorGooglePaymentSession$startPayment$12.I$1 = i9;
                        tarifficatorGooglePaymentSession$startPayment$12.label = 5;
                        if (ocd0Var2.c(rcd0Var2, tarifficatorGooglePaymentSession$startPayment$12) != coroutineSingletons) {
                            plusPaySubmitResult2 = plusPaySubmitResult;
                            r5 = ref$ObjectRef2;
                            bVar6.e(plusPaySubmitResult2.getInvoiceId());
                            r0 r0Var32 = bVar6.r;
                            qod0 qod0Var2 = new qod0(plusPaySubmitResult2.getInvoiceId(), null);
                            r0Var32.getClass();
                            r0Var32.m(null, qod0Var2);
                            ref$ObjectRef2 = r5;
                            failure = zy11Var;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                    i3 = tarifficatorGooglePaymentSession$startPayment$12.I$1;
                    i2 = tarifficatorGooglePaymentSession$startPayment$12.I$0;
                    bVar2 = (b) tarifficatorGooglePaymentSession$startPayment$12.L$3;
                    ref$ObjectRef3 = (Ref$ObjectRef) tarifficatorGooglePaymentSession$startPayment$12.L$0;
                    kotlin.b.b(obj2);
                    it = ((Iterable) obj2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = it.next();
                            rcd0 rcd0Var4 = (rcd0) obj;
                            if (!rcd0Var4.f && rcd0Var4.b.contains(bVar2.s)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    rcd0Var = (rcd0) obj;
                    if (rcd0Var == null) {
                        i4 = i3;
                        i5 = i2;
                        bVar3 = bVar2;
                        ref$ObjectRef4 = ref$ObjectRef3;
                        r0 r0Var22 = bVar3.r;
                        PlusPayCompositeOffers.Offer offer2 = bVar3.a;
                        rod0 rod0Var2 = rod0.a;
                        r0Var22.getClass();
                        r0Var22.m(null, rod0Var2);
                        String a42 = ((pq80) bVar3.i).a(bVar3.c, offer2);
                        gzu0 gzu0Var2 = bVar3.f;
                        String sessionId2 = offer2.getMeta().getSessionId();
                        String offersBatchId2 = offer2.getMeta().getOffersBatchId();
                        String positionId2 = offer2.getPositionId();
                        Map map2 = bVar3.d;
                        tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef4;
                        tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar3;
                        tarifficatorGooglePaymentSession$startPayment$12.L$4 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$5 = rcd0Var;
                        tarifficatorGooglePaymentSession$startPayment$12.I$0 = i5;
                        tarifficatorGooglePaymentSession$startPayment$12.I$1 = i4;
                        tarifficatorGooglePaymentSession$startPayment$12.label = 3;
                        rcd0 rcd0Var32 = rcd0Var;
                        i7 = i5;
                        a2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.a) gzu0Var2.a).a(rcd0Var32, a42, sessionId2, offersBatchId2, positionId2, map2, tarifficatorGooglePaymentSession$startPayment$12);
                        if (a2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef3;
                    tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                    tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                    tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar2;
                    tarifficatorGooglePaymentSession$startPayment$12.I$0 = i2;
                    tarifficatorGooglePaymentSession$startPayment$12.I$1 = i3;
                    tarifficatorGooglePaymentSession$startPayment$12.label = 2;
                    obj2 = bVar2.c(tarifficatorGooglePaymentSession$startPayment$12);
                    if (obj2 != coroutineSingletons) {
                        i6 = i2;
                        bVar4 = bVar2;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        rcd0Var = (rcd0) obj2;
                        i4 = i3;
                        i5 = i6;
                        bVar3 = bVar4;
                        ref$ObjectRef4 = ref$ObjectRef5;
                        r0 r0Var222 = bVar3.r;
                        PlusPayCompositeOffers.Offer offer22 = bVar3.a;
                        rod0 rod0Var22 = rod0.a;
                        r0Var222.getClass();
                        r0Var222.m(null, rod0Var22);
                        String a422 = ((pq80) bVar3.i).a(bVar3.c, offer22);
                        gzu0 gzu0Var22 = bVar3.f;
                        String sessionId22 = offer22.getMeta().getSessionId();
                        String offersBatchId22 = offer22.getMeta().getOffersBatchId();
                        String positionId22 = offer22.getPositionId();
                        Map map22 = bVar3.d;
                        tarifficatorGooglePaymentSession$startPayment$12.L$0 = ref$ObjectRef4;
                        tarifficatorGooglePaymentSession$startPayment$12.L$1 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$2 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$3 = bVar3;
                        tarifficatorGooglePaymentSession$startPayment$12.L$4 = null;
                        tarifficatorGooglePaymentSession$startPayment$12.L$5 = rcd0Var;
                        tarifficatorGooglePaymentSession$startPayment$12.I$0 = i5;
                        tarifficatorGooglePaymentSession$startPayment$12.I$1 = i4;
                        tarifficatorGooglePaymentSession$startPayment$12.label = 3;
                        rcd0 rcd0Var322 = rcd0Var;
                        i7 = i5;
                        a2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.a) gzu0Var22.a).a(rcd0Var322, a422, sessionId22, offersBatchId22, positionId22, map22, tarifficatorGooglePaymentSession$startPayment$12);
                        if (a2 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            it = ((Iterable) obj2).iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            rcd0Var = (rcd0) obj;
            if (rcd0Var == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        tarifficatorGooglePaymentSession$startPayment$1 = new TarifficatorGooglePaymentSession$startPayment$1(bVar, continuationImpl);
        TarifficatorGooglePaymentSession$startPayment$1 tarifficatorGooglePaymentSession$startPayment$122 = tarifficatorGooglePaymentSession$startPayment$1;
        Object obj22 = tarifficatorGooglePaymentSession$startPayment$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tarifficatorGooglePaymentSession$startPayment$122.label;
        zy11 zy11Var2 = zy11.a;
        ?? r52 = 3;
        r52 = 3;
    }

    @Override // defpackage.lod0
    public final tpr a() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TarifficatorGooglePaymentSession$performPurchase$1 tarifficatorGooglePaymentSession$performPurchase$1;
        int i;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams;
        ucd0 ucd0Var;
        PlusPayInAppReplacementParams$Strategy plusPayInAppReplacementParams$Strategy;
        if (continuationImpl instanceof TarifficatorGooglePaymentSession$performPurchase$1) {
            tarifficatorGooglePaymentSession$performPurchase$1 = (TarifficatorGooglePaymentSession$performPurchase$1) continuationImpl;
            int i2 = tarifficatorGooglePaymentSession$performPurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tarifficatorGooglePaymentSession$performPurchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tarifficatorGooglePaymentSession$performPurchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tarifficatorGooglePaymentSession$performPurchase$1.label;
                ocd0 ocd0Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List singletonList = Collections.singletonList(this.s);
                    PlusPayInAppProductType plusPayInAppProductType = PlusPayInAppProductType.SUBSCRIPTION;
                    tarifficatorGooglePaymentSession$performPurchase$1.label = 1;
                    obj = ocd0Var.a(singletonList, plusPayInAppProductType, tarifficatorGooglePaymentSession$performPurchase$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                bwt bwtVar = (bwt) kotlin.collections.a.P((List) obj);
                plusPayInAppReplacementParams = this.b;
                if (plusPayInAppReplacementParams == null) {
                    int i3 = xqx0.a[plusPayInAppReplacementParams.getStrategy().ordinal()];
                    if (i3 == 1) {
                        plusPayInAppReplacementParams$Strategy = PlusPayInAppReplacementParams$Strategy.CHARGE_FULL_PRICE;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        plusPayInAppReplacementParams$Strategy = PlusPayInAppReplacementParams$Strategy.DEFERRED;
                    }
                    ucd0Var = new ucd0(plusPayInAppReplacementParams.getPurchaseToken(), plusPayInAppReplacementParams$Strategy);
                } else {
                    ucd0Var = null;
                }
                tarifficatorGooglePaymentSession$performPurchase$1.L$0 = null;
                tarifficatorGooglePaymentSession$performPurchase$1.L$1 = null;
                tarifficatorGooglePaymentSession$performPurchase$1.label = 2;
                Object d = ocd0Var.d(bwtVar, ucd0Var, tarifficatorGooglePaymentSession$performPurchase$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        tarifficatorGooglePaymentSession$performPurchase$1 = new TarifficatorGooglePaymentSession$performPurchase$1(this, continuationImpl);
        Object obj2 = tarifficatorGooglePaymentSession$performPurchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tarifficatorGooglePaymentSession$performPurchase$1.label;
        ocd0 ocd0Var2 = this.e;
        if (i != 0) {
        }
        bwt bwtVar2 = (bwt) kotlin.collections.a.P((List) obj2);
        plusPayInAppReplacementParams = this.b;
        if (plusPayInAppReplacementParams == null) {
        }
        tarifficatorGooglePaymentSession$performPurchase$1.L$0 = null;
        tarifficatorGooglePaymentSession$performPurchase$1.L$1 = null;
        tarifficatorGooglePaymentSession$performPurchase$1.label = 2;
        Object d2 = ocd0Var2.d(bwtVar2, ucd0Var, tarifficatorGooglePaymentSession$performPurchase$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    public final void d(String str, String str2) {
        ((zio) this.j).e(this.a, str2, this.p, str);
    }

    public final void e(String str) {
        String str2 = this.p;
        qqx0 qqx0Var = this.j;
        PlusPayCompositeOffers.Offer offer = this.a;
        ((zio) qqx0Var).f(offer, str, str2);
        ((zio) qqx0Var).c(this.c, offer);
    }

    public final void f(String str) {
        zio zioVar = (zio) this.j;
        zioVar.getClass();
        PlusPayCompositeOffers.Offer offer = this.a;
        String b = zio.b(offer);
        if (b != null) {
            zs90 zs90Var = zioVar.b;
            ArrayList a = zio.a(offer);
            zs90Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", this.p);
            linkedHashMap.put("product_id", b);
            xvz.A(linkedHashMap, "options_id", a, true, "is_tarifficator");
            linkedHashMap.put("order_id", str);
            linkedHashMap.put("_meta", zs90.a(new HashMap()));
            zs90Var.b("Pay.SendReceipt", linkedHashMap);
        }
    }
}
