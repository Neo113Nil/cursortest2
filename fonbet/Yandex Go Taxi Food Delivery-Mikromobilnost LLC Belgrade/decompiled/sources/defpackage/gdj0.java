package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gdj0 {
    public final String a;
    public final String b;
    public final String c;

    public gdj0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj0)) {
            return false;
        }
        gdj0 gdj0Var = (gdj0) obj;
        return jl40.l(this.a, gdj0Var.a) && jl40.l(this.b, gdj0Var.b) && jl40.l(this.c, gdj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("BadgeView(title=", this.a, ", bgColor=", this.b, ", textColor="), this.c, Extension.C_BRAKE);
    }
}
