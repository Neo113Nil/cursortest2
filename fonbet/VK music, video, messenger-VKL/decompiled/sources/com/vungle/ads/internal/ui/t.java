package com.vungle.ads.internal.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class t extends Lambda implements gzs {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ RenderProcessGoneDetail b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super(0);
        this.a = webView;
        this.b = renderProcessGoneDetail;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        a.append(webView != null ? webView.getUrl() : null);
        a.append(", did crash: ");
        RenderProcessGoneDetail renderProcessGoneDetail = this.b;
        a.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        return a.toString();
    }
}
