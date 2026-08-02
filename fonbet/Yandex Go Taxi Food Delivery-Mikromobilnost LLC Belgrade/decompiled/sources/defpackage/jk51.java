package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jk51 {
    public final String a;
    public final String b;

    public jk51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk51)) {
            return false;
        }
        jk51 jk51Var = (jk51) obj;
        return jl40.l(this.a, jk51Var.a) && jl40.l(this.b, jk51Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("UrlIcon(url=", this.a, ", tintColor=", this.b, Extension.C_BRAKE);
    }
}
