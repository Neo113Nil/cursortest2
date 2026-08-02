package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import defpackage.im7;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
final class Camera2CameraControlImpl$CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
    private final Executor mExecutor;
    final Set<im7> mResultListeners = new HashSet();

    public Camera2CameraControlImpl$CameraControlSessionCallback(Executor executor) {
        this.mExecutor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureCompleted$0(TotalCaptureResult totalCaptureResult) {
        HashSet hashSet = new HashSet();
        for (im7 im7Var : this.mResultListeners) {
            if (im7Var.b(totalCaptureResult)) {
                hashSet.add(im7Var);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.mResultListeners.removeAll(hashSet);
    }

    public void addListener(im7 im7Var) {
        this.mResultListeners.add(im7Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.mExecutor.execute(new a(0, this, totalCaptureResult));
    }

    public void removeListener(im7 im7Var) {
        this.mResultListeners.remove(im7Var);
    }
}
