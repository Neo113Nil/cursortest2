package com.yandex.plus.home.feature.webviews.internal.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.home.pay.PayError;
import com.yandex.plus.ui.core.theme.PlusTheme;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.a3d0;
import defpackage.agc0;
import defpackage.b450;
import defpackage.b64;
import defpackage.ba6;
import defpackage.bb1;
import defpackage.bgc;
import defpackage.cov;
import defpackage.d5b0;
import defpackage.emh0;
import defpackage.en;
import defpackage.fn;
import defpackage.fov;
import defpackage.g0d0;
import defpackage.gje;
import defpackage.gov;
import defpackage.gsd0;
import defpackage.gw00;
import defpackage.hn;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.in;
import defpackage.j4n;
import defpackage.jiu;
import defpackage.kd5;
import defpackage.kgx;
import defpackage.l8p;
import defpackage.lld0;
import defpackage.lz40;
import defpackage.n5d0;
import defpackage.npu;
import defpackage.nsu;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.ow31;
import defpackage.p4z;
import defpackage.pb;
import defpackage.pey;
import defpackage.ppu;
import defpackage.qoi0;
import defpackage.qpu;
import defpackage.qs90;
import defpackage.r3d0;
import defpackage.rlv;
import defpackage.s4d0;
import defpackage.sgs;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpu;
import defpackage.u1w;
import defpackage.u350;
import defpackage.ulv;
import defpackage.upu;
import defpackage.v9h0;
import defpackage.vg;
import defpackage.vng;
import defpackage.vvq0;
import defpackage.w4d0;
import defpackage.w511;
import defpackage.wv5;
import defpackage.x350;
import defpackage.x4d0;
import defpackage.y17;
import defpackage.y4;
import defpackage.y4d0;
import defpackage.y821;
import defpackage.z2d0;
import defpackage.z4d0;
import defpackage.zqc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\u009b\u0001\b\u0000\u0018\u0000 ¸\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¹\u0001B\u0091\u0001\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J%\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020.2\u0006\u00101\u001a\u00020)H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020.2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b2\u00106J\u000f\u00107\u001a\u00020.H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020.H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020.H\u0016¢\u0006\u0004\b:\u00108J\u0019\u0010<\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b<\u00103J\u000f\u0010=\u001a\u00020.H\u0016¢\u0006\u0004\b=\u00108J\u000f\u0010>\u001a\u00020.H\u0014¢\u0006\u0004\b>\u00108J\u000f\u0010?\u001a\u00020.H\u0014¢\u0006\u0004\b?\u00108J\u000f\u0010@\u001a\u00020.H\u0016¢\u0006\u0004\b@\u00108J\u000f\u0010A\u001a\u00020.H\u0016¢\u0006\u0004\bA\u00108J\u000f\u0010B\u001a\u00020.H\u0016¢\u0006\u0004\bB\u00108J\u000f\u0010C\u001a\u00020.H\u0016¢\u0006\u0004\bC\u00108J\u000f\u0010D\u001a\u00020.H\u0016¢\u0006\u0004\bD\u00108J\u000f\u0010E\u001a\u00020.H\u0016¢\u0006\u0004\bE\u00108J\u000f\u0010F\u001a\u00020\u001bH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020.H\u0016¢\u0006\u0004\bH\u00108J\u0019\u0010I\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bI\u00103J\u0017\u0010L\u001a\u00020.2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020.2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020.H\u0016¢\u0006\u0004\bR\u00108J\u000f\u0010S\u001a\u00020.H\u0016¢\u0006\u0004\bS\u00108J\u000f\u0010T\u001a\u00020.H\u0016¢\u0006\u0004\bT\u00108J\u000f\u0010U\u001a\u00020.H\u0016¢\u0006\u0004\bU\u00108J\u0017\u0010X\u001a\u00020.2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020.H\u0002¢\u0006\u0004\bZ\u00108J\u001f\u0010[\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020.2\u0006\u0010]\u001a\u00020\u001bH\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010gR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010iR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010jR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010kR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010lR\u001a\u0010n\u001a\u00020m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001b\u0010u\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010qR\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010s\u001a\u0004\bx\u0010yR\u001d\u0010\u007f\u001a\u0004\u0018\u00010{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010s\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010s\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010s\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010s\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0091\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010s\u001a\u0006\b\u0090\u0001\u0010\u0083\u0001R \u0010\u0094\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010s\u001a\u0006\b\u0093\u0001\u0010\u0083\u0001R \u0010\u0097\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010s\u001a\u0006\b\u0096\u0001\u0010\u0083\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u0010¨\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010 \u0001\u001a\u0006\b¦\u0001\u0010§\u0001R!\u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010 \u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010 \u0001\u001a\u0006\b°\u0001\u0010±\u0001R!\u0010·\u0001\u001a\u00030³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010 \u0001\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006º\u0001"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/home/PlusHomeWebView;", "Landroid/widget/LinearLayout;", "Ls4d0;", "Lgje;", "Lqpu;", "Landroid/content/Context;", "context", "Lcom/yandex/plus/home/feature/webviews/internal/home/d;", "presenter", "Lvg;", "accessibilityFocusController", "Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;", "openFormat", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lx350;", "nativePayButtonPresenter", "Llld0;", "stringsResolver", "Lppu;", "loadingAnimationController", "Lz2d0;", "errorViewProvider", "Low31;", "viewVisibilityAnimator", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "", "shouldShowToolbar", "Lu1w;", "insets", "Lsgs;", "frontendInsets", "Lupu;", "homeWebViewControllerDelegateFactory", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "webViewsRouter", "Len;", "buttonSectionContainerViewControllerFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/plus/home/feature/webviews/internal/home/d;Lvg;Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;Lcom/yandex/plus/ui/core/theme/PlusTheme;Lx350;Llld0;Lppu;Lz2d0;Low31;Lcom/yandex/plus/core/strings/PlusSdkBrandType;ZLu1w;Lsgs;Lupu;Lcom/yandex/plus/home/feature/webviews/internal/container/b;Len;)V", "", "url", "", "Lcom/yandex/plus/home/feature/webviews/internal/network/a;", "headers", "Lzy11;", "openUrl", "(Ljava/lang/String;Ljava/util/List;)V", "jsonEventString", "sendMessage", "(Ljava/lang/String;)V", "Lgov;", "inMessage", "(Lgov;)V", "showHostBuyView", "()V", "hideHostBuyView", "hideLoading", Constants.KEY_MESSAGE, "showError", "dismiss", "onAttachedToWindow", "onDetachedFromWindow", "onStart", "onResume", "onPause", "onStop", "onHasStartedBeingOverlapped", "onHasStoppedBeingOverlapped", "onBackPressed", "()Z", "showSslCertificateError", "showWebServiceInfo", "Lu350;", "payButtonConfig", "showNativePayButton", "(Lu350;)V", "Lcom/yandex/plus/home/pay/PayError;", "payError", "showNativePayError", "(Lcom/yandex/plus/home/pay/PayError;)V", "hideNativePayButton", "cancelPayButtonLoading", "onModalExpanded", "onModalHide", "", "vibrateConstant", "performVibrate", "(I)V", "setupSslErrorClick", "applyInsets", "(Lu1w;Lsgs;)V", "isVisible", "setupToolbar", "(Z)V", "Lnpu;", "createErrorViewController", "()Lnpu;", "Lcom/yandex/plus/home/feature/webviews/internal/home/d;", "Lvg;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "Lx350;", "Llld0;", "Lz2d0;", "Low31;", "Lupu;", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "Len;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "topSpacerView$delegate", "Lwv5;", "getTopSpacerView", "topSpacerView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar;", "toolbar$delegate", "getToolbar", "()Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar;", "toolbar", "Landroid/view/ViewGroup;", "hostPayContainer$delegate", "getHostPayContainer", "()Landroid/view/ViewGroup;", "hostPayContainer", "Landroid/view/ViewStub;", "sslErrorViewStub$delegate", "getSslErrorViewStub", "()Landroid/view/ViewStub;", "sslErrorViewStub", "Landroid/widget/Button;", "toArticleButton$delegate", "getToArticleButton", "()Landroid/widget/Button;", "toArticleButton", "errorContainer$delegate", "getErrorContainer", "errorContainer", "nativePayButton$delegate", "getNativePayButton", "nativePayButton", "acqSdkButtonSectionContainer$delegate", "getAcqSdkButtonSectionContainer", "acqSdkButtonSectionContainer", "Lzqc;", "commonWebViewContractEventListener", "Lzqc;", "y4d0", "homeWebViewContractEventListener", "Ly4d0;", "Ltpu;", "webViewController$delegate", "Li3y;", "getWebViewController", "()Ltpu;", "webViewController", "Lr3d0;", "loadingController$delegate", "getLoadingController", "()Lr3d0;", "loadingController", "Lfn;", "acqSdkButtonSectionContainerViewController$delegate", "getAcqSdkButtonSectionContainerViewController", "()Lfn;", "acqSdkButtonSectionContainerViewController", "Lb450;", "nativePayButtonViewController$delegate", "getNativePayButtonViewController", "()Lb450;", "nativePayButtonViewController", "Lqs90;", "hostPayAnimationController$delegate", "getHostPayAnimationController", "()Lqs90;", "hostPayAnimationController", "Companion", "w4d0", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusHomeWebView extends LinearLayout implements s4d0, gje, qpu {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("topSpacerView", 0, "getTopSpacerView()Landroid/view/View;", PlusHomeWebView.class), b64.x(qoi0.a, PlusHomeWebView.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new PropertyReference1Impl("toolbar", 0, "getToolbar()Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar;", PlusHomeWebView.class), new PropertyReference1Impl("hostPayContainer", 0, "getHostPayContainer()Landroid/view/ViewGroup;", PlusHomeWebView.class), new PropertyReference1Impl("sslErrorViewStub", 0, "getSslErrorViewStub()Landroid/view/ViewStub;", PlusHomeWebView.class), new PropertyReference1Impl("toArticleButton", 0, "getToArticleButton()Landroid/widget/Button;", PlusHomeWebView.class), new PropertyReference1Impl("errorContainer", 0, "getErrorContainer()Landroid/view/ViewGroup;", PlusHomeWebView.class), new PropertyReference1Impl("nativePayButton", 0, "getNativePayButton()Landroid/view/ViewGroup;", PlusHomeWebView.class), new PropertyReference1Impl("acqSdkButtonSectionContainer", 0, "getAcqSdkButtonSectionContainer()Landroid/view/ViewGroup;", PlusHomeWebView.class)};
    private static final w4d0 Companion = new w4d0();

    @Deprecated
    public static final String SSL_CERTIFICATE_WIKI_URL = "https://wiki.yandex-team.ru/security/ssl/sslclientfix/#vandroid";
    private final vg accessibilityFocusController;

    /* renamed from: acqSdkButtonSectionContainer$delegate, reason: from kotlin metadata */
    private final wv5 acqSdkButtonSectionContainer;

    /* renamed from: acqSdkButtonSectionContainerViewController$delegate, reason: from kotlin metadata */
    private final i3y acqSdkButtonSectionContainerViewController;
    private final en buttonSectionContainerViewControllerFactory;
    private final zqc commonWebViewContractEventListener;

    /* renamed from: errorContainer$delegate, reason: from kotlin metadata */
    private final wv5 errorContainer;
    private final z2d0 errorViewProvider;
    private final y4d0 homeWebViewContractEventListener;
    private final upu homeWebViewControllerDelegateFactory;

    /* renamed from: hostPayAnimationController$delegate, reason: from kotlin metadata */
    private final i3y hostPayAnimationController;

    /* renamed from: hostPayContainer$delegate, reason: from kotlin metadata */
    private final wv5 hostPayContainer;

    /* renamed from: loadingController$delegate, reason: from kotlin metadata */
    private final i3y loadingController;

    /* renamed from: nativePayButton$delegate, reason: from kotlin metadata */
    private final wv5 nativePayButton;
    private final x350 nativePayButtonPresenter;

    /* renamed from: nativePayButtonViewController$delegate, reason: from kotlin metadata */
    private final i3y nativePayButtonViewController;
    private final d presenter;

    /* renamed from: sslErrorViewStub$delegate, reason: from kotlin metadata */
    private final wv5 sslErrorViewStub;
    private final lld0 stringsResolver;
    private final PlusTheme theme;

    /* renamed from: toArticleButton$delegate, reason: from kotlin metadata */
    private final wv5 toArticleButton;

    /* renamed from: toolbar$delegate, reason: from kotlin metadata */
    private final wv5 toolbar;

    /* renamed from: topSpacerView$delegate, reason: from kotlin metadata */
    private final wv5 topSpacerView;
    private final View view;
    private final ow31 viewVisibilityAnimator;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final wv5 webViewContainer;

    /* renamed from: webViewController$delegate, reason: from kotlin metadata */
    private final i3y webViewController;
    private final com.yandex.plus.home.feature.webviews.internal.container.b webViewsRouter;

    public PlusHomeWebView(Context context, d dVar, vg vgVar, Deeplink$WebViewFormat deeplink$WebViewFormat, PlusTheme plusTheme, x350 x350Var, lld0 lld0Var, ppu ppuVar, z2d0 z2d0Var, ow31 ow31Var, PlusSdkBrandType plusSdkBrandType, boolean z, u1w u1wVar, sgs sgsVar, upu upuVar, com.yandex.plus.home.feature.webviews.internal.container.b bVar, en enVar) {
        super(context);
        int i;
        this.presenter = dVar;
        this.accessibilityFocusController = vgVar;
        this.theme = plusTheme;
        this.nativePayButtonPresenter = x350Var;
        this.stringsResolver = lld0Var;
        this.errorViewProvider = z2d0Var;
        this.viewVisibilityAnimator = ow31Var;
        this.homeWebViewControllerDelegateFactory = upuVar;
        this.webViewsRouter = bVar;
        this.buttonSectionContainerViewControllerFactory = enVar;
        this.view = this;
        final int i2 = 0;
        this.topSpacerView = new wv5(new z4d0(this, v9h0.top_spacer_view, i2));
        final int i3 = 1;
        this.webViewContainer = new wv5(new z4d0(this, v9h0.plus_home_webview_contracts_container, i3));
        final int i4 = 2;
        this.toolbar = new wv5(new z4d0(this, v9h0.plus_home_toolbar, i4));
        this.hostPayContainer = new wv5(new z4d0(this, v9h0.plus_sdk_home_host_pay_container, 3));
        int i5 = 4;
        this.sslErrorViewStub = new wv5(new z4d0(this, v9h0.ssl_error_view_stub, i5));
        int i6 = 5;
        this.toArticleButton = new wv5(new z4d0(this, v9h0.btn_to_article, i6));
        this.errorContainer = new wv5(new z4d0(this, v9h0.plus_home_web_view_error_layout, 6));
        this.nativePayButton = new wv5(new z4d0(this, v9h0.plus_sdk_home_native_pay_layout, 7));
        this.acqSdkButtonSectionContainer = new wv5(new z4d0(this, v9h0.plus_sdk_home_acquisition_sdk_button_section_container, 8));
        this.commonWebViewContractEventListener = new e(this);
        this.homeWebViewContractEventListener = new y4d0(this);
        this.webViewController = kotlin.a.a(new sls(this) { // from class: v4d0
            public final /* synthetic */ PlusHomeWebView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tpu webViewController_delegate$lambda$1;
                fn acqSdkButtonSectionContainerViewController_delegate$lambda$3;
                qs90 hostPayAnimationController_delegate$lambda$5;
                int i7 = i2;
                PlusHomeWebView plusHomeWebView = this.b;
                switch (i7) {
                    case 0:
                        webViewController_delegate$lambda$1 = PlusHomeWebView.webViewController_delegate$lambda$1(plusHomeWebView);
                        return webViewController_delegate$lambda$1;
                    case 1:
                        acqSdkButtonSectionContainerViewController_delegate$lambda$3 = PlusHomeWebView.acqSdkButtonSectionContainerViewController_delegate$lambda$3(plusHomeWebView);
                        return acqSdkButtonSectionContainerViewController_delegate$lambda$3;
                    default:
                        hostPayAnimationController_delegate$lambda$5 = PlusHomeWebView.hostPayAnimationController_delegate$lambda$5(plusHomeWebView);
                        return hostPayAnimationController_delegate$lambda$5;
                }
            }
        });
        this.loadingController = kotlin.a.a(new agc0(i5, this, ppuVar));
        this.acqSdkButtonSectionContainerViewController = kotlin.a.a(new sls(this) { // from class: v4d0
            public final /* synthetic */ PlusHomeWebView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tpu webViewController_delegate$lambda$1;
                fn acqSdkButtonSectionContainerViewController_delegate$lambda$3;
                qs90 hostPayAnimationController_delegate$lambda$5;
                int i7 = i3;
                PlusHomeWebView plusHomeWebView = this.b;
                switch (i7) {
                    case 0:
                        webViewController_delegate$lambda$1 = PlusHomeWebView.webViewController_delegate$lambda$1(plusHomeWebView);
                        return webViewController_delegate$lambda$1;
                    case 1:
                        acqSdkButtonSectionContainerViewController_delegate$lambda$3 = PlusHomeWebView.acqSdkButtonSectionContainerViewController_delegate$lambda$3(plusHomeWebView);
                        return acqSdkButtonSectionContainerViewController_delegate$lambda$3;
                    default:
                        hostPayAnimationController_delegate$lambda$5 = PlusHomeWebView.hostPayAnimationController_delegate$lambda$5(plusHomeWebView);
                        return hostPayAnimationController_delegate$lambda$5;
                }
            }
        });
        this.nativePayButtonViewController = kotlin.a.a(new agc0(i6, this, plusSdkBrandType));
        this.hostPayAnimationController = kotlin.a.a(new sls(this) { // from class: v4d0
            public final /* synthetic */ PlusHomeWebView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tpu webViewController_delegate$lambda$1;
                fn acqSdkButtonSectionContainerViewController_delegate$lambda$3;
                qs90 hostPayAnimationController_delegate$lambda$5;
                int i7 = i4;
                PlusHomeWebView plusHomeWebView = this.b;
                switch (i7) {
                    case 0:
                        webViewController_delegate$lambda$1 = PlusHomeWebView.webViewController_delegate$lambda$1(plusHomeWebView);
                        return webViewController_delegate$lambda$1;
                    case 1:
                        acqSdkButtonSectionContainerViewController_delegate$lambda$3 = PlusHomeWebView.acqSdkButtonSectionContainerViewController_delegate$lambda$3(plusHomeWebView);
                        return acqSdkButtonSectionContainerViewController_delegate$lambda$3;
                    default:
                        hostPayAnimationController_delegate$lambda$5 = PlusHomeWebView.hostPayAnimationController_delegate$lambda$5(plusHomeWebView);
                        return hostPayAnimationController_delegate$lambda$5;
                }
            }
        });
        skd0.e(PlusLogTag.UI, "init()");
        int i7 = x4d0.a[deeplink$WebViewFormat.ordinal()];
        if (i7 == 1) {
            i = emh0.plus_sdk_web_view_home_full;
        } else {
            if (i7 != 2) {
                w511.b();
                throw null;
            }
            i = emh0.plus_sdk_web_view_home_card;
        }
        bb1.v(this, i, true);
        setOrientation(1);
        applyInsets(u1wVar, sgsVar);
        setupToolbar(z);
        vgVar.b(getWebViewContainer().getWebView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fn acqSdkButtonSectionContainerViewController_delegate$lambda$3(PlusHomeWebView plusHomeWebView) {
        j4n j4nVar = (j4n) plusHomeWebView.buttonSectionContainerViewControllerFactory;
        return new hn(plusHomeWebView.getAcqSdkButtonSectionContainer(), (sls) j4nVar.a, (in) j4nVar.b, (y17) j4nVar.c, (PropertyReference0Impl) j4nVar.x, (ijd0) j4nVar.y, (imd0) j4nVar.z, (y821) j4nVar.w);
    }

    private final void applyInsets(u1w insets, sgs frontendInsets) {
        skd0.b(PlusLogTag.SDK, "PlusHomeWebView.applyInsets(" + insets + ')');
        View topSpacerView = getTopSpacerView();
        ViewGroup.LayoutParams layoutParams = topSpacerView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = frontendInsets.b > 0 ? 0 : insets.b;
        topSpacerView.setLayoutParams(layoutParams);
        ViewGroup errorContainer = getErrorContainer();
        int i = insets.a;
        int i2 = insets.d;
        int i3 = insets.c;
        errorContainer.setPadding(i, errorContainer.getPaddingTop(), i3, i2);
        ViewStub sslErrorViewStub = getSslErrorViewStub();
        sslErrorViewStub.setPadding(i, sslErrorViewStub.getPaddingTop(), i3, i2);
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.setPadding(i, hostPayContainer.getPaddingTop(), i3, i2);
        ViewGroup nativePayButton = getNativePayButton();
        nativePayButton.setPadding(i, nativePayButton.getPaddingTop(), i3, i2);
        ViewGroup acqSdkButtonSectionContainer = getAcqSdkButtonSectionContainer();
        acqSdkButtonSectionContainer.setPadding(i, acqSdkButtonSectionContainer.getPaddingTop(), i3, i2);
    }

    private final npu createErrorViewController() {
        return new npu(getErrorContainer(), this.errorViewProvider, this.viewVisibilityAnimator, new PlusHomeWebView$createErrorViewController$1(0, this.presenter, d.class, "onRetryClick", "onRetryClick()V", 0));
    }

    private final ViewGroup getAcqSdkButtonSectionContainer() {
        return (ViewGroup) this.acqSdkButtonSectionContainer.a($$delegatedProperties[8]);
    }

    private final fn getAcqSdkButtonSectionContainerViewController() {
        return (fn) this.acqSdkButtonSectionContainerViewController.getValue();
    }

    private final ViewGroup getErrorContainer() {
        return (ViewGroup) this.errorContainer.a($$delegatedProperties[6]);
    }

    private final qs90 getHostPayAnimationController() {
        return (qs90) this.hostPayAnimationController.getValue();
    }

    private final ViewGroup getHostPayContainer() {
        return (ViewGroup) this.hostPayContainer.a($$delegatedProperties[3]);
    }

    private final r3d0 getLoadingController() {
        return (r3d0) this.loadingController.getValue();
    }

    private final ViewGroup getNativePayButton() {
        return (ViewGroup) this.nativePayButton.a($$delegatedProperties[7]);
    }

    private final b450 getNativePayButtonViewController() {
        return (b450) this.nativePayButtonViewController.getValue();
    }

    private final ViewStub getSslErrorViewStub() {
        return (ViewStub) this.sslErrorViewStub.a($$delegatedProperties[4]);
    }

    private final Button getToArticleButton() {
        return (Button) this.toArticleButton.a($$delegatedProperties[5]);
    }

    private final WebViewToolbar getToolbar() {
        return (WebViewToolbar) this.toolbar.a($$delegatedProperties[2]);
    }

    private final View getTopSpacerView() {
        return (View) this.topSpacerView.a($$delegatedProperties[0]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tpu getWebViewController() {
        return (tpu) this.webViewController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qs90 hostPayAnimationController_delegate$lambda$5(PlusHomeWebView plusHomeWebView) {
        return new qs90(plusHomeWebView.getHostPayContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r3d0 loadingController_delegate$lambda$2(PlusHomeWebView plusHomeWebView, ppu ppuVar) {
        return new r3d0(plusHomeWebView, ppuVar, plusHomeWebView.createErrorViewController(), plusHomeWebView.viewVisibilityAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b450 nativePayButtonViewController_delegate$lambda$4(PlusHomeWebView plusHomeWebView, PlusSdkBrandType plusSdkBrandType) {
        return new b450(plusHomeWebView.theme, plusHomeWebView.getNativePayButton(), plusHomeWebView.presenter, plusHomeWebView.nativePayButtonPresenter, plusHomeWebView.stringsResolver, plusSdkBrandType);
    }

    private final void setupSslErrorClick() {
        bb1.L(getToArticleButton(), new d5b0(8, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSslErrorClick$lambda$8(PlusHomeWebView plusHomeWebView, View view) {
        plusHomeWebView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(SSL_CERTIFICATE_WIKI_URL)).addFlags(SelfTester_JCP.IMITA));
    }

    private final void setupToolbar(boolean isVisible) {
        WebViewToolbar toolbar = getToolbar();
        if (toolbar != null) {
            toolbar.setVisibility(isVisible ? 0 : 8);
        }
        if (isVisible) {
            WebViewToolbar toolbar2 = getToolbar();
            if (toolbar2 != null) {
                toolbar2.showBackStartIcon();
            }
            WebViewToolbar toolbar3 = getToolbar();
            if (toolbar3 != null) {
                toolbar3.setOnStartIconClickListener(new PlusHomeWebView$setupToolbar$1(0, this.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "closeTopDeeplink", "closeTopDeeplink()V", 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tpu webViewController_delegate$lambda$1(PlusHomeWebView plusHomeWebView) {
        upu upuVar = plusHomeWebView.homeWebViewControllerDelegateFactory;
        WebViewContainer webViewContainer = plusHomeWebView.getWebViewContainer();
        d dVar = plusHomeWebView.presenter;
        PlusHomeWebView$webViewController$2$1 plusHomeWebView$webViewController$2$1 = new PlusHomeWebView$webViewController$2$1(1, plusHomeWebView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0);
        PlusHomeWebView$webViewController$2$2 plusHomeWebView$webViewController$2$2 = new PlusHomeWebView$webViewController$2$2(2, plusHomeWebView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0);
        i4b0 i4b0Var = new i4b0(29, plusHomeWebView);
        d dVar2 = plusHomeWebView.presenter;
        return new tpu(upuVar.a, upuVar.b, webViewContainer, dVar, upuVar.f, upuVar.g, dVar, plusHomeWebView$webViewController$2$1, plusHomeWebView$webViewController$2$2, i4b0Var, new PlusHomeWebView$webViewController$2$4(2, dVar2, d.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0), dVar2.S, upuVar.e, upuVar.c, plusHomeWebView.commonWebViewContractEventListener, plusHomeWebView.homeWebViewContractEventListener, upuVar.d, WebViewType.HOME, upuVar.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse webViewController_delegate$lambda$1$lambda$0(PlusHomeWebView plusHomeWebView, WebResourceRequest webResourceRequest) {
        return (WebResourceResponse) tje.Y(EmptyCoroutineContext.a, new PlusHomeWebView$webViewController$2$3$1(plusHomeWebView, webResourceRequest, null));
    }

    @Override // defpackage.s4d0
    public void cancelPayButtonLoading() {
        getNativePayButtonViewController().d(false);
    }

    @Override // defpackage.s4d0
    public void dismiss() {
        skd0.e(PlusLogTag.UI, "dismiss()");
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).k();
    }

    @Override // defpackage.gje
    public View getView() {
        return this.view;
    }

    @Override // defpackage.s4d0, defpackage.qpu
    public void hideHostBuyView() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        hostPayContainer.setVisibility(8);
    }

    @Override // defpackage.s4d0
    public void hideLoading() {
        getWebViewController().i(new bgc(12), false);
        r3d0 loadingController = getLoadingController();
        ((l8p) loadingController.c).b(loadingController.a());
        ((n5d0) ((nw70) loadingController.a).b).k(loadingController.a());
        loadingController.b.a(true);
        d dVar = this.presenter;
        dVar.u.t(dVar.Z.g);
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onContentShowed()");
        if (!dVar.T) {
            dVar.T = true;
            ((lz40) dVar.n.b).g(a3d0.a);
        }
        p4z p4zVar = dVar.l;
        skd0.e(plusLogTag, "autoTriggerSettingIfPresent()");
        PlusHomeBundle plusHomeBundle = dVar.g;
        String settingId = plusHomeBundle.getSettingId();
        Boolean isSettingTurnedOn = plusHomeBundle.getIsSettingTurnedOn();
        if (settingId == null || isSettingTurnedOn == null) {
            skd0.h(plusLogTag, "autoTriggerSettingIfPresent() settingId is null and newValue is null", null);
        } else {
            if (isSettingTurnedOn.equals(Boolean.FALSE)) {
                skd0.h(plusLogTag, "autoTriggerSettingIfPresent() this transition is not supported yet", null);
                dVar.p.a(settingId, "only false -> true transition of setting.value is allowed yet", true);
            }
            if (isSettingTurnedOn.equals(Boolean.valueOf(p4zVar.d(settingId)))) {
                skd0.h(plusLogTag, "autoTriggerSettingIfPresent() skip change setting for the same value", null);
            } else {
                ba6 ba6Var = new ba6(settingId, p4zVar.h(settingId), isSettingTurnedOn.booleanValue());
                skd0.e(plusLogTag, "changeSetting() setting=" + ba6Var);
                tje.N(dVar.e(), dVar.h, null, new PlusHomeWebPresenter$changeSetting$1(dVar, ba6Var, null), 2);
            }
        }
        dVar.z.a(dVar.C);
        vg vgVar = this.accessibilityFocusController;
        WebView webView = getWebViewContainer().getWebView();
        vgVar.getClass();
        vg.a(webView);
    }

    @Override // defpackage.s4d0, defpackage.qpu
    public void hideNativePayButton() {
        b450 nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.c.onClose();
        View view = ((qs90) nativePayButtonViewController.q.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onAttachedToWindow()");
        d dVar = this.presenter;
        dVar.b(this);
        dVar.u.v();
        skd0.e(plusLogTag, "attachView()");
        gsd0 gsd0Var = dVar.W;
        int i = 1;
        gsd0Var.e = true;
        gsd0Var.a();
        dVar.Z.h();
        boolean z = dVar.I;
        com.yandex.plus.home.feature.webviews.internal.c cVar = dVar.w;
        if (z) {
            com.yandex.plus.home.common.utils.c.b(cVar.b("home"), dVar.e(), new PlusHomeWebPresenter$subscribeOnWebViewReceiverMessages$1(dVar, null));
        } else {
            com.yandex.plus.home.common.utils.c.b(cVar.a("home"), dVar.e(), new PlusHomeWebPresenter$subscribeOnWebViewReceiverMessages$2(dVar, null));
        }
        com.yandex.plus.home.common.utils.c.b(kotlinx.coroutines.flow.e.t(new pb(dVar.t.a.h, 10)), dVar.e(), new PlusHomeWebPresenter$subscribeOnAccountChanges$1(dVar, null));
        tje.N(dVar.e(), null, null, new PlusHomeWebPresenter$preloadTreasuryOnConfiguration$1(dVar, null), 3);
        ((com.yandex.plus.home.feature.webviews.internal.bridge.b) dVar.Y.getValue()).a(dVar.e());
        dVar.k().a(new jiu(i));
        dVar.z.f(dVar.C);
        getWebViewController().setAudioMuted(false);
        hn hnVar = (hn) getAcqSdkButtonSectionContainerViewController();
        pey o = vng.o(hnVar.a);
        if (o != null) {
            ((com.yandex.plus.acquisition.adapter.internal.controller.b) ((g0d0) hnVar.d.getValue())).a(o, new y4(11, hnVar));
        }
        getLoadingController().b();
    }

    @Override // defpackage.gje
    public boolean onBackPressed() {
        d dVar = this.presenter;
        dVar.getClass();
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onBackPressed()");
        c cVar = dVar.Z;
        cVar.getClass();
        skd0.b(plusLogTag, "onBackPressed()");
        cVar.n(null);
        cVar.m(null);
        if (!getWebViewController().canGoBack()) {
            return false;
        }
        getWebViewController().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        skd0.e(PlusLogTag.UI, "onDetachedFromWindow()");
        this.presenter.d();
        b450 nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.c.onClose();
        View view = ((qs90) nativePayButtonViewController.q.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
        ((hn) getAcqSdkButtonSectionContainerViewController()).a();
        r3d0 loadingController = getLoadingController();
        ((l8p) loadingController.c).b(loadingController.a());
        ppu ppuVar = loadingController.a;
        ((n5d0) ((nw70) ppuVar).b).k(loadingController.a());
        loadingController.b.a(true);
        getWebViewController().setAudioMuted(true);
    }

    @Override // defpackage.gje
    public void onHasStartedBeingOverlapped() {
        d dVar = this.presenter;
        dVar.getClass();
        skd0.e(PlusLogTag.UI, "onHasStartedBeingOverlapped()");
        dVar.p(new cov());
    }

    @Override // defpackage.gje
    public void onHasStoppedBeingOverlapped() {
        d dVar = this.presenter;
        dVar.getClass();
        skd0.e(PlusLogTag.UI, "onHasStoppedBeingOverlapped()");
        dVar.p(new fov());
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
    }

    @Override // defpackage.gje
    public void onResume() {
        skd0.e(PlusLogTag.UI, "onResume()");
        getWebViewController().onResume();
        this.presenter.j();
    }

    @Override // defpackage.gje
    public void onStart() {
        d dVar = this.presenter;
        dVar.getClass();
        dVar.p(new ulv());
    }

    @Override // defpackage.gje
    public void onStop() {
        d dVar = this.presenter;
        dVar.getClass();
        dVar.p(new rlv());
    }

    @Override // defpackage.s4d0
    public void openUrl(String url, List<com.yandex.plus.home.feature.webviews.internal.network.a> headers) {
        tpu webViewController = getWebViewController();
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
        kd5.h(getWebViewController());
        getLoadingController().b();
        getHostPayContainer().setVisibility(8);
    }

    @Override // defpackage.s4d0
    public void performVibrate(int vibrateConstant) {
        getView().performHapticFeedback(vibrateConstant);
    }

    @Override // defpackage.s4d0
    public void sendMessage(String jsonEventString) {
        tpu webViewController = getWebViewController();
        webViewController.getClass();
        webViewController.b(String.format("__homeApp.response(%s)", Arrays.copyOf(new Object[]{jsonEventString}, 1)));
    }

    @Override // defpackage.s4d0
    public void showError(String message) {
        getWebViewController().stopLoading();
        kd5.h(getWebViewController());
        r3d0 loadingController = getLoadingController();
        String d = getWebViewController().d();
        ((l8p) loadingController.c).b(loadingController.a());
        ppu ppuVar = loadingController.a;
        ((n5d0) ((nw70) ppuVar).b).k(loadingController.a());
        loadingController.b.b(d, true);
    }

    @Override // defpackage.s4d0
    public void showHostBuyView() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        hostPayContainer.addView(((nsu) this.presenter.c0.getValue()).b());
        getHostPayAnimationController().a();
    }

    @Override // defpackage.s4d0
    public void showNativePayButton(u350 payButtonConfig) {
        b450.e(getNativePayButtonViewController(), payButtonConfig.b, payButtonConfig.c, payButtonConfig.d, payButtonConfig.e, payButtonConfig.a, payButtonConfig.f, 64);
    }

    @Override // defpackage.s4d0
    public void showNativePayError(PayError payError) {
        b450 nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.d(false);
        nativePayButtonViewController.b().setText(nativePayButtonViewController.c(payError));
    }

    @Override // defpackage.s4d0
    public void showSslCertificateError() {
        if (getSslErrorViewStub().getParent() != null) {
            getSslErrorViewStub().inflate();
            setupSslErrorClick();
        }
    }

    @Override // defpackage.s4d0
    public void showWebServiceInfo(String message) {
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).s(new vvq0(getWebViewController().getUserAgentString(), message));
    }

    @Override // defpackage.s4d0
    public void sendMessage(gov inMessage) {
        ((com.yandex.plus.home.feature.webviews.internal.home.contract.a) getWebViewController().u.getValue()).z(inMessage);
    }
}
