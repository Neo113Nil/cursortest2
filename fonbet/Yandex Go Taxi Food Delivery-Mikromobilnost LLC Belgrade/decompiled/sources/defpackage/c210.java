package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class c210 {
    public final String a;
    public final String b;

    public c210(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c210)) {
            return false;
        }
        c210 c210Var = (c210) obj;
        return this.a.equals(c210Var.a) && jl40.l(this.b, c210Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("QRButton(title=", this.a, ", icon=", this.b, Extension.C_BRAKE);
    }
}
