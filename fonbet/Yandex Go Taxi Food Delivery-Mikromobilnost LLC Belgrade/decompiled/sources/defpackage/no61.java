package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class no61 {
    public final String a;
    public final Set b;

    public no61(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no61)) {
            return false;
        }
        no61 no61Var = (no61) obj;
        return jl40.l(this.a, no61Var.a) && this.b.equals(no61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.a + ", triggeredTestIds=" + this.b + Extension.C_BRAKE;
    }
}
