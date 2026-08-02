package xsna;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: WebBridgeChromeClient.kt */
/* loaded from: classes6.dex */
public final class cgx0 extends ay90 {
    public static final /* synthetic */ int i = 0;
    public final xc80 g;
    public final n1w0 h;

    public cgx0(xc80 xc80Var, n1w0 n1w0Var) {
        super(xc80Var);
        this.g = xc80Var;
        this.h = n1w0Var;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            String str = consoleMessage.message() + ", " + consoleMessage.lineNumber() + ", " + consoleMessage.sourceId();
            if (qex0.c) {
                xgx0.a.getClass();
                xgx0.a(str);
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        if (i2 == 100) {
            this.g.r();
        }
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        this.h.b(valueCallback, fileChooserParams);
        return true;
    }
}
