package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;

/* compiled from: SmtaMetadataEntry.java */
/* loaded from: classes12.dex */
public final class y6k0 implements fi20.a {
    public final float a;
    public final int b;

    public y6k0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y6k0.class == obj.getClass()) {
            y6k0 y6k0Var = (y6k0) obj;
            if (this.a == y6k0Var.a && this.b == y6k0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
