package com.yandex.go.delivery.tracking;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.go.delivery.tracking.map_overlay.r;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.ah00;
import defpackage.avi;
import defpackage.avj0;
import defpackage.beh0;
import defpackage.bth0;
import defpackage.bvf0;
import defpackage.c230;
import defpackage.cih0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.eui;
import defpackage.f1h0;
import defpackage.fjz;
import defpackage.fui;
import defpackage.g18;
import defpackage.gh00;
import defpackage.gui;
import defpackage.hbp0;
import defpackage.iui;
import defpackage.jqr;
import defpackage.l390;
import defpackage.lg;
import defpackage.mqg0;
import defpackage.n4u0;
import defpackage.ng;
import defpackage.ny61;
import defpackage.onr0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.qui;
import defpackage.t1w;
import defpackage.tje;
import defpackage.u90;
import defpackage.xng0;
import defpackage.xni;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.yth;
import defpackage.zgz0;
import defpackage.zui;
import defpackage.zuj0;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.logistics.deliveries.map.search.DeliverySearchViews;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u008c\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u008d\u0001B_\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020%H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020%H\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u001dH\u0014¢\u0006\u0004\b.\u0010\u001fJ\u000f\u0010/\u001a\u00020(H\u0014¢\u0006\u0004\b/\u0010*J\u0017\u00102\u001a\u00020%2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001d2\u0006\u00105\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020%2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0014¢\u0006\u0004\b;\u0010<J7\u0010B\u001a\u00020%2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020(H\u0014¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020%H\u0014¢\u0006\u0004\bD\u0010,J\u000f\u0010E\u001a\u00020%H\u0014¢\u0006\u0004\bE\u0010,J\u0017\u0010F\u001a\u00020%2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\bF\u00103J\u001f\u0010I\u001a\u00020%2\u0006\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020\u001dH\u0014¢\u0006\u0004\bI\u0010JJ\u001f\u0010O\u001a\u00020\u00022\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020%H\u0016¢\u0006\u0004\bQ\u0010,J\u0017\u0010S\u001a\u00020%2\u0006\u0010R\u001a\u00020\u001dH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020%H\u0016¢\u0006\u0004\bU\u0010,J\u0017\u0010W\u001a\u00020%2\u0006\u0010V\u001a\u00020\u001aH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020%2\u0006\u0010Y\u001a\u00020(H\u0016¢\u0006\u0004\bZ\u0010[J\u001f\u0010^\u001a\u00020%2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u001dH\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020%H\u0002¢\u0006\u0004\b`\u0010,J\u000f\u0010a\u001a\u00020%H\u0002¢\u0006\u0004\ba\u0010,J\u0017\u0010d\u001a\u00020c2\u0006\u0010b\u001a\u00020(H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u0002002\u0006\u0010f\u001a\u000209H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020%H\u0002¢\u0006\u0004\bi\u0010,J\u000f\u0010j\u001a\u00020%H\u0002¢\u0006\u0004\bj\u0010,J\u000f\u0010k\u001a\u00020%H\u0002¢\u0006\u0004\bk\u0010,J\u000f\u0010l\u001a\u00020%H\u0002¢\u0006\u0004\bl\u0010,J\u000f\u0010m\u001a\u00020%H\u0002¢\u0006\u0004\bm\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010nR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010oR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010oR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010pR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010qR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010sR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020(0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0016\u0010\u008b\u0001\u001a\u00020(8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010*¨\u0006\u008e\u0001"}, d2 = {"Lcom/yandex/go/delivery/tracking/DeliveryTrackingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Liui;", "Lqui;", "Ll390;", "Landroid/content/Context;", "context", "Lcom/yandex/go/delivery/tracking/l;", "presenter", "Lxni;", "trackingEngine", "promotionsEngine", "Lyth;", "logisticsOrderMapMediator", "Lcom/yandex/go/delivery/tracking/map_overlay/r;", "deliverySearchViewsPresenter", "Lzui;", "deliveryTrackingScreenStateRegistrar", "Lah00;", "mapController", "Lzuj0;", "resourcesProxy", "Lru/yandex/taxi/logistics/delivery_state/DeliveryStateBaseParams;", "params", "<init>", "(Landroid/content/Context;Lcom/yandex/go/delivery/tracking/l;Lxni;Lxni;Lyth;Lcom/yandex/go/delivery/tracking/map_overlay/r;Lzui;Lah00;Lzuj0;Lru/yandex/taxi/logistics/delivery_state/DeliveryStateBaseParams;)V", "", "screenName", "()Ljava/lang/String;", "", "canHandleScreenTracking", "()Z", "Lc230;", "insetsType", "()Lc230;", "Lt1w;", "insets", "Lzy11;", "onInsetsHandled", "(Lt1w;)V", "", "getTopOffset", "()I", "onAttachedToWindow", "()V", "onDetachedFromWindow", "canDragToExpandFromAnchored", "getMaxAnchoredHeight", "", "newOffset", "setBackgroundDimColor", "(F)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onBackPressed", "onArrowClick", "onDialogSlide", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Liui;", "close", "isVisible", "setBackFloatButtonVisible", "(Z)V", "setMapFocusAboveCard", "text", "updateBadgeText", "(Ljava/lang/String;)V", ClidProvider.STATE, "setState", "(I)V", "hidden", "withoutTransition", "setHidden", "(ZZ)V", "createAndAttachSearchViews", "removeSearchViews", "cardTop", "Lcom/yandex/mapkit/ScreenRect;", "calculateScreenRect", "(I)Lcom/yandex/mapkit/ScreenRect;", "contentView", "hiddenTranslationY", "(Landroid/view/View;)F", "hideKeyboard", "listenForUpsellContainerChanges", "updateFloatButtons", "updateBackGround", "releaseMapTouch", "Lcom/yandex/go/delivery/tracking/l;", "Lxni;", "Lyth;", "Lcom/yandex/go/delivery/tracking/map_overlay/r;", "Lzui;", "Lah00;", "Lzuj0;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Lpz40;", "upsellContainerHeightFlow", "Lpz40;", "Lru/yandex/taxi/logistics/deliveries/map/search/DeliverySearchViews;", "deliverySearchViews", "Lru/yandex/taxi/logistics/deliveries/map/search/DeliverySearchViews;", "Lng;", "accessibilityButtonsDelegate", "Lng;", "Lg18;", "coordinatorListenerCancellable", "Lg18;", "lastPanelState", "Ljava/lang/Integer;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backFloatButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "recenterFloatButton", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "gui", "tracking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryTrackingModalView extends SlideableBindingModalView<iui> implements qui, l390 {
    public static final gui Companion = new gui();
    private static final long DIMMING_ANIMATION_SPEED = 200;
    private static final double HIDE_DIMMING_THRESHOLD = 0.25d;
    private static final double SHOW_DIMMING_THRESHOLD = 0.2d;
    private static final float START_OFFSET = 0.6f;
    private final ng accessibilityButtonsDelegate;
    private FloatButtonIconComponent backFloatButton;
    private g18 coordinatorListenerCancellable;
    private DeliverySearchViews deliverySearchViews;
    private final r deliverySearchViewsPresenter;
    private final zui deliveryTrackingScreenStateRegistrar;
    private Integer lastPanelState;
    private final yth logisticsOrderMapMediator;
    private final ah00 mapController;
    private final l presenter;
    private final xni promotionsEngine;
    private final FloatButtonIconComponent recenterFloatButton;
    private final zuj0 resourcesProxy;
    private final hbp0 scopeDelegate;
    private final xni trackingEngine;
    private final pz40 upsellContainerHeightFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryTrackingModalView(Context context, l lVar, xni xniVar, xni xniVar2, yth ythVar, r rVar, zui zuiVar, ah00 ah00Var, zuj0 zuj0Var, DeliveryStateBaseParams deliveryStateBaseParams) {
        super(context, deliveryStateBaseParams.getIsCompleted() ? 7 : Expansion.EXPANDED == deliveryStateBaseParams.getExpansion() ? 3 : -1);
        Companion.getClass();
        this.presenter = lVar;
        this.trackingEngine = xniVar;
        this.promotionsEngine = xniVar2;
        this.logisticsOrderMapMediator = ythVar;
        this.deliverySearchViewsPresenter = rVar;
        this.deliveryTrackingScreenStateRegistrar = zuiVar;
        this.mapController = ah00Var;
        this.resourcesProxy = zuj0Var;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
        this.upsellContainerHeightFlow = bvf0.c(0);
        this.accessibilityButtonsDelegate = new ng(this, getCardContentView(), new lg(getTopPadding(), new DeliveryTrackingModalView$accessibilityButtonsDelegate$1(0, this, DeliveryTrackingModalView.class, "onBackPressed", "onBackPressed()V", 0), new fui(this, 0), (Integer) null, 24));
        eui euiVar = new eui(lVar, 4);
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), null == true ? 1 : 0, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(euiVar);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        backFloatButton$lambda$0(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backFloatButton = backButtonIconComponent;
        eui euiVar2 = new eui(lVar, 5);
        int i = f1h0.ic_location_fill_24;
        FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        floatButtonIconComponent.setDebounceClickListener(euiVar2);
        floatButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, floatButtonIconComponent.getContext())));
        floatButtonIconComponent.setIcon(i);
        recenterFloatButton$lambda$0(floatButtonIconComponent);
        addFloatButton(floatButtonIconComponent, 8388661);
        this.recenterFloatButton = floatButtonIconComponent;
        setDismissOnTouchOutside(false);
        setEnableBackgroundOnAppearing(false);
        updateFloatButtons();
        getBottomSheet().setBackgroundResource(mqg0.transparent);
        setArrowState(ArrowsView.State.GONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 accessibilityButtonsDelegate$lambda$0(DeliveryTrackingModalView deliveryTrackingModalView) {
        deliveryTrackingModalView.expand();
        deliveryTrackingModalView.getCardContentView().scrollTo(0, 0);
        return zy11.a;
    }

    private static final zy11 backFloatButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setId(beh0.back_floating_button);
        floatButtonIconComponent.setBadgeBackgroundColor(qje.t(xng0.controlMain, floatButtonIconComponent.getContext()));
        floatButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        return zy11.a;
    }

    private final ScreenRect calculateScreenRect(int cardTop) {
        View content = getContent();
        float w = tje.w(40, ((avj0) this.resourcesProxy).a);
        float w2 = tje.w(80, ((avj0) this.resourcesProxy).a) + getStatusBarHeight();
        return new ScreenRect(new ScreenPoint(w, w2), new ScreenPoint(content.getWidth() - w, Math.max(tje.w(48, ((avj0) this.resourcesProxy).a) + w2, cardTop - (tje.w(16, ((avj0) this.resourcesProxy).a) - getStatusBarHeight()))));
    }

    private final void createAndAttachSearchViews() {
        DeliverySearchViews deliverySearchViews = new DeliverySearchViews(getContext(), null, 0, 6, null);
        deliverySearchViews.setId(beh0.logistics_search_animation_view_container);
        deliverySearchViews.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = -getTopPadding();
        setClipChildren(false);
        setClipToPadding(false);
        addView(deliverySearchViews, 0, layoutParams);
        this.deliverySearchViews = deliverySearchViews;
        r rVar = this.deliverySearchViewsPresenter;
        rVar.c = deliverySearchViews;
        rVar.a();
    }

    private final float hiddenTranslationY(View contentView) {
        return Math.max(contentView.getHeight(), Math.max(getRootView().getHeight(), getResources().getDisplayMetrics().heightPixels));
    }

    private final void hideKeyboard() {
        View findFocus = getBinding().b.findFocus();
        if (findFocus == null) {
            findFocus = getBinding().b;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(DeliveryTrackingModalView deliveryTrackingModalView) {
        return deliveryTrackingModalView.getBinding().d;
    }

    private final void listenForUpsellContainerChanges() {
        tje.N(this.scopeDelegate.c(), null, null, new DeliveryTrackingModalView$listenForUpsellContainerChanges$1(this, null), 3);
        getBinding().e.addOnLayoutChangeListener(new u90(25, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForUpsellContainerChanges$lambda$0(DeliveryTrackingModalView deliveryTrackingModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        r0 r0Var;
        Object value;
        pz40 pz40Var = deliveryTrackingModalView.upsellContainerHeightFlow;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
            ((Number) value).intValue();
        } while (!r0Var.k(value, Integer.valueOf(i4 - i2)));
    }

    private static final zy11 recenterFloatButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setId(beh0.recenter_floating_button);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recenterFloatButton$onRecenterClicked(l lVar) {
        lVar.y.a(true);
    }

    private final void releaseMapTouch() {
        if (((gh00) this.mapController).n()) {
            TaxiMapView h = ((gh00) this.mapController).h();
            if (h == null) {
                h = null;
            }
            if (h == null) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            h.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 1.0f, 1.0f, 0));
        }
    }

    private final void removeSearchViews() {
        DeliverySearchViews deliverySearchViews = this.deliverySearchViews;
        if (deliverySearchViews != null) {
            ViewParent parent = deliverySearchViews.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(deliverySearchViews);
            }
        }
        this.deliverySearchViews = null;
    }

    private final void updateBackGround() {
        float height = getContent().getHeight();
        if (height == 0.0f) {
            return;
        }
        float topWithFloatButtons = getTopWithFloatButtons() / height;
        if (getIsBackgroundVisibleState()) {
            if (topWithFloatButtons > HIDE_DIMMING_THRESHOLD) {
                animateDismissBackground();
            }
        } else if (topWithFloatButtons < SHOW_DIMMING_THRESHOLD) {
            animateShowBackground(200L);
        }
    }

    private final void updateFloatButtons() {
        float c = y6i0.c(1.0f - getCurrentOffset(), 0.0f, 1.0f);
        this.backFloatButton.setAlpha(c);
        this.backFloatButton.setClickable(c > 0.5f);
        this.recenterFloatButton.setAlpha(c);
        this.recenterFloatButton.setClickable(c > 0.5f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public iui bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        ViewGroup cardContentContainer = getCardContentContainer();
        if (cardContentContainer == null) {
            ny61.t("parent");
            return null;
        }
        inflater.inflate(bth0.delivery_tracking_modal_view, cardContentContainer);
        int i = cih0.content_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, cardContentContainer);
        if (frameLayout != null && (O = cma1.O((i = cih0.navigation_bar), cardContentContainer)) != null) {
            i = cih0.root_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, cardContentContainer);
            if (constraintLayout != null) {
                i = cih0.upsell_container;
                FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, cardContentContainer);
                if (frameLayout2 != null) {
                    return new iui(cardContentContainer, frameLayout, O, constraintLayout, frameLayout2);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(cardContentContainer.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // defpackage.qui
    public void close() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return (int) (getContent().getHeight() * 0.6f);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopOffset() {
        return getBinding().b.getTop();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new fui(this, 1), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        l lVar = this.presenter;
        lVar.E.a(lVar.W, "arrow_button");
        zgz0 zgz0Var = lVar.V;
        if (zgz0Var != null) {
            zgz0Var.invoke();
        }
        lVar.close();
        super.onArrowClick();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        l lVar = this.presenter;
        lVar.Bg(this);
        yth ythVar = lVar.y;
        ((gh00) ythVar.d).e(ythVar.e);
        lVar.I.a.n();
        int i = 1;
        ythVar.a(true);
        lVar.T.i(Screen.DELIVERY_ROUTE);
        int i2 = 3;
        tje.N(lVar.Jg(), null, null, new DeliveryTrackingPresenter$attachView$1(lVar, null), 3);
        ru.yandex.taxi.logistics.sdk.tracking.preparer.a aVar = lVar.J;
        tje.N(lVar.Jg(), null, null, new DeliveryTrackingPresenter$observeObjectsOverMapScreen$$inlined$collectIn$1(new g(new e((n4u0) aVar.e.getValue())), null, lVar.U), 3);
        kotlinx.coroutines.flow.e.H(lVar.Jg(), new jqr(new k(new i((n4u0) aVar.e.getValue())), new DeliveryTrackingPresenter$observeSearchesView$2(lVar, null), i2));
        kotlinx.coroutines.flow.e.H(lVar.Jg(), new jqr(lVar.K.b(), new DeliveryTrackingPresenter$observeBackButtonBadge$1(2, lVar.Dg(), qui.class, "updateBadgeText", "updateBadgeText(Ljava/lang/String;)V", 4), i2));
        tje.N(lVar.Jg(), null, null, new DeliveryTrackingPresenter$observeEditFlow$1(lVar, null), 3);
        avi aviVar = (avi) this.deliveryTrackingScreenStateRegistrar;
        aviVar.getClass();
        aviVar.a = new WeakReference(this);
        setHidden(aviVar.c, true);
        if (!aviVar.c) {
            aviVar.b = null;
        }
        this.trackingEngine.b(getBinding().b);
        listenForUpsellContainerChanges();
        this.promotionsEngine.b(getBinding().e);
        if (behaviourState() != 3) {
            this.accessibilityButtonsDelegate.a();
            this.accessibilityButtonsDelegate.d();
        }
        setUpdateScrollViewOnHeightChange(true);
        ((gh00) this.logisticsOrderMapMediator.d).p(this);
        createAndAttachSearchViews();
        FrameLayout frameLayout = getBinding().b;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.delivery.tracking.DeliveryTrackingModalView$onAttachedToWindow$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    DeliveryTrackingModalView.this.setMapFocusAboveCard();
                }
            });
        } else {
            setMapFocusAboveCard();
        }
        setOnTouchOutsideListener(new eui(this.presenter, 0));
        setOnArrowClickListener(new eui(this.presenter, i));
        setOnSlideOutListener(new eui(this.presenter, 2));
        setOnBackPressedListener(new eui(this.presenter, i2));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        l lVar = this.presenter;
        lVar.E.a(lVar.W, "android_back_button");
        zgz0 zgz0Var = lVar.V;
        if (zgz0Var != null) {
            zgz0Var.invoke();
        }
        lVar.close();
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r11 != 7) goto L25;
     */
    @Override // ru.yandex.taxi.widget.SlideableModalView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (getBinding().b.isShown() && newState == 6) {
            ScreenRect calculateScreenRect = calculateScreenRect(getTopWithFloatButtons());
            this.logisticsOrderMapMediator.b(this, calculateScreenRect);
            this.deliverySearchViewsPresenter.b(calculateScreenRect);
        }
        if (movedByUser) {
            if (newState != 3) {
                if (newState == 6) {
                    Integer num = this.lastPanelState;
                    if (num == null || num.intValue() != newState) {
                        l lVar = this.presenter;
                        onr0.b(lVar.E.e, fjz.b(lVar.W), null, "pull", null, null, 122);
                        this.lastPanelState = Integer.valueOf(newState);
                    }
                }
            }
            Integer num2 = this.lastPanelState;
            if (num2 == null || num2.intValue() != newState) {
                l lVar2 = this.presenter;
                onr0.c(lVar2.E.e, fjz.b(lVar2.W), null, "pull", null, null, HProv.PP_INFO);
                this.lastPanelState = Integer.valueOf(newState);
            }
        }
        if (newState == 3) {
            this.accessibilityButtonsDelegate.c(true);
            this.accessibilityButtonsDelegate.b();
        } else {
            if (newState != 6) {
                return;
            }
            this.accessibilityButtonsDelegate.a();
            this.accessibilityButtonsDelegate.d();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.coordinatorListenerCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.scopeDelegate.b();
        r rVar = this.deliverySearchViewsPresenter;
        DeliverySearchViews deliverySearchViews = rVar.c;
        if (deliverySearchViews != null) {
            deliverySearchViews.setVisibility(8);
        }
        pzt0 pzt0Var = rVar.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        rVar.d = null;
        removeSearchViews();
        ((gh00) this.logisticsOrderMapMediator.d).r(this);
        this.trackingEngine.a();
        this.promotionsEngine.a();
        avi aviVar = (avi) this.deliveryTrackingScreenStateRegistrar;
        aviVar.a = null;
        if (aviVar.d) {
            aviVar.b = new WeakReference(this);
        } else {
            aviVar.b = null;
        }
        this.presenter.Cg();
        hideKeyboard();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        if (getBinding().b.isShown() && (getBottomSheetBehavior().E == 1 || getBottomSheetBehavior().E == 2)) {
            ScreenRect calculateScreenRect = calculateScreenRect(getTopWithFloatButtons());
            this.logisticsOrderMapMediator.b(this, calculateScreenRect);
            this.deliverySearchViewsPresenter.b(calculateScreenRect);
        }
        updateBackGround();
        updateFloatButtons();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        View view = getBinding().c;
        ru.yandex.taxi.design.utils.c.D(view.getLayoutParams().width, insets.g, view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        updateBackGround();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView()) || getIsBackgroundVisibleState()) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "delivery_order_details";
    }

    @Override // defpackage.qui
    public void setBackFloatButtonVisible(boolean isVisible) {
        this.backFloatButton.setVisibility(isVisible ? 0 : 8);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
    }

    @Override // defpackage.qui
    public void setHidden(boolean hidden, boolean withoutTransition) {
        View content = getContent();
        boolean z = content.getVisibility() == 4;
        if (hidden && withoutTransition) {
            content.setVisibility(4);
            return;
        }
        content.setVisibility(0);
        if (!hidden && z) {
            content.setTranslationY(hiddenTranslationY(content));
        }
        float hiddenTranslationY = hidden ? hiddenTranslationY(content) : 0.0f;
        content.animate().cancel();
        if (content.isAttachedToWindow()) {
            content.animate().translationY(hiddenTranslationY).setDuration(200L).start();
        } else {
            content.setTranslationY(hiddenTranslationY);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        super.setInitialBehaviorState(bottomSheetBehavior);
        bottomSheetBehavior.C = false;
        bottomSheetBehavior.W = false;
    }

    @Override // defpackage.qui
    public void setMapFocusAboveCard() {
        if (getBinding().b.isShown()) {
            releaseMapTouch();
            ScreenRect calculateScreenRect = calculateScreenRect(getTopWithFloatButtons());
            this.logisticsOrderMapMediator.b(this, calculateScreenRect);
            this.deliverySearchViewsPresenter.b(calculateScreenRect);
        }
    }

    @Override // defpackage.qui
    public void setState(int state) {
        getBottomSheetBehavior().O(state);
    }

    @Override // defpackage.qui
    public void updateBadgeText(String text) {
        this.backFloatButton.setBadgeText(text);
    }
}
