package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class n150 {
    public static final n150 c = new n150(null, null);
    public final String a;
    public final String b;

    public n150(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean a() {
        String str = this.a;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.b;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n150)) {
            return false;
        }
        n150 n150Var = (n150) obj;
        return jl40.l(this.a, n150Var.a) && jl40.l(this.b, n150Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("NameAndRating(name=", this.a, ", rating=", this.b, Extension.C_BRAKE);
    }
}
