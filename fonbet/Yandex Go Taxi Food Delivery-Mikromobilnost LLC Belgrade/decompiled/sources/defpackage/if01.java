package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class if01 implements jf01 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public if01(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if01)) {
            return false;
        }
        if01 if01Var = (if01) obj;
        return this.a == if01Var.a && this.b == if01Var.b && this.c == if01Var.c && this.d == if01Var.d && this.e == if01Var.e && this.f == if01Var.f;
    }

    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Loading(isDivKitLayoutShimmerVisible=", ", isDivKitFeedShimmerVisible=", ", isDivkitFeedShimmerToolbarVisible=", this.a, this.b);
        nnm.v(", isDivKitFeedHeaderShimmerVisible=", ", isNativeShimmerWithoutFiltersVisible=", u, this.c, this.d);
        return smw0.k(", isNativeShimmerVisible=", Extension.C_BRAKE, u, this.e, this.f);
    }
}
