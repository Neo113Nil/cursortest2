package com.yandex.plus.home.feature.webviews.internal.smart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.amd0;
import defpackage.asd0;
import defpackage.b64;
import defpackage.b931;
import defpackage.bb1;
import defpackage.bmd0;
import defpackage.cov;
import defpackage.emh0;
import defpackage.fov;
import defpackage.gje;
import defpackage.gov;
import defpackage.gsd0;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.k7d0;
import defpackage.kd5;
import defpackage.kgx;
import defpackage.l8p;
import defpackage.lld0;
import defpackage.npu;
import defpackage.ny61;
import defpackage.ow31;
import defpackage.q4d0;
import defpackage.qoi0;
import defpackage.rlv;
import defpackage.sgs;
import defpackage.skd0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tl91;
import defpackage.tzs0;
import defpackage.u1w;
import defpackage.ulv;
import defpackage.uzs0;
import defpackage.v9h0;
import defpackage.vg;
import defpackage.vvq0;
import defpackage.w511;
import defpackage.wu41;
import defpackage.wv5;
import defpackage.yld0;
import defpackage.z2d0;
import defpackage.zld0;
import defpackage.zsz0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bq\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010\"J\u0017\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010*J\u0017\u0010-\u001a\u00020 2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b-\u00100J\u000f\u00101\u001a\u00020 H\u0014¢\u0006\u0004\b1\u0010\"J\u000f\u00102\u001a\u00020 H\u0014¢\u0006\u0004\b2\u0010\"J\u000f\u00103\u001a\u00020 H\u0016¢\u0006\u0004\b3\u0010\"J\u000f\u00104\u001a\u00020 H\u0016¢\u0006\u0004\b4\u0010\"J\u000f\u00105\u001a\u00020 H\u0016¢\u0006\u0004\b5\u0010\"J\u000f\u00106\u001a\u00020 H\u0016¢\u0006\u0004\b6\u0010\"J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J%\u0010>\u001a\u00020 2\u0006\u0010:\u001a\u00020'2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b@\u0010*J\u0017\u0010C\u001a\u00020 2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bE\u0010\"J\u000f\u0010F\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010\"J\u001f\u0010G\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020 H\u0002¢\u0006\u0004\bI\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010MR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010OR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010PR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010QR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010RR\u001a\u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010WR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010dR\u001b\u0010h\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010Y\u001a\u0004\bg\u0010dR\u001b\u0010n\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010k\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010k\u001a\u0004\by\u0010z¨\u0006|"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/smart/PlusSmartWebView;", "Landroid/widget/LinearLayout;", "Lgje;", "Lasd0;", "Landroid/content/Context;", "context", "Lyld0;", "presenter", "Lvg;", "accessibilityFocusController", "Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;", "openFormat", "Llld0;", "stringsResolver", "Lzsz0;", "toolbarOptions", "Lq4d0;", "toolbarConfigProvider", "Lz2d0;", "errorViewProvider", "Low31;", "viewVisibilityAnimator", "Lu1w;", "insets", "Lsgs;", "frontendInsets", "Luzs0;", "smartWebViewControllerDelegateFactory", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "webViewsRouter", "<init>", "(Landroid/content/Context;Lyld0;Lvg;Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;Llld0;Lzsz0;Lq4d0;Lz2d0;Low31;Lu1w;Lsgs;Luzs0;Lcom/yandex/plus/home/feature/webviews/internal/container/b;)V", "Lzy11;", "showContent", "()V", "onHasStartedBeingOverlapped", "onHasStoppedBeingOverlapped", "onModalExpanded", "onModalHide", "", Constants.KEY_MESSAGE, "showError", "(Ljava/lang/String;)V", "dismiss", "jsonMessage", "sendMessage", "Lgov;", "inMessage", "(Lgov;)V", "onAttachedToWindow", "onDetachedFromWindow", "onStart", "onResume", "onStop", "onPause", "", "onBackPressed", "()Z", "url", "", "Lcom/yandex/plus/home/feature/webviews/internal/network/a;", "headers", "openUrl", "(Ljava/lang/String;Ljava/util/List;)V", "showWebServiceInfo", "", "vibrateConstant", "performVibrate", "(I)V", "hideLoading", "showLoadingProcess", "applyInsets", "(Lu1w;Lsgs;)V", "updateToolbar", "Lyld0;", "Lvg;", "Llld0;", "Lzsz0;", "Lq4d0;", "Lz2d0;", "Low31;", "Luzs0;", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "topSpacerView$delegate", "Lwv5;", "getTopSpacerView", "topSpacerView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Landroid/view/ViewGroup;", "progressBarLayout$delegate", "getProgressBarLayout", "()Landroid/view/ViewGroup;", "progressBarLayout", "errorLayout$delegate", "getErrorLayout", "errorLayout", "Lwu41;", "toolbarController$delegate", "Li3y;", "getToolbarController", "()Lwu41;", "toolbarController", "Lnpu;", "errorViewController$delegate", "getErrorViewController", "()Lnpu;", "errorViewController", "com/yandex/plus/home/feature/webviews/internal/smart/c", "commonWebViewContractEventListener", "Lcom/yandex/plus/home/feature/webviews/internal/smart/c;", "Ltzs0;", "webViewController$delegate", "getWebViewController", "()Ltzs0;", "webViewController", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusSmartWebView extends LinearLayout implements gje, asd0 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("topSpacerView", 0, "getTopSpacerView()Landroid/view/View;", PlusSmartWebView.class), b64.x(qoi0.a, PlusSmartWebView.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new PropertyReference1Impl("progressBarLayout", 0, "getProgressBarLayout()Landroid/view/ViewGroup;", PlusSmartWebView.class), new PropertyReference1Impl("errorLayout", 0, "getErrorLayout()Landroid/view/ViewGroup;", PlusSmartWebView.class)};
    private final vg accessibilityFocusController;
    private final c commonWebViewContractEventListener;

    /* renamed from: errorLayout$delegate, reason: from kotlin metadata */
    private final wv5 errorLayout;

    /* renamed from: errorViewController$delegate, reason: from kotlin metadata */
    private final i3y errorViewController;
    private final z2d0 errorViewProvider;
    private final yld0 presenter;

    /* renamed from: progressBarLayout$delegate, reason: from kotlin metadata */
    private final wv5 progressBarLayout;
    private final uzs0 smartWebViewControllerDelegateFactory;
    private final lld0 stringsResolver;
    private final q4d0 toolbarConfigProvider;

    /* renamed from: toolbarController$delegate, reason: from kotlin metadata */
    private final i3y toolbarController;
    private final zsz0 toolbarOptions;

    /* renamed from: topSpacerView$delegate, reason: from kotlin metadata */
    private final wv5 topSpacerView;
    private final View view;
    private final ow31 viewVisibilityAnimator;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final wv5 webViewContainer;

    /* renamed from: webViewController$delegate, reason: from kotlin metadata */
    private final i3y webViewController;
    private final com.yandex.plus.home.feature.webviews.internal.container.b webViewsRouter;

    public PlusSmartWebView(Context context, yld0 yld0Var, vg vgVar, Deeplink$WebViewFormat deeplink$WebViewFormat, lld0 lld0Var, zsz0 zsz0Var, q4d0 q4d0Var, z2d0 z2d0Var, ow31 ow31Var, u1w u1wVar, sgs sgsVar, uzs0 uzs0Var, com.yandex.plus.home.feature.webviews.internal.container.b bVar) {
        super(context);
        int i;
        this.presenter = yld0Var;
        this.accessibilityFocusController = vgVar;
        this.stringsResolver = lld0Var;
        this.toolbarOptions = zsz0Var;
        this.errorViewProvider = z2d0Var;
        this.viewVisibilityAnimator = ow31Var;
        this.smartWebViewControllerDelegateFactory = uzs0Var;
        this.webViewsRouter = bVar;
        this.view = this;
        this.topSpacerView = new wv5(new bmd0(this, v9h0.top_spacer_view, 0));
        int i2 = 1;
        this.webViewContainer = new wv5(new bmd0(this, v9h0.plus_smart_web_view_contracts_container, i2));
        int i3 = 2;
        this.progressBarLayout = new wv5(new bmd0(this, v9h0.progress_bar_layout, i3));
        int i4 = 3;
        this.errorLayout = new wv5(new bmd0(this, v9h0.error_layout, i4));
        this.toolbarController = kotlin.a.a(new zld0(this, i2));
        this.errorViewController = kotlin.a.a(new zld0(this, i3));
        this.commonWebViewContractEventListener = new c(this);
        this.webViewController = kotlin.a.a(new zld0(this, i4));
        int i5 = amd0.a[deeplink$WebViewFormat.ordinal()];
        if (i5 == 1) {
            i = emh0.plus_sdk_web_view_smart_full;
        } else {
            if (i5 != 2) {
                w511.b();
                throw null;
            }
            i = emh0.plus_sdk_web_view_smart_card;
        }
        bb1.v(this, i, true);
        setOrientation(1);
        applyInsets(u1wVar, sgsVar);
        vgVar.b(getWebViewContainer().getWebView());
    }

    private final void applyInsets(u1w insets, sgs frontendInsets) {
        skd0.b(PlusLogTag.SDK, "PlusSmartWebView.applyInsets(" + insets + ')');
        View topSpacerView = getTopSpacerView();
        ViewGroup.LayoutParams layoutParams = topSpacerView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = frontendInsets.b > 0 ? 0 : insets.b;
        topSpacerView.setLayoutParams(layoutParams);
        ViewGroup errorLayout = getErrorLayout();
        errorLayout.setPadding(insets.a, errorLayout.getPaddingTop(), insets.c, insets.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final npu errorViewController_delegate$lambda$1(PlusSmartWebView plusSmartWebView) {
        return new npu(plusSmartWebView.getErrorLayout(), plusSmartWebView.errorViewProvider, plusSmartWebView.viewVisibilityAnimator, new PlusSmartWebView$errorViewController$2$1(0, plusSmartWebView.presenter, yld0.class, "onRetryClick", "onRetryClick()V", 0));
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.errorLayout.a($$delegatedProperties[3]);
    }

    private final npu getErrorViewController() {
        return (npu) this.errorViewController.getValue();
    }

    private final ViewGroup getProgressBarLayout() {
        return (ViewGroup) this.progressBarLayout.a($$delegatedProperties[2]);
    }

    private final wu41 getToolbarController() {
        return (wu41) this.toolbarController.getValue();
    }

    private final View getTopSpacerView() {
        return (View) this.topSpacerView.a($$delegatedProperties[0]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tzs0 getWebViewController() {
        return (tzs0) this.webViewController.getValue();
    }

    private final void hideLoading() {
        ((l8p) this.viewVisibilityAnimator).b(getProgressBarLayout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showContent$lambda$4(PlusSmartWebView plusSmartWebView) {
        vg vgVar = plusSmartWebView.accessibilityFocusController;
        WebView webView = plusSmartWebView.getWebViewContainer().getWebView();
        vgVar.getClass();
        vg.a(webView);
        return zy11.a;
    }

    private final void showLoadingProcess() {
        ((l8p) this.viewVisibilityAnimator).c(new b931(13), getProgressBarLayout());
        getErrorViewController().a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wu41 toolbarController_delegate$lambda$0(PlusSmartWebView plusSmartWebView) {
        return new wu41((WebViewToolbar) plusSmartWebView.findViewById(v9h0.toolbar), plusSmartWebView.stringsResolver, plusSmartWebView.findViewById(v9h0.pull_out_line_icon), plusSmartWebView.toolbarOptions, new PlusSmartWebView$toolbarController$2$1(0, plusSmartWebView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "routeBack", "routeBack()Z", 8), new PlusSmartWebView$toolbarController$2$2(0, plusSmartWebView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "closeTopDeeplink", "closeTopDeeplink()V", 0));
    }

    private final void updateToolbar() {
        getToolbarController().a(tl91.c(getWebViewController()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tzs0 webViewController_delegate$lambda$3(PlusSmartWebView plusSmartWebView) {
        uzs0 uzs0Var = plusSmartWebView.smartWebViewControllerDelegateFactory;
        WebViewContainer webViewContainer = plusSmartWebView.getWebViewContainer();
        yld0 yld0Var = plusSmartWebView.presenter;
        PlusSmartWebView$webViewController$2$1 plusSmartWebView$webViewController$2$1 = new PlusSmartWebView$webViewController$2$1(1, plusSmartWebView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0);
        PlusSmartWebView$webViewController$2$2 plusSmartWebView$webViewController$2$2 = new PlusSmartWebView$webViewController$2$2(2, plusSmartWebView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0);
        k7d0 k7d0Var = new k7d0(8, plusSmartWebView);
        PlusSmartWebView$webViewController$2$4 plusSmartWebView$webViewController$2$4 = new PlusSmartWebView$webViewController$2$4(2, plusSmartWebView.presenter, yld0.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0);
        return new tzs0(uzs0Var.a, uzs0Var.b, webViewContainer, yld0Var, uzs0Var.f, uzs0Var.g, yld0Var, plusSmartWebView$webViewController$2$1, plusSmartWebView$webViewController$2$2, k7d0Var, new PlusSmartWebView$webViewController$2$5(1, plusSmartWebView.getToolbarController(), wu41.class, "update", "update(Lcom/yandex/plus/home/feature/webviews/internalapi/toolbar/WebViewToolbarData;)V", 0), plusSmartWebView$webViewController$2$4, plusSmartWebView.presenter.E, uzs0Var.e, uzs0Var.c, plusSmartWebView.commonWebViewContractEventListener, uzs0Var.d, WebViewType.SMART, uzs0Var.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse webViewController_delegate$lambda$3$lambda$2(PlusSmartWebView plusSmartWebView, WebResourceRequest webResourceRequest) {
        return (WebResourceResponse) tje.Y(EmptyCoroutineContext.a, new PlusSmartWebView$webViewController$2$3$1(plusSmartWebView, webResourceRequest, null));
    }

    @Override // defpackage.asd0
    public void dismiss() {
        skd0.e(PlusLogTag.UI, "dismiss()");
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).k();
    }

    @Override // defpackage.gje
    public View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yld0 yld0Var = this.presenter;
        yld0Var.b(this);
        yld0Var.g.v();
        gsd0 gsd0Var = yld0Var.H;
        gsd0Var.e = true;
        gsd0Var.a();
        yld0Var.J.h();
        String str = yld0Var.f.e;
        if (str == null) {
            str = "smart";
        }
        boolean z = yld0Var.A;
        com.yandex.plus.home.feature.webviews.internal.c cVar = yld0Var.w;
        if (z) {
            com.yandex.plus.home.common.utils.c.b(cVar.b(str), yld0Var.e(), new PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1(yld0Var, null));
        } else {
            com.yandex.plus.home.common.utils.c.b(cVar.a(str), yld0Var.e(), new PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$2(yld0Var, null));
        }
        yld0Var.y.f(yld0Var.z);
        updateToolbar();
        getWebViewController().setAudioMuted(false);
    }

    @Override // defpackage.gje
    public boolean onBackPressed() {
        if (!getWebViewController().canGoBack()) {
            return false;
        }
        getWebViewController().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.d();
        getWebViewController().setAudioMuted(true);
    }

    @Override // defpackage.gje
    public void onHasStartedBeingOverlapped() {
        yld0 yld0Var = this.presenter;
        yld0Var.getClass();
        skd0.e(PlusLogTag.UI, "onHasStartedBeingOverlapped()");
        yld0Var.n(new cov());
    }

    @Override // defpackage.gje
    public void onHasStoppedBeingOverlapped() {
        yld0 yld0Var = this.presenter;
        yld0Var.getClass();
        skd0.e(PlusLogTag.UI, "onHasStoppedBeingOverlapped()");
        yld0Var.n(new fov());
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
        getWebViewController().onPause();
        this.presenter.i();
        getWebViewController().setAudioMuted(true);
    }

    @Override // defpackage.gje
    public void onResume() {
        getWebViewController().onResume();
        this.presenter.j();
        getWebViewController().setAudioMuted(false);
    }

    @Override // defpackage.gje
    public void onStart() {
        yld0 yld0Var = this.presenter;
        yld0Var.getClass();
        yld0Var.n(new ulv());
    }

    @Override // defpackage.gje
    public void onStop() {
        yld0 yld0Var = this.presenter;
        yld0Var.getClass();
        yld0Var.n(new rlv());
    }

    @Override // defpackage.asd0
    public void openUrl(String url, List<com.yandex.plus.home.feature.webviews.internal.network.a> headers) {
        tzs0 webViewController = getWebViewController();
        List<com.yandex.plus.home.feature.webviews.internal.network.a> list = headers;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (com.yandex.plus.home.feature.webviews.internal.network.a aVar : list) {
            Pair pair = new Pair(aVar.a, aVar.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        webViewController.loadUrl(url, linkedHashMap);
        showLoadingProcess();
    }

    @Override // defpackage.asd0
    public void performVibrate(int vibrateConstant) {
        getView().performHapticFeedback(vibrateConstant);
    }

    @Override // defpackage.asd0
    public void sendMessage(String jsonMessage) {
        skd0.e(PlusLogTag.UI, "sendMessage() url=".concat(jsonMessage));
        tzs0 webViewController = getWebViewController();
        webViewController.getClass();
        webViewController.b(String.format("__homeApp.response(%s)", Arrays.copyOf(new Object[]{jsonMessage}, 1)));
    }

    @Override // defpackage.asd0
    public void showContent() {
        hideLoading();
        getErrorViewController().a(false);
        getWebViewController().i(new zld0(this, 0), true);
        updateToolbar();
    }

    @Override // defpackage.asd0
    public void showError(String message) {
        hideLoading();
        kd5.h(getWebViewController());
        getErrorViewController().b(getWebViewController().d(), true);
        updateToolbar();
    }

    @Override // defpackage.asd0
    public void showWebServiceInfo(String message) {
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).s(new vvq0(getWebViewController().getUserAgentString(), message));
    }

    @Override // defpackage.asd0
    public void sendMessage(gov inMessage) {
        ((com.yandex.plus.home.feature.webviews.internal.smart.contract.a) getWebViewController().u.getValue()).z(inMessage);
    }
}
