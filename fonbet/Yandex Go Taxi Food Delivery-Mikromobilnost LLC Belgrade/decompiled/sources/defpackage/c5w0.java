package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c5w0 {
    public final b5w0 a;
    public final String b;
    public final String c;
    public final y4w0 d;
    public final List e;
    public final List f;

    public c5w0(a5w0 a5w0Var, String str, String str2, y4w0 y4w0Var, List list, List list2) {
        this.a = a5w0Var;
        this.b = str;
        this.c = str2;
        this.d = y4w0Var;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5w0)) {
            return false;
        }
        c5w0 c5w0Var = (c5w0) obj;
        return jl40.l(this.a, c5w0Var.a) && jl40.l(this.b, c5w0Var.b) && jl40.l(this.c, c5w0Var.c) && jl40.l(this.d, c5w0Var.d) && this.e.equals(c5w0Var.e) && this.f.equals(c5w0Var.f);
    }

    public final int hashCode() {
        b5w0 b5w0Var = this.a;
        int hashCode = (b5w0Var == null ? 0 : ((a5w0) b5w0Var).a.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        y4w0 y4w0Var = this.d;
        return this.f.hashCode() + unr0.c((hashCode3 + (y4w0Var != null ? y4w0Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppMapSearchbarState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", subtitleLeadIconTag=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", leadButtons=");
        return vfc.p(sb, this.e, ", trailButtons=", this.f, Extension.C_BRAKE);
    }
}
