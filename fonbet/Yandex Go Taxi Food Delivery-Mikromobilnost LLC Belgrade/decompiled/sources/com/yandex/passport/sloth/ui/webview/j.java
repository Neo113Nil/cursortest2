package com.yandex.passport.sloth.ui.webview;

import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import defpackage.pey;
import defpackage.sls;

/* loaded from: classes2.dex */
public final class j implements androidx.lifecycle.q {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ WebViewController b;

    public j(WebViewController webViewController, WebView webView) {
        this.a = webView;
        this.b = webViewController;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        sls slsVar;
        int i = i.a[event.ordinal()];
        WebView webView = this.a;
        if (i == 1) {
            webView.onResume();
            return;
        }
        if (i == 2) {
            webView.onPause();
            return;
        }
        if (i != 3) {
            return;
        }
        WebViewController webViewController = this.b;
        webViewController.setDestroyed(true);
        webViewController.destroyWebView(webView);
        slsVar = webViewController.onDestroyCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }
}
