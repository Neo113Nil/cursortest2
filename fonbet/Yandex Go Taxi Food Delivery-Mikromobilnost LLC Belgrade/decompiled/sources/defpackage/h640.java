package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class h640 {
    public static bzy0 a(fj40 fj40Var) {
        vjx vjxVar = null;
        if (fj40Var instanceof jm30) {
            jm30 jm30Var = (jm30) fj40Var;
            List list = jm30Var.a;
            if (!list.isEmpty()) {
                return new zyy0((hj40) a.R(jm30Var.i), list);
            }
        } else {
            if (!(fj40Var instanceof r440)) {
                if ((fj40Var instanceof lj40) || (fj40Var instanceof l540)) {
                    return null;
                }
                w511.b();
                return null;
            }
            r440 r440Var = (r440) fj40Var;
            List list2 = r440Var.a;
            List list3 = r440Var.h;
            if (!list2.isEmpty()) {
                hj40 hj40Var = (hj40) a.R(list3);
                Point point = hj40Var != null ? hj40Var.d : null;
                hj40 hj40Var2 = (hj40) a.b0(list3);
                Point point2 = hj40Var2 != null ? hj40Var2.d : null;
                if (point != null && point2 != null) {
                    vjxVar = new vjx(r440Var.f, point, point2);
                }
                return new azy0((hj40) a.R(list3), list2, vjxVar);
            }
        }
        return null;
    }
}
