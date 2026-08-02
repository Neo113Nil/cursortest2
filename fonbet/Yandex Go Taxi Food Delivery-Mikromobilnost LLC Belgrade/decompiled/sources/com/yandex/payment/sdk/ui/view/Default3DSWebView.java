package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.common.TrustedUrl;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;
import defpackage.a88;
import defpackage.apa1;
import defpackage.eg01;
import defpackage.eq41;
import defpackage.i3y;
import defpackage.j0g;
import defpackage.j4h;
import defpackage.jl40;
import defpackage.n5;
import defpackage.ofu;
import defpackage.ql60;
import defpackage.qv90;
import defpackage.rl60;
import defpackage.rwo;
import defpackage.slf;
import defpackage.st41;
import defpackage.sv90;
import defpackage.tlf;
import defpackage.wdz;
import defpackage.wj00;
import defpackage.y22;
import defpackage.y891;
import defpackage.ycc;
import defpackage.z78;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u001e\u0010 J-\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\nH\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u00020\u001a2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010B¨\u0006E"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/Default3DSWebView;", "Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lrwo;", "eventReporter", "(Landroid/content/Context;Lrwo;)V", "", "", "getHeaders", "()Ljava/util/Map;", "", "Lcom/yandex/payment/sdk/ui/common/TrustedUrl;", "trustedUrls", "Landroid/net/Uri;", "request", "getTrustedUrlInfo", "(Ljava/util/List;Landroid/net/Uri;)Ljava/util/List;", "trustedUrlInfo", "", "getTags", "(Ljava/util/List;)Ljava/util/Set;", "", "isDebug", "Lzy11;", "setDebug", "(Z)V", "url", "loadUrl", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/util/List;)V", "isRestoring", "(Ljava/lang/String;Ljava/util/List;Z)V", "La88;", "client", "setWebViewClient", "(La88;)V", "Lz78;", "getSettings", "()Lz78;", "", "obj", "interfaceName", "addJavascriptInterface", "(Ljava/lang/Object;Ljava/lang/String;)V", "destroy", "()V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onSslError", "(Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Lst41;", "externalWebViewSslErrorHandler$delegate", "Li3y;", "getExternalWebViewSslErrorHandler", "()Lst41;", "externalWebViewSslErrorHandler", "Z", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Ljava/util/List;", "Lrwo;", "Companion", "j4h", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Default3DSWebView extends Card3DSWebView {
    public static final j4h Companion = new j4h();
    private static final String PLATFORM_ANDROID = "Android";
    private static final String PLATFORM_HEADER_NAME = "X-YandexPaymentSDK-Platform";
    private static final String VERSION_HEADER_NAME = "X-YandexPaymentSDK-Version";
    private rwo eventReporter;

    /* renamed from: externalWebViewSslErrorHandler$delegate, reason: from kotlin metadata */
    private final i3y externalWebViewSslErrorHandler;
    private boolean isDebug;
    private List<TrustedUrl> trustedUrls;
    private WebView webView;

    public Default3DSWebView(Context context) {
        super(context);
        this.externalWebViewSslErrorHandler = a.a(new n5(context, 15));
        this.trustedUrls = EmptyList.a;
        WebView webView = new WebView(context);
        this.webView = webView;
        addView(webView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st41 externalWebViewSslErrorHandler_delegate$lambda$0(Context context) {
        return st41.a(context.getApplicationContext(), new rl60(context.getApplicationContext()), new ql60());
    }

    private final st41 getExternalWebViewSslErrorHandler() {
        return (st41) this.externalWebViewSslErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getHeaders() {
        return b.i(new Pair(VERSION_HEADER_NAME, "7.6.6"), new Pair(PLATFORM_HEADER_NAME, "Android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> getTags(List<TrustedUrl> trustedUrlInfo) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = trustedUrlInfo.iterator();
        while (it.hasNext()) {
            ycc.r(((TrustedUrl) it.next()).getTags(), arrayList);
        }
        return kotlin.collections.a.N0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TrustedUrl> getTrustedUrlInfo(List<TrustedUrl> trustedUrls, Uri request) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : trustedUrls) {
            Uri parse = Uri.parse(((TrustedUrl) obj).getUrl());
            if (jl40.l(parse.getScheme(), request.getScheme()) && jl40.l(parse.getHost(), request.getHost())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void addJavascriptInterface(Object obj, String interfaceName) {
        this.webView.addJavascriptInterface(obj, interfaceName);
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void destroy() {
        this.webView.destroy();
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public z78 getSettings() {
        this.webView.getSettings();
        return new wdz();
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void loadUrl(String url, List<TrustedUrl> trustedUrls, boolean isRestoring) {
        if (apa1.e(FeatureFlag.WEBVIEW_CACHE) && !isRestoring) {
            this.webView.clearCache(true);
        }
        this.trustedUrls = trustedUrls;
        boolean contains = getTags(getTrustedUrlInfo(trustedUrls, Uri.parse(url))).contains("version_header");
        WebView webView = this.webView;
        if (contains) {
            webView.loadUrl(url, getHeaders());
        } else {
            webView.loadUrl(url);
        }
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void onSslError(SslErrorHandler handler, SslError error) {
        getExternalWebViewSslErrorHandler().b(error, new j0g(handler, this));
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void setDebug(boolean isDebug) {
        this.isDebug = isDebug;
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void setWebViewClient(final a88 client) {
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(true);
        settings.setSupportMultipleWindows(true);
        if (apa1.e(FeatureFlag.WEBVIEW_CACHE)) {
            settings.setCacheMode(1);
        }
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.payment.sdk.ui.view.Default3DSWebView$setWebViewClient$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                rwo eventReporter;
                a88 a88Var = client;
                String b = ofu.b(url);
                WebViewFragment webViewFragment = (WebViewFragment) ((eg01) a88Var).a;
                eventReporter = webViewFragment.getEventReporter();
                sv90 sv90Var = qv90.a;
                WebViewTagForAnalytics loggingTag = webViewFragment.getLoggingTag();
                sv90Var.getClass();
                ((y22) eventReporter).a(sv90.D0(b, loggingTag));
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                rwo eventReporter;
                a88 a88Var = client;
                String b = ofu.b(url);
                WebViewFragment webViewFragment = (WebViewFragment) ((eg01) a88Var).a;
                eventReporter = webViewFragment.getEventReporter();
                sv90 sv90Var = qv90.a;
                WebViewTagForAnalytics loggingTag = webViewFragment.getLoggingTag();
                sv90Var.getClass();
                ((y22) eventReporter).a(sv90.E0(b, loggingTag));
                eq41 eq41Var = WebViewFragment.Companion;
                Bundle arguments = webViewFragment.getArguments();
                eq41Var.getClass();
                if (arguments != null && arguments.getBoolean("handle_deeplink") && ofu.a.contains(b)) {
                    webViewFragment.handleDeeplink(b);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                rwo eventReporter;
                if (request == null || !request.isForMainFrame() || errorResponse == null) {
                    return;
                }
                a88 a88Var = client;
                List list = ofu.a;
                String b = ofu.b(request.getUrl().toString());
                int statusCode = errorResponse.getStatusCode();
                WebViewFragment webViewFragment = (WebViewFragment) ((eg01) a88Var).a;
                eventReporter = webViewFragment.getEventReporter();
                sv90 sv90Var = qv90.a;
                String valueOf = String.valueOf(statusCode);
                WebViewTagForAnalytics loggingTag = webViewFragment.getLoggingTag();
                sv90Var.getClass();
                ((y22) eventReporter).a(sv90.B0(b, valueOf, loggingTag));
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                Default3DSWebView.this.onSslError(handler, error);
            }
        });
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.payment.sdk.ui.view.Default3DSWebView$setWebViewClient$3
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                rwo eventReporter;
                if (consoleMessage == null || consoleMessage.messageLevel().compareTo(ConsoleMessage.MessageLevel.ERROR) < 0) {
                    return false;
                }
                a88 a88Var = client;
                String message = consoleMessage.message();
                WebViewFragment webViewFragment = (WebViewFragment) ((eg01) a88Var).a;
                eventReporter = webViewFragment.getEventReporter();
                sv90 sv90Var = qv90.a;
                WebViewTagForAnalytics loggingTag = webViewFragment.getLoggingTag();
                sv90Var.getClass();
                ((y22) eventReporter).a(sv90.C0(message, loggingTag));
                return false;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView.HitTestResult hitTestResult;
                String extra;
                List list;
                List trustedUrlInfo;
                Set tags;
                rwo rwoVar;
                if (view != null && (hitTestResult = view.getHitTestResult()) != null && (extra = hitTestResult.getExtra()) != null) {
                    Default3DSWebView default3DSWebView = Default3DSWebView.this;
                    a88 a88Var = client;
                    Uri parse = Uri.parse(extra);
                    list = default3DSWebView.trustedUrls;
                    trustedUrlInfo = default3DSWebView.getTrustedUrlInfo(list, parse);
                    boolean isEmpty = trustedUrlInfo.isEmpty();
                    boolean z = !isEmpty;
                    tags = default3DSWebView.getTags(trustedUrlInfo);
                    rwoVar = default3DSWebView.eventReporter;
                    if (rwoVar != null) {
                        sv90 sv90Var = qv90.a;
                        String uri = parse.toString();
                        sv90Var.getClass();
                        wj00 wj00Var = new wj00(0);
                        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Попытка открыть url из webview в новой вкладке");
                        wj00Var.i("new_tab_trusted", z);
                        wj00Var.k("new_tab_url", uri);
                        ((y22) rwoVar).a(y891.c("open_new_tab_url", wj00Var));
                    }
                    if (!isEmpty && tags.contains("new_tab")) {
                        Map headers = tags.contains("version_header") ? default3DSWebView.getHeaders() : null;
                        eg01 eg01Var = (eg01) a88Var;
                        eg01Var.getClass();
                        tlf a = new slf().a();
                        if (headers != null) {
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : headers.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            a.a.putExtra("com.android.browser.headers", bundle);
                        }
                        a.a(((WebViewFragment) eg01Var.a).requireContext(), parse);
                    }
                }
                return true;
            }
        });
    }

    public Default3DSWebView(Context context, rwo rwoVar) {
        this(context);
        this.eventReporter = rwoVar;
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void loadUrl(String url) {
        loadUrl(url, EmptyList.a, false);
    }

    @Override // com.yandex.payment.sdk.ui.view.Card3DSWebView
    public void loadUrl(String url, List<TrustedUrl> trustedUrls) {
        loadUrl(url, trustedUrls, false);
    }
}
