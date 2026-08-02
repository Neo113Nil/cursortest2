package com.yandex.go.superapp.order.multi.old.view;

import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchOrderDetailsExperiment;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.gx60;
import defpackage.h3y;
import defpackage.ifk0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pwf0;
import defpackage.r9y0;
import defpackage.sd30;
import defpackage.tje;
import defpackage.u680;
import defpackage.uc80;
import defpackage.ud30;
import defpackage.vkh0;
import defpackage.w680;
import defpackage.xkk0;
import defpackage.ykk0;
import defpackage.zxf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.view.OrderView;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002HQBI\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'J\u000f\u0010(\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u0015J\u001d\u0010.\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020%2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u001e¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u001eH\u0014¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020\u001eH\u0014¢\u0006\u0004\b4\u00101J\r\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010DR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u00060HR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/superapp/order/multi/old/view/OrderViewContainer;", "orderDetailsContainerView", "Luc80;", "orderListContainerView", "Lcom/yandex/go/superapp/order/multi/old/view/f;", "presenter", "Lcom/yandex/go/taxi/order/details/v2/navigation/d;", "rideCardRouterFacade", "Lh3y;", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingView;", "taxiOrderTrackingViewLazy", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;", "fragmentCallback", "<init>", "(Landroid/content/Context;Lcom/yandex/go/superapp/order/multi/old/view/OrderViewContainer;Luc80;Lcom/yandex/go/superapp/order/multi/old/view/f;Lcom/yandex/go/taxi/order/details/v2/navigation/d;Lh3y;Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;)V", "", "isFocusedViewInCompleteState", "()Z", "shouldShowSettings", "inMultiorderState", "", "getCardTop", "()I", "getBottomSheetState", "Lru/yandex/taxi/order/view/OrderView;", "orderView", "Lzy11;", "addOrderView", "(Lru/yandex/taxi/order/view/OrderView;)V", "Ljava/lang/Runnable;", "onAnimationEnd", "removeOrderView", "(Lru/yandex/taxi/order/view/OrderView;Ljava/lang/Runnable;)V", "Lo2y0;", "orderHolder", "(Lo2y0;)V", "getFocusedOrderView", "()Lru/yandex/taxi/order/view/OrderView;", "onBackPressed", "order", "Lcom/yandex/go/taxi/order/analytics/DetailsOpenReason;", "openReason", "expandFocusedView", "(Lo2y0;Lcom/yandex/go/taxi/order/analytics/DetailsOpenReason;)V", "collapseAllCards", "()V", "showOrdersModalView", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;", "getScreenState", "()Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;", "Landroid/view/View;", "orderModalViewByState", "()Landroid/view/View;", "Lcom/yandex/go/taxi/order/stack/a;", "payload", "openTaxiDetailsModal", "(Lcom/yandex/go/taxi/order/stack/a;)V", "openOrderViewDetails", "Lcom/yandex/go/superapp/order/multi/old/view/OrderViewContainer;", "Luc80;", "Lcom/yandex/go/superapp/order/multi/old/view/f;", "Lcom/yandex/go/taxi/order/details/v2/navigation/d;", "Lh3y;", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;", "orderTrackingView", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingView;", "Lcom/yandex/go/superapp/order/multi/old/view/a;", "innerView", "Lcom/yandex/go/superapp/order/multi/old/view/a;", "", "orderViews", "Ljava/util/List;", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackViewsController;", "stackViewsController", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackViewsController;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderStackView extends FrameLayout {
    private final a fragmentCallback;
    private final com.yandex.go.superapp.order.multi.old.view.a innerView;
    private final OrderViewContainer orderDetailsContainerView;
    private final uc80 orderListContainerView;
    private TaxiOrderTrackingView orderTrackingView;
    private final List<OrderView> orderViews;
    private final f presenter;
    private final com.yandex.go.taxi.order.details.v2.navigation.d rideCardRouterFacade;
    private final OrderStackViewsController stackViewsController;
    private final h3y taxiOrderTrackingViewLazy;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void D7();

        void Jb(o2y0 o2y0Var);

        void V6();

        void m7();

        void sa(int i);

        void vc();
    }

    public OrderStackView(Context context, OrderViewContainer orderViewContainer, uc80 uc80Var, f fVar, com.yandex.go.taxi.order.details.v2.navigation.d dVar, h3y h3yVar, a aVar) {
        super(context);
        this.orderDetailsContainerView = orderViewContainer;
        this.orderListContainerView = uc80Var;
        this.presenter = fVar;
        this.rideCardRouterFacade = dVar;
        this.taxiOrderTrackingViewLazy = h3yVar;
        this.fragmentCallback = aVar;
        this.innerView = new com.yandex.go.superapp.order.multi.old.view.a(this);
        this.orderViews = new ArrayList();
        this.stackViewsController = new OrderStackViewsController();
        ru.yandex.taxi.design.utils.c.q(this, vkh0.order_stack_view, true);
        orderViewContainer.setVisibility(4);
        addView(orderViewContainer, -1, -1);
        uc80Var.asModalView().setVisibility(4);
        addView(uc80Var.asModalView(), -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r3 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openOrderViewDetails(com.yandex.go.taxi.order.stack.a payload) {
        View asModalView;
        View asModalView2;
        Object obj;
        o2y0 o2y0Var = payload.b;
        OrderScreen orderScreen = payload.c;
        OrderStackMvpView.AnimationType animationType = payload.d;
        TaxiCardNavigationAction taxiCardNavigationAction = payload.e;
        OrderView orderView = this.orderDetailsContainerView.getOrderView();
        this.orderDetailsContainerView.setVisibility(0);
        if (orderView != null && !jl40.l(orderView.getOrderHolder(), o2y0Var)) {
            this.orderDetailsContainerView.removeOrderView(orderView);
            orderView = null;
        }
        if (orderView == null) {
            Iterator<T> it = this.orderViews.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((OrderView) obj).getOrderHolder(), o2y0Var)) {
                        break;
                    }
                }
            }
            OrderView orderView2 = (OrderView) obj;
            if (orderView2 == null) {
                jst.e.q("Missed order view for expected holder");
                this.presenter.Pg(null);
                return;
            }
            this.orderDetailsContainerView.addOrderView(orderView2);
        }
        TaxiOrderTrackingView taxiOrderTrackingView = this.orderTrackingView;
        if (taxiOrderTrackingView != null && (asModalView2 = taxiOrderTrackingView.asModalView()) != null) {
            asModalView = orderScreen == OrderScreen.ORDER_TRACKING ? asModalView2 : null;
        }
        asModalView = this.orderListContainerView.asModalView();
        View view = asModalView;
        ifk0 ifk0Var = this.rideCardRouterFacade.e;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
        this.stackViewsController.a(this.orderDetailsContainerView, view, animationType, OrderStackViewsController.TranslationDirection.TO_LEFT, new ud30(6, this, taxiCardNavigationAction, o2y0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openOrderViewDetails$lambda$2(OrderStackView orderStackView, TaxiCardNavigationAction taxiCardNavigationAction, o2y0 o2y0Var) {
        OrderView orderView = orderStackView.orderDetailsContainerView.getOrderView();
        if (orderView != null) {
            orderView.onContainerViewTransitionFinished();
            orderStackView.orderDetailsContainerView.animate().setListener(null);
            if (taxiCardNavigationAction == TaxiCardNavigationAction.OPEN_PAYMENT) {
                orderStackView.fragmentCallback.Jb(o2y0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [v680] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openTaxiDetailsModal(com.yandex.go.taxi.order.stack.a payload) {
        View asModalView;
        o2y0 o2y0Var = payload.b;
        OrderScreen orderScreen = payload.c;
        OrderStackMvpView.AnimationType animationType = payload.d;
        TaxiCardNavigationAction taxiCardNavigationAction = payload.e;
        ifk0 ifk0Var = this.rideCardRouterFacade.e;
        if (ifk0Var != null) {
            ifk0Var.Q(o2y0Var, taxiCardNavigationAction);
        }
        if (this.rideCardRouterFacade.h() != null) {
            return;
        }
        OrderView orderView = this.orderDetailsContainerView.getOrderView();
        this.orderDetailsContainerView.setVisibility(8);
        if (orderView != null) {
            this.orderDetailsContainerView.removeOrderView(orderView);
        }
        TaxiOrderTrackingView taxiOrderTrackingView = this.orderTrackingView;
        if (taxiOrderTrackingView != null && (asModalView = taxiOrderTrackingView.asModalView()) != null) {
            if (orderScreen != OrderScreen.ORDER_TRACKING) {
                asModalView = null;
            }
        }
        asModalView = this.orderListContainerView.asModalView();
        OneShotPreDrawListener.add(asModalView, new w680(this, asModalView, animationType, 0));
        this.rideCardRouterFacade.f(new r9y0(o2y0Var, taxiCardNavigationAction), new u680(this, animationType), new b(this.fragmentCallback), new gx60() { // from class: v680
            @Override // defpackage.gx60
            public final void onBack() {
                OrderStackView.openTaxiDetailsModal$lambda$3(OrderStackView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openTaxiDetailsModal$lambda$2(OrderStackView orderStackView, OrderStackMvpView.AnimationType animationType, View view) {
        OneShotPreDrawListener.add(view, new w680(orderStackView, view, animationType, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openTaxiDetailsModal$lambda$3(OrderStackView orderStackView) {
        if (orderStackView.orderDetailsContainerView.getOrderView() != null) {
            return;
        }
        orderStackView.presenter.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View orderModalViewByState() {
        TaxiOrderTrackingView taxiOrderTrackingView;
        if (getScreenState() != OrderScreen.ORDER_TRACKING || (taxiOrderTrackingView = this.orderTrackingView) == null) {
            return this.orderListContainerView.asModalView();
        }
        if (taxiOrderTrackingView != null) {
            return taxiOrderTrackingView.asModalView();
        }
        ny61.r("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeOrderView$lambda$0(OrderStackView orderStackView, Runnable runnable) {
        orderStackView.presenter.Pg(null);
        runnable.run();
    }

    public final void addOrderView(OrderView orderView) {
        this.orderViews.add(orderView);
    }

    public final void collapseAllCards() {
        Object value;
        this.orderDetailsContainerView.collapseCard();
        xkk0 h = this.rideCardRouterFacade.h();
        if (h != null) {
            com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a aVar = (com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a) h.F.get();
            ykk0 ykk0Var = (ykk0) aVar.j.a.getValue();
            if (ykk0Var.b) {
                Integer num = ykk0Var.a;
                if (num != null && num.intValue() == 7) {
                    return;
                }
                r0 r0Var = aVar.b.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ykk0.a((ykk0) value, 4, false, false, null, null, false, 62)));
            }
        }
    }

    public final void expandFocusedView(o2y0 order, DetailsOpenReason openReason) {
        Object value;
        this.presenter.E.d(order.b().a, false, openReason, TaxiCardNavigationAction.EMPTY);
        this.orderDetailsContainerView.expandCard();
        xkk0 h = this.rideCardRouterFacade.h();
        if (h != null) {
            com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a aVar = (com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a) h.F.get();
            int i = (((SearchOrderDetailsExperiment) aVar.d.a.c()).getB() || aVar.a.c() != DriveState.SEARCH) ? 3 : 6;
            r0 r0Var = aVar.b.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, ykk0.a((ykk0) value, Integer.valueOf(i), false, false, null, null, false, 62)));
        }
    }

    public final int getBottomSheetState() {
        xkk0 h = this.rideCardRouterFacade.h();
        return h != null ? ((RideCardModalView) h.E.get()).getBottomSheetState() : this.orderDetailsContainerView.getBottomSheetState();
    }

    public final int getCardTop() {
        int anchoredHeight;
        OrderScreen screenState = getScreenState();
        boolean z = screenState == OrderScreen.ORDER_TRACKING;
        if (screenState != OrderScreen.ORDER_LIST && !z) {
            xkk0 h = this.rideCardRouterFacade.h();
            return h != null ? ((RideCardModalView) h.E.get()).getCardTop() : this.orderDetailsContainerView.getCardTop();
        }
        if (z) {
            TaxiOrderTrackingView taxiOrderTrackingView = this.orderTrackingView;
            anchoredHeight = taxiOrderTrackingView != null ? taxiOrderTrackingView.anchoredHeight() : this.orderListContainerView.anchoredHeight();
        } else {
            anchoredHeight = this.orderListContainerView.anchoredHeight();
        }
        return getHeight() - anchoredHeight;
    }

    public final OrderView getFocusedOrderView() {
        if (this.rideCardRouterFacade.h() != null) {
            return null;
        }
        return this.orderDetailsContainerView.getOrderView();
    }

    public final OrderScreen getScreenState() {
        return this.presenter.B.b();
    }

    public final boolean inMultiorderState() {
        return getScreenState() == OrderScreen.ORDER_LIST;
    }

    public final boolean isFocusedViewInCompleteState() {
        OrderView focusedOrderView = getFocusedOrderView();
        return focusedOrderView != null && focusedOrderView.isInCompleteState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.presenter;
        fVar.Bg(this.innerView);
        tje.N(fVar.Jg(), null, null, new OrderStackViewPresenter$attachView$$inlined$safeCollectIn$1(new kotlinx.coroutines.flow.k(ru.yandex.taxi.experiments.d.b(fVar.P.a), new OrderStackViewPresenter$attachView$1(fVar, null)), null, fVar), 3);
        fVar.b0.b();
    }

    public final boolean onBackPressed() {
        OrderScreen screenState = getScreenState();
        OrderScreen orderScreen = OrderScreen.ORDER_LIST;
        boolean z = screenState == orderScreen || screenState == OrderScreen.ORDER_TRACKING;
        uc80 uc80Var = screenState == orderScreen ? this.orderListContainerView : this.orderTrackingView;
        return (z && uc80Var != null && uc80Var.interceptOnBackPressed()) || this.orderDetailsContainerView.onBackPressed() || this.presenter.onBackPressed();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        ifk0 ifk0Var = this.rideCardRouterFacade.e;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
        OrderStackViewsController orderStackViewsController = this.stackViewsController;
        TranslateAnimation translateAnimation = orderStackViewsController.b;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        orderStackViewsController.b = null;
        TranslateAnimation translateAnimation2 = orderStackViewsController.a;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        orderStackViewsController.a = null;
    }

    public final void removeOrderView(o2y0 orderHolder) {
        Object obj;
        Iterator<T> it = this.orderViews.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((OrderView) obj).getOrderHolder(), orderHolder)) {
                    break;
                }
            }
        }
        OrderView orderView = (OrderView) obj;
        if (orderView == null) {
            return;
        }
        removeOrderView(orderView, pwf0.c);
    }

    public final boolean shouldShowSettings() {
        OrderScreen screenState = getScreenState();
        return (screenState == OrderScreen.ORDER_DETAILS || screenState == OrderScreen.ORDER_TRACKING) ? false : true;
    }

    public final void showOrdersModalView() {
        this.presenter.Pg(null);
    }

    public final void removeOrderView(OrderView orderView, Runnable onAnimationEnd) {
        this.orderViews.remove(orderView);
        this.orderDetailsContainerView.removeOrderView(orderView, new sd30(17, this, onAnimationEnd));
    }
}
