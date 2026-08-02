package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class WebViewRenderingProcessGone extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewRenderingProcessGone() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WebViewRenderingProcessGone(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public WebViewRenderingProcessGone(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, d.a("WebRenderingProcessGone: ", str), null);
    }
}
