package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import defpackage.q38;
import defpackage.uo7;
import defpackage.vo7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class m {
    public static CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return new Camera2CaptureCallbacks$ComboSessionCaptureCallback(Arrays.asList(captureCallbackArr));
    }

    public static CameraDevice.StateCallback b(final ArrayList arrayList) {
        return arrayList.isEmpty() ? new CameraDeviceStateCallbacks$NoOpDeviceStateCallback() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new CameraDevice.StateCallback(arrayList) { // from class: androidx.camera.camera2.internal.CameraDeviceStateCallbacks$ComboDeviceStateCallback
            private final List<CameraDevice.StateCallback> mCallbacks = new ArrayList();

            {
                for (CameraDevice.StateCallback stateCallback : arrayList) {
                    if (!(stateCallback instanceof CameraDeviceStateCallbacks$NoOpDeviceStateCallback)) {
                        this.mCallbacks.add(stateCallback);
                    }
                }
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(CameraDevice cameraDevice) {
                Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onClosed(cameraDevice);
                }
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onDisconnected(cameraDevice);
                }
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i) {
                Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onError(cameraDevice, i);
                }
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onOpened(cameraDevice);
                }
            }
        };
    }

    public static void c(uo7 uo7Var, ArrayList arrayList) {
        if (uo7Var instanceof vo7) {
            Iterator it = ((vo7) uo7Var).a.iterator();
            while (it.hasNext()) {
                c((uo7) it.next(), arrayList);
            }
        } else if (uo7Var instanceof q38) {
            arrayList.add(((q38) uo7Var).a);
        } else {
            arrayList.add(new CaptureCallbackAdapter(uo7Var));
        }
    }
}
