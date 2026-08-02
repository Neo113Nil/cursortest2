package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class luk0 {
    public final xuk0 a;
    public final vtk0 b;
    public final List c;
    public final uoj d;
    public final utk0 e;

    public luk0(xuk0 xuk0Var, vtk0 vtk0Var, List list, uoj uojVar, utk0 utk0Var) {
        this.a = xuk0Var;
        this.b = vtk0Var;
        this.c = list;
        this.d = uojVar;
        this.e = utk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luk0)) {
            return false;
        }
        luk0 luk0Var = (luk0) obj;
        return this.a.equals(luk0Var.a) && this.b.equals(luk0Var.b) && this.c.equals(luk0Var.c) && jl40.l(this.d, luk0Var.d) && this.e.equals(luk0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c);
        uoj uojVar = this.d;
        return this.e.hashCode() + ((c + (uojVar == null ? 0 : uojVar.hashCode())) * 31);
    }

    public final String toString() {
        return "RoadsPaneUiState(toolbarUiState=" + this.a + ", headerUiState=" + this.b + ", roads=" + this.c + ", discountUiState=" + this.d + ", buttonUiState=" + this.e + Extension.C_BRAKE;
    }
}
