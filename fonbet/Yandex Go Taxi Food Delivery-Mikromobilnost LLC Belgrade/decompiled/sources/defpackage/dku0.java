package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dku0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public dku0(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final long a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dku0)) {
            return false;
        }
        dku0 dku0Var = (dku0) obj;
        return jl40.l(this.a, dku0Var.a) && jl40.l(this.b, dku0Var.b) && jl40.l(this.c, dku0Var.c) && this.d == dku0Var.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("StoredExperimentMetadataUpdate(source=", this.a, ", name=", this.b, ", version=");
        ly3.y(this.d, this.c, ", lastUpdate=", v);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
