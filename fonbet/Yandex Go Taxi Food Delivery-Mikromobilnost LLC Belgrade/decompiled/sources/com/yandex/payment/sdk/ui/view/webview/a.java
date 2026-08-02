package com.yandex.payment.sdk.ui.view.webview;

import android.webkit.JavascriptInterface;
import defpackage.yo90;

/* loaded from: classes2.dex */
public final class a {
    public final /* synthetic */ PaymentSdkTinkoffWebView a;

    public a(PaymentSdkTinkoffWebView paymentSdkTinkoffWebView) {
        this.a = paymentSdkTinkoffWebView;
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        PaymentSdkTinkoffWebView paymentSdkTinkoffWebView = this.a;
        paymentSdkTinkoffWebView.post(new yo90(7, str, paymentSdkTinkoffWebView));
    }
}
