package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ndb0 implements odb0 {
    public final gbb0 a;
    public final b9b0 b;
    public final x9b0 c;

    public ndb0(gbb0 gbb0Var, b9b0 b9b0Var, w9b0 w9b0Var) {
        jdb0 jdb0Var = jdb0.a;
        this.a = gbb0Var;
        this.b = b9b0Var;
        this.c = w9b0Var;
    }

    public final b9b0 a() {
        return this.b;
    }

    public final x9b0 b() {
        return this.c;
    }

    public final gbb0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndb0)) {
            return false;
        }
        ndb0 ndb0Var = (ndb0) obj;
        jdb0 jdb0Var = jdb0.a;
        return jdb0Var.equals(jdb0Var) && this.a.equals(ndb0Var.a) && this.b.equals(ndb0Var.b) && jl40.l(this.c, ndb0Var.c);
    }

    public final int hashCode() {
        jdb0 jdb0Var = jdb0.a;
        int hashCode = (this.b.hashCode() + unr0.c(-159318773, 31, this.a.a)) * 31;
        x9b0 x9b0Var = this.c;
        return hashCode + (x9b0Var == null ? 0 : x9b0Var.hashCode());
    }

    public final String toString() {
        return "FullLoading(listSkeleton=" + jdb0.a + ", filtersSkeleton=" + this.a + ", categoriesSkeleton=" + this.b + ", expandedParentCategoryHeaderSkeleton=" + this.c + Extension.C_BRAKE;
    }
}
