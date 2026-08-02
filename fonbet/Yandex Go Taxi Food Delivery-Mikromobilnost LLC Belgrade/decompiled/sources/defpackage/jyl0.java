package defpackage;

import com.yandex.go.beginners.safety.experiments.DisableSafetyNewbiesRegistrationActionCheckExperiment;
import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;

/* loaded from: classes12.dex */
public final class jyl0 extends h55 {
    public final epl0 D;
    public final yvf0 E;
    public final npe0 F;
    public final yvf0 G;
    public final r660 H;
    public final qqo I;
    public final qqo J;

    public jyl0(rqo rqoVar, epl0 epl0Var, yvf0 yvf0Var, npe0 npe0Var, yvf0 yvf0Var2, r660 r660Var) {
        super(null);
        this.D = epl0Var;
        this.E = yvf0Var;
        this.F = npe0Var;
        this.G = yvf0Var2;
        this.H = r660Var;
        jbh jbhVar = (jbh) rqoVar;
        this.I = jbhVar.c(SafetyNewbiesVerificationExperiment.g);
        this.J = jbhVar.c(DisableSafetyNewbiesRegistrationActionCheckExperiment.c);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        SafetyNewbiesVerificationExperiment safetyNewbiesVerificationExperiment = (SafetyNewbiesVerificationExperiment) this.I.b();
        if (safetyNewbiesVerificationExperiment.b) {
            z((m950) this.G.get(), new ok5(this, safetyNewbiesVerificationExperiment, 2));
        } else {
            r(new qu(9));
        }
    }
}
