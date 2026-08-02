package defpackage;

import android.webkit.WebView;
import com.ybsdk.feature.webview.internal.sdk.DefaultWebChromeClientImpl;
import com.ybsdk.feature.webview.internal.sdk.DefaultWebViewClientCompatImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public final class boh implements aj51 {
    public final WebView a;

    public boh(WebView webView) {
        this.a = webView;
    }

    public final void a(Object obj, String str) {
        this.a.addJavascriptInterface(obj, str);
    }

    public final boolean b() {
        return this.a.canGoBack();
    }

    public final void c() {
        this.a.clearHistory();
    }

    public final void d() {
        this.a.destroy();
    }

    public final void e(String str) {
        this.a.evaluateJavascript(str, null);
    }

    public final gyc f() {
        return new gyc(this.a.getSettings());
    }

    public final String g() {
        return this.a.getUrl();
    }

    public final WebView h() {
        return this.a;
    }

    public final void i() {
        this.a.goBack();
    }

    public final void j(String str, Map map) {
        this.a.loadUrl(str, map);
    }

    public final void k(String str) {
        this.a.removeJavascriptInterface(str);
    }

    public final void l(mo41 mo41Var) {
        this.a.setDownloadListener(new aoh(0, mo41Var));
    }

    public final void m(si51 si51Var) {
        this.a.setWebChromeClient(new DefaultWebChromeClientImpl(si51Var));
    }

    public final void n(yi51 yi51Var) {
        this.a.setWebViewClient(new DefaultWebViewClientCompatImpl(yi51Var));
    }
}
