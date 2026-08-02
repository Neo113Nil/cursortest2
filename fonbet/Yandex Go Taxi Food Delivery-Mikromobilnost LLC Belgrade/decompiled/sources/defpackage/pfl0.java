package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import com.yandex.mapkit.navigation.automotive.layer.RouteView;
import com.yandex.mapkit.navigation.automotive.layer.RouteViewListener;

/* loaded from: classes7.dex */
public final class pfl0 implements RouteViewListener, wa50 {
    public final tzw0 a;

    public pfl0(tzw0 tzw0Var) {
        this.a = tzw0Var;
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void a(NavigationLayer navigationLayer) {
        if (navigationLayer != null) {
            navigationLayer.addRouteViewListener(this);
        }
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void b(NavigationLayer navigationLayer) {
        if (navigationLayer != null) {
            navigationLayer.removeRouteViewListener(this);
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteViewListener
    public final void onRouteViewTap(RouteView routeView) {
        this.a.a(routeView.getRoute());
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteViewListener
    public final void onRouteViewsChanged() {
    }
}
