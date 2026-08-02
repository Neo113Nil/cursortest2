package com.yandex.go.platform.ui;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.yandex.go.platform.di.InternalActivityComponent;
import com.yandex.go.platform.di.a;
import com.yandex.go.platform.di.d;
import com.yandex.go.platform.js_api.JsNativeApi;
import com.yandex.go.platform.ui.components.AnimationProgressView;
import com.yandex.go.platform.ui.components.LottieSplashView;
import com.yandex.go.platform.ui.components.SpinnerProgressView;
import defpackage.bkf0;
import defpackage.ci41;
import defpackage.h7o;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.o400;
import defpackage.p790;
import defpackage.pvn;
import defpackage.rjf0;
import defpackage.s6h0;
import defpackage.sjf0;
import defpackage.sjh;
import defpackage.sqt;
import defpackage.tje;
import defpackage.tjf0;
import defpackage.tse;
import defpackage.ujf0;
import defpackage.uyj;
import defpackage.vqt;
import defpackage.w511;
import defpackage.x3;
import defpackage.xuh0;
import defpackage.zh41;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/yandex/go/platform/ui/GoPlatformView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Lcom/yandex/go/platform/di/InternalActivityComponent;", "activityComponent", "<init>", "(Landroid/content/Context;Lcom/yandex/go/platform/di/InternalActivityComponent;)V", "Lzy11;", "attachWebPageLoadingListeners", "()V", "showSplashIfEnabled", "Landroid/webkit/WebView;", "webView", "attachJavascriptInterface", "(Landroid/webkit/WebView;)V", "Ltse;", "scope", "observeJsScripts", "(Ltse;Landroid/webkit/WebView;)V", "onAttachedToWindow", "", "processBackPress", "()Z", "Lsqt;", "params", "processParams", "(Lsqt;)V", "Lcom/yandex/go/platform/di/InternalActivityComponent;", "Lh7o;", "errorDialogWrapper", "Lh7o;", "Lcom/yandex/go/platform/di/d;", "viewComponent", "Lcom/yandex/go/platform/di/d;", "Lcom/yandex/go/platform/di/a;", "jsNativeComponent", "Lcom/yandex/go/platform/di/a;", "Landroid/view/ViewGroup;", "getRootLayout", "()Landroid/view/ViewGroup;", "rootLayout", "getErrorLayout", "errorLayout", "getLayoutWebView", "layoutWebView", "Lujf0;", "getProgressStateView", "()Lujf0;", "progressStateView", "Lcom/yandex/go/platform/ui/components/LottieSplashView;", "getLottieSplashView", "()Lcom/yandex/go/platform/ui/components/LottieSplashView;", "lottieSplashView", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoPlatformView extends FrameLayout {
    private final InternalActivityComponent activityComponent;
    private final h7o errorDialogWrapper;
    private a jsNativeComponent;
    private d viewComponent;

    public GoPlatformView(Context context, InternalActivityComponent internalActivityComponent) {
        super(context);
        this.activityComponent = internalActivityComponent;
        View.inflate(context, xuh0.layout_platform, this);
        showSplashIfEnabled();
        h7o h7oVar = new h7o(getErrorLayout());
        this.errorDialogWrapper = h7oVar;
        ViewGroup rootLayout = getRootLayout();
        ViewGroup layoutWebView = getLayoutWebView();
        ujf0 progressStateView = getProgressStateView();
        internalActivityComponent.getWebResourcesProvider();
        d dVar = new d(context, rootLayout, layoutWebView, progressStateView, h7oVar, internalActivityComponent, internalActivityComponent.getJsNativeApiAdditionalFunctions());
        this.viewComponent = dVar;
        this.jsNativeComponent = (a) dVar.q.getValue();
        d dVar2 = this.viewComponent;
        if (dVar2 != null) {
            WebView webView = dVar2.m;
            attachJavascriptInterface(webView);
            observeJsScripts(dVar2.e.getLifecycleScope(), webView);
        }
    }

    private final void attachJavascriptInterface(WebView webView) {
        JsNativeApi jsNativeApi;
        a aVar = this.jsNativeComponent;
        if (aVar == null || (jsNativeApi = (JsNativeApi) aVar.k.getValue()) == null) {
            return;
        }
        webView.addJavascriptInterface(jsNativeApi, "goPlatformNativeApi");
    }

    private final void attachWebPageLoadingListeners() {
        d dVar = this.viewComponent;
        if (dVar == null) {
            return;
        }
        zh41 zh41Var = dVar.h;
        JsNativeApi jsNativeApi = (JsNativeApi) ((a) dVar.q.getValue()).k.getValue();
        ArrayList arrayList = zh41Var.a;
        ArrayList arrayList2 = zh41Var.a;
        arrayList.add(jsNativeApi);
        arrayList2.add((bkf0) dVar.n.getValue());
        arrayList2.add(dVar.l);
        arrayList2.add((ci41) dVar.r.getValue());
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) findViewById(s6h0.layout_error);
    }

    private final ViewGroup getLayoutWebView() {
        return (ViewGroup) findViewById(s6h0.layout_web_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieSplashView getLottieSplashView() {
        View findViewById = findViewById(s6h0.custom_splash_view);
        this.activityComponent.getSplashAppData();
        return (LottieSplashView) findViewById;
    }

    private final ujf0 getProgressStateView() {
        int i = vqt.a[this.activityComponent.getInitialState().ordinal()];
        if (i == 1) {
            return new sjf0();
        }
        if (i == 2) {
            return new tjf0((SpinnerProgressView) findViewById(s6h0.progress_view));
        }
        if (i == 3) {
            return new rjf0((AnimationProgressView) findViewById(s6h0.animation_progress_view), (SpinnerProgressView) findViewById(s6h0.progress_view));
        }
        w511.b();
        return null;
    }

    private final ViewGroup getRootLayout() {
        return (ViewGroup) findViewById(s6h0.root_layout);
    }

    private final void observeJsScripts(tse scope, WebView webView) {
        this.activityComponent.getJsScriptRepository().getClass();
        jqr jqrVar = new jqr(pvn.a, new GoPlatformView$observeJsScripts$1(webView, null), 3);
        sjh sjhVar = uyj.a;
        e.H(scope, e.F(jqrVar, o400.a));
    }

    private final void showSplashIfEnabled() {
        this.activityComponent.getLottieSplashInteractor();
        getLottieSplashView().setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.viewComponent;
        if (dVar == null) {
            return;
        }
        attachWebPageLoadingListeners();
        tje.N(dVar.e.getLifecycleScope(), null, null, new GoPlatformView$onAttachedToWindow$1(dVar, null), 3);
    }

    public boolean processBackPress() {
        d dVar = this.viewComponent;
        if (dVar == null) {
            return false;
        }
        bkf0 bkf0Var = (bkf0) dVar.n.getValue();
        x3 x3Var = bkf0Var.c;
        if (x3Var instanceof p790) {
            return dVar.l.h();
        }
        bkf0Var.c = x3Var.Lg();
        return true;
    }

    public final void processParams(sqt params) {
        d dVar = this.viewComponent;
        if (dVar != null) {
            WebView webView = dVar.m;
            String str = dVar.j.a;
            try {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (Map.Entry entry : params.a.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                str = buildUpon.toString();
            } catch (Throwable th) {
                Log.e("GoPlatformParams", th.toString());
            }
            if (jl40.l(webView.getUrl(), str)) {
                return;
            }
            com.yandex.go.platform.web_view_client.a aVar = dVar.l;
            aVar.e();
            aVar.j = true;
            webView.loadUrl(str);
        }
    }
}
