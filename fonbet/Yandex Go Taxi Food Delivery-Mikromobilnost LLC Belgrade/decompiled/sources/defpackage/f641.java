package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.map.d;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes5.dex */
public final class f641 implements n641 {
    public final /* synthetic */ g641 a;

    public f641(g641 g641Var) {
        this.a = g641Var;
    }

    @Override // defpackage.n641
    public final void F(Point point) {
        ((gh00) ((ah00) this.a.b)).E(point, 300.0f, null);
    }

    @Override // defpackage.n641
    public final void T0(float f) {
        this.a.c.updateAzimuth(f);
    }

    @Override // defpackage.n641
    public final void h0() {
        ((c) this.a.y).a();
    }

    @Override // defpackage.n641
    public final void m0(Route route) {
        ((c) this.a.y).d(d.a(route));
    }

    @Override // defpackage.n641
    public final void r6(zzs zzsVar) {
        this.a.c.Ng(zzsVar.a, zzsVar.b, zzsVar.c);
    }

    @Override // defpackage.n641
    public final void v(List list) {
        BoundingBox a = k.a(new qh2(list, 17));
        if (a != null) {
            ((gh00) ((ah00) this.a.b)).A(a, null);
        }
    }
}
