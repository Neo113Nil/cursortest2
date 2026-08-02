package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class lyy0 extends FrameLayout implements l9z0 {
    public final WebView b;
    public final ArrayList c;

    public lyy0(Context context) {
        super(context);
        try {
            WebView webView = new WebView(context);
            this.b = webView;
            webView.clearCache(true);
            webView.addJavascriptInterface(this, "vkAdsWebInterface");
            addView(webView);
            this.c = new ArrayList();
        } catch (Throwable th) {
            gu8.e(null, "BaseWebView: Webview cannot be initialized, ad will not work properly - " + th.getMessage());
            th.printStackTrace();
        }
    }

    public static void c(Throwable th) {
        gu8.e(null, "BaseWebView: WebView fail - " + th.getMessage());
    }

    public final void a(int i) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        if (i > 0) {
            o8z0.g.postDelayed(new a72(this, 29), i);
        } else {
            try {
                webView.destroy();
            } catch (Throwable th) {
                c(th);
            }
        }
    }

    public final void b(String str) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        try {
            webView.loadUrl(str);
        } catch (Throwable th) {
            c(th);
        }
    }

    @Nullable
    public WebSettings getSettings() {
        try {
            WebView webView = this.b;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th) {
            c(th);
            return null;
        }
    }

    @Nullable
    public String getUrl() {
        try {
            WebView webView = this.b;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th) {
            c(th);
            return null;
        }
    }

    @Nullable
    public WebView getWebView() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        webView.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        WebView webView = this.b;
        if (webView == null) {
            setMeasuredDimension(0, 0);
        } else {
            webView.measure(i, i2);
            setMeasuredDimension(webView.getMeasuredWidth(), webView.getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.lwo0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.t3z0] */
    @Override // xsna.l9z0
    @JavascriptInterface
    public void sendMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        qjk0.a(xe9.a("BaseWebView: sendMessage ", str, " ", str2, " "), str3, null);
        try {
            if (TextUtils.isEmpty(str)) {
                gu8.c(null, "PostMessageParser: can't parse postMessage – type is empty");
            } else if (TextUtils.isEmpty(str2)) {
                gu8.c(null, "PostMessageParser: can't parse postMessage – action is empty");
            } else if (TextUtils.isEmpty(str3)) {
                gu8.c(null, "PostMessageParser: can't parse postMessage – params is empty");
            } else {
                r1 = new lwo0(str, str2, str3);
            }
        } catch (Throwable th) {
            eb3.a(r1, new StringBuilder("PostMessageParser: can't parse postMessage – "), th);
        }
        if (r1 == 0) {
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((t3z0) it.next()).a(r1);
        }
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        webView.setHorizontalScrollBarEnabled(z);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        webView.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setScrollContainer(boolean z) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        webView.setScrollContainer(z);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        webView.setVerticalScrollBarEnabled(z);
    }

    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(webChromeClient);
        } catch (Throwable th) {
            c(th);
        }
    }

    public void setWebViewBackgroundColor(int i) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        webView.setBackgroundColor(i);
    }

    public void setWebViewClient(@NonNull WebViewClient webViewClient) {
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebViewClient(webViewClient);
        } catch (Throwable th) {
            c(th);
        }
    }
}
