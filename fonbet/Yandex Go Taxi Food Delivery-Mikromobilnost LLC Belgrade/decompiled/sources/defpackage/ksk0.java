package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ksk0 implements msk0 {
    public final String a;
    public final String b;

    public ksk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksk0)) {
            return false;
        }
        ksk0 ksk0Var = (ksk0) obj;
        return jl40.l(this.a, ksk0Var.a) && jl40.l(this.b, ksk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Content(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
