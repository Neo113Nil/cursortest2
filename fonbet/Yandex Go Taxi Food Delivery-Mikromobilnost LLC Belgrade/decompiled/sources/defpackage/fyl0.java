package defpackage;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fyl0 {
    public final SafetyNewbiesVerificationExperiment.PhotoStep a;
    public final Map b;

    public /* synthetic */ fyl0(int i) {
        this(new SafetyNewbiesVerificationExperiment.PhotoStep(0), b.f());
    }

    public final String a(String str) {
        String str2 = str != null ? (String) this.b.get(str) : null;
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyl0)) {
            return false;
        }
        fyl0 fyl0Var = (fyl0) obj;
        return jl40.l(this.a, fyl0Var.a) && jl40.l(this.b, fyl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperimentData(experimentStep=" + this.a + ", l10n=" + this.b + Extension.C_BRAKE;
    }

    public fyl0(SafetyNewbiesVerificationExperiment.PhotoStep photoStep, Map map) {
        this.a = photoStep;
        this.b = map;
    }

    public fyl0() {
        this(0);
    }
}
