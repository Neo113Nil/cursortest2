package com.yandex.plus.home.feature.webviews.internal.stories;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import com.yandex.plus.home.pay.PayError;
import com.yandex.plus.ui.core.theme.PlusTheme;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.aou0;
import defpackage.b450;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bou0;
import defpackage.cl41;
import defpackage.dl41;
import defpackage.el41;
import defpackage.emh0;
import defpackage.en;
import defpackage.ffx;
import defpackage.fn;
import defpackage.g0d0;
import defpackage.g8r0;
import defpackage.gje;
import defpackage.gov;
import defpackage.gsd0;
import defpackage.gw00;
import defpackage.hh31;
import defpackage.hn;
import defpackage.hnr0;
import defpackage.i3y;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.in;
import defpackage.j4n;
import defpackage.jqr;
import defpackage.jy31;
import defpackage.kd5;
import defpackage.kgx;
import defpackage.lld0;
import defpackage.lz40;
import defpackage.npu;
import defpackage.nsu;
import defpackage.ow31;
import defpackage.pey;
import defpackage.qoi0;
import defpackage.qq31;
import defpackage.qs90;
import defpackage.skd0;
import defpackage.sls;
import defpackage.szg;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u1w;
import defpackage.u350;
import defpackage.v9h0;
import defpackage.vg;
import defpackage.vng;
import defpackage.vvq0;
import defpackage.wv5;
import defpackage.x350;
import defpackage.xk41;
import defpackage.y17;
import defpackage.y4;
import defpackage.y821;
import defpackage.yqb0;
import defpackage.z2d0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0004\u0094\u0001\u0097\u0001\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0081\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J/\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u00020)2\u0006\u0010.\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020)2\u0006\u00105\u001a\u00020\n¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020)2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020)2\u0006\u0010<\u001a\u00020#H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010=\u001a\u00020)2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b=\u0010AJ\u0017\u0010C\u001a\u00020)2\u0006\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u00107J\u000f\u0010D\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020)H\u0014¢\u0006\u0004\bF\u0010-J\u000f\u0010G\u001a\u00020)H\u0014¢\u0006\u0004\bG\u0010-J\u000f\u0010H\u001a\u00020)H\u0016¢\u0006\u0004\bH\u0010-J\u000f\u0010I\u001a\u00020)H\u0016¢\u0006\u0004\bI\u0010-J\u0019\u0010K\u001a\u00020)2\b\u0010J\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\bK\u0010>J\u0019\u0010L\u001a\u00020)2\b\u0010J\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\bL\u0010>J\u0017\u0010O\u001a\u00020)2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020)2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020)H\u0016¢\u0006\u0004\bU\u0010-J\u000f\u0010V\u001a\u00020)H\u0016¢\u0006\u0004\bV\u0010-J\u000f\u0010W\u001a\u00020)H\u0016¢\u0006\u0004\bW\u0010-J\u000f\u0010X\u001a\u00020)H\u0016¢\u0006\u0004\bX\u0010-J\u0017\u0010[\u001a\u00020)2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020)¢\u0006\u0004\b]\u0010-J\u0017\u0010_\u001a\u00020)2\u0006\u0010^\u001a\u00020\nH\u0002¢\u0006\u0004\b_\u00107J\u000f\u0010`\u001a\u00020)H\u0002¢\u0006\u0004\b`\u0010-J\u0017\u0010a\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020)H\u0002¢\u0006\u0004\bc\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010gR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010hR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010jR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010lR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010mR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010nR\u001a\u0010p\u001a\u00020o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u0002080t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001d\u0010x\u001a\b\u0012\u0004\u0012\u0002080w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001d\u0010\u0081\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0086\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0089\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010~\u001a\u0006\b\u0088\u0001\u0010\u0085\u0001R \u0010\u008c\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010~\u001a\u0006\b\u008b\u0001\u0010\u0085\u0001R \u0010\u008f\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010~\u001a\u0006\b\u008e\u0001\u0010\u0085\u0001R \u0010\u0092\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010~\u001a\u0006\b\u0091\u0001\u0010\u0085\u0001R\u0019\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R!\u0010\u009f\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010¤\u0001\u001a\u00030 \u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u009c\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u009c\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u009c\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010³\u0001\u001a\u00030¯\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b°\u0001\u0010\u009c\u0001\u001a\u0006\b±\u0001\u0010²\u0001¨\u0006´\u0001"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/stories/WebStoriesView;", "Landroid/widget/LinearLayout;", "Lxk41;", "Lgje;", "Landroid/content/Context;", "context", "Lcom/yandex/plus/home/feature/webviews/internal/stories/e;", "presenter", "Lvg;", "accessibilityFocusController", "", "isNestedScrollEnabled", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lx350;", "nativePayButtonPresenter", "Llld0;", "stringsResolver", "Lz2d0;", "errorViewProvider", "Low31;", "viewVisibilityAnimator", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "Lu1w;", "insets", "Lbou0;", "storiesWebViewControllerDelegateFactory", "isSingleStory", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "webViewsRouter", "Len;", "buttonSectionContainerViewControllerFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/plus/home/feature/webviews/internal/stories/e;Lvg;ZLcom/yandex/plus/ui/core/theme/PlusTheme;Lx350;Llld0;Lz2d0;Low31;Lcom/yandex/plus/core/strings/PlusSdkBrandType;Lu1w;Lbou0;ZLcom/yandex/plus/home/feature/webviews/internal/container/b;Len;)V", "", "url", "storiesData", "", "Lcom/yandex/plus/home/feature/webviews/internal/network/a;", "headers", "Lzy11;", "openUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "showContent", "()V", "isSelected", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$StoryNavigationType;", "tapDirection", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$MiniStoryControlType;", "controlType", "setStorySelected", "(ZLcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$StoryNavigationType;Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$MiniStoryControlType;)V", "isFullyVisible", "setIsFullyVisible", "(Z)V", "Lcom/yandex/plus/home/feature/webviews/internal/stories/StoryNavigation;", "direction", "navigateStory", "(Lcom/yandex/plus/home/feature/webviews/internal/stories/StoryNavigation;)V", "jsonEventString", "sendMessage", "(Ljava/lang/String;)V", "Lgov;", "inMessage", "(Lgov;)V", "animate", "dismiss", "onBackPressed", "()Z", "onAttachedToWindow", "onDetachedFromWindow", "onResume", "onPause", Constants.KEY_MESSAGE, "showError", "showWebServiceInfo", "Lu350;", "payButtonConfig", "showNativePayButton", "(Lu350;)V", "Lcom/yandex/plus/home/pay/PayError;", "payError", "showNativePayError", "(Lcom/yandex/plus/home/pay/PayError;)V", "showHostBuyView", "hideHostBuyView", "hideNativePayButton", "onStoryVisible", "", "vibrateConstant", "performVibrate", "(I)V", "setAudioMuted", BackendConfig.Restrictions.ENABLED, "setNestedScrollEnabled", "hideLoading", "applyInsets", "(Lu1w;)V", "forceUpdateAccessibilityFocus", "Lcom/yandex/plus/home/feature/webviews/internal/stories/e;", "Lvg;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "Lx350;", "Llld0;", "Lz2d0;", "Low31;", "Lbou0;", "Z", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "Len;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Llz40;", "storyNavigationMutableSharedFlow", "Llz40;", "Lhnr0;", "storyNavigationSharedFlow", "Lhnr0;", "getStoryNavigationSharedFlow", "()Lhnr0;", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "Lwv5;", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Landroid/view/ViewGroup;", "storiesLoading$delegate", "getStoriesLoading", "()Landroid/view/ViewGroup;", "storiesLoading", "errorLayout$delegate", "getErrorLayout", "errorLayout", "nativePayLayout$delegate", "getNativePayLayout", "nativePayLayout", "hostPayContainer$delegate", "getHostPayContainer", "hostPayContainer", "acqSdkButtonSectionContainer$delegate", "getAcqSdkButtonSectionContainer", "acqSdkButtonSectionContainer", "Ljava/lang/String;", "com/yandex/plus/home/feature/webviews/internal/stories/f", "commonWebViewContractEventListener", "Lcom/yandex/plus/home/feature/webviews/internal/stories/f;", "el41", "storiesWebViewContractEventListener", "Lel41;", "Laou0;", "webViewController$delegate", "Li3y;", "getWebViewController", "()Laou0;", "webViewController", "Lfn;", "acqSdkButtonSectionContainerViewController$delegate", "getAcqSdkButtonSectionContainerViewController", "()Lfn;", "acqSdkButtonSectionContainerViewController", "Lb450;", "nativePayButtonViewController$delegate", "getNativePayButtonViewController", "()Lb450;", "nativePayButtonViewController", "Lqs90;", "hostPayAnimationController$delegate", "getHostPayAnimationController", "()Lqs90;", "hostPayAnimationController", "Lnpu;", "errorViewController$delegate", "getErrorViewController", "()Lnpu;", "errorViewController", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebStoriesView extends LinearLayout implements xk41, gje {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", WebStoriesView.class), b64.x(qoi0.a, WebStoriesView.class, "storiesLoading", "getStoriesLoading()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl("errorLayout", 0, "getErrorLayout()Landroid/view/ViewGroup;", WebStoriesView.class), new PropertyReference1Impl("nativePayLayout", 0, "getNativePayLayout()Landroid/view/ViewGroup;", WebStoriesView.class), new PropertyReference1Impl("hostPayContainer", 0, "getHostPayContainer()Landroid/view/ViewGroup;", WebStoriesView.class), new PropertyReference1Impl("acqSdkButtonSectionContainer", 0, "getAcqSdkButtonSectionContainer()Landroid/view/ViewGroup;", WebStoriesView.class)};
    private final vg accessibilityFocusController;

    /* renamed from: acqSdkButtonSectionContainer$delegate, reason: from kotlin metadata */
    private final wv5 acqSdkButtonSectionContainer;

    /* renamed from: acqSdkButtonSectionContainerViewController$delegate, reason: from kotlin metadata */
    private final i3y acqSdkButtonSectionContainerViewController;
    private final en buttonSectionContainerViewControllerFactory;
    private final f commonWebViewContractEventListener;

    /* renamed from: errorLayout$delegate, reason: from kotlin metadata */
    private final wv5 errorLayout;

    /* renamed from: errorViewController$delegate, reason: from kotlin metadata */
    private final i3y errorViewController;
    private final z2d0 errorViewProvider;

    /* renamed from: hostPayAnimationController$delegate, reason: from kotlin metadata */
    private final i3y hostPayAnimationController;

    /* renamed from: hostPayContainer$delegate, reason: from kotlin metadata */
    private final wv5 hostPayContainer;
    private final boolean isSingleStory;
    private final x350 nativePayButtonPresenter;

    /* renamed from: nativePayButtonViewController$delegate, reason: from kotlin metadata */
    private final i3y nativePayButtonViewController;

    /* renamed from: nativePayLayout$delegate, reason: from kotlin metadata */
    private final wv5 nativePayLayout;
    private final e presenter;
    private String storiesData;

    /* renamed from: storiesLoading$delegate, reason: from kotlin metadata */
    private final wv5 storiesLoading;
    private final el41 storiesWebViewContractEventListener;
    private final bou0 storiesWebViewControllerDelegateFactory;
    private final lz40 storyNavigationMutableSharedFlow;
    private final hnr0 storyNavigationSharedFlow;
    private final lld0 stringsResolver;
    private final PlusTheme theme;
    private final View view;
    private final ow31 viewVisibilityAnimator;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final wv5 webViewContainer;

    /* renamed from: webViewController$delegate, reason: from kotlin metadata */
    private final i3y webViewController;
    private final com.yandex.plus.home.feature.webviews.internal.container.b webViewsRouter;

    public WebStoriesView(Context context, e eVar, vg vgVar, boolean z, PlusTheme plusTheme, x350 x350Var, lld0 lld0Var, z2d0 z2d0Var, ow31 ow31Var, PlusSdkBrandType plusSdkBrandType, u1w u1wVar, bou0 bou0Var, boolean z2, com.yandex.plus.home.feature.webviews.internal.container.b bVar, en enVar) {
        super(context);
        this.presenter = eVar;
        this.accessibilityFocusController = vgVar;
        this.theme = plusTheme;
        this.nativePayButtonPresenter = x350Var;
        this.stringsResolver = lld0Var;
        this.errorViewProvider = z2d0Var;
        this.viewVisibilityAnimator = ow31Var;
        this.storiesWebViewControllerDelegateFactory = bou0Var;
        this.isSingleStory = z2;
        this.webViewsRouter = bVar;
        this.buttonSectionContainerViewControllerFactory = enVar;
        this.view = this;
        int i = 0;
        int i2 = 1;
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.storyNavigationMutableSharedFlow = c;
        this.storyNavigationSharedFlow = kotlinx.coroutines.flow.e.c(c);
        this.webViewContainer = new wv5(new dl41(this, v9h0.stories_web_view_contracts_container, i));
        this.storiesLoading = new wv5(new dl41(this, v9h0.stories_loading, i2));
        int i3 = 2;
        this.errorLayout = new wv5(new dl41(this, v9h0.web_stories_view_error_layout, i3));
        int i4 = 3;
        this.nativePayLayout = new wv5(new dl41(this, v9h0.plus_sdk_stories_native_pay_layout, i4));
        this.hostPayContainer = new wv5(new dl41(this, v9h0.plus_sdk_stories_host_pay_container, 4));
        this.acqSdkButtonSectionContainer = new wv5(new dl41(this, v9h0.plus_sdk_home_acquisition_sdk_button_section_container, 5));
        this.commonWebViewContractEventListener = new f(this);
        this.storiesWebViewContractEventListener = new el41(this);
        this.webViewController = kotlin.a.a(new cl41(this, i));
        this.acqSdkButtonSectionContainerViewController = kotlin.a.a(new cl41(this, i2));
        this.nativePayButtonViewController = kotlin.a.a(new hh31(12, this, plusSdkBrandType));
        this.hostPayAnimationController = kotlin.a.a(new cl41(this, i3));
        this.errorViewController = kotlin.a.a(new cl41(this, i4));
        skd0.e(PlusLogTag.UI, "init()");
        bb1.v(this, emh0.plus_sdk_web_view_stories, true);
        setNestedScrollEnabled(z);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        applyInsets(u1wVar);
        setLayerType(2, null);
        vgVar.b(getWebViewContainer().getWebView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fn acqSdkButtonSectionContainerViewController_delegate$lambda$3(WebStoriesView webStoriesView) {
        j4n j4nVar = (j4n) webStoriesView.buttonSectionContainerViewControllerFactory;
        return new hn(webStoriesView.getAcqSdkButtonSectionContainer(), (sls) j4nVar.a, (in) j4nVar.b, (y17) j4nVar.c, (PropertyReference0Impl) j4nVar.x, (ijd0) j4nVar.y, (imd0) j4nVar.z, (y821) j4nVar.w);
    }

    private final void applyInsets(u1w insets) {
        skd0.b(PlusLogTag.SDK, "WebStoriesView.applyInsets(" + insets + ')');
        ViewGroup storiesLoading = getStoriesLoading();
        int i = insets.a;
        int i2 = insets.b;
        int i3 = insets.c;
        int i4 = insets.d;
        storiesLoading.setPadding(i, i2, i3, i4);
        ViewGroup errorLayout = getErrorLayout();
        int i5 = insets.a;
        errorLayout.setPadding(i5, i2, i3, i4);
        ViewGroup nativePayLayout = getNativePayLayout();
        nativePayLayout.setPadding(i5, nativePayLayout.getPaddingTop(), i3, i4);
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.setPadding(i5, hostPayContainer.getPaddingTop(), i3, i4);
        ViewGroup acqSdkButtonSectionContainer = getAcqSdkButtonSectionContainer();
        acqSdkButtonSectionContainer.setPadding(i5, acqSdkButtonSectionContainer.getPaddingTop(), i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final npu errorViewController_delegate$lambda$6(WebStoriesView webStoriesView) {
        return new npu(webStoriesView.getErrorLayout(), webStoriesView.errorViewProvider, webStoriesView.viewVisibilityAnimator, new WebStoriesView$errorViewController$2$1(0, webStoriesView.presenter, e.class, "onRetryClick", "onRetryClick()V", 0));
    }

    private final void forceUpdateAccessibilityFocus() {
        vg vgVar = this.accessibilityFocusController;
        WebView webView = getWebViewContainer().getWebView();
        vgVar.getClass();
        vg.a(webView);
    }

    private final ViewGroup getAcqSdkButtonSectionContainer() {
        return (ViewGroup) this.acqSdkButtonSectionContainer.a($$delegatedProperties[5]);
    }

    private final fn getAcqSdkButtonSectionContainerViewController() {
        return (fn) this.acqSdkButtonSectionContainerViewController.getValue();
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.errorLayout.a($$delegatedProperties[2]);
    }

    private final npu getErrorViewController() {
        return (npu) this.errorViewController.getValue();
    }

    private final qs90 getHostPayAnimationController() {
        return (qs90) this.hostPayAnimationController.getValue();
    }

    private final ViewGroup getHostPayContainer() {
        return (ViewGroup) this.hostPayContainer.a($$delegatedProperties[4]);
    }

    private final b450 getNativePayButtonViewController() {
        return (b450) this.nativePayButtonViewController.getValue();
    }

    private final ViewGroup getNativePayLayout() {
        return (ViewGroup) this.nativePayLayout.a($$delegatedProperties[3]);
    }

    private final ViewGroup getStoriesLoading() {
        return (ViewGroup) this.storiesLoading.a($$delegatedProperties[1]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aou0 getWebViewController() {
        return (aou0) this.webViewController.getValue();
    }

    private final void hideLoading() {
        getStoriesLoading().animate().alpha(0.0f).withEndAction(new jy31(3, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideLoading$lambda$9(WebStoriesView webStoriesView) {
        webStoriesView.getStoriesLoading().setAlpha(1.0f);
        webStoriesView.getStoriesLoading().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qs90 hostPayAnimationController_delegate$lambda$5(WebStoriesView webStoriesView) {
        return new qs90(webStoriesView.getHostPayContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b450 nativePayButtonViewController_delegate$lambda$4(WebStoriesView webStoriesView, PlusSdkBrandType plusSdkBrandType) {
        return new b450(webStoriesView.theme, webStoriesView.getNativePayLayout(), webStoriesView.presenter, webStoriesView.nativePayButtonPresenter, webStoriesView.stringsResolver, plusSdkBrandType);
    }

    private final void setNestedScrollEnabled(boolean enabled) {
        getWebViewController().b.getWebView().setNestedScrollingEnabled(enabled);
    }

    public static /* synthetic */ void setStorySelected$default(WebStoriesView webStoriesView, boolean z, InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType, InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType, int i, Object obj) {
        if ((i & 2) != 0) {
            inMessage$StoryIsVisibleEvent$StoryNavigationType = InMessage$StoryIsVisibleEvent$StoryNavigationType.UNDEFINED;
        }
        if ((i & 4) != 0) {
            inMessage$StoryIsVisibleEvent$MiniStoryControlType = null;
        }
        webStoriesView.setStorySelected(z, inMessage$StoryIsVisibleEvent$StoryNavigationType, inMessage$StoryIsVisibleEvent$MiniStoryControlType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showContent$lambda$8(WebStoriesView webStoriesView) {
        if (webStoriesView.isSingleStory) {
            webStoriesView.forceUpdateAccessibilityFocus();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aou0 webViewController_delegate$lambda$2(WebStoriesView webStoriesView) {
        bou0 bou0Var = webStoriesView.storiesWebViewControllerDelegateFactory;
        WebViewContainer webViewContainer = webStoriesView.getWebViewContainer();
        cl41 cl41Var = new cl41(webStoriesView, 5);
        e eVar = webStoriesView.presenter;
        WebStoriesView$webViewController$2$2 webStoriesView$webViewController$2$2 = new WebStoriesView$webViewController$2$2(1, webStoriesView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0);
        WebStoriesView$webViewController$2$3 webStoriesView$webViewController$2$3 = new WebStoriesView$webViewController$2$3(2, webStoriesView.webViewsRouter, com.yandex.plus.home.feature.webviews.internal.container.b.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0);
        qq31 qq31Var = new qq31(7, webStoriesView);
        e eVar2 = webStoriesView.presenter;
        return new aou0(bou0Var.a, bou0Var.b, webViewContainer, eVar, bou0Var.f, bou0Var.g, cl41Var, eVar, webStoriesView$webViewController$2$2, webStoriesView$webViewController$2$3, qq31Var, new WebStoriesView$webViewController$2$5(2, eVar2, e.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0), eVar2.O, bou0Var.e, bou0Var.c, webStoriesView.commonWebViewContractEventListener, webStoriesView.storiesWebViewContractEventListener, bou0Var.d, WebViewType.STORIES, bou0Var.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse webViewController_delegate$lambda$2$lambda$1(WebStoriesView webStoriesView, WebResourceRequest webResourceRequest) {
        return (WebResourceResponse) tje.Y(EmptyCoroutineContext.a, new WebStoriesView$webViewController$2$4$1(webStoriesView, webResourceRequest, null));
    }

    @Override // defpackage.xk41
    public void dismiss(boolean animate) {
        skd0.e(PlusLogTag.UI, "dismiss() animate=" + animate);
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).k();
    }

    public final hnr0 getStoryNavigationSharedFlow() {
        return this.storyNavigationSharedFlow;
    }

    @Override // defpackage.gje
    public View getView() {
        return this.view;
    }

    @Override // defpackage.xk41
    public void hideHostBuyView() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        hostPayContainer.setVisibility(8);
    }

    @Override // defpackage.xk41
    public void hideNativePayButton() {
        b450 nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.c.onClose();
        View view = ((qs90) nativePayButtonViewController.q.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
    }

    @Override // defpackage.xk41
    public void navigateStory(StoryNavigation direction) {
        this.storyNavigationMutableSharedFlow.g(direction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onAttachedToWindow()");
        e eVar = this.presenter;
        eVar.b(this);
        szg szgVar = eVar.f;
        eVar.s.v();
        skd0.e(plusLogTag, "attachView()");
        gsd0 gsd0Var = eVar.Q;
        gsd0Var.e = true;
        gsd0Var.a();
        eVar.V.h();
        boolean z = eVar.E;
        com.yandex.plus.home.feature.webviews.internal.c cVar = eVar.u;
        if (z) {
            com.yandex.plus.home.common.utils.c.b(cVar.b("stories"), eVar.e(), new WebStoriesPresenter$subscribeOnWebViewReceiverMessages$1(eVar, null));
        } else {
            com.yandex.plus.home.common.utils.c.b(cVar.a("stories"), eVar.e(), new WebStoriesPresenter$subscribeOnWebViewReceiverMessages$2(eVar, null));
        }
        ((com.yandex.plus.home.feature.webviews.internal.bridge.b) eVar.U.getValue()).a(eVar.e());
        String str = szgVar.b;
        if (str != null) {
            eVar.k().j(str, szgVar.c, eVar.F);
        }
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f k = eVar.k();
        String str2 = szgVar.b;
        k.getClass();
        k.a(new g8r0(str2, 15));
        eVar.a0.f(eVar.x);
        getWebViewController().setAudioMuted(false);
        hn hnVar = (hn) getAcqSdkButtonSectionContainerViewController();
        pey o = vng.o(hnVar.a);
        if (o != null) {
            ((com.yandex.plus.acquisition.adapter.internal.controller.b) ((g0d0) hnVar.d.getValue())).a(o, new y4(11, hnVar));
        }
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
        skd0.e(PlusLogTag.UI, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        this.presenter.d();
        getWebViewController().setAudioMuted(true);
        ((hn) getAcqSdkButtonSectionContainerViewController()).a();
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onHasStartedBeingOverlapped() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onHasStoppedBeingOverlapped() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onModalExpanded() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onModalHide() {
    }

    @Override // defpackage.gje
    public void onPause() {
        skd0.e(PlusLogTag.UI, "onPause()");
        getWebViewController().onPause();
        this.presenter.i();
        getWebViewController().setAudioMuted(true);
        if (this.isSingleStory) {
            this.presenter.Z = false;
        }
    }

    @Override // defpackage.gje
    public void onResume() {
        skd0.e(PlusLogTag.UI, "onResume()");
        getWebViewController().onResume();
        this.presenter.j();
        getWebViewController().setAudioMuted(false);
        if (this.isSingleStory) {
            e eVar = this.presenter;
            eVar.Z = true;
            if (eVar.Y) {
                eVar.a0.a(eVar.x);
            }
        }
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onStart() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onStop() {
    }

    @Override // defpackage.xk41
    public void onStoryVisible() {
        forceUpdateAccessibilityFocus();
        getWebViewController().setAudioMuted(false);
    }

    @Override // defpackage.xk41
    public void openUrl(String url, String storiesData, List<com.yandex.plus.home.feature.webviews.internal.network.a> headers) {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        StringBuilder v = b64.v("openUrl() url=", url, " storiesData=", storiesData, " headers=");
        v.append(headers);
        skd0.e(plusLogTag, v.toString());
        this.storiesData = storiesData;
        aou0 webViewController = getWebViewController();
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
        ViewGroup storiesLoading = getStoriesLoading();
        storiesLoading.setAlpha(0.0f);
        storiesLoading.setVisibility(0);
        storiesLoading.animate().alpha(1.0f).start();
        getErrorViewController().a(false);
    }

    @Override // defpackage.xk41
    public void performVibrate(int vibrateConstant) {
        getView().performHapticFeedback(vibrateConstant);
    }

    @Override // defpackage.xk41
    public void sendMessage(String jsonEventString) {
        skd0.e(PlusLogTag.UI, "sendMessage() url=".concat(jsonEventString));
        aou0 webViewController = getWebViewController();
        webViewController.getClass();
        webViewController.b(String.format("__homeApp.response(%s)", Arrays.copyOf(new Object[]{jsonEventString}, 1)));
    }

    public final void setAudioMuted() {
        getWebViewController().setAudioMuted(true);
    }

    public final void setIsFullyVisible(boolean isFullyVisible) {
        e eVar = this.presenter;
        eVar.Z = isFullyVisible;
        if (isFullyVisible && eVar.Y) {
            eVar.a0.a(eVar.x);
        }
    }

    public final void setStorySelected(boolean isSelected, InMessage$StoryIsVisibleEvent$StoryNavigationType tapDirection, InMessage$StoryIsVisibleEvent$MiniStoryControlType controlType) {
        setNestedScrollEnabled(isSelected);
        e eVar = this.presenter;
        eVar.getClass();
        skd0.b(PlusLogTag.UI, "WebStories setStorySelected: isSelected = " + isSelected + ", controlType = " + controlType + ", type = " + tapDirection);
        if (controlType != null) {
            if ((isSelected ? controlType : null) != null) {
                gsd0 gsd0Var = eVar.Q;
                eVar.T = kotlinx.coroutines.flow.e.H(eVar.e(), new jqr(new yqb0(kotlinx.coroutines.flow.e.n(gsd0Var.b, gsd0Var.d, eVar.S, new WebStoriesPresenter$checkStoryIsVisible$1(4, null)), 1), new WebStoriesPresenter$checkStoryIsVisible$3(eVar, controlType, tapDirection, null), 3));
            }
        }
    }

    @Override // defpackage.xk41
    public void showContent() {
        hideLoading();
        getErrorViewController().a(false);
        getWebViewController().i(new cl41(this, 4), true);
    }

    @Override // defpackage.xk41
    public void showError(String message) {
        getWebViewController().stopLoading();
        hideLoading();
        kd5.h(getWebViewController());
        getErrorViewController().b(getWebViewController().d(), false);
    }

    @Override // defpackage.xk41
    public void showHostBuyView() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        hostPayContainer.addView(((nsu) this.presenter.X.getValue()).b());
        getHostPayAnimationController().a();
    }

    @Override // defpackage.xk41
    public void showNativePayButton(u350 payButtonConfig) {
        b450.e(getNativePayButtonViewController(), payButtonConfig.b, payButtonConfig.c, payButtonConfig.d, payButtonConfig.e, payButtonConfig.a, false, 96);
    }

    @Override // defpackage.xk41
    public void showNativePayError(PayError payError) {
        b450 nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.d(false);
        nativePayButtonViewController.b().setText(nativePayButtonViewController.c(payError));
    }

    @Override // defpackage.xk41
    public void showWebServiceInfo(String message) {
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).s(new vvq0(getWebViewController().getUserAgentString(), message));
    }

    @Override // defpackage.xk41
    public void sendMessage(gov inMessage) {
        ((com.yandex.plus.home.feature.webviews.internal.stories.contract.a) getWebViewController().v.getValue()).z(inMessage);
    }
}
