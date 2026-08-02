package com.yandex.go.superapp.order.multi.old.view;

import android.view.View;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.details.common.TaxiCardAppearanceMode;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.d82;
import defpackage.h3y;
import defpackage.ifk0;
import defpackage.o2y0;
import defpackage.uc80;

/* loaded from: classes14.dex */
public final class a implements OrderStackMvpView {
    public final /* synthetic */ OrderStackView a;

    public a(OrderStackView orderStackView) {
        this.a = orderStackView;
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void Xa(com.yandex.go.taxi.order.stack.a aVar) {
        TaxiCardAppearanceMode taxiCardAppearanceMode = aVar.a;
        TaxiCardAppearanceMode taxiCardAppearanceMode2 = TaxiCardAppearanceMode.RIDE_CARD;
        OrderStackView orderStackView = this.a;
        if (taxiCardAppearanceMode == taxiCardAppearanceMode2) {
            orderStackView.openTaxiDetailsModal(aVar);
        } else {
            orderStackView.openOrderViewDetails(aVar);
        }
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void Y7(int i, OrderStackMvpView.AnimationType animationType, OrderScreen orderScreen) {
        com.yandex.go.taxi.order.details.v2.navigation.d dVar;
        TaxiOrderTrackingView taxiOrderTrackingView;
        TaxiOrderTrackingView taxiOrderTrackingView2;
        uc80 uc80Var;
        View asModalView;
        uc80 uc80Var2;
        TaxiOrderTrackingView taxiOrderTrackingView3;
        View view;
        OrderStackViewsController orderStackViewsController;
        uc80 uc80Var3;
        h3y h3yVar;
        TaxiOrderTrackingView taxiOrderTrackingView4;
        TaxiOrderTrackingView taxiOrderTrackingView5;
        OrderStackView orderStackView = this.a;
        dVar = orderStackView.rideCardRouterFacade;
        ifk0 ifk0Var = dVar.e;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
        taxiOrderTrackingView = orderStackView.orderTrackingView;
        if (taxiOrderTrackingView == null) {
            h3yVar = orderStackView.taxiOrderTrackingViewLazy;
            orderStackView.orderTrackingView = (TaxiOrderTrackingView) h3yVar.get();
            taxiOrderTrackingView4 = orderStackView.orderTrackingView;
            if (taxiOrderTrackingView4 != null) {
                taxiOrderTrackingView4.setVisibility(4);
            }
            taxiOrderTrackingView5 = orderStackView.orderTrackingView;
            orderStackView.addView(taxiOrderTrackingView5, -1, -1);
        }
        taxiOrderTrackingView2 = orderStackView.orderTrackingView;
        if (taxiOrderTrackingView2 != null) {
            asModalView = taxiOrderTrackingView2.asModalView();
            taxiOrderTrackingView2.show(i);
            if (orderScreen == OrderScreen.ORDER_LIST) {
                taxiOrderTrackingView2.reload();
            }
        } else if (orderScreen == OrderScreen.ORDER_LIST) {
            asModalView = orderStackView.orderDetailsContainerView;
        } else {
            uc80Var = orderStackView.orderListContainerView;
            asModalView = uc80Var.asModalView();
            uc80Var2 = orderStackView.orderListContainerView;
            uc80Var2.show(i);
        }
        View view2 = asModalView;
        taxiOrderTrackingView3 = orderStackView.orderTrackingView;
        if (taxiOrderTrackingView3 != null) {
            taxiOrderTrackingView3.show(i);
            if (orderScreen == OrderScreen.ORDER_TRACKING) {
                taxiOrderTrackingView3.reload();
                return;
            }
        }
        OrderScreen orderScreen2 = OrderScreen.ORDER_LIST;
        if (orderScreen == orderScreen2) {
            uc80Var3 = orderStackView.orderListContainerView;
            view = uc80Var3.asModalView();
        } else {
            view = orderStackView.orderDetailsContainerView;
        }
        View view3 = view;
        OrderStackViewsController.TranslationDirection translationDirection = orderScreen != orderScreen2 ? OrderStackViewsController.TranslationDirection.TO_RIGHT : OrderStackViewsController.TranslationDirection.TO_LEFT;
        orderStackViewsController = orderStackView.stackViewsController;
        orderStackViewsController.a(view2, view3, animationType, translationDirection, new d82(1));
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void forceAnchor() {
        uc80 uc80Var;
        uc80Var = this.a.orderListContainerView;
        uc80Var.forceAnchor();
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void forceCollapse() {
        uc80 uc80Var;
        uc80Var = this.a.orderListContainerView;
        uc80Var.forceCollapse();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 != null) goto L14;
     */
    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h3(int i, OrderStackMvpView.AnimationType animationType) {
        f fVar;
        TaxiOrderTrackingView taxiOrderTrackingView;
        View view;
        com.yandex.go.taxi.order.details.v2.navigation.d dVar;
        uc80 uc80Var;
        OrderStackViewsController orderStackViewsController;
        uc80 uc80Var2;
        OrderStackView orderStackView = this.a;
        fVar = orderStackView.presenter;
        OrderScreen orderScreen = fVar.g0;
        if (orderScreen == OrderScreen.ORDER_LIST) {
            return;
        }
        taxiOrderTrackingView = orderStackView.orderTrackingView;
        if (taxiOrderTrackingView != null && (view = taxiOrderTrackingView.asModalView()) != null) {
            if (orderScreen != OrderScreen.ORDER_TRACKING) {
                view = null;
            }
        }
        view = orderStackView.orderDetailsContainerView;
        View view2 = view;
        dVar = orderStackView.rideCardRouterFacade;
        ifk0 ifk0Var = dVar.e;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
        uc80Var = orderStackView.orderListContainerView;
        uc80Var.show(i);
        orderStackViewsController = orderStackView.stackViewsController;
        uc80Var2 = orderStackView.orderListContainerView;
        orderStackViewsController.a(uc80Var2.asModalView(), view2, animationType, null, new d82(1));
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void jd() {
        com.yandex.go.taxi.order.details.v2.navigation.d dVar;
        dVar = this.a.rideCardRouterFacade;
        ifk0 ifk0Var = dVar.f;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void pauseShortcuts() {
        uc80 uc80Var;
        uc80Var = this.a.orderListContainerView;
        uc80Var.pauseShortcuts();
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void resumeShortcuts() {
        uc80 uc80Var;
        uc80Var = this.a.orderListContainerView;
        uc80Var.resumeShortcuts();
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final void u8() {
        View orderModalViewByState;
        orderModalViewByState = this.a.orderModalViewByState();
        orderModalViewByState.setVisibility(4);
    }

    @Override // com.yandex.go.taxi.order.stack.OrderStackMvpView
    public final boolean ue(TaxiCardNavigationAction taxiCardNavigationAction) {
        com.yandex.go.taxi.order.details.v2.navigation.d dVar;
        o2y0 o2y0Var;
        dVar = this.a.rideCardRouterFacade;
        ifk0 ifk0Var = dVar.e;
        if (ifk0Var == null || (o2y0Var = dVar.g) == null) {
            return false;
        }
        ifk0Var.Q(o2y0Var, taxiCardNavigationAction);
        return true;
    }
}
