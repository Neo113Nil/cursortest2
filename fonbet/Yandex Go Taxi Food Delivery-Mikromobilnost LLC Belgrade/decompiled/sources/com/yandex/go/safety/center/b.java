package com.yandex.go.safety.center;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.experiment.t;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.eo5;
import defpackage.ha2;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.o2y0;
import defpackage.qmp;
import defpackage.rqo;
import defpackage.spl0;
import defpackage.t1b0;
import defpackage.tpl0;
import defpackage.tpr;
import defpackage.ul51;
import defpackage.upl0;
import defpackage.vpl0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class b implements spl0 {
    public final qmp a;
    public final com.yandex.go.taxi.order.repositories.c b;
    public final eo5 c;
    public final t1b0 d;

    public b(qmp qmpVar, com.yandex.go.taxi.order.repositories.c cVar, rqo rqoVar, eo5 eo5Var) {
        this.a = qmpVar;
        this.b = cVar;
        this.c = eo5Var;
        this.d = ((jbh) rqoVar).e(SafetyCenterExperiment.u);
    }

    public final vpl0 a(OrderStatusInfo orderStatusInfo, SafetyCenterExperiment safetyCenterExperiment, boolean z) {
        if (!z) {
            ((ul51) this.a).getClass();
            if (!jl40.l(safetyCenterExperiment, SafetyCenterExperiment.u) && safetyCenterExperiment.b() && safetyCenterExperiment.d.contains(SafetyCenterExperiment.ButtonPlace.RIDE_DETAILS)) {
                orderStatusInfo.getClass();
                if (!orderStatusInfo.f(SimpleBooleanExperiment.DISABLE_SAFETY_CENTER)) {
                    String a = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.MAIN_BUTTON_LINK_TITLE);
                    if (a.length() != 0) {
                        return new upl0(a);
                    }
                }
            }
        }
        return tpl0.c;
    }

    public final ha2 b(o2y0 o2y0Var) {
        com.yandex.go.taxi.order.repositories.b a = this.b.a(o2y0Var);
        tpr b = ru.yandex.taxi.experiments.d.b(this.d);
        eo5 eo5Var = this.c;
        return kotlinx.coroutines.flow.e.n(a, b, new t(ru.yandex.taxi.experiments.d.b((q) eo5Var.a.getValue()), eo5Var), new SafetyCenterButtonDisplayInteractorImpl$stateObservableFlow$1(4, this, b.class, "createButtonState", "createButtonState(Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;Z)Lcom/yandex/go/safety/center/api/SafetyCenterButtonState;", 4));
    }
}
