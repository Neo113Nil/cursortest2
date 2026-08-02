package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mr01 {
    public final List a;
    public final j5x0 b;
    public final stz0 c;

    public mr01(List list, j5x0 j5x0Var, stz0 stz0Var) {
        this.a = list;
        this.b = j5x0Var;
        this.c = stz0Var;
    }

    public final List a() {
        return this.a;
    }

    public final j5x0 b() {
        return this.b;
    }

    public final stz0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr01)) {
            return false;
        }
        mr01 mr01Var = (mr01) obj;
        return this.a.equals(mr01Var.a) && jl40.l(this.b, mr01Var.b) && this.c.equals(mr01Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j5x0 j5x0Var = this.b;
        return this.c.hashCode() + ((hashCode + (j5x0Var == null ? 0 : j5x0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "TransferRequisiteViewState(fields=" + this.a + ", tabViewState=" + this.b + ", toolbarViewState=" + this.c + Extension.C_BRAKE;
    }
}
