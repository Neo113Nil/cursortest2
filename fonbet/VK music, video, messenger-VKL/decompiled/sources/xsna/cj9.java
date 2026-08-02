package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: CameraManagerCompatApi28Impl.java */
/* loaded from: classes11.dex */
public class cj9 extends ej9 {
    public static boolean c(@NonNull RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ej9, xsna.bj9.a
    @NonNull
    public CameraCharacteristics a(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return super.a(str);
        } catch (RuntimeException e) {
            if (c(e)) {
                throw new CameraAccessExceptionCompat(e);
            }
            throw e;
        }
    }

    @Override // xsna.bj9.a
    public void b(@NonNull String str, @NonNull tli0 tli0Var, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.a.openCamera(str, tli0Var, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!c(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(e4);
        }
    }
}
