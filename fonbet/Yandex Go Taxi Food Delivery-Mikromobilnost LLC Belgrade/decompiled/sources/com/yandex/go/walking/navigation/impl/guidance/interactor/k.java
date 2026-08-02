package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$start$1;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.GuidanceMode;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.a341;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.dib1;
import defpackage.fi6;
import defpackage.g4u;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.ist;
import defpackage.jst;
import defpackage.o400;
import defpackage.oo21;
import defpackage.q141;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import java.util.Objects;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class k {
    public final a341 a;
    public final com.yandex.go.walking.navigation.impl.navigation_core.b b;
    public final ah00 c;
    public final a3v d;
    public final tt2 e;
    public Camera h;
    public final tpr m;
    public final tpr n;
    public final ist f = jst.e.A("WALKING_NAVIGATION:GUIDANCE_CAMERA_INTERACTOR");
    public final hbp0 g = new hbp0(new czo0(14), "WalkNavGuidanceCameraInteractor", null);
    public final r0 i = bvf0.c(CameraMode.FOLLOWING);
    public final g4u j = new g4u(1, this);
    public final oo21 k = new oo21(2, this);
    public final Animation l = new Animation(Animation.Type.SMOOTH, 0.5f);

    public k(a341 a341Var, com.yandex.go.walking.navigation.impl.navigation_core.b bVar, ah00 ah00Var, a3v a3vVar, tt2 tt2Var) {
        Guidance guidance;
        this.a = a341Var;
        this.b = bVar;
        this.c = ah00Var;
        this.d = a3vVar;
        this.e = tt2Var;
        this.m = kotlinx.coroutines.flow.e.t(new h(a341Var.d));
        com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.b bVar2 = new com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.b(a341Var.a.i, a341Var);
        Navigation navigation = a341Var.b.c;
        this.n = kotlinx.coroutines.flow.e.t(new j(com.yandex.go.coroutines.b.d(bVar2, new WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$start$1((navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getGuidanceMode(), null))));
    }

    public static final tpr a(k kVar) {
        tpr t = kotlinx.coroutines.flow.e.t(new b(dib1.c(kVar.c)));
        tpr b = kVar.a.b();
        kVar.e.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(new m0(t, new d(kotlinx.coroutines.flow.e.F(b, o400.a)), new WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1(kVar, null))), uyj.a);
    }

    public final void b(Camera camera) {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        this.h = camera;
        camera.setSwitchModesAutomatically(false);
        camera.addListener(this.j);
        oo21 oo21Var = this.k;
        ah00 ah00Var = this.c;
        ((gh00) ah00Var).e(oo21Var);
        tpr t = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(dib1.c(ah00Var), new WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1(3, null)), new WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$$inlined$start$1(Boolean.FALSE, null)));
        WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1 walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1 = new WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1(this, null);
        tpr tprVar = this.n;
        com.yandex.go.coroutines.b.h(hbp0Var, kotlinx.coroutines.flow.e.n(tprVar, t, this.m, walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1));
        tje.N(hbp0Var, null, null, new WalkNavGuidanceCameraInteractor$dispatchAutoIndoor$$inlined$safeCollectIn$1(new f(tprVar), null, this), 3);
    }

    public final void c(FocusAction focusAction) {
        Route currentRoute;
        Polyline geometry;
        Location location;
        Point position;
        Guidance guidance;
        Camera camera = this.h;
        if (camera == null) {
            return;
        }
        ist istVar = this.f;
        Objects.toString(focusAction);
        istVar.getClass();
        int i = q141.a[focusAction.ordinal()];
        if (i == 1) {
            d();
            Navigation navigation = this.b.c;
            Guidance guidance2 = navigation != null ? navigation.getGuidance() : null;
            if (guidance2 == null || (currentRoute = guidance2.getCurrentRoute()) == null || (geometry = currentRoute.getGeometry()) == null) {
                return;
            }
            fi6 fi6Var = new fi6();
            fi6Var.d(geometry);
            ((gh00) this.c).A(fi6Var.g(), null);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        Navigation navigation2 = this.a.b.c;
        if (((navigation2 == null || (guidance = navigation2.getGuidance()) == null) ? null : guidance.getGuidanceMode()) != GuidanceMode.INDOOR) {
            Navigation navigation3 = this.b.c;
            Guidance guidance3 = navigation3 != null ? navigation3.getGuidance() : null;
            if ((guidance3 != null ? guidance3.getCurrentRoute() : null) != null) {
                e(camera);
                return;
            }
        }
        d();
        Navigation navigation4 = this.b.c;
        Guidance guidance4 = navigation4 != null ? navigation4.getGuidance() : null;
        if (guidance4 == null || (location = guidance4.getLocation()) == null || (position = location.getPosition()) == null) {
            return;
        }
        gh00 gh00Var = (gh00) this.c;
        gh00Var.g.k(new CameraPosition(position, 18.0f, gh00Var.e.c.getAzimuth(), gh00Var.e.c.getTilt()), 500.0f, Animation.Type.SMOOTH, null);
    }

    public final void d() {
        Camera camera;
        Guidance guidance;
        Navigation navigation = this.a.b.c;
        if (((navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getGuidanceMode()) == GuidanceMode.INDOOR) {
            return;
        }
        Camera camera2 = this.h;
        CameraMode cameraMode = camera2 != null ? camera2.cameraMode() : null;
        CameraMode cameraMode2 = CameraMode.FREE;
        if (cameraMode == cameraMode2 || (camera = this.h) == null) {
            return;
        }
        camera.setCameraMode(cameraMode2, null);
    }

    public final void e(Camera camera) {
        camera.setCameraMode(CameraMode.FOLLOWING, this.l);
        gh00 gh00Var = (gh00) this.c;
        if (gh00Var.h() == null) {
            return;
        }
        gh00Var.x(new ScreenPoint(r0.getWidth() / 2.0f, (r0.getHeight() - this.d.Gf().height()) - tje.u(60, r0.getContext())));
    }
}
