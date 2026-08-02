package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest w;
    public final /* synthetic */ Object x;

    public /* synthetic */ b(CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper cameraCaptureSessionCompat$CaptureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Object obj, int i) {
        this.a = i;
        this.b = cameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;
        this.c = cameraCaptureSession;
        this.w = captureRequest;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        CaptureRequest captureRequest = this.w;
        CameraCaptureSession cameraCaptureSession = this.c;
        CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper cameraCaptureSessionCompat$CaptureCallbackExecutorWrapper = this.b;
        switch (i) {
            case 0:
                cameraCaptureSessionCompat$CaptureCallbackExecutorWrapper.lambda$onCaptureCompleted$2(cameraCaptureSession, captureRequest, (TotalCaptureResult) obj);
                break;
            case 1:
                cameraCaptureSessionCompat$CaptureCallbackExecutorWrapper.lambda$onCaptureProgressed$1(cameraCaptureSession, captureRequest, (CaptureResult) obj);
                break;
            default:
                cameraCaptureSessionCompat$CaptureCallbackExecutorWrapper.lambda$onCaptureFailed$3(cameraCaptureSession, captureRequest, (CaptureFailure) obj);
                break;
        }
    }
}
