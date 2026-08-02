package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class viy0 implements dhz0 {
    public final int a;
    public final z9z0 b;

    public viy0(int i, z9z0 z9z0Var) {
        this.a = i;
        this.b = z9z0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != null && viy0.class == obj.getClass()) {
            viy0 viy0Var = (viy0) obj;
            if (this.a == viy0Var.a && Objects.equals(this.b, viy0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}
