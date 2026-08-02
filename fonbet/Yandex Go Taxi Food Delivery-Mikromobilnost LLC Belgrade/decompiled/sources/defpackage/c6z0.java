package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c6z0 {
    public final String a;
    public final String b;

    public c6z0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6z0)) {
            return false;
        }
        c6z0 c6z0Var = (c6z0) obj;
        return jl40.l(this.a, c6z0Var.a) && jl40.l(this.b, c6z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TimeDetail(detail=", this.a, ", time=", this.b, Extension.C_BRAKE);
    }
}
