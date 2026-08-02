package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n9m0 {
    public final String a;
    public final String b;

    public n9m0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9m0)) {
            return false;
        }
        n9m0 n9m0Var = (n9m0) obj;
        return jl40.l(this.a, n9m0Var.a) && jl40.l(this.b, n9m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Date(text=", this.a, ", amount=", this.b, Extension.C_BRAKE);
    }
}
