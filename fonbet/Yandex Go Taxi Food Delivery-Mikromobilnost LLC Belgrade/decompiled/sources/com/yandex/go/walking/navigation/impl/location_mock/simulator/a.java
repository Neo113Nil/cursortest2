package com.yandex.go.walking.navigation.impl.location_mock.simulator;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.LocationSimulator;
import defpackage.bvf0;
import defpackage.el00;
import defpackage.xfs0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final el00 a;
    public LocationSimulator b;
    public Polyline c;
    public double d;
    public final r0 e = bvf0.c(Boolean.FALSE);
    public final xfs0 f = new xfs0(1, this);

    public a(el00 el00Var) {
        this.a = el00Var;
    }

    public final void a() {
        LocationSimulator locationSimulator = this.b;
        if (locationSimulator != null) {
            locationSimulator.unsubscribeFromSimulatorEvents(this.f);
        }
        this.b = null;
        this.c = null;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.a.f(false, new WalkNavMockSimulationManager$resetSimulation$1(2, null));
    }
}
