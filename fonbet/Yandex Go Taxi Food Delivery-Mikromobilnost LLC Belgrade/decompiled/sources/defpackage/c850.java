package defpackage;

import com.yandex.go.navigator.domain.a;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.repository.f;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.RouteChangeReason;
import com.yandex.mapkit.navigation.automotive.SpeedLimitStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c850 extends wds0 {
    public final /* synthetic */ t a;

    public c850(t tVar) {
        this.a = tVar;
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onAlternativesChanged() {
        Guidance guidance;
        t tVar = this.a;
        liq0 liq0Var = tVar.l;
        Navigation navigation = tVar.w;
        liq0Var.a((navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getCurrentRoute());
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onCurrentRouteChanged(RouteChangeReason routeChangeReason) {
        Guidance guidance;
        Guidance guidance2;
        RouteChangeReason routeChangeReason2 = RouteChangeReason.REROUTING;
        t tVar = this.a;
        if (routeChangeReason == routeChangeReason2) {
            i650 i650Var = tVar.c.a;
            i650Var.a.a("navigation.guidance.reroute", n.u(i650Var), 1, new HashMap());
        }
        DrivingRoute drivingRoute = null;
        if (routeChangeReason == RouteChangeReason.FINISH) {
            r0 r0Var = ((a) ((xvf0) ((cb50) tVar.h.get()).c().b).get()).h;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            return;
        }
        Navigation navigation = tVar.w;
        tVar.k.c((navigation == null || (guidance2 = navigation.getGuidance()) == null) ? null : guidance2.getCurrentRoute());
        if (routeChangeReason == routeChangeReason2) {
            com.yandex.go.navigator.settings.debug_panel.domain.a aVar = tVar.q;
            Navigation navigation2 = tVar.w;
            if (navigation2 != null && (guidance = navigation2.getGuidance()) != null) {
                drivingRoute = guidance.getCurrentRoute();
            }
            aVar.a(drivingRoute);
        }
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onLocationChanged() {
        Guidance guidance;
        List<Point> list;
        Point position;
        Guidance guidance2;
        o oVar = this.a.i;
        par parVar = oVar.c;
        f fVar = oVar.a;
        Navigation b = fVar.b();
        if (b == null || (guidance = b.getGuidance()) == null) {
            return;
        }
        Navigation b2 = fVar.b();
        if (b2 != null && (guidance2 = b2.getGuidance()) != null) {
            oVar.c(guidance2);
        }
        if (oVar.b.a()) {
            Location location = guidance.getLocation();
            if (location != null && (position = location.getPosition()) != null) {
                parVar.d.add(position);
            }
            DrivingRoute currentRoute = guidance.getCurrentRoute();
            if (currentRoute != null) {
                parVar.getClass();
                Polyline geometry = currentRoute.getGeometry();
                if (geometry != null) {
                    list = geometry.getPoints();
                    if (parVar.d.isEmpty() || list == null) {
                    }
                    long currentTimeMillis = System.currentTimeMillis() - parVar.f;
                    if (currentTimeMillis < 0) {
                        currentTimeMillis = 0;
                    }
                    if (currentTimeMillis > 60000) {
                        parVar.d = new ArrayList(list);
                        return;
                    }
                    return;
                }
            }
            list = null;
            if (parVar.d.isEmpty()) {
            }
        }
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onReturnedToRoute() {
        i650 i650Var = this.a.c.a;
        i650Var.a.a("navigation.guidance.return_to_route", n.u(i650Var), 1, new HashMap());
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onRoadNameChanged() {
        Guidance guidance;
        t tVar = this.a;
        Navigation navigation = tVar.w;
        String roadName = (navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getRoadName();
        if (roadName == null) {
            roadName = "";
        }
        tVar.e.e = roadName;
        r0 r0Var = tVar.E;
        r0Var.getClass();
        r0Var.m(null, roadName);
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onRouteFinished() {
        r0 r0Var = ((a) ((xvf0) ((cb50) this.a.h.get()).c().b).get()).h;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onRouteLost() {
        i650 i650Var = this.a.c.a;
        i650Var.a.a("navigation.guidance.route_lost", n.u(i650Var), 1, new HashMap());
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onSpeedLimitStatusUpdated() {
        SpeedLimitStatus speedLimitStatus;
        Guidance guidance;
        t tVar = this.a;
        r0 r0Var = tVar.H;
        Navigation navigation = tVar.w;
        if (navigation == null || (guidance = navigation.getGuidance()) == null || (speedLimitStatus = guidance.getSpeedLimitStatus()) == null) {
            speedLimitStatus = SpeedLimitStatus.BELOW_LIMIT;
        }
        r0Var.l(speedLimitStatus);
    }

    @Override // defpackage.wds0, com.yandex.mapkit.navigation.automotive.GuidanceListener
    public final void onSpeedLimitUpdated() {
        Guidance guidance;
        LocalizedValue speedLimit;
        t tVar = this.a;
        r0 r0Var = tVar.G;
        Navigation navigation = tVar.w;
        r0Var.l((navigation == null || (guidance = navigation.getGuidance()) == null || (speedLimit = guidance.getSpeedLimit()) == null) ? null : Double.valueOf(speedLimit.getValue()));
    }
}
