package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.instruction.SafetyCenterInstructionView;
import com.yandex.go.safety.center.instruction.h;
import com.yandex.go.safety.center.j;

/* loaded from: classes13.dex */
public final class csl0 extends n95 {
    public final hrl0 F;
    public final SafetyCenterExperiment.Instruction G;
    public final yrl0 H;
    public final url0 I;
    public final u500 J;
    public final cql0 K;
    public final p1b L;
    public final b7g M;
    public final oep0 N;
    public final w030 O;
    public final boolean P = true;

    public csl0(hrl0 hrl0Var, SafetyCenterExperiment.Instruction instruction, yrl0 yrl0Var, url0 url0Var, u500 u500Var, cql0 cql0Var, p1b p1bVar, b7g b7gVar, oep0 oep0Var, w030 w030Var) {
        this.F = hrl0Var;
        this.G = instruction;
        this.H = yrl0Var;
        this.I = url0Var;
        this.J = u500Var;
        this.K = cql0Var;
        this.L = p1bVar;
        this.M = b7gVar;
        this.N = oep0Var;
        this.O = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.O;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.P;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ndl0 ndl0Var = new ndl0(4, this);
        asl0 asl0Var = ((zrl0) this.H).a;
        h hVar = new h((p2y0) asl0Var.a.get(), (SafetyCenterExperiment) asl0Var.b.get(), (j) asl0Var.c.get(), (ru.yandex.taxi.h) asl0Var.d.get(), (po21) asl0Var.e.get(), (y50) asl0Var.f.get(), (tt2) asl0Var.g.get(), (k7x0) asl0Var.h.get(), (pwy0) asl0Var.i.get(), (ney) asl0Var.j.get(), this.G, ndl0Var, this.F, (q3u0) asl0Var.k.get(), (a) asl0Var.l.get());
        kdd0 kdd0Var = this.I.a;
        return new SafetyCenterInstructionView((Context) ((c7g) kdd0Var.a).get(), hVar, (pav) ((b7g) kdd0Var.b).get(), (yiz0) ((c7g) kdd0Var.c).get(), (Activity) ((b7g) kdd0Var.d).get());
    }
}
