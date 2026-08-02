package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import defpackage.oa80;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.view.OrderView;

/* loaded from: classes14.dex */
public final class h implements OrderView.a {
    public final /* synthetic */ OrderView a;
    public final /* synthetic */ OrderViewContainer b;

    public h(OrderViewContainer orderViewContainer, OrderView orderView) {
        this.a = orderView;
        this.b = orderViewContainer;
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void B4() {
        OrderStackView.a aVar;
        oa80 oa80Var;
        OrderViewContainer orderViewContainer = this.b;
        if (this.a != orderViewContainer.getOrderView()) {
            return;
        }
        orderViewContainer.updateCanBeExpandedFromAnchoredState();
        aVar = orderViewContainer.fragmentCallback;
        aVar.m7();
        oa80Var = orderViewContainer.initOrderViewInitNotifier;
        oa80Var.d = true;
        oa80Var.a();
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void Bb() {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        OrderStackView.a aVar;
        oa80 oa80Var;
        OrderViewContainer orderViewContainer = this.b;
        OrderView orderView = orderViewContainer.getOrderView();
        OrderView orderView2 = this.a;
        if (orderView2 != orderView) {
            return;
        }
        anchorBottomSheetBehavior = orderViewContainer.bottomSheetBehavior;
        orderViewContainer.processCardState(anchorBottomSheetBehavior.E);
        orderViewContainer.updateBottomBehavior(!(orderView2.getOrderPresenter().Q.a.a.get() != 0));
        aVar = orderViewContainer.fragmentCallback;
        aVar.vc();
        orderViewContainer.updateNestedScroll();
        oa80Var = orderViewContainer.initOrderViewInitNotifier;
        oa80Var.b = true;
        oa80Var.a();
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void checkCardState() {
        this.b.updateCanBeExpandedFromAnchoredState();
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void k0() {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        OrderViewContainer orderViewContainer = this.b;
        anchorBottomSheetBehavior = orderViewContainer.bottomSheetBehavior;
        anchorBottomSheetBehavior.P(3, true, true);
        orderViewContainer.onCardMovedManually();
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void oc(DriveState driveState) {
        oa80 oa80Var;
        OrderViewContainer orderViewContainer = this.b;
        OrderView orderView = orderViewContainer.getOrderView();
        OrderView orderView2 = this.a;
        if (orderView2 != orderView) {
            return;
        }
        orderViewContainer.isBottomSheetStateChanged = false;
        orderViewContainer.setCardState(driveState);
        orderView2.resetScroll();
        oa80Var = orderViewContainer.initOrderViewInitNotifier;
        oa80Var.c = true;
        oa80Var.a();
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void onWalkingRouteCancel() {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        anchorBottomSheetBehavior = this.b.bottomSheetBehavior;
        anchorBottomSheetBehavior.P(7, true, true);
    }

    @Override // ru.yandex.taxi.order.view.OrderView.a
    public final void setBottomSheetState(int i) {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        anchorBottomSheetBehavior = this.b.bottomSheetBehavior;
        anchorBottomSheetBehavior.O(i);
    }
}
