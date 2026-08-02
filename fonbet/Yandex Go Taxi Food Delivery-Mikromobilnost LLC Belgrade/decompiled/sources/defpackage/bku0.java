package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bku0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public bku0(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bku0)) {
            return false;
        }
        bku0 bku0Var = (bku0) obj;
        return jl40.l(this.a, bku0Var.a) && jl40.l(this.b, bku0Var.b) && jl40.l(this.c, bku0Var.c) && jl40.l(this.d, bku0Var.d) && this.e == bku0Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.e) + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("StoredExperimentEntity(source=", this.a, ", name=", this.b, ", version=");
        g8e.D(v, this.c, ", value=", this.d, ", lastUpdate=");
        return oyr.n(this.e, Extension.C_BRAKE, v);
    }
}
