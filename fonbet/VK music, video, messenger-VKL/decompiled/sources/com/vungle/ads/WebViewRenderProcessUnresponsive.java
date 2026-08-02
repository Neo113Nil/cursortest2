package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class WebViewRenderProcessUnresponsive extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewRenderProcessUnresponsive() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WebViewRenderProcessUnresponsive(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public WebViewRenderProcessUnresponsive(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, d.a("WebRenderProcessUnresponsive: ", str), null);
    }
}
