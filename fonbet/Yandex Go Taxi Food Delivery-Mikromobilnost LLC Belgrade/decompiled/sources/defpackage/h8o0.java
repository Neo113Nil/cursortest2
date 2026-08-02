package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class h8o0 {
    public final String a;
    public final String b;

    public h8o0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8o0)) {
            return false;
        }
        h8o0 h8o0Var = (h8o0) obj;
        return this.a.equals(h8o0Var.a) && jl40.l(this.b, h8o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LegalTerms(text=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
