package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import java.util.List;

/* loaded from: classes10.dex */
public final class pm7 {
    public rm7 a;
    public List b;

    public static pm7 a(ar7 ar7Var) {
        m0r0 m0r0Var;
        ar7 implementation = ar7Var.getImplementation();
        d6z.m("CameraInfo doesn't contain Camera2 implementation.", implementation instanceof rm7);
        pm7 pm7Var = ((rm7) implementation).c;
        if (!(ar7Var instanceof g70) || (m0r0Var = ((g70) ar7Var).c) == null) {
            return pm7Var;
        }
        rm7 rm7Var = pm7Var.a;
        List l = m0r0Var.l();
        pm7 pm7Var2 = new pm7();
        pm7Var2.a = rm7Var;
        pm7Var2.b = l;
        return pm7Var2;
    }

    public final Object b(CameraCharacteristics.Key key) {
        List<Pair> list = this.b;
        if (list != null) {
            for (Pair pair : list) {
                if (((CameraCharacteristics.Key) pair.first).equals(key)) {
                    return pair.second;
                }
            }
        }
        return this.a.b.a(key);
    }
}
