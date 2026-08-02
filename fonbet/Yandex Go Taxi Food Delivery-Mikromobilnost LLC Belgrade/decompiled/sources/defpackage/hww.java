package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hww {
    public final h3t0 a;
    public final String b;
    public final String c;
    public final String d;

    public hww(h3t0 h3t0Var, String str, String str2, String str3) {
        this.a = h3t0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hww)) {
            return false;
        }
        hww hwwVar = (hww) obj;
        return jl40.l(this.a, hwwVar.a) && jl40.l(this.b, hwwVar.b) && this.c.equals(hwwVar.c) && jl40.l(this.d, hwwVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteHash(snapshot=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", hash=");
        return g8e.r(sb, this.c, ", alias=", this.d, Extension.C_BRAKE);
    }
}
