package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class f5q0 {
    public final String a;
    public final String b;

    public f5q0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5q0)) {
            return false;
        }
        f5q0 f5q0Var = (f5q0) obj;
        return jl40.l(this.a, f5q0Var.a) && jl40.l(this.b, f5q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SectionWeight(distance=", this.a, ", time=", this.b, Extension.C_BRAKE);
    }
}
