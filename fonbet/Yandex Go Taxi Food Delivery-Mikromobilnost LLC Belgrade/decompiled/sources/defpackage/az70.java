package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class az70 {
    public final o2y0 a;
    public final List b;

    public az70(List list, o2y0 o2y0Var) {
        this.a = o2y0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az70)) {
            return false;
        }
        az70 az70Var = (az70) obj;
        return jl40.l(this.a, az70Var.a) && jl40.l(this.b, az70Var.b);
    }

    public final int hashCode() {
        o2y0 o2y0Var = this.a;
        return this.b.hashCode() + ((o2y0Var == null ? 0 : o2y0Var.hashCode()) * 31);
    }
}
