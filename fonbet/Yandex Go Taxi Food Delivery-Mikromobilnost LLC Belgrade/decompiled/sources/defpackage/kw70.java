package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.yandex.go.superapp.order.multi.old.a;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.taxi.order.view.tips.TipsInputModalView;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SharingLocationNotificationItemComponent;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.widget.address.b;

/* loaded from: classes6.dex */
public final class kw70 implements ww70 {
    public final /* synthetic */ OrderFragment a;

    public kw70(OrderFragment orderFragment) {
        this.a = orderFragment;
    }

    @Override // defpackage.ww70
    public final void Db(o2y0 o2y0Var, ga80 ga80Var) {
        OrderStackView orderStackView;
        OrderView createOrderView;
        OrderFragment orderFragment = this.a;
        orderStackView = orderFragment.orderStackView;
        if (orderStackView == null) {
            jst.e.e("TaxiOrder.Navigation.addOrderView", "OrderFragment", new IllegalStateException("::addOrderView orderStackView is null"));
        } else {
            createOrderView = orderFragment.createOrderView(o2y0Var, ga80Var);
            orderStackView.addOrderView(createOrderView);
        }
    }

    @Override // defpackage.ww70
    public final void Ea(vh70 vh70Var) {
        a aVar;
        aVar = this.a.orderTransitionCoordinator;
        if (aVar != null) {
            r0 r0Var = aVar.i;
            b bVar = aVar.g;
            if (jl40.l(vh70Var, vh70.e) || ((Boolean) aVar.e.a.c()).booleanValue()) {
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                return;
            }
            String h = ((avj0) aVar.a).h(vh70Var.a);
            ListItemComponent listItemComponent = bVar.a;
            ListItemComponent listItemComponent2 = bVar.a;
            listItemComponent.setTitle(h);
            listItemComponent2.setSubtitle(vh70Var.b);
            int i = t980.a[vh70Var.c.ordinal()];
            if (i == 1) {
                Boolean bool2 = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool2);
                bVar.d = false;
                listItemComponent2.stopSubtitleProgressAnimation();
                return;
            }
            if (i == 2) {
                Boolean bool3 = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool3);
                bVar.d(true);
                return;
            }
            bVar.d = false;
            listItemComponent2.stopSubtitleProgressAnimation();
            Boolean bool4 = Boolean.FALSE;
            r0Var.getClass();
            r0Var.m(null, bool4);
        }
    }

    @Override // defpackage.ww70
    public final void Fa(qim qimVar) {
        i3y i3yVar;
        OrderFragment orderFragment = this.a;
        oep0 screenStackNavigator = orderFragment.getScreenStackNavigator();
        i3yVar = orderFragment.driverProfileRouter;
        ((pep0) screenStackNavigator).f((m950) i3yVar.getValue(), qimVar, hxx.a);
    }

    @Override // defpackage.ww70
    public final void I7() {
        OrderBubblesOverlay orderBubblesOverlay;
        orderBubblesOverlay = this.a.bubbles;
        if (orderBubblesOverlay != null) {
            orderBubblesOverlay.updateBubbles();
        }
    }

    @Override // defpackage.ww70
    public final void I8(ga80 ga80Var) {
        this.a.createBubblesOverlay(ga80Var);
    }

    @Override // defpackage.ww70
    public final void K6(ga80 ga80Var) {
        oep0 screenStackNavigator = this.a.getScreenStackNavigator();
        l0g l0gVar = (l0g) ga80Var;
        d0g d0gVar = l0gVar.c.a;
        xx70 xx70Var = new xx70(0, (i130) d0gVar.b.g0.get(), d0gVar.X5);
        o2y0 o2y0Var = l0gVar.a.a;
        q5z.i(o2y0Var);
        ((pep0) screenStackNavigator).f(xx70Var, o2y0Var, hxx.a);
    }

    @Override // defpackage.ww70
    public final void Ma() {
        i3y i3yVar;
        OrderFragment orderFragment = this.a;
        oep0 screenStackNavigator = orderFragment.getScreenStackNavigator();
        i3yVar = orderFragment.somethingWrongOnboardingScreenRouter;
        oep0.b(screenStackNavigator, (m950) i3yVar.getValue());
    }

    @Override // defpackage.ww70
    public final void Me() {
        OrderStackView orderStackView;
        orderStackView = this.a.orderStackView;
        if (orderStackView == null) {
            jst.e.e("TaxiOrder.Navigation.collapseAll", "OrderFragment", new IllegalStateException("::collapseAll orderStackView is null"));
        } else {
            orderStackView.collapseAllCards();
        }
    }

    @Override // defpackage.ww70
    public final void Q4(boolean z) {
        a aVar;
        boolean shouldShowSettings;
        OrderFragment orderFragment = this.a;
        orderFragment.setMapLocked(z);
        aVar = orderFragment.orderTransitionCoordinator;
        if (aVar == null) {
            jst.e.e("TaxiOrder.Navigation.updateUi", "OrderFragment", new IllegalStateException("::updateUi orderTransitionCoordinator is null"));
        } else {
            shouldShowSettings = orderFragment.shouldShowSettings();
            aVar.b.setVisibility(shouldShowSettings ? 0 : 4);
        }
    }

    @Override // defpackage.ww70
    public final void S5(ga80 ga80Var, String str) {
        l0g l0gVar = (l0g) ga80Var;
        c0g c0gVar = l0gVar.c;
        TipsInputModalView tipsInputModalView = new TipsInputModalView((Context) c0gVar.U.get(), (tse) c0gVar.B.get(), (zfz0) l0gVar.o.get());
        tipsInputModalView.setPreviousValue(str);
        this.a.openModalView(tipsInputModalView, new twn());
    }

    @Override // defpackage.ww70
    public final void X2() {
        OrderStackView orderStackView;
        orderStackView = this.a.orderStackView;
        if (orderStackView == null) {
            jst.e.e("TaxiOrder.Navigation.showOrderList", "OrderFragment", new IllegalStateException("::showOrderList orderStackView is null"));
        } else {
            orderStackView.showOrdersModalView();
        }
    }

    @Override // defpackage.ww70
    public final View findViewById(int i) {
        return this.a.requireActivity().findViewById(i);
    }

    @Override // defpackage.ww70
    public final void kb() {
        OrderFragment orderFragment = this.a;
        ((pep0) orderFragment.getScreenStackNavigator()).f(((pc60) orderFragment.getNoLocationPermissionRouterFactory()).b(true), new nc60((String) null), hxx.a);
    }

    @Override // defpackage.ww70
    public final void mb(String str) {
        OrderFragment orderFragment = this.a;
        SharingLocationNotificationItemComponent sharingLocationNotificationItemComponent = new SharingLocationNotificationItemComponent(orderFragment.requireContext(), null, 0, 6, null);
        sharingLocationNotificationItemComponent.setExpiresListener(new lqr0(orderFragment.getNotificationStackHolder()));
        sharingLocationNotificationItemComponent.setTitle(str);
        orderFragment.getNotificationStackHolder().e(sharingLocationNotificationItemComponent);
        sharingLocationNotificationItemComponent.startExpiresTimer();
    }

    @Override // defpackage.ww70
    public final void n9(o2y0 o2y0Var) {
        OrderStackView orderStackView;
        orderStackView = this.a.orderStackView;
        if (orderStackView == null) {
            jst.e.e("TaxiOrder.Navigation.removeOrderView", "OrderFragment", new IllegalStateException("::removeOrderView orderStackView is null"));
        } else {
            orderStackView.removeOrderView(o2y0Var);
        }
    }

    @Override // defpackage.ww70
    public final void sc(v770 v770Var) {
        i3y i3yVar;
        i3y i3yVar2;
        OrderFragment orderFragment = this.a;
        if (orderFragment.getView() != null) {
            i3yVar = orderFragment.promocodesRouter;
            if (gtq0.u((m950) i3yVar.getValue())) {
                return;
            }
            oep0 screenStackNavigator = orderFragment.getScreenStackNavigator();
            i3yVar2 = orderFragment.promocodesRouter;
            ((pep0) screenStackNavigator).f((m950) i3yVar2.getValue(), new qrf0(new nrf0((Uri) null, v770Var)), hxx.a);
        }
    }
}
