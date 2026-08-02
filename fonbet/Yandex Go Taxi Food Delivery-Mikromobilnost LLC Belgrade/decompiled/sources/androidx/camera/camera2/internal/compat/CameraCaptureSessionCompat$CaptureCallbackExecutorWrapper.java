package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
final class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
    private final Executor mExecutor;
    final CameraCaptureSession.CaptureCallback mWrappedCallback;

    public CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.mExecutor = executor;
        this.mWrappedCallback = captureCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCaptureBufferLost$6(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.mWrappedCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureCompleted$2(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.mWrappedCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureFailed$3(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.mWrappedCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureProgressed$1(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.mWrappedCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureSequenceAborted$5(CameraCaptureSession cameraCaptureSession, int i) {
        this.mWrappedCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureSequenceCompleted$4(CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.mWrappedCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureStarted$0(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.mWrappedCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.d
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper.this.lambda$onCaptureBufferLost$6(cameraCaptureSession, captureRequest, surface, j);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.mExecutor.execute(new b(this, cameraCaptureSession, captureRequest, totalCaptureResult, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.mExecutor.execute(new b(this, cameraCaptureSession, captureRequest, captureFailure, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.mExecutor.execute(new b(this, cameraCaptureSession, captureRequest, captureResult, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        this.mExecutor.execute(new e(this, cameraCaptureSession, i, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.c
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper.this.lambda$onCaptureSequenceCompleted$4(cameraCaptureSession, i, j);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.a
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper.this.lambda$onCaptureStarted$0(cameraCaptureSession, captureRequest, j, j2);
            }
        });
    }
}
