package com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.ny61;
import defpackage.ond0;
import defpackage.pgz;
import defpackage.v7d0;
import defpackage.wgd0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements ond0 {
    public final v7d0 a;
    public final pgz b;

    public a(v7d0 v7d0Var, pgz pgzVar) {
        this.a = v7d0Var;
        this.b = pgzVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(2:15|(1:17))|18|(1:23)(2:20|21)))|38|6|7|(0)(0)|12|13|(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r0 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0038, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        r0 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        PlusTarifficatorGetUpsaleInteractorImpl$getUpsale$1 plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof PlusTarifficatorGetUpsaleInteractorImpl$getUpsale$1) {
            plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1 = (PlusTarifficatorGetUpsaleInteractorImpl$getUpsale$1) continuationImpl;
            int i2 = plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.label = i2 - Integer.MIN_VALUE;
                obj = plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.label;
                if (i != 0) {
                    b.b(obj);
                    wgd0 wgd0Var = (wgd0) ((com.yandex.plus.pay.internal.b) this.a).c.getValue();
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.L$0 = offer;
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.L$1 = null;
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.L$2 = null;
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.L$3 = null;
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.I$0 = 0;
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.I$1 = 0;
                    plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.upsale.b) wgd0Var).a(offer, plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    offer = (PlusPayCompositeOffers.Offer) plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.L$0;
                    b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    LogPriority logPriority = LogPriority.ERROR;
                    pgz pgzVar = this.b;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.b(logPriority, "PlusTarifficatorGetUpsaleInteractor", "Could not get upsale for offer: " + offer, a);
                    }
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                return null;
            }
        }
        plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1 = new PlusTarifficatorGetUpsaleInteractorImpl$getUpsale$1(this, continuationImpl);
        obj = plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorGetUpsaleInteractorImpl$getUpsale$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        if (obj instanceof Result.Failure) {
        }
    }
}
