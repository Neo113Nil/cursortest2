package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.add0;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final add0 a;
    public final pgz b;

    public a(add0 add0Var, pgz pgzVar) {
        this.a = add0Var;
        this.b = pgzVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|(1:17))|18))|33|6|7|(0)(0)|12|13|(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, ContinuationImpl continuationImpl) {
        MailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1 mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof MailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1) {
            mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1 = (MailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1) continuationImpl;
            int i2 = mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.plus.pay.internal.feature.mailing.b bVar = (com.yandex.plus.pay.internal.feature.mailing.b) ((com.yandex.plus.pay.internal.b) this.a).m.getValue();
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.L$0 = null;
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.L$1 = null;
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.L$2 = null;
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.L$3 = null;
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.I$0 = 0;
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.I$1 = 0;
                    mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.label = 1;
                    if (bVar.a(plusPayMailingAdsAgreement, mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Object failure = zy11Var;
                a = Result.a(failure);
                if (a != null) {
                    LogPriority logPriority = LogPriority.ERROR;
                    pgz pgzVar = this.b;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.b(logPriority, "MailingAdsAgreementRepositoryImpl", "Failed to update mailing ads agreement status", a);
                    }
                }
                return zy11Var;
            }
        }
        mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1 = new MailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1(this, continuationImpl);
        Object obj2 = mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mailingAdsAgreementRepositoryImpl$changeMailingAdsAgreementStatus$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Object failure2 = zy11Var2;
        a = Result.a(failure2);
        if (a != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(2:15|(1:17))|18|(1:23)(2:20|21)))|38|6|7|(0)(0)|12|13|(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1 mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof MailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1) {
            mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1 = (MailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1) continuationImpl;
            int i2 = mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.label = i2 - Integer.MIN_VALUE;
                obj = mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.plus.pay.internal.feature.mailing.b bVar = (com.yandex.plus.pay.internal.feature.mailing.b) ((com.yandex.plus.pay.internal.b) this.a).m.getValue();
                    mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.L$0 = null;
                    mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.L$1 = null;
                    mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.L$2 = null;
                    mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.I$0 = 0;
                    mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.I$1 = 0;
                    mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.label = 1;
                    obj = bVar.b(mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1);
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
                    LogPriority logPriority = LogPriority.ERROR;
                    pgz pgzVar = this.b;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.b(logPriority, "MailingAdsAgreementRepositoryImpl", "Mailing ads agreement loading failed", a);
                    }
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                return null;
            }
        }
        mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1 = new MailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1(this, continuationImpl);
        obj = mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mailingAdsAgreementRepositoryImpl$getMailingAdsAgreement$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        if (obj instanceof Result.Failure) {
        }
    }
}
