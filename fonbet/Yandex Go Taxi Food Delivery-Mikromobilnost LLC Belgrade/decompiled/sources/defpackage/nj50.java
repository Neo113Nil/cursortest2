package defpackage;

import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.impl.ui.nearby.flex.NearbyFlexModalView;

/* loaded from: classes13.dex */
public final class nj50 implements sj50 {
    public final /* synthetic */ NearbyFlexModalView a;

    public nj50(NearbyFlexModalView nearbyFlexModalView) {
        this.a = nearbyFlexModalView;
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
}
