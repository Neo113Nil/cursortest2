package com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.webviewpayment.data;

import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.pay.payment.PaymentData;
import defpackage.g180;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.a a;
    public final PaymentData b;
    public final Region c;

    public a(com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar, PaymentData paymentData, Region region) {
        this.a = aVar;
        this.b = paymentData;
        this.c = region;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WebViewPaymentUrlProviderImpl$getUrl$1 webViewPaymentUrlProviderImpl$getUrl$1;
        int i;
        Object a;
        g180 g180Var;
        if (continuationImpl instanceof WebViewPaymentUrlProviderImpl$getUrl$1) {
            webViewPaymentUrlProviderImpl$getUrl$1 = (WebViewPaymentUrlProviderImpl$getUrl$1) continuationImpl;
            int i2 = webViewPaymentUrlProviderImpl$getUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewPaymentUrlProviderImpl$getUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewPaymentUrlProviderImpl$getUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewPaymentUrlProviderImpl$getUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    String paymentUrl = this.b.getPaymentUrl();
                    if (this.c != Region.RU) {
                        return paymentUrl;
                    }
                    webViewPaymentUrlProviderImpl$getUrl$1.label = 1;
                    a = this.a.a(paymentUrl, webViewPaymentUrlProviderImpl$getUrl$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                g180Var = (g180) a;
                if (g180Var == null) {
                    return g180Var.b;
                }
                return null;
            }
        }
        webViewPaymentUrlProviderImpl$getUrl$1 = new WebViewPaymentUrlProviderImpl$getUrl$1(this, continuationImpl);
        Object obj2 = webViewPaymentUrlProviderImpl$getUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewPaymentUrlProviderImpl$getUrl$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        g180Var = (g180) a;
        if (g180Var == null) {
        }
    }
}
