package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ldb0 implements odb0 {
    public final ubb0 a;
    public final kdb0 b;
    public final gbb0 c;
    public final x9b0 d;
    public final b9b0 e;
    public final s8b0 f;

    public ldb0(ubb0 ubb0Var, kdb0 kdb0Var, gbb0 gbb0Var, x9b0 x9b0Var, b9b0 b9b0Var, s8b0 s8b0Var) {
        this.a = ubb0Var;
        this.b = kdb0Var;
        this.c = gbb0Var;
        this.d = x9b0Var;
        this.e = b9b0Var;
        this.f = s8b0Var;
    }

    public final s8b0 a() {
        return this.f;
    }

    public final b9b0 b() {
        return this.e;
    }

    public final x9b0 c() {
        return this.d;
    }

    public final gbb0 d() {
        return this.c;
    }

    public final ubb0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldb0)) {
            return false;
        }
        ldb0 ldb0Var = (ldb0) obj;
        return jl40.l(this.a, ldb0Var.a) && this.b.equals(ldb0Var.b) && this.c.equals(ldb0Var.c) && jl40.l(this.d, ldb0Var.d) && this.e.equals(ldb0Var.e) && jl40.l(this.f, ldb0Var.f);
    }

    public final kdb0 f() {
        return this.b;
    }

    public final int hashCode() {
        ubb0 ubb0Var = this.a;
        int c = unr0.c((this.b.hashCode() + ((ubb0Var == null ? 0 : ubb0Var.hashCode()) * 31)) * 31, 31, this.c.a);
        x9b0 x9b0Var = this.d;
        int hashCode = (this.e.hashCode() + ((c + (x9b0Var == null ? 0 : x9b0Var.hashCode())) * 31)) * 31;
        s8b0 s8b0Var = this.f;
        return hashCode + (s8b0Var != null ? s8b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Content(funFact=" + this.a + ", listViewState=" + this.b + ", filters=" + this.c + ", expandedParentCategoryHeader=" + this.d + ", categories=" + this.e + ", bottomSheetContent=" + this.f + Extension.C_BRAKE;
    }
}
