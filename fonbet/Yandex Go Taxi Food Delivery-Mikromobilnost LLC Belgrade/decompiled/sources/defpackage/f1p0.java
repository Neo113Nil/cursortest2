package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f1p0 implements i1p0 {
    public final String a;

    public /* synthetic */ f1p0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1p0) {
            return jl40.l(this.a, ((f1p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenLegalTerms(url=", this.a, Extension.C_BRAKE);
    }
}
