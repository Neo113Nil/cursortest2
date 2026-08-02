package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes10.dex */
public final class kr7 {
    public final sr4 a;
    public final ArrayMap b = new ArrayMap(4);

    public kr7(sr4 sr4Var) {
        this.a = sr4Var;
    }

    public final ep7 a(String str) {
        ep7 ep7Var;
        synchronized (this.b) {
            try {
                ep7Var = (ep7) this.b.get(str);
                if (ep7Var == null) {
                    try {
                        sr4 sr4Var = this.a;
                        sr4Var.getClass();
                        try {
                            ep7 ep7Var2 = new ep7(((CameraManager) sr4Var.b).getCameraCharacteristics(str), str);
                            this.b.put(str, ep7Var2);
                            ep7Var = ep7Var2;
                        } catch (CameraAccessException e) {
                            throw new CameraAccessExceptionCompat(e);
                        }
                    } catch (AssertionError e2) {
                        throw new CameraAccessExceptionCompat(e2.getMessage(), e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ep7Var;
    }

    public final String[] b() {
        sr4 sr4Var = this.a;
        sr4Var.getClass();
        try {
            return ((CameraManager) sr4Var.b).getCameraIdList();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
