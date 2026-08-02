package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cqn0 implements eqn0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof cqn0) {
            return jl40.l(this.a, ((cqn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenOnboardingCommunication(id=", this.a, Extension.C_BRAKE);
    }
}
