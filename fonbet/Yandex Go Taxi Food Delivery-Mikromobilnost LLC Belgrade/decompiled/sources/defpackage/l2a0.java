package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l2a0 {
    public final cyu0 a;
    public final cyu0 b;
    public final cyu0 c;
    public final cyu0 d;
    public final v4v e;
    public final boolean f;
    public final boolean g;
    public final zx90 h;
    public final v4v i;

    public l2a0(cyu0 cyu0Var, cyu0 cyu0Var2, cyu0 cyu0Var3, cyu0 cyu0Var4, cuj0 cuj0Var, boolean z, boolean z2, zx90 zx90Var, ra90 ra90Var) {
        this.a = cyu0Var;
        this.b = cyu0Var2;
        this.c = cyu0Var3;
        this.d = cyu0Var4;
        this.e = cuj0Var;
        this.f = z;
        this.g = z2;
        this.h = zx90Var;
        this.i = ra90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2a0)) {
            return false;
        }
        l2a0 l2a0Var = (l2a0) obj;
        return this.a.equals(l2a0Var.a) && jl40.l(this.b, l2a0Var.b) && jl40.l(this.c, l2a0Var.c) && jl40.l(this.d, l2a0Var.d) && jl40.l(this.e, l2a0Var.e) && this.f == l2a0Var.f && this.g == l2a0Var.g && this.h.equals(l2a0Var.h) && jl40.l(this.i, l2a0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cyu0 cyu0Var = this.b;
        int hashCode2 = (hashCode + (cyu0Var == null ? 0 : cyu0Var.hashCode())) * 31;
        cyu0 cyu0Var2 = this.c;
        int hashCode3 = (hashCode2 + (cyu0Var2 == null ? 0 : cyu0Var2.hashCode())) * 31;
        cyu0 cyu0Var3 = this.d;
        int hashCode4 = (hashCode3 + (cyu0Var3 == null ? 0 : cyu0Var3.hashCode())) * 31;
        v4v v4vVar = this.e;
        int c = unr0.c(unr0.e(unr0.e((hashCode4 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h.a);
        v4v v4vVar2 = this.i;
        return c + (v4vVar2 != null ? v4vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentItemModel(title=" + this.a + ", subtitle=" + this.b + ", trailTitle=" + this.c + ", trailSubtitle=" + this.d + ", trailIcon=" + this.e + ", isEnabled=" + this.f + ", isClickable=" + this.g + ", clickPayload=" + this.h + ", leadIcon=" + this.i + Extension.C_BRAKE;
    }
}
