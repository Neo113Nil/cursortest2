package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class na11 {
    public final String a;
    public final String b;
    public final String c;

    public na11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na11)) {
            return false;
        }
        na11 na11Var = (na11) obj;
        return jl40.l(this.a, na11Var.a) && jl40.l(this.b, na11Var.b) && jl40.l(this.c, na11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("TransportType(filterId=", this.a, ", itemId=", this.b, ", title="), this.c, Extension.C_BRAKE);
    }
}
