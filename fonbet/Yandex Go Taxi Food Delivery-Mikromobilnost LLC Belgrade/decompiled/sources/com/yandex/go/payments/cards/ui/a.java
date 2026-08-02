package com.yandex.go.payments.cards.ui;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.yandex.go.payments.cards.ui.Card3dsViewImpl;
import defpackage.rt41;

/* loaded from: classes13.dex */
public final class a implements rt41 {
    public final /* synthetic */ SslErrorHandler a;
    public final /* synthetic */ Card3dsViewImpl.WebView3DSClient b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ SslError w;

    public a(Card3dsViewImpl.WebView3DSClient webView3DSClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.a = sslErrorHandler;
        this.b = webView3DSClient;
        this.c = webView;
        this.w = sslError;
    }

    @Override // defpackage.rt41
    public final void l() {
        this.a.proceed();
    }

    @Override // defpackage.rt41
    public final void onCanceled() {
        this.b.handleSslErrorNormally(this.c, this.a, this.w);
    }
}
