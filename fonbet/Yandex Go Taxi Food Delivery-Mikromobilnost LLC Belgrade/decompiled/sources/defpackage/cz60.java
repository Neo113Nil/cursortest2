package defpackage;

import java.util.Set;

/* loaded from: classes5.dex */
public final class cz60 implements ez60 {
    public final Set a;
    public final iz60 b;

    public cz60(Set set, dz60 dz60Var) {
        iz60 iz60Var = dz60Var.a;
        this.a = set;
        this.b = iz60Var;
    }

    @Override // defpackage.ez60
    public final Set a() {
        return this.a;
    }

    @Override // defpackage.ez60
    public final iz60 b() {
        return this.b;
    }

    @Override // defpackage.ez60
    public final zy60 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz60)) {
            return false;
        }
        cz60 cz60Var = (cz60) obj;
        return jl40.l(this.a, cz60Var.a) && this.b.equals(cz60Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "Reference(sources=" + this.a + ", timeout=" + this.b + ", jump=null)";
    }
}
