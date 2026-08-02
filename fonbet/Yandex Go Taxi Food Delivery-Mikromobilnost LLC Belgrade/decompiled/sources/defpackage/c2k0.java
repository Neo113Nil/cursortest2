package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class c2k0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof c2k0) {
            return jl40.l(this.a, ((c2k0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RetryPolicyId(id=", this.a, Extension.C_BRAKE);
    }
}
