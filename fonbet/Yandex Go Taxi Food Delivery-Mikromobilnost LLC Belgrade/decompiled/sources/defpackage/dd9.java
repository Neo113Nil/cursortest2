package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dd9 implements qas0 {
    public final String a;
    public final String b;

    public dd9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd9)) {
            return false;
        }
        dd9 dd9Var = (dd9) obj;
        return jl40.l(this.a, dd9Var.a) && jl40.l(this.b, dd9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SetDivVariable(variableName=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
