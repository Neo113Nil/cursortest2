package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class AdCantPlayWithoutWebView extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdCantPlayWithoutWebView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdCantPlayWithoutWebView(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public AdCantPlayWithoutWebView(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, d.a("No WebView when playing ads. ", str), null);
    }
}
