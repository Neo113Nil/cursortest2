package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class geo0 {
    public final String a;
    public final String b;

    public geo0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geo0)) {
            return false;
        }
        geo0 geo0Var = (geo0) obj;
        return this.a.equals(geo0Var.a) && jl40.l(this.b, geo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ScootersPassesLegalTerms(text=", this.a, ", link=", this.b, Extension.C_BRAKE);
    }
}
