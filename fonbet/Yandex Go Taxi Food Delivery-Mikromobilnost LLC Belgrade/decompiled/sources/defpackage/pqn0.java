package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pqn0 implements qqn0 {
    public final String a;
    public final String b;
    public final String c;

    public pqn0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqn0)) {
            return false;
        }
        pqn0 pqn0Var = (pqn0) obj;
        return jl40.l(this.a, pqn0Var.a) && jl40.l(this.b, pqn0Var.b) && jl40.l(this.c, pqn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("Standard(leadIconTag=", this.a, ", title=", this.b, ", subtitle="), this.c, Extension.C_BRAKE);
    }
}
