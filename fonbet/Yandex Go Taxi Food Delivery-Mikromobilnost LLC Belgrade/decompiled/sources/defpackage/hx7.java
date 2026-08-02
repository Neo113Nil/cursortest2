package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class hx7 {
    public static List a(o2y0 o2y0Var) {
        List list;
        List list2 = o2y0Var.b().V().A.d;
        if (list2.isEmpty()) {
            Zone M = o2y0Var.b().M();
            if (M == null || (list = M.h.d) == null) {
                list = EmptyList.a;
            }
            list2 = list;
        }
        return list2;
    }
}
