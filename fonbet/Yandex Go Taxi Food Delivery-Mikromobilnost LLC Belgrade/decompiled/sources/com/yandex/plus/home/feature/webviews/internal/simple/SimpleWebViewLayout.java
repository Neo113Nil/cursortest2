package com.yandex.plus.home.feature.webviews.internal.simple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.b64;
import defpackage.b931;
import defpackage.bb1;
import defpackage.e3o0;
import defpackage.emh0;
import defpackage.gfs0;
import defpackage.gje;
import defpackage.hfs0;
import defpackage.i3y;
import defpackage.ifs0;
import defpackage.jfs0;
import defpackage.kfs0;
import defpackage.kgx;
import defpackage.l8p;
import defpackage.lfs0;
import defpackage.lld0;
import defpackage.nfs0;
import defpackage.npu;
import defpackage.ny61;
import defpackage.ow31;
import defpackage.pzt0;
import defpackage.q4d0;
import defpackage.qgn0;
import defpackage.qoi0;
import defpackage.skd0;
import defpackage.tje;
import defpackage.tl91;
import defpackage.u1w;
import defpackage.ul60;
import defpackage.v9h0;
import defpackage.vg;
import defpackage.vvq0;
import defpackage.w511;
import defpackage.wu41;
import defpackage.wv5;
import defpackage.z2d0;
import defpackage.zsz0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010(\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\u001eH\u0016¢\u0006\u0004\b-\u0010 J\u000f\u0010.\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010 J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001eH\u0016¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u00020\u001eH\u0016¢\u0006\u0004\b3\u0010 J\u0017\u00104\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001eH\u0002¢\u0006\u0004\b6\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010:R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u001a\u0010A\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010DR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bP\u0010QR\u001b\u0010U\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010F\u001a\u0004\bT\u0010LR\u001b\u0010X\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010F\u001a\u0004\bW\u0010LR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010[\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010[\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/simple/SimpleWebViewLayout;", "Landroid/widget/FrameLayout;", "Lnfs0;", "Lgje;", "Landroid/content/Context;", "context", "Lcom/yandex/plus/home/feature/webviews/internal/simple/a;", "presenter", "Lvg;", "accessibilityFocusController", "Llld0;", "stringsResolver", "Lzsz0;", "options", "Lq4d0;", "toolbarConfigProvider", "Lz2d0;", "errorViewProvider", "Low31;", "viewVisibilityAnimator", "Lifs0;", "webViewControllerDelegateFactory", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "webViewsRouter", "Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;", "openFormat", "Lu1w;", "insets", "<init>", "(Landroid/content/Context;Lcom/yandex/plus/home/feature/webviews/internal/simple/a;Lvg;Llld0;Lzsz0;Lq4d0;Lz2d0;Low31;Lifs0;Lcom/yandex/plus/home/feature/webviews/internal/container/b;Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;Lu1w;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onResume", "onPause", "showLoading", "showWebViewContent", "", Constants.KEY_MESSAGE, "showError", "(Ljava/lang/String;)V", "showWebServiceInfo", "uriString", "loadUri", "reload", "clearHistory", "", "onBackPressed", "()Z", "onModalExpanded", "onModalHide", "applyInsets", "(Lu1w;)V", "updateToolbar", "Lcom/yandex/plus/home/feature/webviews/internal/simple/a;", "Lvg;", "Llld0;", "Lzsz0;", "Lq4d0;", "Lz2d0;", "Low31;", "Lifs0;", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "topSpacerView$delegate", "Lwv5;", "getTopSpacerView", "topSpacerView", "Landroid/view/ViewGroup;", "root$delegate", "getRoot", "()Landroid/view/ViewGroup;", "root", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "progressBarLayout$delegate", "getProgressBarLayout", "progressBarLayout", "errorLayout$delegate", "getErrorLayout", "errorLayout", "Lwu41;", "toolbarController$delegate", "Li3y;", "getToolbarController", "()Lwu41;", "toolbarController", "Lgfs0;", "eventListener", "Lgfs0;", "Lhfs0;", "webViewController$delegate", "getWebViewController", "()Lhfs0;", "webViewController", "Lnpu;", "errorViewController$delegate", "getErrorViewController", "()Lnpu;", "errorViewController", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleWebViewLayout extends FrameLayout implements nfs0, gje {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("topSpacerView", 0, "getTopSpacerView()Landroid/view/View;", SimpleWebViewLayout.class), b64.x(qoi0.a, SimpleWebViewLayout.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", SimpleWebViewLayout.class), new PropertyReference1Impl("progressBarLayout", 0, "getProgressBarLayout()Landroid/view/ViewGroup;", SimpleWebViewLayout.class), new PropertyReference1Impl("errorLayout", 0, "getErrorLayout()Landroid/view/ViewGroup;", SimpleWebViewLayout.class)};
    private final vg accessibilityFocusController;

    /* renamed from: errorLayout$delegate, reason: from kotlin metadata */
    private final wv5 errorLayout;

    /* renamed from: errorViewController$delegate, reason: from kotlin metadata */
    private final i3y errorViewController;
    private final z2d0 errorViewProvider;
    private final gfs0 eventListener;
    private final zsz0 options;
    private final a presenter;

    /* renamed from: progressBarLayout$delegate, reason: from kotlin metadata */
    private final wv5 progressBarLayout;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final wv5 root;
    private final lld0 stringsResolver;
    private final q4d0 toolbarConfigProvider;

    /* renamed from: toolbarController$delegate, reason: from kotlin metadata */
    private final i3y toolbarController;

    /* renamed from: topSpacerView$delegate, reason: from kotlin metadata */
    private final wv5 topSpacerView;
    private final View view;
    private final ow31 viewVisibilityAnimator;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final wv5 webViewContainer;

    /* renamed from: webViewController$delegate, reason: from kotlin metadata */
    private final i3y webViewController;
    private final ifs0 webViewControllerDelegateFactory;
    private final b webViewsRouter;

    public SimpleWebViewLayout(Context context, a aVar, vg vgVar, lld0 lld0Var, zsz0 zsz0Var, q4d0 q4d0Var, z2d0 z2d0Var, ow31 ow31Var, ifs0 ifs0Var, b bVar, Deeplink$WebViewFormat deeplink$WebViewFormat, u1w u1wVar) {
        super(context);
        int i;
        this.presenter = aVar;
        this.accessibilityFocusController = vgVar;
        this.stringsResolver = lld0Var;
        this.options = zsz0Var;
        this.errorViewProvider = z2d0Var;
        this.viewVisibilityAnimator = ow31Var;
        this.webViewControllerDelegateFactory = ifs0Var;
        this.webViewsRouter = bVar;
        this.view = this;
        this.topSpacerView = new wv5(new lfs0(this, v9h0.top_spacer_view, 0));
        int i2 = 1;
        this.root = new wv5(new lfs0(this, v9h0.plus_sdk_webview_simple_root, i2));
        int i3 = 2;
        this.webViewContainer = new wv5(new lfs0(this, v9h0.plus_simple_web_view_contracts_container, i3));
        int i4 = 3;
        this.progressBarLayout = new wv5(new lfs0(this, v9h0.progress_bar_layout, i4));
        this.errorLayout = new wv5(new lfs0(this, v9h0.error_layout, 4));
        this.toolbarController = kotlin.a.a(new jfs0(this, i2));
        this.eventListener = new qgn0(20, this);
        this.webViewController = kotlin.a.a(new jfs0(this, i3));
        this.errorViewController = kotlin.a.a(new jfs0(this, i4));
        int i5 = kfs0.a[deeplink$WebViewFormat.ordinal()];
        if (i5 == 1) {
            i = emh0.plus_sdk_webview_simple_full;
        } else {
            if (i5 != 2) {
                w511.b();
                throw null;
            }
            i = emh0.plus_sdk_webview_simple_card;
        }
        bb1.v(this, i, true);
        applyInsets(u1wVar);
        vgVar.b(getWebViewContainer().getWebView());
    }

    private final void applyInsets(u1w insets) {
        skd0.b(PlusLogTag.SDK, "SimpleWebViewLayout.applyInsets(" + insets + ')');
        View topSpacerView = getTopSpacerView();
        ViewGroup.LayoutParams layoutParams = topSpacerView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = insets.b;
        topSpacerView.setLayoutParams(layoutParams);
        ViewGroup root = getRoot();
        root.setPadding(insets.a, root.getPaddingTop(), insets.c, insets.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final npu errorViewController_delegate$lambda$4(SimpleWebViewLayout simpleWebViewLayout) {
        return new npu(simpleWebViewLayout.getErrorLayout(), simpleWebViewLayout.errorViewProvider, simpleWebViewLayout.viewVisibilityAnimator, new jfs0(simpleWebViewLayout, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 errorViewController_delegate$lambda$4$lambda$3(SimpleWebViewLayout simpleWebViewLayout) {
        a aVar = simpleWebViewLayout.presenter;
        boolean canGoBack = simpleWebViewLayout.getWebViewController().canGoBack();
        aVar.getClass();
        skd0.b(PlusLogTag.UI, "reloadUri() canGoBack=" + canGoBack);
        aVar.p.v();
        if (!canGoBack || aVar.v) {
            tje.N(aVar.e(), null, null, new SimpleWebViewLayoutPresenter$onReloadUriClick$1(aVar, null), 3);
        } else {
            ((nfs0) aVar.b).reload();
        }
        return zy11.a;
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.errorLayout.a($$delegatedProperties[4]);
    }

    private final npu getErrorViewController() {
        return (npu) this.errorViewController.getValue();
    }

    private final ViewGroup getProgressBarLayout() {
        return (ViewGroup) this.progressBarLayout.a($$delegatedProperties[3]);
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.a($$delegatedProperties[1]);
    }

    private final wu41 getToolbarController() {
        return (wu41) this.toolbarController.getValue();
    }

    private final View getTopSpacerView() {
        return (View) this.topSpacerView.a($$delegatedProperties[0]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[2]);
    }

    private final hfs0 getWebViewController() {
        return (hfs0) this.webViewController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showWebViewContent$lambda$5(SimpleWebViewLayout simpleWebViewLayout) {
        vg vgVar = simpleWebViewLayout.accessibilityFocusController;
        WebView webView = simpleWebViewLayout.getWebViewContainer().getWebView();
        vgVar.getClass();
        vg.a(webView);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wu41 toolbarController_delegate$lambda$0(SimpleWebViewLayout simpleWebViewLayout) {
        return new wu41((WebViewToolbar) simpleWebViewLayout.findViewById(v9h0.toolbar), simpleWebViewLayout.stringsResolver, simpleWebViewLayout.findViewById(v9h0.pull_out_line_icon), simpleWebViewLayout.options, new SimpleWebViewLayout$toolbarController$2$1(0, simpleWebViewLayout.webViewsRouter, b.class, "routeBack", "routeBack()Z", 8), new SimpleWebViewLayout$toolbarController$2$2(0, simpleWebViewLayout.webViewsRouter, b.class, "closeTopDeeplink", "closeTopDeeplink()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateToolbar() {
        getToolbarController().a(tl91.c(getWebViewController()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hfs0 webViewController_delegate$lambda$2(SimpleWebViewLayout simpleWebViewLayout) {
        ifs0 ifs0Var = simpleWebViewLayout.webViewControllerDelegateFactory;
        WebViewContainer webViewContainer = simpleWebViewLayout.getWebViewContainer();
        a aVar = simpleWebViewLayout.presenter;
        SimpleWebViewLayout$webViewController$2$1 simpleWebViewLayout$webViewController$2$1 = new SimpleWebViewLayout$webViewController$2$1(1, simpleWebViewLayout.presenter, a.class, "interceptRequest", "interceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", 0);
        SimpleWebViewLayout$webViewController$2$2 simpleWebViewLayout$webViewController$2$2 = new SimpleWebViewLayout$webViewController$2$2(1, simpleWebViewLayout.webViewsRouter, b.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0);
        SimpleWebViewLayout$webViewController$2$3 simpleWebViewLayout$webViewController$2$3 = new SimpleWebViewLayout$webViewController$2$3(2, simpleWebViewLayout.webViewsRouter, b.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0);
        SimpleWebViewLayout$webViewController$2$4 simpleWebViewLayout$webViewController$2$4 = new SimpleWebViewLayout$webViewController$2$4(2, simpleWebViewLayout.presenter, a.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0);
        SimpleWebViewLayout$webViewController$2$5 simpleWebViewLayout$webViewController$2$5 = new SimpleWebViewLayout$webViewController$2$5(1, simpleWebViewLayout.getToolbarController(), wu41.class, "update", "update(Lcom/yandex/plus/home/feature/webviews/internalapi/toolbar/WebViewToolbarData;)V", 0);
        ul60 ul60Var = simpleWebViewLayout.presenter.s;
        gfs0 gfs0Var = simpleWebViewLayout.eventListener;
        return new hfs0(ifs0Var.a, webViewContainer, aVar, simpleWebViewLayout$webViewController$2$2, simpleWebViewLayout$webViewController$2$3, simpleWebViewLayout$webViewController$2$1, simpleWebViewLayout$webViewController$2$4, new e3o0(19, simpleWebViewLayout), simpleWebViewLayout$webViewController$2$5, ul60Var, ifs0Var.f, ifs0Var.b, ifs0Var.d, ifs0Var.e, gfs0Var, ifs0Var.c, ifs0Var.g, ifs0Var.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 webViewController_delegate$lambda$2$lambda$1(SimpleWebViewLayout simpleWebViewLayout, WebView webView, String str) {
        a aVar = simpleWebViewLayout.presenter;
        if (aVar.v) {
            skd0.b(PlusLogTag.UI, "onPageFinished() url=" + str + ", errorOccured=true");
        } else {
            skd0.b(PlusLogTag.UI, "onPageFinished() url=".concat(str));
            pzt0 pzt0Var = aVar.w;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            aVar.m();
            if (!aVar.u) {
                aVar.u = true;
                aVar.q.a(aVar.g);
            }
        }
        return zy11.a;
    }

    @Override // defpackage.nfs0
    public void clearHistory() {
        skd0.e(PlusLogTag.UI, "clearHistory()");
        getWebViewController().clearHistory();
    }

    @Override // defpackage.gje
    public View getView() {
        return this.view;
    }

    @Override // defpackage.nfs0
    public void loadUri(String uriString) {
        skd0.e(PlusLogTag.UI, "loadUri() url=".concat(uriString));
        getWebViewController().loadUrl(uriString, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onAttachedToWindow()");
        a aVar = this.presenter;
        aVar.b(this);
        aVar.p.v();
        skd0.b(plusLogTag, "attachView()");
        tje.N(aVar.e(), null, null, new SimpleWebViewLayoutPresenter$attachView$1(aVar, null), 3);
        updateToolbar();
        getWebViewController().setAudioMuted(false);
    }

    @Override // defpackage.gje
    public boolean onBackPressed() {
        skd0.e(PlusLogTag.UI, "onBackPressed()");
        return getWebViewController().a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        skd0.e(PlusLogTag.UI, "onDetachedFromWindow()");
        this.presenter.d();
        getWebViewController().setAudioMuted(true);
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onHasStartedBeingOverlapped() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onHasStoppedBeingOverlapped() {
    }

    @Override // defpackage.gje
    public void onModalExpanded() {
        getTopSpacerView().setVisibility(0);
    }

    @Override // defpackage.gje
    public void onModalHide() {
        getTopSpacerView().setVisibility(4);
    }

    @Override // defpackage.gje
    public void onPause() {
        skd0.e(PlusLogTag.UI, "onPause()");
        getWebViewController().onPause();
        this.presenter.i();
        getWebViewController().setAudioMuted(true);
    }

    @Override // defpackage.gje
    public void onResume() {
        skd0.e(PlusLogTag.UI, "onResume()");
        getWebViewController().onResume();
        this.presenter.j();
        getWebViewController().setAudioMuted(false);
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onStart() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onStop() {
    }

    @Override // defpackage.nfs0
    public void reload() {
        skd0.b(PlusLogTag.UI, "reload()");
        getWebViewController().reload();
    }

    @Override // defpackage.nfs0
    public void showError(String message) {
        skd0.b(PlusLogTag.UI, "showError() message=".concat(message));
        getWebViewController().stopLoading();
        ((l8p) this.viewVisibilityAnimator).b(getWebViewContainer());
        ((l8p) this.viewVisibilityAnimator).b(getProgressBarLayout());
        getErrorViewController().b(getWebViewController().d(), true);
        wu41 toolbarController = getToolbarController();
        getWebViewController().d();
        boolean canGoBack = getWebViewController().canGoBack();
        String str = getToolbarController().f;
        WebViewToolbar webViewToolbar = toolbarController.a;
        if (webViewToolbar.getVisibility() == 0) {
            webViewToolbar.setTitle(str);
            zsz0 zsz0Var = toolbarController.c;
            if (zsz0Var.d && canGoBack) {
                webViewToolbar.showBackStartIcon();
                webViewToolbar.setOnStartIconClickListener(toolbarController.d);
            } else {
                webViewToolbar.hideStartIcon();
            }
            if (!zsz0Var.c) {
                webViewToolbar.hideEndIcon();
            } else {
                webViewToolbar.showCloseEndIcon();
                webViewToolbar.setOnEndIconClickListener(toolbarController.e);
            }
        }
    }

    @Override // defpackage.nfs0
    public void showLoading() {
        skd0.b(PlusLogTag.UI, "showLoading()");
        ((l8p) this.viewVisibilityAnimator).b(getWebViewContainer());
        ((l8p) this.viewVisibilityAnimator).c(new b931(13), getProgressBarLayout());
        getErrorViewController().a(true);
    }

    public void showWebServiceInfo(String message) {
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).s(new vvq0(getWebViewController().getUserAgentString(), message));
    }

    @Override // defpackage.nfs0
    public void showWebViewContent() {
        skd0.b(PlusLogTag.UI, "showWebViewContent()");
        ow31 ow31Var = this.viewVisibilityAnimator;
        l8p l8pVar = (l8p) ow31Var;
        l8pVar.c(new jfs0(this, 4), getWebViewContainer());
        ((l8p) this.viewVisibilityAnimator).b(getProgressBarLayout());
        getErrorViewController().a(true);
    }
}
