package com.ybsdk.feature.qr.payments.internal.screens.subscription.data;

import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import defpackage.ny61;
import defpackage.uc5;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final QrPaymentsApi a;
    public final com.ybsdk.di.modules.features.qr.a b;
    public final String c;
    public final uc5 d;

    public a(QrPaymentsApi qrPaymentsApi, com.ybsdk.di.modules.features.qr.a aVar, String str, uc5 uc5Var) {
        this.a = qrPaymentsApi;
        this.b = aVar;
        this.c = str;
        this.d = uc5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        QrPaymentsSubscriptionRepository$subscriptionConfirmV2$1 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1;
        int i;
        String str5;
        String str6;
        Object obj;
        String str7;
        if (continuationImpl instanceof QrPaymentsSubscriptionRepository$subscriptionConfirmV2$1) {
            qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1 = (QrPaymentsSubscriptionRepository$subscriptionConfirmV2$1) continuationImpl;
            int i2 = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsSubscriptionRepository$subscriptionConfirmV2$1 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12 = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1;
                Object obj2 = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.label;
                if (i != 0) {
                    b.b(obj2);
                    if (str2 == null) {
                        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$0 = str;
                        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$1 = str3;
                        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$2 = str4;
                        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.label = 1;
                        Object a = this.b.a(qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12);
                        if (a != obj3) {
                            str5 = str3;
                            str6 = str4;
                            obj = a;
                            str7 = str;
                        }
                    }
                    str7 = str;
                    obj = str2;
                    str5 = str3;
                    str6 = str4;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj2);
                            return ((Result) obj2).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str8 = (String) qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$2;
                    String str9 = (String) qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$1;
                    String str10 = (String) qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$0;
                    b.b(obj2);
                    str5 = str9;
                    str7 = str10;
                    str6 = str8;
                    obj = ((Result) obj2).getValue();
                }
                QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2 = new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2(obj, str7, this, str5, str6, null);
                qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$0 = null;
                qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$1 = null;
                qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.L$2 = null;
                qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12.label = 2;
                Object O = this.d.O(qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2, str7, qrPaymentsSubscriptionRepository$subscriptionConfirmV2$12);
                return O != obj3 ? obj3 : O;
            }
        }
        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1 = new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$1(this, continuationImpl);
        QrPaymentsSubscriptionRepository$subscriptionConfirmV2$1 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122 = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$1;
        Object obj22 = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122.label;
        if (i != 0) {
        }
        QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$22 = new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2(obj, str7, this, str5, str6, null);
        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122.L$0 = null;
        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122.L$1 = null;
        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122.L$2 = null;
        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122.label = 2;
        Object O2 = this.d.O(qrPaymentsSubscriptionRepository$subscriptionConfirmV2$22, str7, qrPaymentsSubscriptionRepository$subscriptionConfirmV2$122);
        if (O2 != obj32) {
        }
    }
}
