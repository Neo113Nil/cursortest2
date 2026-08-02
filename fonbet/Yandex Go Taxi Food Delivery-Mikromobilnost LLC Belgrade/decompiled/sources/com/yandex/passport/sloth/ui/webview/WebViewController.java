package com.yandex.passport.sloth.ui.webview;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.d1;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.data.c0;
import com.yandex.passport.sloth.data.y;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.o0;
import com.yandex.passport.sloth.ui.s0;
import com.yandex.passport.sloth.ui.t0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.sls;
import defpackage.st41;
import defpackage.tls;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.uza;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0084\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u001f\u0010\u001cJ!\u0010!\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b!\u0010\u001cJ\u001b\u0010#\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\"¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\"¢\u0006\u0004\b%\u0010$J\u0015\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0012¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0012¢\u0006\u0004\b+\u0010*J\u001f\u0010/\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0010H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0010H\u0007¢\u0006\u0004\b2\u00103J)\u00108\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u0010\u0011\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010@J'\u0010E\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010H\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020:2\u0006\u0010D\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ/\u0010H\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u0010J\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0010H\u0016¢\u0006\u0004\bH\u0010MJ'\u0010O\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020:2\u0006\u0010N\u001a\u00020>H\u0016¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0014¢\u0006\u0004\bS\u0010\u0018J\u0015\u0010U\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u0012¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u00142\u0006\u0010[\u001a\u000204H\u0002¢\u0006\u0004\b\\\u0010]J!\u0010a\u001a\u0004\u0018\u00010>2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020\u0010H\u0002¢\u0006\u0004\ba\u0010bJ#\u0010c\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00140\u0019H\u0003¢\u0006\u0004\bc\u0010\u001cJ\u001f\u0010H\u001a\u00020\u00142\u0006\u0010J\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010dJ\u000f\u0010e\u001a\u00020\u0014H\u0002¢\u0006\u0004\be\u0010\u0018J\u000f\u0010f\u001a\u00020\u0014H\u0002¢\u0006\u0004\bf\u0010\u0018J\u0017\u0010g\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0010H\u0002¢\u0006\u0004\bi\u0010jR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010kR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010lR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010mR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010nR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010oR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010pR$\u0010r\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010x\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bx\u0010*\"\u0004\bz\u0010VR\u0016\u0010{\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010yR$\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010}R$\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R$\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R!\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/yandex/passport/sloth/ui/webview/WebViewController;", "Landroid/webkit/WebViewClient;", "Lcom/yandex/passport/sloth/ui/webview/n;", "viewHolder", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/yandex/passport/sloth/ui/c1;", "reporter", "Lcom/yandex/passport/common/common/a;", "applicationDetailsProvider", "Lcom/yandex/passport/sloth/ui/dependencies/p;", "webViewSettings", "Lst41;", "webViewSslErrorHandler", "<init>", "(Lcom/yandex/passport/sloth/ui/webview/n;Landroidx/lifecycle/Lifecycle;Lcom/yandex/passport/sloth/ui/c1;Lcom/yandex/passport/common/common/a;Lcom/yandex/passport/sloth/ui/dependencies/p;Lst41;)V", "", "url", "", "isConnected", "Lzy11;", "load", "(Ljava/lang/String;Z)V", "reload", "()V", "Lkotlin/Function1;", "callback", "onInterceptUrl", "(Ltls;)V", "onInterceptRequest", "", "onProgress", "Lcom/yandex/passport/sloth/ui/webview/f;", "onError", "Lkotlin/Function0;", "onDestroy", "(Lsls;)V", "onCancel", "newProgress", "onProgressChanged", "(I)V", "onBackPressed", "()Z", "hasError", "", "obj", "interfaceName", "addJavascriptInterface", "(Ljava/lang/Object;Ljava/lang/String;)V", "script", "execJsAsync", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "response", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onJsApiReady", "blockOnLoading", "blockOnLoadingState", "(Z)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "webView", "destroyWebView", "(Landroid/webkit/WebView;)V", "Landroid/content/res/AssetManager;", "assets", "cachedFile", "interceptRequest", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "applyOnWebViewSafe", "(ILjava/lang/String;)V", "mayShowWebView", "showProgress", "forceShow", "(Ljava/lang/String;)Z", "userAgentAppInfo", "()Ljava/lang/String;", "Lcom/yandex/passport/sloth/ui/webview/n;", "Landroidx/lifecycle/Lifecycle;", "Lcom/yandex/passport/sloth/ui/c1;", "Lcom/yandex/passport/common/common/a;", "Lcom/yandex/passport/sloth/ui/dependencies/p;", "Lst41;", "Lcom/yandex/passport/sloth/data/c0;", "variant", "Lcom/yandex/passport/sloth/data/c0;", "getVariant", "()Lcom/yandex/passport/sloth/data/c0;", "setVariant", "(Lcom/yandex/passport/sloth/data/c0;)V", "isDestroyed", "Z", "setDestroyed", "webViewHasError", "onInterceptUrlCallback", "Ltls;", "onProgressCallback", "onErrorCallback", "onDestroyCallback", "Lsls;", "onCancelCallback", "Companion", "com/yandex/passport/sloth/ui/webview/k", "passport-sloth-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewController extends WebViewClient {
    public static final int $stable = 8;
    private static final String AUTH_SDK_SCOPE = "https://oauth.yandex.ru/authorize";
    private static final String AUTH_SDK_SCOPE_TEST = "https://oauth-test.yandex.ru/authorize";
    private static final String PWL_YANGO_TEAM_AUTH_URL = "https://passport.yango-team.com/pwl/auth";
    private static final String PWL_YA_TEAM_AUTH_URL = "https://passport.yandex-team.ru/pwl/auth";
    private static final String TESTING_YANGO_HOST = "https://passport-test.yango.com";
    private static final String YANGO_TEAM_AUTH_URL = "https://passport.yango-team.com/auth";
    private static final String YA_TEAM_AUTH_URL = "https://passport.yandex-team.ru/auth";
    private final com.yandex.passport.common.common.a applicationDetailsProvider;
    private boolean isDestroyed;
    private final Lifecycle lifecycle;
    private sls onCancelCallback;
    private sls onDestroyCallback;
    private tls onErrorCallback;
    private tls onInterceptRequest;
    private tls onInterceptUrlCallback;
    private tls onProgressCallback;
    private final c1 reporter;
    private c0 variant;
    private final n viewHolder;
    private boolean webViewHasError;
    private final com.yandex.passport.sloth.ui.dependencies.p webViewSettings;
    private final st41 webViewSslErrorHandler;
    public static final k Companion = new k();
    private static final String USER_AGENT_PASSPORT_INFO = com.yandex.passport.common.util.a.f("PassportSDK/7.55.1.755015154");
    private static final Map<String, String> fallbackMimeTypeMap = kotlin.collections.b.i(new Pair("js", "application/javascript"), new Pair("woff", "font/woff"), new Pair("woff2", "font/woff2"));

    public WebViewController(n nVar, Lifecycle lifecycle, c1 c1Var, com.yandex.passport.common.common.a aVar, com.yandex.passport.sloth.ui.dependencies.p pVar, st41 st41Var) {
        this.viewHolder = nVar;
        this.lifecycle = lifecycle;
        this.reporter = c1Var;
        this.applicationDetailsProvider = aVar;
        this.webViewSettings = pVar;
        this.webViewSslErrorHandler = st41Var;
        o0 o0Var = ((t0) nVar).a;
        WebView webView = o0Var.x;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(settings.getUserAgentString() + HexString.CHAR_SPACE + USER_AGENT_PASSPORT_INFO + HexString.CHAR_SPACE + userAgentAppInfo());
        webView.setClipToOutline(true);
        webView.setWebViewClient(this);
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.passport.sloth.ui.webview.WebViewController$1$2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                WebViewController.this.onProgressChanged(newProgress);
            }
        });
        CookieManager.getInstance().setAcceptThirdPartyCookies(o0Var.x, true);
        lifecycle.a(new j(this, webView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addJavascriptInterface$lambda$4(WebViewController webViewController, Object obj, String str, WebView webView) {
        ((t0) webViewController.viewHolder).a.x.addJavascriptInterface(obj, str);
        return zy11.a;
    }

    private final void applyOnWebViewSafe(final tls callback) {
        final WebView webView = ((t0) this.viewHolder).a.x;
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            webView.post(new Runnable() { // from class: com.yandex.passport.sloth.ui.webview.h
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewController.applyOnWebViewSafe$lambda$12$lambda$11(WebViewController.this, callback, webView);
                }
            });
        } else if (this.lifecycle.b() != Lifecycle.State.DESTROYED) {
            callback.invoke(webView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyOnWebViewSafe$lambda$12$lambda$11(WebViewController webViewController, tls tlsVar, WebView webView) {
        if (webViewController.lifecycle.b() != Lifecycle.State.DESTROYED) {
            tlsVar.invoke(webView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyWebView(WebView webView) {
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.setWebChromeClient(null);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("about:blank");
        webView.stopLoading();
        webView.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 execJsAsync$lambda$6(String str, WebView webView) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, unr0.l(')', "execJsAsync(", str), 8);
        }
        webView.evaluateJavascript(str, null);
        return zy11.a;
    }

    private final boolean forceShow(String url) {
        return evu0.y(url, YA_TEAM_AUTH_URL, false) || evu0.y(url, PWL_YA_TEAM_AUTH_URL, false) || evu0.y(url, AUTH_SDK_SCOPE, false) || evu0.y(url, AUTH_SDK_SCOPE_TEST, false) || evu0.y(url, YANGO_TEAM_AUTH_URL, false) || evu0.y(url, PWL_YANGO_TEAM_AUTH_URL, false) || evu0.y(url, TESTING_YANGO_HOST, false) || (this.variant instanceof y);
    }

    private final WebResourceResponse interceptRequest(AssetManager assets, String cachedFile) {
        String str;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("Found cache in bundle: ", cachedFile, LogLevel.DEBUG, null, 8);
        }
        try {
            Companion.getClass();
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(cachedFile);
            if (fileExtensionFromUrl != null) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = (String) fallbackMimeTypeMap.get(fileExtensionFromUrl);
                }
                str = mimeTypeFromExtension;
            } else {
                str = null;
            }
            return new WebResourceResponse(str, "utf-8", 200, "OK", gw00.e(new Pair("Access-Control-Allow-Origin", "*")), assets.open(cachedFile));
        } catch (Exception unused) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                uw51.w("Error while loading cache from bundle: ", cachedFile, LogLevel.ERROR, null, 8);
            }
            return null;
        }
    }

    private final void mayShowWebView() {
        if (this.webViewHasError) {
            return;
        }
        ((t0) this.viewHolder).b(s0.c);
    }

    private final void onReceivedError(int errorCode, String url) {
        this.webViewHasError = true;
        if (-6 == errorCode || -2 == errorCode || -7 == errorCode) {
            tls tlsVar = this.onErrorCallback;
            if (tlsVar != null) {
                tlsVar.invoke(b.a);
                return;
            }
            return;
        }
        tls tlsVar2 = this.onErrorCallback;
        if (tlsVar2 != null) {
            tlsVar2.invoke(new d(errorCode, url));
        }
    }

    private final void showProgress() {
        ((t0) this.viewHolder).b(s0.b);
    }

    private static final void showProgress$lambda$13(WebViewController webViewController, View view) {
        sls slsVar = webViewController.onCancelCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final String userAgentAppInfo() {
        return com.yandex.passport.common.util.a.f(((com.yandex.passport.internal.common.e) this.applicationDetailsProvider).a() + '/' + ((com.yandex.passport.internal.common.e) this.applicationDetailsProvider).b());
    }

    public final void addJavascriptInterface(final Object obj, final String interfaceName) {
        applyOnWebViewSafe(new tls() { // from class: com.yandex.passport.sloth.ui.webview.g
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                zy11 addJavascriptInterface$lambda$4;
                addJavascriptInterface$lambda$4 = WebViewController.addJavascriptInterface$lambda$4(WebViewController.this, obj, interfaceName, (WebView) obj2);
                return addJavascriptInterface$lambda$4;
            }
        });
    }

    public final void blockOnLoadingState(boolean blockOnLoading) {
        ((t0) this.viewHolder).e = blockOnLoading;
    }

    public final void execJsAsync(String script) {
        applyOnWebViewSafe(new com.yandex.passport.internal.ui.bouncer.chooser.f(script, 2));
    }

    public final c0 getVariant() {
        return this.variant;
    }

    /* renamed from: hasError, reason: from getter */
    public final boolean getWebViewHasError() {
        return this.webViewHasError;
    }

    /* renamed from: isDestroyed, reason: from getter */
    public final boolean getIsDestroyed() {
        return this.isDestroyed;
    }

    public final void load(String url, boolean isConnected) {
        if (isConnected) {
            showProgress();
        }
        String f0 = evu0.f0('?', evu0.d0(url, "https://localhost/", ""), "");
        boolean J = evu0.J(f0);
        n nVar = this.viewHolder;
        if (J) {
            ((t0) nVar).a.x.loadUrl(url, ((com.yandex.passport.internal.ui.sloth.n) this.webViewSettings).a);
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((t0) nVar).a.x.getContext().getAssets().open("webam/".concat(f0)), uza.a), 8192);
        try {
            String x0 = cma1.x0(bufferedReader);
            bufferedReader.close();
            ((t0) this.viewHolder).a.x.loadDataWithBaseURL(url, x0, "text/html", "UTF-8", "");
        } finally {
        }
    }

    public final boolean onBackPressed() {
        if (!((t0) this.viewHolder).a.x.canGoBack()) {
            return false;
        }
        ((t0) this.viewHolder).a.x.goBack();
        return true;
    }

    public final void onCancel(sls callback) {
        this.onCancelCallback = callback;
    }

    public final void onDestroy(sls callback) {
        this.onDestroyCallback = callback;
    }

    public final void onError(tls callback) {
        this.onErrorCallback = callback;
    }

    public final void onInterceptRequest(tls callback) {
        this.onInterceptRequest = callback;
    }

    public final void onInterceptUrl(tls callback) {
        this.onInterceptUrlCallback = callback;
    }

    public final void onJsApiReady() {
        mayShowWebView();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        if (forceShow(url)) {
            mayShowWebView();
        }
        super.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        this.webViewHasError = false;
        tls tlsVar = this.onInterceptUrlCallback;
        if (tlsVar == null || !((Boolean) tlsVar.invoke(url)).booleanValue()) {
            return;
        }
        view.stopLoading();
    }

    public final void onProgress(tls callback) {
        this.onProgressCallback = callback;
    }

    public final void onProgressChanged(int newProgress) {
        tls tlsVar;
        if (((t0) this.viewHolder).a.x.canGoBack() || (tlsVar = this.onProgressCallback) == null) {
            return;
        }
        tlsVar.invoke(Integer.valueOf(newProgress));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse response) {
        Object dVar;
        if (request.isForMainFrame()) {
            this.webViewHasError = true;
            tls tlsVar = this.onErrorCallback;
            if (tlsVar != null) {
                int statusCode = response.getStatusCode();
                if (400 <= statusCode && statusCode < 500) {
                    dVar = c.a;
                } else if (500 > statusCode || statusCode >= 600) {
                    int statusCode2 = response.getStatusCode();
                    Uri url = request.getUrl();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    dVar = new d(statusCode2, url.toString());
                } else {
                    dVar = c.b;
                }
                tlsVar.invoke(dVar);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceivedSslError, error=" + error, 8);
        }
        this.webViewSslErrorHandler.b(error, new d1(handler, view, error, this, 4));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        tls tlsVar = this.onErrorCallback;
        if (tlsVar == null) {
            return true;
        }
        tlsVar.invoke(c.c);
        return true;
    }

    public final void reload() {
        showProgress();
        ((t0) this.viewHolder).a.x.reload();
    }

    public final void setDestroyed(boolean z) {
        this.isDestroyed = z;
    }

    public final void setVariant(c0 c0Var) {
        this.variant = c0Var;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse interceptRequest;
        tls tlsVar;
        String str = null;
        if (jl40.l(request.getMethod(), "GET") && (tlsVar = this.onInterceptRequest) != null) {
            str = (String) tlsVar.invoke(request.getUrl().toString());
        }
        return (str == null || (interceptRequest = interceptRequest(view.getContext().getAssets(), str)) == null) ? super.shouldInterceptRequest(view, request) : interceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        tls tlsVar;
        return request.isForMainFrame() && (tlsVar = this.onInterceptUrlCallback) != null && ((Boolean) tlsVar.invoke(request.getUrl().toString())).booleanValue();
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
