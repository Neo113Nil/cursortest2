package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pj40 {
    public static final pj40 c = new pj40(null, null);
    public final String a;
    public final String b;

    public pj40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj40)) {
            return false;
        }
        pj40 pj40Var = (pj40) obj;
        return jl40.l(this.a, pj40Var.a) && jl40.l(this.b, pj40Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("MtUtmAnalyticsParams(utmSource=", this.a, ", utmMedium=", this.b, Extension.C_BRAKE);
    }

    public pj40() {
        this(null, null);
    }
}
