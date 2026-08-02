package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class muq0 {
    public final String a;
    public final String b;

    public muq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muq0)) {
            return false;
        }
        muq0 muq0Var = (muq0) obj;
        return jl40.l(this.a, muq0Var.a) && jl40.l(this.b, muq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Link(title=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
