package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class puy0 {
    public final wfy0 a;
    public boolean b;

    public puy0(wfy0 wfy0Var, boolean z) {
        this.a = wfy0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj != null && puy0.class == obj.getClass()) {
            puy0 puy0Var = (puy0) obj;
            if (this.b == puy0Var.b && Objects.equals(this.a, puy0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedCard{card=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, '}');
    }
}
