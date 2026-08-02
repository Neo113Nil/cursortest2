package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class d42 {
    public final String a;
    public final String b;

    public d42(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d42)) {
            return false;
        }
        d42 d42Var = (d42) obj;
        return jl40.l(this.a, d42Var.a) && jl40.l(this.b, d42Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AnalyticsIdentifiers(uuid=", this.a, ", deviceId=", this.b, Extension.C_BRAKE);
    }
}
