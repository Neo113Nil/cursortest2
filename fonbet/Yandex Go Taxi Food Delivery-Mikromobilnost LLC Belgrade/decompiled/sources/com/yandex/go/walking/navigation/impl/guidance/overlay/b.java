package com.yandex.go.walking.navigation.impl.guidance.overlay;

import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import defpackage.ah00;
import defpackage.e241;
import defpackage.gh00;
import defpackage.i441;
import defpackage.j311;
import defpackage.r8;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes14.dex */
public final class b extends r8 {
    public NavigationLayer A;
    public boolean B;
    public final boolean c;
    public final e241 w;
    public final k x;
    public final j311 y;
    public final i441 z;

    public b(ah00 ah00Var, boolean z, e241 e241Var, k kVar, j311 j311Var, i441 i441Var) {
        super(5, ah00Var);
        this.c = z;
        this.w = e241Var;
        this.x = kVar;
        this.y = j311Var;
        this.z = i441Var;
    }

    public final void attach() {
        ((gh00) ((ah00) this.b)).I(true);
        boolean z = this.c;
        e241 e241Var = this.w;
        if (z) {
            a aVar = new a(this);
            e241Var.Bg(aVar);
            com.yandex.go.coroutines.b.g(e241Var.Jg(), null, null, new WalkNavGuidanceOverlayPresenter$attachViewForOverview$1(e241Var, aVar, null), 3);
        } else {
            a aVar2 = new a(this);
            e241Var.Bg(aVar2);
            com.yandex.go.coroutines.b.g(e241Var.Jg(), null, null, new WalkNavGuidanceOverlayPresenter$attachView$1(e241Var, aVar2, null), 3);
        }
    }

    public final void detach() {
        MapWindow mapWindow;
        Map map;
        ah00 ah00Var = (ah00) this.b;
        this.w.Cg();
        boolean z = this.B;
        TaxiMapView h = ((gh00) ah00Var).h();
        if (h != null && (mapWindow = h.getMapWindow()) != null && (map = mapWindow.getMap()) != null) {
            map.setIndoorEnabled(z);
        }
        if (!this.c) {
            k kVar = this.x;
            gh00 gh00Var = (gh00) kVar.c;
            gh00Var.x(null);
            kVar.g.b();
            gh00Var.u(kVar.k);
            Camera camera = kVar.h;
            if (camera != null) {
                camera.removeListener(kVar.j);
            }
            kVar.h = null;
        }
        NavigationLayer navigationLayer = this.A;
        if (navigationLayer != null) {
            navigationLayer.removeFromMap();
        }
        this.A = null;
        gh00 gh00Var2 = (gh00) ah00Var;
        gh00Var2.I(false);
        gh00Var2.v();
    }
}
