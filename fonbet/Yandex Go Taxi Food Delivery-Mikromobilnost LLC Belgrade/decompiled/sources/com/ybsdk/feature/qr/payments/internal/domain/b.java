package com.ybsdk.feature.qr.payments.internal.domain;

import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.utils.poller.c;
import defpackage.acu;
import defpackage.c6g;
import defpackage.d6v;
import defpackage.kxb0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.p0e0;
import defpackage.p8g0;
import defpackage.sfg0;
import defpackage.tpr;
import defpackage.w530;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class b implements sfg0 {
    public final com.ybsdk.utils.poller.b a;
    public final com.ybsdk.feature.qr.payments.internal.data.a b;

    public b(p8g0 p8g0Var, com.ybsdk.utils.poller.b bVar, String str) {
        this.a = bVar;
        o8g0 o8g0Var = p8g0Var.a;
        this.b = new com.ybsdk.feature.qr.payments.internal.data.a((QrPaymentsApi) ((kxb0) o8g0Var.a).get(), (w530) ((c6g) o8g0Var.b).get(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        QrPaymentInteractor$getPaymentInfo$1 qrPaymentInteractor$getPaymentInfo$1;
        int i;
        if (continuationImpl instanceof QrPaymentInteractor$getPaymentInfo$1) {
            qrPaymentInteractor$getPaymentInfo$1 = (QrPaymentInteractor$getPaymentInfo$1) continuationImpl;
            int i2 = qrPaymentInteractor$getPaymentInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentInteractor$getPaymentInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentInteractor$getPaymentInfo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentInteractor$getPaymentInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qrPaymentInteractor$getPaymentInfo$1.label = 1;
                    obj = b(d6vVar, str, qrPaymentInteractor$getPaymentInfo$1);
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
                }
                qrPaymentInteractor$getPaymentInfo$1.label = 2;
                obj = e.G((tpr) obj, qrPaymentInteractor$getPaymentInfo$1);
            }
        }
        qrPaymentInteractor$getPaymentInfo$1 = new QrPaymentInteractor$getPaymentInfo$1(this, continuationImpl);
        Object obj3 = qrPaymentInteractor$getPaymentInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentInteractor$getPaymentInfo$1.label;
        if (i != 0) {
        }
        qrPaymentInteractor$getPaymentInfo$1.label = 2;
        obj3 = e.G((tpr) obj3, qrPaymentInteractor$getPaymentInfo$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        QrPaymentInteractor$getPaymentInfoFlow$1 qrPaymentInteractor$getPaymentInfoFlow$1;
        int i;
        if (continuationImpl instanceof QrPaymentInteractor$getPaymentInfoFlow$1) {
            qrPaymentInteractor$getPaymentInfoFlow$1 = (QrPaymentInteractor$getPaymentInfoFlow$1) continuationImpl;
            int i2 = qrPaymentInteractor$getPaymentInfoFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentInteractor$getPaymentInfoFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentInteractor$getPaymentInfoFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentInteractor$getPaymentInfoFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c c = this.a.c(p0e0.b, new QrPaymentInteractor$getPaymentInfoFlow$2(2, null), new QrPaymentInteractor$getPaymentInfoFlow$3(d6vVar, this, str, null));
                    qrPaymentInteractor$getPaymentInfoFlow$1.label = 1;
                    obj = c.d(null, qrPaymentInteractor$getPaymentInfoFlow$1);
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
                return new acu((tpr) obj, 17);
            }
        }
        qrPaymentInteractor$getPaymentInfoFlow$1 = new QrPaymentInteractor$getPaymentInfoFlow$1(this, continuationImpl);
        Object obj2 = qrPaymentInteractor$getPaymentInfoFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentInteractor$getPaymentInfoFlow$1.label;
        if (i != 0) {
        }
        return new acu((tpr) obj2, 17);
    }
}
