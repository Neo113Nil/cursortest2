package com.yandex.passport.internal.ui.webview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.webview.webcases.l;
import com.yandex.passport.internal.util.o;
import com.yandex.passport.internal.util.q;
import defpackage.jl40;
import defpackage.oyr;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020#H\u0016¢\u0006\u0004\b\u0011\u0010$J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010,J'\u0010/\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/yandex/passport/internal/ui/webview/PassportWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/yandex/passport/internal/ui/webview/WebViewActivity;", "activity", "Lcom/yandex/passport/internal/ui/webview/webcases/l;", "webCase", "Lcom/yandex/passport/internal/ui/webview/d;", "viewController", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "<init>", "(Lcom/yandex/passport/internal/ui/webview/WebViewActivity;Lcom/yandex/passport/internal/ui/webview/webcases/l;Lcom/yandex/passport/internal/ui/webview/d;Lcom/yandex/passport/internal/analytics/c0;)V", "", ErrorResponseData.JSON_ERROR_CODE, "", "url", "Lzy11;", "onReceivedError", "(ILjava/lang/String;)V", "onRetry", "()V", "Landroid/webkit/WebView;", "view", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceResponse;", "response", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Lcom/yandex/passport/internal/ui/webview/WebViewActivity;", "Lcom/yandex/passport/internal/ui/webview/webcases/l;", "Lcom/yandex/passport/internal/ui/webview/d;", "Lcom/yandex/passport/internal/analytics/c0;", "lastUrl", "Ljava/lang/String;", "webViewHasError", "Z", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PassportWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    private final WebViewActivity activity;
    private final c0 eventReporter;
    private String lastUrl;
    private final d viewController;
    private final l webCase;
    private boolean webViewHasError;

    public PassportWebViewClient(WebViewActivity webViewActivity, l lVar, d dVar, c0 c0Var) {
        this.activity = webViewActivity;
        this.webCase = lVar;
        this.viewController = dVar;
        this.eventReporter = c0Var;
    }

    private final void onReceivedError(int errorCode, String url) {
        if (!jl40.l(url, this.lastUrl)) {
            this.eventReporter.m(errorCode, url);
            return;
        }
        if (-6 == errorCode || -2 == errorCode || -7 == errorCode || -8 == errorCode) {
            if (!this.webCase.h(this.activity, R.string.passport_error_network)) {
                this.viewController.a(R.string.passport_error_network);
            }
            this.eventReporter.l(errorCode, url);
        } else {
            if (!this.webCase.h(this.activity, R.string.passport_reg_error_unknown)) {
                this.viewController.a(R.string.passport_reg_error_unknown);
            }
            this.eventReporter.k(new Throwable(oyr.k(errorCode, "errorCode=", " url=", url)));
        }
        this.webViewHasError = true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        if (!this.webViewHasError) {
            d dVar = this.viewController;
            WebView webView = dVar.e;
            ((View) dVar.d.a).setVisibility(8);
            dVar.c.setVisibility(8);
            webView.setVisibility(0);
            webView.requestFocus();
        }
        super.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Page started: ".concat(url), 8);
        }
        this.lastUrl = url;
        this.webCase.i(this.activity, Uri.parse(url));
        this.webViewHasError = false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse response) {
        if (request.isForMainFrame()) {
            int statusCode = response.getStatusCode();
            String uri = request.getUrl().toString();
            if (200 > statusCode || statusCode >= 300) {
                this.webViewHasError = true;
                this.eventReporter.l(statusCode, uri);
                int i = (400 > statusCode || statusCode >= 500) ? (500 > statusCode || statusCode >= 600) ? R.string.passport_webview_unexpected_error_text : R.string.passport_error_unknown_server_response : R.string.passport_webview_404_error_text;
                if (this.webCase.h(this.activity, i)) {
                    return;
                }
                this.viewController.a(i);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.cancel();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceivedSslError: error=" + error, 8);
        }
        if (!this.webCase.h(this.activity, R.string.passport_login_ssl_error)) {
            this.viewController.a(R.string.passport_login_ssl_error);
        }
        this.webViewHasError = true;
    }

    public final void onRetry() {
        this.webViewHasError = false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        String uri = request.getUrl().toString();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "shouldOverrideUrlLoading: ".concat(uri), 8);
        }
        this.lastUrl = uri;
        if (o.a() && !((Pattern) q.a.getValue()).matcher(uri).find()) {
            Toast.makeText(this.activity, R.string.passport_error_track_invalid, 0).show();
            return true;
        }
        if (URLUtil.isNetworkUrl(uri)) {
            return this.webCase.j(this.activity, Uri.parse(uri));
        }
        com.yandex.passport.internal.util.a.a(this.activity, new Intent("android.intent.action.VIEW", Uri.parse(uri)));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        onReceivedError(errorCode, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        onReceivedError(error.getErrorCode(), request.getUrl().toString());
    }
}
