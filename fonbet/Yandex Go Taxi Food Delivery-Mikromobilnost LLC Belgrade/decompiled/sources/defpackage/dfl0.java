package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dfl0 {
    public final bpl0 a;
    public final bpl0 b;
    public final yel0 c;
    public final bfl0 d;
    public final mzi0 e;
    public final String f;

    public dfl0(bpl0 bpl0Var, bpl0 bpl0Var2, yel0 yel0Var, bfl0 bfl0Var, mzi0 mzi0Var, String str) {
        this.a = bpl0Var;
        this.b = bpl0Var2;
        this.c = yel0Var;
        this.d = bfl0Var;
        this.e = mzi0Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfl0)) {
            return false;
        }
        dfl0 dfl0Var = (dfl0) obj;
        return this.a.equals(dfl0Var.a) && this.b.equals(dfl0Var.b) && jl40.l(this.c, dfl0Var.c) && this.d.equals(dfl0Var.d) && jl40.l(this.e, dfl0Var.e) && jl40.l(this.f, dfl0Var.f);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        yel0 yel0Var = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((c + (yel0Var == null ? 0 : yel0Var.a.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RouteUiState(staticAddresses=" + this.a + ", movableAddresses=" + this.b + ", addButtonState=" + this.c + ", routeIcons=" + this.d + ", reorderActionLabels=" + this.e + ", removeActionLabel=" + this.f + Extension.C_BRAKE;
    }
}
