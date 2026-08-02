package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class az7 {
    public final String a;
    public final int b;
    public final String c;

    public az7(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az7)) {
            return false;
        }
        az7 az7Var = (az7) obj;
        return jl40.l(this.a, az7Var.a) && this.b == az7Var.b && jl40.l(this.c, az7Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return oyr.t(b64.u(this.b, "RatingBar(title=", this.a, ", selectedRating=", ", groupId="), this.c, Extension.C_BRAKE);
    }
}
