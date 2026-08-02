package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;

/* compiled from: Mp4LocationData.java */
/* loaded from: classes12.dex */
public final class vf30 implements fi20.a {
    public final float a;
    public final float b;

    public vf30(float f, float f2) {
        fxc0.q(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf30.class == obj.getClass()) {
            vf30 vf30Var = (vf30) obj;
            if (this.a == vf30Var.a && this.b == vf30Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
