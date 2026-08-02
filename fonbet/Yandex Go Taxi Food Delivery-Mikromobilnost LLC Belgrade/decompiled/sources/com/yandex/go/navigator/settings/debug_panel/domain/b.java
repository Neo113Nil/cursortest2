package com.yandex.go.navigator.settings.debug_panel.domain;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.LocationSettings;
import com.yandex.mapkit.location.LocationSettingsFactory;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.SimulationSettings;
import defpackage.bvf0;
import defpackage.el00;
import defpackage.xfs0;
import java.util.Collections;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes12.dex */
public final class b {
    public final el00 a;
    public LocationSimulator b;
    public Polyline c;
    public double d;
    public final r0 e = bvf0.c(Boolean.FALSE);
    public final xfs0 f = new xfs0(0, this);

    public b(el00 el00Var) {
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
        this.a.f(false, new SimulationManager$resetSimulation$1(2, null));
    }

    public final void b() {
        LocationSimulator locationSimulator = this.b;
        if (locationSimulator != null) {
            locationSimulator.resume();
            LocationSettings coarseSettings = !el00.a ? null : LocationSettingsFactory.coarseSettings();
            if (coarseSettings != null) {
                coarseSettings.setSpeed(this.d);
                SimulationSettings q = k.q(this.c, coarseSettings);
                if (q != null) {
                    locationSimulator.setSettings(Collections.singletonList(q));
                }
            }
        }
        r0 r0Var = this.e;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
