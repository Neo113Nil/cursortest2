package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ja2 {
    public final String a;
    public final String b;
    public final String c;

    public ja2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja2)) {
            return false;
        }
        ja2 ja2Var = (ja2) obj;
        return jl40.l(this.a, ja2Var.a) && jl40.l(this.b, ja2Var.b) && jl40.l(this.c, ja2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String a = q6z.a(this.a);
        String a2 = q6z.a(this.b);
        return oyr.t(b64.v("AndroidLocationSources(gps=", a, ", network=", a2, ", fused="), q6z.a(this.c), Extension.C_BRAKE);
    }
}
