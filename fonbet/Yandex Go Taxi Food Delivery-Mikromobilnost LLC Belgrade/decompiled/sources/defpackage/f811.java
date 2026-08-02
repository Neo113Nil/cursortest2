package defpackage;

import com.yandex.go.multimodal_route.api.MultimodalRouteType;
import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.multimodal_route.repositories.a;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class f811 implements x711 {
    public final v311 a;
    public final es40 b;
    public final String c = MultimodalRouteType.TaxiTransport.getValue();
    public final qu40 d;
    public final y711 e;
    public final oz40 f;
    public r3y0 g;

    public f811(f fVar, z711 z711Var, fs40 fs40Var, v311 v311Var, es40 es40Var) {
        this.a = v311Var;
        this.b = es40Var;
        ru2 ru2Var = fs40Var.a;
        this.d = new qu40(fVar, (a) ((xvf0) ru2Var.a).get(), (uu40) ((xvf0) ru2Var.b).get(), (d) ((k220) ru2Var.c).get(), (c) ((xvf0) ru2Var.d).get(), (yu40) ((xvf0) ru2Var.e).get(), (b) ((xvf0) ru2Var.f).get(), (wr40) ((xvf0) ru2Var.g).get(), (a3l0) ((xvf0) ru2Var.h).get(), (es40) ((xvf0) ru2Var.i).get());
        a811 a811Var = z711Var.a;
        this.e = new y711(fVar, i5m.a(a811Var.a), a811Var.b);
        this.f = androidx.compose.runtime.f.j(Boolean.FALSE);
    }
}
