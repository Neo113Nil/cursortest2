package com.yandex.go.navigator.settings.debug_panel.domain;

import com.yandex.go.navigator.repository.f;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.location.LocationSettings;
import com.yandex.mapkit.location.LocationSettingsFactory;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.SimulationSettings;
import defpackage.df50;
import defpackage.el00;
import defpackage.hb50;
import defpackage.rcc;
import defpackage.scc;
import java.util.Collections;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes12.dex */
public final class a {
    public final df50 a;
    public final hb50 b;
    public final b c;
    public final f d;

    public a(df50 df50Var, hb50 hb50Var, b bVar, f fVar) {
        this.a = df50Var;
        this.b = hb50Var;
        this.c = bVar;
        this.d = fVar;
    }

    public final void a(DrivingRoute drivingRoute) {
        Polyline geometry;
        LocationSimulator locationSimulator;
        b bVar = this.c;
        df50 df50Var = this.a;
        if (drivingRoute == null || !this.b.a.isEnabled() || !((Boolean) df50Var.c.getValue()).booleanValue()) {
            this.c.a();
            return;
        }
        double doubleValue = ((Number) df50Var.a.getValue()).doubleValue();
        bVar.d = doubleValue;
        LocationSettings coarseSettings = !el00.a ? null : LocationSettingsFactory.coarseSettings();
        if (coarseSettings != null) {
            coarseSettings.setSpeed(doubleValue);
            SimulationSettings q = k.q(bVar.c, coarseSettings);
            if (q != null && (locationSimulator = bVar.b) != null) {
                locationSimulator.setSettings(Collections.singletonList(q));
            }
        }
        if (bVar.b != null) {
            bVar.a();
        }
        PolylinePosition positionOnRoute = drivingRoute.getRoutePosition().positionOnRoute(drivingRoute.getRouteId());
        Integer valueOf = positionOnRoute != null ? Integer.valueOf(positionOnRoute.getSegmentIndex()) : null;
        if (valueOf != null) {
            ListBuilder a = rcc.a();
            int i = 0;
            for (Object obj : drivingRoute.getGeometry().getPoints()) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                Point point = (Point) obj;
                if (i >= valueOf.intValue()) {
                    a.add(point);
                }
                i = i2;
            }
            geometry = k.l(a.j());
        } else {
            geometry = drivingRoute.getGeometry();
        }
        bVar.c = geometry;
        bVar.a.f(true, new SimulationManager$startSimulation$2(bVar, null));
    }
}
