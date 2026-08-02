package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.add0;
import defpackage.fpd0;
import defpackage.ind0;
import defpackage.j5t;
import defpackage.ny61;
import defpackage.pgz;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d implements j5t {
    public final add0 a;
    public final pgz b;

    public d(add0 add0Var, pgz pgzVar) {
        this.a = add0Var;
        this.b = pgzVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)|15|(2:17|18)(2:20|(2:22|23)(1:24))))|38|6|7|(0)(0)|12|(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ind0 ind0Var, PlusPayCounterOffersReason plusPayCounterOffersReason, ContinuationImpl continuationImpl) {
        GetCounterOffersInteractorImpl$getCounterOffers$1 getCounterOffersInteractorImpl$getCounterOffers$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof GetCounterOffersInteractorImpl$getCounterOffers$1) {
            getCounterOffersInteractorImpl$getCounterOffers$1 = (GetCounterOffersInteractorImpl$getCounterOffers$1) continuationImpl;
            int i2 = getCounterOffersInteractorImpl$getCounterOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCounterOffersInteractorImpl$getCounterOffers$1.label = i2 - Integer.MIN_VALUE;
                obj = getCounterOffersInteractorImpl$getCounterOffers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCounterOffersInteractorImpl$getCounterOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusTarifficatorPurchase b = ind0Var.b();
                    fpd0 e = ((com.yandex.plus.pay.internal.b) this.a).e();
                    PlusPayCompositeOffers.Offer offer = b.getOffer();
                    getCounterOffersInteractorImpl$getCounterOffers$1.L$0 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$1.L$1 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$1.L$2 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$1.L$3 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$1.L$4 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$1.L$5 = null;
                    getCounterOffersInteractorImpl$getCounterOffers$1.I$0 = 0;
                    getCounterOffersInteractorImpl$getCounterOffers$1.I$1 = 0;
                    getCounterOffersInteractorImpl$getCounterOffers$1.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.a) e).c(offer, plusPayCounterOffersReason, getCounterOffersInteractorImpl$getCounterOffers$1);
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
                if (((PlusPayCounterOffers) obj).getOffers().isEmpty()) {
                    obj = null;
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
                pgzVar.b(logPriority, "GetCounterOffersInteractorImpl", "Failed to get counter offers", a);
                return null;
            }
        }
        getCounterOffersInteractorImpl$getCounterOffers$1 = new GetCounterOffersInteractorImpl$getCounterOffers$1(this, continuationImpl);
        obj = getCounterOffersInteractorImpl$getCounterOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCounterOffersInteractorImpl$getCounterOffers$1.label;
        if (i != 0) {
        }
        if (((PlusPayCounterOffers) obj).getOffers().isEmpty()) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
    }
}
