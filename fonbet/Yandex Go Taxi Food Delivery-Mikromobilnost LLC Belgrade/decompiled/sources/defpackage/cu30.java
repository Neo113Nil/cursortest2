package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cu30 {
    public static final cu30 d = new cu30(null, null, false);
    public final yt30 a;
    public final ku30 b;
    public final boolean c;

    public cu30(yt30 yt30Var, ku30 ku30Var, boolean z) {
        this.a = yt30Var;
        this.b = ku30Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu30)) {
            return false;
        }
        cu30 cu30Var = (cu30) obj;
        return jl40.l(this.a, cu30Var.a) && jl40.l(this.b, cu30Var.b) && this.c == cu30Var.c;
    }

    public final int hashCode() {
        yt30 yt30Var = this.a;
        int hashCode = (yt30Var == null ? 0 : yt30Var.a.hashCode()) * 31;
        ku30 ku30Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (ku30Var != null ? ku30Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(footer=");
        sb.append(this.a);
        sb.append(", options=");
        sb.append(this.b);
        sb.append(", hideInlineTrainsTickets=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
