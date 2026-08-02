package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g9m0 {
    public final String a;
    public final String b;

    public g9m0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9m0)) {
            return false;
        }
        g9m0 g9m0Var = (g9m0) obj;
        return jl40.l(this.a, g9m0Var.a) && jl40.l(this.b, g9m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Button(label=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
