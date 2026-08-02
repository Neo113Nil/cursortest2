package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kw3 {
    public final String a;
    public final String b;

    public kw3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw3)) {
            return false;
        }
        kw3 kw3Var = (kw3) obj;
        return jl40.l(this.a, kw3Var.a) && jl40.l(this.b, kw3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Button(text=", this.a, ", action=", this.b, Extension.C_BRAKE);
    }
}
