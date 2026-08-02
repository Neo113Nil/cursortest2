package com.yandex.go.taxi.order.multi.tracking;

import defpackage.jqr;
import defpackage.mdh;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.u6y0;
import defpackage.uyj;
import defpackage.x6y0;

/* loaded from: classes14.dex */
public final class j implements u6y0 {
    public final /* synthetic */ TaxiOrderTrackingView a;

    public j(TaxiOrderTrackingView taxiOrderTrackingView) {
        this.a = taxiOrderTrackingView;
    }

    public final void a(o2y0 o2y0Var) {
        i iVar;
        iVar = this.a.presenter;
        pzt0 pzt0Var = iVar.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tpr c = ((ru.yandex.taxi.panorama.ridecard.d) iVar.A).c(o2y0Var);
        if (((com.yandex.go.taxi.order.perf.experiment.d) iVar.J).b().c) {
            iVar.G.getClass();
            sjh sjhVar = uyj.a;
            c = kotlinx.coroutines.flow.e.F(c, mdh.b);
        }
        iVar.O = kotlinx.coroutines.flow.e.H(iVar.Jg(), new jqr(c, new TaxiOrderTrackingPresenter$launchPanoramaFlow$2(2, iVar.Dg(), x6y0.class, "renderPanoramaButton", "renderPanoramaButton(Lcom/yandex/go/taxi/order/api/panorama/RideCardPanoramaViewState;)V", 4), 3));
    }
}
