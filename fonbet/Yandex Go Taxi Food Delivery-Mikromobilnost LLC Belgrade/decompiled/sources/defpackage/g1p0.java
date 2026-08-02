package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g1p0 implements i1p0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof g1p0) {
            return jl40.l(this.a, ((g1p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Purchase(passId=", this.a, Extension.C_BRAKE);
    }
}
