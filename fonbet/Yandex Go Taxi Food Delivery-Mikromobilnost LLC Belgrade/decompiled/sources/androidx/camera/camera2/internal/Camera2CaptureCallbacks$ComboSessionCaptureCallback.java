package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
final class Camera2CaptureCallbacks$ComboSessionCaptureCallback extends CameraCaptureSession.CaptureCallback {
    private final List<CameraCaptureSession.CaptureCallback> mCallbacks = new ArrayList();

    public Camera2CaptureCallbacks$ComboSessionCaptureCallback(List<CameraCaptureSession.CaptureCallback> list) {
        for (CameraCaptureSession.CaptureCallback captureCallback : list) {
            if (!(captureCallback instanceof Camera2CaptureCallbacks$NoOpSessionCaptureCallback)) {
                this.mCallbacks.add(captureCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureSequenceAborted(cameraCaptureSession, i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
