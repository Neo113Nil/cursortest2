package com.yandex.passport.internal.ui.challenge.vpn;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import defpackage.i1k;

/* loaded from: classes2.dex */
public final class d implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ d(WebView webView, int i) {
        this.a = i;
        this.b = webView;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        WebView webView = this.b;
        switch (i) {
            case 0:
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.stopLoading();
                webView.destroy();
                break;
            case 1:
                webView.destroy();
                break;
            default:
                webView.destroy();
                break;
        }
    }
}
