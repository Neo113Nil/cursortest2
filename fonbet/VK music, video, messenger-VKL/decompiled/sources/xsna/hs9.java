package xsna;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: CaptureSessionRepository.java */
/* loaded from: classes11.dex */
public final class hs9 {

    @NonNull
    public final tli0 a;
    public final Object b = new Object();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final HashMap f = new HashMap();
    public final a g = new a();

    public hs9(@NonNull tli0 tli0Var) {
        this.a = tli0Var;
    }

    /* compiled from: CaptureSessionRepository.java */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            hs9.this.a.execute(new kv3(this, 3));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            hs9.this.a.execute(new kv3(this, 3));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
        }
    }
}
