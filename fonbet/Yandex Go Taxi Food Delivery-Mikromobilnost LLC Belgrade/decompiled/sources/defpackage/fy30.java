package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.d;
import com.yandex.go.taxi.order.change.source.interactor.a0;
import com.yandex.go.taxi.order.change.source.interactor.k;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.RealtimeAnalytics;
import com.yandex.go.taxi.order.map.n;
import com.yandex.go.taxi.order.popup.b;
import com.yandex.go.taxi.order.promotions.interactor.h;
import com.yandex.go.taxi.order.queue.presentation.QueueView;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.masstransit.datasource.routing.a;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.geopayment.checkout.e;
import ru.yandex.taxi.masstransit.geopayment.checkout.w;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.styling.c;

/* loaded from: classes14.dex */
public final class fy30 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public /* synthetic */ fy30(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.i;
        xvf0 xvf0Var7 = this.h;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new f((ow30) ((v3g) obj).get(), (a) ((i020) xvf0Var5).get(), (tt2) ((u3g) xvf0Var4).get(), (yw30) ((zw30) xvf0Var3).get(), (d0) ((d701) xvf0Var2).get(), (ru.yandex.taxi.masstransit.trains.config.a) ((d701) xvf0Var).get(), (tu30) ((v3g) xvf0Var7).get(), (b0x0) ((w3g) xvf0Var6).get());
            case 1:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth.a((z22) ((twf) obj).get(), (hk3) xvf0Var5.get(), (Context) ((twf) xvf0Var4).get(), (DefaultEnvironment) xvf0Var3.get(), (FlexAdapter) xvf0Var2.get(), (jse) ((b55) xvf0Var).get(), (dn90) xvf0Var7.get(), (ns31) xvf0Var6.get());
            case 2:
                mir mirVar = (mir) ((n3w) obj).a;
                mqq mqqVar = (mqq) ((nqq) xvf0Var5).get();
                final xu70 xu70Var = (xu70) ((n3w) xvf0Var4).a;
                o580 o580Var = (o580) ((ge50) xvf0Var3).get();
                k6x k6xVar = (k6x) ((o4g) xvf0Var2).get();
                h3y a = i5m.a((o4g) xvf0Var);
                rav ravVar = (rav) ((o4g) xvf0Var7).get();
                hir hirVar = (hir) xvf0Var6.get();
                RealtimeAnalytics realtimeAnalytics = xu70Var.a.a().c.a;
                boolean z = realtimeAnalytics.a;
                int i2 = realtimeAnalytics.c;
                long j = realtimeAnalytics.b * 1000;
                final int i3 = 2;
                ghr ghrVar = new ghr(i3, mqqVar);
                xei0 xei0Var = new xei0(z, i2, j);
                final int i4 = 0;
                final int i5 = 1;
                return mirVar.a(new vlr("Order", hirVar, ghrVar, null, null, o580Var, null, null, null, null, k6xVar, null, null, null, null, xei0Var, xu70Var.a.a().f ? new ynq((pav) a.get(), ravVar.a) : null, new jn11(new sls() { // from class: hv70
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i4;
                        xu70 xu70Var2 = xu70Var;
                        switch (i6) {
                            case 0:
                                return Boolean.valueOf(xu70Var2.a().a);
                            case 1:
                                return Integer.valueOf(xu70Var2.a().b);
                            default:
                                return Integer.valueOf(xu70Var2.a().c);
                        }
                    }
                }, new sls() { // from class: hv70
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i5;
                        xu70 xu70Var2 = xu70Var;
                        switch (i6) {
                            case 0:
                                return Boolean.valueOf(xu70Var2.a().a);
                            case 1:
                                return Integer.valueOf(xu70Var2.a().b);
                            default:
                                return Integer.valueOf(xu70Var2.a().c);
                        }
                    }
                }, new sls() { // from class: hv70
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i3;
                        xu70 xu70Var2 = xu70Var;
                        switch (i6) {
                            case 0:
                                return Boolean.valueOf(xu70Var2.a().a);
                            case 1:
                                return Integer.valueOf(xu70Var2.a().b);
                            default:
                                return Integer.valueOf(xu70Var2.a().c);
                        }
                    }
                }), null, 587698));
            case 3:
                return new k((o2y0) ((xvf0) obj).get(), (b) xvf0Var5.get(), (ixx0) xvf0Var4.get(), (ph70) xvf0Var3, (i380) xvf0Var2.get(), this.g, (oep0) xvf0Var7.get(), (tt2) xvf0Var6.get());
            case 4:
                return new com.yandex.go.taxi.order.promotions.router.a((h) ((xvf0) obj).get(), (y10) xvf0Var5.get(), (d480) xvf0Var4.get(), (j4y0) xvf0Var3.get(), (m580) xvf0Var2, (tse) xvf0Var.get(), (tt2) xvf0Var7.get(), (oep0) xvf0Var6.get());
            case 5:
                return new a0((c) ((xvf0) obj).get(), (o2y0) xvf0Var5.get(), (o380) xvf0Var4.get(), (s0c0) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (i380) ((l180) xvf0Var).get(), (noe) xvf0Var7.get(), (toe) xvf0Var6.get());
            case 6:
                return new com.yandex.go.order.tariffs_suggest.ui.a((com.yandex.go.order.tariffs_suggest.repository.a) ((l9t0) obj).get(), (f0) xvf0Var5.get(), (pm5) ((ig7) xvf0Var4).get(), (sg9) xvf0Var3.get(), (yj70) ((l180) xvf0Var2).get(), (tt2) xvf0Var.get(), (y2s0) xvf0Var7, (oep0) xvf0Var6.get());
            case 7:
                return new com.yandex.go.places.organization.card.impl.domain.interactors.flex.b((e2t) ((xvf0) obj).get(), (ch80) xvf0Var5.get(), (com.yandex.go.places.organization.card.impl.data.repositories.b) ((hs30) xvf0Var4).get(), (oh80) xvf0Var3.get(), (tt2) xvf0Var2.get(), (wnt) xvf0Var.get(), (com.yandex.go.places.impl.domain.interactors.a) xvf0Var7.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var6.get());
            case 8:
                oy80 oy80Var = (oy80) obj;
                return new oy90((Context) xvf0Var5.get(), (PaymentToken) oy80Var.b, (OrderInfo) oy80Var.c, (vv90) xvf0Var4.get(), (px90) xvf0Var3.get(), (bga0) xvf0Var2.get(), (rwo) xvf0Var.get(), (fx5) xvf0Var7.get(), (Payer) xvf0Var6.get());
            case 9:
                return new w((Context) ((xvf0) obj).get(), (y50) xvf0Var5.get(), (g) xvf0Var4.get(), (c0a0) ((f3g) xvf0Var3).get(), (ru.yandex.taxi.am.g) ((b3g) xvf0Var2).get(), (vp21) ((g3g) xvf0Var).get(), (e) xvf0Var7.get(), (xl51) ((f3g) xvf0Var6).get());
            case 10:
                return new com.ybsdk.feature.pin.internal.domain.b((gdf) ((xvf0) obj).get(), (com.ybsdk.feature.pinstorage.internal.data.c) ((l5g) xvf0Var5).get(), (w1u0) ((p5g) xvf0Var4).get(), (com.ybsdk.feature.pin.internal.repositories.a) xvf0Var3.get(), (com.ybsdk.feature.pin.internal.domain.a) ((f380) xvf0Var2).get(), (ux5) xvf0Var.get(), (bwb0) ((l5g) xvf0Var7).get(), (AppAnalyticsReporter) ((l5g) xvf0Var6).get());
            case 11:
                return new zfc0((Context) ((x4g) obj).get(), (tcc0) ((g680) xvf0Var5).get(), (w040) ((tfc0) xvf0Var4).get(), (w040) ((tgb0) xvf0Var3).get(), (xv10) ((tfc0) xvf0Var2).get(), (bu0) ((tfc0) xvf0Var).get(), (pwy0) xvf0Var7.get(), (odc0) xvf0Var6.get());
            case 12:
                return new com.yandex.messaging.ui.polloptioninfo.a((rxd0) ((xvf0) obj).get(), (Activity) ((n3w) xvf0Var5).a, (ubt) xvf0Var4.get(), (qxd0) ((n3w) xvf0Var3).a, (com.yandex.messaging.internal.avatar.a) xvf0Var2.get(), (j) xvf0Var.get(), (vse) xvf0Var7.get(), (rp21) xvf0Var6.get());
            case 13:
                return new ru.yandex.logistics.sdk.cargo_form.impl.popup.b((u3s) ((xvf0) obj).get(), (a2y) xvf0Var5.get(), (st2) ((exf) xvf0Var4).get(), (goe) xvf0Var3.get(), (aas0) xvf0Var2.get(), (q8s) ((n3w) xvf0Var).a, (yfa) ((peb) xvf0Var7).get(), (com.yandex.delivery.utils.storage.impl.c) ((exf) xvf0Var6).get());
            case 14:
                return new w040((Context) ((n3w) obj).a, (qcp0) ((ibg) xvf0Var5).get(), (dci) ((gbg) xvf0Var4).get(), (hwy0) ((ibg) xvf0Var3).get(), (ru.yandex.taxi.logistics.sdk.postcard.presentation.b) ((v8c0) xvf0Var2).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) xvf0Var).get(), (yuj0) ((gbg) xvf0Var7).get(), (jwh) ((gbg) xvf0Var6).get());
            case 15:
                return new com.yandex.go.taxi.order.queue.interactor.e((on2) ((i9g) obj).get(), (wnt) ((i9g) xvf0Var5).get(), (tt2) ((i9g) xvf0Var4).get(), (zuj0) ((j9g) xvf0Var3).get(), (ljg0) ((kxb0) xvf0Var2).get(), (com.yandex.go.taxi.order.queue.repository.a) ((j9g) xvf0Var).get(), (fkg0) ((cta0) xvf0Var7).get(), (com.yandex.go.taxi.order.domain.repositories.e) ((j9g) xvf0Var6).get());
            case 16:
                return new nkg0((xm00) ((j9g) obj).get(), (Context) ((n3w) xvf0Var5).a, (l390) xvf0Var4.get(), (ah00) ((i9g) xvf0Var3).get(), (QueueView) ((vfg0) xvf0Var2).get(), (com.yandex.go.taxi.order.search.overlay.mvp.a) ((tgb0) xvf0Var).get(), (uz8) ((i9g) xvf0Var7).get(), (ow70) ((j9g) xvf0Var6).get());
            case 17:
                return new w040((wiq0) ((xvf0) obj).get(), (m8i) ((fwc) xvf0Var5).get(), (a9i) xvf0Var4, (t8i) xvf0Var3.get(), (b8r) xvf0Var2.get(), (zch) ((rwh) xvf0Var).get(), (c4r0) xvf0Var7.get(), (xl10) ((t160) xvf0Var6).get());
            case 18:
                return new gxi0((dqe0) ((xvf0) obj).get(), (wiq0) xvf0Var5.get(), (c4r0) xvf0Var4.get(), (axm) xvf0Var3.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var2.get(), (w3r0) xvf0Var.get(), (ynm0) xvf0Var7.get(), (jjx0) ((rmv0) xvf0Var6).get());
            case 19:
                return new com.yandex.go.taxi.summary.shared.requirement.e((ru.yandex.taxi.widget.utils.e) ((xvf0) obj).get(), (xcv0) xvf0Var5.get(), (wiq0) xvf0Var4.get(), (f580) xvf0Var3.get(), (z4m0) ((px4) xvf0Var2).get(), (ore) xvf0Var.get(), (s421) ((ibz0) xvf0Var7).get(), (gxi0) ((fy30) xvf0Var6).get());
            case 20:
                return new aj60((dqe0) ((w0g) obj).get(), (com.yandex.go.analytics.b) ((s0g) xvf0Var5).get(), (y4k0) ((a1g) xvf0Var4).get(), (oep0) xvf0Var3.get(), (a1g) xvf0Var2, (com.yandex.go.preorder.confirm.a) ((z0g) xvf0Var).get(), (r100) ((vfg0) xvf0Var7).get(), (ste0) xvf0Var6.get());
            case 21:
                return new odk0((Context) ((r6g) obj).get(), (o2y0) xvf0Var5.get(), (sqs0) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (jgv) xvf0Var2.get(), (tt2) xvf0Var.get(), (pwy0) xvf0Var7.get(), (ru.yandex.taxi.widget.c) xvf0Var6.get());
            case 22:
                return new com.yandex.go.taxi.order.details.v2.state.elements.payment.c((o8a0) ((xvf0) obj).get(), (xjk0) ((p8k0) xvf0Var5).get(), (irs0) xvf0Var4.get(), (jgv) xvf0Var3.get(), (pdc) xvf0Var2.get(), (lbk0) xvf0Var.get(), (o2y0) xvf0Var7.get(), (cda0) ((t6g) xvf0Var6).get());
            case 23:
                return new com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.a((o2y0) ((xvf0) obj).get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.a) ((bo2) xvf0Var5).get(), (s6k0) ((jpj0) xvf0Var4).get(), (opk0) ((s3f0) xvf0Var3).get(), (sue0) ((zni0) xvf0Var2).get(), (pfk0) ((n7i0) xvf0Var).get(), (irs0) xvf0Var7.get(), (lbk0) xvf0Var6.get());
            case 24:
                return new n((Context) ((xvf0) obj).get(), (etk0) xvf0Var5.get(), (o2y0) xvf0Var4.get(), (com.yandex.go.taxi.order.map.route.a) xvf0Var3.get(), (com.yandex.go.taxi.order.map.g) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get(), (com.yandex.go.taxi.order.map.overlay.traffic.b) xvf0Var7.get(), (com.yandex.go.taxi.order.map.overlay.traffic.a) ((flx0) xvf0Var6).get());
            case 25:
                return new u9l0((tt2) ((g6g) obj).get(), (i8y0) ((b7g) xvf0Var5).get(), (b7g) xvf0Var4, (l) ((a7g) xvf0Var3).get(), (c9y0) ((b7g) xvf0Var2).get(), (e8y0) ((a7g) xvf0Var).get(), (zb90) ((a7g) xvf0Var7).get(), (oep0) ((a7g) xvf0Var6).get());
            case 26:
                return new s4n0((n6n0) ((xvf0) obj).get(), (b3n0) xvf0Var5.get(), (s6n0) xvf0Var4.get(), (d) xvf0Var3.get(), (z2o0) xvf0Var2.get(), (a4o0) xvf0Var.get(), (com.yandex.go.scooters.offers.v2.components.bottom.domain.a) ((wj0) xvf0Var7).get(), (hxo0) xvf0Var6.get());
            case 27:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.a((xvf0) obj, this.c, this.d, this.e, this.f, this.g, (k4a) xvf0Var7, (xnn0) xvf0Var6.get());
            case 28:
                return new w040((Context) ((xvf0) obj).get(), (tse) xvf0Var5.get(), (y50) xvf0Var4.get(), (uxr0) ((n7g) xvf0Var3).get(), (kqe) ((n7g) xvf0Var2).get(), (zvo0) ((ivo0) xvf0Var).get(), (xvo0) ((mz70) xvf0Var7).get(), (yvo0) ((ivo0) xvf0Var6).get());
            default:
                return new hnn0((Context) ((xvf0) obj).get(), (tse) xvf0Var5.get(), (y50) xvf0Var4.get(), (po21) xvf0Var3.get(), (uxr0) xvf0Var2.get(), (kqe) xvf0Var.get(), (lnn0) ((qzm0) xvf0Var7).get(), (inn0) xvf0Var6.get());
        }
    }
}
