package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ck20 {
    public final u3b1 a;
    public final ek20 b;
    public final String c;
    public final String d;

    public ck20(u3b1 u3b1Var, ek20 ek20Var, String str, String str2) {
        this.a = u3b1Var;
        this.b = ek20Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck20)) {
            return false;
        }
        ck20 ck20Var = (ck20) obj;
        return this.a.equals(ck20Var.a) && this.b.equals(ck20Var.b) && jl40.l(this.c, ck20Var.c) && jl40.l(this.d, ck20Var.d);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionProgressBlockModel(background=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", title=");
        return g8e.r(sb, this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }
}
