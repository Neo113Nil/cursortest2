package com.yandex.passport.user_id.webview;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.yandex.passport.api.exception.PassportCommonWebException;
import com.yandex.passport.api.exception.PassportSslWebException;
import com.yandex.passport.api.exception.PassportUserIdConnectionException;
import com.yandex.passport.api.w2;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/passport/user_id/webview/WebViewClient;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function1;", "", "Lzy11;", "canGoBack", "Lcom/yandex/passport/api/b3;", "events", "<init>", "(Ltls;Ltls;)V", "Landroid/webkit/WebView;", "view", "", "url", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Ltls;", "passport-user-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewClient extends android.webkit.WebViewClient {
    public static final int $stable = 0;
    private final tls canGoBack;
    private final tls events;

    public WebViewClient(tls tlsVar, tls tlsVar2) {
        this.canGoBack = tlsVar;
        this.events = tlsVar2;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        this.canGoBack.invoke(Boolean.valueOf(view != null ? view.canGoBack() : false));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        int errorCode = error.getErrorCode();
        Uri url = request.getUrl();
        if (-6 == errorCode || -2 == errorCode || -7 == errorCode) {
            this.events.invoke(new w2(new PassportUserIdConnectionException()));
        } else {
            this.events.invoke(new w2(new PassportCommonWebException(errorCode, url.toString())));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        if (jl40.l(view.getUrl(), error.getUrl())) {
            handler.cancel();
            this.events.invoke(new w2(new PassportSslWebException(error.getUrl())));
        }
    }
}
