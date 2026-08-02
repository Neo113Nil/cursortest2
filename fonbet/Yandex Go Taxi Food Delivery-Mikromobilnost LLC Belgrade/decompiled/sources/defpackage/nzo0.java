package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nzo0 implements ozo0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof nzo0) {
            return jl40.l(this.a, ((nzo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenLegalTerms(link=", this.a, Extension.C_BRAKE);
    }
}
