package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: CameraManagerCompatApi29Impl.java */
/* loaded from: classes11.dex */
public final class dj9 extends cj9 {
    @Override // xsna.cj9, xsna.ej9, xsna.bj9.a
    @NonNull
    public final CameraCharacteristics a(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // xsna.cj9, xsna.bj9.a
    public final void b(@NonNull String str, @NonNull tli0 tli0Var, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.a.openCamera(str, tli0Var, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
