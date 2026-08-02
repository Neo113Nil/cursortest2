package xsna;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: VkUiHtmlWebViewProvider.kt */
/* loaded from: classes6.dex */
public final class kwv0 extends xvv0 {
    @Override // xsna.uvv0, xsna.v1w0
    public final void a(WebView webView) {
        super.a(webView);
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
    }
}
