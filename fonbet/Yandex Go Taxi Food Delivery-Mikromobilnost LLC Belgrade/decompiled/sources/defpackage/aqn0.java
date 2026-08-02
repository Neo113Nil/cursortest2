package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class aqn0 implements eqn0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof aqn0) {
            return jl40.l(this.a, ((aqn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenBeta(url=", this.a, Extension.C_BRAKE);
    }
}
