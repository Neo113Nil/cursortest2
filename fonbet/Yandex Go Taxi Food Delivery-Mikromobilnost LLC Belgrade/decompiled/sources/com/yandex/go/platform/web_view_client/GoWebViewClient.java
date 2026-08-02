package com.yandex.go.platform.web_view_client;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.ci41;
import defpackage.gw00;
import defpackage.i32;
import defpackage.j790;
import defpackage.jl40;
import defpackage.l790;
import defpackage.n790;
import defpackage.pj41;
import defpackage.ql60;
import defpackage.rl60;
import defpackage.sj41;
import defpackage.ss2;
import defpackage.st41;
import defpackage.wjm;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J'\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J)\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010'\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J#\u00107\u001a\u0004\u0018\u0001032\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u00108J#\u00107\u001a\u0004\u0018\u0001032\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u00109J\u001f\u0010;\u001a\u00020:2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010;\u001a\u00020:2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010=J'\u0010>\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b>\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010AR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/yandex/go/platform/web_view_client/GoWebViewClient;", "Landroid/webkit/WebViewClient;", "Lci41;", "loadingListener", "Lss2;", "appCredentials", "", "Lpj41;", "urlHandlers", "Lsj41;", "webResourcesProvider", "Li32;", "analytics", "<init>", "(Lci41;Lss2;Ljava/util/List;Lsj41;Li32;)V", "", "getWebViewLoadTime", "()Ljava/lang/Long;", "Landroid/webkit/WebResourceRequest;", "request", "", ErrorResponseData.JSON_ERROR_MESSAGE, "", "httpErrorCode", "Lzy11;", "onError", "(Landroid/webkit/WebResourceRequest;Ljava/lang/String;Ljava/lang/Integer;)V", "url", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/content/Context;", "context", "Lst41;", "getDomesticSslErrorHandler", "(Landroid/content/Context;)Lst41;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "handleSslErrorNormally", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "onReceivedSslError", "Lci41;", "Lss2;", "Ljava/util/List;", "Lsj41;", "Li32;", "webViewLoadTime", "Ljava/lang/Long;", "domesticSslErrorHandler", "Lst41;", "getMainUrl", "()Ljava/lang/String;", "mainUrl", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoWebViewClient extends WebViewClient {
    private final i32 analytics;
    private final ss2 appCredentials;
    private st41 domesticSslErrorHandler;
    private final ci41 loadingListener;
    private final List<pj41> urlHandlers;
    private final sj41 webResourcesProvider;
    private Long webViewLoadTime;

    /* JADX WARN: Multi-variable type inference failed */
    public GoWebViewClient(ci41 ci41Var, ss2 ss2Var, List<? extends pj41> list, sj41 sj41Var, i32 i32Var) {
        Pair pair;
        this.loadingListener = ci41Var;
        this.appCredentials = ss2Var;
        this.urlHandlers = list;
        this.analytics = i32Var;
        Long l = i32Var.c.a;
        if (l != null) {
            pair = new Pair("timesinceapplaunch", String.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
        } else {
            pair = null;
        }
        if (pair == null) {
            return;
        }
        i32Var.a("web_view_startup", gw00.e(pair));
    }

    private final st41 getDomesticSslErrorHandler(Context context) {
        if (this.domesticSslErrorHandler == null && context != null) {
            this.domesticSslErrorHandler = st41.a(context.getApplicationContext(), new rl60(context.getApplicationContext()), new ql60());
        }
        return this.domesticSslErrorHandler;
    }

    private final String getMainUrl() {
        return this.appCredentials.a;
    }

    private final Long getWebViewLoadTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.webViewLoadTime;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        this.webViewLoadTime = null;
        return Long.valueOf(elapsedRealtime - longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSslErrorNormally(WebView view, SslErrorHandler handler, SslError error) {
        super.onReceivedSslError(view, handler, error);
    }

    private final void onError(WebResourceRequest request, String errorMessage, Integer httpErrorCode) {
        if (request.isForMainFrame()) {
            onError(request.getUrl().toString(), httpErrorCode);
        }
        this.analytics.a("web_view_loading_error", b.i(new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, request.getUrl()), new Pair("error_msg", errorMessage), new Pair("timesincewebviewloading", getWebViewLoadTime())));
    }

    public static /* synthetic */ void onError$default(GoWebViewClient goWebViewClient, WebResourceRequest webResourceRequest, String str, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        goWebViewClient.onError(webResourceRequest, str, num);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        this.loadingListener.onPageFinished(url);
        this.analytics.a("web_view_loading_finished", b.i(new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, url), new Pair("timesincewebviewloading", getWebViewLoadTime())));
        super.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        this.webViewLoadTime = Long.valueOf(SystemClock.elapsedRealtime());
        this.loadingListener.onPageStarted(url);
        super.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        onError$default(this, request, error.getDescription().toString(), null, 4, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        onError(request, errorResponse.getReasonPhrase(), Integer.valueOf(errorResponse.getStatusCode()));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        st41 domesticSslErrorHandler;
        try {
            domesticSslErrorHandler = getDomesticSslErrorHandler(view.getContext());
        } catch (Throwable unused) {
        }
        try {
            if (domesticSslErrorHandler == null) {
                throw new Exception("Domestic ssl handler not found");
            }
            domesticSslErrorHandler.b(error, new wjm(handler, this, view, error, 14));
        } catch (Throwable unused2) {
            handleSslErrorNormally(view, handler, error);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Uri parse = Uri.parse(url);
        List<pj41> list = this.urlHandlers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (jl40.l(((pj41) it.next()).a(parse), Boolean.TRUE)) {
                    return true;
                }
            }
        }
        return super.shouldOverrideUrlLoading(view, url);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return super.shouldInterceptRequest(view, url);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if (request.isForMainFrame()) {
            List<pj41> list = this.urlHandlers;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((pj41) it.next()).c(request)) {
                        return true;
                    }
                }
            }
        }
        return super.shouldOverrideUrlLoading(view, request);
    }

    private final void onError(String url, Integer httpErrorCode) {
        n790 j790Var;
        if (!jl40.l(url, getMainUrl()) && url != null) {
            j790Var = new l790(Uri.parse(url), httpErrorCode);
        } else {
            j790Var = new j790(httpErrorCode);
        }
        this.loadingListener.b(j790Var);
    }
}
