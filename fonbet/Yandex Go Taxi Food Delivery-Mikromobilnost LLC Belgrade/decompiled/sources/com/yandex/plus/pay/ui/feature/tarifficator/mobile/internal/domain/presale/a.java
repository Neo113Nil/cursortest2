package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.add0;
import defpackage.fpd0;
import defpackage.ind0;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.wbt;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements wbt {
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
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ind0 ind0Var, ContinuationImpl continuationImpl) {
        GetPresaleInteractorImpl$getPresale$1 getPresaleInteractorImpl$getPresale$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof GetPresaleInteractorImpl$getPresale$1) {
            getPresaleInteractorImpl$getPresale$1 = (GetPresaleInteractorImpl$getPresale$1) continuationImpl;
            int i2 = getPresaleInteractorImpl$getPresale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPresaleInteractorImpl$getPresale$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getPresaleInteractorImpl$getPresale$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPresaleInteractorImpl$getPresale$1.label;
                if (i != 0) {
                    b.b(obj);
                    PlusPayCompositeOffers.Offer offer = ind0Var.b.getOffer();
                    fpd0 e = ((com.yandex.plus.pay.internal.b) this.a).e();
                    getPresaleInteractorImpl$getPresale$1.L$0 = null;
                    getPresaleInteractorImpl$getPresale$1.L$1 = null;
                    getPresaleInteractorImpl$getPresale$1.L$2 = null;
                    getPresaleInteractorImpl$getPresale$1.L$3 = null;
                    getPresaleInteractorImpl$getPresale$1.L$4 = null;
                    getPresaleInteractorImpl$getPresale$1.I$0 = 0;
                    getPresaleInteractorImpl$getPresale$1.I$1 = 0;
                    getPresaleInteractorImpl$getPresale$1.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.a) e).d(offer, getPresaleInteractorImpl$getPresale$1);
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
                pgzVar.b(logPriority, "GetPresaleInteractorImpl", "Failed to get presale", a);
                return null;
            }
        }
        getPresaleInteractorImpl$getPresale$1 = new GetPresaleInteractorImpl$getPresale$1(this, continuationImpl);
        Object obj2 = getPresaleInteractorImpl$getPresale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPresaleInteractorImpl$getPresale$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a != null) {
        }
    }
}
