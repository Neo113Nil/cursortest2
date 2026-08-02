package defpackage;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jwl0 {
    public final SafetyNewbiesVerificationExperiment.NameInputStep a;
    public final Map b;

    public /* synthetic */ jwl0(int i) {
        this(new SafetyNewbiesVerificationExperiment.NameInputStep(0), b.f());
    }

    public final String a(String str) {
        String str2 = str != null ? (String) this.b.get(str) : null;
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwl0)) {
            return false;
        }
        jwl0 jwl0Var = (jwl0) obj;
        return jl40.l(this.a, jwl0Var.a) && jl40.l(this.b, jwl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperimentData(experimentStep=" + this.a + ", l10n=" + this.b + Extension.C_BRAKE;
    }

    public jwl0(SafetyNewbiesVerificationExperiment.NameInputStep nameInputStep, Map map) {
        this.a = nameInputStep;
        this.b = map;
    }

    public jwl0() {
        this(0);
    }
}
