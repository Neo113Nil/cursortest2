package defpackage;

import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.common.ui.FilterButtonView;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes13.dex */
public final class nn80 implements rn80 {
    public final /* synthetic */ OrganizationsListV2ModalView a;

    public nn80(OrganizationsListV2ModalView organizationsListV2ModalView) {
        this.a = organizationsListV2ModalView;
    }

    @Override // defpackage.rn80
    public final void Bd(boolean z) {
        FilterButtonView organizationsListFilterButtonView;
        organizationsListFilterButtonView = this.a.getOrganizationsListFilterButtonView();
        organizationsListFilterButtonView.setBadgeDotVisible(z);
    }

    @Override // defpackage.rn80
    public final void F6() {
        boolean z;
        MapButtonsView rightSideButtonsContainer;
        OrganizationsListV2ModalView organizationsListV2ModalView = this.a;
        z = organizationsListV2ModalView.isCameraMovedByUser;
        if (z) {
            return;
        }
        organizationsListV2ModalView.isCameraMovedByUser = true;
        rightSideButtonsContainer = organizationsListV2ModalView.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateLocationFocusingButtonVisibility(true);
    }

    @Override // defpackage.rn80
    public final void N8(boolean z) {
        boolean z2;
        Boolean bool;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        AnchorBottomSheetBehavior bottomSheetBehavior2;
        Boolean bool2;
        AnchorBottomSheetBehavior bottomSheetBehavior3;
        AnchorBottomSheetBehavior bottomSheetBehavior4;
        OrganizationsListV2ModalView organizationsListV2ModalView = this.a;
        z2 = organizationsListV2ModalView.isErrorStateVisible;
        if (z2 == z) {
            return;
        }
        organizationsListV2ModalView.isErrorStateVisible = z;
        if (!z) {
            bool = organizationsListV2ModalView.canDragBeforeErrorState;
            if (bool != null) {
                bottomSheetBehavior = organizationsListV2ModalView.getBottomSheetBehavior();
                bottomSheetBehavior.a0 = bool.booleanValue();
            }
            organizationsListV2ModalView.canDragBeforeErrorState = null;
            return;
        }
        bottomSheetBehavior2 = organizationsListV2ModalView.getBottomSheetBehavior();
        bottomSheetBehavior2.O(6);
        bool2 = organizationsListV2ModalView.canDragBeforeErrorState;
        if (bool2 == null) {
            bottomSheetBehavior4 = organizationsListV2ModalView.getBottomSheetBehavior();
            organizationsListV2ModalView.canDragBeforeErrorState = Boolean.valueOf(bottomSheetBehavior4.u());
        }
        bottomSheetBehavior3 = organizationsListV2ModalView.getBottomSheetBehavior();
        bottomSheetBehavior3.a0 = false;
    }

    @Override // defpackage.rn80
    public final void Na() {
        this.a.updateNestedScrollView();
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

    @Override // defpackage.rn80
    public final void ig(boolean z) {
        FilterButtonView organizationsListFilterButtonView;
        FilterButtonView organizationsListFilterButtonView2;
        OrganizationsListV2ModalView organizationsListV2ModalView = this.a;
        organizationsListFilterButtonView = organizationsListV2ModalView.getOrganizationsListFilterButtonView();
        organizationsListFilterButtonView.setFilterButtonEnabled(z);
        organizationsListFilterButtonView2 = organizationsListV2ModalView.getOrganizationsListFilterButtonView();
        organizationsListFilterButtonView2.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.rn80
    public final void renderSearchbar(oec0 oec0Var) {
        this.a.renderSearchbar(oec0Var);
    }

    @Override // defpackage.rn80
    public final void y9() {
        boolean z;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        OrganizationsListV2ModalView organizationsListV2ModalView = this.a;
        z = organizationsListV2ModalView.isErrorStateVisible;
        if (z) {
            return;
        }
        bottomSheetBehavior = organizationsListV2ModalView.getBottomSheetBehavior();
        bottomSheetBehavior.O(4);
    }
}
