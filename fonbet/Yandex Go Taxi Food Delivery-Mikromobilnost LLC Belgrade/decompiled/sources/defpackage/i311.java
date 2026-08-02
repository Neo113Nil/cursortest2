package defpackage;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayerFactory;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayerSettings;
import com.yandex.mapkit.navigation.transport.layer.StyleProvider;

/* loaded from: classes6.dex */
public final class i311 extends t35 {
    public final MapWindow d;
    public final StyleProvider e;
    public final Navigation f;
    public final NavigationLayerSettings g;

    public i311(MapWindow mapWindow, StyleProvider styleProvider, Navigation navigation, NavigationLayerSettings navigationLayerSettings) {
        this.d = mapWindow;
        this.e = styleProvider;
        this.f = navigation;
        this.g = navigationLayerSettings;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        if (!el00.a) {
            ny61.r("MapKit is not initialized");
            return;
        }
        if (!el00.a) {
            ny61.r("MapKit is not initialized");
            return;
        }
        NavigationLayerSettings navigationLayerSettings = this.g;
        MapWindow mapWindow = this.d;
        StyleProvider styleProvider = this.e;
        Navigation navigation = this.f;
        j24Var.invoke(navigationLayerSettings == null ? NavigationLayerFactory.createNavigationLayer(mapWindow, styleProvider, navigation) : NavigationLayerFactory.createNavigationLayer(mapWindow, styleProvider, navigation, navigationLayerSettings));
    }
}
