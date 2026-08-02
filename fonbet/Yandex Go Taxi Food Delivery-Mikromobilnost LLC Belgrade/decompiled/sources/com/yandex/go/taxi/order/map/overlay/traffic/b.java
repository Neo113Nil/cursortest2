package com.yandex.go.taxi.order.map.overlay.traffic;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.automotive.TrafficLightsController;
import com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal;
import defpackage.a901;
import defpackage.b901;
import defpackage.bvf0;
import defpackage.c901;
import defpackage.d901;
import defpackage.ffx;
import defpackage.g901;
import defpackage.jqr;
import defpackage.tse;
import defpackage.w511;
import defpackage.zjy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class b {
    public final d901 a;
    public final r0 b;
    public final r0 c;
    public String d;
    public boolean e;
    public PolylinePosition f;
    public final n0 g;

    public b(d901 d901Var) {
        this.a = d901Var;
        r0 c = bvf0.c(EmptyList.a);
        this.b = c;
        this.c = c;
        this.g = ffx.c(0, 1, null, 5);
    }

    public final void a(tse tseVar, int i) {
        TrafficLightsController trafficLightsController;
        if (this.e) {
            return;
        }
        d901 d901Var = this.a;
        TrafficLightsController trafficLightsController2 = d901Var.b;
        if (trafficLightsController2 != null) {
            trafficLightsController2.setMaxNumberOfUpcomingTrafficLights(i);
        }
        g901 g901Var = new g901(this, 0);
        g901 g901Var2 = new g901(this, 1);
        c901 c901Var = d901Var.c;
        if (c901Var != null && (trafficLightsController = d901Var.b) != null) {
            trafficLightsController.removeListener(c901Var);
        }
        d901Var.c = null;
        d901Var.a.b(new zjy0(7, d901Var, g901Var, g901Var2), true);
        this.e = true;
        e.H(tseVar, new jqr(e.p(this.g, 300L), new TrafficLightsWithSignalInteractor$startObservingTrafficLights$3(this, null), 3));
    }

    public final void b() {
        TrafficLightsController trafficLightsController;
        if (this.e) {
            this.e = false;
            this.d = null;
            this.f = null;
            d901 d901Var = this.a;
            c901 c901Var = d901Var.c;
            if (c901Var != null && (trafficLightsController = d901Var.b) != null) {
                trafficLightsController.removeListener(c901Var);
            }
            d901Var.c = null;
            r0 r0Var = this.b;
            r0Var.getClass();
            r0Var.m(null, EmptyList.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public final void c() {
        ?? r4;
        List<UpcomingTrafficLightWithSignal> trafficLightsWithSignal;
        a901 a901Var;
        TrafficLightWithSignal$Signal trafficLightWithSignal$Signal;
        String str = this.d;
        if (str == null) {
            return;
        }
        PolylinePosition polylinePosition = this.f;
        TrafficLightsController trafficLightsController = this.a.b;
        if (trafficLightsController == null || (trafficLightsWithSignal = trafficLightsController.getTrafficLightsWithSignal()) == null) {
            r4 = 0;
        } else {
            r4 = new ArrayList();
            for (UpcomingTrafficLightWithSignal upcomingTrafficLightWithSignal : trafficLightsWithSignal) {
                PolylinePosition positionOnRoute = upcomingTrafficLightWithSignal.getPosition().positionOnRoute(str);
                if (positionOnRoute != null) {
                    int i = b901.a[upcomingTrafficLightWithSignal.getSignal().ordinal()];
                    if (i == 1) {
                        trafficLightWithSignal$Signal = TrafficLightWithSignal$Signal.GREEN;
                    } else {
                        if (i != 2 && i != 3 && i != 4) {
                            w511.b();
                            return;
                        }
                        trafficLightWithSignal$Signal = TrafficLightWithSignal$Signal.RED;
                    }
                    a901Var = new a901(trafficLightWithSignal$Signal, upcomingTrafficLightWithSignal.getPosition().getPoint(), upcomingTrafficLightWithSignal.getSecondsLeft(), positionOnRoute);
                } else {
                    a901Var = null;
                }
                if (a901Var != null) {
                    r4.add(a901Var);
                }
            }
        }
        if (r4 == 0) {
            r4 = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) r4) {
            PolylinePosition polylinePosition2 = ((a901) obj).d;
            if (polylinePosition2 != null && (polylinePosition == null || polylinePosition.getSegmentIndex() < polylinePosition2.getSegmentIndex() || (polylinePosition.getSegmentIndex() == polylinePosition2.getSegmentIndex() && polylinePosition.getSegmentPosition() < polylinePosition2.getSegmentPosition()))) {
                arrayList.add(obj);
            }
        }
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, arrayList);
    }
}
