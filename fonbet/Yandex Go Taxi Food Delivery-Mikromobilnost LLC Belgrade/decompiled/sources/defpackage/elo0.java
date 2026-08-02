package defpackage;

import android.content.Context;
import com.yandex.go.scooters.domain.lifecycle.a;
import com.yandex.go.scooters.domain.polling.j;
import com.yandex.go.scooters.passes.active.domain.e;
import com.yandex.go.scooters.passes.active.domain.f;
import com.yandex.go.scooters.promotions.data.ScootersPromotionsApi;
import com.yandex.go.scooters.qr.domain.c;
import com.yandex.go.scooters.subscription.data.mapper.b;
import com.yandex.go.scooters.subscription.pci_dss.data.ScootersSubscriptionUrlApi;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.go.yb.data.h;
import com.yandex.payment.divkit.api.DivKitApi;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes13.dex */
public final class elo0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ elo0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new dwn0(scc.g((a) ((gzn0) xvf0Var).get(), (j) ((mbo0) xvf0Var2).get()));
            case 1:
                return new gmo0(xvf0Var2, (vu) xvf0Var);
            case 2:
                return new com.yandex.go.scooters.promotions.data.a((ScootersPromotionsApi) ((n7g) xvf0Var2).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 3:
                return new c((com.yandex.go.scooters.qr.data.a) ((gzn0) xvf0Var2).get(), (com.yandex.go.scooters.qr.unavailable_scooter.data.a) ((mbo0) xvf0Var).get());
            case 4:
                return new f((e) ((wun0) xvf0Var2).get(), (cjm0) ((oto0) xvf0Var).get());
            case 5:
                return new vwo0((sh41) ((o7g) xvf0Var2).get(), (u8w) ((ivo0) xvf0Var).get());
            case 6:
                return new b((wnt) xvf0Var2.get(), (com.yandex.go.scooters.subscription.data.mapper.a) ((ivo0) xvf0Var).get());
            case 7:
                return new com.yandex.go.scooters.subscription.upsale_on_book.data.a((eex) xvf0Var2.get(), (dzo0) ((ivo0) xvf0Var).get());
            case 8:
                return new com.yandex.go.scooters.subscription.pci_dss.data.a((ScootersSubscriptionUrlApi) ((ivo0) xvf0Var2).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 9:
                return new cjm0(14, (zuj0) xvf0Var2.get(), (cjm0) ((g1n0) xvf0Var).get());
            case 10:
                return new com.yandex.go.scooters.super_passes.upsale_on_book.data.a((eex) xvf0Var2.get(), (k6p0) ((ivo0) xvf0Var).get());
            case 11:
                return new z4p0((qr40) xvf0Var2.get(), (ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain.a) ((s3f0) xvf0Var).get());
            case 12:
                return new com.yandex.go.scooters.misc.vehicle_actual_photo.domain.a((com.yandex.go.scooters.misc.vehicle_actual_photo.data.mapper.a) xvf0Var2.get(), (com.yandex.go.scooters.misc.vehicle_actual_photo.data.a) ((oto0) xvf0Var).get());
            case 13:
                return new x8p0((fn21) ((n7g) xvf0Var2).get(), (ru.yandex.taxi.am.token.a) ((k7g) xvf0Var).get());
            case 14:
                return new d((vup0) ((h0l0) xvf0Var2).get(), (ow70) ((j9g) xvf0Var).get());
            case 15:
                return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.a((p) ((rmv0) xvf0Var2).get(), (tse) xvf0Var.get());
            case 16:
                return new com.yandex.payment.divkit.repository.a((DivKitApi) ((bo2) xvf0Var2).get(), (rwo) xvf0Var.get());
            case 17:
                return new com.yandex.payment.divkit.common.a((com.yandex.payment.divkit.repository.a) ((elo0) xvf0Var2).get(), (rwo) xvf0Var.get());
            case 18:
                return new h((cda0) xvf0Var2.get(), (py51) ((xcg) xvf0Var).get());
            case 19:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector.b((q8s) ((p1g) xvf0Var2).get(), (l7x0) ((gxf) xvf0Var).get());
            case 20:
                return new l04((Context) ((g7g) xvf0Var).get(), (AppAnalyticsReporter) ((o9g) xvf0Var2).get());
            case 21:
                return new ru.yandex.taxi.favorites.rides.settings_modal.domain.a((dar0) ((n3w) xvf0Var2).a, (ru.yandex.taxi.favorites.rides.settings_modal.domain.b) ((u6o0) xvf0Var).get());
            case 22:
                return new ru.yandex.taxi.share_favorites.router.a((z8n0) xvf0Var2, (qgn0) ((m7q0) xvf0Var).get());
            case 23:
                return new hzr0((abf0) ((r9g) xvf0Var2).get(), (jc00) xvf0Var.get());
            case 24:
                return new com.yandex.go.shortcuts.impl.view.a((Context) ((n3w) xvf0Var2).a, ((r9g) xvf0Var).b.o());
            case 25:
                return new hwo0((a3v) ((w2g) xvf0Var2).get(), (z2s0) xvf0Var.get());
            case 26:
                return new cjm0(27, (ik0) ((ii9) xvf0Var2).get(), (z501) ((ibg) xvf0Var).get());
            case 27:
                return new ru.yandex.taxi.logistics.sdk.promotions.impl.data.e((tpg) ((k1w) xvf0Var2).get(), (st2) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.logistics.ndd_map.walkroute.a((ru.yandex.taxi.walkroute.a) ((o4g) xvf0Var2).get(), (f5v0) ((n4g) xvf0Var).get());
            default:
                return new dgs0((df50) xvf0Var2.get(), (com.yandex.go.navigator.settings.debug_panel.domain.a) ((hs30) xvf0Var).get());
        }
    }

    public /* synthetic */ elo0(Object obj, v7p v7pVar, v7p v7pVar2, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = v7pVar2;
    }
}
