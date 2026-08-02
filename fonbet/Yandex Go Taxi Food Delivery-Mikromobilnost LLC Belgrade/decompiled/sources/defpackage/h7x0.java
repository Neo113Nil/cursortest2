package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h7x0 {
    public final r8i0 a;
    public final String b;
    public final String c;
    public final String d;

    public h7x0(r8i0 r8i0Var, String str) {
        this.a = r8i0Var;
        this.b = str;
        this.c = r8i0Var.b;
        this.d = r8i0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7x0)) {
            return false;
        }
        h7x0 h7x0Var = (h7x0) obj;
        return jl40.l(this.a, h7x0Var.a) && jl40.l(this.b, h7x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TagRatingItemModel(ratingReason=" + this.a + ", imageTag=" + this.b + Extension.C_BRAKE;
    }
}
