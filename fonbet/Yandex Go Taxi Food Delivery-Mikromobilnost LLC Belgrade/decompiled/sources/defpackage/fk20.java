package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fk20 {
    public final v4v a;
    public final nhf0 b;
    public final ejf0 c;

    public fk20(ra90 ra90Var, nhf0 nhf0Var, ejf0 ejf0Var) {
        this.a = ra90Var;
        this.b = nhf0Var;
        this.c = ejf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk20)) {
            return false;
        }
        fk20 fk20Var = (fk20) obj;
        return jl40.l(this.a, fk20Var.a) && this.b.equals(fk20Var.b) && this.c.equals(fk20Var.c);
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        int hashCode = v4vVar == null ? 0 : v4vVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "MissionProgressState(icon=" + this.a + ", badge=" + this.b + ", progressIndicator=" + this.c + Extension.C_BRAKE;
    }
}
