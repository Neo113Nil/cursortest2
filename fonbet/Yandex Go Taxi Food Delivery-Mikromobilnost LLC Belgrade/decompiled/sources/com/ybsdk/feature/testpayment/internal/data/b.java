package com.ybsdk.feature.testpayment.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.testpayment.internal.network.AutoTopupApi;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoTopupTestPaymentRequest;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoTopupTestPaymentStatusRequest;
import defpackage.iyd0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final AutoTopupApi a;

    public b(AutoTopupApi autoTopupApi) {
        this.a = autoTopupApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        AutoTopupTestPaymentRepository$getTestPaymentStatus$1 autoTopupTestPaymentRepository$getTestPaymentStatus$1;
        int i2;
        Object c;
        Throwable a;
        Object obj;
        iyd0 iyd0Var;
        if (continuationImpl instanceof AutoTopupTestPaymentRepository$getTestPaymentStatus$1) {
            autoTopupTestPaymentRepository$getTestPaymentStatus$1 = (AutoTopupTestPaymentRepository$getTestPaymentStatus$1) continuationImpl;
            int i3 = autoTopupTestPaymentRepository$getTestPaymentStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                autoTopupTestPaymentRepository$getTestPaymentStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = autoTopupTestPaymentRepository$getTestPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = autoTopupTestPaymentRepository$getTestPaymentStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    AutoTopupTestPaymentRepository$getTestPaymentStatus$2 autoTopupTestPaymentRepository$getTestPaymentStatus$2 = new AutoTopupTestPaymentRepository$getTestPaymentStatus$2(this, new AutoTopupTestPaymentStatusRequest(str), i, null);
                    autoTopupTestPaymentRepository$getTestPaymentStatus$1.label = 1;
                    c = c.c(autoTopupTestPaymentRepository$getTestPaymentStatus$2, autoTopupTestPaymentRepository$getTestPaymentStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) autoTopupTestPaymentRepository$getTestPaymentStatus$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        return obj instanceof Result.Failure ? new iyd0(iyd0Var.b, obj) : obj;
                    }
                    kotlin.b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                AutoTopupTestPaymentRepository$getTestPaymentStatus$3$1$1 autoTopupTestPaymentRepository$getTestPaymentStatus$3$1$1 = new AutoTopupTestPaymentRepository$getTestPaymentStatus$3$1$1(this, null);
                autoTopupTestPaymentRepository$getTestPaymentStatus$1.L$0 = iyd0Var2;
                autoTopupTestPaymentRepository$getTestPaymentStatus$1.label = 2;
                Object b = com.ybsdk.core.utils.dto.b.b(dataWithStatusResponse, autoTopupTestPaymentRepository$getTestPaymentStatus$3$1$1, autoTopupTestPaymentRepository$getTestPaymentStatus$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    iyd0Var = iyd0Var2;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        autoTopupTestPaymentRepository$getTestPaymentStatus$1 = new AutoTopupTestPaymentRepository$getTestPaymentStatus$1(this, continuationImpl);
        Object obj22 = autoTopupTestPaymentRepository$getTestPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = autoTopupTestPaymentRepository$getTestPaymentStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        AutoTopupTestPaymentRepository$initiateTestPayment$1 autoTopupTestPaymentRepository$initiateTestPayment$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupTestPaymentRepository$initiateTestPayment$1) {
            autoTopupTestPaymentRepository$initiateTestPayment$1 = (AutoTopupTestPaymentRepository$initiateTestPayment$1) continuationImpl;
            int i2 = autoTopupTestPaymentRepository$initiateTestPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupTestPaymentRepository$initiateTestPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupTestPaymentRepository$initiateTestPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupTestPaymentRepository$initiateTestPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupTestPaymentRepository$initiateTestPayment$2 autoTopupTestPaymentRepository$initiateTestPayment$2 = new AutoTopupTestPaymentRepository$initiateTestPayment$2(this, str, new AutoTopupTestPaymentRequest(str2), null);
                    autoTopupTestPaymentRepository$initiateTestPayment$1.label = 1;
                    c = c.c(autoTopupTestPaymentRepository$initiateTestPayment$2, autoTopupTestPaymentRepository$initiateTestPayment$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                AutoTopupTestPaymentRepository$initiateTestPayment$3$1 autoTopupTestPaymentRepository$initiateTestPayment$3$1 = new AutoTopupTestPaymentRepository$initiateTestPayment$3$1(2, null);
                autoTopupTestPaymentRepository$initiateTestPayment$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, autoTopupTestPaymentRepository$initiateTestPayment$3$1, autoTopupTestPaymentRepository$initiateTestPayment$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        autoTopupTestPaymentRepository$initiateTestPayment$1 = new AutoTopupTestPaymentRepository$initiateTestPayment$1(this, continuationImpl);
        Object obj2 = autoTopupTestPaymentRepository$initiateTestPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupTestPaymentRepository$initiateTestPayment$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
