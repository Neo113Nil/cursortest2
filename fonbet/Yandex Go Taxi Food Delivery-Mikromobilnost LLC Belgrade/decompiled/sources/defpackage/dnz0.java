package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class dnz0 {
    public final String a;
    public final Long b;

    public dnz0(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public static dnz0 a(dnz0 dnz0Var, String str, Long l, int i) {
        if ((i & 1) != 0) {
            str = dnz0Var.a;
        }
        if ((i & 2) != 0) {
            l = dnz0Var.b;
        }
        dnz0Var.getClass();
        return new dnz0(str, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnz0)) {
            return false;
        }
        dnz0 dnz0Var = (dnz0) obj;
        return jl40.l(this.a, dnz0Var.a) && jl40.l(this.b, dnz0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "TokenData(token=" + this.a + ", appPausedAt=" + this.b + Extension.C_BRAKE;
    }
}
