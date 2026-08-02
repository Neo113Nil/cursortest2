package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bp8 {
    public final String a;
    public final String b;

    public bp8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp8)) {
            return false;
        }
        bp8 bp8Var = (bp8) obj;
        return jl40.l(this.a, bp8Var.a) && jl40.l(this.b, bp8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("CardSkin(light=", this.a, ", dark=", this.b, Extension.C_BRAKE);
    }
}
