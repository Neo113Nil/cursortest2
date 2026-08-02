package com.yandex.go.superapp.order.multi.old.view;

import android.view.View;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import defpackage.afe;
import defpackage.ci70;
import defpackage.ed80;
import defpackage.my70;
import defpackage.t52;
import defpackage.x4e;
import defpackage.yh70;
import java.util.HashMap;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.order.view.TaxiOrderDetailsViewContainerLayout;

/* loaded from: classes14.dex */
public final class i implements t52 {
    public final /* synthetic */ OrderViewContainer a;
    public final /* synthetic */ AnchorBottomSheetBehavior b;

    public i(OrderViewContainer orderViewContainer, AnchorBottomSheetBehavior anchorBottomSheetBehavior) {
        this.a = orderViewContainer;
        this.b = anchorBottomSheetBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r12 != 7) goto L35;
     */
    @Override // defpackage.t52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z) {
        OrderStackView.a aVar;
        TaxiOrderDetailsViewContainerLayout taxiOrderDetailsViewContainerLayout;
        my70 my70Var;
        my70 my70Var2;
        boolean z2;
        OrderViewContainer orderViewContainer = this.a;
        orderViewContainer.processCardState(i);
        OrderView orderView = orderViewContainer.getOrderView();
        if (orderView != null) {
            x4e.z(i, orderView.getOrderCardInfo().a, null);
            if (i != 2) {
                z2 = orderViewContainer.expandedByUserAction;
                if (!z2) {
                    orderView.resetScroll();
                }
                orderViewContainer.expandedByUserAction = false;
            }
            my70Var2 = orderViewContainer.orderListController;
            String str = orderView.getOrderHolder().b().a;
            ci70 ci70Var = my70Var2.a;
            ci70Var.getClass();
            if (i != 1 && i != 2 && i != 5 && ci70Var.D != i) {
                ci70Var.D = i;
                if (z) {
                    if (i != 3) {
                        if (i == 4) {
                            ci70Var.i(str, "collapsed");
                        } else if (i == 6) {
                            ci70Var.i(str, "default");
                        }
                    }
                    ci70Var.i(str, "fullscreen");
                } else {
                    afe afeVar = ci70Var.j;
                    if (i == 3) {
                        afeVar.getClass();
                        afeVar.a.a("ContentCard.AutoMovedToExpanded", new HashMap(), 1, new HashMap());
                    } else if (i == 4) {
                        afeVar.getClass();
                        afeVar.a.a("ContentCard.AutoMovedToCollapsed", new HashMap(), 1, new HashMap());
                    } else if (i == 6) {
                        afeVar.getClass();
                        afeVar.a.a("ContentCard.AutoMovedToDefault", new HashMap(), 1, new HashMap());
                    }
                }
            }
        }
        if (i == 1) {
            orderViewContainer.onCardMovedManually();
        } else if (i == 7) {
            orderViewContainer.updateBottomBehavior(false);
        } else if (i == 3) {
            if (orderView != null) {
                my70Var = orderViewContainer.orderListController;
                String str2 = orderView.getOrderHolder().b().a;
                ci70 ci70Var2 = my70Var.a;
                yh70 yh70Var = ci70Var2.f;
                String b = ci70Var2.b(str2);
                yh70Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("mode", b);
                yh70Var.a.a("ContentCardScreenDidAppear", hashMap, 1, new HashMap());
            }
            orderViewContainer.onCardMovedManually();
        } else if (i == 4 || i == 5) {
            orderViewContainer.updateBottomBehavior(true);
        }
        aVar = orderViewContainer.fragmentCallback;
        taxiOrderDetailsViewContainerLayout = orderViewContainer.container;
        taxiOrderDetailsViewContainerLayout.getTop();
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.b;
        aVar.sa(anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x));
    }

    @Override // defpackage.t52
    public final void i(float f, boolean z, View view) {
        OrderStackView.a aVar;
        TaxiOrderDetailsViewContainerLayout taxiOrderDetailsViewContainerLayout;
        ed80 ed80Var;
        int bottomSheetTopWithPadding;
        boolean isCanBeExpandedFromAnchored;
        OrderViewContainer orderViewContainer = this.a;
        orderViewContainer.setCoverAlpha(orderViewContainer.calculateCoverAlpha(f));
        aVar = orderViewContainer.fragmentCallback;
        taxiOrderDetailsViewContainerLayout = orderViewContainer.container;
        taxiOrderDetailsViewContainerLayout.getTop();
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.b;
        aVar.sa(anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x));
        ed80Var = orderViewContainer.ordersViewCardStateTracker;
        bottomSheetTopWithPadding = orderViewContainer.getBottomSheetTopWithPadding();
        int containerTop = orderViewContainer.getContainerTop();
        float convertToOffsetFromAnchored = orderViewContainer.convertToOffsetFromAnchored(f);
        float x = anchorBottomSheetBehavior.x();
        isCanBeExpandedFromAnchored = orderViewContainer.isCanBeExpandedFromAnchored();
        ed80Var.a(bottomSheetTopWithPadding, containerTop, convertToOffsetFromAnchored, x, isCanBeExpandedFromAnchored);
    }
}
