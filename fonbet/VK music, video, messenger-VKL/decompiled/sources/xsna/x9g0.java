package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: ResizeOptions.kt */
/* loaded from: classes12.dex */
public final class x9g0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;

    public x9g0(int i, int i2) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x9g0)) {
            return false;
        }
        x9g0 x9g0Var = (x9g0) obj;
        return this.a == x9g0Var.a && this.b == x9g0Var.b;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }

    public x9g0(float f, int i, int i2, int i3) {
        f = (i3 & 4) != 0 ? 2048.0f : f;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = 0.6666667f;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
