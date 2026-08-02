package defpackage;

import com.yandex.go.dto.response.q1;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ndw0 {
    public final mdw0 a;
    public final String b;
    public final String c;
    public final q1 d;
    public final List e;
    public final List f;
    public final hdw0 g;
    public final boolean h;

    public ndw0(mdw0 mdw0Var, String str, String str2, q1 q1Var, List list, List list2, hdw0 hdw0Var, boolean z) {
        this.a = mdw0Var;
        this.b = str;
        this.c = str2;
        this.d = q1Var;
        this.e = list;
        this.f = list2;
        this.g = hdw0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndw0)) {
            return false;
        }
        ndw0 ndw0Var = (ndw0) obj;
        return jl40.l(this.a, ndw0Var.a) && jl40.l(this.b, ndw0Var.b) && jl40.l(this.c, ndw0Var.c) && jl40.l(this.d, ndw0Var.d) && this.e.equals(ndw0Var.e) && this.f.equals(ndw0Var.f) && jl40.l(this.g, ndw0Var.g) && this.h == ndw0Var.h;
    }

    public final int hashCode() {
        mdw0 mdw0Var = this.a;
        int hashCode = (mdw0Var == null ? 0 : mdw0Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        q1 q1Var = this.d;
        int c = unr0.c(unr0.c((hashCode3 + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31, this.e), 31, this.f);
        hdw0 hdw0Var = this.g;
        return Boolean.hashCode(this.h) + ((c + (hdw0Var != null ? hdw0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperappSearchbarConfiguration(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", subtitleLeadIconTag=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", leadButtons=");
        nnm.w(sb, this.e, ", trailButtons=", this.f, ", collapsedButton=");
        sb.append(this.g);
        sb.append(", isHapticEnabled=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
