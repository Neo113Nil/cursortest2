package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class z9z0 {
    public abstract float a();

    public abstract float b();

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z9z0 z9z0Var = (z9z0) obj;
        return a() == z9z0Var.a() && b() == z9z0Var.b();
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(a()), Float.valueOf(b()));
    }
}
