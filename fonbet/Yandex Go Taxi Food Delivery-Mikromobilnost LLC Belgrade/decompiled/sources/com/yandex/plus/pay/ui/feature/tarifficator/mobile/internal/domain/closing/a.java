package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.add0;
import defpackage.b5t;
import defpackage.fpd0;
import defpackage.ind0;
import defpackage.ny61;
import defpackage.pgz;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements b5t {
    public final add0 a;
    public final pgz b;

    public a(add0 add0Var, pgz pgzVar) {
        this.a = add0Var;
        this.b = pgzVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|13|(2:15|16)(2:18|(2:20|21)(1:22))))|36|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ind0 ind0Var, ContinuationImpl continuationImpl) {
        GetClosingOfferInteractorImpl$getClosingOffer$1 getClosingOfferInteractorImpl$getClosingOffer$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof GetClosingOfferInteractorImpl$getClosingOffer$1) {
            getClosingOfferInteractorImpl$getClosingOffer$1 = (GetClosingOfferInteractorImpl$getClosingOffer$1) continuationImpl;
            int i2 = getClosingOfferInteractorImpl$getClosingOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getClosingOfferInteractorImpl$getClosingOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getClosingOfferInteractorImpl$getClosingOffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClosingOfferInteractorImpl$getClosingOffer$1.label;
                if (i != 0) {
                    b.b(obj);
                    PlusTarifficatorPurchase b = ind0Var.b();
                    fpd0 e = ((com.yandex.plus.pay.internal.b) this.a).e();
                    PlusPayCompositeOffers.Offer offer = b.getOffer();
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$0 = null;
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$1 = null;
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$2 = null;
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$3 = null;
                    getClosingOfferInteractorImpl$getClosingOffer$1.L$4 = null;
                    getClosingOfferInteractorImpl$getClosingOffer$1.I$0 = 0;
                    getClosingOfferInteractorImpl$getClosingOffer$1.I$1 = 0;
                    getClosingOfferInteractorImpl$getClosingOffer$1.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.a) e).a(offer, getClosingOfferInteractorImpl$getClosingOffer$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    return obj;
                }
                LogPriority logPriority = LogPriority.ERROR;
                pgz pgzVar = this.b;
                if (!pgzVar.e(logPriority)) {
                    return null;
                }
                pgzVar.b(logPriority, "GetClosingOfferInteractorImpl", "Failed to get closing offer", a);
                return null;
            }
        }
        getClosingOfferInteractorImpl$getClosingOffer$1 = new GetClosingOfferInteractorImpl$getClosingOffer$1(this, continuationImpl);
        Object obj2 = getClosingOfferInteractorImpl$getClosingOffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClosingOfferInteractorImpl$getClosingOffer$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a != null) {
        }
    }
}
