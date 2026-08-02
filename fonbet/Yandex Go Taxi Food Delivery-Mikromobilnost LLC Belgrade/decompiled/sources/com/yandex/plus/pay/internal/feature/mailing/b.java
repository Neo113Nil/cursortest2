package com.yandex.plus.pay.internal.feature.mailing;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.v200;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final v200 a;
    public final mdd0 b;

    public b(v200 v200Var, ndd0 ndd0Var) {
        this.a = v200Var;
        this.b = ndd0Var;
    }

    public final Object a(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, Continuation continuation) {
        Object a = ((a) this.a).a(plusPayMailingAdsAgreement, (ContinuationImpl) continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(1:21)(2:18|19)))|36|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PlusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1 plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof PlusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1) {
            plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1 = (PlusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1) continuationImpl;
            int i2 = plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.label = i2 - Integer.MIN_VALUE;
                obj = plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v200 v200Var = this.a;
                    plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.L$0 = null;
                    plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.L$1 = null;
                    plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.L$2 = null;
                    plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.I$0 = 0;
                    plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.I$1 = 0;
                    plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.label = 1;
                    obj = ((a) v200Var).b(plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1);
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
                if (a != null) {
                    mdd0 mdd0Var = this.b;
                    mdd0Var.getClass();
                    ((ndd0) mdd0Var).b(LogPriority.VERBOSE, "PAY.TRACE", "error while fetching MailingAdsAgreement=" + a, null);
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                return null;
            }
        }
        plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1 = new PlusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1(this, continuationImpl);
        obj = plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayMailingAdsAgreementServiceImpl$getMailingAdsAgreement$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        if (obj instanceof Result.Failure) {
        }
    }
}
