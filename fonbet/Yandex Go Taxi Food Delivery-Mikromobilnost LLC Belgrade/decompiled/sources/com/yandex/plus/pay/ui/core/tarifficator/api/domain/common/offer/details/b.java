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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class b implements p2d0 {
    public final knd0 a;
    public final add0 b;
    public final List c;

    public b(knd0 knd0Var, add0 add0Var, List list) {
        this.a = knd0Var;
        this.b = add0Var;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[Catch: all -> 0x004a, TimeoutCancellationException -> 0x004d, CancellationException -> 0x00cb, LOOP:0: B:14:0x00aa->B:16:0x00b0, LOOP_END, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00cb, blocks: (B:12:0x0046, B:13:0x00a0, B:14:0x00aa, B:16:0x00b0, B:37:0x005f), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails] */
    /* JADX WARN: Type inference failed for: r2v7, types: [t6d0] */
    @Override // defpackage.p2d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayOfferDetailsConfiguration.AdditionalOffers additionalOffers, ContinuationImpl continuationImpl) {
        PlusGetSilentOfferDetailsInteractor$getOfferDetails$1 plusGetSilentOfferDetailsInteractor$getOfferDetails$1;
        int i;
        ind0 a;
        PlusTarifficatorPurchase plusTarifficatorPurchase;
        Object failure;
        Throwable a2;
        Iterator it;
        b bVar = this;
        try {
            if (continuationImpl instanceof PlusGetSilentOfferDetailsInteractor$getOfferDetails$1) {
                plusGetSilentOfferDetailsInteractor$getOfferDetails$1 = (PlusGetSilentOfferDetailsInteractor$getOfferDetails$1) continuationImpl;
                int i2 = plusGetSilentOfferDetailsInteractor$getOfferDetails$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusGetSilentOfferDetailsInteractor$getOfferDetails$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusGetSilentOfferDetailsInteractor$getOfferDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusGetSilentOfferDetailsInteractor$getOfferDetails$1.label;
                    knd0 knd0Var = bVar.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a = knd0Var.a();
                        PlusTarifficatorPurchase plusTarifficatorPurchase2 = a.b;
                        try {
                            fpd0 e = ((com.yandex.plus.pay.internal.b) bVar.b).e();
                            PlusPayOfferDetailsConfiguration.Companion.getClass();
                            PlusPayOfferDetailsConfiguration.a aVar = new PlusPayOfferDetailsConfiguration.a();
                            aVar.a = true;
                            PlusPayOfferDetailsConfiguration plusPayOfferDetailsConfiguration = new PlusPayOfferDetailsConfiguration(aVar.a, aVar.b, aVar.c);
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$0 = null;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$1 = null;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$2 = a;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$3 = plusTarifficatorPurchase2;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$4 = null;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$5 = null;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$6 = bVar;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.I$0 = 0;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.I$1 = 0;
                            plusGetSilentOfferDetailsInteractor$getOfferDetails$1.label = 1;
                            Object b = ((com.yandex.plus.pay.internal.feature.payment.a) e).b(offer, plusPayOfferDetailsConfiguration, plusGetSilentOfferDetailsInteractor$getOfferDetails$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            plusTarifficatorPurchase = plusTarifficatorPurchase2;
                            obj = b;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            plusTarifficatorPurchase = plusTarifficatorPurchase2;
                            failure = new Result.Failure(e);
                            PlusTarifficatorPurchase plusTarifficatorPurchase3 = plusTarifficatorPurchase;
                            a2 = Result.a(failure);
                            if (a2 != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            plusTarifficatorPurchase = plusTarifficatorPurchase2;
                            failure = new Result.Failure(th);
                            PlusTarifficatorPurchase plusTarifficatorPurchase32 = plusTarifficatorPurchase;
                            a2 = Result.a(failure);
                            if (a2 != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = (b) plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$6;
                        plusTarifficatorPurchase = (PlusTarifficatorPurchase) plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$3;
                        a = (ind0) plusGetSilentOfferDetailsInteractor$getOfferDetails$1.L$2;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            failure = new Result.Failure(e);
                            PlusTarifficatorPurchase plusTarifficatorPurchase322 = plusTarifficatorPurchase;
                            a2 = Result.a(failure);
                            if (a2 != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            PlusTarifficatorPurchase plusTarifficatorPurchase3222 = plusTarifficatorPurchase;
                            a2 = Result.a(failure);
                            if (a2 != null) {
                            }
                            if (failure instanceof Result.Failure) {
                            }
                        }
                    }
                    it = bVar.c.iterator();
                    failure = (PlusPayCompositeOfferDetails) obj;
                    while (it.hasNext()) {
                        failure = ((t6d0) it.next()).a(failure);
                    }
                    PlusTarifficatorPurchase plusTarifficatorPurchase32222 = plusTarifficatorPurchase;
                    a2 = Result.a(failure);
                    if (a2 != null) {
                        knd0Var.a = ind0.a(a, PlusTarifficatorPurchase.copy$default(plusTarifficatorPurchase32222, null, null, null, new PlusTarifficatorPurchase.Status.Error(px21.a(a2)), null, null, null, 119, null), null, 29);
                    }
                    if (failure instanceof Result.Failure) {
                        return failure;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            it = bVar.c.iterator();
            failure = (PlusPayCompositeOfferDetails) obj;
            while (it.hasNext()) {
            }
            PlusTarifficatorPurchase plusTarifficatorPurchase322222 = plusTarifficatorPurchase;
            a2 = Result.a(failure);
            if (a2 != null) {
            }
            if (failure instanceof Result.Failure) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        plusGetSilentOfferDetailsInteractor$getOfferDetails$1 = new PlusGetSilentOfferDetailsInteractor$getOfferDetails$1(bVar, continuationImpl);
        Object obj2 = plusGetSilentOfferDetailsInteractor$getOfferDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusGetSilentOfferDetailsInteractor$getOfferDetails$1.label;
        knd0 knd0Var2 = bVar.a;
    }
}
