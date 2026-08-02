package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.places.common.ui.FilterButtonView;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.g;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.i;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.k;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.m;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerOutlineRobotoTextView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.header.DiscoveryMapFloatingHeader;
import com.yandex.go.superapp.discovery.map.impl.ui.model.v2.SuperAppDiscoveryMapFlexContainerState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a76;
import defpackage.ah00;
import defpackage.avv0;
import defpackage.bac0;
import defpackage.bt00;
import defpackage.but0;
import defpackage.bvo;
import defpackage.c9c0;
import defpackage.cma1;
import defpackage.ctv0;
import defpackage.d230;
import defpackage.dib1;
import defpackage.dzv0;
import defpackage.e230;
import defpackage.euv0;
import defpackage.evu0;
import defpackage.f8w0;
import defpackage.fto;
import defpackage.gh00;
import defpackage.huv0;
import defpackage.hyv0;
import defpackage.hzv0;
import defpackage.i3y;
import defpackage.i8h0;
import defpackage.ip11;
import defpackage.iyv0;
import defpackage.jag;
import defpackage.jdj;
import defpackage.jgc0;
import defpackage.jl40;
import defpackage.jtv0;
import defpackage.jyv0;
import defpackage.krl0;
import defpackage.kuv0;
import defpackage.kyv0;
import defpackage.lhc;
import defpackage.luv0;
import defpackage.lyv0;
import defpackage.m76;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.nac;
import defpackage.ngd0;
import defpackage.ntj;
import defpackage.ny61;
import defpackage.nyv0;
import defpackage.oep0;
import defpackage.oxv0;
import defpackage.pav;
import defpackage.ptj;
import defpackage.pwy0;
import defpackage.pyv0;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.qto;
import defpackage.qyv0;
import defpackage.r3v;
import defpackage.rtj;
import defpackage.rzo;
import defpackage.skh0;
import defpackage.sug0;
import defpackage.syv0;
import defpackage.t1w;
import defpackage.t5w;
import defpackage.tje;
import defpackage.tyv0;
import defpackage.uh00;
import defpackage.usg0;
import defpackage.uyv0;
import defpackage.v66;
import defpackage.vxp0;
import defpackage.w66;
import defpackage.wuo;
import defpackage.wyv0;
import defpackage.x7c0;
import defpackage.xng0;
import defpackage.xtj;
import defpackage.xvf0;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.ytj;
import defpackage.zl00;
import defpackage.zmh;
import defpackage.ztj;
import defpackage.zuv0;
import defpackage.zxv0;
import defpackage.zy11;
import defpackage.zyv0;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u008e\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u008f\u0001\u0090\u0001Bi\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J/\u00103\u001a\u00020\"2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0014¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002052\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u0002052\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\b>\u0010?J\u001f\u0010C\u001a\u00020\"2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@H\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\"2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020@H\u0014¢\u0006\u0004\bG\u0010DJ\u000f\u0010H\u001a\u00020\"H\u0014¢\u0006\u0004\bH\u0010$J\u000f\u0010I\u001a\u00020\"H\u0002¢\u0006\u0004\bI\u0010$J\u000f\u0010J\u001a\u00020\"H\u0002¢\u0006\u0004\bJ\u0010$J\u000f\u0010K\u001a\u00020\"H\u0002¢\u0006\u0004\bK\u0010$J\u000f\u0010L\u001a\u00020.H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020.H\u0002¢\u0006\u0004\bN\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020.2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\"H\u0002¢\u0006\u0004\bU\u0010$J\u0017\u0010W\u001a\u00020\"2\u0006\u0010V\u001a\u00020.H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\"H\u0002¢\u0006\u0004\bY\u0010$J\u0017\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u000205H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\"H\u0002¢\u0006\u0004\b^\u0010$J\u000f\u0010_\u001a\u00020\"H\u0002¢\u0006\u0004\b_\u0010$J\u000f\u0010`\u001a\u00020\"H\u0002¢\u0006\u0004\b`\u0010$J\u0019\u0010c\u001a\u00020\"2\b\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020\"2\b\u0010b\u001a\u0004\u0018\u00010eH\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010j\u001a\u00020\"2\b\u0010i\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0004\bj\u0010kR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010lR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010mR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010nR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010oR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010pR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010qR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010sR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010tR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010uR\u0018\u0010v\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u008d\u0001\u001a\u00020.8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010M¨\u0006\u0091\u0001"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/v2/SuperAppDiscoveryMapV2ModalView;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/base/SuperAppDiscoveryMapLifecycleAwareModalView;", "Lpyv0;", "Lctv0;", "Landroid/content/Context;", "context", "Lwyv0;", "discoveryMapV2Presenter", "Lkuv0;", "flexContentContainer", "Luh00;", "explorationConfig", "Lpav;", "imageLoader", "Lr3v;", "userLocationOverlay", "Lw66;", "blurDelegateFactory", "Lah00;", "mapController", "Lbt00;", "mapStylesRepository", "Lip11;", "typefaceDelegate", "Lntj;", "floatingHeaderFactory", "<init>", "(Landroid/content/Context;Lwyv0;Lkuv0;Luh00;Lpav;Lr3v;Lw66;Lah00;Lbt00;Lip11;Lntj;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpyv0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "", "isApplyShadow", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "dispatchTouchEvent", "Le230;", "insetsType", "()Le230;", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "refreshTopPadding", "setupFloatingHeader", "setupViewportInsetsTracking", "updateMapViewportInsets", "flexOccludingBottom", "()I", "loadingGradientOccludingBottom", "getRealFlexContentHeight", "()Ljava/lang/Integer;", "Landroid/view/View;", "view", "occludingBottom", "(Landroid/view/View;)I", "setListeners", "margin", "setMapButtonsContainerBottomMargin", "(I)V", "updateStatusBarBlur", "stateBarVisible", "", "stateBarOffset", "(Z)F", "attachGamification", "detachGamification", "applyDistrictCoverageStyles", "Lfto;", ClidProvider.STATE, "renderGamificationButton", "(Lfto;)V", "Lqto;", "renderGamificationHeader", "(Lqto;)V", "", "url", "loadDistrictFinishedIcon", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lwyv0;", "Lkuv0;", "Luh00;", "Lpav;", "Lr3v;", "Lw66;", "Lah00;", "Lbt00;", "Lip11;", "lastFlexVisible", "Ljava/lang/Boolean;", "Lv66;", "mapBlurDelegate$delegate", "Li3y;", "getMapBlurDelegate", "()Lv66;", "mapBlurDelegate", "Lvxp0;", "searchbarController$delegate", "getSearchbarController", "()Lvxp0;", "searchbarController", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/v2/header/DiscoveryMapFloatingHeader;", "floatingHeader", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/v2/header/DiscoveryMapFloatingHeader;", "Lbvo;", "gamificationTopFadeOverlay", "Lbvo;", "Lzl00;", "longPressDetector", "Lzl00;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "nyv0", "lyv0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapV2ModalView extends SuperAppDiscoveryMapLifecycleAwareModalView<pyv0> implements ctv0 {
    private static final lyv0 Companion = new lyv0();
    private static final String MAP_BLUR_ANALYTICS_PREFIX = "super_app_discovery_map_searchbar";
    private static final String STATUS_BAR_BLUR_ID = "discovery_map_status_bar";
    private final w66 blurDelegateFactory;
    private final Context context;
    private final wyv0 discoveryMapV2Presenter;
    private final uh00 explorationConfig;
    private final kuv0 flexContentContainer;
    private final DiscoveryMapFloatingHeader floatingHeader;
    private bvo gamificationTopFadeOverlay;
    private final pav imageLoader;
    private Boolean lastFlexVisible;
    private final zl00 longPressDetector;

    /* renamed from: mapBlurDelegate$delegate, reason: from kotlin metadata */
    private final i3y mapBlurDelegate;
    private final ah00 mapController;
    private final bt00 mapStylesRepository;

    /* renamed from: searchbarController$delegate, reason: from kotlin metadata */
    private final i3y searchbarController;
    private final ip11 typefaceDelegate;
    private final r3v userLocationOverlay;

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppDiscoveryMapV2ModalView(Context context, wyv0 wyv0Var, kuv0 kuv0Var, uh00 uh00Var, pav pavVar, r3v r3vVar, w66 w66Var, ah00 ah00Var, bt00 bt00Var, ip11 ip11Var, ntj ntjVar) {
        super(context);
        this.context = context;
        this.discoveryMapV2Presenter = wyv0Var;
        this.flexContentContainer = kuv0Var;
        this.explorationConfig = uh00Var;
        this.imageLoader = pavVar;
        this.userLocationOverlay = r3vVar;
        this.blurDelegateFactory = w66Var;
        this.mapController = ah00Var;
        this.mapStylesRepository = bt00Var;
        this.typefaceDelegate = ip11Var;
        hyv0 hyv0Var = new hyv0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.mapBlurDelegate = kotlin.a.b(lazyThreadSafetyMode, hyv0Var);
        this.searchbarController = kotlin.a.b(lazyThreadSafetyMode, new hyv0(this, 4));
        jdj jdjVar = ((rtj) ntjVar).a;
        this.floatingHeader = new DiscoveryMapFloatingHeader(context, (ptj) ((xvf0) jdjVar.b).get(), (f8w0) ((jag) jdjVar.c).get(), (pwy0) ((xvf0) jdjVar.w).get());
        this.longPressDetector = new zl00(ah00Var, uh00Var.c, new SuperAppDiscoveryMapV2ModalView$longPressDetector$1(0, wyv0Var, wyv0.class, "onMapLongPressStart", "onMapLongPressStart()V", 0), new SuperAppDiscoveryMapV2ModalView$longPressDetector$2(0, wyv0Var, wyv0.class, "onMapLongPressEnd", "onMapLongPressEnd()V", 0));
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
        ViewStub viewStub = ((pyv0) getBinding()).j;
        ViewGroup viewGroup = kuv0Var.a;
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewGroup);
        }
        ru.yandex.taxi.design.utils.c.w(viewStub, viewGroup);
        setupFloatingHeader();
        setupViewportInsetsTracking();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ pyv0 access$getBinding(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        return (pyv0) superAppDiscoveryMapV2ModalView.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyDistrictCoverageStyles() {
        ((pyv0) getBinding()).g.setColorsAndTextStyles(lhc.f(qje.t(xng0.bgMain, this.context), Math.abs(204) & 255), qje.t(xng0.bgMain, this.context), lhc.f(getContext().getColor(mqg0.component_accent_color), Math.abs(76) & 255), getContext().getColor(mqg0.component_accent_color), qje.t(xng0.bgInvert, this.context), this.typefaceDelegate.c(this.context));
        ((pyv0) getBinding()).h.setTypeface(((zmh) this.typefaceDelegate).f(this.context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void attachGamification() {
        applyDistrictCoverageStyles();
        ExplorerButtonView explorerButtonView = ((pyv0) getBinding()).f;
        explorerButtonView.setOnToggleClicked(new SuperAppDiscoveryMapV2ModalView$attachGamification$1$1(1, this.discoveryMapV2Presenter, wyv0.class, "onGamificationToggleClicked", "onGamificationToggleClicked(Z)V", 0));
        explorerButtonView.setOnNoPermissionClicked(new SuperAppDiscoveryMapV2ModalView$attachGamification$1$2(0, this.discoveryMapV2Presenter, wyv0.class, "onGamificationNoPermissionClicked", "onGamificationNoPermissionClicked()V", 0));
        bvo bvoVar = new bvo(this, new hyv0(this, 1), new hyv0(this, 2));
        bvoVar.a();
        bvoVar.c();
        this.gamificationTopFadeOverlay = bvoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int attachGamification$lambda$1(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        return superAppDiscoveryMapV2ModalView.getCurrentInsets().b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int attachGamification$lambda$2(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        return ((pyv0) superAppDiscoveryMapV2ModalView.getBinding()).g.getBottom();
    }

    private final void detachGamification() {
        bvo bvoVar = this.gamificationTopFadeOverlay;
        if (bvoVar != null) {
            View view = bvoVar.d;
            if (view != null) {
                bvoVar.a.removeView(view);
            }
            bvoVar.d = null;
        }
    }

    private final int flexOccludingBottom() {
        Integer realFlexContentHeight;
        if (this.discoveryMapV2Presenter.Lg().a == SuperAppDiscoveryMapFlexContainerState.LOADING) {
            return loadingGradientOccludingBottom();
        }
        ViewGroup viewGroup = this.flexContentContainer.a;
        if (viewGroup.getVisibility() != 0 || (realFlexContentHeight = getRealFlexContentHeight()) == null) {
            return 0;
        }
        return realFlexContentHeight.intValue() + viewGroup.getTop();
    }

    private final v66 getMapBlurDelegate() {
        return (v66) this.mapBlurDelegate.getValue();
    }

    private final Integer getRealFlexContentHeight() {
        RecyclerView n = ru.yandex.taxi.design.utils.c.n(this.flexContentContainer.a);
        if (n == null) {
            return null;
        }
        if (n.getLayoutParams().height == -2 && n.getHeight() > 0) {
            return Integer.valueOf(n.getHeight());
        }
        if (n.getChildCount() > 0) {
            int i = 0;
            Iterator it = y6i0.n(0, n.getChildCount()).iterator();
            while (it.hasNext()) {
                i += n.getChildAt(((t5w) it).nextInt()).getHeight();
            }
            if (i > 0) {
                return Integer.valueOf(i);
            }
        }
        Integer valueOf = Integer.valueOf(n.computeVerticalScrollRange());
        if (valueOf.intValue() > 0) {
            return valueOf;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vxp0 getSearchbarController() {
        return (vxp0) this.searchbarController.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadDistrictFinishedIcon(String url) {
        ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView = ((pyv0) getBinding()).g;
        if (url == null || evu0.J(url)) {
            explorerDistrictCoverageProgressView.setFinishedImage(null);
        } else {
            ((nac) this.imageLoader.f(new but0(8, explorerDistrictCoverageProgressView), explorerDistrictCoverageProgressView)).c(url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 loadDistrictFinishedIcon$lambda$0$0(ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView, ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView2, Drawable drawable) {
        explorerDistrictCoverageProgressView.setFinishedImage(drawable);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int loadingGradientOccludingBottom() {
        View view = ((pyv0) getBinding()).e;
        if (view.getVisibility() != 0) {
            return 0;
        }
        if (view.getHeight() > 0) {
            return view.getBottom();
        }
        return (view.getTop() > 0 ? view.getTop() : occludingBottom(((pyv0) getBinding()).i)) + tje.r(sug0.super_app_main_screen_flex_container_loading_background_height, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v66 mapBlurDelegate_delegate$lambda$0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        return w66.a(superAppDiscoveryMapV2ModalView.blurDelegateFactory, MAP_BLUR_ANALYTICS_PREFIX, false, null, new m76(null, 7), 14);
    }

    private final int occludingBottom(View view) {
        if (view.getVisibility() == 0) {
            return view.getBottom();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, TaxiMapView taxiMapView) {
        superAppDiscoveryMapV2ModalView.getMapBlurDelegate().b(taxiMapView);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderGamificationButton(fto state) {
        ((pyv0) getBinding()).f.render(state, this.imageLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderGamificationHeader(qto state) {
        View view;
        View view2;
        pyv0 pyv0Var = (pyv0) getBinding();
        if (state == null || !state.c) {
            ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView = pyv0Var.g;
            ExplorerOutlineRobotoTextView explorerOutlineRobotoTextView = pyv0Var.h;
            explorerDistrictCoverageProgressView.hide();
            explorerOutlineRobotoTextView.setText("");
            explorerOutlineRobotoTextView.setVisibility(4);
            bvo bvoVar = this.gamificationTopFadeOverlay;
            if (bvoVar == null || (view = bvoVar.d) == null) {
                return;
            }
            cma1.L(view);
            return;
        }
        ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView2 = pyv0Var.g;
        ExplorerOutlineRobotoTextView explorerOutlineRobotoTextView2 = pyv0Var.h;
        explorerDistrictCoverageProgressView2.setCoverage(state.b);
        pyv0Var.g.show();
        explorerOutlineRobotoTextView2.setText(state.a);
        explorerOutlineRobotoTextView2.setVisibility(0);
        bvo bvoVar2 = this.gamificationTopFadeOverlay;
        if (bvoVar2 != null && (view2 = bvoVar2.d) != null) {
            view2.setBackground(bvoVar2.b());
            cma1.J(view2);
        }
        loadDistrictFinishedIcon(state.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final vxp0 searchbarController_delegate$lambda$0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        return new vxp0(superAppDiscoveryMapV2ModalView.context, ((pyv0) superAppDiscoveryMapV2ModalView.getBinding()).m, superAppDiscoveryMapV2ModalView.imageLoader, superAppDiscoveryMapV2ModalView.getMapBlurDelegate(), new SuperAppDiscoveryMapV2ModalView$searchbarController$2$1(1, superAppDiscoveryMapV2ModalView.discoveryMapV2Presenter, wyv0.class, "handleSearchbarAction", "handleSearchbarAction(Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/state/SuperAppMapSearchbarState$SearchbarAction;)V", 0), new iyv0(superAppDiscoveryMapV2ModalView, 0), new SuperAppDiscoveryMapV2ModalView$searchbarController$2$3(1, superAppDiscoveryMapV2ModalView, SuperAppDiscoveryMapV2ModalView.class, "setMapButtonsContainerBottomMargin", "setMapButtonsContainerBottomMargin(I)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 searchbarController_delegate$lambda$0$0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, float f) {
        ((pyv0) superAppDiscoveryMapV2ModalView.getBinding()).f.setTranslationY(f);
        ((pyv0) superAppDiscoveryMapV2ModalView.getBinding()).l.setTranslationY(f);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setListeners() {
        pyv0 pyv0Var = (pyv0) getBinding();
        ru.yandex.taxi.design.utils.c.z(new SuperAppDiscoveryMapV2ModalView$setListeners$1$1(0, this.discoveryMapV2Presenter, wyv0.class, "onLocationFocusingButtonClicked", "onLocationFocusingButtonClicked()V", 0), pyv0Var.k);
        ru.yandex.taxi.design.utils.c.z(new SuperAppDiscoveryMapV2ModalView$setListeners$1$2(0, this.discoveryMapV2Presenter, wyv0.class, "onCloseFilterButtonClicked", "onCloseFilterButtonClicked()V", 0), pyv0Var.b);
        ru.yandex.taxi.design.utils.c.z(new SuperAppDiscoveryMapV2ModalView$setListeners$1$3(0, this.discoveryMapV2Presenter, wyv0.class, "onCompassButtonClicked", "onCompassButtonClicked()V", 0), pyv0Var.c);
        FilterButtonView filterButtonView = pyv0Var.d;
        filterButtonView.setFilterButtonEnabled(true);
        filterButtonView.setOnFilterClicked(new hyv0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setListeners$lambda$0$0$0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        wyv0 wyv0Var = superAppDiscoveryMapV2ModalView.discoveryMapV2Presenter;
        wyv0Var.M.a(wyv0Var.O, Boolean.TRUE);
        wyv0Var.S.a.a(zyv0.a, false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setMapButtonsContainerBottomMargin(int margin) {
        xw31.E(((pyv0) getBinding()).l, null, null, null, Integer.valueOf(margin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupFloatingHeader() {
        this.floatingHeader.addOnLayoutChangeListener(new jyv0(this, 1));
        ((pyv0) getBinding()).i.addView(this.floatingHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFloatingHeader$lambda$0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f = superAppDiscoveryMapV2ModalView.context.getResources().getDisplayMetrics().density;
        wyv0 wyv0Var = superAppDiscoveryMapV2ModalView.discoveryMapV2Presenter;
        wyv0Var.M.a(wyv0Var.P, Long.valueOf((long) (view.getHeight() / f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupViewportInsetsTracking() {
        jyv0 jyv0Var = new jyv0(this, 0);
        ((pyv0) getBinding()).n.addOnLayoutChangeListener(jyv0Var);
        ((pyv0) getBinding()).i.addOnLayoutChangeListener(jyv0Var);
        ((pyv0) getBinding()).m.addOnLayoutChangeListener(jyv0Var);
        this.flexContentContainer.a.addOnLayoutChangeListener(jyv0Var);
    }

    private final float stateBarOffset(boolean stateBarVisible) {
        if (stateBarVisible) {
            return tje.r(usg0.statebar_height, getContext());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateMapViewportInsets() {
        Object value;
        float f = this.context.getResources().getDisplayMetrics().density;
        if (f <= 0.0f) {
            return;
        }
        int max = Math.max(occludingBottom(((pyv0) getBinding()).n), Math.max(occludingBottom(((pyv0) getBinding()).i), flexOccludingBottom()));
        int height = this.discoveryMapV2Presenter.Lg().f ? ((pyv0) getBinding()).m.getHeight() : 0;
        ytj ytjVar = this.discoveryMapV2Presenter.i0;
        xtj.a aVar = new xtj.a(max / f, height / f, 0.0f, 0.0f);
        r0 r0Var = ((ztj) ytjVar).a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, xtj.a((xtj) value, null, null, aVar, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStatusBarBlur() {
        int i = getCurrentInsets().b;
        hzv0 Lg = this.discoveryMapV2Presenter.Lg();
        if (!Lg.g || i <= 0) {
            getMapBlurDelegate().d(new oxv0(1), STATUS_BAR_BLUR_ID);
        } else {
            getMapBlurDelegate().d(new kyv0(this, Float.intBitsToFloat((int) (rzo.A(this) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - stateBarOffset(Lg.h), i, 0), STATUS_BAR_BLUR_ID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a76 updateStatusBarBlur$lambda$0(a76 a76Var) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a76 updateStatusBarBlur$lambda$1(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, float f, int i, a76 a76Var) {
        return ngd0.w(ru.yandex.taxi.design.utils.c.d(sug0.discovery_map_status_bar_blur_radius, superAppDiscoveryMapV2ModalView), BlurEffect$CoordinatesType.Absolute, f, 1.0f, i + f + tje.r(sug0.discovery_map_status_bar_blur_extra_height, superAppDiscoveryMapV2ModalView.getContext()), 0.0f, null, 192);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
        ((pyv0) getBinding()).b.setColorFilter(qje.t(xng0.textMain, this.context));
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pyv0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(skh0.super_app_discovery_map_v2_modal_view_layout, parent, false);
        int i = i8h0.close_filter_button_view;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = i8h0.compass_button;
            ControlButtonView controlButtonView = (ControlButtonView) cma1.O(i, inflate);
            if (controlButtonView != null) {
                i = i8h0.filter_button_view;
                FilterButtonView filterButtonView = (FilterButtonView) cma1.O(i, inflate);
                if (filterButtonView != null && (O = cma1.O((i = i8h0.flex_loading_gradient), inflate)) != null) {
                    i = i8h0.gamification_button;
                    ExplorerButtonView explorerButtonView = (ExplorerButtonView) cma1.O(i, inflate);
                    if (explorerButtonView != null) {
                        i = i8h0.gamification_district_coverage;
                        ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView = (ExplorerDistrictCoverageProgressView) cma1.O(i, inflate);
                        if (explorerDistrictCoverageProgressView != null) {
                            i = i8h0.gamification_district_name;
                            ExplorerOutlineRobotoTextView explorerOutlineRobotoTextView = (ExplorerOutlineRobotoTextView) cma1.O(i, inflate);
                            if (explorerOutlineRobotoTextView != null) {
                                i = i8h0.header_view;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout != null) {
                                    i = i8h0.inner_flex_container;
                                    ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
                                    if (viewStub != null) {
                                        i = i8h0.location_focusing_button;
                                        ControlButtonView controlButtonView2 = (ControlButtonView) cma1.O(i, inflate);
                                        if (controlButtonView2 != null) {
                                            i = i8h0.map_buttons_container;
                                            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                                            if (goLinearLayout != null) {
                                                i = i8h0.searchbar_container;
                                                GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                                                if (goFrameLayout2 != null) {
                                                    i = i8h0.status_bar_view;
                                                    GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i, inflate);
                                                    if (goFrameLayout3 != null) {
                                                        return new pyv0((GoConstraintLayout) inflate, goImageView, controlButtonView, filterButtonView, O, explorerButtonView, explorerDistrictCoverageProgressView, explorerOutlineRobotoTextView, goFrameLayout, viewStub, controlButtonView2, goLinearLayout, goFrameLayout2, goFrameLayout3);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getActionMasked() == 0) {
            zl00 zl00Var = this.longPressDetector;
            Handler handler = zl00Var.e;
            a aVar = zl00Var.g;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, zl00Var.b);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(event);
        if (event.getActionMasked() == 0 && dispatchTouchEvent) {
            zl00 zl00Var2 = this.longPressDetector;
            Handler handler2 = zl00Var2.e;
            handler2.removeCallbacks(zl00Var2.g);
            handler2.removeCallbacks(zl00Var2.h);
        }
        return dispatchTouchEvent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new d230(112);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wyv0 wyv0Var = this.discoveryMapV2Presenter;
        nyv0 nyv0Var = new nyv0(this);
        com.yandex.go.superapp.discovery.map.impl.domain.interactors.a aVar = wyv0Var.T;
        ah00 ah00Var = wyv0Var.W;
        wyv0Var.Bg(nyv0Var);
        qyv0 qyv0Var = (qyv0) wyv0Var.Dg();
        jtv0 jtv0Var = wyv0Var.x;
        String str = jtv0Var != null ? jtv0Var.a : null;
        String str2 = jtv0Var != null ? jtv0Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        qyv0Var.m(str, str2);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$observePlacesLayerSelection$$inlined$collectIn$1(new f(new mth(wyv0Var.V.a(), 4)), null, wyv0Var), 3);
        zuv0 zuv0Var = wyv0Var.L;
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$observeGeolocationPermissionChanges$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new m(kotlinx.coroutines.flow.e.K(new i(new com.yandex.go.superapp.discovery.map.impl.domain.interactors.e(zuv0Var.a.i())), new k(new g(zuv0Var.c.a))), zuv0Var)), null, wyv0Var), 3);
        ((qyv0) wyv0Var.Dg()).c(wyv0Var.K.b());
        dzv0 dzv0Var = wyv0Var.S;
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$observeScreenState$$inlined$safeCollectIn$1(dzv0Var.a.c, null, wyv0Var), 3);
        pzt0 pzt0Var = wyv0Var.k0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        wyv0Var.k0 = tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$observeCompassButtonState$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new d(dib1.c(ah00Var)), new SuperAppDiscoveryMapV2Presenter$observeCompassButtonState$$inlined$start$1(wyv0Var, null))), null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$observeStateBarVisibility$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(wyv0Var.Z.a, new SuperAppDiscoveryMapV2Presenter$observeStateBarVisibility$$inlined$start$1(wyv0Var, null))), null, wyv0Var), 3);
        bac0 bac0Var = wyv0Var.G;
        x7c0 x7c0Var = (x7c0) wyv0Var.u0.getValue();
        kuv0 kuv0Var = wyv0Var.z;
        syv0 syv0Var = new syv0();
        huv0 huv0Var = wyv0Var.H;
        tyv0 tyv0Var = new tyv0();
        uyv0 uyv0Var = new uyv0(wyv0Var);
        com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex.c cVar = wyv0Var.F;
        euv0 euv0Var = wyv0Var.E;
        SetBuilder setBuilder = new SetBuilder();
        if (((SuperAppDiscoveryMapV2Experiment) wyv0Var.e0.a().c()).d) {
            setBuilder.add(wyv0Var.c0);
        }
        setBuilder.addAll(wyv0Var.Q);
        c9c0 a = bac0Var.a(x7c0Var, cVar, kuv0Var, setBuilder.b(), syv0Var, uyv0Var, huv0Var, tyv0Var, euv0Var, EmptySet.a, true, wyv0Var.B, (luv0) wyv0Var.D.get(), "superapp_discovery_map", wyv0Var.b0);
        wyv0Var.j0 = a;
        if (a != null) {
            oep0.b(wyv0Var.C, a);
            tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$openFlexMain$1(wyv0Var, a, null), 3);
        }
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1(wyv0Var, null), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeSourceAddressChanges$$inlined$safeCollectIn$1(wyv0Var.d0.j(RoutePointType.POINT_A, false), null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeSearchbarState$$inlined$safeCollectIn$1(aVar.d, null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$observeCurrentLayer$$inlined$safeCollectIn$1(aVar.f, null, wyv0Var), 3);
        avv0 avv0Var = wyv0Var.h0;
        com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b bVar = new com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b(avv0Var.a);
        wuo wuoVar = wyv0Var.f0;
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new m0(bVar, kotlinx.coroutines.flow.e.d(wuoVar.b), new SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$1(3, null))), null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d(wuoVar.c)), null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.t(new m0(dzv0Var.a.c, new com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b(avv0Var.a), new SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$4(3, null))), null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$subscribeToThemeSwitch$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(wyv0Var.g0.a()), null, wyv0Var), 3);
        tje.N(wyv0Var.Jg(), null, null, new SuperAppDiscoveryMapV2Presenter$pushBboxSafetyConfig$1(wyv0Var, null), 3);
        ((gh00) ah00Var).I(true);
        ((jgc0) this.userLocationOverlay).attach();
        zl00 zl00Var = this.longPressDetector;
        ((gh00) zl00Var.a).e(zl00Var.i);
        ((gh00) this.mapController).q(new iyv0(this, 1));
        setListeners();
        attachGamification();
    }

    @Override // com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        zl00 zl00Var = this.longPressDetector;
        ((gh00) zl00Var.a).u(zl00Var.i);
        Handler handler = zl00Var.e;
        handler.removeCallbacks(zl00Var.g);
        handler.removeCallbacks(zl00Var.h);
        if (zl00Var.f) {
            zl00Var.f = false;
            ((SuperAppDiscoveryMapV2ModalView$longPressDetector$2) zl00Var.d).invoke();
        }
        super.onDetachedFromWindow();
        detachGamification();
        ((jgc0) this.userLocationOverlay).detach();
        this.discoveryMapV2Presenter.Cg();
        getMapBlurDelegate().detach();
        vxp0 searchbarController = getSearchbarController();
        GoFrameLayout goFrameLayout = searchbarController.b;
        krl0 krl0Var = searchbarController.h;
        if (krl0Var != null) {
            zxv0 zxv0Var = (zxv0) krl0Var.b;
            ValueAnimator valueAnimator = zxv0Var.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            zxv0Var.e = null;
            goFrameLayout.removeView((SuperAppMapSearchbarView) krl0Var.a);
        }
        searchbarController.h = null;
        goFrameLayout.setTranslationY(0.0f);
        goFrameLayout.setVisibility(8);
        searchbarController.f.invoke(Float.valueOf(0.0f));
        ((SuperAppDiscoveryMapV2ModalView$searchbarController$2$3) searchbarController.g).invoke(Integer.valueOf(searchbarController.k));
        searchbarController.i = null;
        searchbarController.j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        int i = insets.d;
        int i2 = insets.b;
        vxp0 searchbarController = getSearchbarController();
        if (searchbarController.k != i) {
            searchbarController.k = i;
            krl0 krl0Var = searchbarController.h;
            if (krl0Var != null) {
                ((SuperAppMapSearchbarView) krl0Var.a).applyBottomInset(i);
            }
            if (!jl40.l(searchbarController.j, Boolean.TRUE)) {
                ((SuperAppDiscoveryMapV2ModalView$searchbarController$2$3) searchbarController.g).invoke(Integer.valueOf(i));
            }
        }
        pyv0 pyv0Var = (pyv0) getBinding();
        GoFrameLayout goFrameLayout = pyv0Var.n;
        ru.yandex.taxi.design.utils.c.D(goFrameLayout.getLayoutParams().width, i2, goFrameLayout);
        xw31.E(pyv0Var.h, null, Integer.valueOf(i2), null, null);
        xw31.x(i, this.flexContentContainer.a);
        updateStatusBarBlur();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void refreshTopPadding() {
        super.refreshTopPadding();
        bvo bvoVar = this.gamificationTopFadeOverlay;
        if (bvoVar != null) {
            bvoVar.c();
        }
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(0, 0, 0, 0);
    }
}
