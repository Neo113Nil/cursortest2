package com.yandex.mapkit.navigation.transport.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.NavigationListener;
import com.yandex.mapkit.navigation.transport.TransportOptions;
import com.yandex.mapkit.navigation.transport.Type;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes7.dex */
public class NavigationBinding implements Navigation {
    private final NativeObject nativeObject;
    protected Subscription<NavigationListener> navigationListenerSubscription = new Subscription<NavigationListener>(this) { // from class: com.yandex.mapkit.navigation.transport.internal.NavigationBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(NavigationListener navigationListener) {
            return NavigationBinding.createNavigationListener(navigationListener);
        }
    };

    public NavigationBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createNavigationListener(NavigationListener navigationListener);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void addListener(NavigationListener navigationListener);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void cancelRequest();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native Guidance getGuidance();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native RouteOptions getRouteOptions();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native List<Route> getRoutes();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native Type getType();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void removeListener(NavigationListener navigationListener);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void requestRoutes(List<RequestPoint> list, TransportOptions transportOptions);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void resetRoutes();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void resolveUri(String str);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void resume();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void setRouteOptions(RouteOptions routeOptions);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void startGuidance(Route route);

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void stopGuidance();

    @Override // com.yandex.mapkit.navigation.transport.Navigation
    public native void suspend();
}
