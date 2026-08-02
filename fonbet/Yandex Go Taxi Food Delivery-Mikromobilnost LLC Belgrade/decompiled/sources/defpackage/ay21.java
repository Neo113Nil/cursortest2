package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ay21 {
    public static final ay21 c = new ay21(null, null);
    public final String a;
    public final String b;

    public ay21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay21)) {
            return false;
        }
        ay21 ay21Var = (ay21) obj;
        return jl40.l(this.a, ay21Var.a) && jl40.l(this.b, ay21Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("UtmAnalyticsParams(utmSource=", this.a, ", utmMedium=", this.b, Extension.C_BRAKE);
    }

    public ay21() {
        this(null, null);
    }
}
