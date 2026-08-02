package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aq70 implements fq70 {
    public final o2y0 a;
    public final d0y0 b;

    public aq70(o2y0 o2y0Var, d0y0 d0y0Var) {
        this.a = o2y0Var;
        this.b = d0y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq70)) {
            return false;
        }
        aq70 aq70Var = (aq70) obj;
        return jl40.l(this.a, aq70Var.a) && jl40.l(this.b, aq70Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d0y0 d0y0Var = this.b;
        return hashCode + (d0y0Var == null ? 0 : d0y0Var.hashCode());
    }

    public final String toString() {
        return "ShowChangeSourcePoint(orderHolder=" + this.a + ", deeplinkData=" + this.b + Extension.C_BRAKE;
    }
}
