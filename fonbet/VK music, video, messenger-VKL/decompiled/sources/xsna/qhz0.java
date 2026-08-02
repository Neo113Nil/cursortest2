package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class qhz0 {
    public final String a;
    public int b;
    public int c;
    public Object d;

    public qhz0(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            qhz0 qhz0Var = (qhz0) obj;
            if (this.b == qhz0Var.b && this.c == qhz0Var.c && this.a.equals(qhz0Var.a) && Objects.equals(this.d, qhz0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }
}
