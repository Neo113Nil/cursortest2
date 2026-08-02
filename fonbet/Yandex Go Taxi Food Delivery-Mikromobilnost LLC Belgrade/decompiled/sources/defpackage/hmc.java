package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hmc {
    public final String a;
    public final String b;

    public hmc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmc)) {
            return false;
        }
        hmc hmcVar = (hmc) obj;
        return jl40.l(this.a, hmcVar.a) && jl40.l(this.b, hmcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CommentItem(hint=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
