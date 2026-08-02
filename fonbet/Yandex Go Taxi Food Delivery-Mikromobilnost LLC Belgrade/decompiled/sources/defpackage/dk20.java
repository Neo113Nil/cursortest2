package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dk20 {
    public final w3b1 a;
    public final fk20 b;
    public final String c;
    public final String d;

    public dk20(w3b1 w3b1Var, fk20 fk20Var, String str, String str2) {
        this.a = w3b1Var;
        this.b = fk20Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk20)) {
            return false;
        }
        dk20 dk20Var = (dk20) obj;
        return jl40.l(this.a, dk20Var.a) && this.b.equals(dk20Var.b) && jl40.l(this.c, dk20Var.c) && jl40.l(this.d, dk20Var.d);
    }

    public final int hashCode() {
        w3b1 w3b1Var = this.a;
        int b = unr0.b((this.b.hashCode() + ((w3b1Var == null ? 0 : w3b1Var.hashCode()) * 31)) * 31, 31, this.c);
        String str = this.d;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionProgressBlockState(background=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", title=");
        return g8e.r(sb, this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }
}
