package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.recenter.n;
import com.yandex.go.taxi.order.repositories.c;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class hgi0 {
    public final o2y0 a;
    public final c b;
    public final h760 c;
    public final n d;
    public DriveState e = DriveState.PREORDER;

    public hgi0(o2y0 o2y0Var, c cVar, h760 h760Var, n nVar) {
        this.a = o2y0Var;
        this.b = cVar;
        this.c = h760Var;
        this.d = nVar;
    }

    public final void a() {
        MapRouteParametersDto o = this.a.b().o();
        jsq0 jsq0Var = o != null ? o.c : null;
        this.c.a.g((jsq0Var == null || jsq0Var.a.isEmpty()) ? RecenterType.ALL_ROUTE : RecenterType.CUSTOM_FROM_ORDER);
    }
}
