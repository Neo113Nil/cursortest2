package com.ybsdk.feature.webview.internal.presentation;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechWebviewFileChooserResultResult;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechWebviewViewModelVersionVersion;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.permissions.MultiplePermissionAllowance;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewHeader;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.api.WebViewStatusBar;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.utils.DownloadBlobFileJSInterface;
import com.ybsdk.feature.webview.internal.utils.FileChooserActivity;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.aj31;
import defpackage.aj51;
import defpackage.aq41;
import defpackage.ays0;
import defpackage.b0b0;
import defpackage.bnp0;
import defpackage.boh;
import defpackage.c0b0;
import defpackage.c6w;
import defpackage.ce4;
import defpackage.cj51;
import defpackage.cob1;
import defpackage.cq41;
import defpackage.cv41;
import defpackage.d0b0;
import defpackage.d6w;
import defpackage.dcs;
import defpackage.dj51;
import defpackage.dv41;
import defpackage.dzh0;
import defpackage.e331;
import defpackage.ech0;
import defpackage.eja1;
import defpackage.ev41;
import defpackage.fq41;
import defpackage.fv41;
import defpackage.g8e;
import defpackage.gob1;
import defpackage.gv41;
import defpackage.gw41;
import defpackage.gyc;
import defpackage.gza0;
import defpackage.i3y;
import defpackage.if8;
import defpackage.iv41;
import defpackage.j0g;
import defpackage.j50;
import defpackage.j861;
import defpackage.ji41;
import defpackage.jl40;
import defpackage.jla1;
import defpackage.jvx0;
import defpackage.jy31;
import defpackage.kp50;
import defpackage.kv41;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lob1;
import defpackage.ls41;
import defpackage.lwg0;
import defpackage.m50;
import defpackage.me1;
import defpackage.mo41;
import defpackage.mt31;
import defpackage.mv41;
import defpackage.n751;
import defpackage.ntz0;
import defpackage.nv41;
import defpackage.ny61;
import defpackage.oq41;
import defpackage.ov41;
import defpackage.p7b1;
import defpackage.pey;
import defpackage.pi51;
import defpackage.pu41;
import defpackage.pv41;
import defpackage.qas0;
import defpackage.qnh;
import defpackage.qq31;
import defpackage.qtz0;
import defpackage.qyq;
import defpackage.r450;
import defpackage.rg3;
import defpackage.ri51;
import defpackage.rje;
import defpackage.s421;
import defpackage.s450;
import defpackage.scc;
import defpackage.si51;
import defpackage.stz0;
import defpackage.tcc;
import defpackage.tdr;
import defpackage.tls;
import defpackage.tya0;
import defpackage.u1w;
import defpackage.um41;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.v50;
import defpackage.vh91;
import defpackage.vng;
import defpackage.vuu0;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.wrt;
import defpackage.x7r0;
import defpackage.xx60;
import defpackage.y1x0;
import defpackage.y6i0;
import defpackage.y8f;
import defpackage.yi51;
import defpackage.ynh;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z8i0;
import defpackage.zi51;
import defpackage.znh;
import defpackage.zp41;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  \u00012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002¡\u0001BY\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&J+\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002002\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020-H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020-H\u0016¢\u0006\u0004\b:\u00108J\u0017\u0010<\u001a\u00020-2\u0006\u0010;\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020-2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020-H\u0016¢\u0006\u0004\bB\u00108J\u000f\u0010C\u001a\u00020-H\u0003¢\u0006\u0004\bC\u00108J\u000f\u0010D\u001a\u00020-H\u0002¢\u0006\u0004\bD\u00108J\u0017\u0010E\u001a\u00020-2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020-H\u0002¢\u0006\u0004\bG\u00108J\u000f\u0010H\u001a\u00020-H\u0002¢\u0006\u0004\bH\u00108J\u000f\u0010I\u001a\u00020-H\u0002¢\u0006\u0004\bI\u00108J\u000f\u0010J\u001a\u00020-H\u0002¢\u0006\u0004\bJ\u00108J\u0017\u0010K\u001a\u00020-2\u0006\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010=J/\u0010R\u001a\u00020\u001e2\u0014\u0010O\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M\u0018\u00010L2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010Z\u001a\u00020Y2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bZ\u0010[J!\u0010`\u001a\u00020-2\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bc\u0010dJ\u0013\u0010f\u001a\u00020-*\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020-2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020-2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\bj\u0010iJ\u0017\u0010k\u001a\u00020-2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bk\u0010FJ\u000f\u0010l\u001a\u00020-H\u0002¢\u0006\u0004\bl\u00108J\u001f\u0010p\u001a\u00020b2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020mH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020b2\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\br\u0010sR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010uR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010vR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010wR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010xR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010yR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010zR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010{R\u001d\u0010\u0081\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R#\u0010\u008c\u0001\u001a\f\u0018\u00010\u008a\u0001j\u0005\u0018\u0001`\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u008e\u0001\u001a\f\u0018\u00010\u008a\u0001j\u0005\u0018\u0001`\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010\u0092\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R'\u0010\u009e\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/ybsdk/feature/webview/internal/presentation/WebViewFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lj861;", "Lov41;", "Lgv41;", "Ltdr;", "Lce4;", "Lmt31;", "Loq41;", "headersProvider", "Lls41;", "preferencesProvider", "Lum41;", "webViewConfigProvider", "Liv41;", "viewModelDeprecatedFactory", "Lmv41;", "viewModelFactory", "Lpv41;", "visualParamsProvider", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "reporter", "Ldj51;", "webViewFactory", "Lpu41;", "storageProvider", "Lr450;", "nativeWebEventsListenerFactory", "<init>", "(Loq41;Lls41;Lum41;Liv41;Lmv41;Lpv41;Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;Ldj51;Lpu41;Lr450;)V", "", "fitsSystemWindow", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lj861;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "createViewModel", "()Lgv41;", "onBackPressed", "onDestroyView", "()V", "onDestroy", "onDetach", "viewState", "render", "(Lov41;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onShownInViewPager", "createWebView", "addWebViewToRoot", "applyMarginsOnTopNavButton", "(Ln751;)V", "setOnControlClickListenerIfNeeded", "renderStatusBar", "renderNavBar", "renderToolbar", "updateControls", "Lri51;", "", "Landroid/net/Uri;", "filePathCallback", "Lpi51;", "fileChooserParams", "onShowFileChooser", "(Lri51;Lpi51;)Z", "Lsi51;", "webChromeClient", "()Lsi51;", "Landroid/content/Context;", "context", "Lyi51;", "webViewClient", "(Landroid/content/Context;)Lyi51;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Laj51;", "webView", "setupDownloadLogic", "(Landroidx/fragment/app/FragmentActivity;Laj51;)V", "", "subscribeOnPostMessages", "()Ljava/lang/String;", "Lzi51;", "setWebViewTheme", "(Lzi51;)V", "setupWebEventsListener", "(Laj51;)V", "removeJavascriptInterfaces", "applyInsetsOnWebView", "considerPullBarInset", "", "safeInsetTop", "safeInsetBottom", "getApplyInsetsJsScript", "(II)Ljava/lang/String;", "getApplyTopInsetJsScript", "(I)Ljava/lang/String;", "Loq41;", "Lum41;", "Liv41;", "Lmv41;", "Lpv41;", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "Ldj51;", "Lr450;", "Lcom/ybsdk/feature/webview/api/WebViewScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/webview/api/WebViewScreenParams;", "screenParams", "Ltya0;", "downloadPermissionManager", "Ltya0;", "Lcom/ybsdk/feature/webview/internal/utils/a;", "geolocationPermissionManager", "Lcom/ybsdk/feature/webview/internal/utils/a;", "webViewOutlineEnabled", "Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "hideBackButtonCallback", "Ljava/lang/Runnable;", "showWebViewCallback", "Lcj51;", "webViewContext", "Lcj51;", "Laj51;", "webViewOutline", "Landroid/view/View;", "Lcom/ybsdk/feature/webview/internal/utils/DownloadBlobFileJSInterface;", "downloadJSInterface", "Lcom/ybsdk/feature/webview/internal/utils/DownloadBlobFileJSInterface;", "previousViewSate", "Lov41;", "Lm50;", "Landroid/content/Intent;", "chooseFileActivityLauncher", "Lm50;", "theFilePathCallback", "Lri51;", "Companion", "cq41", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebViewFragment extends BaseMvvmFragment<j861, ov41, gv41> implements tdr, ce4, mt31 {
    private static final long BACK_BUTTON_VISIBLE_DELAY_MS = 150;
    private static final float OUTLINE_ALPHA = 0.8f;
    private static final String URL_KEY = "url";
    private static final long WEBVIEW_VISIBLE_DELAY_MS = 100;
    private static boolean isWebViewWarningShowed;
    private final m50 chooseFileActivityLauncher;
    private DownloadBlobFileJSInterface downloadJSInterface;
    private final tya0 downloadPermissionManager;
    private final com.ybsdk.feature.webview.internal.utils.a geolocationPermissionManager;
    private final oq41 headersProvider;
    private Runnable hideBackButtonCallback;
    private final r450 nativeWebEventsListenerFactory;
    private ov41 previousViewSate;
    private final AppAnalyticsReporter reporter;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private Runnable showWebViewCallback;
    private ri51 theFilePathCallback;
    private final iv41 viewModelDeprecatedFactory;
    private final mv41 viewModelFactory;
    private final pv41 visualParamsProvider;
    private aj51 webView;
    private final um41 webViewConfigProvider;
    private final cj51 webViewContext;
    private final dj51 webViewFactory;
    private View webViewOutline;
    private final boolean webViewOutlineEnabled;
    public static final cq41 Companion = new cq41();
    private static final int OUTLINE_STROKE_PX = kp50.r(3);
    private static final gza0 downloadPermissionRequest = new gza0(new c0b0("android.permission.WRITE_EXTERNAL_STORAGE"), new z8i0(unr0.h(Text.Companion, dzh0.ybsdk_webview_permissions_request_title), new Text.Resource(dzh0.ybsdk_webview_permissions_request_documents_permission), new Text.Resource(dzh0.ybsdk_webview_permissions_request_ok), new Text.Resource(dzh0.ybsdk_webview_permissions_cancel), null, null, 48), new wrt(new Text.Resource(dzh0.ybsdk_webview_permissions_request_title), new Text.Resource(dzh0.ybsdk_webview_permissions_request_documents_permission), new Text.Resource(dzh0.ybsdk_webview_permissions_request_ok_go_settings)), 8);
    private static final gza0 locationPermissionRequest = new gza0((d0b0) new b0b0(scc.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), MultiplePermissionAllowance.ANY, 2), new z8i0(new Text.Resource(dzh0.ybsdk_webview_permissions_request_title), new Text.Resource(dzh0.ybsdk_webview_permissions_request_location_permission), new Text.Resource(dzh0.ybsdk_webview_permissions_request_ok), new Text.Resource(dzh0.ybsdk_webview_permissions_cancel), null, null, 48), new wrt(new Text.Resource(dzh0.ybsdk_webview_permissions_request_title), new Text.Resource(dzh0.ybsdk_webview_permissions_request_location_permission), new Text.Resource(dzh0.ybsdk_webview_permissions_request_ok_go_settings)), true);

    public WebViewFragment(oq41 oq41Var, ls41 ls41Var, um41 um41Var, iv41 iv41Var, mv41 mv41Var, pv41 pv41Var, AppAnalyticsReporter appAnalyticsReporter, dj51 dj51Var, pu41 pu41Var, r450 r450Var) {
        super(Boolean.FALSE, null, null, null, gv41.class, 14, null);
        this.headersProvider = oq41Var;
        this.webViewConfigProvider = um41Var;
        this.viewModelDeprecatedFactory = iv41Var;
        this.viewModelFactory = mv41Var;
        this.visualParamsProvider = pv41Var;
        this.reporter = appAnalyticsReporter;
        this.webViewFactory = dj51Var;
        this.nativeWebEventsListenerFactory = r450Var;
        this.screenParams = dcs.c(this);
        me1 me1Var = (me1) ls41Var;
        this.downloadPermissionManager = vh91.c(this, downloadPermissionRequest, me1Var.c());
        this.geolocationPermissionManager = new com.ybsdk.feature.webview.internal.utils.a(eja1.s(this), vh91.c(this, locationPermissionRequest, me1Var.c()));
        this.webViewOutlineEnabled = ((x7r0) pu41Var).a();
        this.webViewContext = ((znh) dj51Var).b();
        this.chooseFileActivityLauncher = registerForActivityResult(new j50(), new v50(10, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addWebViewToRoot() {
        ConstraintLayout o = ((j861) getBinding()).o();
        aj51 aj51Var = this.webView;
        o.addView(aj51Var != null ? ((boh) aj51Var).h() : null, 0);
        e eVar = new e();
        eVar.g(((j861) getBinding()).o());
        eVar.j(ech0.ybsdkWebView, 4, 0, 4, 0);
        eVar.j(ech0.ybsdkWebView, 3, ech0.toolbar, 4, 0);
        eVar.b(((j861) getBinding()).o());
        if (this.webViewOutlineEnabled) {
            int generateViewId = View.generateViewId();
            View view = new View(requireContext());
            view.setId(generateViewId);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(OUTLINE_STROKE_PX, -65536);
            view.setBackground(gradientDrawable);
            view.setFocusable(false);
            view.setFocusableInTouchMode(false);
            view.setClickable(false);
            view.setLayoutParams(new ConstraintLayout.LayoutParams(-1, 0));
            view.setVisibility(4);
            this.webViewOutline = view;
            ((j861) getBinding()).o().addView(this.webViewOutline);
            e eVar2 = new e();
            eVar2.g(((j861) getBinding()).o());
            eVar2.j(generateViewId, 3, ech0.ybsdkWebView, 3, 0);
            eVar2.j(generateViewId, 4, ech0.ybsdkWebView, 4, 0);
            eVar2.b(((j861) getBinding()).o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyInsetsOnWebView(n751 insets) {
        u1w f = p7b1.f(insets);
        int i = f.d;
        int v = kp50.v(i);
        int v2 = kp50.v(p7b1.e(insets).d);
        int v3 = kp50.v(f.b);
        if (v2 >= v) {
            v = v2;
        }
        String applyInsetsJsScript = getApplyInsetsJsScript(v3, v);
        int d = rje.d(vvg0.ybsdk_screen_footer_space_error_view, requireContext());
        ErrorView errorView = ((j861) getBinding()).c;
        errorView.setPadding(errorView.getPaddingLeft(), errorView.getPaddingTop(), errorView.getPaddingRight(), d + i);
        aj51 aj51Var = this.webView;
        if (aj51Var != null) {
            ((boh) aj51Var).e(applyInsetsJsScript);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyMarginsOnTopNavButton(n751 insets) {
        int i = p7b1.f(insets).b;
        int d = rje.d(lwg0.ybsdk_view_overlay_dialog_close_icon_marginTop, requireContext());
        CloseButtonView closeButtonView = ((j861) getBinding()).b;
        ViewGroup.LayoutParams layoutParams = closeButtonView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, d + i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        closeButtonView.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void chooseFileActivityLauncher$lambda$2(WebViewFragment webViewFragment, ActivityResult activityResult) {
        ClipData clipData;
        Uri[] e = ((ynh) webViewFragment.webViewContext).e(activityResult.getResultCode(), activityResult.getData());
        if (e == null) {
            Intent data = activityResult.getData();
            if (data == null || (clipData = data.getClipData()) == null) {
                e = null;
            } else {
                d6w n = y6i0.n(0, clipData.getItemCount());
                ArrayList arrayList = new ArrayList(tcc.n(n, 10));
                c6w it = n.iterator();
                while (it.c) {
                    arrayList.add(clipData.getItemAt(it.nextInt()).getUri());
                }
                e = (Uri[]) arrayList.toArray(new Uri[0]);
            }
        }
        gw41 gw41Var = webViewFragment.reporter.v0;
        WebviewEvents$TechWebviewFileChooserResultResult webviewEvents$TechWebviewFileChooserResultResult = activityResult.getResultCode() == -1 ? WebviewEvents$TechWebviewFileChooserResultResult.OK : WebviewEvents$TechWebviewFileChooserResultResult.CANCEL;
        int length = e != null ? e.length : 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechWebviewFileChooserResultResult.getOriginalValue());
        linkedHashMap.put("file_count", Integer.valueOf(length));
        gw41Var.a.a("tech.webview.file_chooser_result", linkedHashMap);
        ri51 ri51Var = webViewFragment.theFilePathCallback;
        if (ri51Var != null) {
            ((qnh) ri51Var).b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void considerPullBarInset() {
        if ((getScreenParams().getAppearanceOption() instanceof WebViewAppearanceOption.NoToolbar) && ((ji41) this.visualParamsProvider).N()) {
            String applyTopInsetJsScript = getApplyTopInsetJsScript(kp50.v(rje.d(vvg0.ybsdk_sliding_view_top_inset_height, requireContext())));
            aj51 aj51Var = this.webView;
            if (aj51Var != null) {
                ((boh) aj51Var).e(applyTopInsetJsScript);
            }
        }
    }

    private final void createWebView() {
        try {
            this.webView = ((znh) this.webViewFactory).a(requireContext());
        } catch (Throwable th) {
            getViewModel().o0(th);
        }
        aj51 aj51Var = this.webView;
        if (aj51Var != null) {
            boh bohVar = (boh) aj51Var;
            WebView h = bohVar.h();
            h.setLayoutParams(new ConstraintLayout.LayoutParams(-1, 0));
            h.setId(ech0.ybsdkWebView);
            h.setVisibility(4);
            com.ybsdk.core.utils.ext.view.b.x(ung0.ybColor_background_primary, h);
            gyc f = bohVar.f();
            f.w();
            f.s(false);
            f.t();
            f.x();
            f.u();
            f.z();
            f.v();
            String q = ((s421) this.headersProvider).q(WebViewHeader.SDK_USER_AGENT);
            if (q == null) {
                ny61.r("User-agent value should be not null");
                return;
            }
            f.A(f.p() + " " + q);
            bohVar.n(webViewClient(requireContext()));
            bohVar.m(webChromeClient());
            setupDownloadLogic(getActivity(), aj51Var);
            setupWebEventsListener(aj51Var);
        }
    }

    private final String getApplyInsetsJsScript(int safeInsetTop, int safeInsetBottom) {
        return vuu0.c("\n        document.documentElement.style.setProperty('--android-safe-area-inset-top', '" + safeInsetTop + "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-bottom', '" + safeInsetBottom + "px');\n        ");
    }

    private final String getApplyTopInsetJsScript(int safeInsetTop) {
        return vuu0.c("\n        document.documentElement.style.setProperty('--android-safe-area-inset-top', '" + safeInsetTop + "px');\n        ");
    }

    private final WebViewScreenParams getScreenParams() {
        return (WebViewScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$3(WebViewFragment webViewFragment) {
        if (webViewFragment.webView == null) {
            webViewFragment.createWebView();
            aj51 aj51Var = webViewFragment.webView;
            if (aj51Var != null) {
                webViewFragment.setWebViewTheme(((boh) aj51Var).f());
                webViewFragment.addWebViewToRoot();
                webViewFragment.getViewModel().p0();
            }
        } else {
            webViewFragment.getViewModel().m0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onShowFileChooser(ri51 filePathCallback, pi51 fileChooserParams) {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        qyq qyqVar = FileChooserActivity.Companion;
        String url = getScreenParams().getUrl();
        qyqVar.getClass();
        Intent a = qyq.a(context, fileChooserParams, url);
        if (a == null) {
            return false;
        }
        this.theFilePathCallback = filePathCallback;
        jla1.i(this.chooseFileActivityLauncher, a);
        return true;
    }

    private final void removeJavascriptInterfaces(aj51 webView) {
        ((boh) webView).k("nativeYB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$23$lambda$19(ov41 ov41Var, stz0 stz0Var) {
        return stz0.a(stz0Var, g8e.i(Text.Companion, ov41Var.b()), null, null, null, null, null, false, false, null, null, 0, 32766);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$23$lambda$21(WebViewFragment webViewFragment) {
        aj51 aj51Var = webViewFragment.webView;
        if (aj51Var != null) {
            ((boh) aj51Var).h().setVisibility(0);
        }
    }

    private final void renderNavBar() {
        if (!this.webViewOutlineEnabled || fitsSystemWindow()) {
            return;
        }
        setNavigationBarColorModel(new z1x0(new ColorModel.Raw(cob1.a(getNavigationBarColorModel().b().get(requireContext()), 0.8f))));
    }

    private final void renderStatusBar() {
        WebViewStatusBar statusBar = getScreenParams().getStatusBar();
        if (statusBar != null) {
            setStatusBarColorModel(fitsSystemWindow() ? new z1x0(statusBar.getColor(), statusBar.getIconsColor()) : new z1x0(y1x0.c(), statusBar.getIconsColor()));
        } else {
            if (!this.webViewOutlineEnabled || fitsSystemWindow()) {
                return;
            }
            setStatusBarColorModel(new z1x0(y1x0.c()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar() {
        WebViewAppearanceOption appearanceOption = getScreenParams().getAppearanceOption();
        WebViewControl control = appearanceOption.getControl();
        boolean z = appearanceOption instanceof WebViewAppearanceOption.ShowToolbar;
        com.ybsdk.core.utils.ext.view.b.c(((j861) getBinding()).e, z, 0L, 0, 0L, null, 30);
        if (!(appearanceOption instanceof WebViewAppearanceOption.NoToolbar)) {
            if (!z) {
                w511.b();
                return;
            }
            ((j861) getBinding()).e.render(new e331(15, appearanceOption, control));
            if ((control != null ? control.getType() : null) == WebViewControl.Type.ARROW) {
                setBackButtonColor(Integer.valueOf(control.getColor().get(requireContext())));
                return;
            }
            return;
        }
        WebViewControl.Type type = control != null ? control.getType() : null;
        int i = type == null ? -1 : fq41.a[type.ordinal()];
        if (i != -1) {
            if (i == 1) {
                CloseButtonView closeButtonView = ((j861) getBinding()).b;
                com.ybsdk.core.utils.ext.view.b.z(closeButtonView, control.getColor().get(requireContext()));
                com.ybsdk.core.utils.ext.view.b.A(closeButtonView);
            } else if (i == 2) {
                setBackButtonColor(Integer.valueOf(control.getColor().get(requireContext())));
            } else {
                w511.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 renderToolbar$lambda$27(WebViewAppearanceOption webViewAppearanceOption, WebViewControl webViewControl, stz0 stz0Var) {
        ColorModel color = ((WebViewAppearanceOption.ShowToolbar) webViewAppearanceOption).getColor();
        WebViewControl.Type type = webViewControl != null ? webViewControl.getType() : null;
        return stz0.a(stz0Var, null, null, color, null, null, (type == null ? -1 : fq41.a[type.ordinal()]) == 1 ? new ntz0(webViewControl.getColor()) : qtz0.a, false, false, null, null, 0, 32731);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setOnControlClickListenerIfNeeded() {
        WebViewAppearanceOption appearanceOption = getScreenParams().getAppearanceOption();
        WebViewControl control = appearanceOption.getControl();
        int i = 1;
        if (appearanceOption instanceof WebViewAppearanceOption.NoToolbar) {
            if ((control != null ? control.getType() : null) == WebViewControl.Type.CROSS) {
                ((j861) getBinding()).b.setOnClickListener(new aq41(i, this));
            }
        } else {
            if (!(appearanceOption instanceof WebViewAppearanceOption.ShowToolbar)) {
                w511.b();
                return;
            }
            if ((control != null ? control.getType() : null) == WebViewControl.Type.CROSS) {
                ((j861) getBinding()).e.setOnCloseButtonClickListener(new zp41(this, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnControlClickListenerIfNeeded$lambda$14(WebViewFragment webViewFragment, View view) {
        webViewFragment.getViewModel().i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnControlClickListenerIfNeeded$lambda$15(WebViewFragment webViewFragment) {
        webViewFragment.getViewModel().i0();
        return zy11.a;
    }

    private final void setWebViewTheme(zi51 zi51Var) {
        try {
            boolean f = lob1.f(requireContext());
            if (((gyc) zi51Var).B(f) || isWebViewWarningShowed || !f) {
                return;
            }
            Context requireContext = requireContext();
            Toast.makeText(requireContext, d.a(requireContext, new Text.Resource(dzh0.ybsdk_webview_low_version_warning)), 1).show();
            isWebViewWarningShowed = true;
            String c = ((ynh) this.webViewContext).c(requireContext());
            gw41 gw41Var = this.reporter.v0;
            if (c == null) {
                c = "Unknown";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("version", c);
            gw41Var.a.a("tech.webview.old_version", linkedHashMap);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [yp41] */
    private final void setupDownloadLogic(FragmentActivity activity, final aj51 webView) {
        if (activity == null) {
            return;
        }
        final int i = 1;
        j0g j0gVar = new j0g(activity, new tls(this) { // from class: yp41
            public final /* synthetic */ WebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i2 = i;
                aj51 aj51Var = webView;
                WebViewFragment webViewFragment = this.b;
                String str = (String) obj;
                switch (i2) {
                    case 0:
                        zy11Var = WebViewFragment.setupDownloadLogic$lambda$34$lambda$33(webViewFragment, aj51Var, str);
                        return zy11Var;
                    default:
                        zy11Var2 = WebViewFragment.setupDownloadLogic$lambda$30(webViewFragment, aj51Var, str);
                        return zy11Var2;
                }
            }
        });
        DownloadBlobFileJSInterface downloadBlobFileJSInterface = new DownloadBlobFileJSInterface(activity, j0gVar, eja1.s(this));
        downloadBlobFileJSInterface.c(webView);
        FragmentActivity requireActivity = requireActivity();
        eja1.s(this);
        final int i2 = 0;
        ((boh) webView).l(new mo41(requireActivity, this.downloadPermissionManager, ((ynh) this.webViewContext).a(), j0gVar, new ays0(27, downloadBlobFileJSInterface, webView), new jvx0(28, downloadBlobFileJSInterface), new tls(this) { // from class: yp41
            public final /* synthetic */ WebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i22 = i2;
                aj51 aj51Var = webView;
                WebViewFragment webViewFragment = this.b;
                String str = (String) obj;
                switch (i22) {
                    case 0:
                        zy11Var = WebViewFragment.setupDownloadLogic$lambda$34$lambda$33(webViewFragment, aj51Var, str);
                        return zy11Var;
                    default:
                        zy11Var2 = WebViewFragment.setupDownloadLogic$lambda$30(webViewFragment, aj51Var, str);
                        return zy11Var2;
                }
            }
        }));
        this.downloadJSInterface = downloadBlobFileJSInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupDownloadLogic$lambda$30(WebViewFragment webViewFragment, aj51 aj51Var, String str) {
        webViewFragment.getViewModel().j0(jl40.l(str, ((boh) aj51Var).g()));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupDownloadLogic$lambda$34$lambda$31(DownloadBlobFileJSInterface downloadBlobFileJSInterface, aj51 aj51Var, String str, String str2, String str3) {
        downloadBlobFileJSInterface.a(aj51Var, str, str2, str3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupDownloadLogic$lambda$34$lambda$32(DownloadBlobFileJSInterface downloadBlobFileJSInterface, String str, String str2, String str3) {
        downloadBlobFileJSInterface.b(str, str2, str3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupDownloadLogic$lambda$34$lambda$33(WebViewFragment webViewFragment, aj51 aj51Var, String str) {
        webViewFragment.getViewModel().l0(jl40.l(str, ((boh) aj51Var).g()));
        return zy11.a;
    }

    private final void setupWebEventsListener(aj51 webView) {
        boh bohVar = (boh) webView;
        bohVar.a(((s450) this.nativeWebEventsListenerFactory).a(getViewModel()), "nativeYB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String subscribeOnPostMessages() {
        return "window.parent.addEventListener(\n    'message',\n    function(e) {\n        nativeYB.postMessage(JSON.stringify(e.data))\n    }\n)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateControls(ov41 viewState) {
        WebViewControl control = getScreenParams().getAppearanceOption().getControl();
        boolean z = (control != null ? control.getType() : null) == WebViewControl.Type.ARROW || ((control != null ? control.getType() : null) == null && (viewState.c() || viewState.a() != null));
        if (getIsBackButtonVisible() != z) {
            Runnable runnable = this.hideBackButtonCallback;
            if (runnable != null) {
                getHandler().removeCallbacks(runnable);
            }
            this.hideBackButtonCallback = null;
            rg3 rg3Var = new rg3(this, z, 14);
            if (z) {
                rg3Var.run();
            } else {
                this.hideBackButtonCallback = rg3Var;
                getHandler().postDelayed(rg3Var, 150L);
            }
        }
    }

    private final si51 webChromeClient() {
        return new aj31(11, this);
    }

    private final yi51 webViewClient(Context context) {
        return new a(context, this);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        aj51 aj51Var;
        aj51 aj51Var2;
        if (sideEffect instanceof fv41) {
            fv41 fv41Var = (fv41) sideEffect;
            if (fv41Var instanceof ev41) {
                ev41 ev41Var = (ev41) sideEffect;
                this.reporter.v0.c("before", ev41Var.b(), null);
                aj51 aj51Var3 = this.webView;
                if (aj51Var3 != null) {
                    ((boh) aj51Var3).j(ev41Var.b(), ev41Var.a());
                    return;
                }
                return;
            }
            if (fv41Var.equals(cv41.a)) {
                aj51 aj51Var4 = this.webView;
                if (aj51Var4 != null) {
                    ((boh) aj51Var4).c();
                    return;
                }
                return;
            }
            if (!(fv41Var instanceof dv41)) {
                w511.b();
                return;
            }
            if (!fitsSystemWindow()) {
                considerPullBarInset();
                requireView().requestApplyInsets();
            }
            ((ynh) this.webViewContext).a().a();
            if (!getScreenParams().getOpenKeyboardOnLoad() || (aj51Var = this.webView) == null || !((boh) aj51Var).h().requestFocus() || (aj51Var2 = this.webView) == null) {
                return;
            }
            lcb1.f(((boh) aj51Var2).h());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public gv41 getFactoryOfViewModel() {
        boolean g = ((if8) this.webViewConfigProvider).g();
        AppAnalyticsReporter appAnalyticsReporter = this.reporter;
        if (g) {
            gw41 gw41Var = appAnalyticsReporter.v0;
            WebviewEvents$TechWebviewViewModelVersionVersion webviewEvents$TechWebviewViewModelVersionVersion = WebviewEvents$TechWebviewViewModelVersionVersion.V2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("version", webviewEvents$TechWebviewViewModelVersionVersion.getOriginalValue());
            gw41Var.a.a("tech.webview.view_model.version", linkedHashMap);
            return ((nv41) this.viewModelFactory).a(getScreenParams().getUrl(), getScreenParams());
        }
        gw41 gw41Var2 = appAnalyticsReporter.v0;
        WebviewEvents$TechWebviewViewModelVersionVersion webviewEvents$TechWebviewViewModelVersionVersion2 = WebviewEvents$TechWebviewViewModelVersionVersion.DEPRECATED;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put("version", webviewEvents$TechWebviewViewModelVersionVersion2.getOriginalValue());
        gw41Var2.a.a("tech.webview.view_model.version", linkedHashMap2);
        return ((kv41) this.viewModelDeprecatedFactory).a(getScreenParams().getUrl(), getScreenParams());
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        Boolean fitsSystemWindow = getScreenParams().getFitsSystemWindow();
        if (fitsSystemWindow != null) {
            return fitsSystemWindow.booleanValue();
        }
        WebViewAppearanceOption appearanceOption = getScreenParams().getAppearanceOption();
        if (appearanceOption instanceof WebViewAppearanceOption.NoToolbar) {
            return false;
        }
        if (appearanceOption instanceof WebViewAppearanceOption.ShowToolbar) {
            return true;
        }
        w511.b();
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public j861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        j861 p = j861.p(inflater, container);
        p.c.setPrimaryButtonOnClickListener(new zp41(this, 0));
        return p;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        if (getIsNewInsetsHandlingEnabled() && fitsSystemWindow()) {
            return super.onApplyInsets(insets);
        }
        if (!fitsSystemWindow()) {
            applyMarginsOnTopNavButton(insets);
            applyInsetsOnWebView(insets);
        }
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        pey o;
        Lifecycle lifecycle;
        Lifecycle.State b;
        View view = getView();
        if (view == null || (o = vng.o(view)) == null || (lifecycle = o.getLifecycle()) == null || (b = lifecycle.b()) == null || !b.a(Lifecycle.State.CREATED)) {
            return false;
        }
        if (((j861) getBinding()).c.getVisibility() == 0) {
            getViewModel().i0();
            return true;
        }
        aj51 aj51Var = this.webView;
        if (aj51Var == null || !((boh) aj51Var).b()) {
            return false;
        }
        aj51 aj51Var2 = this.webView;
        if (aj51Var2 != null) {
            ((boh) aj51Var2).i();
        }
        return true;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        gw41 gw41Var = this.reporter.v0;
        String c = ((ynh) this.webViewContext).c(requireContext());
        String d = ((ynh) this.webViewContext).d(requireContext());
        String b = ((ynh) this.webViewContext).b(requireContext());
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (c != null) {
            linkedHashMap.put("version", c);
        }
        if (d != null) {
            linkedHashMap.put("version_code", d);
        }
        if (b != null) {
            linkedHashMap.put("package_name", b);
        }
        gw41Var.a.a("tech.webview.version", linkedHashMap);
        if (this.webView == null) {
            createWebView();
        }
        aj51 aj51Var = this.webView;
        if (aj51Var != null) {
            setWebViewTheme(((boh) aj51Var).f());
            addWebViewToRoot();
        }
        return onCreateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getScreenParams().getCloseCallback().onCloseCallback();
        if (getScreenParams().getShowAsOverlay()) {
            ?? r0 = this;
            while (true) {
                if (r0 == 0) {
                    xx60 activity = getActivity();
                    if (!(activity instanceof bnp0)) {
                        activity = null;
                    }
                    bnp0 bnp0Var = (bnp0) activity;
                    r0 = bnp0Var == null ? 0 : bnp0Var;
                } else if (r0 instanceof bnp0) {
                    break;
                } else {
                    r0 = r0.getParentFragment();
                }
            }
            bnp0 bnp0Var2 = (bnp0) r0;
            if (bnp0Var2 != null) {
                bnp0Var2.setGripVisible(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Runnable runnable = this.hideBackButtonCallback;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
        }
        Runnable runnable2 = this.showWebViewCallback;
        if (runnable2 != null) {
            getHandler().removeCallbacks(runnable2);
        }
        this.hideBackButtonCallback = null;
        this.showWebViewCallback = null;
        aj51 aj51Var = this.webView;
        if (aj51Var != null) {
            if (this.downloadJSInterface != null) {
                DownloadBlobFileJSInterface.d(aj51Var);
            }
            this.downloadJSInterface = null;
            removeJavascriptInterfaces(aj51Var);
            ((j861) getBinding()).o().removeView(((boh) aj51Var).h());
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        aj51 aj51Var = this.webView;
        if (aj51Var != null) {
            ((boh) aj51Var).d();
        }
        this.webView = null;
    }

    @Override // defpackage.mt31
    public void onShownInViewPager() {
        getViewModel().n0(this.webView != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.fragment.app.Fragment] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getScreenParams().getShowAsOverlay()) {
            ?? r2 = this;
            while (true) {
                if (r2 == 0) {
                    xx60 activity = getActivity();
                    if (!(activity instanceof bnp0)) {
                        activity = null;
                    }
                    r2 = (bnp0) activity;
                    if (r2 == 0) {
                        r2 = 0;
                    }
                } else if (r2 instanceof bnp0) {
                    break;
                } else {
                    r2 = r2.getParentFragment();
                }
            }
            bnp0 bnp0Var = (bnp0) r2;
            if (bnp0Var != null) {
                bnp0Var.setGripVisible(false);
            }
        }
        setOnControlClickListenerIfNeeded();
        if (this.webView != null) {
            getViewModel().p0();
            considerPullBarInset();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ov41 viewState) {
        j861 j861Var = (j861) getBinding();
        ErrorView errorView = j861Var.c;
        View view = j861Var.d;
        errorView.render(viewState.a());
        j861Var.e.render(new qq31(12, viewState));
        ov41 ov41Var = this.previousViewSate;
        if (ov41Var == null || ov41Var.d() != viewState.d()) {
            Runnable runnable = this.showWebViewCallback;
            if (runnable != null) {
                getHandler().removeCallbacks(runnable);
            }
            this.showWebViewCallback = null;
            if (!viewState.d() || fitsSystemWindow()) {
                aj51 aj51Var = this.webView;
                if (aj51Var != null) {
                    ((boh) aj51Var).h().setVisibility(!viewState.d() ? 4 : 0);
                }
            } else {
                ((j861) getBinding()).o().requestApplyInsets();
                jy31 jy31Var = new jy31(5, this);
                this.showWebViewCallback = jy31Var;
                getHandler().postDelayed(jy31Var, 100L);
            }
        }
        j861Var.f.setVisibility(viewState.c() ? 0 : 8);
        if ((getScreenParams().getAppearanceOption() instanceof WebViewAppearanceOption.NoToolbar) || !((ji41) this.visualParamsProvider).N() || getIsNewInsetsHandlingEnabled()) {
            view.setVisibility(8);
        } else {
            view.setVisibility(viewState.d() ? 0 : 4);
        }
        if (viewState.d()) {
            renderToolbar();
            renderStatusBar();
            renderNavBar();
            gob1.a(view, getScreenParams().getGripBackground());
            View view2 = this.webViewOutline;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        updateControls(viewState);
        this.previousViewSate = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
