package xsna;

import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: SurfaceInfo.java */
/* loaded from: classes12.dex */
public final class njn0 {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public njn0(Surface surface, int i, int i2, int i3, boolean z) {
        fxc0.q(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njn0)) {
            return false;
        }
        njn0 njn0Var = (njn0) obj;
        return this.b == njn0Var.b && this.c == njn0Var.c && this.d == njn0Var.d && this.e == njn0Var.e && this.a.equals(njn0Var.a);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
