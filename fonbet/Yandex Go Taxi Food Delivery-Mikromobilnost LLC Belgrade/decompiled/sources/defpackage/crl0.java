package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsView;
import com.yandex.go.safety.center.contacts.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import ru.yandex.taxi.order.l;

/* loaded from: classes13.dex */
public final class crl0 extends n95 {
    public final hrl0 F;
    public final brl0 G;
    public final xql0 H;
    public final tql0 I;
    public final w030 J;
    public final boolean K = true;

    public crl0(hrl0 hrl0Var, brl0 brl0Var, xql0 xql0Var, tql0 tql0Var, w030 w030Var) {
        this.F = hrl0Var;
        this.G = brl0Var;
        this.H = xql0Var;
        this.I = tql0Var;
        this.J = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.J;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.K;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        pgk0 pgk0Var = new pgk0(6, this);
        wrr wrrVar = this.H.a;
        a aVar = new a((j) ((xvf0) wrrVar.b).get(), (l) ((b7g) wrrVar.c).get(), (po21) ((xvf0) wrrVar.w).get(), (tt2) ((xvf0) wrrVar.x).get(), this.F, pgk0Var, (fkr0) ((xvf0) wrrVar.y).get(), (com.yandex.go.safety.center.analytics.a) ((xvf0) wrrVar.z).get(), (q3u0) ((xvf0) wrrVar.A).get());
        vx0 vx0Var = this.G.a;
        return new SafetyCenterContactsView((Context) vx0Var.a.get(), aVar, (SafetyCenterExperiment) vx0Var.b.get(), (Activity) vx0Var.c.get());
    }
}
