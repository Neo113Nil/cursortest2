package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class oej0 {
    public final String a;
    public final String b;

    public oej0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oej0)) {
            return false;
        }
        oej0 oej0Var = (oej0) obj;
        return jl40.l(this.a, oej0Var.a) && jl40.l(this.b, oej0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("RequirementComment(placeholder=", this.a, ", saveText=", this.b, Extension.C_BRAKE);
    }
}
