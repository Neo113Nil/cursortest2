package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes10.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper b;
    public final /* synthetic */ CameraCaptureSession c;

    public /* synthetic */ f(CameraCaptureSessionCompat$StateCallbackExecutorWrapper cameraCaptureSessionCompat$StateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.a = i;
        this.b = cameraCaptureSessionCompat$StateCallbackExecutorWrapper;
        this.c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CameraCaptureSession cameraCaptureSession = this.c;
        CameraCaptureSessionCompat$StateCallbackExecutorWrapper cameraCaptureSessionCompat$StateCallbackExecutorWrapper = this.b;
        switch (i) {
            case 0:
                cameraCaptureSessionCompat$StateCallbackExecutorWrapper.lambda$onActive$3(cameraCaptureSession);
                break;
            case 1:
                cameraCaptureSessionCompat$StateCallbackExecutorWrapper.lambda$onClosed$5(cameraCaptureSession);
                break;
            case 2:
                cameraCaptureSessionCompat$StateCallbackExecutorWrapper.lambda$onCaptureQueueEmpty$4(cameraCaptureSession);
                break;
            case 3:
                cameraCaptureSessionCompat$StateCallbackExecutorWrapper.lambda$onConfigured$0(cameraCaptureSession);
                break;
            case 4:
                cameraCaptureSessionCompat$StateCallbackExecutorWrapper.lambda$onReady$2(cameraCaptureSession);
                break;
            default:
                cameraCaptureSessionCompat$StateCallbackExecutorWrapper.lambda$onConfigureFailed$1(cameraCaptureSession);
                break;
        }
    }
}
