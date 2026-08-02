package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class mrw implements lrw {
    public final r0 a = bvf0.c(new x5r(0));
    public final r0 b = bvf0.c(EmptyList.a);

    public final void a(Map map) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            List list = (List) value;
            arrayList = new ArrayList(list);
            if (list.contains(map)) {
                arrayList.remove(map);
            } else {
                arrayList.add(map);
            }
        } while (!r0Var.k(value, arrayList));
    }
}
