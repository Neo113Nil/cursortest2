package com.yandex.go.suggest.impl.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.view.OneShotPreDrawListener;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;
import com.yandex.go.suggest.impl.analytics.FindInGoSearchAnalytics$ScreenState;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import com.yandex.go.suggest.impl.presenter.c;
import com.yandex.go.superapp_carts.analytics.SuperappCartsAnalytics$CartEntryPointSource;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.als;
import defpackage.avj0;
import defpackage.b7;
import defpackage.bhv0;
import defpackage.bls;
import defpackage.cgw0;
import defpackage.cls;
import defpackage.cma1;
import defpackage.cmg0;
import defpackage.cvw;
import defpackage.dls;
import defpackage.dnr;
import defpackage.dxp0;
import defpackage.dzg0;
import defpackage.e230;
import defpackage.edc;
import defpackage.els;
import defpackage.epg0;
import defpackage.f8v0;
import defpackage.fls;
import defpackage.g5c;
import defpackage.gfw0;
import defpackage.gls;
import defpackage.gnb0;
import defpackage.gtq0;
import defpackage.hg;
import defpackage.hgr0;
import defpackage.hkh0;
import defpackage.i3y;
import defpackage.iy2;
import defpackage.jx81;
import defpackage.kr;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.lks;
import defpackage.m76;
import defpackage.mbs;
import defpackage.mg21;
import defpackage.mks;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.n751;
import defpackage.nhr;
import defpackage.nir;
import defpackage.nks;
import defpackage.ny61;
import defpackage.oks;
import defpackage.op31;
import defpackage.ou;
import defpackage.oug0;
import defpackage.p1j0;
import defpackage.pav;
import defpackage.pux0;
import defpackage.pw2;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.qks;
import defpackage.rkr;
import defpackage.rks;
import defpackage.s71;
import defpackage.s9w0;
import defpackage.sks;
import defpackage.szl;
import defpackage.t1w;
import defpackage.t37;
import defpackage.tje;
import defpackage.tks;
import defpackage.tp11;
import defpackage.tse;
import defpackage.u7r;
import defpackage.uks;
import defpackage.unv0;
import defpackage.v66;
import defpackage.w130;
import defpackage.w511;
import defpackage.w66;
import defpackage.w71;
import defpackage.x7h0;
import defpackage.xhr;
import defpackage.xng0;
import defpackage.yhr;
import defpackage.yoq0;
import defpackage.z4k;
import defpackage.zks;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.InsetsAnimationCallback;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\b*\u0002¡\u0001\u0018\u0000 ¥\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0004¦\u0001§\u0001Bq\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0014¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020*2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020&2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020*H\u0014¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020&2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020&2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?H\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020&2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020&2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bL\u0010(J\u0017\u0010O\u001a\u00020&2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020&2\u0006\u0010Q\u001a\u00020*H\u0016¢\u0006\u0004\bR\u0010-J\u000f\u0010S\u001a\u00020&H\u0014¢\u0006\u0004\bS\u0010(J\u000f\u0010T\u001a\u00020&H\u0002¢\u0006\u0004\bT\u0010(J\u000f\u0010U\u001a\u00020&H\u0002¢\u0006\u0004\bU\u0010(J\u0017\u0010V\u001a\u00020&2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bV\u0010GJ\u000f\u0010W\u001a\u00020&H\u0002¢\u0006\u0004\bW\u0010(J\u0017\u0010X\u001a\u00020&2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bX\u0010GJ\u0017\u0010Y\u001a\u00020&2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bY\u0010GJ#\u0010^\u001a\u0004\u0018\u00010]2\b\u0010Z\u001a\u0004\u0018\u00010H2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020&H\u0002¢\u0006\u0004\b`\u0010(J\u000f\u0010a\u001a\u00020&H\u0002¢\u0006\u0004\ba\u0010(J\u000f\u0010b\u001a\u00020&H\u0002¢\u0006\u0004\bb\u0010(J\u000f\u0010c\u001a\u00020&H\u0003¢\u0006\u0004\bc\u0010(J\u000f\u0010d\u001a\u00020&H\u0002¢\u0006\u0004\bd\u0010(J\u000f\u0010e\u001a\u00020&H\u0002¢\u0006\u0004\be\u0010(J\u001f\u0010i\u001a\u00020&2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020fH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020&H\u0002¢\u0006\u0004\bk\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010lR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010mR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010nR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010oR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010pR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010qR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010rR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010sR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001d\u0010\u007f\u001a\u0004\u0018\u00010z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0088\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u00020M8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010yR\u0016\u0010\u0091\u0001\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010yR\u0017\u0010\u0092\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0081\u0001R\u0017\u0010\u0093\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0081\u0001R\u0017\u0010\u0094\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0081\u0001R\"\u0010\u0097\u0001\u001a\r \u0096\u0001*\u0005\u0018\u00010\u0095\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010\u009f\u0001\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010|\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010 \u0001\u001a\u00020*8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010:R\u0018\u0010¤\u0001\u001a\u00030¡\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006¨\u0001"}, d2 = {"Lcom/yandex/go/suggest/impl/view/FullscreenSuperappSuggestModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcgw0;", "Lnwy0;", "Lrkr;", "Lgls;", "Landroid/content/Context;", "context", "Lyhr;", "flexControllerFactory", "Lcom/yandex/go/suggest/impl/presenter/c;", "presenter", "Landroid/graphics/drawable/Drawable;", "shadow", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "Lnhr;", "flexConfig", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "Lpwy0;", "themeSwitcherProvider", "Lf8v0;", "settingsConfiguration", "Lpw2;", "appSchemeProvider", "Lw66;", "blurDelegateFactory", "<init>", "(Landroid/content/Context;Lyhr;Lcom/yandex/go/suggest/impl/presenter/c;Landroid/graphics/drawable/Drawable;Ltse;Lpav;Lnhr;Lru/yandex/taxi/design/utils/a;Lpwy0;Lf8v0;Lpw2;Lw66;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcgw0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isBackPressedEnabled", "changeBackPressedState", "(Z)V", "Lkr;", "action", "handleAction", "(Lkr;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Le230;", "insetsType", "()Le230;", "shouldDismissOnTouchOutside", "()Z", "Lg5c;", "closeReason", "setCloseTransitionReason", "(Lg5c;)V", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lfls;", "uiState", "render", "(Lfls;)V", "", "text", "setDestinationInput", "(Ljava/lang/String;)V", "animateMessageSending", "", "visibility", "setFloatingInputTrailVisibility", "(I)V", BackendConfig.Restrictions.ENABLED, "setFloatingInputTrailEnabled", "onAppearAnimationComplete", "applyThemeForFloatingInput", "applyGlowBackground", "applyCartButtonState", "setupCartsButton", "renderNormalInputField", "renderFloatingInputField", "imageUrl", "Landroid/widget/ImageView;", "view", "Ll8x;", "loadTrailIconImage", "(Ljava/lang/String;Landroid/widget/ImageView;)Ll8x;", "renderFloatingInputTrailIconState", "setupNormalInputField", "setupNormalInputFieldListener", "setupFloatingInputField", "setupFloatingInputFieldListener", "setupFloatingFieldAnimatedInsets", "", "translation", "blurBottomOffset", "updateFloatingInputTranslation", "(FF)V", "setupInputFieldShadows", "Lcom/yandex/go/suggest/impl/presenter/c;", "Landroid/graphics/drawable/Drawable;", "Ltse;", "Lpav;", "Lnhr;", "Lru/yandex/taxi/design/utils/a;", "Lpwy0;", "Lf8v0;", "Lpw2;", "Lxhr;", "flexController", "Lxhr;", "blurEffectTopOffset", CA20Status.STATUS_USER_I, "Lv66;", "blurDelegate$delegate", "Li3y;", "getBlurDelegate", "()Lv66;", "blurDelegate", "flexContainerPadding", "F", "Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$SearchScaffoldStyle;", "inputStyle", "Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$SearchScaffoldStyle;", "searchTrailButtonContentDescription", "Ljava/lang/String;", "loadCartsIconJob", "Ll8x;", "loadDestinationImageJob", "loadFloatingInputTrailSendImageJob", "loadFloatingInputTrailLoadingImageJob", "loadFloatingInputMapIconJob", "Ldls;", "appliedDestinationInputIcon", "Ldls;", "floatingInputTrailActiveBackground", "floatingInputHeight", "primaryShadowOffset", "primaryShadowBlur", "disappearanceTranslation", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "trailButtonLoadingAnimation", "Landroid/view/animation/Animation;", "Lyoq0;", "sendMessageAnimation", "Lyoq0;", "cartsDeeplink$delegate", "getCartsDeeplink", "()Ljava/lang/String;", "cartsDeeplink", "isBackgroundVisible", "tks", "getInsetsDocumentTracker", "()Ltks;", "insetsDocumentTracker", "CartButtonSpecs", "rks", "wks", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FullscreenSuperappSuggestModalView extends SlideableBindingModalView<cgw0> implements rkr, gls {

    @Deprecated
    public static final long APPEAR_ANIMATION_DURATION = 300;
    private static final int BLUR_RADIUS = 24;

    @Deprecated
    public static final String CARTS_PATH = "/superapp_cart";

    @Deprecated
    public static final long DISAPPEAR_ANIMATION_DURATION = 200;
    private final pw2 appSchemeProvider;
    private dls appliedDestinationInputIcon;

    /* renamed from: blurDelegate$delegate, reason: from kotlin metadata */
    private final i3y blurDelegate;
    private final int blurEffectTopOffset;

    /* renamed from: cartsDeeplink$delegate, reason: from kotlin metadata */
    private final i3y cartsDeeplink;
    private final tse coroutineScope;
    private final float disappearanceTranslation;
    private final nhr flexConfig;
    private final float flexContainerPadding;
    private final xhr flexController;
    private final int floatingInputHeight;
    private int floatingInputTrailActiveBackground;
    private final pav imageLoader;
    private final SuperappSuggestExperiment.SearchScaffoldStyle inputStyle;
    private l8x loadCartsIconJob;
    private l8x loadDestinationImageJob;
    private l8x loadFloatingInputMapIconJob;
    private l8x loadFloatingInputTrailLoadingImageJob;
    private l8x loadFloatingInputTrailSendImageJob;
    private final ru.yandex.taxi.design.utils.a overlayShadowUtil;
    private final com.yandex.go.suggest.impl.presenter.c presenter;
    private final float primaryShadowBlur;
    private final float primaryShadowOffset;
    private final String searchTrailButtonContentDescription;
    private yoq0 sendMessageAnimation;
    private final f8v0 settingsConfiguration;
    private final Drawable shadow;
    private final pwy0 themeSwitcherProvider;
    private final Animation trailButtonLoadingAnimation;
    private static final rks CartButtonSpecs = new rks();
    private static final AccelerateDecelerateInterpolator APPEAR_ANIMATION_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final AccelerateDecelerateInterpolator DISAPPEAR_ANIMATION_INTERPOLATOR = new AccelerateDecelerateInterpolator();

    public FullscreenSuperappSuggestModalView(Context context, yhr yhrVar, com.yandex.go.suggest.impl.presenter.c cVar, Drawable drawable, tse tseVar, pav pavVar, nhr nhrVar, ru.yandex.taxi.design.utils.a aVar, pwy0 pwy0Var, f8v0 f8v0Var, pw2 pw2Var, w66 w66Var) {
        super(context);
        this.presenter = cVar;
        this.shadow = drawable;
        this.coroutineScope = tseVar;
        this.imageLoader = pavVar;
        this.flexConfig = nhrVar;
        this.overlayShadowUtil = aVar;
        this.themeSwitcherProvider = pwy0Var;
        this.settingsConfiguration = f8v0Var;
        this.appSchemeProvider = pw2Var;
        this.flexController = ((nir) yhrVar).a(nhrVar);
        this.blurEffectTopOffset = tje.r(oug0.input_field_blur_top_offset, getContext());
        this.blurDelegate = kotlin.a.a(new ou(17, this, w66Var));
        ViewGroup.LayoutParams layoutParams = getBinding().e.getLayoutParams();
        int i = 0;
        this.flexContainerPadding = Math.abs(((ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null)) != null ? r2.topMargin : 0);
        this.inputStyle = f8v0Var.e;
        dxp0 dxp0Var = f8v0Var.f;
        this.searchTrailButtonContentDescription = dxp0Var != null ? dxp0Var.b() : null;
        this.floatingInputTrailActiveBackground = qje.t(xng0.controlMain, getContext());
        int r = tje.r(oug0.floating_input_height, getContext());
        this.floatingInputHeight = r;
        this.primaryShadowOffset = tje.r(oug0.input_field_primary_shadow_offset, getContext());
        this.primaryShadowBlur = tje.r(oug0.input_field_primary_shadow_blur, getContext());
        this.disappearanceTranslation = r + tje.r(mrg0.go_design_s_space, getContext());
        Animation loadAnimation = AnimationUtils.loadAnimation(context, cmg0.rotate);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$trailButtonLoadingAnimation$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                cgw0 binding;
                cgw0 binding2;
                binding = FullscreenSuperappSuggestModalView.this.getBinding();
                binding.o.animate().alpha(1.0f);
                binding2 = FullscreenSuperappSuggestModalView.this.getBinding();
                binding2.n.animate().alpha(0.0f);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                cgw0 binding;
                cgw0 binding2;
                binding = FullscreenSuperappSuggestModalView.this.getBinding();
                binding.o.animate().alpha(0.0f);
                binding2 = FullscreenSuperappSuggestModalView.this.getBinding();
                binding2.n.animate().alpha(1.0f);
            }
        });
        this.trailButtonLoadingAnimation = loadAnimation;
        this.cartsDeeplink = kotlin.a.a(new nks(this, i));
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        ListItemComponent listItemComponent = getBinding().d;
        listItemComponent.setLeadContentDescription(getContext().getString(kyh0.common_back));
        listItemComponent.setLeadContainerClickListener(new iy2(16, this, listItemComponent));
        listItemComponent.ellipsizeSubtitleMiddle(true);
        listItemComponent.setCenterClickListener(new oks(cVar, i));
        listItemComponent.setCenterAccessibilityButtonDelegate();
        listItemComponent.setSubtitleSpannableTextStrategy(SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE);
        listItemComponent.setBackground(null);
        int i2 = sks.a[f8v0Var.e.ordinal()];
        if (i2 == 1) {
            setupNormalInputField();
        } else {
            if (i2 != 2) {
                w511.b();
                throw null;
            }
            setupFloatingInputField();
        }
        setupCartsButton();
        applyGlowBackground();
        setAnimationDelegate(nhrVar.l.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateMessageSending$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        fullscreenSuperappSuggestModalView.sendMessageAnimation = null;
        return zy11.a;
    }

    private final void applyCartButtonState(fls uiState) {
        l8x l8xVar = this.loadCartsIconJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        zks zksVar = uiState.k;
        int i = 0;
        if (zksVar == null) {
            getBinding().b.animate().alpha(0.0f).translationY(this.disappearanceTranslation).setDuration(200L).setInterpolator(DISAPPEAR_ANIMATION_INTERPOLATOR).withEndAction(new mks(this, i)).start();
            return;
        }
        getBinding().b.setText(zksVar.b());
        String a = zksVar.a();
        if (a != null) {
            this.loadCartsIconJob = tje.N(this.coroutineScope, null, null, new FullscreenSuperappSuggestModalView$applyCartButtonState$1$1$1(this, a, null), 3);
        }
        if (getBinding().c.getVisibility() != 0) {
            com.yandex.go.suggest.impl.presenter.c cVar = this.presenter;
            s9w0 s9w0Var = cVar.H;
            SuperappCartsAnalytics$CartEntryPointSource superappCartsAnalytics$CartEntryPointSource = SuperappCartsAnalytics$CartEntryPointSource.Search;
            String str = cVar.S;
            s9w0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("source", superappCartsAnalytics$CartEntryPointSource.getEventValue());
            if (str != null) {
                hashMap.put("search_session_id", str);
            }
            s9w0Var.a.a("SuperappCarts.Shortcut.Shown", hashMap, 2, new HashMap());
            getBinding().c.setVisibility(0);
            getBinding().b.animate().alpha(1.0f).translationY(0.0f).setDuration(300L).setInterpolator(APPEAR_ANIMATION_INTERPOLATOR).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyCartButtonState$lambda$1$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        fullscreenSuperappSuggestModalView.getBinding().c.setVisibility(8);
    }

    private final void applyGlowBackground() {
        getBinding().j.setVisibility(this.themeSwitcherProvider.getThemeType() == ThemeType.LIGHT ? 8 : 0);
    }

    private final void applyThemeForFloatingInput() {
        setupInputFieldShadows();
        getBinding().f.setHintColor(qje.t(xng0.textMinor, getContext()));
        v66 blurDelegate = getBlurDelegate();
        if (blurDelegate != null) {
            blurDelegate.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v66 blurDelegate_delegate$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, w66 w66Var) {
        int i = sks.a[fullscreenSuperappSuggestModalView.settingsConfiguration.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return w66.a(w66Var, "superapp_search_screen", fullscreenSuperappSuggestModalView.settingsConfiguration.h, null, new m76(new edc(fullscreenSuperappSuggestModalView.getContext().getColor(epg0.floating_input_gradient_light), fullscreenSuperappSuggestModalView.getContext().getColor(epg0.floating_input_gradient_dark)), 5), 12);
            }
            w511.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cartsDeeplink_delegate$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        Uri.Builder builder = new Uri.Builder();
        ((pux0) fullscreenSuperappSuggestModalView.appSchemeProvider).getClass();
        return builder.scheme(pux0.c).appendEncodedPath(CARTS_PATH).build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v66 getBlurDelegate() {
        return (v66) this.blurDelegate.getValue();
    }

    private final String getCartsDeeplink() {
        return (String) this.cartsDeeplink.getValue();
    }

    private final tks getInsetsDocumentTracker() {
        return new tks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, t1w t1wVar) {
        ViewGroup.LayoutParams layoutParams = fullscreenSuperappSuggestModalView.getBinding().d.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, t1wVar.b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        if (fullscreenSuperappSuggestModalView.inputStyle == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT && (!jx81.d() || fullscreenSuperappSuggestModalView.getBinding().g.getTranslationY() * (-1.0f) < t1wVar.d)) {
            float f = t1wVar.g;
            fullscreenSuperappSuggestModalView.updateFloatingInputTranslation(f, t1wVar.f ? 0.0f : f);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, ListItemComponent listItemComponent) {
        com.yandex.go.suggest.impl.presenter.c cVar = fullscreenSuperappSuggestModalView.presenter;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(listItemComponent);
        boolean q = a == null ? false : a.a.q(8);
        u7r u7rVar = cVar.G;
        gfw0 gfw0Var = cVar.E;
        FindInGoSearchAnalytics$ScreenState findInGoSearchAnalytics$ScreenState = gfw0Var.d ? FindInGoSearchAnalytics$ScreenState.Failed : gfw0Var.c ? FindInGoSearchAnalytics$ScreenState.Loading : FindInGoSearchAnalytics$ScreenState.Loaded;
        List list = cVar.F.f;
        String str = cVar.S;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("screen_state", findInGoSearchAnalytics$ScreenState.getEventValue());
        hashMap.put("is_keyboard_opened", Boolean.valueOf(q));
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        if (list != null) {
            hashMap.put("loading_sections", list);
        }
        u7rVar.a.a("FindInGoSearch.BackButton.Tapped", hashMap, 2, new HashMap());
        fullscreenSuperappSuggestModalView.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onCurrentAddressClicked(com.yandex.go.suggest.impl.presenter.c cVar) {
        com.yandex.go.suggest.impl.router.d dVar = cVar.x.a;
        boolean z = true;
        dVar.B((w71) dVar.J.get(), new s71(((avj0) dVar.Q).h(kyh0.search_source_address_hint), PointType.SOURCE, z, z), new gnb0(dVar, 2), p1j0.a);
    }

    private final l8x loadTrailIconImage(String imageUrl, ImageView view) {
        if (imageUrl != null) {
            return tje.N(this.coroutineScope, null, null, new FullscreenSuperappSuggestModalView$loadTrailIconImage$1(this, imageUrl, view, null), 3);
        }
        view.setImageDrawable(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$onNextButtonClicked(com.yandex.go.suggest.impl.presenter.c cVar) {
        com.yandex.go.suggest.impl.router.d dVar = cVar.x.a;
        dVar.M.a(dVar.K.k(), "open_summary_from_next_button", true, unv0.a, new bhv0(0));
    }

    private final void renderFloatingInputField(fls uiState) {
        if (uiState.h) {
            getBinding().m.startAnimation(this.trailButtonLoadingAnimation);
        } else {
            this.trailButtonLoadingAnimation.cancel();
            this.trailButtonLoadingAnimation.reset();
        }
        l8x l8xVar = this.loadFloatingInputTrailSendImageJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        l8x l8xVar2 = this.loadFloatingInputTrailLoadingImageJob;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        als alsVar = uiState.i;
        if (alsVar != null) {
            this.floatingInputTrailActiveBackground = alsVar.a();
            renderFloatingInputTrailIconState();
            this.loadFloatingInputTrailSendImageJob = loadTrailIconImage(alsVar.c(), getBinding().o);
            this.loadFloatingInputTrailLoadingImageJob = loadTrailIconImage(alsVar.b(), getBinding().n);
        }
        l8x l8xVar3 = this.loadFloatingInputMapIconJob;
        if (l8xVar3 != null) {
            l8xVar3.a(null);
        }
        String str = uiState.j;
        if (str != null) {
            this.loadFloatingInputMapIconJob = tje.N(this.coroutineScope, null, null, new FullscreenSuperappSuggestModalView$renderFloatingInputField$2$1(this, str, null), 3);
        }
    }

    private final void renderFloatingInputTrailIconState() {
        if (getBinding().m.isEnabled()) {
            getBinding().o.clearColorFilter();
            getBinding().n.clearColorFilter();
        } else {
            GoImageView goImageView = getBinding().o;
            int t = qje.t(xng0.line, getContext());
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            goImageView.setColorFilter(t, mode);
            getBinding().n.setColorFilter(qje.t(xng0.line, getContext()), mode);
        }
        getBinding().m.getBackground().setTintList(ColorStateList.valueOf(getBinding().m.isEnabled() ? this.floatingInputTrailActiveBackground : qje.t(xng0.controlMinor, getContext())));
    }

    private final void renderNormalInputField(fls uiState) {
        AddressInputComponent addressInputComponent = getBinding().k;
        addressInputComponent.setHint(uiState.e);
        dls dlsVar = uiState.f;
        if (dlsVar.equals(this.appliedDestinationInputIcon)) {
            return;
        }
        this.appliedDestinationInputIcon = dlsVar;
        if (dlsVar instanceof bls) {
            addressInputComponent.setLeadImage(((bls) dlsVar).b());
            addressInputComponent.setLeadImageTint(getContext().getColor(mqg0.component_gray_450));
        } else {
            if (!(dlsVar instanceof cls)) {
                w511.b();
                return;
            }
            l8x l8xVar = this.loadDestinationImageJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.loadDestinationImageJob = tje.N(this.coroutineScope, null, null, new FullscreenSuperappSuggestModalView$renderNormalInputField$1$1(this, uiState, addressInputComponent, null), 3);
        }
    }

    private final void setupCartsButton() {
        getBinding().b.setDebounceClickListener(new mks(this, 1));
        Boolean bool = tp11.a;
        tp11.b(3, getBinding().b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCartsButton$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        com.yandex.go.suggest.impl.presenter.c cVar = fullscreenSuperappSuggestModalView.presenter;
        String cartsDeeplink = fullscreenSuperappSuggestModalView.getCartsDeeplink();
        s9w0 s9w0Var = cVar.H;
        SuperappCartsAnalytics$CartEntryPointSource superappCartsAnalytics$CartEntryPointSource = SuperappCartsAnalytics$CartEntryPointSource.Search;
        String str = cVar.S;
        s9w0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", superappCartsAnalytics$CartEntryPointSource.getEventValue());
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        s9w0Var.a.a("SuperappCarts.Shortcut.Tapped", hashMap, 2, new HashMap());
        ((mg21) cVar.x.a.S).c(cartsDeeplink);
    }

    private final void setupFloatingFieldAnimatedInsets() {
        new InsetsAnimationCallback(0, new lks(this, 1)).setupListeners(getBinding().g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupFloatingFieldAnimatedInsets$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, n751 n751Var) {
        float f = n751Var.a.g(8).d;
        float f2 = n751Var.a.g(519).d;
        fullscreenSuperappSuggestModalView.updateFloatingInputTranslation(Math.max(f, f2), f2 > f ? f2 - f : 0.0f);
        return zy11.a;
    }

    private final void setupFloatingInputField() {
        setupFloatingFieldAnimatedInsets();
        applyThemeForFloatingInput();
        int i = 1;
        ru.yandex.taxi.design.utils.c.z(new nks(this, i), getBinding().i);
        getBinding().f.setTrailImage(dzg0.ic_cross_round_fill, xng0.line);
        getBinding().f.setClearButtonSize(tje.u(40, getContext()));
        int i2 = 2;
        getBinding().f.setOnClear(new oks(this.presenter, i2));
        hg.a(getBinding().i);
        if (this.settingsConfiguration.f == null) {
            setFloatingInputTrailVisibility(8);
        } else {
            GoFrameLayout goFrameLayout = getBinding().m;
            ru.yandex.taxi.design.utils.c.z(new nks(this, i2), goFrameLayout);
            goFrameLayout.setOnTouchListener(new z4k(i, goFrameLayout));
            goFrameLayout.setContentDescription(this.searchTrailButtonContentDescription);
            hg.a(getBinding().m);
        }
        getBinding().g.setVisibility(0);
        getBinding().g.setOnClickListener(new t37(i, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupFloatingInputField$lambda$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        fullscreenSuperappSuggestModalView.presenter.Ng();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupFloatingInputField$lambda$1$0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        com.yandex.go.suggest.impl.presenter.c cVar = fullscreenSuperappSuggestModalView.presenter;
        String valueOf = String.valueOf(fullscreenSuperappSuggestModalView.getBinding().f.getText());
        String c = fullscreenSuperappSuggestModalView.settingsConfiguration.f.c();
        dxp0 dxp0Var = cVar.N.f;
        if (dxp0Var != null) {
            u7r u7rVar = cVar.G;
            String d = dxp0Var.d();
            String a = dxp0Var.a();
            String str = cVar.D.b().a;
            String str2 = cVar.S;
            u7rVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("image_tag", d);
            hashMap.put(Constants.DEEPLINK, c);
            hashMap.put("bg", a);
            hashMap.put("user_input", str);
            if (str2 != null) {
                hashMap.put("search_session_id", str2);
            }
            u7rVar.a.a("FindInGoSearch.TrailInputButton.Tapped", hashMap, 1, new HashMap());
        }
        boolean equalsIgnoreCase = "ai_assistant".equalsIgnoreCase(Uri.parse(c).getAuthority());
        com.yandex.go.suggest.impl.router.c cVar2 = cVar.x;
        if (equalsIgnoreCase) {
            cVar2.a(valueOf);
        } else {
            ((mg21) cVar2.a.S).c(c);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupFloatingInputField$lambda$1$1(GoFrameLayout goFrameLayout, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setupFloatingInputField$lambda$1$1$animateTrailButtonScale(goFrameLayout, 0.75f);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        setupFloatingInputField$lambda$1$1$animateTrailButtonScale(goFrameLayout, 1.0f);
        return false;
    }

    private static final void setupFloatingInputField$lambda$1$1$animateTrailButtonScale(GoFrameLayout goFrameLayout, float f) {
        goFrameLayout.animate().scaleX(f).scaleY(f).setDuration(250L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFloatingInputField$lambda$2(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, View view) {
        fullscreenSuperappSuggestModalView.getBinding().f.requestInputFocus();
    }

    private final void setupFloatingInputFieldListener() {
        ListItemInputComponent listItemInputComponent = getBinding().f;
        listItemInputComponent.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$setupFloatingInputFieldListener$1$1
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                com.yandex.go.suggest.impl.presenter.c cVar;
                if (actionId != 3) {
                    return false;
                }
                FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = FullscreenSuperappSuggestModalView.this;
                if (fullscreenSuperappSuggestModalView != null) {
                    Object systemService = fullscreenSuperappSuggestModalView.getContext().getSystemService("input_method");
                    InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(fullscreenSuperappSuggestModalView.getWindowToken(), 0);
                    }
                }
                cVar = FullscreenSuperappSuggestModalView.this.presenter;
                if (!cVar.E.d) {
                    return true;
                }
                cVar.K.a.g(zy11.a);
                return true;
            }
        });
        tje.N(this.coroutineScope, null, null, new FullscreenSuperappSuggestModalView$setupFloatingInputFieldListener$lambda$0$$inlined$safeCollectIn$1(new b(listItemInputComponent.textValueFlow()), null, this), 3);
    }

    private final void setupInputFieldShadows() {
        getBinding().h.setBackground(gtq0.v(this.overlayShadowUtil, getContext(), tje.u(28, getContext()), new hgr0(0.0f, this.primaryShadowOffset, this.primaryShadowBlur, getContext().getColor(mqg0.component_shadow_bottom_light)), 0, 24));
    }

    private final void setupNormalInputField() {
        AddressInputComponent addressInputComponent = getBinding().k;
        final int i = 0;
        addressInputComponent.setInputVerticalPaddings(0);
        addressInputComponent.setLeadIconSize(tje.u(48, addressInputComponent.getContext()));
        addressInputComponent.setLeadIconPadding(0);
        addressInputComponent.setElementBackground(dzg0.bg_rounded_minor);
        final int i2 = 1;
        addressInputComponent.setTrailClickable(true);
        final com.yandex.go.suggest.impl.presenter.c cVar = this.presenter;
        addressInputComponent.setOnTrailClickListener(new Runnable() { // from class: pks
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                c cVar2 = cVar;
                switch (i3) {
                    case 0:
                        cVar2.Ng();
                        break;
                    default:
                        cVar2.Mg();
                        break;
                }
            }
        });
        addressInputComponent.setHint(getContext().getString(kyh0.superapp_search_input_hint));
        addressInputComponent.setTrailText(getContext().getString(kyh0.point_on_map));
        addressInputComponent.setTrailTextColor(qje.t(xng0.textMain, getContext()));
        addressInputComponent.setTrailDividerSize(tje.u(32, addressInputComponent.getContext()));
        addressInputComponent.setTrailDividerVisibility(true);
        addressInputComponent.setClearImage(dzg0.ic_cross_round_fill, xng0.line);
        final com.yandex.go.suggest.impl.presenter.c cVar2 = this.presenter;
        addressInputComponent.setOnClearListener(new Runnable() { // from class: pks
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                c cVar22 = cVar2;
                switch (i3) {
                    case 0:
                        cVar22.Ng();
                        break;
                    default:
                        cVar22.Mg();
                        break;
                }
            }
        });
        addressInputComponent.setVisibility(0);
    }

    private final void setupNormalInputFieldListener() {
        AddressInputComponent addressInputComponent = getBinding().k;
        addressInputComponent.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$setupNormalInputFieldListener$1$1
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                com.yandex.go.suggest.impl.presenter.c cVar;
                if (actionId != 3) {
                    return false;
                }
                FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = FullscreenSuperappSuggestModalView.this;
                if (fullscreenSuperappSuggestModalView != null) {
                    Object systemService = fullscreenSuperappSuggestModalView.getContext().getSystemService("input_method");
                    InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(fullscreenSuperappSuggestModalView.getWindowToken(), 0);
                    }
                }
                cVar = FullscreenSuperappSuggestModalView.this.presenter;
                if (!cVar.E.d) {
                    return true;
                }
                cVar.K.a.g(zy11.a);
                return true;
            }
        });
        tje.N(this.coroutineScope, null, null, new FullscreenSuperappSuggestModalView$setupNormalInputFieldListener$lambda$0$$inlined$safeCollectIn$1(new d(addressInputComponent.textValueFlow()), null, this), 3);
    }

    private final void updateFloatingInputTranslation(float translation, float blurBottomOffset) {
        if (translation >= 0.0f) {
            yoq0 yoq0Var = this.sendMessageAnimation;
            if (yoq0Var == null || !yoq0Var.b()) {
                float f = translation * (-1.0f);
                cgw0 binding = getBinding();
                binding.g.setTranslationY(f);
                binding.h.setTranslationY(f);
                binding.c.setTranslationY(f);
                v66 blurDelegate = getBlurDelegate();
                if (blurDelegate != null) {
                    blurDelegate.d(new uks(binding, this, blurBottomOffset), null);
                }
            }
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        yoq0 yoq0Var = this.sendMessageAnimation;
        if (yoq0Var == null) {
            super.animateDismiss(startAction, endAction);
        } else {
            startAction.run();
            yoq0Var.a(new FullscreenSuperappSuggestModalView$animateDismiss$1(endAction));
        }
    }

    @Override // defpackage.gls
    public void animateMessageSending() {
        this.sendMessageAnimation = new yoq0(getBinding().f, getBinding().d, String.valueOf(getBinding().f.getText()), new dnr(7, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (this.inputStyle == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT) {
            applyThemeForFloatingInput();
        }
        applyGlowBackground();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public cgw0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(hkh0.superapp_suggest_modal_view, parent, false);
        int i = x7h0.cartsButton;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = x7h0.cartsButtonContainer;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
            if (goFrameLayout != null) {
                i = x7h0.currentAddress;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = x7h0.flexContainer;
                    DivKitThemedFrameLayout divKitThemedFrameLayout = (DivKitThemedFrameLayout) cma1.O(i, inflate);
                    if (divKitThemedFrameLayout != null) {
                        i = x7h0.floatingInput;
                        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                        if (listItemInputComponent != null) {
                            i = x7h0.floatingInputContainer;
                            GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                            if (goFrameLayout2 != null) {
                                i = x7h0.inputFieldPrimaryShadow;
                                GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout3 != null) {
                                    i = x7h0.mapButton;
                                    GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                                    if (goImageView != null) {
                                        i = x7h0.roundedTopBackground;
                                        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
                                            i = x7h0.roundedTopBackgroundDarkGlow;
                                            GoFrameLayout goFrameLayout4 = (GoFrameLayout) cma1.O(i, inflate);
                                            if (goFrameLayout4 != null) {
                                                i = x7h0.searchInput;
                                                AddressInputComponent addressInputComponent = (AddressInputComponent) cma1.O(i, inflate);
                                                if (addressInputComponent != null) {
                                                    i = x7h0.shadowView;
                                                    GoFrameLayout goFrameLayout5 = (GoFrameLayout) cma1.O(i, inflate);
                                                    if (goFrameLayout5 != null) {
                                                        i = x7h0.topViewsBarrier;
                                                        if (((Barrier) cma1.O(i, inflate)) != null) {
                                                            i = x7h0.trailButton;
                                                            GoFrameLayout goFrameLayout6 = (GoFrameLayout) cma1.O(i, inflate);
                                                            if (goFrameLayout6 != null) {
                                                                i = x7h0.trailButtonLoadingImageView;
                                                                GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                                                                if (goImageView2 != null) {
                                                                    i = x7h0.trailButtonSendImageView;
                                                                    GoImageView goImageView3 = (GoImageView) cma1.O(i, inflate);
                                                                    if (goImageView3 != null) {
                                                                        return new cgw0((GoConstraintLayout) inflate, buttonComponent, goFrameLayout, listItemComponent, divKitThemedFrameLayout, listItemInputComponent, goFrameLayout2, goFrameLayout3, goImageView, goFrameLayout4, addressInputComponent, goFrameLayout5, goFrameLayout6, goImageView2, goImageView3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public void changeBackPressedState(boolean isBackPressedEnabled) {
    }

    @Override // defpackage.rkr
    public boolean handleAction(kr action) {
        return ((Boolean) this.flexConfig.h.invoke(action)).booleanValue();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(2, new lks(this, 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: isBackgroundVisible */
    public boolean getIsBackgroundVisibleState() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        int i = sks.a[this.inputStyle.ordinal()];
        if (i == 1) {
            AddressInputComponent addressInputComponent = getBinding().k;
            addressInputComponent.postDelayed(new b7(28, addressInputComponent), 300L);
        } else if (i != 2) {
            w511.b();
        } else {
            ListItemInputComponent listItemInputComponent = getBinding().f;
            listItemInputComponent.postDelayed(new qks(listItemInputComponent, 0), 300L);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setEnableBackgroundOnAppearing(false);
        this.presenter.Lg(this);
        setOnTouchOutsideListener(null);
        ((com.yandex.go.flex.common.facade.b) this.flexController).b(getBinding().e, this);
        ((com.yandex.go.flex.common.facade.b) this.flexController).a(getInsetsDocumentTracker());
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((com.yandex.go.flex.common.facade.b) this.flexController).a(szlVar);
        }
        cvw.c0(getBinding().l, this.shadow);
        DivKitThemedFrameLayout divKitThemedFrameLayout = getBinding().e;
        OneShotPreDrawListener.add(divKitThemedFrameLayout, new mbs(divKitThemedFrameLayout, this));
        int i = sks.a[this.inputStyle.ordinal()];
        if (i == 1) {
            setupNormalInputFieldListener();
        } else if (i == 2) {
            setupFloatingInputFieldListener();
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((com.yandex.go.flex.common.facade.b) this.flexController).e(szlVar);
        }
        ((com.yandex.go.flex.common.facade.b) this.flexController).e(getInsetsDocumentTracker());
        ((com.yandex.go.flex.common.facade.b) this.flexController).d();
        ((com.yandex.go.flex.common.facade.b) this.flexController).c();
        v66 blurDelegate = getBlurDelegate();
        if (blurDelegate != null) {
            blurDelegate.detach();
        }
    }

    @Override // defpackage.eyi0
    public void render(fls uiState) {
        ListItemComponent listItemComponent = getBinding().d;
        String str = uiState.a;
        int i = uiState.g;
        els elsVar = uiState.d;
        listItemComponent.setTitle(str);
        String str2 = uiState.b;
        listItemComponent.setSubtitle(str2);
        listItemComponent.setSubtitleContentDescription(str2);
        if (uiState.c) {
            listItemComponent.startSubtitleProgressAnimation();
        } else {
            listItemComponent.stopSubtitleProgressAnimation();
        }
        int i2 = 1;
        if (elsVar == null) {
            listItemComponent.clearTrailView();
            listItemComponent.setTrailContainerClickListener(null);
        } else {
            listItemComponent.setTrailTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
            listItemComponent.setTrailTextStyle(3);
            listItemComponent.setTrailCompanionText(elsVar.a());
            listItemComponent.setTrailContainerClickListener(new oks(this.presenter, i2));
        }
        int i3 = sks.a[this.inputStyle.ordinal()];
        if (i3 == 1) {
            renderNormalInputField(uiState);
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            renderFloatingInputField(uiState);
        }
        GoFrameLayout goFrameLayout = getBinding().l;
        float f = i;
        float f2 = this.flexContainerPadding;
        goFrameLayout.setAlpha(f > f2 ? 1.0f : f / f2);
        if (this.themeSwitcherProvider.getThemeType() == ThemeType.DARK) {
            GoFrameLayout goFrameLayout2 = getBinding().j;
            float f3 = this.flexContainerPadding;
            goFrameLayout2.setAlpha(f <= f3 ? f / f3 : 1.0f);
        }
        applyCartButtonState(uiState);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setCloseTransitionReason(g5c closeReason) {
        if (closeReason != null) {
            this.flexConfig.l.b();
        }
        super.setCloseTransitionReason(closeReason);
    }

    @Override // defpackage.gls
    public void setDestinationInput(String text) {
        int i = sks.a[this.inputStyle.ordinal()];
        if (i == 1) {
            AddressInputComponent addressInputComponent = getBinding().k;
            addressInputComponent.setTextWithoutNotifying(text);
            addressInputComponent.getAddressEditText().setSelection(text.length());
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            ListItemInputComponent listItemInputComponent = getBinding().f;
            listItemInputComponent.setTextWithoutNotifying(text);
            listItemInputComponent.getInput().setSelection(text.length());
        }
    }

    @Override // defpackage.gls
    public void setFloatingInputTrailEnabled(boolean enabled) {
        getBinding().m.setEnabled(enabled);
        renderFloatingInputTrailIconState();
    }

    @Override // defpackage.gls
    public void setFloatingInputTrailVisibility(int visibility) {
        if (visibility == 0 && getBinding().m.getVisibility() != 0) {
            com.yandex.go.suggest.impl.presenter.c cVar = this.presenter;
            dxp0 dxp0Var = cVar.N.f;
            if (dxp0Var != null) {
                u7r u7rVar = cVar.G;
                String str = cVar.S;
                String d = dxp0Var.d();
                String c = dxp0Var.c();
                String a = dxp0Var.a();
                u7rVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("image_tag", d);
                hashMap.put(Constants.DEEPLINK, c);
                hashMap.put("bg", a);
                if (str != null) {
                    hashMap.put("search_session_id", str);
                }
                u7rVar.a.a("FindInGoSearch.TrailInputButton.Shown", hashMap, 1, new HashMap());
            }
        }
        getBinding().m.setVisibility(visibility);
        ListItemInputComponent listItemInputComponent = getBinding().f;
        int u = visibility == 0 ? tje.u(40, getContext()) : 0;
        ViewGroup.LayoutParams layoutParams = listItemInputComponent.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams.rightMargin = u;
            listItemInputComponent.setLayoutParams(marginLayoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams2.rightMargin != u) {
                marginLayoutParams2.rightMargin = u;
                listItemInputComponent.requestLayout();
            }
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: shouldDismissOnTouchOutside */
    public boolean getDismissOnTouchOutside() {
        return false;
    }
}
