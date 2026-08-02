package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mri extends uri {
    public final List a;
    public final gv90 b;
    public final boolean c;
    public final String d;

    public mri(List list, gv90 gv90Var, boolean z, String str) {
        this.a = list;
        this.b = gv90Var;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mri)) {
            return false;
        }
        mri mriVar = (mri) obj;
        return jl40.l(this.a, mriVar.a) && jl40.l(this.b, mriVar.b) && this.c == mriVar.c && jl40.l(this.d, mriVar.d);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        gv90 gv90Var = this.b;
        int e = unr0.e((hashCode + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photos(photocomments=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", isShimmering=");
        return n.m(", metricaLabel=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
