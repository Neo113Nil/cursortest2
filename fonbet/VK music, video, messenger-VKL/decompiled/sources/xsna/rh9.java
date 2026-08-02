package xsna;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CameraDeviceStateCallbacks.java */
/* loaded from: classes11.dex */
public final class rh9 extends CameraDevice.StateCallback {
    public final ArrayList a = new ArrayList();

    public rh9(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof sh9)) {
                this.a.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(@NonNull CameraDevice cameraDevice) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(@NonNull CameraDevice cameraDevice, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(@NonNull CameraDevice cameraDevice) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
        }
    }
}
