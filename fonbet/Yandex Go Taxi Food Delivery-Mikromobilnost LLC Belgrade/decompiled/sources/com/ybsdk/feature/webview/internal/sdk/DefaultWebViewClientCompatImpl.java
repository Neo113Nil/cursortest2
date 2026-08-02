package com.ybsdk.feature.webview.internal.sdk;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import defpackage.boh;
import defpackage.qj41;
import defpackage.qnh;
import defpackage.ti51;
import defpackage.ui51;
import defpackage.vi51;
import defpackage.wi51;
import defpackage.xi51;
import defpackage.yi51;
import defpackage.zch;
import defpackage.zgf;
import defpackage.zmf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0003567B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\b\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\fJ\u0013\u0010\b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0013\u0010\b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\b\u0010\u0012J\u0013\u0010\b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\b\u0010\u0015J-\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b'\u0010&J+\u0010)\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010(\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J'\u0010,\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J'\u0010/\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J-\u00102\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u00101\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104¨\u00068"}, d2 = {"Lcom/ybsdk/feature/webview/internal/sdk/DefaultWebViewClientCompatImpl;", "Landroidx/webkit/WebViewClientCompat;", "Lyi51;", "client", "<init>", "(Lyi51;)V", "Landroid/webkit/WebResourceRequest;", "Lwi51;", "toInternal", "(Landroid/webkit/WebResourceRequest;)Lwi51;", "Landroid/webkit/WebResourceResponse;", "Lxi51;", "(Landroid/webkit/WebResourceResponse;)Lxi51;", "Lqj41;", "Lvi51;", "(Lqj41;)Lvi51;", "Landroid/webkit/SslErrorHandler;", "Lui51;", "(Landroid/webkit/SslErrorHandler;)Lui51;", "Landroid/net/http/SslError;", "Lti51;", "(Landroid/net/http/SslError;)Lti51;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "Lzy11;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "request", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "onPageCommitVisible", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onPageFinished", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Lqj41;)V", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "handler", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Lyi51;", "qnh", "zch", "zgf", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DefaultWebViewClientCompatImpl extends WebViewClientCompat {
    private final yi51 client;

    public DefaultWebViewClientCompatImpl(yi51 yi51Var) {
        this.client = yi51Var;
    }

    private final xi51 toInternal(WebResourceResponse webResourceResponse) {
        return new zgf(22, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        this.client.d();
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView view, String url) {
        this.client.g(new boh(view), url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        this.client.onPageFinished(url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        this.client.e(view != null ? new boh(view) : null, url);
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(WebView view, WebResourceRequest request, qj41 error) {
        this.client.c(toInternal(request), toInternal(error));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        this.client.h(toInternal(request), toInternal(errorResponse));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        this.client.f(view != null ? new boh(view) : null, handler != null ? toInternal(handler) : null, error != null ? toInternal(error) : null);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        this.client.j(request != null ? toInternal(request) : null);
        return super.shouldInterceptRequest(view, request);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return this.client.i(new boh(view), toInternal(request));
    }

    private final wi51 toInternal(WebResourceRequest webResourceRequest) {
        return new zch(webResourceRequest);
    }

    private final vi51 toInternal(qj41 qj41Var) {
        return new qnh(qj41Var);
    }

    private final ui51 toInternal(SslErrorHandler sslErrorHandler) {
        return new zmf(sslErrorHandler);
    }

    private final ti51 toInternal(SslError sslError) {
        return new zch(sslError);
    }
}
