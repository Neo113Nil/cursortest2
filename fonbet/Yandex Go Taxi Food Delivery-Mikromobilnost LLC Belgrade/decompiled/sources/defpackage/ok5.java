package defpackage;

import com.yandex.go.beginners.safety.experiments.DisableSafetyNewbiesRegistrationActionCheckExperiment;
import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class ok5 implements hk5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public ok5(fl5 fl5Var, j24 j24Var) {
        this.a = 1;
        this.c = fl5Var;
        this.b = j24Var;
    }

    @Override // defpackage.hk5
    public final void Q() {
        switch (this.a) {
            case 0:
                qk5.Q((qk5) this.b, (qk1) this.c);
                break;
            case 1:
                ((j24) this.b).invoke(Boolean.TRUE);
                break;
            default:
                jyl0 jyl0Var = (jyl0) this.b;
                boolean z = ((DisableSafetyNewbiesRegistrationActionCheckExperiment) jyl0Var.J.b()).b ? true : jyl0Var.H.a;
                jyl0 jyl0Var2 = (jyl0) this.b;
                if (!z) {
                    jyl0Var2.r(new qu(9));
                    break;
                } else {
                    SafetyNewbiesVerificationExperiment safetyNewbiesVerificationExperiment = (SafetyNewbiesVerificationExperiment) this.c;
                    jyl0Var2.A((m950) jyl0Var2.E.get(), new svl0(safetyNewbiesVerificationExperiment.d, safetyNewbiesVerificationExperiment.c), new hyl0(jyl0Var2, safetyNewbiesVerificationExperiment));
                    break;
                }
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qk5.Q((qk5) obj2, (qk1) obj);
                break;
            case 1:
                ((fl5) obj).r(new qu(9));
                break;
            default:
                jyl0 jyl0Var = (jyl0) obj2;
                epl0 epl0Var = jyl0Var.D;
                epl0Var.getClass();
                epl0Var.a.a("SafeNewbies.AuthorizationFailed", new HashMap(), 1, new HashMap());
                jyl0Var.r(new qu(9));
                break;
        }
    }

    @Override // defpackage.hk5
    public final void m1() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qk5.Q((qk5) obj, (qk1) this.c);
                break;
            case 1:
                ((j24) obj).invoke(Boolean.FALSE);
                break;
            default:
                jyl0 jyl0Var = (jyl0) obj;
                epl0 epl0Var = jyl0Var.D;
                epl0Var.getClass();
                epl0Var.a.a("SafeNewbies.AuthorizationFailed", new HashMap(), 1, new HashMap());
                jyl0Var.r(new qu(9));
                break;
        }
    }

    public /* synthetic */ ok5(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = obj;
    }
}
