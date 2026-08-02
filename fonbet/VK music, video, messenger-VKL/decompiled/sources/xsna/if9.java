package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;

/* compiled from: Camera2ImplConfig.java */
/* loaded from: classes11.dex */
public final class if9 extends fs9 {
    public static final androidx.camera.core.impl.a t = Config.a.a(Integer.TYPE, "camera2.captureRequest.templateType");
    public static final androidx.camera.core.impl.a u = Config.a.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");
    public static final androidx.camera.core.impl.a v = Config.a.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");
    public static final androidx.camera.core.impl.a w = Config.a.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");
    public static final androidx.camera.core.impl.a x = Config.a.a(ki9.class, "camera2.cameraEvent.callback");
    public static final androidx.camera.core.impl.a y = Config.a.a(Object.class, "camera2.captureRequest.tag");

    /* compiled from: Camera2ImplConfig.java */
    public static final class a implements hbq<if9> {
        public final androidx.camera.core.impl.n a = androidx.camera.core.impl.n.z();

        @NonNull
        public final void a(@NonNull CaptureRequest.Key key, @NonNull Object obj) {
            androidx.camera.core.impl.a aVar = if9.t;
            this.a.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key.getName(), Object.class, key), obj);
        }

        @Override // xsna.hbq
        @NonNull
        public final androidx.camera.core.impl.m d() {
            throw null;
        }
    }
}
