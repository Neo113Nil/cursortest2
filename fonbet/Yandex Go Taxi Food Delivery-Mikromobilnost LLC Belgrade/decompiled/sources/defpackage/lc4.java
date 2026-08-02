package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lc4 implements mc4 {
    public final String a;
    public final String b;

    public lc4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc4)) {
            return false;
        }
        lc4 lc4Var = (lc4) obj;
        return this.a.equals(lc4Var.a) && jl40.l(this.b, lc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Visible(title=", this.a, ", landingUrl=", this.b, Extension.C_BRAKE);
    }
}
