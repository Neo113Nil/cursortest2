package com.yandex.passport.user_id.ui;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.i1k;
import defpackage.pey;

/* loaded from: classes15.dex */
public final class e implements i1k {
    public final /* synthetic */ pey a;
    public final /* synthetic */ b b;
    public final /* synthetic */ WebView c;

    public e(pey peyVar, b bVar, WebView webView) {
        this.a = peyVar;
        this.b = bVar;
        this.c = webView;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
        WebView webView = this.c;
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.setWebChromeClient(null);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("about:blank");
        webView.stopLoading();
        webView.destroy();
    }
}
