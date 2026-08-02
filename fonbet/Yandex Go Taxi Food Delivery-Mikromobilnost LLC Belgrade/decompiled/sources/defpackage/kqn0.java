package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kqn0 implements qqn0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public kqn0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqn0)) {
            return false;
        }
        kqn0 kqn0Var = (kqn0) obj;
        return jl40.l(this.a, kqn0Var.a) && jl40.l(this.b, kqn0Var.b) && jl40.l(this.c, kqn0Var.c) && jl40.l(this.d, kqn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("Beta(leadIconTag=", this.a, ", title=", this.b, ", subtitle="), this.c, ", url=", this.d, Extension.C_BRAKE);
    }
}
