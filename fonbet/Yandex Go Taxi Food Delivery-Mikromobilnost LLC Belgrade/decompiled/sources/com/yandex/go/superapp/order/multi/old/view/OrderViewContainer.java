package com.yandex.go.superapp.order.multi.old.view;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchOrderDetailsExperiment;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.ed80;
import defpackage.eor;
import defpackage.h080;
import defpackage.ja80;
import defpackage.ka80;
import defpackage.kvp0;
import defpackage.l8h0;
import defpackage.l9;
import defpackage.la80;
import defpackage.lz70;
import defpackage.mrg0;
import defpackage.my70;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.oa80;
import defpackage.oz70;
import defpackage.ps70;
import defpackage.pwf0;
import defpackage.pz70;
import defpackage.qs70;
import defpackage.rp31;
import defpackage.sd30;
import defpackage.t1w;
import defpackage.tje;
import defpackage.ub60;
import defpackage.usg0;
import defpackage.uug0;
import defpackage.vkh0;
import defpackage.wa80;
import defpackage.x4e;
import defpackage.zxf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.back.BackButtonView;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.order.view.TaxiOrderDetailsViewContainerLayout;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.recenter.RecenterButton;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0004\u0087\u0001¢\u0001Bi\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ7\u0010(\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00103J\u001d\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u0002002\u0006\u00106\u001a\u000205¢\u0006\u0004\b4\u00107J\r\u00108\u001a\u00020#¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u001d¢\u0006\u0004\b:\u0010\u001fJ\r\u0010;\u001a\u00020\u001d¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020!¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020>2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u00020>2\b\b\u0001\u0010B\u001a\u00020>H\u0004¢\u0006\u0004\bC\u0010AJ\r\u0010D\u001a\u00020\u001d¢\u0006\u0004\bD\u0010\u001fJ\u001f\u0010H\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020#H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020#H\u0003¢\u0006\u0004\bJ\u00109J\u001f\u0010K\u001a\u00020\u001d2\u0006\u00101\u001a\u0002002\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bK\u00107J\u0017\u0010L\u001a\u00020\u001d2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bL\u00103J\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u001dH\u0002¢\u0006\u0004\bP\u0010\u001fJ\u0015\u0010S\u001a\b\u0012\u0004\u0012\u00020R0QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020#H\u0002¢\u0006\u0004\bU\u00109J\u0017\u0010W\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020>H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020#H\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\\\u0010\u001fJ\u0017\u0010^\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020!H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020#H\u0002¢\u0006\u0004\b`\u00109J\u0017\u0010a\u001a\u00020#2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020#2\u0006\u0010c\u001a\u00020#H\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020#H\u0002¢\u0006\u0004\bf\u00109J\u000f\u0010g\u001a\u00020!H\u0002¢\u0006\u0004\bg\u0010=J\u0017\u0010i\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u001dH\u0002¢\u0006\u0004\bk\u0010\u001fJ\u000f\u0010l\u001a\u00020\u001dH\u0002¢\u0006\u0004\bl\u0010\u001fJ\u0017\u0010m\u001a\u00020\u001d2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bm\u00103J\u000f\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0004\bn\u0010\u001fJ\u000f\u0010o\u001a\u00020\u001dH\u0002¢\u0006\u0004\bo\u0010\u001fJ\u0019\u0010q\u001a\u00020!2\b\u0010p\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0004\bq\u0010rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010sR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010tR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010uR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010vR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010wR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010xR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010yR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010zR\u0014\u0010{\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010|R\u0014\u0010~\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0014\u0010\u007f\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010|R\u0018\u0010\u0080\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|R\u0017\u0010\u0082\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u001c\u0010\u0088\u0001\u001a\u00070\u0087\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001d\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u0002050\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0095\u0001R\u0015\u00101\u001a\u0004\u0018\u0001008F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0013\u0010\u009c\u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u00109R\u0013\u0010\u009e\u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u00109R\u0013\u0010 \u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u00109¨\u0006£\u0001"}, d2 = {"Lcom/yandex/go/superapp/order/multi/old/view/OrderViewContainer;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lnwy0;", "Landroid/app/Activity;", "context", "Lmy70;", "orderListController", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;", "fragmentCallback", "Lkvp0;", "searchOrderDetailsExperimentProvider", "Lwa80;", "topOffsetCoordinator", "Lru/yandex/taxi/ui/recenter/RecenterButton;", "nextRecenterButtonView", "Lru/yandex/taxi/order/back/BackButtonView;", "backButtonView", "Lcom/yandex/go/taxi/order/map/curtain/floating/button/OrderMapCurtainHideFloatingButtonView;", "orderMapCurtainHideFloatingButtonView", "Led80;", "ordersViewCardStateTracker", "Lps70;", "detailsExperimentRepository", "Lh080;", "orderMapOffsetsHolder", "Loz70;", "orderMapCurtainStateRepository", "<init>", "(Landroid/app/Activity;Lmy70;Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;Lkvp0;Lwa80;Lru/yandex/taxi/ui/recenter/RecenterButton;Lru/yandex/taxi/order/back/BackButtonView;Lcom/yandex/go/taxi/order/map/curtain/floating/button/OrderMapCurtainHideFloatingButtonView;Led80;Lps70;Lh080;Loz70;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/taxi/order/view/OrderView;", "orderView", "addOrderView", "(Lru/yandex/taxi/order/view/OrderView;)V", "removeOrderView", "Ljava/lang/Runnable;", "onAnimationEnd", "(Lru/yandex/taxi/order/view/OrderView;Ljava/lang/Runnable;)V", "currentAnchoredHeight", "()I", "collapseCard", "expandCard", "onBackPressed", "()Z", "", "slideOffset", "calculateCoverAlpha", "(F)F", "newOffset", "convertToOffsetFromAnchored", "updateCanBeExpandedFromAnchoredState", "Leor;", "button", "gravity", "addFloatButton", "(Leor;I)V", "getFloatButtonBackgroundOffset", "animateOrderViewDisappearing", "expandOrderView", "Loa80;", "createInitCounter", "()Loa80;", "clearAllAnimations", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "initBehavior", "()Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "getBottomSheetTopWithPadding", CaretView.ALPHA_PROPERTY, "setCoverAlpha", "(F)V", ClidProvider.STATE, "processCardState", "(I)V", "onCardMovedManually", "settle", "updateBottomBehavior", "(Z)V", "mapCurtainContentOffsetPx", "anchorOffsetInPixels", "(Lru/yandex/taxi/order/view/OrderView;)I", "offset", "compensateContentPosition", "(I)I", "getCardCompensation", "isCanBeExpandedFromAnchored", "Lru/yandex/taxi/object/DriveState;", "setCardState", "(Lru/yandex/taxi/object/DriveState;)V", "childCountChanged", "updateNestedScroll", "clearOrderViewListeners", "applyCompleteStateBehavior", "updateContainerOffsets", "driveState", "needAnchoredStateToHideMap", "(Lru/yandex/taxi/object/DriveState;)Z", "Lmy70;", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;", "Lkvp0;", "Lwa80;", "Led80;", "Lps70;", "Lh080;", "Loz70;", "orderToolbarHeight", CA20Status.STATUS_USER_I, UrbanAdsBottomSheetFragment.CORNER_RADIUS, "compensation", "topPadding", "navigationBarHeight", "offsetMargin", "floatButtonTranslationY", "F", "expandedByUserAction", "Z", "isBottomSheetStateChanged", "Lka80;", "topOffsetListener", "Lka80;", "Landroid/view/View;", "cardCover", "Landroid/view/View;", "Lru/yandex/taxi/order/view/TaxiOrderDetailsViewContainerLayout;", "container", "Lru/yandex/taxi/order/view/TaxiOrderDetailsViewContainerLayout;", "bottomSheetBehavior", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "", "Landroid/view/ViewPropertyAnimator;", "removeViewAnimators", "Ljava/util/List;", "initOrderViewInitNotifier", "Loa80;", "afterInit", "getOrderView", "()Lru/yandex/taxi/order/view/OrderView;", "getCardTop", "cardTop", "getBottomSheetState", "bottomSheetState", "getContainerTop", "containerTop", "Companion", "ja80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderViewContainer extends CoordinatorLayout implements nwy0 {
    private static final ja80 Companion = new ja80();
    private static final int FLOATING_BUTTON_CIRCLE_PADDING_DP = 20;
    private static final int FLOATING_BUTTON_TRANSLATION_Y_DP = 28;
    private static final int ORDER_CONTAINER_ARROW_AREA_HEIGHT_DP = 16;
    private static final int ORDER_CONTAINER_TO_FLOATING_BUTTON_GAP_DP = 8;
    private final List<Runnable> afterInit;
    private final AnchorBottomSheetBehavior<FrameLayout> bottomSheetBehavior;
    private final View cardCover;
    private final int compensation;
    private final TaxiOrderDetailsViewContainerLayout container;
    private final int cornerRadius;
    private final ps70 detailsExperimentRepository;
    private boolean expandedByUserAction;
    private final float floatButtonTranslationY;
    private final OrderStackView.a fragmentCallback;
    private oa80 initOrderViewInitNotifier;
    private boolean isBottomSheetStateChanged;
    private int navigationBarHeight;
    private final int offsetMargin;
    private final my70 orderListController;
    private final oz70 orderMapCurtainStateRepository;
    private final h080 orderMapOffsetsHolder;
    private final int orderToolbarHeight;
    private final ed80 ordersViewCardStateTracker;
    private final List<ViewPropertyAnimator> removeViewAnimators;
    private final kvp0 searchOrderDetailsExperimentProvider;
    private final wa80 topOffsetCoordinator;
    private final ka80 topOffsetListener;
    private final int topPadding;

    public OrderViewContainer(Activity activity, my70 my70Var, OrderStackView.a aVar, kvp0 kvp0Var, wa80 wa80Var, RecenterButton recenterButton, BackButtonView backButtonView, OrderMapCurtainHideFloatingButtonView orderMapCurtainHideFloatingButtonView, ed80 ed80Var, ps70 ps70Var, h080 h080Var, oz70 oz70Var) {
        super(activity);
        this.orderListController = my70Var;
        this.fragmentCallback = aVar;
        this.searchOrderDetailsExperimentProvider = kvp0Var;
        this.topOffsetCoordinator = wa80Var;
        this.ordersViewCardStateTracker = ed80Var;
        this.detailsExperimentRepository = ps70Var;
        this.orderMapOffsetsHolder = h080Var;
        this.orderMapCurtainStateRepository = oz70Var;
        this.orderToolbarHeight = tje.r(uug0.order_toolbar_height, getContext());
        this.cornerRadius = tje.r(usg0.bottom_sheet_corner_radius, getContext());
        this.compensation = tje.r(uug0.bottom_sheet_menu_compensation, getContext());
        this.topPadding = tje.r(mrg0.go_design_s_space, getContext());
        this.offsetMargin = tje.r(mrg0.go_design_m_space, getContext());
        this.floatButtonTranslationY = tje.u(28, getContext());
        this.topOffsetListener = new ka80(this);
        this.removeViewAnimators = new ArrayList();
        this.afterInit = new ArrayList();
        ru.yandex.taxi.design.utils.c.q(this, vkh0.order_view_container, true);
        int i = l8h0.card_cover;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.cardCover = (View) rp31.d(this, i);
        this.container = (TaxiOrderDetailsViewContainerLayout) ((View) rp31.d(this, l8h0.order_view_container));
        this.bottomSheetBehavior = initBehavior();
        this.initOrderViewInitNotifier = createInitCounter();
        addFloatButton(backButtonView, 8388611);
        addFloatButton(recenterButton, 8388613);
        addFloatButton(orderMapCurtainHideFloatingButtonView, 8388613);
        float u = tje.u(12, getContext());
        backButtonView.setTranslationY(u);
        recenterButton.setTranslationY(u);
        orderMapCurtainHideFloatingButtonView.setTranslationY(u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addFloatButton(eor button, int gravity) {
        View view = (View) button;
        ViewParent parent = view.getParent();
        if (parent == null) {
            addView(view, 1);
        } else if (!parent.equals(this)) {
            ((ViewGroup) parent).removeView(view);
            addView(view, 1);
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setAnchorId(l8h0.order_view_container);
        layoutParams.anchorGravity = gravity;
        layoutParams.gravity = gravity;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -tje.u(16, getContext());
        if ((gravity & 8388613) == 8388613) {
            layoutParams.setMarginEnd(getFloatButtonBackgroundOffset());
        } else if ((gravity & 8388611) == 8388611) {
            layoutParams.setMarginStart(getFloatButtonBackgroundOffset());
        }
        view.setLayoutParams(layoutParams);
    }

    private final int anchorOffsetInPixels(OrderView orderView) {
        return getHeight() - compensateContentPosition(orderView.getStateViewAnchorHeight());
    }

    private final void animateOrderViewDisappearing(OrderView orderView, Runnable onAnimationEnd) {
        ViewPropertyAnimator translationYBy = cma1.b(0.0f, orderView.walkingInfoBlock).translationYBy(orderView.detailsCardLayout.getHeight());
        ViewPropertyAnimator b = cma1.b(0.0f, this.cardCover);
        ViewPropertyAnimator h = cma1.h(r2.getBottom(), orderView.detailsCardLayout);
        h.withEndAction(new l9(this, h, orderView, onAnimationEnd, 22));
        this.removeViewAnimators.add(h);
        this.removeViewAnimators.add(translationYBy);
        this.removeViewAnimators.add(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateOrderViewDisappearing$lambda$0(OrderViewContainer orderViewContainer, ViewPropertyAnimator viewPropertyAnimator, OrderView orderView, Runnable runnable) {
        if (orderViewContainer.isAttachedToWindow()) {
            orderViewContainer.removeViewAnimators.remove(viewPropertyAnimator);
            orderViewContainer.clearOrderViewListeners(orderView);
            orderViewContainer.container.removeView(orderView);
            orderViewContainer.childCountChanged();
            runnable.run();
        }
    }

    private final void applyCompleteStateBehavior() {
        OrderView orderView = getOrderView();
        if (orderView == null) {
            return;
        }
        this.bottomSheetBehavior.P(orderView.getOrderHolder().b().l.getA() ? 6 : 7, true, true);
    }

    private final void childCountChanged() {
        OrderView orderView = getOrderView();
        updateNestedScroll();
        if (orderView != null && orderView.isInCompleteState()) {
            applyCompleteStateBehavior();
        }
        processCardState(this.bottomSheetBehavior.E);
    }

    private final void clearAllAnimations() {
        ArrayList<ViewPropertyAnimator> arrayList = new ArrayList(this.removeViewAnimators);
        this.removeViewAnimators.clear();
        for (ViewPropertyAnimator viewPropertyAnimator : arrayList) {
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.cancel();
        }
    }

    private final void clearOrderViewListeners(OrderView orderView) {
        orderView.setListCallback((OrderView.a) ((zxf0) pwf0.c(OrderView.a.class)));
        orderView.setOrderExpandStateListener((OrderStateView.a) ((zxf0) pwf0.c(OrderStateView.a.class)));
    }

    private final int compensateContentPosition(int offset) {
        OrderView orderView = getOrderView();
        if (orderView == null) {
            return 0;
        }
        return orderView.getViewTopOffset() + offset + getCardCompensation() + this.navigationBarHeight;
    }

    private final oa80 createInitCounter() {
        lz70 lz70Var = new lz70(5, this);
        oa80 oa80Var = new oa80();
        oa80Var.a = lz70Var;
        return oa80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInitCounter$lambda$0(OrderViewContainer orderViewContainer) {
        Iterator<Runnable> it = orderViewContainer.afterInit.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        orderViewContainer.afterInit.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandOrderView(OrderView orderView) {
        int i = ((!((SearchOrderDetailsExperiment) this.searchOrderDetailsExperimentProvider.a.c()).getB() && orderView.isInSearchState()) || ((Boolean) ((pz70) this.orderMapCurtainStateRepository).a.getValue()).booleanValue()) ? 6 : 3;
        this.expandedByUserAction = true;
        this.bottomSheetBehavior.P(i, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBottomSheetTopWithPadding() {
        return this.container.getTop() - this.topPadding;
    }

    private final int getCardCompensation() {
        return this.cornerRadius + this.compensation;
    }

    private final int getFloatButtonBackgroundOffset() {
        return tje.r(mrg0.component_float_button_icon_shadow_compensation, getContext());
    }

    private final AnchorBottomSheetBehavior<FrameLayout> initBehavior() {
        ViewGroup.LayoutParams layoutParams = this.container.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof AnchorBottomSheetBehavior)) {
            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
            return null;
        }
        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
        anchorBottomSheetBehavior.c0 = true;
        anchorBottomSheetBehavior.O(4);
        anchorBottomSheetBehavior.M(this.navigationBarHeight, false);
        anchorBottomSheetBehavior.N = new i(this, anchorBottomSheetBehavior);
        return anchorBottomSheetBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCanBeExpandedFromAnchored() {
        OrderView orderView = getOrderView();
        return orderView != null && orderView.isCanBeExpandedFromAnchored();
    }

    private final int mapCurtainContentOffsetPx() {
        return ((Number) ((pz70) this.orderMapCurtainStateRepository).d.getValue()).intValue() + ((int) this.floatButtonTranslationY) + this.topPadding + getCardCompensation();
    }

    private final boolean needAnchoredStateToHideMap(DriveState driveState) {
        return driveState != null && ((ArrayList) kotlin.collections.a.M(((qs70) this.detailsExperimentRepository).a().d)).contains(driveState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0(OrderViewContainer orderViewContainer, t1w t1wVar) {
        int i = orderViewContainer.navigationBarHeight;
        int i2 = t1wVar.d;
        if (i != i2) {
            orderViewContainer.navigationBarHeight = i2;
            orderViewContainer.updateBottomBehavior(false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCardMovedManually() {
        updateBottomBehavior(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCardState(int state) {
        this.cardCover.setClickable(state == 7);
        OrderView orderView = getOrderView();
        if (orderView != null && (state == 3 || state == 7)) {
            setCoverAlpha(1.0f);
        } else if (state == 6) {
            if (((qs70) this.detailsExperimentRepository).a().b) {
                AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
                if (anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x) <= anchorBottomSheetBehavior.z) {
                    setCoverAlpha(1.0f);
                }
            }
            setCoverAlpha(0.0f);
        } else if (state == 4) {
            setCoverAlpha(0.0f);
        }
        if (orderView != null) {
            orderView.updateArrow(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCardState(DriveState state) {
        if (state == DriveState.COMPLETE) {
            applyCompleteStateBehavior();
            this.isBottomSheetStateChanged = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCoverAlpha(float alpha) {
        this.cardCover.setAlpha(alpha);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomBehavior(boolean settle) {
        OrderView orderView = getOrderView();
        if (orderView != null && orderView.hasStateView()) {
            this.bottomSheetBehavior.M(compensateContentPosition(orderView.getStateViewPeekHeight()), settle);
            if (needAnchoredStateToHideMap(orderView.getOrderHolder().c())) {
                this.bottomSheetBehavior.R(settle);
            } else {
                h080 h080Var = this.orderMapOffsetsHolder;
                this.bottomSheetBehavior.G(Math.max(Math.max(anchorOffsetInPixels(orderView), mapCurtainContentOffsetPx()), h080Var.m + h080Var.i + h080Var.d), settle);
            }
            if (this.isBottomSheetStateChanged) {
                return;
            }
            this.isBottomSheetStateChanged = true;
            this.bottomSheetBehavior.P(4, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainerOffsets() {
        this.container.setMaxHeight(Math.max(getHeight() - (Math.max(this.topOffsetListener.a, this.orderToolbarHeight) + this.offsetMargin), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNestedScroll() {
        OrderView orderView = getOrderView();
        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (orderView != null) {
            anchorBottomSheetBehavior.L(orderView);
        } else {
            anchorBottomSheetBehavior.M = null;
        }
    }

    public final void addOrderView(OrderView orderView) {
        orderView.setListCallback(new h(this, orderView));
        orderView.setOrderExpandStateListener(new la80(this));
        this.initOrderViewInitNotifier = createInitCounter();
        this.container.addView(orderView, -1, -2);
        childCountChanged();
        x4e.z(this.bottomSheetBehavior.E, orderView.getOrderCardInfo().a, null);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final float calculateCoverAlpha(float slideOffset) {
        if (((qs70) this.detailsExperimentRepository).a().b) {
            AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
            if (anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x) <= anchorBottomSheetBehavior.z) {
                return slideOffset;
            }
        }
        float x = this.bottomSheetBehavior.x();
        if (slideOffset <= x) {
            return 0.0f;
        }
        if (x == 1.0f) {
            return 1.0f;
        }
        return (slideOffset - x) / (1.0f - x);
    }

    public final void collapseCard() {
        if (getVisibility() == 0 && this.bottomSheetBehavior.u()) {
            AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
            if (anchorBottomSheetBehavior.E != 2) {
                anchorBottomSheetBehavior.O(4);
            }
        }
    }

    public final float convertToOffsetFromAnchored(float newOffset) {
        if (!isCanBeExpandedFromAnchored()) {
            return newOffset;
        }
        float x = this.bottomSheetBehavior.x();
        return Math.max((newOffset - x) / (1.0f - x), 0.0f);
    }

    public final int currentAnchoredHeight() {
        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        return anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x) + getCardCompensation();
    }

    public final void expandCard() {
        OrderView orderView = getOrderView();
        if (orderView == null) {
            return;
        }
        oa80 oa80Var = this.initOrderViewInitNotifier;
        if (oa80Var.b && oa80Var.c && oa80Var.d) {
            expandOrderView(orderView);
        } else {
            this.afterInit.add(new sd30(18, this, orderView));
        }
    }

    public final int getBottomSheetState() {
        return this.bottomSheetBehavior.E;
    }

    public final int getCardTop() {
        return getContainerTop() + getCardCompensation();
    }

    public final int getContainerTop() {
        return this.container.getTop();
    }

    public final OrderView getOrderView() {
        int childCount = this.container.getChildCount();
        if (childCount < 1) {
            return null;
        }
        View childAt = this.container.getChildAt(childCount - 1);
        if (childAt instanceof OrderView) {
            return (OrderView) childAt;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fragmentCallback.V6();
        wa80 wa80Var = this.topOffsetCoordinator;
        ka80 ka80Var = this.topOffsetListener;
        wa80Var.b.add(ka80Var);
        ka80Var.a(wa80Var.a());
        tje.i(this, 119, new ub60(12, this));
    }

    public final boolean onBackPressed() {
        OrderView orderView = getOrderView();
        if (orderView == null) {
            return false;
        }
        if (((qs70) this.detailsExperimentRepository).a().b) {
            return orderView.onBackPressed();
        }
        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (anchorBottomSheetBehavior.E != 3) {
            return orderView.onBackPressed();
        }
        anchorBottomSheetBehavior.P(6, true, true);
        orderView.resetScroll();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAllAnimations();
        wa80 wa80Var = this.topOffsetCoordinator;
        wa80Var.b.remove(this.topOffsetListener);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        OrderStackView.a aVar = this.fragmentCallback;
        this.container.getTop();
        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        aVar.sa(anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x));
        if (changed) {
            this.fragmentCallback.D7();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateContainerOffsets();
    }

    public final void removeOrderView(OrderView orderView, Runnable onAnimationEnd) {
        if (orderView.getParent() == null) {
            onAnimationEnd.run();
        } else {
            animateOrderViewDisappearing(orderView, onAnimationEnd);
        }
    }

    public final void updateCanBeExpandedFromAnchoredState() {
        boolean isCanBeExpandedFromAnchored = isCanBeExpandedFromAnchored();
        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        anchorBottomSheetBehavior.V = isCanBeExpandedFromAnchored;
        if (isCanBeExpandedFromAnchored || anchorBottomSheetBehavior.E != 3) {
            return;
        }
        anchorBottomSheetBehavior.P(6, true, true);
    }

    public final void removeOrderView(OrderView orderView) {
        clearOrderViewListeners(orderView);
        this.container.removeView(orderView);
    }
}
