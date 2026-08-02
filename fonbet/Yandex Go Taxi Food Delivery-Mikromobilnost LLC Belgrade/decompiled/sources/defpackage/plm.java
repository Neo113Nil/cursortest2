package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.PolylineUtils;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.route.b;

/* loaded from: classes6.dex */
public final class plm implements olm {
    public final f6c a;
    public final r0 b;
    public final tpr c;

    public plm(f6c f6cVar, tt2 tt2Var) {
        this.a = f6cVar;
        r0 c = bvf0.c(new tal0(null, null, null, null));
        this.b = c;
        b bVar = new b(c, this);
        tt2Var.getClass();
        this.c = e.F(bVar, uyj.a);
    }

    public final void a(ool0 ool0Var) {
        r0 r0Var = this.b;
        tal0 a = tal0.a((tal0) r0Var.getValue(), ool0Var, null, PolylineUtils.createPolylineIndex(ool0Var.getGeometry()), null, 10);
        r0Var.getClass();
        r0Var.m(null, a);
    }

    public final void b(Point point, Double d) {
        r0 r0Var = this.b;
        tal0 a = tal0.a((tal0) r0Var.getValue(), null, point, null, d, 5);
        r0Var.getClass();
        r0Var.m(null, a);
    }
}
