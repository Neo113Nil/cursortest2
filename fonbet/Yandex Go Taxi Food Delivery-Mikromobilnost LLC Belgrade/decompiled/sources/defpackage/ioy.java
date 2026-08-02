package defpackage;

import com.yandex.go.superapp.tracking.api.dependencies.DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1;
import com.yandex.go.superapp.tracking.api.dependencies.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

/* loaded from: classes10.dex */
public final class ioy extends c {
    @Override // com.yandex.go.superapp.tracking.api.dependencies.c
    public final Object a(Object obj, DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1 defaultTrackingSourceInteractor$start$$inlined$map$1$2$1) {
        y2y0 y2y0Var;
        List list = ((wl40) obj).b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tly a = ((sly) it.next()).a();
            if (a == null) {
                y2y0Var = null;
            } else {
                String str = a.e().a;
                String k = a.k();
                String j = a.j();
                p48 b = veb1.b();
                b.b(a.b());
                b.c(a.a());
                q48 a2 = b.a();
                LinkedOrderStatusDto f = a.f();
                y2y0Var = new y2y0(str, f501.a, 0L, k, j, a.h(), a2, f, a.e().b);
            }
            if (y2y0Var != null) {
                arrayList.add(y2y0Var);
            }
        }
        return arrayList;
    }
}
