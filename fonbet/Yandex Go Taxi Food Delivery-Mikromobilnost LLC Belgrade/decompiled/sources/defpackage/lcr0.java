package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lcr0 implements mcr0 {
    public final String a;
    public final String b;

    public lcr0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcr0)) {
            return false;
        }
        lcr0 lcr0Var = (lcr0) obj;
        return jl40.l(this.a, lcr0Var.a) && jl40.l(this.b, lcr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Email(email=", this.a, ", status=", this.b, Extension.C_BRAKE);
    }
}
