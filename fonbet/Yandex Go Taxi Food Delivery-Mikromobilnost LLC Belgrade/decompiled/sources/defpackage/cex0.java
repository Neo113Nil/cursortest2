package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cex0 {
    public final m8u0 a;
    public final ob5 b;
    public final htz0 c;
    public final bpl0 d;
    public final hhp0 e;

    public cex0(m8u0 m8u0Var, ob5 ob5Var, htz0 htz0Var, bpl0 bpl0Var, hhp0 hhp0Var) {
        this.a = m8u0Var;
        this.b = ob5Var;
        this.c = htz0Var;
        this.d = bpl0Var;
        this.e = hhp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cex0)) {
            return false;
        }
        cex0 cex0Var = (cex0) obj;
        return jl40.l(this.a, cex0Var.a) && this.b.equals(cex0Var.b) && jl40.l(this.c, cex0Var.c) && this.d.equals(cex0Var.d) && jl40.l(this.e, cex0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a);
        hhp0 hhp0Var = this.e;
        return c + (hhp0Var == null ? 0 : hhp0Var.hashCode());
    }

    public final String toString() {
        return "TariffCardUiState(statusBarUiState=" + this.a + ", baseTariffInfoUiState=" + this.b + ", toolbarUiState=" + this.c + ", itemsUiState=" + this.d + ", scrollButtonUiState=" + this.e + Extension.C_BRAKE;
    }
}
