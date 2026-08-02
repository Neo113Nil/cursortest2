package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ejz0 implements dhz0 {
    public final int a;

    public ejz0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && ejz0.class == obj.getClass()) {
            if (this.a == ((ejz0) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }
}
