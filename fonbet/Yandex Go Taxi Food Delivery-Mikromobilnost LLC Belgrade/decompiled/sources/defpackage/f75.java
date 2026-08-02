package defpackage;

import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;

/* loaded from: classes13.dex */
public final /* synthetic */ class f75 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePlacesModalView b;

    public /* synthetic */ f75(BasePlacesModalView basePlacesModalView, int i) {
        this.a = i;
        this.b = basePlacesModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int transparentColor_delegate$lambda$0;
        p7c0 expandedTopScrimController_delegate$lambda$0;
        boolean isSlideable_delegate$lambda$0;
        xr00 mapSettings_delegate$lambda$0;
        PlacesMapConfig$RevealingState initialRevealingState_delegate$lambda$0;
        int expandedTopScrimCornerRadius;
        int expandedTopScrimColor;
        int i = this.a;
        BasePlacesModalView basePlacesModalView = this.b;
        switch (i) {
            case 0:
                transparentColor_delegate$lambda$0 = BasePlacesModalView.transparentColor_delegate$lambda$0(basePlacesModalView);
                return Integer.valueOf(transparentColor_delegate$lambda$0);
            case 1:
                expandedTopScrimController_delegate$lambda$0 = BasePlacesModalView.expandedTopScrimController_delegate$lambda$0(basePlacesModalView);
                return expandedTopScrimController_delegate$lambda$0;
            case 2:
                isSlideable_delegate$lambda$0 = BasePlacesModalView.isSlideable_delegate$lambda$0(basePlacesModalView);
                return Boolean.valueOf(isSlideable_delegate$lambda$0);
            case 3:
                mapSettings_delegate$lambda$0 = BasePlacesModalView.mapSettings_delegate$lambda$0(basePlacesModalView);
                return mapSettings_delegate$lambda$0;
            case 4:
                initialRevealingState_delegate$lambda$0 = BasePlacesModalView.initialRevealingState_delegate$lambda$0(basePlacesModalView);
                return initialRevealingState_delegate$lambda$0;
            case 5:
                expandedTopScrimCornerRadius = basePlacesModalView.getExpandedTopScrimCornerRadius();
                return Integer.valueOf(expandedTopScrimCornerRadius);
            default:
                expandedTopScrimColor = basePlacesModalView.getExpandedTopScrimColor();
                return Integer.valueOf(expandedTopScrimColor);
        }
    }
}
