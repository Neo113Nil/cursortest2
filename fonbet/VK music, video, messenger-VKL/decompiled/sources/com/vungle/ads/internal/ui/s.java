package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class s extends Lambda implements gzs {
    public final /* synthetic */ WebView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WebView webView) {
        super(0);
        this.a = webView;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        a.append(webView != null ? webView.getUrl() : null);
        return a.toString();
    }
}
