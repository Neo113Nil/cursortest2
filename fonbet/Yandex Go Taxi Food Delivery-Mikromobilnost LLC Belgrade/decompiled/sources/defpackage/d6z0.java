package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d6z0 {
    public final String a;
    public final String b;

    public d6z0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6z0)) {
            return false;
        }
        d6z0 d6z0Var = (d6z0) obj;
        return jl40.l(this.a, d6z0Var.a) && jl40.l(this.b, d6z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TimeDetailState(time=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
