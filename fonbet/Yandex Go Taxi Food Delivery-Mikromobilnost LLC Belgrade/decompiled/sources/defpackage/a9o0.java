package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a9o0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof a9o0) {
            return jl40.l(this.a, ((a9o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Promo(imageTag=", this.a, Extension.C_BRAKE);
    }
}
