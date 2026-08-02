package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p3z0 implements q3z0 {
    public final String a;
    public final String b;

    public p3z0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3z0)) {
            return false;
        }
        p3z0 p3z0Var = (p3z0) obj;
        return jl40.l(this.a, p3z0Var.a) && jl40.l(this.b, p3z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SaveBenefitButtonClicked(code=", this.a, ", activatedText=", this.b, Extension.C_BRAKE);
    }
}
