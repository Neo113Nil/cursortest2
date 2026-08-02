package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k7k0 implements l7k0 {
    public final String a;
    public final String b;

    public k7k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7k0)) {
            return false;
        }
        k7k0 k7k0Var = (k7k0) obj;
        return jl40.l(this.a, k7k0Var.a) && this.b.equals(k7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Filled(subtitle=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
