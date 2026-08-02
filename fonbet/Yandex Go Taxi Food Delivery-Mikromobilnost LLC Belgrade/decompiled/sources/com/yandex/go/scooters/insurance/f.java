package com.yandex.go.scooters.insurance;

import android.content.Context;
import com.yandex.go.scooters.domain.r;
import defpackage.iin0;
import defpackage.jtn0;
import defpackage.ltn0;
import defpackage.m230;
import defpackage.n3o0;
import defpackage.pav;
import defpackage.ptn0;
import defpackage.qx5;
import defpackage.rtn0;
import defpackage.s6k0;
import defpackage.u45;
import defpackage.vx0;
import defpackage.w030;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.z1n0;
import defpackage.zsn0;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

/* loaded from: classes13.dex */
public final class f extends m230 {
    public final w030 E;
    public final MapNotificationsMuteRepository F;
    public final jtn0 G;
    public final rtn0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final qx5 K;

    public f(w030 w030Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, jtn0 jtn0Var, rtn0 rtn0Var, yvf0 yvf0Var, yvf0 yvf0Var2, qx5 qx5Var) {
        super(null);
        this.E = w030Var;
        this.F = mapNotificationsMuteRepository;
        this.G = jtn0Var;
        this.H = rtn0Var;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = qx5Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.F.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.F.a();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ptn0 ptn0Var = (ptn0) obj;
        ltn0 ltn0Var = ptn0Var.a;
        iin0 iin0Var = new iin0(5, this);
        ScootersInsuranceRouter$provideModalView$2 scootersInsuranceRouter$provideModalView$2 = new ScootersInsuranceRouter$provideModalView$2(2, this, f.class, "showErrorDialog", "showErrorDialog(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        ltn0 ltn0Var2 = ptn0Var.a;
        n3o0 n3o0Var = ptn0Var.b;
        ScootersInsuranceRouter$provideModalView$3 scootersInsuranceRouter$provideModalView$3 = new ScootersInsuranceRouter$provideModalView$3(1, this, f.class, "showInsuranceStory", "showInsuranceStory(Ljava/lang/String;)V", 0);
        ScootersInsuranceRouter$provideModalView$4 scootersInsuranceRouter$provideModalView$4 = new ScootersInsuranceRouter$provideModalView$4(2, this, f.class, "showInsuranceDetails", "showInsuranceDetails(Ljava/lang/CharSequence;Ljava/util/List;)V", 0);
        vx0 vx0Var = this.H.a;
        e eVar = new e((r) vx0Var.a.get(), (com.yandex.go.scooters.insurance.data.b) vx0Var.b.get(), (com.yandex.go.scooters.insurance.data.c) vx0Var.c.get(), ltn0Var2, scootersInsuranceRouter$provideModalView$3, n3o0Var, scootersInsuranceRouter$provideModalView$4);
        s6k0 s6k0Var = this.G.a;
        return new ScootersInsuranceModalView((Context) ((xvf0) s6k0Var.a).get(), (pav) ((xvf0) s6k0Var.b).get(), (zsn0) ((z1n0) s6k0Var.c).get(), ltn0Var, iin0Var, eVar, scootersInsuranceRouter$provideModalView$2);
    }
}
