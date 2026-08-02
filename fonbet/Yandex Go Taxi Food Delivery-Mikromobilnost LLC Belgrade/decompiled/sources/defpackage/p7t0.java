package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.zone.dto.objects.VerticalMode;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.preorder.summary.requirements.sole.SoleRequirementModalView;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorMargin;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorViewType;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.cardhandler.SummaryArrowsView;
import ru.yandex.taxi.preorder.summary.solid.tooltip.ui.CoreCashbackAvailableTooltipPopup;
import ru.yandex.taxi.requirements.repository.a;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;
import ru.yandex.taxi.widget.TooltipPointerDrawer$PointerGravity;
import ru.yandex.taxi.widget.TooltipView;

/* loaded from: classes6.dex */
public final class p7t0 implements m6t0 {
    public final /* synthetic */ SolidSummaryView a;

    public p7t0(SolidSummaryView solidSummaryView) {
        this.a = solidSummaryView;
    }

    @Override // defpackage.m6t0
    public final void E8(m1a0 m1a0Var) {
        f6t0 f6t0Var;
        f6t0Var = this.a.buttonHolder;
        f6t0Var.b.update(m1a0Var, f6t0Var.a, true, kyh0.summary_order_button_payment_content_description);
    }

    @Override // defpackage.m6t0
    public final void Ie(jmw0 jmw0Var, a aVar) {
        epj0 epj0Var;
        i130 i130Var;
        SolidSummaryView solidSummaryView = this.a;
        epj0Var = solidSummaryView.requirementsModalViewFactory;
        epj0Var.getClass();
        SoleRequirementModalView soleRequirementModalView = new SoleRequirementModalView(epj0Var.a, (x5t0) epj0Var.b.get(), jmw0Var, aVar);
        i130Var = solidSummaryView.modalViewCoordinatorProvider;
        i130Var.a().s(soleRequirementModalView, true);
    }

    @Override // defpackage.m6t0
    public final void Nc(upj0 upj0Var, boolean z) {
        eh2 eh2Var;
        SolidSummaryView solidSummaryView = this.a;
        eh2Var = solidSummaryView.animationDelayHandler;
        solidSummaryView.redirectToTariffCardForPickingRequirementCallback = eh2Var.a(solidSummaryView.getHandler(), z, new hpo0(4, solidSummaryView, upj0Var, this), 600);
    }

    @Override // defpackage.m6t0
    public final void O2(boolean z) {
        SummaryArrowsView summaryArrowsView;
        SummaryArrowsView summaryArrowsView2;
        SummaryArrowsView summaryArrowsView3;
        SummaryArrowsView summaryArrowsView4;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        SolidSummaryView solidSummaryView = this.a;
        solidSummaryView.canBeExpanded = z;
        if (!z) {
            summaryArrowsView = solidSummaryView.summaryArrowsView;
            summaryArrowsView.setVisibility(8);
            return;
        }
        summaryArrowsView2 = solidSummaryView.summaryArrowsView;
        summaryArrowsView2.showArrowPlain();
        summaryArrowsView3 = solidSummaryView.summaryArrowsView;
        summaryArrowsView3.setInsideTopOffsetSupplier(new i7t0(solidSummaryView, 1));
        summaryArrowsView4 = solidSummaryView.summaryArrowsView;
        summaryArrowsView4.setTouchEventAction(new h7t0(solidSummaryView, 6));
        anchorBottomSheetBehavior = solidSummaryView.summaryAnchorBehavior;
        anchorBottomSheetBehavior.a0 = true;
        solidSummaryView.attachSummaryExpandedView();
    }

    @Override // defpackage.m6t0
    public final void Qa(VerticalMode verticalMode) {
        c cVar;
        TariffsSelectorView$SelectorViewType selectorType;
        SolidSummaryView solidSummaryView = this.a;
        cVar = solidSummaryView.tariffsSelectorView;
        selectorType = solidSummaryView.getSelectorType(verticalMode);
        cVar.e(selectorType);
    }

    @Override // defpackage.m6t0
    public final void R1(String str) {
        this.a.announceForAccessibility(str);
    }

    @Override // defpackage.m6t0
    public final void V3(TariffsSelectorView$SelectorMargin tariffsSelectorView$SelectorMargin) {
        c cVar;
        cVar = this.a.tariffsSelectorView;
        cVar.r = tariffsSelectorView$SelectorMargin;
        DoubleTariffRibbonView doubleTariffRibbonView = cVar.n;
        if (doubleTariffRibbonView != null) {
            TariffsSelectorView$SelectorMargin tariffsSelectorView$SelectorMargin2 = TariffsSelectorView$SelectorMargin.SMALL;
            AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout = cVar.c;
            doubleTariffRibbonView.setTopMargin(tariffsSelectorView$SelectorMargin == tariffsSelectorView$SelectorMargin2 ? ru.yandex.taxi.design.utils.c.h(20, anyTouchCatcherFrameLayout) : ru.yandex.taxi.design.utils.c.h(32, anyTouchCatcherFrameLayout));
        }
    }

    @Override // defpackage.m6t0
    public final void Vf(SummaryExpandReason summaryExpandReason, zjj0 zjj0Var) {
        eh2 eh2Var;
        int i;
        SolidSummaryView solidSummaryView = this.a;
        solidSummaryView.tryExpandToPager(summaryExpandReason);
        eh2Var = solidSummaryView.animationDelayHandler;
        Handler handler = solidSummaryView.getHandler();
        g7t0 g7t0Var = new g7t0(solidSummaryView, 5);
        i = solidSummaryView.statusBarHeight;
        ukv0.c(eh2Var, handler, g7t0Var, zjj0Var, i);
    }

    @Override // defpackage.m6t0
    public final void W2(String str) {
        eh2 eh2Var;
        int i;
        SummaryExpandReason summaryExpandReason = SummaryExpandReason.AUTO_REDIRECT;
        SolidSummaryView solidSummaryView = this.a;
        solidSummaryView.tryExpandToPager(summaryExpandReason);
        eh2Var = solidSummaryView.animationDelayHandler;
        Handler handler = solidSummaryView.getHandler();
        g7t0 g7t0Var = new g7t0(solidSummaryView, 4);
        i = solidSummaryView.statusBarHeight;
        if (str == null) {
            return;
        }
        eh2Var.a(handler, true, new pkv0(g7t0Var, eh2Var, handler, null, str, i), 1200);
    }

    @Override // defpackage.m6t0
    public final void ba(egv0 egv0Var) {
        FloatButtonIconComponent floatButtonIconComponent;
        FloatButtonIconComponent floatButtonIconComponent2;
        pav pavVar;
        FloatButtonIconComponent floatButtonIconComponent3;
        FloatButtonIconComponent floatButtonIconComponent4;
        FloatButtonIconComponent floatButtonIconComponent5;
        FloatButtonIconComponent floatButtonIconComponent6;
        pav pavVar2;
        FloatButtonIconComponent floatButtonIconComponent7;
        FloatButtonIconComponent floatButtonIconComponent8;
        FloatButtonIconComponent floatButtonIconComponent9;
        FloatButtonIconComponent floatButtonIconComponent10;
        FloatButtonIconComponent floatButtonIconComponent11;
        FloatButtonIconComponent floatButtonIconComponent12;
        FloatButtonIconComponent floatButtonIconComponent13;
        FloatButtonIconComponent floatButtonIconComponent14;
        FloatButtonIconComponent floatButtonIconComponent15;
        FloatButtonIconComponent floatButtonIconComponent16;
        boolean l = jl40.l(egv0Var, zfv0.a);
        SolidSummaryView solidSummaryView = this.a;
        if (l) {
            floatButtonIconComponent15 = solidSummaryView.summaryRouteButton;
            floatButtonIconComponent15.setVisibility(8);
            floatButtonIconComponent16 = solidSummaryView.summaryAutolocationButton;
            floatButtonIconComponent16.setVisibility(0);
            return;
        }
        if (jl40.l(egv0Var, cgv0.a)) {
            floatButtonIconComponent11 = solidSummaryView.summaryRouteButton;
            floatButtonIconComponent11.setIcon(f1h0.ic_route);
            floatButtonIconComponent12 = solidSummaryView.summaryRouteButton;
            floatButtonIconComponent12.setContentDescription(solidSummaryView.getContext().getString(kyh0.summory_route_show_description));
            floatButtonIconComponent13 = solidSummaryView.summaryRouteButton;
            floatButtonIconComponent13.setVisibility(0);
            floatButtonIconComponent14 = solidSummaryView.summaryAutolocationButton;
            floatButtonIconComponent14.setVisibility(8);
            return;
        }
        if (egv0Var instanceof bgv0) {
            floatButtonIconComponent9 = solidSummaryView.summaryRouteButton;
            floatButtonIconComponent9.setVisibility(8);
            floatButtonIconComponent10 = solidSummaryView.summaryAutolocationButton;
            floatButtonIconComponent10.setVisibility(8);
            return;
        }
        if (egv0Var instanceof dgv0) {
            floatButtonIconComponent5 = solidSummaryView.summaryRouteButton;
            dgv0 dgv0Var = (dgv0) egv0Var;
            floatButtonIconComponent5.setContentDescription(dgv0Var.a);
            floatButtonIconComponent6 = solidSummaryView.summaryRouteButton;
            floatButtonIconComponent6.setVisibility(8);
            pavVar2 = solidSummaryView.imageLoader;
            floatButtonIconComponent7 = solidSummaryView.summaryRouteButton;
            nac nacVar = (nac) pavVar2.a(floatButtonIconComponent7.getIcon());
            nacVar.i = new g7t0(solidSummaryView, 7);
            nacVar.h = new e7t0(solidSummaryView, 2);
            nacVar.c(dgv0Var.b);
            floatButtonIconComponent8 = solidSummaryView.summaryAutolocationButton;
            floatButtonIconComponent8.setVisibility(8);
            return;
        }
        if (!(egv0Var instanceof agv0)) {
            w511.b();
            return;
        }
        floatButtonIconComponent = solidSummaryView.summaryRouteButton;
        agv0 agv0Var = (agv0) egv0Var;
        floatButtonIconComponent.setContentDescription(agv0Var.a);
        floatButtonIconComponent2 = solidSummaryView.summaryRouteButton;
        floatButtonIconComponent2.setVisibility(8);
        pavVar = solidSummaryView.imageLoader;
        floatButtonIconComponent3 = solidSummaryView.summaryRouteButton;
        nac nacVar2 = (nac) pavVar.a(floatButtonIconComponent3.getIcon());
        nacVar2.i = new g7t0(solidSummaryView, 8);
        nacVar2.h = new e7t0(solidSummaryView, 3);
        nacVar2.c(agv0Var.b);
        floatButtonIconComponent4 = solidSummaryView.summaryAutolocationButton;
        floatButtonIconComponent4.setVisibility(8);
    }

    @Override // defpackage.m6t0
    public final void d7(SummaryExpandReason summaryExpandReason) {
        eh2 eh2Var;
        boolean isOpened;
        SolidSummaryView solidSummaryView = this.a;
        eh2Var = solidSummaryView.animationDelayHandler;
        Handler handler = solidSummaryView.getHandler();
        isOpened = solidSummaryView.isOpened();
        solidSummaryView.showRequirementsSelectorCallback = eh2Var.a(handler, isOpened, new o7t0(solidSummaryView, summaryExpandReason, 0), 600);
    }

    @Override // defpackage.m6t0
    public final void g5(String str, boolean z) {
        eh2 eh2Var;
        SolidSummaryView solidSummaryView = this.a;
        eh2Var = solidSummaryView.animationDelayHandler;
        solidSummaryView.redirectToPickingRequirementCallback = eh2Var.a(solidSummaryView.getHandler(), z, new epo0(27, solidSummaryView, str), 600);
    }

    @Override // defpackage.m6t0
    public final void h2(SummaryExpandReason summaryExpandReason) {
        this.a.tryExpandToPager(summaryExpandReason);
    }

    @Override // defpackage.m6t0
    public final void i2(g6t0 g6t0Var) {
        f6t0 f6t0Var;
        f6t0Var = this.a.buttonHolder;
        f6t0Var.a(g6t0Var);
    }

    @Override // defpackage.m6t0
    public final void rb(vhv0 vhv0Var) {
        int i;
        int i2;
        int i3;
        boolean z = vhv0Var.a;
        SolidSummaryView solidSummaryView = this.a;
        solidSummaryView.routeTopMargin = z ? 0 : tje.r(rsg0.summary_route_top_margin, solidSummaryView.getContext());
        solidSummaryView.routeBottomMargin = vhv0Var.a ? tje.r(rsg0.summary_route_bottom_margin, solidSummaryView.getContext()) : 0;
        solidSummaryView.addToFavoritesRect = vhv0Var.b;
        int i4 = vhv0Var.c;
        if (i4 > 0) {
            i3 = solidSummaryView.plusTopOffsetPadding;
            i = i3 + i4;
        } else {
            i = 0;
        }
        solidSummaryView.plusTopOffset = i;
        int i5 = vhv0Var.d;
        i2 = solidSummaryView.surgeTopOffsetPadding;
        solidSummaryView.surgeTopOffset = Math.max(i5 - i2, 0);
        solidSummaryView.refreshSummaryMargins();
    }

    @Override // defpackage.m6t0
    public final void t1(String str) {
        boolean z;
        boolean isOpened;
        boolean isCollapsedToSummary;
        jpe jpeVar;
        t7t0 t7t0Var;
        SolidSummaryView solidSummaryView = this.a;
        z = solidSummaryView.summaryOverlapped;
        if (z) {
            return;
        }
        isOpened = solidSummaryView.isOpened();
        if (isOpened) {
            isCollapsedToSummary = solidSummaryView.isCollapsedToSummary();
            if (isCollapsedToSummary) {
                jpeVar = solidSummaryView.cashbackTooltipPopupFactory;
                t7t0Var = solidSummaryView.binding;
                CompositePaymentIconsView compositePaymentIconsView = t7t0Var.n;
                n7t0 n7t0Var = new n7t0(solidSummaryView);
                zgf zgfVar = jpeVar.a;
                zgfVar.getClass();
                d1g d1gVar = (d1g) zgfVar.b;
                n3w a = n3w.a(n7t0Var);
                CoreCashbackAvailableTooltipPopup coreCashbackAvailableTooltipPopup = new CoreCashbackAvailableTooltipPopup((TooltipView) LayoutInflater.from(solidSummaryView.getContext()).inflate(wrh0.summary_cashback_tooltip, (ViewGroup) solidSummaryView, false), new b29((t49) d1gVar.v4.get(), (cba0) d1gVar.w4.get(), (xku0) d1gVar.G0.get(), (n7t0) a.a), str);
                coreCashbackAvailableTooltipPopup.setAnchorView(compositePaymentIconsView);
                avj0 avj0Var = (avj0) jpeVar.b;
                coreCashbackAvailableTooltipPopup.setVerticalOffset(avj0Var.c(mrg0.go_design_m_space));
                coreCashbackAvailableTooltipPopup.setHorizontalOffset(tje.u(10, avj0Var.a));
                coreCashbackAvailableTooltipPopup.setAnchorAlignment(SummaryTooltipAlignment.START);
                coreCashbackAvailableTooltipPopup.setPointerGravity(TooltipPointerDrawer$PointerGravity.START);
                coreCashbackAvailableTooltipPopup.attach();
                coreCashbackAvailableTooltipPopup.showTooltip();
                solidSummaryView.cashbackAvailableTooltipPopup = coreCashbackAvailableTooltipPopup;
            }
        }
    }

    @Override // defpackage.m6t0
    public final void updateBadgeCount(int i) {
        t7t0 t7t0Var;
        t7t0 t7t0Var2;
        t7t0 t7t0Var3;
        t7t0 t7t0Var4;
        SolidSummaryView solidSummaryView = this.a;
        if (i > 0) {
            t7t0Var3 = solidSummaryView.binding;
            t7t0Var3.p.setBadgeText(String.valueOf(i));
            t7t0Var4 = solidSummaryView.binding;
            t7t0Var4.p.setBadgeContentDescription(ru.yandex.taxi.design.utils.c.v(solidSummaryView, dwh0.active_orders_counter_content_description, kyh0.active_orders_counter_one_content_description, i, Integer.valueOf(i)));
            return;
        }
        t7t0Var = solidSummaryView.binding;
        t7t0Var.p.setBadgeText(null);
        t7t0Var2 = solidSummaryView.binding;
        t7t0Var2.p.setBadgeContentDescription(null);
    }

    @Override // defpackage.m6t0
    public final void yf() {
        SolidSummaryView solidSummaryView = this.a;
        Handler handler = solidSummaryView.getHandler();
        g7t0 g7t0Var = new g7t0(solidSummaryView, 6);
        if (handler == null) {
            return;
        }
        handler.postDelayed(new m8t0(28, g7t0Var), 100L);
    }
}
