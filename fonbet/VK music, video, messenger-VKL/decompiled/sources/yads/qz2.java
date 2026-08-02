package yads;

import xsna.epx;
import xsna.gsi0;
import xsna.qoy;

/* loaded from: classes10.dex */
public final class qz2 {
    public final String a;
    public final Long b;
    public final boolean c;
    public final boolean d;
    public final c13 e;

    public qz2(String str, Long l, boolean z, boolean z2, c13 c13Var) {
        this.a = str;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = c13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz2)) {
            return false;
        }
        qz2 qz2Var = (qz2) obj;
        return epx.f(this.a, qz2Var.a) && epx.f(this.b, qz2Var.b) && this.c == qz2Var.c && this.d == qz2Var.d && epx.f(this.e, qz2Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int b = qoy.b(qoy.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31, this.d);
        c13 c13Var = this.e;
        return b + (c13Var != null ? c13Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        Long l = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        c13 c13Var = this.e;
        StringBuilder sb = new StringBuilder("Settings(templateType=");
        sb.append(str);
        sb.append(", multiBannerAutoScrollInterval=");
        sb.append(l);
        sb.append(", isHighlightingEnabled=");
        gsi0.c(sb, z, ", isLoopingVideo=", z2, ", mediaAssetImageFallbackSize=");
        sb.append(c13Var);
        sb.append(")");
        return sb.toString();
    }
}
