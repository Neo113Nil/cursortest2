package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ori extends uri {
    public final String a;
    public final gv90 b;
    public final boolean c;

    public ori(String str, gv90 gv90Var, boolean z) {
        this.a = str;
        this.b = gv90Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ori)) {
            return false;
        }
        ori oriVar = (ori) obj;
        return jl40.l(this.a, oriVar.a) && jl40.l(this.b, oriVar.b) && this.c == oriVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gv90 gv90Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionHeader(title=");
        sb.append(this.a);
        sb.append(", trailPayload=");
        sb.append(this.b);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
