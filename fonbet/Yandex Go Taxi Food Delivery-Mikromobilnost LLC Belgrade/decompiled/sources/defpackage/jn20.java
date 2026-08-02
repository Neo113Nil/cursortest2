package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class jn20 {
    public final String a;
    public final Double b;
    public final Double c;

    public jn20(String str, Double d, Double d2) {
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn20)) {
            return false;
        }
        jn20 jn20Var = (jn20) obj;
        return jl40.l(this.a, jn20Var.a) && this.b.equals(jn20Var.b) && this.c.equals(jn20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MobCountryInfo(countryIso=" + this.a + ", lat=" + this.b + ", lon=" + this.c + Extension.C_BRAKE;
    }
}
