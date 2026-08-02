package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.CameraCaptureFailure$Reason;
import defpackage.c06;
import defpackage.d6z;
import defpackage.ny61;
import defpackage.q6x0;
import defpackage.uo7;
import defpackage.xo7;

/* loaded from: classes10.dex */
final class CaptureCallbackAdapter extends CameraCaptureSession.CaptureCallback {
    private final uo7 mCameraCaptureCallback;

    public CaptureCallbackAdapter(uo7 uo7Var) {
        if (uo7Var != null) {
            this.mCameraCaptureCallback = uo7Var;
        } else {
            ny61.t("cameraCaptureCallback is null");
            throw null;
        }
    }

    private int getCaptureConfigId(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof q6x0) && (num = (Integer) ((q6x0) captureRequest.getTag()).a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        q6x0 q6x0Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            d6z.m("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof q6x0);
            q6x0Var = (q6x0) tag;
        } else {
            q6x0Var = q6x0.b;
        }
        this.mCameraCaptureCallback.b(getCaptureConfigId(captureRequest), new c06(q6x0Var, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.mCameraCaptureCallback.c(getCaptureConfigId(captureRequest), new xo7(CameraCaptureFailure$Reason.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.mCameraCaptureCallback.e(getCaptureConfigId(captureRequest));
    }
}
