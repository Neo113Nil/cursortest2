package com.yandex.go.scooters.passes.super_pass.grace.state_bar;

import com.yandex.go.scooters.passes.super_pass.experiments.ScootersSuperPassGracePeriodExperiment;
import defpackage.d3a;
import defpackage.ehn0;
import defpackage.g0p0;
import defpackage.h0p0;
import defpackage.h55;
import defpackage.hwo0;
import defpackage.ivo0;
import defpackage.j0p0;
import defpackage.k0p0;
import defpackage.krl0;
import defpackage.t3u0;
import defpackage.tje;
import defpackage.u3u0;
import defpackage.xdf;
import defpackage.xvf0;
import defpackage.yvf0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final h0p0 E;
    public final k0p0 F;
    public krl0 G;

    public a(yvf0 yvf0Var, h0p0 h0p0Var, k0p0 k0p0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = h0p0Var;
        this.F = k0p0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        krl0 krl0Var = this.G;
        if (krl0Var != null) {
            this.G = null;
            ((j0p0) krl0Var.b).Cg();
            ru.yandex.taxi.statebar.a aVar = (ru.yandex.taxi.statebar.a) krl0Var.a;
            t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.SCOOTERS_SUPER_PASS_GRACE);
            t3u0Var.b = false;
            aVar.a(new u3u0(t3u0Var));
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ehn0 ehn0Var = new ehn0(26, this);
        hwo0 hwo0Var = this.F.a;
        j0p0 j0p0Var = new j0p0((xdf) ((xvf0) hwo0Var.b).get(), (c) ((xvf0) hwo0Var.c).get(), (h) ((xvf0) hwo0Var.w).get(), (d3a) ((ivo0) hwo0Var.x).get(), ehn0Var);
        krl0 krl0Var = new krl0((ru.yandex.taxi.statebar.a) this.E.a.a.get(), j0p0Var);
        g0p0 g0p0Var = new g0p0(krl0Var);
        j0p0Var.Bg(g0p0Var);
        ScootersSuperPassGracePeriodExperiment.Companion.getClass();
        tje.N(j0p0Var.Jg(), null, null, new ScootersSuperPassGraceStateBarPresenter$attachView$$inlined$collectIn$1(new m0(com.yandex.go.scooters.utils.a.a(j0p0Var.A, ScootersSuperPassGracePeriodExperiment.g), j0p0Var.z.b(false), new ScootersSuperPassGraceStateBarPresenter$attachView$1(j0p0Var, null)), null, g0p0Var), 3);
        this.G = krl0Var;
    }
}
