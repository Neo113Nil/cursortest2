package com.yandex.mapkit.navigation.transport.layer.internal;

import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import com.yandex.mapkit.navigation.transport.layer.RequestPointViewListener;
import com.yandex.mapkit.navigation.transport.layer.RouteView;
import com.yandex.mapkit.navigation.transport.layer.RouteViewListener;
import com.yandex.mapkit.navigation.transport.layer.RoutesSource;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class NavigationLayerBinding implements NavigationLayer {
    private final NativeObject nativeObject;
    protected Subscription<RequestPointViewListener> requestPointViewListenerSubscription = new Subscription<RequestPointViewListener>(this) { // from class: com.yandex.mapkit.navigation.transport.layer.internal.NavigationLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RequestPointViewListener requestPointViewListener) {
            return NavigationLayerBinding.createRequestPointViewListener(requestPointViewListener);
        }
    };
    protected Subscription<RouteViewListener> routeViewListenerSubscription = new Subscription<RouteViewListener>(this) { // from class: com.yandex.mapkit.navigation.transport.layer.internal.NavigationLayerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RouteViewListener routeViewListener) {
            return NavigationLayerBinding.createRouteViewListener(routeViewListener);
        }
    };
    protected Subscription<BalloonViewListener> balloonViewListenerSubscription = new Subscription<BalloonViewListener>(this) { // from class: com.yandex.mapkit.navigation.transport.layer.internal.NavigationLayerBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(BalloonViewListener balloonViewListener) {
            return NavigationLayerBinding.createBalloonViewListener(balloonViewListener);
        }
    };

    public NavigationLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createBalloonViewListener(BalloonViewListener balloonViewListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRequestPointViewListener(RequestPointViewListener requestPointViewListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRouteViewListener(RouteViewListener routeViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void addBalloonViewListener(BalloonViewListener balloonViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void addRequestPointViewListener(RequestPointViewListener requestPointViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void addRouteListener(RouteViewListener routeViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void deselectRequestPoint();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native String getBalloonsLayerId();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native String getBaseLayerId();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native Camera getCamera();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native Navigation getNavigation();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native List<RouteView> getRoutes();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native RoutesSource getRoutesSource();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native RouteView getView(Route route);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native boolean isIsVisible();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native boolean isShowBalloons();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native boolean isShowRequestPoints();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void refreshStyle();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void removeBalloonViewListener(BalloonViewListener balloonViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void removeFromMap();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void removeRequestPointViewListener(RequestPointViewListener requestPointViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void removeRouteListener(RouteViewListener routeViewListener);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void selectRequestPoint(int i);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void selectRoute(RouteView routeView);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native RouteView selectedRoute();

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void setIsVisible(boolean z);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void setShowBalloons(boolean z);

    @Override // com.yandex.mapkit.navigation.transport.layer.NavigationLayer
    public native void setShowRequestPoints(boolean z);
}
