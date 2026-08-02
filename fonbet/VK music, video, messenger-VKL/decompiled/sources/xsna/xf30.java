package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;

/* compiled from: Mp4OrientationData.java */
/* loaded from: classes12.dex */
public final class xf30 implements fi20.a {
    public final int a;

    public xf30(int i) {
        fxc0.q(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf30) && this.a == ((xf30) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        return "Orientation= " + this.a;
    }
}
