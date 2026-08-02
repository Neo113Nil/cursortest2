package com.yandex.go.payments.cards.ui;

import android.app.Activity;
import android.content.Context;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.a98;
import defpackage.dcp0;
import defpackage.e6h0;
import defpackage.g18;
import defpackage.jj91;
import defpackage.jl40;
import defpackage.luh0;
import defpackage.nm7;
import defpackage.o88;
import defpackage.ql60;
import defpackage.rk6;
import defpackage.rl60;
import defpackage.rp31;
import defpackage.sk7;
import defpackage.st41;
import defpackage.tje;
import defpackage.u32;
import defpackage.u88;
import defpackage.wjh;
import defpackage.z88;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/yandex/go/payments/cards/ui/Card3dsViewImpl;", "Lcom/yandex/go/payments/cards/ui/Card3dsView;", "Landroid/content/Context;", "context", "Lu88;", "card3DsStepData", "Lo88;", "router", "Lu32;", "analytics", "Ldcp0;", "screenCaptureProtector", "<init>", "(Landroid/content/Context;Lu88;Lo88;Lu32;Ldcp0;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lzy11;", "resume", "()V", "pause", "", "onDismiss", "()Z", "isLoadingError", "onAttachedToWindow", "onDetachedFromWindow", "Ldcp0;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Lz88;", "viewHolder", "Lz88;", "Lg18;", "insetsPaddingsCancellable", "Lg18;", "com/yandex/go/payments/cards/ui/b", "WebView3DSClient", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Card3dsViewImpl extends Card3dsView {
    public static final int $stable = 8;
    private final g18 insetsPaddingsCancellable;
    private final dcp0 screenCaptureProtector;
    private final z88 viewHolder;
    private final WebView webView;

    public Card3dsViewImpl(Context context, u88 u88Var, o88 o88Var, u32 u32Var, dcp0 dcp0Var) {
        super(context);
        this.screenCaptureProtector = dcp0Var;
        ru.yandex.taxi.design.utils.c.q(this, luh0.card_3ds_view, true);
        setOrientation(1);
        int i = e6h0.webview;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.webView = (WebView) ((View) rp31.d(this, i));
        this.viewHolder = new z88(new b(this), (View) rp31.d(this, e6h0.progress_group), (View) rp31.d(this, e6h0.webview_error_group), u88Var, o88Var, u32Var);
        this.insetsPaddingsCancellable = tje.k(80, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        return jj91.b(getContext());
    }

    @Override // com.yandex.go.payments.cards.ui.Card3dsView
    public boolean isLoadingError() {
        String str = this.viewHolder.h;
        return str != null && str.length() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wjh wjhVar = (wjh) this.screenCaptureProtector;
        wjhVar.getClass();
        wjh.b.add(this);
        wjhVar.a.getWindow().setFlags(8192, 8192);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.insetsPaddingsCancellable.cancel();
        ((wjh) this.screenCaptureProtector).a(this);
    }

    @Override // com.yandex.go.payments.cards.ui.Card3dsView
    public boolean onDismiss() {
        z88 z88Var = this.viewHolder;
        Card3dsViewImpl card3dsViewImpl = z88Var.a.a;
        boolean canGoBack = card3dsViewImpl.webView.canGoBack();
        u32 u32Var = z88Var.f;
        if (!canGoBack) {
            u32Var.k();
            return false;
        }
        u32Var.f();
        card3dsViewImpl.webView.goBack();
        return true;
    }

    @Override // com.yandex.go.payments.cards.ui.Card3dsView
    public void pause() {
        this.viewHolder.g.setOnClickListener(null);
    }

    @Override // com.yandex.go.payments.cards.ui.Card3dsView
    public void resume() {
        z88 z88Var = this.viewHolder;
        nm7 nm7Var = z88Var.j;
        if (nm7Var != null) {
            nm7Var.run();
        }
        z88Var.j = null;
        ru.yandex.taxi.design.utils.c.z(new rk6(16, z88Var), z88Var.g);
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010)J%\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b,\u0010\u0014R\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yandex/go/payments/cards/ui/Card3dsViewImpl$WebView3DSClient;", "Landroid/webkit/WebViewClient;", "Lcom/yandex/go/payments/cards/ui/b;", "Lcom/yandex/go/payments/cards/ui/Card3dsViewImpl;", "facade", "La98;", "facadeClient", "<init>", "(Lcom/yandex/go/payments/cards/ui/Card3dsViewImpl;Lcom/yandex/go/payments/cards/ui/b;La98;)V", "Lst41;", "getDomesticSslErrorHandler", "()Lst41;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "Lzy11;", "handleSslErrorNormally", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "", "url", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "onError", "(ILjava/lang/String;Ljava/lang/String;)V", "onReceivedSslError", "Lcom/yandex/go/payments/cards/ui/b;", "La98;", "domesticSslErrorHandler", "Lst41;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class WebView3DSClient extends WebViewClient {
        private st41 domesticSslErrorHandler;
        private final b facade;
        private final a98 facadeClient;

        public WebView3DSClient(b bVar, a98 a98Var) {
            this.facade = bVar;
            this.facadeClient = a98Var;
        }

        private final st41 getDomesticSslErrorHandler() {
            Activity activity = Card3dsViewImpl.this.getActivity();
            if (this.domesticSslErrorHandler == null && activity != null) {
                this.domesticSslErrorHandler = st41.a(activity.getApplicationContext(), new rl60(activity.getApplicationContext()), new ql60());
            }
            return this.domesticSslErrorHandler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleSslErrorNormally(WebView view, SslErrorHandler handler, SslError error) {
            super.onReceivedSslError(view, handler, error);
        }

        public final void onError(int errorCode, String description, String failingUrl) {
            sk7 sk7Var = (sk7) this.facadeClient;
            u32 u32Var = (u32) sk7Var.c;
            sk7.g(failingUrl);
            u32Var.g(errorCode, description);
            z88 z88Var = (z88) sk7Var.w;
            z88Var.h = failingUrl;
            z88Var.i = errorCode;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            sk7 sk7Var = (sk7) this.facadeClient;
            z88 z88Var = (z88) sk7Var.w;
            z88Var.b.setVisibility(8);
            if (jl40.l(url, z88Var.h)) {
                z88Var.c.setVisibility(0);
                return;
            }
            z88Var.h = null;
            z88Var.i = 200;
            u32 u32Var = (u32) sk7Var.c;
            sk7.g(url);
            u32Var.getClass();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            if (request.isForMainFrame()) {
                onError(error.getErrorCode(), error.getDescription().toString(), request.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            super.onReceivedHttpError(view, request, errorResponse);
            if (request.isForMainFrame()) {
                onError(errorResponse.getStatusCode(), errorResponse.getReasonPhrase(), request.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            st41 domesticSslErrorHandler = getDomesticSslErrorHandler();
            if (domesticSslErrorHandler == null) {
                handleSslErrorNormally(view, handler, error);
            } else {
                domesticSslErrorHandler.b(error, new a(this, view, handler, error));
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            sk7 sk7Var = (sk7) this.facadeClient;
            sk7Var.getClass();
            if (url == null || url.length() == 0 || !url.equalsIgnoreCase((String) sk7Var.b)) {
                return false;
            }
            ((z88) sk7Var.w).a();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            onError(errorCode, description, failingUrl);
        }
    }
}
