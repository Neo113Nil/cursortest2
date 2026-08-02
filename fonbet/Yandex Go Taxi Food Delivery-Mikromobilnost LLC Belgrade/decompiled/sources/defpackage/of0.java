package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class of0 extends vi0 {
    public final String a;
    public final String b;
    public final String c;

    public of0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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
        if (!(obj instanceof of0)) {
            return false;
        }
        of0 of0Var = (of0) obj;
        return jl40.l(this.a, of0Var.a) && jl40.l(this.b, of0Var.b) && jl40.l(this.c, of0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return g8e.r(b64.v("AddMaasPayment(disabled=", "null", ", title=", this.a, ", subtitle="), this.b, ", imageTag=", this.c, Extension.C_BRAKE);
    }
}
