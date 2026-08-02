package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class bt8 {
    public final String a;
    public final String b;

    public bt8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt8)) {
            return false;
        }
        bt8 bt8Var = (bt8) obj;
        return jl40.l(this.a, bt8Var.a) && this.b.equals(bt8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("WebUrl(url=", this.a, ", targetOrigin=", this.b, Extension.C_BRAKE);
    }
}
