package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
final class CameraDeviceCompat$StateCallbackExecutorWrapper extends CameraDevice.StateCallback {
    private final Executor mExecutor;
    final CameraDevice.StateCallback mWrappedCallback;

    public CameraDeviceCompat$StateCallbackExecutorWrapper(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.mExecutor = executor;
        this.mWrappedCallback = stateCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$3(CameraDevice cameraDevice) {
        this.mWrappedCallback.onClosed(cameraDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDisconnected$1(CameraDevice cameraDevice) {
        this.mWrappedCallback.onDisconnected(cameraDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(CameraDevice cameraDevice, int i) {
        this.mWrappedCallback.onError(cameraDevice, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOpened$0(CameraDevice cameraDevice) {
        this.mWrappedCallback.onOpened(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        this.mExecutor.execute(new h(this, cameraDevice, 0));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        this.mExecutor.execute(new h(this, cameraDevice, 1));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        this.mExecutor.execute(new e(this, cameraDevice, i, 1));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        this.mExecutor.execute(new h(this, cameraDevice, 2));
    }
}
