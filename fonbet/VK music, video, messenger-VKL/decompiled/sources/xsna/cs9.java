package xsna;

import android.hardware.camera2.CameraCaptureSession;

/* compiled from: CaptureCallbackContainer.java */
/* loaded from: classes11.dex */
public final class cs9 extends gg9 {
    public final CameraCaptureSession.CaptureCallback a;

    public cs9(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.a = captureCallback;
    }
}
