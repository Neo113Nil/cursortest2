package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class j1p0 {
    public final String a;
    public final String b;

    public j1p0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1p0)) {
            return false;
        }
        j1p0 j1p0Var = (j1p0) obj;
        return this.a.equals(j1p0Var.a) && jl40.l(this.b, j1p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LegalTerms(text=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
