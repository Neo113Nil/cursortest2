package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.map.d;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes5.dex */
public final class jnw implements inw {
    public final /* synthetic */ knw a;

    public jnw(knw knwVar) {
        this.a = knwVar;
    }

    @Override // defpackage.inw
    public final void Dc(boolean z) {
        ((c) this.a.w).b(z);
    }

    @Override // defpackage.inw
    public final void F(Point point) {
        ((gh00) ((ah00) this.a.b)).E(point, 200.0f, null);
    }

    @Override // defpackage.inw
    public final void e0() {
        ((c) this.a.w).a();
    }

    @Override // defpackage.inw
    public final void m0(Route route) {
        ((c) this.a.w).d(d.a(route));
    }

    @Override // defpackage.inw
    public final void v(List list) {
        BoundingBox a = k.a(new qh2(list, 5));
        if (a != null) {
            ((gh00) ((ah00) this.a.b)).A(a, null);
        }
    }
}
