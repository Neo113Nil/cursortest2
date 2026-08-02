package xsna;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;

/* compiled from: CameraSelectionOptimizer.java */
/* loaded from: classes11.dex */
public final class ml9 {
    public static String a(bj9 bj9Var, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) bj9Var.a("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) bj9Var.a("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }
}
