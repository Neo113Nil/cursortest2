package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
final class CameraCaptureSessionCompat$StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
    private final Executor mExecutor;
    final CameraCaptureSession.StateCallback mWrappedCallback;

    public CameraCaptureSessionCompat$StateCallbackExecutorWrapper(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.mExecutor = executor;
        this.mWrappedCallback = stateCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActive$3(CameraCaptureSession cameraCaptureSession) {
        this.mWrappedCallback.onActive(cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCaptureQueueEmpty$4(CameraCaptureSession cameraCaptureSession) {
        this.mWrappedCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$5(CameraCaptureSession cameraCaptureSession) {
        this.mWrappedCallback.onClosed(cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfigureFailed$1(CameraCaptureSession cameraCaptureSession) {
        this.mWrappedCallback.onConfigureFailed(cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfigured$0(CameraCaptureSession cameraCaptureSession) {
        this.mWrappedCallback.onConfigured(cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReady$2(CameraCaptureSession cameraCaptureSession) {
        this.mWrappedCallback.onReady(cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onSurfacePrepared$6(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.mWrappedCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        this.mExecutor.execute(new f(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.mExecutor.execute(new f(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.mExecutor.execute(new f(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.mExecutor.execute(new f(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.mExecutor.execute(new f(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        this.mExecutor.execute(new f(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.g
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSessionCompat$StateCallbackExecutorWrapper.this.lambda$onSurfacePrepared$6(cameraCaptureSession, surface);
            }
        });
    }
}
