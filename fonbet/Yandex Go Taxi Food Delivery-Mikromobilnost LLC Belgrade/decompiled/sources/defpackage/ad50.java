package defpackage;

import com.yandex.go.navigator.ui.b;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;

/* loaded from: classes12.dex */
public final class ad50 implements yc50 {
    public final yh00 a;
    public final /* synthetic */ b b;

    public ad50(b bVar) {
        this.b = bVar;
        this.a = new yh00(2, bVar, this);
    }

    @Override // defpackage.yc50
    public final void B5() {
        b bVar = this.b;
        NavigationLayer navigationLayer = bVar.I;
        if (navigationLayer == null) {
            return;
        }
        bVar.C.b(navigationLayer);
        NavigationLayer navigationLayer2 = bVar.I;
        if (navigationLayer2 != null) {
            navigationLayer2.removeBalloonViewListener(bVar.J);
        }
        NavigationLayer navigationLayer3 = bVar.I;
        if (navigationLayer3 != null) {
            navigationLayer3.removePlacemarkTapListener(bVar.F);
        }
        NavigationLayer navigationLayer4 = bVar.I;
        if (navigationLayer4 != null) {
            navigationLayer4.deselectRoadEvent();
        }
        NavigationLayer navigationLayer5 = bVar.I;
        if (navigationLayer5 != null) {
            navigationLayer5.removeFromMap();
        }
        bVar.I = null;
    }

    @Override // defpackage.yc50
    public final void V0(CameraMode cameraMode) {
        Camera camera;
        NavigationLayer navigationLayer = this.b.I;
        if (navigationLayer == null || (camera = navigationLayer.getCamera()) == null) {
            return;
        }
        camera.setCameraMode(cameraMode, b.L);
    }

    @Override // defpackage.yc50
    public final void ga(Navigation navigation) {
        b bVar = this.b;
        if (bVar.I != null) {
            B5();
        }
        ((gh00) ((ah00) bVar.b)).q(new th40(2, bVar, this, navigation));
        bVar.c.getWindow().addFlags(128);
    }

    @Override // defpackage.yc50
    public final void j2() {
        b bVar = this.b;
        gh00 gh00Var = (gh00) ((ah00) bVar.b);
        gh00Var.H(new CameraPosition(gh00Var.e.c.getTarget(), ((gh00) ((ah00) bVar.b)).e.c.getZoom(), 0.0f, 0.0f));
        gh00Var.I(false);
        gh00Var.u(this.a);
        this.b.c.getWindow().clearFlags(128);
    }

    @Override // defpackage.yc50
    public final void q6(boolean z) {
        this.b.y.b(new yce(z, 13), true);
    }

    @Override // defpackage.yc50
    public final void refreshStyle() {
        NavigationLayer navigationLayer = this.b.I;
        if (navigationLayer != null) {
            navigationLayer.refreshStyle();
        }
    }

    @Override // defpackage.yc50
    public final void selectRoadEvent(String str) {
        zy11 zy11Var;
        b bVar = this.b;
        if (str != null) {
            NavigationLayer navigationLayer = bVar.I;
            if (navigationLayer != null) {
                navigationLayer.selectRoadEvent(str);
                zy11Var = zy11.a;
            } else {
                zy11Var = null;
            }
            if (zy11Var != null) {
                return;
            }
        }
        NavigationLayer navigationLayer2 = bVar.I;
        if (navigationLayer2 != null) {
            navigationLayer2.deselectRoadEvent();
        }
    }

    @Override // defpackage.yc50
    public final void v1(DrivingRoute drivingRoute) {
        NavigationLayer navigationLayer = this.b.I;
        if (navigationLayer == null || navigationLayer.getMode() != NavigationLayerMode.ROUTE_SELECTION) {
            return;
        }
        navigationLayer.selectRoute(drivingRoute != null ? navigationLayer.getView(drivingRoute) : null);
    }
}
