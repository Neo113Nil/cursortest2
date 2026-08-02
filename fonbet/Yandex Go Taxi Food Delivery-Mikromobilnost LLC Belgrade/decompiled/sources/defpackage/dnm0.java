package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dnm0 {
    public final mza1 a;
    public final etc b;

    public dnm0(mza1 mza1Var, etc etcVar) {
        this.a = mza1Var;
        this.b = etcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnm0)) {
            return false;
        }
        dnm0 dnm0Var = (dnm0) obj;
        return this.a.equals(dnm0Var.a) && this.b.equals(dnm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Schedule(strategy=" + this.a + ", communicationWindow=" + this.b + Extension.C_BRAKE;
    }
}
