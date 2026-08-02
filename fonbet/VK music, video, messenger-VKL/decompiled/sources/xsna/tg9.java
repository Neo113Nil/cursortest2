package xsna;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: CameraCharacteristicsCompat.java */
/* loaded from: classes11.dex */
public final class tg9 {

    @NonNull
    public final HashMap a = new HashMap();

    @NonNull
    public final CameraCharacteristics b;

    public tg9(@NonNull CameraCharacteristics cameraCharacteristics) {
        this.b = cameraCharacteristics;
    }

    @Nullable
    public final <T> T a(@NonNull CameraCharacteristics.Key<T> key) {
        synchronized (this) {
            try {
                T t = (T) this.a.get(key);
                if (t != null) {
                    return t;
                }
                T t2 = (T) this.b.get(key);
                if (t2 != null) {
                    this.a.put(key, t2);
                }
                return t2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
