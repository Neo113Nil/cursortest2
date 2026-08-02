package com.yandex.plus.webview.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.webview.core.resource.WebViewNavigationReason;
import com.ybsdk.widgets.common.snackbar.SnackbarView;
import defpackage.b64;
import defpackage.byt0;
import defpackage.csd0;
import defpackage.dt20;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ly3;
import defpackage.pgz;
import defpackage.skd0;
import defpackage.so41;
import defpackage.srd0;
import defpackage.st41;
import defpackage.th40;
import defpackage.tls;
import defpackage.trd0;
import defpackage.ul60;
import defpackage.urd0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 H2\u00020\u0001:\u0001IB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0006\u0012 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\n*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\nH\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0017¢\u0006\u0004\b&\u0010(J!\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010*J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b\f\u0010-J\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010.J'\u00102\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00103J3\u00108\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\n2\b\u00107\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b8\u00109J'\u00108\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u00101\u001a\u00020:H\u0017¢\u0006\u0004\b8\u0010;J'\u0010=\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010>J'\u0010@\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\n2\u0006\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR.\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ER\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010FR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010G¨\u0006J"}, d2 = {"Lcom/yandex/plus/webview/core/PlusWebViewClient;", "Landroid/webkit/WebViewClient;", "Lpgz;", "logger", "Lso41;", "errorListener", "Lkotlin/Function1;", "Lsrd0;", "", "handleUrlLoading", "", "Lzy11;", "onPageStarted", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "Landroid/webkit/WebResourceResponse;", "interceptRequest", "Lkotlin/Function3;", "historyStateChangedCallback", "Lbyt0;", "sslErrorResolver", "keepHistory", "<init>", "(Lpgz;Lso41;Ltls;Ltls;Ltls;Ltls;Lzls;Lbyt0;Z)V", "request", "shouldOverrideUrlLoadingInternal", "(Lsrd0;)Z", "Landroid/webkit/WebView;", "view", "updateHistory", "(Landroid/webkit/WebView;)V", "Lurd0;", "toPlusWebResourceRequest", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebView;)Lurd0;", "Landroid/net/http/SslError;", "toDescription", "(Landroid/net/http/SslError;)Ljava/lang/String;", "url", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/graphics/Bitmap;", "favicon", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/SslErrorHandler;", "handler", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "Lpgz;", "Lso41;", "Ltls;", "Lzls;", "Lbyt0;", "Z", "Companion", "csd0", "homeless-core-webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PlusWebViewClient extends WebViewClient {
    public static final csd0 Companion = new csd0();
    private static final String TAG = "PlusWebViewClient";
    private final so41 errorListener;
    private final tls handleUrlLoading;
    private final zls historyStateChangedCallback;
    private final tls interceptRequest;
    private final boolean keepHistory;
    private final pgz logger;
    private final tls onPageFinished;
    private final tls onPageStarted;
    private final byt0 sslErrorResolver;

    public PlusWebViewClient(pgz pgzVar, so41 so41Var, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, zls zlsVar, byt0 byt0Var, boolean z) {
        this.logger = pgzVar;
        this.errorListener = so41Var;
        this.handleUrlLoading = tlsVar;
        this.onPageStarted = tlsVar2;
        this.onPageFinished = tlsVar3;
        this.interceptRequest = tlsVar4;
        this.historyStateChangedCallback = zlsVar;
        this.sslErrorResolver = byt0Var;
        this.keepHistory = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onReceivedSslError$lambda$5(WebView webView, SslError sslError, PlusWebViewClient plusWebViewClient, SslError sslError2) {
        boolean l = jl40.l(webView.getUrl(), sslError.getUrl());
        String url = webView.getUrl();
        String url2 = l ? null : sslError.getUrl();
        String description = plusWebViewClient.toDescription(sslError);
        pgz pgzVar = plusWebViewClient.logger;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            StringBuilder v = ly3.v("onReceivedSslError() isMainFrame=", ", mainFrameUrl=", url, ", resourceUrl=", l);
            v.append(url2);
            v.append(", errorCode=");
            v.append(sslError.getPrimaryError());
            v.append(", description=");
            v.append(description);
            pgzVar.a(logPriority, TAG, v.toString());
        }
        plusWebViewClient.errorListener.l(url, sslError.getPrimaryError(), url2, description, l);
        return zy11.a;
    }

    private final boolean shouldOverrideUrlLoadingInternal(srd0 request) {
        if (((Boolean) this.handleUrlLoading.invoke(request)).booleanValue()) {
            return true;
        }
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (!pgzVar.e(logPriority)) {
            return false;
        }
        pgzVar.a(logPriority, TAG, "shouldOverrideUrlLoading() just let webview load uri=" + request.a);
        return false;
    }

    private final String toDescription(SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        return primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "No description" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
    }

    private final urd0 toPlusWebResourceRequest(WebResourceRequest webResourceRequest, WebView webView) {
        WebViewNavigationReason webViewNavigationReason = webResourceRequest.isRedirect() ? WebViewNavigationReason.REDIRECT : webResourceRequest.hasGesture() ? WebViewNavigationReason.USER_ACTION : WebViewNavigationReason.OTHER;
        if (webResourceRequest.isForMainFrame()) {
            return new srd0(webResourceRequest.getUrl(), webResourceRequest.getRequestHeaders(), webViewNavigationReason);
        }
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        return new trd0(Uri.parse(url), webResourceRequest.getUrl(), webResourceRequest.getRequestHeaders(), webViewNavigationReason);
    }

    private final void updateHistory(WebView view) {
        if (!this.keepHistory) {
            view.clearHistory();
            return;
        }
        WebBackForwardList copyBackForwardList = view.copyBackForwardList();
        WebHistoryItem currentItem = copyBackForwardList.getCurrentItem();
        String url = currentItem != null ? currentItem.getUrl() : null;
        if (url == null) {
            url = "";
        }
        boolean z = copyBackForwardList.getCurrentIndex() > 0;
        WebHistoryItem currentItem2 = copyBackForwardList.getCurrentItem();
        this.historyStateChangedCallback.invoke(url, currentItem2 != null ? currentItem2.getTitle() : null, Boolean.valueOf(z));
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        updateHistory(view);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "onPageFinished() url=".concat(url));
        }
        this.onPageFinished.invoke(url);
        updateHistory(view);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "onPageStarted() url=".concat(url));
        }
        this.onPageStarted.invoke(url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        String str;
        String url = view.getUrl();
        String uri = request.isForMainFrame() ? null : request.getUrl().toString();
        StringBuilder sb = new StringBuilder("error=");
        StringBuilder sb2 = new StringBuilder("WebResourceError[errorCode=");
        sb2.append(error.getErrorCode());
        sb2.append(", error=");
        switch (error.getErrorCode()) {
            case SnackbarView.TRANSLATION_Y_START /* -16 */:
                str = "ERROR_UNSAFE_RESOURCE";
                break;
            case -15:
                str = "ERROR_TOO_MANY_REQUESTS";
                break;
            case -14:
                str = "ERROR_FILE_NOT_FOUND";
                break;
            case -13:
                str = "ERROR_FILE";
                break;
            case -12:
                str = "ERROR_BAD_URL";
                break;
            case AbstractLicense.LICENSE_NOT_FOUND /* -11 */:
                str = "ERROR_FAILED_SSL_HANDSHAKE";
                break;
            case AbstractLicense.LICENSE_ERROR /* -10 */:
                str = "ERROR_UNSUPPORTED_SCHEME";
                break;
            case -9:
                str = "ERROR_REDIRECT_LOOP";
                break;
            case -8:
                str = "ERROR_TIMEOUT";
                break;
            case -7:
                str = "ERROR_IO";
                break;
            case -6:
                str = "ERROR_CONNECT";
                break;
            case -5:
                str = "ERROR_PROXY_AUTHENTICATION";
                break;
            case -4:
                str = "ERROR_AUTHENTICATION";
                break;
            case -3:
                str = "ERROR_UNSUPPORTED_AUTH_SCHEME";
                break;
            case -2:
                str = "ERROR_HOST_LOOKUP";
                break;
            default:
                str = "ERROR_UNKNOWN";
                break;
        }
        sb2.append(str);
        sb2.append(']');
        sb.append(sb2.toString());
        sb.append(" original description=");
        sb.append((Object) error.getDescription());
        String sb3 = sb.toString();
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "onReceivedError() isMainFrame=" + request.isForMainFrame() + ", mainFrameUrl=" + url + ", resourceUrl=" + uri + ", errorCode=" + error.getErrorCode() + ", description=" + sb3);
        }
        this.errorListener.f(url, error.getErrorCode(), uri, sb3, request.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        String url = view.getUrl();
        String uri = request.isForMainFrame() ? null : request.getUrl().toString();
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "onReceivedHttpError() isMainFrame=" + request.isForMainFrame() + ", mainFrameUrl=" + url + ", resourceUrl=" + uri + ", errorCode=" + errorResponse.getStatusCode() + ", description=" + errorResponse.getReasonPhrase());
        }
        this.errorListener.r(url, errorResponse.getStatusCode(), uri, errorResponse.getReasonPhrase(), request.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        byt0 byt0Var = this.sslErrorResolver;
        th40 th40Var = new th40(18, view, error, this);
        ul60 ul60Var = (ul60) byt0Var;
        ul60Var.getClass();
        skd0.b(PlusLogTag.SDK, ul60Var.a + ".resolveSslError() error=" + error + "...");
        ((st41) ul60Var.c.getValue()).b(error, new dt20(ul60Var, error, handler, th40Var, 12));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse webResourceResponse;
        tls tlsVar = this.interceptRequest;
        return (tlsVar == null || (webResourceResponse = (WebResourceResponse) tlsVar.invoke(request)) == null) ? super.shouldInterceptRequest(view, request) : webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            StringBuilder sb = new StringBuilder("WebResourceRequest[url=");
            sb.append(request.getUrl());
            sb.append(", isForMainFrame=");
            sb.append(request.isForMainFrame());
            sb.append(Extension.FIX_SPACE);
            sb.append("isRedirect=" + request.isRedirect() + Extension.FIX_SPACE);
            sb.append("hasGesture=");
            sb.append(request.hasGesture());
            sb.append(", Method=");
            sb.append(request.getMethod());
            sb.append(']');
            pgzVar.a(logPriority, TAG, "shouldOverrideUrlLoading() request=".concat(sb.toString()));
        }
        urd0 plusWebResourceRequest = toPlusWebResourceRequest(request, view);
        srd0 srd0Var = plusWebResourceRequest instanceof srd0 ? (srd0) plusWebResourceRequest : null;
        if (srd0Var != null) {
            return shouldOverrideUrlLoadingInternal(srd0Var);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    @jxi
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "shouldOverrideUrlLoading() (Deprecated) url=".concat(url));
        }
        return shouldOverrideUrlLoadingInternal(new srd0(Uri.parse(url), null, WebViewNavigationReason.OTHER));
    }

    @Override // android.webkit.WebViewClient
    @jxi
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            StringBuilder u = b64.u(errorCode, "onReceivedError() (Deprecated) mainFrameUrl=", failingUrl, ", errorCode=", ", description=");
            u.append(description);
            pgzVar.a(logPriority, TAG, u.toString());
        }
        so41 so41Var = this.errorListener;
        if (description == null) {
            description = "";
        }
        so41Var.f(failingUrl, errorCode, null, description, true);
    }
}
