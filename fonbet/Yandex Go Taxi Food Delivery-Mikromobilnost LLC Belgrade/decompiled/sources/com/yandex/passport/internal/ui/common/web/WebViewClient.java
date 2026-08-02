package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.challenge.v;
import com.yandex.passport.internal.util.o;
import com.yandex.passport.internal.util.q;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.w511;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010$\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020.H\u0016¢\u0006\u0004\b\u0013\u0010/J/\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u00102J\u001f\u00103\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u0002052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u000205*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/yandex/passport/internal/ui/common/web/WebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/app/Activity;", "activity", "Lcom/yandex/passport/internal/ui/common/web/c;", "webCase", "Lcom/yandex/passport/internal/ui/common/web/f;", "viewController", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/ui/common/web/d;", "urlChecker", "<init>", "(Landroid/app/Activity;Lcom/yandex/passport/internal/ui/common/web/c;Lcom/yandex/passport/internal/ui/common/web/f;Lcom/yandex/passport/internal/analytics/c0;Lcom/yandex/passport/internal/ui/common/web/d;)V", "", ErrorResponseData.JSON_ERROR_CODE, "", "url", "Lzy11;", "onReceivedError", "(ILjava/lang/String;)V", "Lcom/yandex/passport/common/url/b;", "Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;", "checkUrl-XvpcIDg", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;", "checkUrl", "openExternalBrowser-XvpcIDg", "(Ljava/lang/String;)V", "openExternalBrowser", "onRetry", "()V", "Landroid/webkit/WebView;", "view", "urlString", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/app/Activity;", "Lcom/yandex/passport/internal/ui/common/web/c;", "Lcom/yandex/passport/internal/ui/common/web/f;", "Lcom/yandex/passport/internal/analytics/c0;", "Lcom/yandex/passport/internal/ui/common/web/d;", "lastUrl", "Ljava/lang/String;", "webViewHasError", "Z", "isAllowed", "(Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;)Z", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewClient extends android.webkit.WebViewClient {
    public static final int $stable = 8;
    private final Activity activity;
    private final c0 eventReporter;
    private String lastUrl;
    private final d urlChecker;
    private final f viewController;
    private final c webCase;
    private boolean webViewHasError;

    public WebViewClient(Activity activity, c cVar, f fVar, c0 c0Var, d dVar) {
        this.activity = activity;
        this.webCase = cVar;
        this.viewController = fVar;
        this.eventReporter = c0Var;
        this.urlChecker = dVar;
    }

    /* renamed from: checkUrl-XvpcIDg, reason: not valid java name */
    private final WebUrlChecker$Status m315checkUrlXvpcIDg(String url) {
        return this.urlChecker.a(url, ((v) this.webCase).c);
    }

    private final boolean isAllowed(WebUrlChecker$Status webUrlChecker$Status) {
        return webUrlChecker$Status == WebUrlChecker$Status.ALLOWED;
    }

    private final void onReceivedError(int errorCode, String url) {
        if (!jl40.l(url, this.lastUrl)) {
            this.eventReporter.m(errorCode, url);
            return;
        }
        if (-6 == errorCode || -2 == errorCode || -7 == errorCode || -8 == errorCode) {
            c cVar = this.webCase;
            WebCaseNext$Error webCaseNext$Error = WebCaseNext$Error.SSL;
            cVar.getClass();
            this.viewController.a(R.string.passport_error_network);
            this.eventReporter.l(errorCode, url);
        } else {
            c cVar2 = this.webCase;
            WebCaseNext$Error webCaseNext$Error2 = WebCaseNext$Error.SSL;
            cVar2.getClass();
            this.viewController.a(R.string.passport_reg_error_unknown);
            this.eventReporter.k(new Throwable(oyr.k(errorCode, "errorCode=", " url=", url)));
        }
        this.webViewHasError = true;
    }

    /* renamed from: openExternalBrowser-XvpcIDg, reason: not valid java name */
    private final void m316openExternalBrowserXvpcIDg(String url) {
        try {
            this.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        if (!this.webViewHasError) {
            j jVar = this.viewController.a;
            jVar.A.setVisibility(8);
            jVar.x.setVisibility(8);
            WebView webView = jVar.z;
            webView.setVisibility(0);
            webView.requestFocus();
        }
        super.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String urlString, Bitmap favicon) {
        super.onPageStarted(view, urlString, favicon);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Page started: ".concat(urlString), 8);
        }
        this.lastUrl = urlString;
        this.webCase.getClass();
        this.webViewHasError = false;
        if (isAllowed(m315checkUrlXvpcIDg(urlString))) {
            return;
        }
        view.stopLoading();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.cancel();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceivedSslError: error=" + error, 8);
        }
        c cVar2 = this.webCase;
        WebCaseNext$Error webCaseNext$Error = WebCaseNext$Error.SSL;
        cVar2.getClass();
        this.viewController.a(R.string.passport_login_ssl_error);
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
        if (!URLUtil.isNetworkUrl(uri)) {
            com.yandex.passport.internal.util.a.a(this.activity, new Intent("android.intent.action.VIEW", Uri.parse(uri)));
            return true;
        }
        a aVar = (a) this.webCase;
        aVar.getClass();
        String str = ((v) aVar).d;
        if (com.yandex.passport.common.url.b.g(str).equals(com.yandex.passport.common.url.b.g(uri)) && jl40.l(com.yandex.passport.common.url.b.h(str), com.yandex.passport.common.url.b.h(uri))) {
            ((a) this.webCase).d(uri);
            return true;
        }
        int i = e.a[m315checkUrlXvpcIDg(uri).ordinal()];
        if (i == 1) {
            this.webCase.getClass();
            return false;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                w511.b();
                return false;
            }
            m316openExternalBrowserXvpcIDg(uri);
        }
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
