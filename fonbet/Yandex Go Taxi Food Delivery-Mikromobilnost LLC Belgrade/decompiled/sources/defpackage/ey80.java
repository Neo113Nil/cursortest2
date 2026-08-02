package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes10.dex */
public final class ey80 {
    public final gy80 a;

    public ey80(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new hy80(new OutputConfiguration(i, surface));
        } else {
            this.a = new gy80(new fy80(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ey80)) {
            return false;
        }
        return this.a.equals(((ey80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ey80(OutputConfiguration outputConfiguration) {
        this.a = new hy80(outputConfiguration);
    }

    public ey80(gy80 gy80Var) {
        this.a = gy80Var;
    }
}
