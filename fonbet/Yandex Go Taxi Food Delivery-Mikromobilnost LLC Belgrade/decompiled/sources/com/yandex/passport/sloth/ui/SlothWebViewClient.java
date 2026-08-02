package com.yandex.passport.sloth.ui;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.sls;
import defpackage.st41;
import defpackage.tls;
import defpackage.uw51;
import defpackage.w511;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u0000 [2\u00020\u0001:\u0001\\BÉ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010 J\u0013\u0010/\u001a\u00020\u001a*\u00020.H\u0002¢\u0006\u0004\b/\u00100J)\u00105\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u00122\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u001a2\u0006\u00102\u001a\u0002012\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u0004\u0018\u00010$2\u0006\u00102\u001a\u0002012\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b;\u0010<J'\u0010A\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010+\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u00108\u001a\u0002072\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\b+\u0010DJ/\u0010+\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020)2\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010GJ'\u0010I\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u00108\u001a\u0002072\u0006\u0010H\u001a\u00020$H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020\u001a2\u0006\u00102\u001a\u0002012\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010VR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010WR\"\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010VR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010WR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010WR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010VR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010VR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/yandex/passport/sloth/ui/SlothWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/yandex/passport/sloth/data/c0;", "variant", "Lcom/yandex/passport/sloth/ui/l;", "reporter", "Lst41;", "webViewSslErrorHandler", "Lcom/yandex/passport/sloth/ui/f1;", "slothUrlChecker", "Lcom/yandex/passport/sloth/ui/j;", "cachedResourcesProvider", "Lkotlin/Function1;", "Lcom/yandex/passport/common/url/b;", "Lzy11;", "openExternalBrowser", "Lkotlin/Function0;", "closeSloth", "", "showFatalErrorDialog", "showProgress", "closeWithResultFinishLogin", "redirect", "showWebView", "Lcom/yandex/passport/sloth/ui/webview/f;", "onWebViewError", "", "canGoBackInWebView", "<init>", "(Lcom/yandex/passport/sloth/data/c0;Lcom/yandex/passport/sloth/ui/l;Lst41;Lcom/yandex/passport/sloth/ui/f1;Lcom/yandex/passport/sloth/ui/j;Ltls;Lsls;Ltls;Lsls;Lsls;Lsls;Lsls;Ltls;Ltls;)V", "url", "onInterceptUrl", "(Ljava/lang/String;)Z", "Landroid/content/res/AssetManager;", "assets", "cachedFile", "Landroid/webkit/WebResourceResponse;", "interceptRequest", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "getMimeType", "(Ljava/lang/String;)Ljava/lang/String;", "", ErrorResponseData.JSON_ERROR_CODE, "onReceivedError", "(ILjava/lang/String;)V", "forceShowYaTeam", "Lcom/yandex/passport/sloth/url/p;", "handle", "(Lcom/yandex/passport/sloth/url/p;)Z", "Landroid/webkit/WebView;", "view", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "response", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lcom/yandex/passport/sloth/data/c0;", "Lcom/yandex/passport/sloth/ui/l;", "Lst41;", "Lcom/yandex/passport/sloth/ui/f1;", "Lcom/yandex/passport/sloth/ui/j;", "Ltls;", "Lsls;", "", "fallbackMimeTypeMap", "Ljava/util/Map;", "Companion", "com/yandex/passport/sloth/ui/f2", "passport-sloth-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    private static final String AUTH_SDK_SCOPE = "https://oauth.yandex.ru/authorize";
    private static final String AUTH_SDK_SCOPE_TEST = "https://oauth-test.yandex.ru/authorize";
    public static final f2 Companion = new f2();
    private static final String PWL_YANGO_TEAM_AUTH_URL = "https://passport.yango-team.com/pwl/auth";
    private static final String PWL_YA_TEAM_AUTH_URL = "https://passport.yandex-team.ru/pwl/auth";
    private static final String YANGO_TEAM_AUTH_URL = "https://passport.yango-team.com/auth";
    private static final String YA_TEAM_AUTH_URL = "https://passport.yandex-team.ru/auth";
    private final j cachedResourcesProvider;
    private final tls canGoBackInWebView;
    private final sls closeSloth;
    private final sls closeWithResultFinishLogin;
    private final Map<String, String> fallbackMimeTypeMap = kotlin.collections.b.i(new Pair("js", "application/javascript"), new Pair("woff", "font/woff"), new Pair("woff2", "font/woff2"));
    private final tls onWebViewError;
    private final tls openExternalBrowser;
    private final sls redirect;
    private final l reporter;
    private final tls showFatalErrorDialog;
    private final sls showProgress;
    private final sls showWebView;
    private final f1 slothUrlChecker;
    private final com.yandex.passport.sloth.data.c0 variant;
    private final st41 webViewSslErrorHandler;

    public SlothWebViewClient(com.yandex.passport.sloth.data.c0 c0Var, l lVar, st41 st41Var, f1 f1Var, j jVar, tls tlsVar, sls slsVar, tls tlsVar2, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5, tls tlsVar3, tls tlsVar4) {
        this.variant = c0Var;
        this.reporter = lVar;
        this.webViewSslErrorHandler = st41Var;
        this.slothUrlChecker = f1Var;
        this.cachedResourcesProvider = jVar;
        this.openExternalBrowser = tlsVar;
        this.closeSloth = slsVar;
        this.showFatalErrorDialog = tlsVar2;
        this.showProgress = slsVar2;
        this.closeWithResultFinishLogin = slsVar3;
        this.redirect = slsVar4;
        this.showWebView = slsVar5;
        this.onWebViewError = tlsVar3;
        this.canGoBackInWebView = tlsVar4;
    }

    private final boolean forceShowYaTeam(String url) {
        return evu0.y(url, YA_TEAM_AUTH_URL, false) || evu0.y(url, PWL_YA_TEAM_AUTH_URL, false) || evu0.y(url, AUTH_SDK_SCOPE, false) || evu0.y(url, AUTH_SDK_SCOPE_TEST, false) || evu0.y(url, YANGO_TEAM_AUTH_URL, false) || evu0.y(url, PWL_YANGO_TEAM_AUTH_URL, false) || (this.variant instanceof com.yandex.passport.sloth.data.y);
    }

    private final String getMimeType(String url) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return mimeTypeFromExtension == null ? this.fallbackMimeTypeMap.get(fileExtensionFromUrl) : mimeTypeFromExtension;
    }

    private final boolean handle(com.yandex.passport.sloth.url.p pVar) {
        if (jl40.l(pVar, com.yandex.passport.sloth.url.k.a)) {
            return false;
        }
        if (jl40.l(pVar, com.yandex.passport.sloth.url.l.a)) {
            this.onWebViewError.invoke(com.yandex.passport.sloth.ui.webview.a.a);
            return true;
        }
        if (pVar instanceof com.yandex.passport.sloth.url.n) {
            this.redirect.invoke();
            return true;
        }
        if (pVar instanceof com.yandex.passport.sloth.url.m) {
            com.yandex.passport.sloth.url.m mVar = (com.yandex.passport.sloth.url.m) pVar;
            this.openExternalBrowser.invoke(new com.yandex.passport.common.url.b(mVar.a));
            if (mVar.b) {
                this.closeSloth.invoke();
            }
            return true;
        }
        if (jl40.l(pVar, com.yandex.passport.sloth.url.k.b)) {
            this.closeSloth.invoke();
            return true;
        }
        if (pVar instanceof com.yandex.passport.sloth.url.o) {
            this.showFatalErrorDialog.invoke(((com.yandex.passport.sloth.url.o) pVar).a);
            return true;
        }
        if (jl40.l(pVar, com.yandex.passport.sloth.url.k.d)) {
            this.showProgress.invoke();
            return true;
        }
        if (jl40.l(pVar, com.yandex.passport.sloth.url.k.c)) {
            this.closeWithResultFinishLogin.invoke();
            return true;
        }
        w511.b();
        return false;
    }

    private final WebResourceResponse interceptRequest(AssetManager assets, String cachedFile) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("Found cache in bundle: ", cachedFile, LogLevel.DEBUG, null, 8);
        }
        try {
            return new WebResourceResponse(getMimeType(cachedFile), "utf-8", 200, "OK", gw00.e(new Pair("Access-Control-Allow-Origin", "*")), assets.open(cachedFile));
        } catch (Exception unused) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                uw51.w("Error while loading cache from bundle: ", cachedFile, LogLevel.ERROR, null, 8);
            }
            return null;
        }
    }

    private final boolean onInterceptUrl(String url) {
        com.yandex.passport.sloth.url.p a = ((com.yandex.passport.sloth.b1) this.slothUrlChecker.a).a(url);
        if (a instanceof com.yandex.passport.sloth.url.l) {
            ((com.yandex.passport.internal.ui.sloth.f) this.reporter).a(new com.yandex.passport.sloth.n0(url, 1));
        }
        return handle(a);
    }

    private final void onReceivedError(int errorCode, String url) {
        if (-6 == errorCode || -2 == errorCode || -7 == errorCode) {
            this.onWebViewError.invoke(com.yandex.passport.sloth.ui.webview.b.a);
        } else {
            this.onWebViewError.invoke(new com.yandex.passport.sloth.ui.webview.d(errorCode, url));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        if (forceShowYaTeam(url)) {
            this.showWebView.invoke();
        }
        this.canGoBackInWebView.invoke(Boolean.valueOf(view.canGoBack()));
        super.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        if (onInterceptUrl(url)) {
            view.stopLoading();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse response) {
        Object dVar;
        if (request.isForMainFrame()) {
            tls tlsVar = this.onWebViewError;
            int statusCode = response.getStatusCode();
            if (400 <= statusCode && statusCode < 500) {
                dVar = com.yandex.passport.sloth.ui.webview.c.a;
            } else if (500 > statusCode || statusCode >= 600) {
                int statusCode2 = response.getStatusCode();
                Uri url = request.getUrl();
                com.yandex.passport.common.url.b.Companion.getClass();
                dVar = new com.yandex.passport.sloth.ui.webview.d(statusCode2, url.toString());
            } else {
                dVar = com.yandex.passport.sloth.ui.webview.c.b;
            }
            tlsVar.invoke(dVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceivedSslError, error=" + error, 8);
        }
        this.webViewSslErrorHandler.b(error, new androidx.core.app.d1(handler, view, error, this, 3));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        this.onWebViewError.invoke(com.yandex.passport.sloth.ui.webview.c.c);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse interceptRequest;
        String str = null;
        if (jl40.l(request.getMethod(), "GET")) {
            j jVar = this.cachedResourcesProvider;
            String uri = request.getUrl().toString();
            if (((com.yandex.passport.sloth.b1) jVar.a).b.A.a.getCommonWebProperties().getUseBundleCache()) {
                str = (String) com.yandex.passport.sloth.url.a.b.get(uri);
            }
        }
        return (str == null || (interceptRequest = interceptRequest(view.getContext().getAssets(), str)) == null) ? super.shouldInterceptRequest(view, request) : interceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if (request.isForMainFrame()) {
            return onInterceptUrl(request.getUrl().toString());
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        onReceivedError(errorCode, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        if (request.isForMainFrame()) {
            onReceivedError(error.getErrorCode(), request.getUrl().toString());
        }
    }
}
