package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class d56 {
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final int[] e;
    public final String f;

    public d56(c56 c56Var) {
        this.a = c56Var.a;
        this.b = c56Var.b;
        this.c = c56Var.c;
        List list = c56Var.d;
        if (list == null) {
            ny61.r("polygon must not be null");
            throw null;
        }
        this.d = list;
        int[] iArr = c56Var.e;
        if (iArr == null) {
            ny61.r("zoomRange must not be null");
            throw null;
        }
        this.e = iArr;
        this.f = c56Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d56.class.equals(obj.getClass())) {
            return false;
        }
        d56 d56Var = (d56) obj;
        if (this.a == d56Var.a && this.b == d56Var.b && this.c == d56Var.c && jl40.l(this.d, d56Var.d)) {
            return Arrays.equals(this.e, d56Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + unr0.c(((((this.a * 31) + this.b) * 31) + this.c) * 31, 31, this.d);
    }
}
