package com.monetization.ads.base.webview;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.ak71;
import defpackage.aq71;
import defpackage.gp51;
import defpackage.hj61;
import defpackage.iw81;
import defpackage.jl40;
import defpackage.l071;
import defpackage.tj61;
import defpackage.tje;
import defpackage.uza;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import yads.be1;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001-B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&J+\u0010\u001f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020'H\u0017¢\u0006\u0004\b\u001f\u0010(J#\u0010+\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/monetization/ads/base/webview/HtmlWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/monetization/ads/base/webview/HtmlWebViewClientListener;", "webViewClientListener", "Lak71;", "webViewSslErrorHandler", "<init>", "(Lcom/monetization/ads/base/webview/HtmlWebViewClientListener;Lak71;)V", "Liw81;", "interceptor", "Lzy11;", "setWebResourceRequestInterceptor", "(Liw81;)V", "Landroid/webkit/WebView;", "view", "", "url", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "yads/yz0", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HtmlWebViewClient extends WebViewClient {
    private final HtmlWebViewClientListener a;
    private final ak71 b;
    private iw81 c;

    public HtmlWebViewClient(HtmlWebViewClientListener htmlWebViewClientListener, ak71 ak71Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(htmlWebViewClientListener, (i & 2) != 0 ? new aq71() : ak71Var);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        this.a.onPageFinished();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        this.a.onReceivedError(error.getErrorCode());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        ak71 ak71Var = this.b;
        Context context = view.getContext();
        ((aq71) ak71Var).getClass();
        if (aq71.a(context, error)) {
            handler.proceed();
        } else {
            this.a.onReceivedError(-11);
            super.onReceivedSslError(view, handler, error);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        return true;
    }

    public final void setWebResourceRequestInterceptor(iw81 interceptor) {
        this.c = interceptor;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        String str;
        iw81 iw81Var = this.c;
        if (iw81Var != null) {
            hj61 hj61Var = (hj61) iw81Var;
            Uri url = request.getUrl();
            WebResourceResponse webResourceResponse = null;
            if (jl40.l(url != null ? url.getLastPathSegment() : null, hj61Var.a)) {
                gp51 gp51Var = hj61Var.b;
                int i = gp51Var.a;
                Object obj = gp51Var.b;
                switch (i) {
                    case 6:
                        str = ((tj61) obj).d;
                        break;
                    default:
                        str = (String) tje.Y(EmptyCoroutineContext.a, new be1((l071) obj, null));
                        break;
                }
                if (str != null && str.length() != 0) {
                    webResourceResponse = new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(str.getBytes(uza.a)));
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        this.a.onOverrideUrlLoading(view.getContext(), url);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        this.a.onReceivedError(errorCode);
    }

    public HtmlWebViewClient(HtmlWebViewClientListener htmlWebViewClientListener) {
        this(htmlWebViewClientListener, null, 2, null);
    }

    public HtmlWebViewClient(HtmlWebViewClientListener htmlWebViewClientListener, ak71 ak71Var) {
        this.a = htmlWebViewClientListener;
        this.b = ak71Var;
    }
}
