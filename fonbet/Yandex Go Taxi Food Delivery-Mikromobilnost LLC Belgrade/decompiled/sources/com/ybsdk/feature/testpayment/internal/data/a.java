package com.ybsdk.feature.testpayment.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.testpayment.api.TestPaymentFlow;
import com.ybsdk.feature.testpayment.internal.network.AutoPaymentsApi;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoPaymentsTestPaymentFlow;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoPaymentsTestPaymentRequest;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoPaymentsTestPaymentStatusRequest;
import defpackage.iyd0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.yr3;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final AutoPaymentsApi a;

    public a(AutoPaymentsApi autoPaymentsApi) {
        this.a = autoPaymentsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, TestPaymentFlow testPaymentFlow, int i, ContinuationImpl continuationImpl) {
        AutoPaymentTestPaymentRepository$getTestPaymentStatus$1 autoPaymentTestPaymentRepository$getTestPaymentStatus$1;
        int i2;
        AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow;
        Object c;
        Throwable a;
        Object obj;
        iyd0 iyd0Var;
        if (continuationImpl instanceof AutoPaymentTestPaymentRepository$getTestPaymentStatus$1) {
            autoPaymentTestPaymentRepository$getTestPaymentStatus$1 = (AutoPaymentTestPaymentRepository$getTestPaymentStatus$1) continuationImpl;
            int i3 = autoPaymentTestPaymentRepository$getTestPaymentStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                autoPaymentTestPaymentRepository$getTestPaymentStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = autoPaymentTestPaymentRepository$getTestPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = autoPaymentTestPaymentRepository$getTestPaymentStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    int i4 = yr3.a[testPaymentFlow.ordinal()];
                    if (i4 == 1) {
                        autoPaymentsTestPaymentFlow = AutoPaymentsTestPaymentFlow.EXTERNAL;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        autoPaymentsTestPaymentFlow = AutoPaymentsTestPaymentFlow.AUTOTOPUP;
                    }
                    AutoPaymentTestPaymentRepository$getTestPaymentStatus$2 autoPaymentTestPaymentRepository$getTestPaymentStatus$2 = new AutoPaymentTestPaymentRepository$getTestPaymentStatus$2(this, new AutoPaymentsTestPaymentStatusRequest(str, autoPaymentsTestPaymentFlow), i, null);
                    autoPaymentTestPaymentRepository$getTestPaymentStatus$1.label = 1;
                    c = c.c(autoPaymentTestPaymentRepository$getTestPaymentStatus$2, autoPaymentTestPaymentRepository$getTestPaymentStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) autoPaymentTestPaymentRepository$getTestPaymentStatus$1.L$0;
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
                AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1 autoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1 = new AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1(this, null);
                autoPaymentTestPaymentRepository$getTestPaymentStatus$1.L$0 = iyd0Var2;
                autoPaymentTestPaymentRepository$getTestPaymentStatus$1.label = 2;
                Object b = com.ybsdk.core.utils.dto.b.b(dataWithStatusResponse, autoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1, autoPaymentTestPaymentRepository$getTestPaymentStatus$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    iyd0Var = iyd0Var2;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        autoPaymentTestPaymentRepository$getTestPaymentStatus$1 = new AutoPaymentTestPaymentRepository$getTestPaymentStatus$1(this, continuationImpl);
        Object obj22 = autoPaymentTestPaymentRepository$getTestPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = autoPaymentTestPaymentRepository$getTestPaymentStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, TestPaymentFlow testPaymentFlow, ContinuationImpl continuationImpl) {
        AutoPaymentTestPaymentRepository$initiateTestPayment$1 autoPaymentTestPaymentRepository$initiateTestPayment$1;
        int i;
        AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoPaymentTestPaymentRepository$initiateTestPayment$1) {
            autoPaymentTestPaymentRepository$initiateTestPayment$1 = (AutoPaymentTestPaymentRepository$initiateTestPayment$1) continuationImpl;
            int i2 = autoPaymentTestPaymentRepository$initiateTestPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoPaymentTestPaymentRepository$initiateTestPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoPaymentTestPaymentRepository$initiateTestPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoPaymentTestPaymentRepository$initiateTestPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = yr3.a[testPaymentFlow.ordinal()];
                    if (i3 == 1) {
                        autoPaymentsTestPaymentFlow = AutoPaymentsTestPaymentFlow.EXTERNAL;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        autoPaymentsTestPaymentFlow = AutoPaymentsTestPaymentFlow.AUTOTOPUP;
                    }
                    AutoPaymentTestPaymentRepository$initiateTestPayment$2 autoPaymentTestPaymentRepository$initiateTestPayment$2 = new AutoPaymentTestPaymentRepository$initiateTestPayment$2(this, str, new AutoPaymentsTestPaymentRequest(str2, str3, autoPaymentsTestPaymentFlow), null);
                    autoPaymentTestPaymentRepository$initiateTestPayment$1.label = 1;
                    c = c.c(autoPaymentTestPaymentRepository$initiateTestPayment$2, autoPaymentTestPaymentRepository$initiateTestPayment$1);
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
                AutoPaymentTestPaymentRepository$initiateTestPayment$3$1 autoPaymentTestPaymentRepository$initiateTestPayment$3$1 = new AutoPaymentTestPaymentRepository$initiateTestPayment$3$1(2, null);
                autoPaymentTestPaymentRepository$initiateTestPayment$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, autoPaymentTestPaymentRepository$initiateTestPayment$3$1, autoPaymentTestPaymentRepository$initiateTestPayment$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        autoPaymentTestPaymentRepository$initiateTestPayment$1 = new AutoPaymentTestPaymentRepository$initiateTestPayment$1(this, continuationImpl);
        Object obj2 = autoPaymentTestPaymentRepository$initiateTestPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoPaymentTestPaymentRepository$initiateTestPayment$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
