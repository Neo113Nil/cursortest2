package com.yandex.payment.sdk.flex.impl.customview.views.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.evu0;
import defpackage.hlk;
import defpackage.i3y;
import defpackage.io41;
import defpackage.jl40;
import defpackage.jlk;
import defpackage.kir;
import defpackage.kxy;
import defpackage.lir;
import defpackage.lwy;
import defpackage.n5;
import defpackage.ny61;
import defpackage.ql60;
import defpackage.rl60;
import defpackage.slf;
import defpackage.st41;
import defpackage.tcc;
import defpackage.tlf;
import defpackage.vmf;
import defpackage.w511;
import defpackage.yzh;
import defpackage.zmf;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 12\u00020\u0001:\u00012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ%\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/webview/CustomWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Llir;", "eventReporter", "Lio41;", "params", "<init>", "(Landroid/content/Context;Llir;Lio41;)V", "Lzy11;", "configureWebViewSettings", "()V", "loadInitialUrl", "Ljlk;", "actionHandler", "setupWebViewClient", "(Ljlk;)V", "setupWebChromeClient", "", "url", "", "tags", "setUrl", "(Ljava/lang/String;Ljava/util/List;)V", "", "getHeaders", "()Ljava/util/Map;", "Landroid/net/Uri;", "headers", "openInChromeTab", "(Landroid/net/Uri;Ljava/util/Map;)V", "origin", "sanitizeSensitiveUrl", "(Ljava/lang/String;)Ljava/lang/String;", "eventName", "", "httpCode", "reportWebViewEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "bind", "Llir;", "Lio41;", "Lst41;", "externalWebViewSslErrorHandler$delegate", "Li3y;", "getExternalWebViewSslErrorHandler", "()Lst41;", "externalWebViewSslErrorHandler", "Companion", "vmf", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomWebView extends WebView {
    public static final vmf Companion = new vmf();
    private static final String NEW_TAB = "new_tab";
    private static final String PLATFORM_ANDROID = "Android";
    private static final String PLATFORM_HEADER_NAME = "X-YandexPaymentSDK-Platform";
    private static final String VERSION_HEADER = "version_header";
    private static final String VERSION_HEADER_NAME = "X-YandexPaymentSDK-Version";
    private final lir eventReporter;

    /* renamed from: externalWebViewSslErrorHandler$delegate, reason: from kotlin metadata */
    private final i3y externalWebViewSslErrorHandler;
    private final io41 params;

    public CustomWebView(Context context, lir lirVar, io41 io41Var) {
        super(context);
        this.eventReporter = lirVar;
        this.params = io41Var;
        this.externalWebViewSslErrorHandler = kotlin.a.a(new n5(context, 13));
    }

    private final void configureWebViewSettings() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(true);
        settings.setSupportMultipleWindows(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st41 externalWebViewSslErrorHandler_delegate$lambda$0(Context context) {
        return st41.a(context.getApplicationContext(), new rl60(context.getApplicationContext()), new ql60());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final st41 getExternalWebViewSslErrorHandler() {
        return (st41) this.externalWebViewSslErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getHeaders() {
        return b.i(new Pair(VERSION_HEADER_NAME, "7.6.6"), new Pair(PLATFORM_HEADER_NAME, "Android"));
    }

    private final void loadInitialUrl() {
        String str;
        io41 io41Var = this.params;
        if (io41Var == null || (str = io41Var.a) == null) {
            ny61.r("Failed to load URL");
            return;
        }
        List<String> list = io41Var.e;
        if (list == null) {
            list = EmptyList.a;
        }
        setUrl(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openInChromeTab(Uri url, Map<String, String> headers) {
        tlf a = new slf().a();
        if (headers != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            a.a.putExtra("com.android.browser.headers", bundle);
        }
        a.a(getContext(), url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportWebViewEvent(String eventName, String url, Integer httpCode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url != null) {
            linkedHashMap.put("url", sanitizeSensitiveUrl(url));
        }
        if (httpCode != null) {
            linkedHashMap.put("http_code", String.valueOf(httpCode.intValue()));
        }
        this.eventReporter.a(new kir(eventName, linkedHashMap));
    }

    public static /* synthetic */ void reportWebViewEvent$default(CustomWebView customWebView, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        customWebView.reportWebViewEvent(str, str2, num);
    }

    private final String sanitizeSensitiveUrl(String origin) {
        List list;
        String str;
        if (origin == null) {
            return "null";
        }
        try {
            URL url = new URL(origin);
            if (url.getPort() == -1) {
                str = "";
            } else {
                str = ":" + url.getPort();
            }
            return url.getProtocol() + "://" + url.getHost() + str + "/...";
        } catch (MalformedURLException unused) {
            io41 io41Var = this.params;
            if (io41Var == null || (list = io41Var.d) == null) {
                return "malformed url is hidden";
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kxy) it.next()).a);
            }
            return arrayList.contains(origin) ? origin : "malformed url is hidden";
        }
    }

    private final void setUrl(String url, List<String> tags) {
        if (tags.contains(VERSION_HEADER)) {
            loadUrl(url, getHeaders());
        } else {
            loadUrl(url);
        }
    }

    private final void setupWebChromeClient() {
        setWebChromeClient(new WebChromeClient() { // from class: com.yandex.payment.sdk.flex.impl.customview.views.webview.CustomWebView$setupWebChromeClient$1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage == null || consoleMessage.messageLevel().compareTo(ConsoleMessage.MessageLevel.ERROR) < 0) {
                    return false;
                }
                CustomWebView customWebView = CustomWebView.this;
                CustomWebView.reportWebViewEvent$default(customWebView, "web_view_javascript_error", customWebView.getUrl(), null, 4, null);
                return false;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView.HitTestResult hitTestResult;
                String extra;
                io41 io41Var;
                if (view == null || (hitTestResult = view.getHitTestResult()) == null || (extra = hitTestResult.getExtra()) == null) {
                    return true;
                }
                CustomWebView customWebView = CustomWebView.this;
                Uri parse = Uri.parse(extra);
                io41Var = customWebView.params;
                List list = io41Var != null ? io41Var.e : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                CustomWebView.reportWebViewEvent$default(customWebView, "web_view_new_tab", parse.toString(), null, 4, null);
                if (!list.contains("new_tab")) {
                    return true;
                }
                customWebView.openInChromeTab(parse, list.contains("version_header") ? customWebView.getHeaders() : null);
                return true;
            }
        });
    }

    private final void setupWebViewClient(final jlk actionHandler) {
        setWebViewClient(new WebViewClient() { // from class: com.yandex.payment.sdk.flex.impl.customview.views.webview.CustomWebView$setupWebViewClient$1
            private final void handleLoadCompleteActions(String url, jlk actionHandler2) {
                io41 io41Var;
                List list;
                CustomWebView.reportWebViewEvent$default(CustomWebView.this, "web_view_load_finished", url, null, 4, null);
                io41Var = CustomWebView.this.params;
                if (io41Var == null || (list = io41Var.c) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (shouldHandleAction((lwy) obj, url)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((yzh) actionHandler2).n(((lwy) it.next()).c);
                }
            }

            private final void handleLoadStartActions(String url, jlk actionHandler2) {
                io41 io41Var;
                List list;
                CustomWebView.reportWebViewEvent$default(CustomWebView.this, "web_view_load_started", url, null, 4, null);
                io41Var = CustomWebView.this.params;
                if (io41Var == null || (list = io41Var.d) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (jl40.l(((kxy) obj).a, url)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((yzh) actionHandler2).n(((kxy) it.next()).b);
                }
            }

            private final boolean shouldHandleAction(lwy loadAction, String url) {
                UrlMatch urlMatch = loadAction.b;
                String str = loadAction.a;
                int i = a.a[urlMatch.ordinal()];
                if (i == 1) {
                    return url != null && evu0.y(url, str, false);
                }
                if (i == 2) {
                    return jl40.l(str, url);
                }
                w511.b();
                return false;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                handleLoadCompleteActions(url, actionHandler);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                handleLoadStartActions(url, actionHandler);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                io41 io41Var;
                hlk hlkVar;
                super.onReceivedError(view, request, error);
                CustomWebView.reportWebViewEvent$default(CustomWebView.this, "web_view_error", null, error != null ? Integer.valueOf(error.getErrorCode()) : null, 2, null);
                io41Var = CustomWebView.this.params;
                if (io41Var == null || (hlkVar = io41Var.b) == null) {
                    return;
                }
                ((yzh) actionHandler).n(hlkVar);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                CustomWebView customWebView = CustomWebView.this;
                customWebView.reportWebViewEvent("web_view_error", customWebView.getUrl(), errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                st41 externalWebViewSslErrorHandler;
                CustomWebView.reportWebViewEvent$default(CustomWebView.this, "web_view_ssl_error", null, null, 6, null);
                externalWebViewSslErrorHandler = CustomWebView.this.getExternalWebViewSslErrorHandler();
                externalWebViewSslErrorHandler.b(error, new zmf(handler));
            }
        });
    }

    public final void bind(jlk actionHandler) {
        configureWebViewSettings();
        setupWebViewClient(actionHandler);
        setupWebChromeClient();
        loadInitialUrl();
    }
}
