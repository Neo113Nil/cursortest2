package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraCaptureFailure;

/* compiled from: CaptureCallbackAdapter.java */
/* loaded from: classes11.dex */
public final class bs9 extends CameraCaptureSession.CaptureCallback {
    public final gg9 a;

    public bs9(gg9 gg9Var) {
        if (gg9Var == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.a = gg9Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        d0o0 d0o0Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            obr.a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof d0o0);
            d0o0Var = (d0o0) tag;
        } else {
            d0o0Var = d0o0.b;
        }
        this.a.b(new he9(d0o0Var, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.a.c(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }
}
