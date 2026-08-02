package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ak81 {
    public final String a;
    public final Long b;
    public final boolean c;
    public final boolean d;
    public final vn61 e;

    public ak81(String str, Long l, boolean z, boolean z2, vn61 vn61Var) {
        this.a = str;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = vn61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak81)) {
            return false;
        }
        ak81 ak81Var = (ak81) obj;
        return jl40.l(this.a, ak81Var.a) && jl40.l(this.b, ak81Var.b) && this.c == ak81Var.c && this.d == ak81Var.d && jl40.l(this.e, ak81Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int e = unr0.e(unr0.e((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31, this.d);
        vn61 vn61Var = this.e;
        return e + (vn61Var != null ? vn61Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Settings(templateType=");
        sb.append(this.a);
        sb.append(", multiBannerAutoScrollInterval=");
        sb.append(this.b);
        sb.append(", isHighlightingEnabled=");
        nnm.v(", isLoopingVideo=", ", mediaAssetImageFallbackSize=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
