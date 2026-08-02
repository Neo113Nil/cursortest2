package xsna;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class aiz0 extends lyy0 {
    public final String d;

    public aiz0(String str, waz0 waz0Var, lfz0 lfz0Var, Context context) {
        super(context);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        this.d = str;
        WebView webView = getWebView();
        if (webView == null) {
            gu8.e(null, "WebFormView: WebView is null, can't add handlers");
        } else {
            setWebViewClient(lfz0Var);
            webView.addJavascriptInterface(waz0Var, "AndroidBridge");
        }
    }
}
