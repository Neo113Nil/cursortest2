package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p37 {
    public final long a;
    public final int b;
    public final wa6 c;

    public p37(long j, int i, wa6 wa6Var) {
        this.a = j;
        this.b = i;
        this.c = wa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p37)) {
            return false;
        }
        p37 p37Var = (p37) obj;
        return ldc.c(this.a, p37Var.a) && this.b == p37Var.b && jl40.l(this.c, p37Var.c);
    }

    public final int hashCode() {
        int i = ldc.n;
        int b = oyr.b(this.b, Long.hashCode(this.a) * 31, 31);
        wa6 wa6Var = this.c;
        return b + (wa6Var == null ? 0 : wa6Var.hashCode());
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "ButtonStyleState(backgroundColor=", ldc.i(this.a), ", cornerRadius=", ", border=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
