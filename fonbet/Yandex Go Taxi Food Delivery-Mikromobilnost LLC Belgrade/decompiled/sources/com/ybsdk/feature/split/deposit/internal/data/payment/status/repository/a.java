package com.ybsdk.feature.split.deposit.internal.data.payment.status.repository;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.split.deposit.internal.data.network.SplitDepositApi;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.StatusScreenData;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusRequest;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusResponse;
import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import defpackage.a9u0;
import defpackage.dka0;
import defpackage.egb1;
import defpackage.eka0;
import defpackage.iyd0;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.vx90;
import defpackage.w511;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final SplitDepositApi a;

    public a(SplitDepositApi splitDepositApi) {
        this.a = splitDepositApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, TransactionStatusResponse transactionStatusResponse, ContinuationImpl continuationImpl) {
        SplitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1 splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1;
        int i;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        TransactionStatusResponse transactionStatusResponse2;
        rr51 rr51Var;
        DivDataDto bottomDivKitData;
        com.ybsdk.feature.divkit.api.domain.a aVar3;
        Object obj;
        StatusScreenData failedData;
        rr51 rr51Var2;
        DivDataDto bottomDivKitData2;
        Object b;
        TransactionStatusResponse transactionStatusResponse3;
        int i2;
        PaymentStatus paymentStatus;
        String url;
        aVar.getClass();
        if (continuationImpl instanceof SplitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1) {
            splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1 = (SplitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1) continuationImpl;
            int i3 = splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.label;
                if (i != 0) {
                    b.b(obj2);
                    aVar2 = new com.ybsdk.feature.divkit.api.domain.a(null);
                    StatusScreenData finishedData = transactionStatusResponse.getFinishedData();
                    if (finishedData != null && (bottomDivKitData = finishedData.getBottomDivKitData()) != null) {
                        splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$0 = transactionStatusResponse;
                        splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$1 = aVar2;
                        splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.label = 1;
                        Object b2 = aVar2.b(bottomDivKitData, splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1);
                        if (b2 != coroutineSingletons) {
                            aVar3 = aVar2;
                            obj = b2;
                        }
                        return coroutineSingletons;
                    }
                    transactionStatusResponse2 = transactionStatusResponse;
                    rr51Var = null;
                    failedData = transactionStatusResponse2.getFailedData();
                    if (failedData != null || (bottomDivKitData2 = failedData.getBottomDivKitData()) == null) {
                        rr51Var2 = null;
                        i2 = eka0.a[transactionStatusResponse2.getStatus().ordinal()];
                        if (i2 == 1) {
                        }
                        TransactionStatusResponse.SplitDepositPaymentChallengeData challengeData = transactionStatusResponse2.getChallengeData();
                        if (challengeData != null) {
                        }
                        StatusScreenData finishedData2 = transactionStatusResponse2.getFinishedData();
                        if (finishedData2 != null) {
                        }
                        StatusScreenData failedData2 = transactionStatusResponse2.getFailedData();
                        return new dka0(paymentStatus, r2, r8, failedData2 != null ? egb1.e(failedData2, rr51Var2) : null);
                    }
                    splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$0 = transactionStatusResponse2;
                    splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$1 = rr51Var;
                    splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.label = 2;
                    b = aVar2.b(bottomDivKitData2, splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1);
                    if (b != coroutineSingletons) {
                        transactionStatusResponse3 = transactionStatusResponse2;
                        if (b instanceof Result.Failure) {
                        }
                        rr51Var2 = (rr51) b;
                        transactionStatusResponse2 = transactionStatusResponse3;
                        i2 = eka0.a[transactionStatusResponse2.getStatus().ordinal()];
                        if (i2 == 1) {
                        }
                        TransactionStatusResponse.SplitDepositPaymentChallengeData challengeData2 = transactionStatusResponse2.getChallengeData();
                        if (challengeData2 != null) {
                        }
                        StatusScreenData finishedData22 = transactionStatusResponse2.getFinishedData();
                        if (finishedData22 != null) {
                        }
                        StatusScreenData failedData22 = transactionStatusResponse2.getFailedData();
                        return new dka0(paymentStatus, r2, r8, failedData22 != null ? egb1.e(failedData22, rr51Var2) : null);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rr51Var = (rr51) splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$1;
                    transactionStatusResponse3 = (TransactionStatusResponse) splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$0;
                    b.b(obj2);
                    b = ((Result) obj2).getValue();
                    if (b instanceof Result.Failure) {
                        b = null;
                    }
                    rr51Var2 = (rr51) b;
                    transactionStatusResponse2 = transactionStatusResponse3;
                    i2 = eka0.a[transactionStatusResponse2.getStatus().ordinal()];
                    if (i2 == 1) {
                        paymentStatus = PaymentStatus.PENDING;
                    } else if (i2 == 2) {
                        paymentStatus = PaymentStatus.CHALLENGE;
                    } else if (i2 == 3) {
                        paymentStatus = PaymentStatus.FINISHED;
                    } else {
                        if (i2 != 4) {
                            w511.b();
                            return null;
                        }
                        paymentStatus = PaymentStatus.FAILED;
                    }
                    TransactionStatusResponse.SplitDepositPaymentChallengeData challengeData22 = transactionStatusResponse2.getChallengeData();
                    vx90 vx90Var = (challengeData22 != null || (url = challengeData22.getUrl()) == null) ? null : new vx90(url);
                    StatusScreenData finishedData222 = transactionStatusResponse2.getFinishedData();
                    a9u0 e = finishedData222 != null ? egb1.e(finishedData222, rr51Var) : null;
                    StatusScreenData failedData222 = transactionStatusResponse2.getFailedData();
                    return new dka0(paymentStatus, vx90Var, e, failedData222 != null ? egb1.e(failedData222, rr51Var2) : null);
                }
                com.ybsdk.feature.divkit.api.domain.a aVar4 = (com.ybsdk.feature.divkit.api.domain.a) splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$1;
                TransactionStatusResponse transactionStatusResponse4 = (TransactionStatusResponse) splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.L$0;
                b.b(obj2);
                obj = ((Result) obj2).getValue();
                aVar3 = aVar4;
                transactionStatusResponse = transactionStatusResponse4;
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                TransactionStatusResponse transactionStatusResponse5 = transactionStatusResponse;
                rr51Var = (rr51) obj;
                aVar2 = aVar3;
                transactionStatusResponse2 = transactionStatusResponse5;
                failedData = transactionStatusResponse2.getFailedData();
                if (failedData != null) {
                }
                rr51Var2 = null;
                i2 = eka0.a[transactionStatusResponse2.getStatus().ordinal()];
                if (i2 == 1) {
                }
                TransactionStatusResponse.SplitDepositPaymentChallengeData challengeData222 = transactionStatusResponse2.getChallengeData();
                if (challengeData222 != null) {
                }
                StatusScreenData finishedData2222 = transactionStatusResponse2.getFinishedData();
                if (finishedData2222 != null) {
                }
                StatusScreenData failedData2222 = transactionStatusResponse2.getFailedData();
                return new dka0(paymentStatus, vx90Var, e, failedData2222 != null ? egb1.e(failedData2222, rr51Var2) : null);
            }
        }
        splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1 = new SplitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1(aVar, continuationImpl);
        Object obj22 = splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splitDepositPaymentStatusRepository$getPaymentStatusDataEntity$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        TransactionStatusResponse transactionStatusResponse52 = transactionStatusResponse;
        rr51Var = (rr51) obj;
        aVar2 = aVar3;
        transactionStatusResponse2 = transactionStatusResponse52;
        failedData = transactionStatusResponse2.getFailedData();
        if (failedData != null) {
        }
        rr51Var2 = null;
        i2 = eka0.a[transactionStatusResponse2.getStatus().ordinal()];
        if (i2 == 1) {
        }
        TransactionStatusResponse.SplitDepositPaymentChallengeData challengeData2222 = transactionStatusResponse2.getChallengeData();
        if (challengeData2222 != null) {
        }
        StatusScreenData finishedData22222 = transactionStatusResponse2.getFinishedData();
        if (finishedData22222 != null) {
        }
        StatusScreenData failedData22222 = transactionStatusResponse2.getFailedData();
        return new dka0(paymentStatus, vx90Var, e, failedData22222 != null ? egb1.e(failedData22222, rr51Var2) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransactionStatusRequest transactionStatusRequest, int i, ContinuationImpl continuationImpl) {
        SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1 splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1;
        int i2;
        Object c;
        Throwable a;
        Object obj;
        iyd0 iyd0Var;
        if (continuationImpl instanceof SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1) {
            splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1 = (SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1) continuationImpl;
            int i3 = splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.label;
                if (i2 != 0) {
                    b.b(obj2);
                    SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$2 splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$2 = new SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$2(this, transactionStatusRequest, i, null);
                    splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.label = 1;
                    c = c.c(splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$2, splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.L$0;
                        b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        return obj instanceof Result.Failure ? new iyd0(iyd0Var.b, obj) : obj;
                    }
                    b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1 splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1 = new SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1(this, null);
                splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.L$0 = iyd0Var2;
                splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1, splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1);
                if (a2 != coroutineSingletons) {
                    obj = a2;
                    iyd0Var = iyd0Var2;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1 = new SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1(this, continuationImpl);
        Object obj22 = splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
