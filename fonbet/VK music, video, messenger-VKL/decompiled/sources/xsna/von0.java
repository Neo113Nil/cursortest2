package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;

/* compiled from: SynchronizedCaptureSession.java */
/* loaded from: classes11.dex */
public interface von0 {
    @NonNull
    jg9 b();

    int c(@NonNull CaptureRequest captureRequest, @NonNull af9 af9Var) throws CameraAccessException;

    void close();

    @NonNull
    ugz<Void> d(@NonNull String str);

    @NonNull
    xon0 e();

    /* compiled from: SynchronizedCaptureSession.java */
    public static abstract class a {
        public void g(@NonNull xon0 xon0Var) {
        }

        public void h(@NonNull xon0 xon0Var) {
        }

        public void i(@NonNull von0 von0Var) {
        }

        public void j(@NonNull von0 von0Var) {
        }

        public void k(@NonNull xon0 xon0Var) {
        }

        public void l(@NonNull xon0 xon0Var) {
        }

        public void m(@NonNull xon0 xon0Var, @NonNull Surface surface) {
        }
    }
}
