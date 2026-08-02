package defpackage;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fxl0 {
    public final SafetyNewbiesVerificationExperiment.PhotoStep a;
    public final Map b;

    public /* synthetic */ fxl0(int i) {
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
        if (!(obj instanceof fxl0)) {
            return false;
        }
        fxl0 fxl0Var = (fxl0) obj;
        return jl40.l(this.a, fxl0Var.a) && jl40.l(this.b, fxl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperimentData(experimentStep=" + this.a + ", l10n=" + this.b + Extension.C_BRAKE;
    }

    public fxl0(SafetyNewbiesVerificationExperiment.PhotoStep photoStep, Map map) {
        this.a = photoStep;
        this.b = map;
    }

    public fxl0() {
        this(0);
    }
}
