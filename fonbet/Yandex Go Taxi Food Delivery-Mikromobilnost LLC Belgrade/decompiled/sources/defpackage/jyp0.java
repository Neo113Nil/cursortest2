package defpackage;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.yandex.go.platform.js_api.b;

/* loaded from: classes13.dex */
public final class jyp0 implements ci41 {
    public final String a;
    public final WebView b;
    public final b c;
    public final lb20 d;

    public jyp0(lb20 lb20Var, WebView webView, b bVar, String str) {
        this.a = str;
        this.b = webView;
        this.c = bVar;
        this.d = lb20Var;
    }

    @Override // defpackage.ci41
    public final void b(n790 n790Var) {
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2, String str3, String str4) {
        String[] strArr;
        iyw c = this.c.c(str);
        if (str4 != null) {
            if (str3 == null) {
                str3 = "";
            }
            strArr = new String[]{str3, str4};
        } else {
            strArr = str3 != null ? new String[]{str3} : new String[0];
        }
        c.a(str2, strArr);
    }

    @Override // defpackage.ci41
    public final void onPageFinished(String str) {
        if (jl40.l(str, this.a)) {
            return;
        }
        lb20 lb20Var = this.d;
        WebView webView = this.b;
        webView.evaluateJavascript("window.goPlatformPromises", new fp41(lb20Var, webView, this.c, "SecondaryPageFinished"));
    }

    @Override // defpackage.ci41
    public final void onPageStarted(String str) {
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2, String str3) {
        invokeCode(str, str2, str3, null);
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2) {
        invokeCode(str, str2, null, null);
    }
}
