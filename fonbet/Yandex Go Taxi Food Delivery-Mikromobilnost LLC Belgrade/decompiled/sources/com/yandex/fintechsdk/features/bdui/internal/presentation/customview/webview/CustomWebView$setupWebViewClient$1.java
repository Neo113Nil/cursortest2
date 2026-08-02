package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.UrlMatch;
import defpackage.bvu0;
import defpackage.ci5;
import defpackage.cvu0;
import defpackage.d0e;
import defpackage.di5;
import defpackage.evu0;
import defpackage.fi5;
import defpackage.ilk;
import defpackage.jl40;
import defpackage.jo41;
import defpackage.klk;
import defpackage.kv8;
import defpackage.mwy;
import defpackage.oo41;
import defpackage.tl60;
import defpackage.vm41;
import defpackage.w511;
import defpackage.xl10;
import defpackage.ymf;
import defpackage.z22;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"com/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/CustomWebView$setupWebViewClient$1", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Lzy11;", "initializePostMessageInterfaces", "(Landroid/webkit/WebView;)V", "", "url", "Lklk;", "actionHandler", "handleLoadCompleteActions", "(Ljava/lang/String;Lklk;)V", "Lmwy;", "loadAction", "", "shouldHandleAction", "(Lmwy;Ljava/lang/String;)Z", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomWebView$setupWebViewClient$1 extends WebViewClient {
    final /* synthetic */ klk $actionHandler;
    final /* synthetic */ tl60 $nucSslErrorHandler;
    final /* synthetic */ CustomWebView this$0;

    public CustomWebView$setupWebViewClient$1(tl60 tl60Var, CustomWebView customWebView, klk klkVar) {
        this.$nucSslErrorHandler = tl60Var;
        this.this$0 = customWebView;
        this.$actionHandler = klkVar;
    }

    private final void handleLoadCompleteActions(String url, klk actionHandler) {
        jo41 jo41Var;
        List list;
        jo41Var = this.this$0.params;
        if (jo41Var == null || (list = jo41Var.h) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (shouldHandleAction((mwy) obj, url)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            actionHandler.handleAction(((mwy) it.next()).c);
        }
    }

    private final void initializePostMessageInterfaces(WebView view) {
        vm41 vm41Var;
        d0e d0eVar;
        if (view == null) {
            return;
        }
        vm41Var = this.this$0.config;
        vm41Var.getClass();
        d0eVar = this.this$0.configurablePostMessageInterface;
        if (d0eVar != null) {
            this.this$0.initPostMessageScript(view, d0eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageFinished$lambda$2(CustomWebView customWebView, String str, String str2) {
        vm41 vm41Var;
        Integer l = str2 != null ? bvu0.l(10, cvu0.v(str2, "\"", "", false)) : null;
        vm41Var = customWebView.config;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) vm41Var.a).a(new fi5(l, str));
    }

    private final boolean shouldHandleAction(mwy loadAction, String url) {
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
        String urlForLogging;
        jo41 jo41Var;
        vm41 vm41Var;
        vm41 vm41Var2;
        super.onPageFinished(view, url);
        urlForLogging = this.this$0.urlForLogging(url);
        initializePostMessageInterfaces(view);
        handleLoadCompleteActions(url, this.$actionHandler);
        jo41Var = this.this$0.params;
        int i = 0;
        if ((jo41Var != null ? jl40.l(jo41Var.f, Boolean.TRUE) : false) && view != null) {
            view.evaluateJavascript("document.documentElement.outerHTML.length", new ymf(urlForLogging, i, this.this$0));
        }
        vm41Var = this.this$0.config;
        vm41Var.getClass();
        vm41Var2 = this.this$0.config;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) vm41Var2.a).a(new di5(urlForLogging));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        this.this$0.notifyPageLoadStarted(this.$actionHandler, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Exception exc;
        jo41 jo41Var;
        String str;
        vm41 vm41Var;
        vm41 vm41Var2;
        String urlForLogging;
        jo41 jo41Var2;
        ilk ilkVar;
        jo41 jo41Var3;
        String obj;
        Uri url;
        super.onReceivedError(view, request, error);
        String uri = (request == null || (url = request.getUrl()) == null) ? null : url.toString();
        if (error != null) {
            CharSequence description = error.getDescription();
            if (description == null || (obj = description.toString()) == null) {
                obj = error.toString();
            }
            exc = new Exception(obj);
        } else {
            exc = new Exception("Unknown error");
        }
        CustomWebView customWebView = this.this$0;
        jo41Var = customWebView.params;
        boolean z = jo41Var != null ? jo41Var.c : false;
        oo41 oo41Var = new oo41(exc, uri);
        if (uri == null) {
            jo41Var3 = this.this$0.params;
            str = jo41Var3 != null ? jo41Var3.a : null;
            if (str == null) {
                str = "";
            }
        } else {
            str = uri;
        }
        customWebView.reportWebViewError(z, oo41Var, str);
        vm41Var = this.this$0.config;
        vm41Var.getClass();
        vm41Var2 = this.this$0.config;
        z22 z22Var = vm41Var2.a;
        urlForLogging = this.this$0.urlForLogging(uri);
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new ci5(exc, urlForLogging));
        jo41Var2 = this.this$0.params;
        if (jo41Var2 == null || (ilkVar = jo41Var2.g) == null) {
            return;
        }
        this.$actionHandler.handleAction(ilkVar);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        this.$nucSslErrorHandler.a.b(error, new xl10(new kv8(3, handler)));
    }
}
