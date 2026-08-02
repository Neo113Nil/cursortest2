package com.ybsdk.feature.qr.payments.internal.screens.list.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.dto.delete.DeleteSubscriptionRequest;
import com.ybsdk.feature.qr.payments.internal.network.dto.delete.DeleteSubscriptionResponse;
import defpackage.bsh;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final QrPaymentsApi a;

    public a(QrPaymentsApi qrPaymentsApi) {
        this.a = qrPaymentsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        QrSubscriptionsListRepository$deleteSubscription$1 qrSubscriptionsListRepository$deleteSubscription$1;
        int i;
        Object c;
        if (continuationImpl instanceof QrSubscriptionsListRepository$deleteSubscription$1) {
            qrSubscriptionsListRepository$deleteSubscription$1 = (QrSubscriptionsListRepository$deleteSubscription$1) continuationImpl;
            int i2 = qrSubscriptionsListRepository$deleteSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrSubscriptionsListRepository$deleteSubscription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrSubscriptionsListRepository$deleteSubscription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrSubscriptionsListRepository$deleteSubscription$1.label;
                if (i != 0) {
                    b.b(obj);
                    QrSubscriptionsListRepository$deleteSubscription$2 qrSubscriptionsListRepository$deleteSubscription$2 = new QrSubscriptionsListRepository$deleteSubscription$2(this, new DeleteSubscriptionRequest(str), null);
                    qrSubscriptionsListRepository$deleteSubscription$1.label = 1;
                    c = c.c(qrSubscriptionsListRepository$deleteSubscription$2, qrSubscriptionsListRepository$deleteSubscription$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                try {
                    bsh bshVar = new bsh(((DeleteSubscriptionResponse) c).getMessage());
                    b.b(bshVar);
                    return bshVar;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        qrSubscriptionsListRepository$deleteSubscription$1 = new QrSubscriptionsListRepository$deleteSubscription$1(this, continuationImpl);
        Object obj2 = qrSubscriptionsListRepository$deleteSubscription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrSubscriptionsListRepository$deleteSubscription$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        QrSubscriptionsListRepository$getSubscriptionsV3$1 qrSubscriptionsListRepository$getSubscriptionsV3$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof QrSubscriptionsListRepository$getSubscriptionsV3$1) {
            qrSubscriptionsListRepository$getSubscriptionsV3$1 = (QrSubscriptionsListRepository$getSubscriptionsV3$1) continuationImpl;
            int i2 = qrSubscriptionsListRepository$getSubscriptionsV3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrSubscriptionsListRepository$getSubscriptionsV3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrSubscriptionsListRepository$getSubscriptionsV3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrSubscriptionsListRepository$getSubscriptionsV3$1.label;
                if (i != 0) {
                    b.b(obj);
                    QrSubscriptionsListRepository$getSubscriptionsV3$2 qrSubscriptionsListRepository$getSubscriptionsV3$2 = new QrSubscriptionsListRepository$getSubscriptionsV3$2(this, null);
                    qrSubscriptionsListRepository$getSubscriptionsV3$1.label = 1;
                    c = c.c(qrSubscriptionsListRepository$getSubscriptionsV3$2, qrSubscriptionsListRepository$getSubscriptionsV3$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                QrSubscriptionsListRepository$getSubscriptionsV3$3$1 qrSubscriptionsListRepository$getSubscriptionsV3$3$1 = new QrSubscriptionsListRepository$getSubscriptionsV3$3$1(2, this, a.class, "toV3Entity", "toV3Entity(Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/GetSubscriptionsResponseV3;)Lcom/ybsdk/feature/qr/payments/internal/screens/list/data/entities/QrSubscriptionsListEntityV3;", 4);
                qrSubscriptionsListRepository$getSubscriptionsV3$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, qrSubscriptionsListRepository$getSubscriptionsV3$3$1, qrSubscriptionsListRepository$getSubscriptionsV3$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        qrSubscriptionsListRepository$getSubscriptionsV3$1 = new QrSubscriptionsListRepository$getSubscriptionsV3$1(this, continuationImpl);
        Object obj2 = qrSubscriptionsListRepository$getSubscriptionsV3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrSubscriptionsListRepository$getSubscriptionsV3$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
