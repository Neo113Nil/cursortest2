package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import xsna.p7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class a6z0 extends lyy0 {
    public a d;
    public boolean e;
    public boolean f;
    public long g;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            gu8.c(null, "JS Console Message at line " + consoleMessage.lineNumber() + ": " + message);
            return false;
        }
    }

    public final void d(String str) {
        Context context;
        this.f = false;
        a aVar = this.d;
        if (aVar != null) {
            wga0.b("ShoppableAdPresenter: on shoppable view click, url - ", str, null);
            p7z0.d dVar = ((mwy0) aVar).f;
            if (dVar == null || (context = (Context) dVar.c.get()) == null) {
                return;
            }
            dVar.b.e(dVar.a, str, 1, null, null, context);
        }
    }

    public long getAndResetInteractionEnd() {
        long j = this.g;
        this.g = 0L;
        return j;
    }

    public void setListener(@Nullable a aVar) {
        this.d = aVar;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class c extends uxy0 {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            a6z0 a6z0Var = a6z0.this;
            if (a6z0Var.e) {
                return;
            }
            a6z0Var.e = true;
            gu8.c(null, "ShoppableWebView$MyWebViewClient: page loaded");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            gu8.c(null, "ShoppableWebView$MyWebViewClient: page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            qjk0.a(kh10.a(i, "ShoppableWebView$MyWebViewClient: load failed, error - ", ", description - ", str, ", url - "), str2, null);
            super.onReceivedError(webView, i, str, str2);
            a aVar = a6z0.this.d;
            if (aVar == null || ((mwy0) aVar).f == null) {
                return;
            }
            TextUtils.isEmpty(str);
            TextUtils.isEmpty(str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            gu8.c(null, "ShoppableWebView$MyWebViewClient: new scale - " + f2 + ", old scale - " + f);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            a6z0 a6z0Var = a6z0.this;
            if (a6z0Var.f && str != null) {
                a6z0Var.d(str);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            a6z0 a6z0Var = a6z0.this;
            if (!a6z0Var.f || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            a6z0Var.d(url.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            qjk0.a(kh10.a(errorCode, "ShoppableWebView$MyWebViewClient: load failed, error - ", ", description - ", charSequence, ", url - "), uri, null);
            a aVar = a6z0.this.d;
            if (aVar == null || ((mwy0) aVar).f == null) {
                return;
            }
            TextUtils.isEmpty(charSequence);
            TextUtils.isEmpty(uri);
        }
    }
}
