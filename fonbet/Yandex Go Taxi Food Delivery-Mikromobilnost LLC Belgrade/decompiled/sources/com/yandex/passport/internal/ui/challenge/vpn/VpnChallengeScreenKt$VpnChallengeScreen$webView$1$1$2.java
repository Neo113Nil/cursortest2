package com.yandex.passport.internal.ui.challenge.vpn;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.uw51;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"com/yandex/passport/internal/ui/challenge/vpn/VpnChallengeScreenKt$VpnChallengeScreen$webView$1$1$2", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "Lzy11;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VpnChallengeScreenKt$VpnChallengeScreen$webView$1$1$2 extends WebViewClient {
    final /* synthetic */ a0 $viewModel;

    public VpnChallengeScreenKt$VpnChallengeScreen$webView$1$1$2(a0 a0Var) {
        this.$viewModel = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageFinished$lambda$3(String str) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("VpnChallengeScreen injectBridgeJs result=", str, LogLevel.DEBUG, null, 8);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("VpnChallengeScreen onPageFinished url=", url, LogLevel.DEBUG, null, 8);
        }
        if (view != null) {
            view.evaluateJavascript("\n(function() {\n    window.close = function() {\n        window.nativeAMAndroid.onClose();\n    };\n    window.settings = function() {\n        window.nativeAMAndroid.onSettings();\n    };\n    window.reload = function() {\n        window.nativeAMAndroid.onReload();\n    };\n    return true;\n})();\n", new e());
        }
        this.$viewModel.W(x.a);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("VpnChallengeScreen onPageStarted url=", url, LogLevel.DEBUG, null, 8);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.ERROR;
            StringBuilder sb = new StringBuilder("VpnChallengeScreen onReceivedError url=");
            sb.append(request != null ? request.getUrl() : null);
            sb.append(" code=");
            sb.append(error != null ? Integer.valueOf(error.getErrorCode()) : null);
            sb.append(" description=");
            sb.append((Object) (error != null ? error.getDescription() : null));
            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.ERROR;
            StringBuilder sb = new StringBuilder("VpnChallengeScreen onReceivedHttpError url=");
            sb.append(request != null ? request.getUrl() : null);
            sb.append(" code=");
            sb.append(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
            sb.append(" reason=");
            sb.append(errorResponse != null ? errorResponse.getReasonPhrase() : null);
            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        super.onReceivedSslError(view, handler, error);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "VpnChallengeScreen onReceivedSslError error=" + error, 8);
        }
    }
}
