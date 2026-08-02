package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b9f0 {
    public final fxy0 a;
    public final fxy0 b;
    public final fxy0 c;
    public final fxy0 d;
    public final fxy0 e;
    public final fxy0 f;
    public final fxy0 g;
    public final fxy0 h;
    public final fxy0 i;

    public b9f0(fxy0 fxy0Var, fxy0 fxy0Var2, fxy0 fxy0Var3, fxy0 fxy0Var4, fxy0 fxy0Var5, fxy0 fxy0Var6, fxy0 fxy0Var7, fxy0 fxy0Var8, fxy0 fxy0Var9) {
        this.a = fxy0Var;
        this.b = fxy0Var2;
        this.c = fxy0Var3;
        this.d = fxy0Var4;
        this.e = fxy0Var5;
        this.f = fxy0Var6;
        this.g = fxy0Var7;
        this.h = fxy0Var8;
        this.i = fxy0Var9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9f0)) {
            return false;
        }
        b9f0 b9f0Var = (b9f0) obj;
        return jl40.l(this.a, b9f0Var.a) && jl40.l(this.b, b9f0Var.b) && jl40.l(this.c, b9f0Var.c) && jl40.l(this.d, b9f0Var.d) && jl40.l(this.e, b9f0Var.e) && jl40.l(this.f, b9f0Var.f) && jl40.l(this.g, b9f0Var.g) && jl40.l(this.h, b9f0Var.h) && jl40.l(this.i, b9f0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        fxy0 fxy0Var = this.c;
        int hashCode2 = (hashCode + (fxy0Var == null ? 0 : fxy0Var.hashCode())) * 31;
        fxy0 fxy0Var2 = this.d;
        int hashCode3 = (hashCode2 + (fxy0Var2 == null ? 0 : fxy0Var2.hashCode())) * 31;
        fxy0 fxy0Var3 = this.e;
        int hashCode4 = (hashCode3 + (fxy0Var3 == null ? 0 : fxy0Var3.hashCode())) * 31;
        fxy0 fxy0Var4 = this.f;
        int hashCode5 = (hashCode4 + (fxy0Var4 == null ? 0 : fxy0Var4.hashCode())) * 31;
        fxy0 fxy0Var5 = this.g;
        int hashCode6 = (hashCode5 + (fxy0Var5 == null ? 0 : fxy0Var5.hashCode())) * 31;
        fxy0 fxy0Var6 = this.h;
        int hashCode7 = (hashCode6 + (fxy0Var6 == null ? 0 : fxy0Var6.hashCode())) * 31;
        fxy0 fxy0Var7 = this.i;
        return hashCode7 + (fxy0Var7 != null ? fxy0Var7.hashCode() : 0);
    }

    public final String toString() {
        return "ProductSkinMiniEntity(backgroundImage=" + this.a + ", backgroundColor=" + this.b + ", titleColor=" + this.c + ", endIconImage=" + this.d + ", raysGradient=" + this.e + ", selectionColor=" + this.f + ", topGradientColor=" + this.g + ", balanceShimmerColor=" + this.h + ", balanceSkeletonColor=" + this.i + Extension.C_BRAKE;
    }
}
