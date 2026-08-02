package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class hx10 {
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hx10.class == obj.getClass()) {
            hx10 hx10Var = (hx10) obj;
            if (this.a.equals(hx10Var.a) && Objects.equals(this.b, hx10Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
