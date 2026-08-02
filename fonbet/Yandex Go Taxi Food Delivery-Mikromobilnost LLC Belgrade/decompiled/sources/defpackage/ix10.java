package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class ix10 {
    public Boolean a;
    public Boolean b;
    public Long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ix10.class == obj.getClass()) {
            ix10 ix10Var = (ix10) obj;
            if (this.a.equals(ix10Var.a) && this.b.equals(ix10Var.b) && Objects.equals(this.c, ix10Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
