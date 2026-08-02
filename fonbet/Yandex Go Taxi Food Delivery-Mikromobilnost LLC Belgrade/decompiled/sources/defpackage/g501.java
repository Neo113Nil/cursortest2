package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g501 implements i501 {
    public final String a;
    public final String b;

    public g501(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g501)) {
            return false;
        }
        g501 g501Var = (g501) obj;
        return jl40.l(this.a, g501Var.a) && jl40.l(this.b, g501Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Enabled(deferButtonText=", this.a, ", targetFilter=", this.b, Extension.C_BRAKE);
    }
}
