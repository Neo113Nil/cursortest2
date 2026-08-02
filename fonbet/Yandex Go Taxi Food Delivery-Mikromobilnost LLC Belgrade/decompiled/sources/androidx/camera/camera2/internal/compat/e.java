package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ AutoCloseable w;

    public /* synthetic */ e(Object obj, AutoCloseable autoCloseable, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = autoCloseable;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        AutoCloseable autoCloseable = this.w;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper) obj).lambda$onCaptureSequenceAborted$5((CameraCaptureSession) autoCloseable, i2);
                break;
            default:
                ((CameraDeviceCompat$StateCallbackExecutorWrapper) obj).lambda$onError$2((CameraDevice) autoCloseable, i2);
                break;
        }
    }
}
