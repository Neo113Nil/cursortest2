package com.yandex.go.navigator.driving;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.analitycs.NavigatorRevealCardAnalytics$DrivingModalState;
import com.yandex.go.navigator.complete_route.CancelMode;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.navigator.maneuver.DrivingBubbleView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import defpackage.ah00;
import defpackage.akm;
import defpackage.ame;
import defpackage.bdc;
import defpackage.bkm;
import defpackage.blm;
import defpackage.bme;
import defpackage.c0m;
import defpackage.cma1;
import defpackage.cme;
import defpackage.d9y;
import defpackage.dme;
import defpackage.ekm;
import defpackage.ewc;
import defpackage.fuh0;
import defpackage.gci0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.ikm;
import defpackage.imm;
import defpackage.jqr;
import defpackage.krb1;
import defpackage.m950;
import defpackage.mkm;
import defpackage.mtr;
import defpackage.n5;
import defpackage.nkm;
import defpackage.ny61;
import defpackage.of11;
import defpackage.ofp0;
import defpackage.okm;
import defpackage.pwy0;
import defpackage.qkm;
import defpackage.qtg0;
import defpackage.rkm;
import defpackage.s8o;
import defpackage.scc;
import defpackage.skm;
import defpackage.sls;
import defpackage.tje;
import defpackage.tkm;
import defpackage.tpr;
import defpackage.txk;
import defpackage.uh6;
import defpackage.v2h0;
import defpackage.vh91;
import defpackage.vjm;
import defpackage.vle;
import defpackage.vng;
import defpackage.w511;
import defpackage.wb50;
import defpackage.wqj;
import defpackage.x95;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.z5h0;
import defpackage.zch;
import defpackage.zjm;
import defpackage.zle;
import defpackage.zvi;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000ß\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t*\u0001|\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0099\u0001Bm\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001dH\u0014¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020 H\u0014¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u001dH\u0014¢\u0006\u0004\b%\u0010\u001fJ\u001f\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010\"J\u000f\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010\"J\u0017\u00100\u001a\u00020 2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020 H\u0014¢\u0006\u0004\b2\u0010\"J\u000f\u00103\u001a\u00020 H\u0014¢\u0006\u0004\b3\u0010\"J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0014¢\u0006\u0004\b:\u00109J\u001f\u0010=\u001a\u00020 2\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u001dH\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020 2\u0006\u0010?\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020 2\b\b\u0002\u0010B\u001a\u00020\u001d¢\u0006\u0004\bC\u0010AJ\u0019\u0010F\u001a\u00020 2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020 2\u0006\u0010H\u001a\u000207¢\u0006\u0004\bI\u0010JJ\u001f\u0010N\u001a\u00020 2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020KH\u0014¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020 H\u0016¢\u0006\u0004\bP\u0010\"J\u000f\u0010Q\u001a\u00020 H\u0016¢\u0006\u0004\bQ\u0010\"J\u000f\u0010R\u001a\u000207H\u0014¢\u0006\u0004\bR\u00109J\u000f\u0010S\u001a\u00020 H\u0002¢\u0006\u0004\bS\u0010\"J\u000f\u0010T\u001a\u00020 H\u0002¢\u0006\u0004\bT\u0010\"J\u000f\u0010U\u001a\u000207H\u0002¢\u0006\u0004\bU\u00109J\u000f\u0010V\u001a\u000207H\u0002¢\u0006\u0004\bV\u00109J\u000f\u0010W\u001a\u00020 H\u0002¢\u0006\u0004\bW\u0010\"J\u000f\u0010X\u001a\u00020 H\u0002¢\u0006\u0004\bX\u0010\"J\u000f\u0010Y\u001a\u00020 H\u0002¢\u0006\u0004\bY\u0010\"J\u000f\u0010Z\u001a\u00020\u001dH\u0002¢\u0006\u0004\bZ\u0010\u001fJ\u000f\u0010[\u001a\u00020\u001dH\u0002¢\u0006\u0004\b[\u0010\u001fJ\u001d\u0010_\u001a\u00020 2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020 H\u0002¢\u0006\u0004\ba\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010eR\u0014\u0010f\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001b\u0010k\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u00109R\u001b\u0010n\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010i\u001a\u0004\bm\u00109R\u001b\u0010q\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010i\u001a\u0004\bp\u00109R&\u0010x\u001a\r\u0012\t\u0012\u00070s¢\u0006\u0002\bt0r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010i\u001a\u0004\bv\u0010wR\u001b\u0010{\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010i\u001a\u0004\bz\u00109R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010i\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010i\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0090\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010i\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R \u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010i\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u0098\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010i\u001a\u0006\b\u0097\u0001\u0010\u0082\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/yandex/go/navigator/driving/DrivingModalView;", "Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Ltkm;", "Landroid/content/Context;", "context", "Likm;", "presenter", "Lbkm;", "contentSizesRepository", "Lvjm;", "drivingButtonWithIconMapper", "Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;", "drivingTopView", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lewc;", "compassButtonPresenter", "Lwb50;", "focusCoordinator", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Landroid/content/Context;Likm;Lbkm;Lvjm;Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;Lru/yandex/taxi/discovery/a;Lah00;Lcom/yandex/go/navigator/repository/o;Lcom/yandex/go/navigator/domain/e;Lewc;Lwb50;Lcom/yandex/go/navigator/analitycs/a;)V", "", "useBelowCardDimming", "()Z", "Lzy11;", "updateRightSideContainer", "()V", "isArrowsPermanentlyHidden", "onArrowClick", "canDragToExpandFromAnchored", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltkm;", "onOverviewButtonClicked", "onGeoTap", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "onDetachedFromWindow", "", "screenName", "()Ljava/lang/String;", "", "anchoredHeight", "()I", "getMaxAnchoredHeight", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "isVisible", "changeFloatingComponentsVisibility", "(Z)V", "updateInRepository", "removeNotifications", "Landroid/view/View$OnLayoutChangeListener;", "listener", "addOnLayoutChangeListener", "(Landroid/view/View$OnLayoutChangeListener;)V", "margin", "setControlsBottomMargin", "(I)V", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "hideFloatingComponents", "showFloatingComponents", "topRightSideButtonsOffset", "applyControlsRedesign", "applyThemeForButtons", "getDrivingBubbleHeight", "getNotificationHeight", "sendContentSizes", "addShadowScrollListener", "updateShadowVisibility", "canScrollDown", "canScrollUp", "", "Ldme;", "horizontalButtons", "renderHorizontalButtons", "(Ljava/util/List;)V", "updateStreetAddressViewMargin", "Likm;", "Lbkm;", "Lvjm;", "Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;", "largeButtonSize", CA20Status.STATUS_USER_I, "bubbleBottomMargin$delegate", "Li3y;", "getBubbleBottomMargin", "bubbleBottomMargin", "baseBubbleHorizontalMargin$delegate", "getBaseBubbleHorizontalMargin", "baseBubbleHorizontalMargin", "horizontalButtonsMargin$delegate", "getHorizontalButtonsMargin", "horizontalButtonsMargin", "", "Lcom/yandex/go/navigator/driving/DrivingTimeTextView;", "Lkotlin/jvm/internal/EnhancedNullability;", "sizeAwareTextViews$delegate", "getSizeAwareTextViews", "()[Lcom/yandex/go/navigator/driving/DrivingTimeTextView;", "sizeAwareTextViews", "scrollViewMaxHeight$delegate", "getScrollViewMaxHeight", "scrollViewMaxHeight", "skm", "onTextChangedListener", "Lskm;", "Landroid/widget/FrameLayout;", "streetAddressViewContainer$delegate", "getStreetAddressViewContainer", "()Landroid/widget/FrameLayout;", "streetAddressViewContainer", "Ld9y;", "leftSideButtonsContainer$delegate", "getLeftSideButtonsContainer", "()Ld9y;", "leftSideButtonsContainer", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "getBackButton", "()Lru/yandex/taxi/design/FloatButtonIconComponent;", "incidentsButton$delegate", "getIncidentsButton", "incidentsButton", "Lcom/yandex/go/navigator/maneuver/DrivingBubbleView;", "drivingBubbleView$delegate", "getDrivingBubbleView", "()Lcom/yandex/go/navigator/maneuver/DrivingBubbleView;", "drivingBubbleView", "notificationStackComponent$delegate", "getNotificationStackComponent", "notificationStackComponent", "com/yandex/go/navigator/driving/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrivingModalView extends BaseNavigatorModalView<tkm> {
    public static final int $stable = 8;
    private final FloatButtonIconComponent backButton;

    /* renamed from: baseBubbleHorizontalMargin$delegate, reason: from kotlin metadata */
    private final i3y baseBubbleHorizontalMargin;

    /* renamed from: bubbleBottomMargin$delegate, reason: from kotlin metadata */
    private final i3y bubbleBottomMargin;
    private final bkm contentSizesRepository;

    /* renamed from: drivingBubbleView$delegate, reason: from kotlin metadata */
    private final i3y drivingBubbleView;
    private final vjm drivingButtonWithIconMapper;
    private final DrivingTopView drivingTopView;

    /* renamed from: horizontalButtonsMargin$delegate, reason: from kotlin metadata */
    private final i3y horizontalButtonsMargin;

    /* renamed from: incidentsButton$delegate, reason: from kotlin metadata */
    private final i3y incidentsButton;
    private final int largeButtonSize;

    /* renamed from: leftSideButtonsContainer$delegate, reason: from kotlin metadata */
    private final i3y leftSideButtonsContainer;

    /* renamed from: notificationStackComponent$delegate, reason: from kotlin metadata */
    private final i3y notificationStackComponent;
    private final skm onTextChangedListener;
    private final ikm presenter;

    /* renamed from: scrollViewMaxHeight$delegate, reason: from kotlin metadata */
    private final i3y scrollViewMaxHeight;

    /* renamed from: sizeAwareTextViews$delegate, reason: from kotlin metadata */
    private final i3y sizeAwareTextViews;

    /* renamed from: streetAddressViewContainer$delegate, reason: from kotlin metadata */
    private final i3y streetAddressViewContainer;

    public DrivingModalView(final Context context, ikm ikmVar, bkm bkmVar, vjm vjmVar, DrivingTopView drivingTopView, ru.yandex.taxi.discovery.a aVar, ah00 ah00Var, com.yandex.go.navigator.repository.o oVar, com.yandex.go.navigator.domain.e eVar, ewc ewcVar, wb50 wb50Var, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context, aVar, ah00Var, wb50Var, oVar, eVar, ewcVar, aVar2);
        this.presenter = ikmVar;
        this.contentSizesRepository = bkmVar;
        this.drivingButtonWithIconMapper = vjmVar;
        this.drivingTopView = drivingTopView;
        this.largeButtonSize = tje.u(56, getContext());
        okm okmVar = new okm(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.bubbleBottomMargin = kotlin.a.b(lazyThreadSafetyMode, okmVar);
        this.baseBubbleHorizontalMargin = kotlin.a.b(lazyThreadSafetyMode, new okm(this, 5));
        this.horizontalButtonsMargin = kotlin.a.b(lazyThreadSafetyMode, new okm(this, 6));
        final int i = 0;
        this.sizeAwareTextViews = kotlin.a.b(lazyThreadSafetyMode, new okm(this, i));
        final int i2 = 1;
        this.scrollViewMaxHeight = kotlin.a.b(lazyThreadSafetyMode, new okm(this, i2));
        this.onTextChangedListener = new skm(this);
        this.streetAddressViewContainer = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: pkm
            @Override // defpackage.sls
            public final Object invoke() {
                FrameLayout streetAddressViewContainer_delegate$lambda$0;
                DrivingBubbleView drivingBubbleView_delegate$lambda$0;
                int i3 = i;
                DrivingModalView drivingModalView = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        streetAddressViewContainer_delegate$lambda$0 = DrivingModalView.streetAddressViewContainer_delegate$lambda$0(context2, drivingModalView);
                        return streetAddressViewContainer_delegate$lambda$0;
                    default:
                        drivingBubbleView_delegate$lambda$0 = DrivingModalView.drivingBubbleView_delegate$lambda$0(context2, drivingModalView);
                        return drivingBubbleView_delegate$lambda$0;
                }
            }
        });
        this.leftSideButtonsContainer = kotlin.a.b(lazyThreadSafetyMode, new n5(context, 17));
        FloatButtonIconComponent floatButtonIconComponent = getLeftSideButtonsContainer().b;
        floatButtonIconComponent.setDebounceClickListener(new qkm(this, i));
        this.backButton = floatButtonIconComponent;
        this.incidentsButton = kotlin.a.b(lazyThreadSafetyMode, new okm(this, 2));
        this.drivingBubbleView = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: pkm
            @Override // defpackage.sls
            public final Object invoke() {
                FrameLayout streetAddressViewContainer_delegate$lambda$0;
                DrivingBubbleView drivingBubbleView_delegate$lambda$0;
                int i3 = i2;
                DrivingModalView drivingModalView = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        streetAddressViewContainer_delegate$lambda$0 = DrivingModalView.streetAddressViewContainer_delegate$lambda$0(context2, drivingModalView);
                        return streetAddressViewContainer_delegate$lambda$0;
                    default:
                        drivingBubbleView_delegate$lambda$0 = DrivingModalView.drivingBubbleView_delegate$lambda$0(context2, drivingModalView);
                        return drivingBubbleView_delegate$lambda$0;
                }
            }
        });
        this.notificationStackComponent = kotlin.a.b(lazyThreadSafetyMode, new n5(context, 18));
        applyControlsRedesign();
        addView(drivingTopView, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ tkm access$getBinding(DrivingModalView drivingModalView) {
        return (tkm) drivingModalView.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addShadowScrollListener() {
        ((tkm) getBinding()).l.addScrollChangeListener(new x95(3, this));
    }

    private final void applyControlsRedesign() {
        int m = s8o.m(new bdc(xng0.bgMain), getContext());
        View view = getLeftSideButtonsContainer().a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388611;
        layoutParams.setMarginStart(-ru.yandex.taxi.design.utils.c.h(8, view));
        view.setLayoutParams(layoutParams);
        addView(view);
        xw31.x(tje.u(12, getContext()), getBackButton());
        xw31.E(getRightSideButtonsContainer().b, null, Integer.valueOf(tje.u(12, getContext())), null, null);
        FloatButtonIconComponent[] floatButtonIconComponentArr = {getIncidentsButton(), getRightSideButtonsContainer().e, getRightSideButtonsContainer().b, getBackButton()};
        for (int i = 0; i < 4; i++) {
            applyControlsRedesign$lambda$1(this, m, floatButtonIconComponentArr[i]);
        }
        getRightSideButtonsContainer().e.setIconPadding(tje.u(8, getContext()));
        RotatableFloatButton compassButton = getCompassButton();
        int i2 = this.largeButtonSize;
        compassButton.setImageSize(i2, i2);
        getCompassButton().setIconBackgroundAlpha(229);
        getCompassButton().setIconBackgroundTint(m);
        mtr locationButton = getLocationButton();
        locationButton.g = Integer.valueOf(m);
        RotatableFloatButton rotatableFloatButton = locationButton.e;
        if (rotatableFloatButton != null) {
            rotatableFloatButton.setIconBackgroundTint(m);
        }
        mtr locationButton2 = getLocationButton();
        locationButton2.f = 229;
        RotatableFloatButton rotatableFloatButton2 = locationButton2.e;
        if (rotatableFloatButton2 != null) {
            rotatableFloatButton2.setIconBackgroundAlpha(229);
        }
    }

    private static final zy11 applyControlsRedesign$lambda$1(DrivingModalView drivingModalView, int i, FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setIconPadding(ru.yandex.taxi.design.utils.c.h(16, drivingModalView));
        floatButtonIconComponent.setPaddingRelative(floatButtonIconComponent.getPaddingStart(), floatButtonIconComponent.getPaddingTop(), ru.yandex.taxi.design.utils.c.h(4, drivingModalView), floatButtonIconComponent.getPaddingBottom());
        AppCompatImageView icon = floatButtonIconComponent.getIcon();
        icon.getBackground().setTint(i);
        icon.getBackground().setAlpha(229);
        int i2 = drivingModalView.largeButtonSize;
        ru.yandex.taxi.design.utils.c.D(i2, i2, icon);
        return zy11.a;
    }

    private final void applyThemeForButtons() {
        int m = s8o.m(new bdc(xng0.bgMain), getContext());
        FloatButtonIconComponent[] floatButtonIconComponentArr = {getIncidentsButton(), getRightSideButtonsContainer().e, getRightSideButtonsContainer().b, getBackButton()};
        for (int i = 0; i < 4; i++) {
            applyThemeForButtons$lambda$0(m, floatButtonIconComponentArr[i]);
        }
        mtr locationButton = getLocationButton();
        locationButton.g = Integer.valueOf(m);
        RotatableFloatButton rotatableFloatButton = locationButton.e;
        if (rotatableFloatButton != null) {
            rotatableFloatButton.setIconBackgroundTint(m);
        }
        getCompassButton().setIconBackgroundTint(m);
    }

    private static final zy11 applyThemeForButtons$lambda$0(int i, FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.getIcon().getBackground().setTint(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int baseBubbleHorizontalMargin_delegate$lambda$0(DrivingModalView drivingModalView) {
        return ru.yandex.taxi.design.utils.c.h(12, drivingModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int bubbleBottomMargin_delegate$lambda$0(DrivingModalView drivingModalView) {
        return ru.yandex.taxi.design.utils.c.h(10, drivingModalView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollDown() {
        return ((tkm) getBinding()).l.canScrollVertically(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        return ((tkm) getBinding()).l.canScrollVertically(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrivingBubbleView drivingBubbleView_delegate$lambda$0(Context context, DrivingModalView drivingModalView) {
        DrivingBubbleView drivingBubbleView = new DrivingBubbleView(context, null, 0, 6, null);
        drivingBubbleView.setVisibility(8);
        drivingBubbleView.setTextPadding(tje.u(12, drivingBubbleView.getContext()));
        drivingBubbleView.setBackground(context.getDrawable(v2h0.bg_main_rounded_16dp));
        drivingBubbleView.setElevation(1.0f);
        drivingModalView.getStreetAddressViewContainer().addView(drivingBubbleView);
        return drivingBubbleView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBaseBubbleHorizontalMargin() {
        return ((Number) this.baseBubbleHorizontalMargin.getValue()).intValue();
    }

    private final int getBubbleBottomMargin() {
        return ((Number) this.bubbleBottomMargin.getValue()).intValue();
    }

    private final int getDrivingBubbleHeight() {
        DrivingBubbleView drivingBubbleView = getDrivingBubbleView();
        if (drivingBubbleView.getVisibility() != 0) {
            return 0;
        }
        int height = drivingBubbleView.getHeight();
        ViewGroup.LayoutParams layoutParams = drivingBubbleView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = drivingBubbleView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + getBubbleBottomMargin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrivingBubbleView getDrivingBubbleView() {
        return (DrivingBubbleView) this.drivingBubbleView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHorizontalButtonsMargin() {
        return ((Number) this.horizontalButtonsMargin.getValue()).intValue();
    }

    private final FloatButtonIconComponent getIncidentsButton() {
        return (FloatButtonIconComponent) this.incidentsButton.getValue();
    }

    private final d9y getLeftSideButtonsContainer() {
        return (d9y) this.leftSideButtonsContainer.getValue();
    }

    private final int getNotificationHeight() {
        FrameLayout notificationStackComponent = getNotificationStackComponent();
        if (notificationStackComponent.getVisibility() != 0) {
            return 0;
        }
        int height = notificationStackComponent.getHeight();
        ViewGroup.LayoutParams layoutParams = notificationStackComponent.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = notificationStackComponent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getNotificationStackComponent() {
        return (FrameLayout) this.notificationStackComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollViewMaxHeight() {
        return ((Number) this.scrollViewMaxHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrivingTimeTextView[] getSizeAwareTextViews() {
        return (DrivingTimeTextView[]) this.sizeAwareTextViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getStreetAddressViewContainer() {
        return (FrameLayout) this.streetAddressViewContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int horizontalButtonsMargin_delegate$lambda$0(DrivingModalView drivingModalView) {
        return ru.yandex.taxi.design.utils.c.h(68, drivingModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatButtonIconComponent incidentsButton_delegate$lambda$0(DrivingModalView drivingModalView) {
        FloatButtonIconComponent floatButtonIconComponent = drivingModalView.getLeftSideButtonsContainer().c;
        floatButtonIconComponent.setDebounceClickListener(new rkm(drivingModalView.presenter, 2));
        return floatButtonIconComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incidentsButton_delegate$lambda$0$0$onNewIncidentClicked(ikm ikmVar) {
        Point position;
        ikmVar.Q.h();
        nkm nkmVar = (nkm) ((zch) ikmVar.y.b).a;
        Location a = nkmVar.M.a();
        if (a == null || (position = a.getPosition()) == null) {
            return;
        }
        nkmVar.r(new zvi(28, position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d9y leftSideButtonsContainer_delegate$lambda$0(Context context) {
        View inflate = LayoutInflater.from(context).inflate(fuh0.left_side_buttons_container, (ViewGroup) null, false);
        int i = z5h0.back_button;
        FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) cma1.O(i, inflate);
        if (floatButtonIconComponent != null) {
            i = z5h0.incidents_Button;
            FloatButtonIconComponent floatButtonIconComponent2 = (FloatButtonIconComponent) cma1.O(i, inflate);
            if (floatButtonIconComponent2 != null) {
                return new d9y((GoFrameLayout) inflate, floatButtonIconComponent, floatButtonIconComponent2);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout notificationStackComponent_delegate$lambda$0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(ofp0.b, -2));
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setVisibility(0);
        int u = tje.u(8, frameLayout.getContext());
        frameLayout.setPadding(u, u, u, u);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(DrivingModalView drivingModalView) {
        ikm ikmVar = drivingModalView.presenter;
        boolean isAnchored = drivingModalView.isAnchored();
        r0 r0Var = ikmVar.z.g;
        imm immVar = new imm(!isAnchored);
        r0Var.getClass();
        r0Var.m(null, immVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onFinishButtonClick(ikm ikmVar) {
        ikmVar.R.d("finish");
        nkm nkmVar = (nkm) ((zch) ikmVar.y.b).a;
        nkmVar.A((m950) nkmVar.I.get(), CancelMode.CANCEL_COMPLETION, new mkm(nkmVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onTrafficJamClicked(ikm ikmVar) {
        ikmVar.F.b();
        ikmVar.D.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onBehaviorStateChanged$lambda$0(DrivingModalView drivingModalView) {
        ((tkm) drivingModalView.getBinding()).l.scrollTo(0, 0);
    }

    public static /* synthetic */ void removeNotifications$default(DrivingModalView drivingModalView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        drivingModalView.removeNotifications(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderHorizontalButtons(List<dme> horizontalButtons) {
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        int u = tje.u(4, getContext());
        if (((tkm) getBinding()).h.getChildCount() > horizontalButtons.size()) {
            ((tkm) getBinding()).h.removeViews(horizontalButtons.size(), ((tkm) getBinding()).h.getChildCount() - horizontalButtons.size());
        }
        int i = 0;
        for (Object obj : horizontalButtons) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            dme dmeVar = (dme) obj;
            if (i < ((tkm) getBinding()).h.getChildCount()) {
                buttonComponent = (ButtonComponent) uh6.v(((tkm) getBinding()).h, i);
            } else {
                ButtonComponent buttonComponent3 = new ButtonComponent(getContext(), null, 0, 6, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, buttonComponent3.getResources().getDimensionPixelSize(qtg0.button_component_size_XL));
                layoutParams.weight = 1.0f;
                buttonComponent3.setLayoutParams(layoutParams);
                buttonComponent3.setButtonBackground(new bdc(xng0.controlMinor));
                buttonComponent3.setButtonTitleColor(new bdc(xng0.textMain));
                buttonComponent3.setTextTypeface(3);
                ((tkm) getBinding()).h.addView(buttonComponent3);
                buttonComponent = buttonComponent3;
            }
            ViewGroup.LayoutParams layoutParams2 = buttonComponent.getLayoutParams();
            if (layoutParams2 == null) {
                ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            if (i > 0) {
                layoutParams3.setMarginStart(u);
            }
            if (i < scc.f(horizontalButtons)) {
                layoutParams3.setMarginEnd(u);
            }
            buttonComponent.setLayoutParams(layoutParams3);
            vjm vjmVar = this.drivingButtonWithIconMapper;
            vjmVar.getClass();
            String c = krb1.c(dmeVar.b, new DrivingButtonWithIconMapper$mapControlButton$title$1(1, vjmVar.b, Context.class, "getString", "getString(I)Ljava/lang/String;", 0));
            cme cmeVar = dmeVar.d;
            if (cmeVar instanceof ame) {
                ButtonComponent buttonComponent4 = buttonComponent;
                vh91.f(buttonComponent4, Integer.valueOf(((ame) cmeVar).a), c, dmeVar.e, null, false, ((Number) vjmVar.e.getValue()).intValue(), 24);
                buttonComponent2 = buttonComponent4;
            } else {
                buttonComponent2 = buttonComponent;
                if (!(cmeVar instanceof bme)) {
                    w511.b();
                    return;
                } else {
                    buttonComponent2.setText(c);
                    hbp0.e(vjmVar.d, null, null, new DrivingButtonWithIconMapper$mapControlButton$1(vjmVar, cmeVar, new WeakReference(buttonComponent2), c, dmeVar, null), 3);
                }
            }
            buttonComponent2.setDebounceClickListener(new wqj(10, this, dmeVar));
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderHorizontalButtons$lambda$0$1$1(DrivingModalView drivingModalView, dme dmeVar) {
        ikm ikmVar = drivingModalView.presenter;
        zle zleVar = dmeVar.c;
        if (zleVar instanceof vle) {
            zjm zjmVar = ikmVar.z;
            r0 r0Var = zjmVar.g;
            imm immVar = new imm(true);
            r0Var.getClass();
            r0Var.m(null, immVar);
            zjmVar.f.c(NavigatorRevealCardAnalytics$DrivingModalState.Collapsed);
        }
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$handleAction$1(ikmVar, zleVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int scrollViewMaxHeight_delegate$lambda$0(DrivingModalView drivingModalView) {
        ProgressView progressView = ((tkm) drivingModalView.getBinding()).j;
        int height = progressView.getHeight();
        ViewGroup.LayoutParams layoutParams = progressView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = progressView.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i2 = i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        GoImageButton goImageButton = ((tkm) drivingModalView.getBinding()).f;
        int height2 = goImageButton.getHeight();
        ViewGroup.LayoutParams layoutParams3 = goImageButton.getLayoutParams();
        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams3 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        int i3 = height2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
        ViewGroup.LayoutParams layoutParams4 = goImageButton.getLayoutParams();
        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams4 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        int i4 = i3 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        FloatButtonIconComponent backButton = drivingModalView.getBackButton();
        int height3 = backButton.getHeight();
        ViewGroup.LayoutParams layoutParams5 = backButton.getLayoutParams();
        if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams5 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        int i5 = height3 + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
        ViewGroup.LayoutParams layoutParams6 = backButton.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? layoutParams6 : null);
        return drivingModalView.getHeight() - ((drivingModalView.topRightSideButtonsOffset() + ((((tkm) drivingModalView.getBinding()).d.getHeight() + i2) + i4)) + (i5 + (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendContentSizes() {
        this.contentSizesRepository.l(new akm(getCurrentInsets().b, getCurrentInsets().g, getFloatingButtonSize(), getDrivingBubbleHeight(), getNotificationHeight(), anchoredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DrivingTimeTextView[] sizeAwareTextViews_delegate$lambda$0(DrivingModalView drivingModalView) {
        return new DrivingTimeTextView[]{((tkm) drivingModalView.getBinding()).i, ((tkm) drivingModalView.getBinding()).c};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout streetAddressViewContainer_delegate$lambda$0(Context context, DrivingModalView drivingModalView) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(4);
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.setAnimateParentHierarchy(false);
        frameLayout.setLayoutTransition(layoutTransition);
        drivingModalView.addViewAboveCard(frameLayout, 17, 0);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateShadowVisibility() {
        ((tkm) getBinding()).m.setVisibility(canScrollDown() ? 0 : 8);
        ((tkm) getBinding()).n.setVisibility(canScrollUp() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStreetAddressViewMargin() {
        xw31.x(getNotificationStackComponent().getVisibility() == 0 ? 0 : getBubbleBottomMargin(), getStreetAddressViewContainer());
    }

    @Override // android.view.View
    public void addOnLayoutChangeListener(View.OnLayoutChangeListener listener) {
        super.addOnLayoutChangeListener(listener);
        updateRightSideContainer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int anchoredHeight() {
        return tje.u(48, getContext()) + ((tkm) getBinding()).j.getBottom();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        this.drivingTopView.setVisibility(8);
        hideFloatingComponents();
        super.animateDismiss(startAction, endAction);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getLeftSideButtonsContainer().c.applyTheme(themeType);
        getLeftSideButtonsContainer().b.applyTheme(themeType);
        getRightSideButtonsContainer().e.applyTheme(themeType);
        applyThemeForButtons();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public tkm bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.driving_modal_view, parent, false);
        int i = z5h0.alt_route_button;
        GoImageButton goImageButton = (GoImageButton) cma1.O(i, inflate);
        if (goImageButton != null) {
            i = z5h0.arrival_time;
            DrivingTimeTextView drivingTimeTextView = (DrivingTimeTextView) cma1.O(i, inflate);
            if (drivingTimeTextView != null) {
                i = z5h0.bottom_container;
                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                if (goFrameLayout != null) {
                    i = z5h0.buttons_group;
                    if (((Group) cma1.O(i, inflate)) != null) {
                        i = z5h0.destination_title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = z5h0.expand_button;
                            GoImageButton goImageButton2 = (GoImageButton) cma1.O(i, inflate);
                            if (goImageButton2 != null) {
                                i = z5h0.finish_button;
                                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                if (buttonComponent != null) {
                                    i = z5h0.horizontal_buttons_container;
                                    GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                                    if (goLinearLayout != null) {
                                        i = z5h0.remaining_distance_time;
                                        DrivingTimeTextView drivingTimeTextView2 = (DrivingTimeTextView) cma1.O(i, inflate);
                                        if (drivingTimeTextView2 != null) {
                                            i = z5h0.route_barrier_end;
                                            if (((Barrier) cma1.O(i, inflate)) != null) {
                                                i = z5h0.route_barrier_start;
                                                if (((Barrier) cma1.O(i, inflate)) != null) {
                                                    i = z5h0.route_line;
                                                    ProgressView progressView = (ProgressView) cma1.O(i, inflate);
                                                    if (progressView != null) {
                                                        i = z5h0.route_line_divider;
                                                        if (((CardDivider) cma1.O(i, inflate)) != null) {
                                                            i = z5h0.scroll_child;
                                                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                                                            if (goLinearLayout2 != null) {
                                                                i = z5h0.scroll_view;
                                                                NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                                                                if (nestedScrollViewAdvanced != null) {
                                                                    i = z5h0.shadow_btn;
                                                                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                                                                    if (goFrameLayout2 != null) {
                                                                        i = z5h0.time_barrier;
                                                                        if (((Barrier) cma1.O(i, inflate)) != null) {
                                                                            i = z5h0.top_shadow;
                                                                            GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i, inflate);
                                                                            if (goFrameLayout3 != null) {
                                                                                i = z5h0.vertical_buttons_container;
                                                                                AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i, inflate);
                                                                                if (autoDividerComponentList != null) {
                                                                                    return new tkm((GoConstraintLayout) inflate, goImageButton, drivingTimeTextView, goFrameLayout, robotoTextView, goImageButton2, buttonComponent, goLinearLayout, drivingTimeTextView2, progressView, goLinearLayout2, nestedScrollViewAdvanced, goFrameLayout2, goFrameLayout3, autoDividerComponentList);
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
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void changeFloatingComponentsVisibility(boolean isVisible) {
        super.changeFloatingComponentsVisibility(isVisible);
        this.drivingTopView.setSpeedGroupVisibility(!isVisible);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public FloatButtonIconComponent getBackButton() {
        return this.backButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return tje.u(48, getContext()) + ((tkm) getBinding()).j.getBottom();
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void hideFloatingComponents() {
        if (isAnchored()) {
            super.hideFloatingComponents();
            getStreetAddressViewContainer().setVisibility(getNotificationStackComponent().getVisibility() == 0 ? 8 : 0);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getIsArrowHidden() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drivingTopView.onAttached();
        this.drivingButtonWithIconMapper.d.a();
        int i = 0;
        for (DrivingTimeTextView drivingTimeTextView : getSizeAwareTextViews()) {
            drivingTimeTextView.setOnTextSizeChangedListener(this.onTextChangedListener);
        }
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        getBottomSheetBehavior().W = false;
        getBottomSheetBehavior().Z = false;
        anchor();
        ikm ikmVar = this.presenter;
        q qVar = new q(this);
        zjm zjmVar = ikmVar.z;
        w wVar = ikmVar.K;
        com.yandex.go.navigator.repository.o oVar = ikmVar.F;
        com.yandex.go.navigator.domain.e eVar = ikmVar.C;
        pwy0 pwy0Var = ikmVar.O;
        ikmVar.Bg(qVar);
        com.yandex.go.navigator.domain.t tVar = ikmVar.A;
        tVar.d();
        if (ikmVar.x) {
            tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$handleFocusOnAttach$1(ikmVar, null), 3);
        } else {
            eVar.a(FocusMode.FREE);
            oVar.b();
        }
        hbp0 hbp0Var = wVar.j;
        hbp0Var.a();
        p0 p0Var = wVar.b;
        int i2 = 3;
        tje.N(hbp0Var.c(), null, null, new DrivingNotificationsRepository$observeEvents$$inlined$safeCollectIn$1(new jqr(new o0(new k0(vng.l(new m0(new i0(p0Var.c())), new of11(21), vng.c), p0Var), p0Var, new blm(wVar, i), new blm(wVar, 1)), new UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6(p0Var, null), i2), null, wVar), 3);
        tje.N(hbp0Var.c(), null, null, new DrivingNotificationsRepository$observeEvents$$inlined$safeCollectIn$2(new t(new jqr(wVar.c.d, new DrivingNotificationsRepository$observeEvents$4(wVar, null), i2), wVar), null, wVar), 3);
        tje.N(hbp0Var.c(), null, null, new DrivingNotificationsRepository$observeEvents$$inlined$safeCollectIn$3(new v(new jqr(wVar.e.e, new DrivingNotificationsRepository$observeEvents$7(wVar, null), i2), wVar), null, wVar), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderButtons$$inlined$safeCollectIn$1((tpr) zjmVar.h.getValue(), null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderShadows$$inlined$safeCollectIn$1(pwy0Var.a(), null, ikmVar), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderTrafficState$$inlined$safeCollectIn$1(new kotlinx.coroutines.flow.m0(pwy0Var.a(), ikmVar.D.c, new DrivingModalPresenter$renderTrafficState$1(3, null)), null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderCarParksState$$inlined$safeCollectIn$1(new j(kotlinx.coroutines.flow.e.t(ikmVar.G.d)), null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderProgressState$$inlined$safeCollectIn$1(ikmVar.B.d, null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderDrivingBubble$$inlined$safeCollectIn$1(new l(ikmVar.I.a), null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$dispatchUiVisibilityState$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.l((tpr) zjmVar.h.getValue(), kotlinx.coroutines.flow.e.r(new kotlinx.coroutines.flow.m0(oVar.f, ikmVar.T.c, new DrivingModalPresenter$showUserInterfaceFlow$1(3, null)), new c0m(7)), kotlinx.coroutines.flow.e.t(eVar.b), (gci0) ikmVar.S.b, pwy0Var.a(), new DrivingModalPresenter$dispatchUiVisibilityState$1(null)), null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$renderNotifications$$inlined$safeCollectIn$1(new n(kotlinx.coroutines.flow.e.s(wVar.i, new txk(5))), null, (ekm) ikmVar.Dg()), 3);
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$observeGuidance$$inlined$safeCollectIn$1(tVar.M, null, ikmVar), 3);
        com.yandex.go.coroutines.b.h(ikmVar.Jg(), new kotlinx.coroutines.flow.m0(new com.yandex.go.navigator.utils.c(kotlinx.coroutines.flow.e.p(new h(ikmVar.H.c), 1000L)), ikmVar.J.b, new DrivingModalPresenter$observeGuidance$2(ikmVar, null)));
        requestApplyInsets();
        SlideableModalView.addViewAboveCard$default(this, getNotificationStackComponent(), 17, 0, 4, null);
        getRightSideButtonsContainer().e.setDebounceClickListener(new rkm(this.presenter, 0));
        ru.yandex.taxi.design.utils.c.z(new DrivingModalView$onAttachedToWindow$3(0, this.presenter, ikm.class, "onSearchButtonClicked", "onSearchButtonClicked()V", 0), ((tkm) getBinding()).b);
        ru.yandex.taxi.design.utils.c.z(new okm(this, 3), ((tkm) getBinding()).f);
        ((tkm) getBinding()).g.setDebounceClickListener(new rkm(this.presenter, 1));
        addShadowScrollListener();
        xw31.L(-tje.u(56, getContext()), getDimBackgroundView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (newState != 3) {
            int i = 1;
            if (newState != 6) {
                View[] viewArr = {getRightSideButtonsContainer().a, getStreetAddressViewContainer(), getIncidentsButton()};
                for (int i2 = 0; i2 < 3; i2++) {
                    cma1.L(viewArr[i2]);
                }
                cma1.J(getBackButton());
                cma1.J(((tkm) getBinding()).k);
            } else {
                cma1.c(((tkm) getBinding()).f).setDuration(100L).rotation(180.0f).start();
                cma1.J(getIncidentsButton());
                cma1.M(((tkm) getBinding()).k).withEndAction(new qkm(this, i));
                zjm zjmVar = this.presenter.z;
                r0 r0Var = zjmVar.g;
                imm immVar = new imm(true);
                r0Var.getClass();
                r0Var.m(null, immVar);
                zjmVar.f.c(NavigatorRevealCardAnalytics$DrivingModalState.Collapsed);
            }
        } else {
            cma1.c(((tkm) getBinding()).f).setDuration(100L).rotation(0.0f).start();
            zjm zjmVar2 = this.presenter.z;
            r0 r0Var2 = zjmVar2.g;
            imm immVar2 = new imm(false);
            r0Var2.getClass();
            r0Var2.m(null, immVar2);
            zjmVar2.f.c(NavigatorRevealCardAnalytics$DrivingModalState.Expanded);
        }
        updateRightSideContainer();
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drivingTopView.onDetach();
        this.drivingButtonWithIconMapper.d.b();
        for (DrivingTimeTextView drivingTimeTextView : getSizeAwareTextViews()) {
            drivingTimeTextView.setOnTextSizeChangedListener(null);
        }
        this.presenter.Cg();
        removeNotifications(false);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void onGeoTap() {
        ikm ikmVar = this.presenter;
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$onLocationButtonClicked$1(ikmVar, null), 3);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void onOverviewButtonClicked() {
        super.onOverviewButtonClicked();
        f fVar = this.presenter.N;
        hbp0.e(fVar.j, null, null, new DrivingModalFocusManager$focusOnRoute$1(fVar, null), 3);
    }

    public final void removeNotifications(boolean updateInRepository) {
        getNotificationStackComponent().removeAllViews();
        setControlsBottomMargin(0);
        getNotificationStackComponent().setVisibility(8);
        updateStreetAddressViewMargin();
        if (updateInRepository) {
            this.presenter.K.h.l(null);
        }
        getStreetAddressViewContainer().setVisibility(getRightSideButtonsContainer().a.getVisibility() == 0 ? 8 : 0);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "driving_mode_screen";
    }

    public final void setControlsBottomMargin(int margin) {
        xw31.E(getRightSideButtonsContainer().c, null, null, null, Integer.valueOf(margin));
        xw31.E(getLeftSideButtonsContainer().b, null, null, null, Integer.valueOf(tje.u(12, getContext()) + margin));
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void showFloatingComponents() {
        if (isAnchored()) {
            super.showFloatingComponents();
            getStreetAddressViewContainer().setVisibility(8);
        }
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int topRightSideButtonsOffset() {
        if (!this.drivingTopView.isSpeedGroupVisible()) {
            return 0;
        }
        return tje.r(qtg0.size_map_speedanimation, getContext());
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void updateRightSideContainer() {
        super.updateRightSideContainer();
        ru.yandex.taxi.design.utils.c.C(getBottomSheet().getTop(), getLeftSideButtonsContainer().a);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean useBelowCardDimming() {
        return true;
    }
}
