package xsna;

import java.util.Arrays;

/* compiled from: RotationOptions.kt */
/* loaded from: classes.dex */
public final class eng0 {
    public static final eng0 c = new eng0(-1, false);
    public static final eng0 d = new eng0(-1, true);
    public final int a;
    public final boolean b;

    public eng0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eng0)) {
            return false;
        }
        eng0 eng0Var = (eng0) obj;
        return this.a == eng0Var.a && this.b == eng0Var.b;
    }

    public final int hashCode() {
        return rte0.s(Boolean.valueOf(this.b), Integer.valueOf(this.a));
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)}, 2));
    }
}
