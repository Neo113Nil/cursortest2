package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.information.domain.h;
import com.yandex.go.information.domain.j;
import com.yandex.go.navigator.gas_stations.repositories.c;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.a0;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.summary.mobilityhub.interactor.m;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.domain.chat.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display.b;
import ru.yandex.taxi.logistics.sdk.mission_details.interactors.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.domain.f0;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;

/* loaded from: classes12.dex */
public final class prq implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public prq(n3w n3wVar, mu7 mu7Var, bcg bcgVar, ybg ybgVar, k1w k1wVar) {
        this.a = 18;
        this.d = n3wVar;
        this.e = mu7Var;
        this.b = bcgVar;
        this.c = ybgVar;
        this.f = k1wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.d;
        switch (i) {
            case 0:
                return new orq((o61) ((c1) xvf0Var5).get(), (to31) xvf0Var.get(), (a52) xvf0Var2.get(), (yh70) xvf0Var4.get(), (kyc) xvf0Var3.get());
            case 1:
                return new a((ru.yandex.taxi.logistics.sdk.mission_details.data.a) xvf0Var.get(), (ij20) ((jl00) xvf0Var5).get(), (com.yandex.delivery.utils.dialogmanager.a) ((can) xvf0Var4).get(), (zch) ((ywf) xvf0Var3).get(), (qj20) xvf0Var2.get());
            case 2:
                return new b((u3s) ((n3w) xvf0Var5).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display.a) ((a9i) xvf0Var).get(), (p6s) ((p1g) xvf0Var2).get(), (hwy0) ((gxf) xvf0Var4).get(), (sae) ((srb) xvf0Var3).get());
            case 3:
                return new kdr((x) ((jpf0) xvf0Var5).get(), (g0g) xvf0Var2, (oep0) xvf0Var.get(), (wiq0) ((w0g) xvf0Var4).get(), (rqo) ((u0g) xvf0Var3).get());
            case 4:
                ro6 ro6Var = (ro6) ((br10) xvf0Var5).get();
                gwr gwrVar = (gwr) ((br10) xvf0Var3).get();
                ph9 ph9Var = (ph9) xvf0Var.get();
                sff sffVar = (sff) xvf0Var2.get();
                return new qxr(ro6Var, gwrVar, ph9Var, sffVar);
            case 5:
                return new z5s((f4l0) xvf0Var.get(), (zqb0) xvf0Var2.get(), (u1n) ((c4p) xvf0Var5).get(), (p6s) xvf0Var4.get(), (xe00) xvf0Var3.get());
            case 6:
                return new com.ybsdk.feature.banners.impl.domain.interactors.a((j3h) ((gwf) xvf0Var5).get(), (com.ybsdk.feature.banners.impl.domain.interactors.b) xvf0Var.get(), (com.ybsdk.common.a) ((gwf) xvf0Var2).get(), (zrm) ((hbn) xvf0Var4).get(), (y1r0) ((owf) xvf0Var3).get());
            case 7:
                return new xus(this.b, (rx4) xvf0Var5, (kts) xvf0Var2.get(), (c) xvf0Var4.get(), (tus) xvf0Var3.get(), 0);
            case 8:
                return new com.yandex.messaging.internal.chat.domain.c((com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get(), (kse) xvf0Var2.get(), (MessengerEnvironment) xvf0Var4.get(), (p220) xvf0Var3.get(), (r1s) ((ret) xvf0Var5).get());
            case 9:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.b((u3s) ((n3w) xvf0Var5).a, (hwy0) ((gxf) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.a) ((rut) xvf0Var2).get(), (p6s) ((p1g) xvf0Var4).get(), (sae) ((srb) xvf0Var3).get());
            case 10:
                return new ru.yandex.taxi.summary.requirements.list.carousel.interactor.a((sk7) ((by8) xvf0Var5).get(), (wiq0) ((w0g) xvf0Var4).get(), (x) xvf0Var.get(), (unj0) ((vnj0) xvf0Var3).get(), (oxu0) xvf0Var2.get());
            case 11:
                return new a0((kdd0) ((vfg0) xvf0Var5).get(), (zkz0) xvf0Var.get(), (k0) ((ut) xvf0Var4).get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var3).get(), (viv0) xvf0Var2.get());
            case 12:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.main_header.b((u3s) ((n3w) xvf0Var5).a, (p6s) ((p1g) xvf0Var).get(), (hwy0) ((gxf) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.main_header.a) ((qy8) xvf0Var4).get(), (sae) ((srb) xvf0Var3).get());
            case 13:
                return new ru.yandex.taxi.hiredriver.c((on2) ((c2g) xvf0Var5).get(), (tt2) ((c2g) xvf0Var).get(), (e2t) ((c2g) xvf0Var2).get(), (com.yandex.go.zone.interactors.a) ((c2g) xvf0Var4).get(), (r1s) ((c2g) xvf0Var3).get());
            case 14:
                return new h((tt2) ((q1g) xvf0Var5).get(), (s4) ((t4) xvf0Var).get(), (j) ((u6o0) xvf0Var2).get(), (nw8) ((h1t) xvf0Var4).get(), (w4l0) ((d2g) xvf0Var3).get());
            case 15:
                return new com.yandex.messaging.input.bricks.writing.b((SharedPreferences) xvf0Var.get(), (ChatRequest) xvf0Var2.get(), (p4t) xvf0Var4.get(), (com.yandex.messaging.navigation.c) xvf0Var3.get(), (reu) ((xat) xvf0Var5).get());
            case 16:
                return new e((kse) xvf0Var.get(), (zrm) ((f9t) xvf0Var5).get(), (w5t) xvf0Var2.get(), (lqo) xvf0Var4.get(), (p4t) xvf0Var3.get());
            case 17:
                return new com.yandex.go.navigator.domain.jam_forecast.a((pwd) ((peb) xvf0Var5).get(), (mwd) xvf0Var.get(), (l4u) ((j4g) xvf0Var3).get(), (vff) xvf0Var2.get(), (uyd) xvf0Var4.get());
            case 18:
                p9x p9xVar = (p9x) ((n3w) xvf0Var5).a;
                m501 m501Var = (m501) ((mu7) xvf0Var4).get();
                com.yandex.messaging.internal.authorized.j jVar = (com.yandex.messaging.internal.authorized.j) xvf0Var.get();
                return new j9x(p9xVar, m501Var, jVar, (r501) ((k1w) xvf0Var3).get());
            case 19:
                return new com.ybsdk.feature.kyc.internal.interactor.a((nbp0) ((u1g) xvf0Var5).get(), (com.ybsdk.feature.kyc.internal.data.a) ((e3u) xvf0Var2).get(), (lnx) xvf0Var.get(), (opx) ((u1g) xvf0Var4).get(), (AppAnalyticsReporter) ((u1g) xvf0Var3).get());
            case 20:
                return new kdz((Context) ((r2g) xvf0Var5).get(), (pdc) ((r2g) xvf0Var).get(), (k7x0) ((r2g) xvf0Var2).get(), (tt2) ((r2g) xvf0Var4).get(), (pwy0) ((r2g) xvf0Var3).get());
            case 21:
                fx60 fx60Var = (fx60) ((h4g) xvf0Var3).get();
                com.yandex.go.navigator.map_interactions.experiment.a aVar = (com.yandex.go.navigator.map_interactions.experiment.a) xvf0Var4.get();
                return new coz(this.b, this.c, (rx4) xvf0Var5, fx60Var, aVar);
            case 22:
                return new com.yandex.go.lootbox.impl.domain.interactors.animation.e((tt2) ((s2g) xvf0Var5).get(), (com.yandex.go.lootbox.impl.data.repository.animation.a) ((e3u) xvf0Var).get(), (qpz) ((e3u) xvf0Var2).get(), (g) ((s2g) xvf0Var4).get(), (ru.yandex.taxi.communications.b) ((qzb) xvf0Var3).get());
            case 23:
                return new q4g((v920) ((ncb) xvf0Var5).get(), (ddf) ((lk) xvf0Var).get(), (u1n) ((oti) xvf0Var2).get(), (oh4) ((qh4) xvf0Var4).get(), (g191) ((c1) xvf0Var3).get(), 27);
            case 24:
                return new com.ybsdk.feature.merchant.offers.internal.screens.search.a((b3z) ((u2g) xvf0Var5).get(), (com.ybsdk.feature.merchant.offers.internal.domain.interactor.b) ((ip10) xvf0Var).get(), (tv3) ((u2g) xvf0Var2).get(), (tfl0) ((j3g) xvf0Var4).get(), (AppAnalyticsReporter) ((j3g) xvf0Var3).get());
            case 25:
                return new jr10((dqe0) ((w0g) xvf0Var5).get(), (vbj0) ((w0g) xvf0Var2).get(), (ru.yandex.taxi.orderforanother.repository.a) ((v0g) xvf0Var4).get(), (amc) ((t0g) xvf0Var3).get(), (rcj0) xvf0Var.get());
            case 26:
                return new qu10((Activity) xvf0Var.get(), (ChatRequest) xvf0Var2.get(), (b00) xvf0Var4.get(), (ts10) ((c0j) xvf0Var5).get(), (f3c) xvf0Var3.get());
            case 27:
                return new i((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var5).get(), (st2) ((gbg) xvf0Var).get(), (x501) ((hbg) xvf0Var2).b.y, (j00) ((c1) xvf0Var4).get(), (com.yandex.delivery.utils.auth.impl.a) ((gbg) xvf0Var3).get());
            case 28:
                return new m((String) xvf0Var.get(), (tt2) xvf0Var2.get(), (ck31) xvf0Var4.get(), (pb31) xvf0Var3.get(), (q) ((dby0) xvf0Var5).get());
            default:
                return new f0((f) xvf0Var.get(), (tt2) ((u3g) xvf0Var5).get(), (d0) ((d701) xvf0Var4).get(), (zuj0) ((v3g) xvf0Var3).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get());
        }
    }

    public /* synthetic */ prq(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = v7pVar;
        this.f = xvf0Var3;
        this.c = xvf0Var4;
    }

    public /* synthetic */ prq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.d = v7pVar;
    }

    public /* synthetic */ prq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ prq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.d = xvf0Var;
        this.c = xvf0Var2;
        this.b = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ prq(v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
        this.f = v7pVar2;
    }

    public prq(n3w n3wVar, v8c0 v8c0Var, xvf0 xvf0Var, c0j c0jVar, xvf0 xvf0Var2) {
        this.a = 26;
        this.b = n3wVar;
        this.c = v8c0Var;
        this.e = xvf0Var;
        this.d = c0jVar;
        this.f = xvf0Var2;
    }

    public prq(peb pebVar, xvf0 xvf0Var, j4g j4gVar, j4g j4gVar2, j4g j4gVar3) {
        this.a = 17;
        this.d = pebVar;
        this.b = xvf0Var;
        this.f = j4gVar;
        this.c = j4gVar2;
        this.e = j4gVar3;
    }

    public prq(l4g l4gVar, z9n z9nVar, rx4 rx4Var, h4g h4gVar, xvf0 xvf0Var) {
        this.a = 21;
        this.b = l4gVar;
        this.c = z9nVar;
        this.d = rx4Var;
        this.f = h4gVar;
        this.e = xvf0Var;
    }

    public prq(br10 br10Var, br10 br10Var2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 4;
        this.d = br10Var;
        this.f = br10Var2;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
    }

    public prq(w0g w0gVar, w0g w0gVar2, v0g v0gVar, t0g t0gVar, xvf0 xvf0Var) {
        this.a = 25;
        this.d = w0gVar;
        this.c = w0gVar2;
        this.e = v0gVar;
        this.f = t0gVar;
        this.b = xvf0Var;
    }

    public prq(xvf0 xvf0Var, xvf0 xvf0Var2, c4p c4pVar, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 5;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = c4pVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }

    public prq(by8 by8Var, w0g w0gVar, jpf0 jpf0Var, vnj0 vnj0Var, x0g x0gVar) {
        this.a = 10;
        this.d = by8Var;
        this.e = w0gVar;
        this.b = jpf0Var;
        this.f = vnj0Var;
        this.c = x0gVar;
    }

    public prq(vfg0 vfg0Var, xvf0 xvf0Var, ut utVar, s3f0 s3f0Var, b1g b1gVar) {
        this.a = 11;
        this.d = vfg0Var;
        this.b = xvf0Var;
        this.e = utVar;
        this.f = s3f0Var;
        this.c = b1gVar;
    }
}
