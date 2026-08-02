package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mu90 extends gv90 {
    public final nr a;
    public final boolean b;

    public mu90(nr nrVar, boolean z) {
        this.a = nrVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu90)) {
            return false;
        }
        mu90 mu90Var = (mu90) obj;
        return jl40.l(this.a, mu90Var.a) && this.b == mu90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionPayload(action=" + this.a + ", isEnabled=" + this.b + Extension.C_BRAKE;
    }
}
