package xsna;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: CameraManagerCompat.java */
/* loaded from: classes11.dex */
public final class bj9 {
    public final cj9 a;
    public final ArrayMap b = new ArrayMap(4);

    /* compiled from: CameraManagerCompat.java */
    public interface a {
        @NonNull
        CameraCharacteristics a(@NonNull String str) throws CameraAccessExceptionCompat;

        void b(@NonNull String str, @NonNull tli0 tli0Var, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;
    }

    public bj9(cj9 cj9Var) {
        this.a = cj9Var;
    }

    @NonNull
    public final tg9 a(@NonNull String str) throws CameraAccessExceptionCompat {
        tg9 tg9Var;
        synchronized (this.b) {
            try {
                tg9Var = (tg9) this.b.get(str);
                if (tg9Var == null) {
                    tg9 tg9Var2 = new tg9(this.a.a(str));
                    this.b.put(str, tg9Var2);
                    tg9Var = tg9Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tg9Var;
    }
}
