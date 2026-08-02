package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$ButtonNameV2;
import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$PointTypeV2;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.change.source.interactor.e;
import defpackage.ac9;
import defpackage.ad5;
import defpackage.bc9;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.o61;
import defpackage.pav;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uzs;
import defpackage.wf9;
import defpackage.z2e;
import defpackage.zzs;
import java.util.HashMap;
import java.util.UUID;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.ChangeOrderSourceAddressFragment;

/* loaded from: classes14.dex */
public final class d extends ad5 {
    public final com.yandex.go.taxi.order.change.source.interactor.c A;
    public final tt2 B;
    public final pav C;
    public final e D;
    public final com.yandex.go.taxi.order.change.common.domain.d E;
    public final wf9 F;
    public final String G;
    public final r0 H;
    public z2e I;
    public pv0 J;
    public String K;
    public pzt0 L;
    public pzt0 M;
    public final bc9 x;
    public final com.yandex.go.taxi.order.change.source.interactor.a y;
    public final ru.yandex.taxi.search.c z;

    public d(bc9 bc9Var, com.yandex.go.taxi.order.change.source.interactor.a aVar, ru.yandex.taxi.search.c cVar, com.yandex.go.taxi.order.change.source.interactor.c cVar2, tt2 tt2Var, pav pavVar, e eVar, com.yandex.go.taxi.order.change.common.domain.d dVar, wf9 wf9Var) {
        super(ac9.class);
        this.x = bc9Var;
        this.y = aVar;
        this.z = cVar;
        this.A = cVar2;
        this.B = tt2Var;
        this.C = pavVar;
        this.D = eVar;
        this.E = dVar;
        this.F = wf9Var;
        this.G = UUID.randomUUID().toString();
        ChangeSourcePointExperiment.Companion.getClass();
        this.H = bvf0.c(ChangeSourcePointExperiment.k);
        this.I = new z2e(15, false, false, false);
        this.K = "";
    }

    public final void Kg(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment) {
        Bg(changeOrderSourceAddressFragment);
        o61 o61Var = this.F.a;
        ChangePointInActiveOrderAnalytics$PointTypeV2 changePointInActiveOrderAnalytics$PointTypeV2 = ChangePointInActiveOrderAnalytics$PointTypeV2.Source;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (changePointInActiveOrderAnalytics$PointTypeV2 != null) {
            hashMap.put("type", changePointInActiveOrderAnalytics$PointTypeV2.getEventValue());
        }
        o61Var.a.a("ChangePointInActiveOrder.Shown", hashMap, 2, new HashMap());
        tje.N(Jg(), null, null, new ChangeOrderSourceAddressPresenter$attachView$1(changeOrderSourceAddressFragment, this, null), 3);
        tje.N(Jg(), null, null, new ChangeOrderSourceAddressPresenter$attachView$2(changeOrderSourceAddressFragment, this, null), 3);
        tje.N(Jg(), null, null, new ChangeOrderSourceAddressPresenter$attachView$3(changeOrderSourceAddressFragment, this, null), 3);
        tje.N(Jg(), null, null, new ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1(this, null), 3);
    }

    public final void Lg(pv0 pv0Var) {
        if (pv0Var == null) {
            return;
        }
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(Jg(), null, null, new ChangeOrderSourceAddressPresenter$check$1(this, pv0Var, null), 3);
    }

    public final void Mg(ChangePointInActiveOrderAnalytics$ButtonNameV2 changePointInActiveOrderAnalytics$ButtonNameV2) {
        o61 o61Var = this.F.a;
        ChangePointInActiveOrderAnalytics$PointTypeV2 changePointInActiveOrderAnalytics$PointTypeV2 = ChangePointInActiveOrderAnalytics$PointTypeV2.Source;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (changePointInActiveOrderAnalytics$ButtonNameV2 != null) {
            hashMap.put("button_name", changePointInActiveOrderAnalytics$ButtonNameV2.getEventValue());
        }
        if (changePointInActiveOrderAnalytics$PointTypeV2 != null) {
            hashMap.put("type", changePointInActiveOrderAnalytics$PointTypeV2.getEventValue());
        }
        o61Var.a.a("ChangePointInActiveOrder.Tapped", hashMap, 2, new HashMap());
    }

    public final void Ng(boolean z, boolean z2, ChangeSourcePointExperiment changeSourcePointExperiment) {
        this.I = new z2e(true, (z || z2) ? d6z.Y(changeSourcePointExperiment, changeSourcePointExperiment.d.c) : d6z.Y(changeSourcePointExperiment, changeSourcePointExperiment.d.d), z, z2);
        ((ac9) Dg()).updateConfirmButton(this.I);
    }

    public final void f() {
        pv0 pv0Var = this.J;
        if (pv0Var == null && this.K.length() > 0) {
            ((ac9) Dg()).changePorchNumber(this.K);
            return;
        }
        if (pv0Var != null) {
            zzs B = pv0Var.a.B();
            zzs v = this.x.a.b().v();
            uzs uzsVar = zzs.Companion;
            if (!B.a(v, 1.0E-6d)) {
                pzt0 pzt0Var = this.M;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.M = tje.N(Jg(), null, null, new ChangeOrderSourceAddressPresenter$confirm$1(this, pv0Var, null), 3);
                return;
            }
        }
        ((ac9) Dg()).onBack();
    }
}
