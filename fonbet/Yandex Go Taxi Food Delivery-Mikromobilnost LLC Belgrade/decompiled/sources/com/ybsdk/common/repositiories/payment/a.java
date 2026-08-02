package com.ybsdk.common.repositiories.payment;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.CheckPaymentRequest;
import com.ybsdk.network.dto.CheckPaymentResponse;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.ny61;
import defpackage.sgb;
import defpackage.wlp;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Api a;
    public final com.ybsdk.rconfig.b b;

    public a(Api api, com.ybsdk.rconfig.b bVar) {
        this.a = api;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        CheckPaymentRepository$checkPayment$1 checkPaymentRepository$checkPayment$1;
        int i;
        Object c;
        Object c2;
        if (continuationImpl instanceof CheckPaymentRepository$checkPayment$1) {
            checkPaymentRepository$checkPayment$1 = (CheckPaymentRepository$checkPayment$1) continuationImpl;
            int i2 = checkPaymentRepository$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPaymentRepository$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkPaymentRepository$checkPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPaymentRepository$checkPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CheckPaymentRequest checkPaymentRequest = new CheckPaymentRequest(str, new Money(bigDecimal, str2));
                    com.ybsdk.rconfig.b bVar = this.b;
                    bVar.getClass();
                    if (((CommonFeatureFlag) bVar.d(wlp.t0).getData()).isEnabled()) {
                        CheckPaymentRepository$checkPayment$2 checkPaymentRepository$checkPayment$2 = new CheckPaymentRepository$checkPayment$2(this, checkPaymentRequest, null);
                        checkPaymentRepository$checkPayment$1.label = 1;
                        c2 = c.c(checkPaymentRepository$checkPayment$2, checkPaymentRepository$checkPayment$1);
                    } else {
                        CheckPaymentRepository$checkPayment$4 checkPaymentRepository$checkPayment$4 = new CheckPaymentRepository$checkPayment$4(this, checkPaymentRequest, null);
                        checkPaymentRepository$checkPayment$1.label = 3;
                        c = c.c(checkPaymentRepository$checkPayment$4, checkPaymentRepository$checkPayment$1);
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        c = ((Result) obj).getValue();
                        if (c instanceof Result.Failure) {
                            return c;
                        }
                        try {
                            return sgb.a((CheckPaymentResponse) c);
                        } catch (Throwable th) {
                            return new Result.Failure(th);
                        }
                    }
                    kotlin.b.b(obj);
                    c2 = ((Result) obj).getValue();
                    Throwable a = Result.a(c2);
                    if (a != null) {
                        return new Result.Failure(a);
                    }
                    CheckPaymentRepository$checkPayment$3$1 checkPaymentRepository$checkPayment$3$1 = new CheckPaymentRepository$checkPayment$3$1();
                    checkPaymentRepository$checkPayment$1.label = 2;
                    Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c2, checkPaymentRepository$checkPayment$3$1, checkPaymentRepository$checkPayment$1);
                    if (a2 != coroutineSingletons) {
                        return a2;
                    }
                }
                return coroutineSingletons;
            }
        }
        checkPaymentRepository$checkPayment$1 = new CheckPaymentRepository$checkPayment$1(this, continuationImpl);
        Object obj2 = checkPaymentRepository$checkPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPaymentRepository$checkPayment$1.label;
        if (i != 0) {
        }
        return coroutineSingletons2;
    }
}
