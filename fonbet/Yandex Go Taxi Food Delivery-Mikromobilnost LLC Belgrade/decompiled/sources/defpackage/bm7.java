package defpackage;

import android.hardware.camera2.CaptureFailure;
import androidx.camera.core.impl.CameraCaptureFailure$Reason;

/* loaded from: classes10.dex */
public final class bm7 extends xo7 {
    public final CaptureFailure b;

    public bm7(CameraCaptureFailure$Reason cameraCaptureFailure$Reason, CaptureFailure captureFailure) {
        super(cameraCaptureFailure$Reason);
        this.b = captureFailure;
    }

    @Override // defpackage.xo7
    public final Object a() {
        return this.b;
    }
}
