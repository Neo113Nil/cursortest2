package yads;

import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class vw3 extends ka {
    public vw3(WebView webView, String str) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
