package com.yandex.passport.internal.ui.challenge.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.common.web.WebUrlChecker$Status;
import com.yandex.passport.internal.util.o;
import com.yandex.passport.internal.util.q;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.w511;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020-H\u0016¢\u0006\u0004\b\u0014\u0010.J/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u00101J\u001f\u00102\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b4\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0018\u0010?\u001a\u00020\u001c*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/webview/ChallengeWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/yandex/passport/internal/ui/challenge/webview/k;", "params", "Lkotlin/Function1;", "Lcom/yandex/passport/internal/ui/challenge/webview/j;", "Lzy11;", "onEvent", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/ui/common/web/d;", "urlChecker", "<init>", "(Lcom/yandex/passport/internal/ui/challenge/webview/k;Ltls;Lcom/yandex/passport/internal/analytics/c0;Lcom/yandex/passport/internal/ui/common/web/d;)V", "Landroid/webkit/WebView;", "view", "", ErrorResponseData.JSON_ERROR_CODE, "", "url", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;)V", "Lcom/yandex/passport/common/url/b;", "Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;", "checkUrl-XvpcIDg", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;", "checkUrl", "currentUrl", "", "checkReturnUrl-XvpcIDg", "(Ljava/lang/String;)Z", "checkReturnUrl", "urlString", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Lcom/yandex/passport/internal/ui/challenge/webview/k;", "Ltls;", "Lcom/yandex/passport/internal/analytics/c0;", "Lcom/yandex/passport/internal/ui/common/web/d;", "lastUrl", "Ljava/lang/String;", "startUrl", "returnUrl", "isAllowed", "(Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;)Z", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeWebClient extends WebViewClient {
    public static final int $stable = 8;
    private final c0 eventReporter;
    private String lastUrl;
    private final tls onEvent;
    private final k params;
    private final String returnUrl;
    private final String startUrl;
    private final com.yandex.passport.internal.ui.common.web.d urlChecker;

    public ChallengeWebClient(k kVar, tls tlsVar, c0 c0Var, com.yandex.passport.internal.ui.common.web.d dVar) {
        this.params = kVar;
        this.onEvent = tlsVar;
        this.eventReporter = c0Var;
        this.urlChecker = dVar;
        this.startUrl = kVar.a;
        this.returnUrl = kVar.b;
    }

    /* renamed from: checkReturnUrl-XvpcIDg, reason: not valid java name */
    private final boolean m313checkReturnUrlXvpcIDg(String currentUrl) {
        return com.yandex.passport.common.url.b.g(this.returnUrl).equals(com.yandex.passport.common.url.b.g(currentUrl)) && jl40.l(com.yandex.passport.common.url.b.h(this.returnUrl), com.yandex.passport.common.url.b.h(currentUrl));
    }

    /* renamed from: checkUrl-XvpcIDg, reason: not valid java name */
    private final WebUrlChecker$Status m314checkUrlXvpcIDg(String url) {
        return this.urlChecker.a(url, this.startUrl);
    }

    private final boolean isAllowed(WebUrlChecker$Status webUrlChecker$Status) {
        return webUrlChecker$Status == WebUrlChecker$Status.ALLOWED;
    }

    private final void onReceivedError(WebView view, int errorCode, String url) {
        if (!jl40.l(url, this.lastUrl)) {
            this.eventReporter.m(errorCode, url);
            return;
        }
        if (-6 == errorCode || -2 == errorCode || -7 == errorCode || -8 == errorCode) {
            this.onEvent.invoke(new h(view.getContext().getString(R.string.passport_error_network)));
            this.eventReporter.l(errorCode, url);
        } else {
            this.onEvent.invoke(new h(view.getContext().getString(R.string.passport_reg_error_unknown)));
            this.eventReporter.k(new Throwable(oyr.k(errorCode, "errorCode=", " url=", url)));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        this.onEvent.invoke(f.a);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String urlString, Bitmap favicon) {
        super.onPageStarted(view, urlString, favicon);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Page started: ".concat(urlString), 8);
        }
        this.lastUrl = urlString;
        if (isAllowed(m314checkUrlXvpcIDg(urlString))) {
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
        this.onEvent.invoke(new h(view.getContext().getString(R.string.passport_login_ssl_error)));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String urlString) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "shouldOverrideUrlLoading: ".concat(urlString), 8);
        }
        this.lastUrl = urlString;
        if (o.a() && !((Pattern) q.a.getValue()).matcher(urlString).find()) {
            this.onEvent.invoke(new i(view.getContext().getString(R.string.passport_error_track_invalid)));
            return true;
        }
        if (!URLUtil.isNetworkUrl(urlString)) {
            this.onEvent.invoke(new e(urlString));
            return true;
        }
        if (m313checkReturnUrlXvpcIDg(urlString)) {
            this.onEvent.invoke(new g(urlString));
            return true;
        }
        int i = c.a[m314checkUrlXvpcIDg(urlString).ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                w511.b();
                return false;
            }
            this.onEvent.invoke(new e(urlString));
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        onReceivedError(view, errorCode, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        onReceivedError(view, error.getErrorCode(), request.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return shouldOverrideUrlLoading(view, request.getUrl().toString());
    }
}
