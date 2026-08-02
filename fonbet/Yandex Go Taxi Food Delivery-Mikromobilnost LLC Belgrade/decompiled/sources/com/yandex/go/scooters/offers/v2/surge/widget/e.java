package com.yandex.go.scooters.offers.v2.surge.widget;

import defpackage.ci91;
import defpackage.cma1;
import defpackage.jl40;
import defpackage.t3p0;
import defpackage.tje;
import defpackage.w3p0;
import defpackage.w511;
import defpackage.x3p0;
import defpackage.y3p0;
import defpackage.z3p0;

/* loaded from: classes13.dex */
public final class e implements t3p0 {
    public boolean a;
    public final /* synthetic */ ScootersSurgeWidgetView b;

    public e(ScootersSurgeWidgetView scootersSurgeWidgetView) {
        this.b = scootersSurgeWidgetView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        z3p0 z3p0Var;
        y3p0 y3p0Var = (y3p0) obj;
        boolean l = jl40.l(y3p0Var, w3p0.a);
        ScootersSurgeWidgetView scootersSurgeWidgetView = this.b;
        if (l) {
            this.a = false;
            scootersSurgeWidgetView.cancelSetContentJob();
            z3p0Var = scootersSurgeWidgetView.binding;
            cma1.L(z3p0Var.b);
            return;
        }
        if (!(y3p0Var instanceof x3p0)) {
            w511.b();
        } else {
            scootersSurgeWidgetView.cancelSetContentJob();
            scootersSurgeWidgetView.setContentJob = tje.N(ci91.c(scootersSurgeWidgetView), null, null, new ScootersSurgeWidgetView$InnerMvpView$show$1((x3p0) y3p0Var, scootersSurgeWidgetView, this, null), 3);
        }
    }
}
