package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class lx10 {
    public Double a;
    public Double b;
    public Long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lx10.class == obj.getClass()) {
            lx10 lx10Var = (lx10) obj;
            if (Objects.equals(this.a, lx10Var.a) && Objects.equals(this.b, lx10Var.b) && this.c.equals(lx10Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
