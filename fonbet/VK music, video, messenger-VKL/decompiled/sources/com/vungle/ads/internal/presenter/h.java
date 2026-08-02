package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class h extends Lambda implements gzs {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.a.d;
        WebView webView = zVar.m;
        if (webView != null) {
            zVar.a(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
        return s3q0.a;
    }
}
