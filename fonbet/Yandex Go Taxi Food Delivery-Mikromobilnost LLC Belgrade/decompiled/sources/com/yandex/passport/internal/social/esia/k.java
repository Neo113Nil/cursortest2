package com.yandex.passport.internal.social.esia;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import defpackage.tls;

/* loaded from: classes15.dex */
public final /* synthetic */ class k implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ k(WebView webView, int i) {
        this.a = i;
        this.b = webView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        WebView webView = this.b;
        switch (i) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                if (webView.getParent() != null) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                }
                frameLayout.addView(webView);
                return frameLayout;
            case 1:
                return new l(webView);
            case 2:
                return new com.yandex.passport.internal.ui.challenge.vpn.d(webView, 0);
            case 3:
                FrameLayout frameLayout2 = new FrameLayout((Context) obj);
                if (webView.getParent() != null) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                }
                frameLayout2.addView(webView);
                return frameLayout2;
            case 4:
                return new com.yandex.passport.internal.ui.challenge.vpn.d(webView, 1);
            default:
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                return webView;
        }
    }
}
