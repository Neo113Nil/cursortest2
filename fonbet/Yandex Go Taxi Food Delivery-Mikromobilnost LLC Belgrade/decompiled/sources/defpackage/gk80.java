package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gk80 {
    public final Double a;
    public final String b;

    public gk80(Double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk80)) {
            return false;
        }
        gk80 gk80Var = (gk80) obj;
        return jl40.l(this.a, gk80Var.a) && jl40.l(this.b, gk80Var.b);
    }

    public final int hashCode() {
        Double d = this.a;
        return this.b.hashCode() + ((d == null ? 0 : d.hashCode()) * 31);
    }

    public final String toString() {
        return "OrganizationPreviewRating(score=" + this.a + ", ratingAmount=" + this.b + Extension.C_BRAKE;
    }

    public gk80() {
        this(null, "");
    }
}
