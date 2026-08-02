package defpackage;

import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.widget.ArrowsView;

/* loaded from: classes6.dex */
public final class ox30 implements hx30 {
    public final /* synthetic */ MtRoutesModalView a;

    public ox30(MtRoutesModalView mtRoutesModalView) {
        this.a = mtRoutesModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        FloatButtonIconComponent floatButtonIconComponent;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        AnchorBottomSheetBehavior bottomSheetBehavior2;
        ArrowsView arrowsView;
        lx30 lx30Var = (lx30) obj;
        MtRoutesModalView mtRoutesModalView = this.a;
        floatButtonIconComponent = mtRoutesModalView.focusRouteButton;
        boolean z = lx30Var.b;
        boolean z2 = lx30Var.a;
        floatButtonIconComponent.setVisibility(z ? 0 : 8);
        bottomSheetBehavior = mtRoutesModalView.getBottomSheetBehavior();
        bottomSheetBehavior.a0 = z2;
        bottomSheetBehavior2 = mtRoutesModalView.getBottomSheetBehavior();
        bottomSheetBehavior2.V = z2;
        arrowsView = mtRoutesModalView.arrowsView;
        arrowsView.setVisibility(z2 ? 0 : 8);
        mtRoutesModalView.updateBadgeCount(lx30Var.c);
    }
}
