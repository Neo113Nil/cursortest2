package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ps8 {
    public final String a;
    public final String b;

    public ps8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps8)) {
            return false;
        }
        ps8 ps8Var = (ps8) obj;
        return jl40.l(this.a, ps8Var.a) && this.b.equals(ps8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Header(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
