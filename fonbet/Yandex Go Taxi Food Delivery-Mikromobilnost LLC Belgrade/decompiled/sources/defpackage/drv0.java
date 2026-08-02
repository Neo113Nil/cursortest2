package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class drv0 {
    public final String a;
    public final int b;
    public final List c;

    public drv0(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drv0)) {
            return false;
        }
        drv0 drv0Var = (drv0) obj;
        return jl40.l(this.a, drv0Var.a) && this.b == drv0Var.b && jl40.l(this.c, drv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }
}
