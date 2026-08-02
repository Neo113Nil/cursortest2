package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import com.yandex.go.mainscreen.superapp.orders.domain.h;
import defpackage.ehw0;
import defpackage.gc80;
import defpackage.h151;
import defpackage.i3y;
import defpackage.k601;
import defpackage.ku6;
import defpackage.lu6;
import defpackage.mu6;
import defpackage.n5w0;
import defpackage.ney;
import defpackage.ogu0;
import defpackage.p5w0;
import defpackage.p9t0;
import defpackage.qc5;
import defpackage.sls;
import defpackage.tt2;
import defpackage.w511;
import defpackage.wn70;
import defpackage.yaf0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class f extends qc5 {
    public final mu6 A;
    public final wn70 B;
    public final yaf0 C;
    public final n5w0 D;
    public final tt2 E;
    public final ru.yandex.taxi.widgets.domain.d F;
    public final com.yandex.go.superapp.tracking.data.e G;
    public final h151 H;
    public final gc80 I;
    public final h J;
    public final ehw0 K;
    public List L;
    public final i3y M;

    public f(mu6 mu6Var, wn70 wn70Var, yaf0 yaf0Var, n5w0 n5w0Var, tt2 tt2Var, ru.yandex.taxi.widgets.domain.d dVar, com.yandex.go.superapp.tracking.data.e eVar, h151 h151Var, gc80 gc80Var, h hVar, ehw0 ehw0Var, ney neyVar) {
        super(p5w0.class, neyVar);
        this.A = mu6Var;
        this.B = wn70Var;
        this.C = yaf0Var;
        this.D = n5w0Var;
        this.E = tt2Var;
        this.F = dVar;
        this.G = eVar;
        this.H = h151Var;
        this.I = gc80Var;
        this.J = hVar;
        this.K = ehw0Var;
        this.L = EmptyList.a;
        this.M = kotlin.a.a(new sls() { // from class: com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.a
            @Override // defpackage.sls
            public final Object invoke() {
                String str;
                f fVar = f.this;
                ehw0 ehw0Var2 = fVar.K;
                SuperAppOrderBundlePresenter$uiActionInteractor$2$1 superAppOrderBundlePresenter$uiActionInteractor$2$1 = new SuperAppOrderBundlePresenter$uiActionInteractor$2$1(fVar, f.class, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;", 0);
                ogu0 ogu0Var = new ogu0(27, fVar);
                mu6 mu6Var2 = fVar.A;
                if (mu6Var2 instanceof lu6) {
                    str = ((lu6) mu6Var2).a;
                } else {
                    if (!(mu6Var2 instanceof ku6)) {
                        w511.b();
                        return null;
                    }
                    str = "orders_list_action";
                }
                return ehw0Var2.a(superAppOrderBundlePresenter$uiActionInteractor$2$1, ogu0Var, new k601(str), new p9t0(29, fVar), new SuperAppOrderBundlePresenter$uiActionInteractor$2$4(1, fVar.D, n5w0.class, "openOrder", "openOrder(Lcom/yandex/go/superapp/tracking/api/domain/models/Tracking;)V", 0));
            }
        });
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        com.yandex.go.coroutines.b.g(Kg(), null, null, new SuperAppOrderBundlePresenter$onResume$1(this, null), 3);
    }
}
