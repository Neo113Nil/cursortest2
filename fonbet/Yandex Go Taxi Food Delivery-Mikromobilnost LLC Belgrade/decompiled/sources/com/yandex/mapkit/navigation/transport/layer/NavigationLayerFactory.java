package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.transport.Navigation;

/* loaded from: classes6.dex */
public class NavigationLayerFactory {
    @Deprecated
    public static native NavigationLayer createCustomNavigationLayer(MapWindow mapWindow, MapObjectCollection mapObjectCollection, MapObjectCollection mapObjectCollection2, StyleProvider styleProvider, Navigation navigation, NavigationLayerSettings navigationLayerSettings);

    public static native NavigationLayer createNavigationLayer(MapWindow mapWindow, StyleProvider styleProvider, Navigation navigation);

    public static native NavigationLayer createNavigationLayer(MapWindow mapWindow, StyleProvider styleProvider, Navigation navigation, NavigationLayerSettings navigationLayerSettings);
}
