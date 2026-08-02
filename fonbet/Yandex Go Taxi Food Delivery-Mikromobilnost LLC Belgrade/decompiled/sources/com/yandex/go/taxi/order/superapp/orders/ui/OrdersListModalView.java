package com.yandex.go.taxi.order.superapp.orders.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.go.shortcuts.impl.repository.i;
import com.yandex.go.taxi.order.superapp.orders.ui.OrdersListModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.e230;
import defpackage.esh0;
import defpackage.gpq;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.kc00;
import defpackage.l8x;
import defpackage.lg;
import defpackage.mc80;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ng;
import defpackage.ny70;
import defpackage.oc80;
import defpackage.qje;
import defpackage.ry70;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tse;
import defpackage.ub60;
import defpackage.uc80;
import defpackage.w130;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.models.OrderRatioHeightType;
import ru.yandex.taxi.ui.recenter.RecenterButton;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0001gBS\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001fH\u0014¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010'J\u001f\u0010+\u001a\u00020\u00192\u0006\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u001fH\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010\u001bJ\u000f\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010\u001bJ\u0017\u00101\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001fH\u0014¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u0019H\u0014¢\u0006\u0004\b4\u0010\u001bJ\u000f\u00105\u001a\u00020\u0019H\u0014¢\u0006\u0004\b5\u0010\u001bJ\u0017\u00107\u001a\u00020\u00192\u0006\u00106\u001a\u00020/H\u0014¢\u0006\u0004\b7\u00102J7\u0010=\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%H\u0014¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00192\u0006\u0010B\u001a\u00020%H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0019H\u0016¢\u0006\u0004\bE\u0010\u001bJ\u000f\u0010F\u001a\u00020\u0019H\u0016¢\u0006\u0004\bF\u0010\u001bJ\u000f\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001fH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020%H\u0002¢\u0006\u0004\bL\u0010'J\u000f\u0010M\u001a\u00020%H\u0002¢\u0006\u0004\bM\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010OR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010PR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010QR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010RR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u0016\u0010T\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR\u0014\u0010[\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010'R\u001a\u0010b\u001a\u00020%8\u0015X\u0094\u0004¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010'R\u0014\u0010e\u001a\u00020%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bd\u0010'¨\u0006h"}, d2 = {"Lcom/yandex/go/taxi/order/superapp/orders/ui/OrdersListModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Luc80;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Loc80;", "ordersListView", "Lry70;", "orderListModalStateTracker", "Lru/yandex/taxi/ui/recenter/RecenterButton;", "nextRecenterButtonView", "Lgpq;", "feedOrderStatusNotificationRepository", "Lh3y;", "Lcom/yandex/go/order/ui/order_list_modal_height/presentation/a;", "orderListModalRatioHeightViewModelLazy", "Ljc00;", "mainScreenTypeInteractor", "<init>", "(Landroid/content/Context;Ltse;Loc80;Lry70;Lru/yandex/taxi/ui/recenter/RecenterButton;Lgpq;Lh3y;Ljc00;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "interceptOnBackPressed", "()Z", "canDragToExpandFromAnchored", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "anchoredHeight", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "pauseShortcuts", "resumeShortcuts", "", "newOffset", "setBackgroundDimColor", "(F)V", "useBelowCardDimming", "onArrowClick", "onModalViewDisappear", "slideOffset", "onDialogSlide", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View;", "asModalView", "()Landroid/view/View;", "initialState", "show", "(I)V", "forceAnchor", "forceCollapse", "Lng;", "createAccessibilityButtonDelegate", "()Lng;", "calculateHeight", "(Z)V", "getBottomSheetTopWithPadding", "getFloatButtonsTop", "Ltse;", "Loc80;", "Lry70;", "Lgpq;", "Lh3y;", "Ljc00;", "heightRatio", "F", "canDragToExpandedState", "Z", "topPadding", CA20Status.STATUS_USER_I, "transparentColor", "accessibilityButtonsDelegate", "Lng;", "Ll8x;", "modalRatioHeightListeningJob", "Ll8x;", "fullscreenBackgroundAttrRes", "getFullscreenBackgroundAttrRes", "slideableBackgroundAttrRes", "getSlideableBackgroundAttrRes", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "Companion", "mc80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrdersListModalView extends SlideableModalView implements uc80 {
    public static final int $stable = 8;
    private static final mc80 Companion = new mc80();
    private static final float DEFAULT_MINIMIZED_HEIGHT_RATIO = 0.2f;
    private static final float INITIAL_CONTENT_HEIGHT_RATIO = 0.5f;
    private final ng accessibilityButtonsDelegate;
    private boolean canDragToExpandedState;
    private final tse coroutineScope;
    private final gpq feedOrderStatusNotificationRepository;
    private final int fullscreenBackgroundAttrRes;
    private float heightRatio;
    private final jc00 mainScreenTypeInteractor;
    private l8x modalRatioHeightListeningJob;
    private final h3y orderListModalRatioHeightViewModelLazy;
    private final ry70 orderListModalStateTracker;
    private final oc80 ordersListView;
    private final int slideableBackgroundAttrRes;
    private final int topPadding;
    private final int transparentColor;

    public OrdersListModalView(Context context, tse tseVar, oc80 oc80Var, ry70 ry70Var, RecenterButton recenterButton, gpq gpqVar, h3y h3yVar, jc00 jc00Var) {
        super(context, 6);
        this.coroutineScope = tseVar;
        this.ordersListView = oc80Var;
        this.orderListModalStateTracker = ry70Var;
        this.feedOrderStatusNotificationRepository = gpqVar;
        this.orderListModalRatioHeightViewModelLazy = h3yVar;
        this.mainScreenTypeInteractor = jc00Var;
        this.heightRatio = 0.5f;
        this.canDragToExpandedState = true;
        this.topPadding = tje.r(mrg0.go_design_s_space, getContext());
        this.transparentColor = qje.t(xng0.bgTransparent, getContext());
        this.accessibilityButtonsDelegate = createAccessibilityButtonDelegate();
        getBottomSheetBehavior().V = this.canDragToExpandedState;
        this.heightRatio = jc00Var.a() ? 0.0f : ((Number) ((com.yandex.go.order.ui.order_list_modal_height.presentation.a) h3yVar.get()).g.getValue()).floatValue();
        setInterceptOnBackPress(false);
        setPadding(0, 0, 0, 0);
        setDismissOnTouchOutside(false);
        getCardContentContainer().addView(oc80Var.getView(), -1, -2);
        addFloatButton(recenterButton, 8388613);
        int i = xng0.bgTransparent;
        this.fullscreenBackgroundAttrRes = i;
        this.slideableBackgroundAttrRes = i;
    }

    private final void calculateHeight(boolean changed) {
        if (changed) {
            setBehaviorPeekHeight((int) ((getHeight() - getStatusBarHeight()) * 0.2f));
        }
        this.orderListModalStateTracker.a(getBottomSheetTopWithPadding(), getFloatButtonsTop());
        int height = (int) ((getHeight() - getStatusBarHeight()) * this.heightRatio);
        int height2 = this.ordersListView.getHeight();
        if (height2 < (getHeight() - getTopPadding()) - this.topPadding && isExpanded() && !this.ordersListView.topItemIsCompletelyVisible()) {
            this.ordersListView.scrollToTop();
        }
        if (peekHeight() <= height) {
            setBehaviorAnchorHeight(Integer.valueOf(height));
        }
        this.canDragToExpandedState = height2 > height;
        getBottomSheetBehavior().V = this.canDragToExpandedState;
        if (height2 > height) {
            getBottomSheetBehavior().K((getHeight() - getStatusBarHeight()) - height2, false);
            return;
        }
        if (isExpanded() && !isAnchored()) {
            getBottomSheetBehavior().P(6, true, false);
        }
        getBottomSheetBehavior().K(this.topPadding, false);
        setBackgroundColor(this.transparentColor);
    }

    private final ng createAccessibilityButtonDelegate() {
        final int i = 0;
        final int i2 = 1;
        return new ng(this, this.ordersListView.getView(), new lg(0, new sls(this) { // from class: lc80
            public final /* synthetic */ OrdersListModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAccessibilityButtonDelegate$lambda$0;
                zy11 createAccessibilityButtonDelegate$lambda$1;
                int i3 = i;
                OrdersListModalView ordersListModalView = this.b;
                switch (i3) {
                    case 0:
                        createAccessibilityButtonDelegate$lambda$0 = OrdersListModalView.createAccessibilityButtonDelegate$lambda$0(ordersListModalView);
                        return createAccessibilityButtonDelegate$lambda$0;
                    default:
                        createAccessibilityButtonDelegate$lambda$1 = OrdersListModalView.createAccessibilityButtonDelegate$lambda$1(ordersListModalView);
                        return createAccessibilityButtonDelegate$lambda$1;
                }
            }
        }, new sls(this) { // from class: lc80
            public final /* synthetic */ OrdersListModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAccessibilityButtonDelegate$lambda$0;
                zy11 createAccessibilityButtonDelegate$lambda$1;
                int i3 = i2;
                OrdersListModalView ordersListModalView = this.b;
                switch (i3) {
                    case 0:
                        createAccessibilityButtonDelegate$lambda$0 = OrdersListModalView.createAccessibilityButtonDelegate$lambda$0(ordersListModalView);
                        return createAccessibilityButtonDelegate$lambda$0;
                    default:
                        createAccessibilityButtonDelegate$lambda$1 = OrdersListModalView.createAccessibilityButtonDelegate$lambda$1(ordersListModalView);
                        return createAccessibilityButtonDelegate$lambda$1;
                }
            }
        }, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAccessibilityButtonDelegate$lambda$0(OrdersListModalView ordersListModalView) {
        ordersListModalView.forceAnchor();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAccessibilityButtonDelegate$lambda$1(OrdersListModalView ordersListModalView) {
        ordersListModalView.expand();
        ordersListModalView.ordersListView.scrollToTop();
        return zy11.a;
    }

    private final int getBottomSheetTopWithPadding() {
        return getBottomSheet().getTop() - this.topPadding;
    }

    private final int getFloatButtonsTop() {
        return getTopWithFloatButtons();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(OrdersListModalView ordersListModalView, t1w t1wVar) {
        ordersListModalView.ordersListView.insetsType(t1wVar);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int anchoredHeight() {
        return super.anchoredHeight();
    }

    @Override // defpackage.uc80
    public View asModalView() {
        return this;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored, reason: from getter */
    public boolean getCanDragToExpandedState() {
        return this.canDragToExpandedState;
    }

    @Override // defpackage.uc80
    public void forceAnchor() {
        this.ordersListView.forceScrollToTop();
        anchor();
    }

    @Override // defpackage.uc80
    public void forceCollapse() {
        this.ordersListView.forceScrollToTop();
        collapse();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return esh0.orders_list_layout;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getFullscreenBackgroundAttrRes() {
        return this.fullscreenBackgroundAttrRes;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return this.slideableBackgroundAttrRes;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new ub60(14, this));
    }

    @Override // defpackage.uc80
    public boolean interceptOnBackPressed() {
        if (!isExpanded() || isAnchored()) {
            return false;
        }
        anchor();
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (!isCollapsed()) {
            collapse();
        } else if (this.canDragToExpandedState) {
            expand();
        } else {
            anchor();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic00 ic00Var = ((kc00) this.mainScreenTypeInteractor).a;
        ic00Var.getClass();
        if (ic00Var instanceof hc00) {
            return;
        }
        ((com.yandex.go.order.ui.order_list_modal_height.presentation.a) this.orderListModalRatioHeightViewModelLazy.get()).a(OrderRatioHeightType.MULTIORDER);
        this.modalRatioHeightListeningJob = tje.N(this.coroutineScope, null, null, new OrdersListModalView$onAttachedToWindow$$inlined$safeCollectIn$1(((com.yandex.go.order.ui.order_list_modal_height.presentation.a) this.orderListModalRatioHeightViewModelLazy.get()).g, null, this), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        this.ordersListView.onListStateChanged(newState, movedByUser);
        if (newState != 2 && !movedByUser) {
            this.ordersListView.scrollToTop();
        }
        if (newState != 3) {
            if (newState == 4) {
                this.accessibilityButtonsDelegate.a();
                this.accessibilityButtonsDelegate.d();
                return;
            } else {
                if (newState == 6) {
                    this.orderListModalStateTracker.a(getBottomSheetTopWithPadding(), getFloatButtonsTop());
                    r0 r0Var = this.orderListModalStateTracker.c;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    this.accessibilityButtonsDelegate.a();
                    this.accessibilityButtonsDelegate.d();
                    return;
                }
                if (newState != 7) {
                    return;
                }
            }
        }
        this.accessibilityButtonsDelegate.c(true);
        this.accessibilityButtonsDelegate.b();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic00 ic00Var = ((kc00) this.mainScreenTypeInteractor).a;
        ic00Var.getClass();
        if (!(ic00Var instanceof hc00)) {
            ((com.yandex.go.order.ui.order_list_modal_height.presentation.a) this.orderListModalRatioHeightViewModelLazy.get()).d.b();
        }
        l8x l8xVar = this.modalRatioHeightListeningJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.modalRatioHeightListeningJob = null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float slideOffset) {
        super.onDialogSlide(slideOffset);
        ry70 ry70Var = this.orderListModalStateTracker;
        int bottomSheetTopWithPadding = getBottomSheetTopWithPadding();
        int floatButtonsTop = getFloatButtonsTop();
        float convertToOffsetFromAnchored = convertToOffsetFromAnchored(slideOffset);
        float x = getBottomSheetBehavior().x();
        boolean z = this.canDragToExpandedState;
        ry70Var.getClass();
        boolean z2 = false;
        if (!z ? convertToOffsetFromAnchored <= x : convertToOffsetFromAnchored <= 0.0f) {
            z2 = true;
        }
        r0 r0Var = ry70Var.a;
        ny70 ny70Var = new ny70(bottomSheetTopWithPadding, floatButtonsTop, z2, z2);
        r0Var.getClass();
        r0Var.m(null, ny70Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        calculateHeight(changed);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        r0 r0Var = this.orderListModalStateTracker.c;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView()) || getBottomSheetBehavior().E == 3) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // defpackage.uc80
    public void pauseShortcuts() {
        this.ordersListView.pause();
    }

    @Override // defpackage.uc80
    public void resumeShortcuts() {
        this.ordersListView.resume();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
        View dimBackgroundView = getDimBackgroundView();
        if (getCanDragToExpandedState()) {
            dimBackgroundView.setBackgroundColor(cma1.m(newOffset, getContext().getColor(super.getBackgroundColor())));
        } else {
            dimBackgroundView.setBackgroundColor(getContext().getColor(getBackgroundColor()));
        }
    }

    @Override // defpackage.uc80
    public void show(int initialState) {
        setVisibility(0);
        ((i) this.feedOrderStatusNotificationRepository).a();
        if (initialState == 3) {
            expand();
        } else {
            anchor();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean useBelowCardDimming() {
        return true;
    }
}
