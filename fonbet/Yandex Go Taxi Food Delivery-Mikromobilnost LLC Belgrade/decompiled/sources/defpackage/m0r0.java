package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface m0r0 {
    void a(k8j0 k8j0Var);

    void b();

    void c();

    Map d(Size size);

    int e(q6x0 q6x0Var, l0r0 l0r0Var);

    void f(wn7 wn7Var);

    void g();

    default void h(b48 b48Var, q6x0 q6x0Var, o3 o3Var) {
    }

    jyq0 i(ar7 ar7Var, q74 q74Var);

    HashSet j();

    int k(boolean z, q6x0 q6x0Var, o3 o3Var);

    default List l() {
        return Collections.EMPTY_LIST;
    }

    default Range m() {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (Pair pair : l()) {
            CameraCharacteristics.Key key2 = (CameraCharacteristics.Key) pair.first;
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            if (key2.equals(key)) {
                return (Range) pair.second;
            }
        }
        return null;
    }
}
