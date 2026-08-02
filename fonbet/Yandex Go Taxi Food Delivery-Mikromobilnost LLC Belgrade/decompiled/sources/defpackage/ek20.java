package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ek20 {
    public final w4v a;
    public final mhf0 b;
    public final djf0 c;

    public ek20(w4v w4vVar, mhf0 mhf0Var, djf0 djf0Var) {
        this.a = w4vVar;
        this.b = mhf0Var;
        this.c = djf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek20)) {
            return false;
        }
        ek20 ek20Var = (ek20) obj;
        return jl40.l(this.a, ek20Var.a) && this.b.equals(ek20Var.b) && this.c.equals(ek20Var.c);
    }

    public final int hashCode() {
        w4v w4vVar = this.a;
        int hashCode = w4vVar == null ? 0 : w4vVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "MissionProgressModel(icon=" + this.a + ", badge=" + this.b + ", progressIndicator=" + this.c + Extension.C_BRAKE;
    }
}
