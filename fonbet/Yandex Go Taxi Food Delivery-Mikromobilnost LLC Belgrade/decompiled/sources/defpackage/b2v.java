package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b2v {
    public static final b2v c = new b2v(null, null);
    public final String a;
    public final String b;

    public b2v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2v)) {
            return false;
        }
        b2v b2vVar = (b2v) obj;
        return jl40.l(this.a, b2vVar.a) && jl40.l(this.b, b2vVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("HubUtmParams(utmSource=", this.a, ", utmMedium=", this.b, Extension.C_BRAKE);
    }

    public b2v() {
        this(null, null);
    }
}
