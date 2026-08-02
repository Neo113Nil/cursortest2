package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class lj21 {
    public final String a;
    public final String b;

    public lj21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj21)) {
            return false;
        }
        lj21 lj21Var = (lj21) obj;
        return jl40.l(this.a, lj21Var.a) && jl40.l(this.b, lj21Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("User(id=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }
}
