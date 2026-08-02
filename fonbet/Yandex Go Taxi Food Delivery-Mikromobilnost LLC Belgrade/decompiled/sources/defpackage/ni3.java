package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ni3 {
    public final String a;
    public final String b;

    public ni3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3)) {
            return false;
        }
        ni3 ni3Var = (ni3) obj;
        return jl40.l(this.a, ni3Var.a) && jl40.l(this.b, ni3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("AuthCredentials(token=", this.a, ", userId=", this.b, Extension.C_BRAKE);
    }
}
