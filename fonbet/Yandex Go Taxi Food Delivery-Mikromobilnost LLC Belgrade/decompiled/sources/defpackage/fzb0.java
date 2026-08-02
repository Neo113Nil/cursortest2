package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class fzb0 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public fzb0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzb0)) {
            return false;
        }
        fzb0 fzb0Var = (fzb0) obj;
        return jl40.l(this.a, fzb0Var.a) && jl40.l(this.b, fzb0Var.b) && jl40.l(this.c, fzb0Var.c) && jl40.l(this.d, fzb0Var.d) && jl40.l(this.e, fzb0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = qv10.v("Output(covered=", this.a, ", uncovered=", this.b, ", selected=");
        nnm.w(v, this.c, ", outdated=", this.d, ", hiddenByClustering=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
