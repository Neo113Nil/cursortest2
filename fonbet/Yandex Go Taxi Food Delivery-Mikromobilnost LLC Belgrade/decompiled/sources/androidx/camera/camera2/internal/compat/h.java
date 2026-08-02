package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes10.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper b;
    public final /* synthetic */ CameraDevice c;

    public /* synthetic */ h(CameraDeviceCompat$StateCallbackExecutorWrapper cameraDeviceCompat$StateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.a = i;
        this.b = cameraDeviceCompat$StateCallbackExecutorWrapper;
        this.c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CameraDevice cameraDevice = this.c;
        CameraDeviceCompat$StateCallbackExecutorWrapper cameraDeviceCompat$StateCallbackExecutorWrapper = this.b;
        switch (i) {
            case 0:
                cameraDeviceCompat$StateCallbackExecutorWrapper.lambda$onClosed$3(cameraDevice);
                break;
            case 1:
                cameraDeviceCompat$StateCallbackExecutorWrapper.lambda$onDisconnected$1(cameraDevice);
                break;
            default:
                cameraDeviceCompat$StateCallbackExecutorWrapper.lambda$onOpened$0(cameraDevice);
                break;
        }
    }
}
