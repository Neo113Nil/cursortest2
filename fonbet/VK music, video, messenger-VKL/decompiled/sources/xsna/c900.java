package xsna;

import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class c900 {
    public final float a;
    public final float b;

    public c900(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && c900.class == obj.getClass()) {
            c900 c900Var = (c900) obj;
            if (Float.compare(this.a, c900Var.a) == 0 && Float.compare(this.b, c900Var.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoudnessMetadata{integratedLufs=");
        sb.append(this.a);
        sb.append(", truePeak=");
        return shy.c(this.b, "}", sb);
    }
}
