package defpackage;

import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.RequestPointStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.automotivenavigation.DrawableUtils;

/* loaded from: classes15.dex */
public final class ea50 implements RequestPointStyleProvider {
    public final /* synthetic */ ga50 a;

    public ea50(ga50 ga50Var) {
        this.a = ga50Var;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RequestPointStyleProvider
    public final void provideStyle(int i, int i2, RequestPointType requestPointType, float f, boolean z, boolean z2, NavigationLayerMode navigationLayerMode, PlacemarkStyle placemarkStyle) {
        placemarkStyle.setImage(DrawableUtils.createImageProvider(this.a.a, 0, true, f / 2.0f, f * 0.8f));
    }
}
