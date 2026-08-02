package xsna;

import xsna.wly;

/* compiled from: DeviceRotationOfFrameAfterFlipAdjuster.kt */
/* loaded from: classes11.dex */
public final class o6m {
    public final wly a;
    public final boolean b;

    public o6m(wly wlyVar, boolean z) {
        this.a = wlyVar;
        this.b = z;
    }

    public final float a(float f) {
        wly.a a = this.a.a();
        if (!a.a || (!a.b && this.b)) {
            if (f == 90.0f) {
                return 270.0f;
            }
            if (f == 270.0f) {
                return 90.0f;
            }
        }
        return f;
    }
}
