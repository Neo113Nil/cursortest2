package com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.add0;
import defpackage.fpd0;
import defpackage.ind0;
import defpackage.knd0;
import defpackage.ny61;
import defpackage.p2d0;
import defpackage.px21;
import defpackage.t6d0;
import defpackage.tpd;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a implements p2d0 {
    public final knd0 a;
    public final add0 b;
    public final List c;

    public a(knd0 knd0Var, add0 add0Var, List list) {
        this.a = knd0Var;
        this.b = add0Var;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf A[Catch: all -> 0x004c, TimeoutCancellationException -> 0x004f, CancellationException -> 0x00dc, LOOP:0: B:14:0x00b9->B:16:0x00bf, LOOP_END, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x00dc, blocks: (B:12:0x0048, B:13:0x00af, B:14:0x00b9, B:16:0x00bf, B:37:0x0061, B:39:0x007b, B:41:0x007f, B:42:0x0081), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails] */
    /* JADX WARN: Type inference failed for: r3v5, types: [t6d0] */
    @Override // defpackage.p2d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayOfferDetailsConfiguration.AdditionalOffers additionalOffers, ContinuationImpl continuationImpl) {
        PlusGetCheckoutOfferDetailsInteractor$getOfferDetails$1 plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1;
        int i;
        ind0 ind0Var;
        PlusTarifficatorPurchase plusTarifficatorPurchase;
        Object failure;
        Throwable a;
        Iterator it;
        a aVar = this;
        try {
            if (continuationImpl instanceof PlusGetCheckoutOfferDetailsInteractor$getOfferDetails$1) {
                plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1 = (PlusGetCheckoutOfferDetailsInteractor$getOfferDetails$1) continuationImpl;
                int i2 = plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.label;
                    knd0 knd0Var = aVar.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ind0 a2 = knd0Var.a();
                        PlusTarifficatorPurchase plusTarifficatorPurchase2 = a2.b;
                        try {
                            fpd0 e = ((com.yandex.plus.pay.internal.b) aVar.b).e();
                            PlusPayOfferDetailsConfiguration.Companion.getClass();
                            PlusPayOfferDetailsConfiguration.a aVar2 = new PlusPayOfferDetailsConfiguration.a();
                            if (tpd.b(offer) == PlusPayCompositeOffers.Offer.Vendor.NATIVE) {
                                aVar2.b = true;
                            }
                            if (additionalOffers != null) {
                                aVar2.c = additionalOffers;
                            }
                            PlusPayOfferDetailsConfiguration plusPayOfferDetailsConfiguration = new PlusPayOfferDetailsConfiguration(aVar2.a, aVar2.b, aVar2.c);
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$0 = null;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$1 = null;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$2 = a2;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$3 = plusTarifficatorPurchase2;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$4 = null;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$5 = null;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$6 = aVar;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.I$0 = 0;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.I$1 = 0;
                            plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.label = 1;
                            Object b = ((com.yandex.plus.pay.internal.feature.payment.a) e).b(offer, plusPayOfferDetailsConfiguration, plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ind0Var = a2;
                            obj = b;
                            plusTarifficatorPurchase = plusTarifficatorPurchase2;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            ind0Var = a2;
                            plusTarifficatorPurchase = plusTarifficatorPurchase2;
                            failure = new Result.Failure(e);
                            PlusTarifficatorPurchase plusTarifficatorPurchase3 = plusTarifficatorPurchase;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            ind0Var = a2;
                            plusTarifficatorPurchase = plusTarifficatorPurchase2;
                            failure = new Result.Failure(th);
                            PlusTarifficatorPurchase plusTarifficatorPurchase32 = plusTarifficatorPurchase;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = (a) plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$6;
                        plusTarifficatorPurchase = (PlusTarifficatorPurchase) plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$3;
                        ind0Var = (ind0) plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.L$2;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            failure = new Result.Failure(e);
                            PlusTarifficatorPurchase plusTarifficatorPurchase322 = plusTarifficatorPurchase;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            PlusTarifficatorPurchase plusTarifficatorPurchase3222 = plusTarifficatorPurchase;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        }
                    }
                    it = aVar.c.iterator();
                    failure = (PlusPayCompositeOfferDetails) obj;
                    while (it.hasNext()) {
                        failure = ((t6d0) it.next()).a(failure);
                    }
                    PlusTarifficatorPurchase plusTarifficatorPurchase32222 = plusTarifficatorPurchase;
                    a = Result.a(failure);
                    if (a != null) {
                        knd0Var.a = ind0.a(ind0Var, PlusTarifficatorPurchase.copy$default(plusTarifficatorPurchase32222, null, null, null, new PlusTarifficatorPurchase.Status.Error(px21.a(a)), null, null, null, 119, null), null, 29);
                    }
                    if (failure instanceof Result.Failure) {
                        return failure;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            it = aVar.c.iterator();
            failure = (PlusPayCompositeOfferDetails) obj;
            while (it.hasNext()) {
            }
            PlusTarifficatorPurchase plusTarifficatorPurchase322222 = plusTarifficatorPurchase;
            a = Result.a(failure);
            if (a != null) {
            }
            if (failure instanceof Result.Failure) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1 = new PlusGetCheckoutOfferDetailsInteractor$getOfferDetails$1(aVar, continuationImpl);
        Object obj2 = plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusGetCheckoutOfferDetailsInteractor$getOfferDetails$1.label;
        knd0 knd0Var2 = aVar.a;
    }
}
