package defpackage;

import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.organization.card.impl.domain.entities.card.OrganizationCardPageLoadingState;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardPageView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.a;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.OrganizationCardBottomPanelView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;
import java.util.ArrayList;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes13.dex */
public final class ih80 implements nh80 {
    public final /* synthetic */ OrganizationCardsSliderModalView a;

    public ih80(OrganizationCardsSliderModalView organizationCardsSliderModalView) {
        this.a = organizationCardsSliderModalView;
    }

    @Override // defpackage.nh80
    public final void Be(th80 th80Var) {
        a aVar;
        a aVar2;
        a aVar3;
        int i = th80Var.f;
        int i2 = th80Var.d;
        int i3 = th80Var.e;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        if (i > 0) {
            aVar3 = organizationCardsSliderModalView.adapter;
            aVar3.notifyItemRangeRemoved(th80Var.c + 1, i);
        }
        if (i3 > 0) {
            aVar2 = organizationCardsSliderModalView.adapter;
            aVar2.notifyItemRangeRemoved(0, i3);
        }
        if (i2 > 0) {
            aVar = organizationCardsSliderModalView.adapter;
            aVar.notifyItemRangeInserted(th80Var.b + 1, i2);
        }
        organizationCardsSliderModalView.updateNestedScrollView();
    }

    @Override // defpackage.nh80
    public final void E5(c9c0 c9c0Var) {
        ze80 ze80Var;
        ze80Var = this.a.navigator;
        ve80 ve80Var = (ve80) ze80Var;
        if (ve80Var.a.u()) {
            xe80 xe80Var = ve80Var.a;
            if (xe80Var.z) {
                return;
            }
            xe80Var.E(c9c0Var, zy11.a, new mo30(10, xe80Var), hxx.a);
        }
    }

    @Override // defpackage.nh80
    public final void Ja(rg80 rg80Var, be6 be6Var) {
        a aVar;
        boolean z;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        aVar = organizationCardsSliderModalView.adapter;
        OrganizationCardPageView j = aVar.j(rg80Var);
        if (j == null) {
            return;
        }
        ArrayList arrayList = be6Var != null ? be6Var.a : null;
        if (arrayList == null || arrayList.isEmpty()) {
            if ((be6Var != null ? be6Var.b : null) == null) {
                j.setBottomPanel(null);
                return;
            }
        }
        OrganizationCardBottomPanelView bottomPanel = j.getBottomPanel();
        if (bottomPanel != null) {
            z = organizationCardsSliderModalView.currentBottomPanelUltimaMode;
            bottomPanel.setUltimaMode(z);
            bottomPanel.setContent(be6Var);
        }
        organizationCardsSliderModalView.applyBottomPanelPadding(j);
    }

    @Override // defpackage.nh80
    public final void Pb(int i) {
        a aVar;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        aVar = organizationCardsSliderModalView.adapter;
        aVar.notifyItemRangeInserted(1, i);
        organizationCardsSliderModalView.updateNestedScrollView();
    }

    @Override // defpackage.nh80
    public final void Tf(boolean z) {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        bottomSheetBehavior = this.a.getBottomSheetBehavior();
        bottomSheetBehavior.O(z ? 3 : 6);
    }

    @Override // defpackage.nh80
    public final void Va() {
        this.a.updateNestedScrollView();
    }

    @Override // defpackage.nh80
    public final void Xc(boolean z) {
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        organizationCardsSliderModalView.currentBottomPanelUltimaMode = z;
        OrganizationCardsSliderModalView.applyStateToVisibleCards$default(organizationCardsSliderModalView, false, new yce(z, 15), 1, null);
    }

    @Override // defpackage.nh80
    public final void a() {
        ze80 ze80Var;
        ze80Var = this.a.navigator;
        ((ve80) ze80Var).a.r(new qu(9));
    }

    @Override // defpackage.e75
    public final void b(float f, boolean z) {
        MapButtonsView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateCompassButton(z, f);
    }

    @Override // defpackage.e75
    public final void c(boolean z) {
        MapButtonsView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateLocationFocusingButton(z);
    }

    @Override // defpackage.nh80
    public final void gb(sls slsVar) {
        this.a.backPressedHandler = slsVar;
    }

    @Override // defpackage.nh80
    public final boolean ka() {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        gh80 gh80Var = OrganizationCardsSliderModalView.Companion;
        bottomSheetBehavior = this.a.getBottomSheetBehavior();
        return gh80.a(gh80Var, bottomSheetBehavior);
    }

    @Override // defpackage.nh80
    public final void p1() {
        a aVar;
        aVar = this.a.adapter;
        aVar.l(0);
    }

    @Override // defpackage.nh80
    public final void setDraggable(boolean z) {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        bottomSheetBehavior = this.a.getBottomSheetBehavior();
        bottomSheetBehavior.a0 = z;
    }

    @Override // defpackage.nh80
    public final void va() {
        a aVar;
        a aVar2;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        aVar = organizationCardsSliderModalView.adapter;
        g gVar = aVar.c;
        aVar.A = gVar.Z.size() > 0 ? ((ne80) gVar.Z.get(0)).a : null;
        aVar2 = organizationCardsSliderModalView.adapter;
        aVar2.notifyDataSetChanged();
        OrganizationCardsSliderModalView.access$getBinding(organizationCardsSliderModalView).b.setCurrentItem(0, false);
        organizationCardsSliderModalView.updateNestedScrollView();
    }

    @Override // defpackage.nh80
    public final void yb() {
        OrganizationCardsSliderModalView.access$getBinding(this.a).b.setCurrentItem(0, true);
    }

    @Override // defpackage.nh80
    public final void yd(rg80 rg80Var, OrganizationCardPageLoadingState organizationCardPageLoadingState) {
        a aVar;
        boolean shouldUseNativeShimmer;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        aVar = organizationCardsSliderModalView.adapter;
        OrganizationCardPageView j = aVar.j(rg80Var);
        if (j == null) {
            return;
        }
        int i = hh80.a[organizationCardPageLoadingState.ordinal()];
        if (i == 1) {
            shouldUseNativeShimmer = organizationCardsSliderModalView.shouldUseNativeShimmer();
            if (shouldUseNativeShimmer) {
                j.setLoadingShimmerVisible(true);
            }
            organizationCardsSliderModalView.showBottomPanelLoadingShimmer(j);
            return;
        }
        if (i != 2 && i != 3) {
            w511.b();
            return;
        }
        j.setLoadingShimmerVisible(false);
        OrganizationCardBottomPanelView bottomPanel = j.getBottomPanel();
        if (bottomPanel != null) {
            bottomPanel.setShimmering(false);
        }
    }
}
