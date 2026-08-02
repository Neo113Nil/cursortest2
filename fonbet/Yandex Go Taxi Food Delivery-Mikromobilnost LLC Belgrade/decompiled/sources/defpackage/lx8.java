package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class lx8 extends wgj0 {
    public final String a;
    public final List b;

    public lx8(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx8)) {
            return false;
        }
        lx8 lx8Var = (lx8) obj;
        return jl40.l(this.a, lx8Var.a) && jl40.l(this.b, lx8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
