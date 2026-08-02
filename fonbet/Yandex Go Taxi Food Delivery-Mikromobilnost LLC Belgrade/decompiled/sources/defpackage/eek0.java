package defpackage;

import com.yandex.go.superapp.tracking.data.e;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.domain.a11y.b;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.state.d;
import com.yandex.go.taxi.order.details.v2.state.elements.decorations.a;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public final class eek0 extends ad5 {
    public final b A;
    public final h3y B;
    public final e C;
    public final hc80 D;
    public final a E;
    public final g F;
    public final tt2 G;
    public final OrderScreen H;
    public final boolean I;
    public final f0 x;
    public final d y;
    public final jbk0 z;

    public eek0(gu11 gu11Var, OrderScreen orderScreen, f0 f0Var, d dVar, jbk0 jbk0Var, b bVar, h3y h3yVar, e eVar, hc80 hc80Var, a aVar, g gVar, tt2 tt2Var, OrderScreen orderScreen2) {
        super(dek0.class);
        this.x = f0Var;
        this.y = dVar;
        this.z = jbk0Var;
        this.A = bVar;
        this.B = h3yVar;
        this.C = eVar;
        this.D = hc80Var;
        this.E = aVar;
        this.F = gVar;
        this.G = tt2Var;
        this.H = orderScreen2;
        gu11Var.getClass();
        this.I = orderScreen == OrderScreen.ORDER_TRACKING;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.A.a(RideCardPresentationType.COMPACT);
        super.Cg();
    }
}
