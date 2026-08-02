package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CameraCaptureSessionStateCallbacks.java */
/* loaded from: classes11.dex */
public final class mg9 extends CameraCaptureSession.StateCallback {
    public final ArrayList a = new ArrayList();

    public mg9(@NonNull List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof ng9)) {
                this.a.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
        }
    }
}
