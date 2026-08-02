package defpackage;

import android.content.Context;
import com.yandex.go.address_confirmation.SourceAddressConfirmationRouteOverlay$attach$$inlined$safeCollectIn$1;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.routes.presentation.c;

/* loaded from: classes5.dex */
public final class fbt0 extends c {
    public final com.yandex.go.route.interactor.c V;
    public final hbp0 W;

    public fbt0(com.yandex.go.route.interactor.c cVar, Context context, ah00 ah00Var, tt2 tt2Var, b2l0 b2l0Var, leh lehVar, xm00 xm00Var, o oVar, el00 el00Var, sgu0 sgu0Var, ru.yandex.taxi.map_common.map.o oVar2, et00 et00Var, lr00 lr00Var, rqo rqoVar, opz0 opz0Var, iqz0 iqz0Var, rjt0 rjt0Var) {
        super(ah00Var, context, xm00Var, lehVar, b2l0Var, oVar, el00Var, oVar2, sgu0Var, lr00Var, tt2Var, et00Var, opz0Var, iqz0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS), rjt0Var);
        this.V = cVar;
        this.W = new hbp0(new czo0(14), "address-confirmation-route-overlay", null);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final tpr Og() {
        return this.V.f();
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void attach() {
        super.attach();
        hbp0 hbp0Var = this.W;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new SourceAddressConfirmationRouteOverlay$attach$$inlined$safeCollectIn$1(Ng(), null, this), 3);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void detach() {
        super.detach();
        this.W.b();
    }
}
