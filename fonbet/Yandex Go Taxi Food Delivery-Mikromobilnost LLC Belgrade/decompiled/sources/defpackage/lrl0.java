package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.contacts.b;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.help.SafetyCenterHelpView;
import com.yandex.go.safety.center.help.e;
import com.yandex.go.safety.center.j;
import ru.yandex.taxi.h;

/* loaded from: classes13.dex */
public final class lrl0 extends o95 {
    public final hrl0 F;
    public final trl0 G;
    public final rrl0 H;
    public final b I;
    public final w030 J;
    public final boolean K = true;

    public lrl0(hrl0 hrl0Var, trl0 trl0Var, rrl0 rrl0Var, b bVar, w030 w030Var) {
        this.F = hrl0Var;
        this.G = trl0Var;
        this.H = rrl0Var;
        this.I = bVar;
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
        krl0 krl0Var = new krl0((h55) this, obj);
        st0 st0Var = this.H.a;
        e eVar = new e((j) ((xvf0) st0Var.a).get(), (SafetyCenterExperiment) ((xvf0) st0Var.b).get(), (atd0) ((c7g) st0Var.B).get(), (po21) ((xvf0) st0Var.c).get(), (h) ((xvf0) st0Var.w).get(), (y50) ((xvf0) st0Var.x).get(), (itl0) ((xvf0) st0Var.y).get(), (tt2) ((xvf0) st0Var.z).get(), i5m.a((n7i0) st0Var.C), krl0Var, this.F, (a) ((xvf0) st0Var.A).get(), (q3u0) ((xvf0) st0Var.D).get());
        vx0 vx0Var = this.G.a;
        return new SafetyCenterHelpView((Context) vx0Var.a.get(), eVar, (SafetyCenterExperiment) vx0Var.b.get(), (Activity) vx0Var.c.get());
    }
}
