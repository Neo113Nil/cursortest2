package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import defpackage.euy;
import defpackage.gl7;
import defpackage.hsj0;
import defpackage.x4e;

/* loaded from: classes10.dex */
class RequestMonitor$RequestCompleteListener extends CameraCaptureSession.CaptureCallback {
    androidx.concurrent.futures.b mStartRequestCompleter;
    final euy mStartRequestFuture;

    public RequestMonitor$RequestCompleteListener() {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            Object lambda$new$0 = lambda$new$0(bVar);
            if (lambda$new$0 != null) {
                bVar.a = lambda$new$0;
            }
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.mStartRequestFuture = gl7Var;
    }

    private void completeFuture() {
        androidx.concurrent.futures.b bVar = this.mStartRequestCompleter;
        if (bVar != null) {
            bVar.b(null);
            this.mStartRequestCompleter = null;
        }
    }

    private /* synthetic */ Object lambda$new$0(androidx.concurrent.futures.b bVar) throws Exception {
        this.mStartRequestCompleter = bVar;
        return "RequestCompleteListener[" + this + "]";
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        completeFuture();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        completeFuture();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        completeFuture();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        completeFuture();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        completeFuture();
    }
}
