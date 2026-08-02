package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.flex.container.ui.PlacesFlexContainerScreenView;

/* loaded from: classes13.dex */
public final class l8c0 implements zo31 {
    public final PlacesFlexContainerScreenView a;
    public final GoFrameLayout b;

    public l8c0(PlacesFlexContainerScreenView placesFlexContainerScreenView, GoFrameLayout goFrameLayout) {
        this.a = placesFlexContainerScreenView;
        this.b = goFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
