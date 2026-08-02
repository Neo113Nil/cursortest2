package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o37 {
    public final String a;
    public final int b;
    public final qa6 c;

    public o37(String str, int i, qa6 qa6Var) {
        this.a = str;
        this.b = i;
        this.c = qa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o37)) {
            return false;
        }
        o37 o37Var = (o37) obj;
        return jl40.l(this.a, o37Var.a) && this.b == o37Var.b && jl40.l(this.c, o37Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        qa6 qa6Var = this.c;
        return b + (qa6Var != null ? qa6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "ButtonStyleModel(backgroundColor=", this.a, ", cornerRadius=", ", border=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
