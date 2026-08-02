package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.domain.interactors.organizations.g;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.organization.card.impl.domain.interactors.flex.a;
import com.yandex.go.scooters.data_form.data.ScootersDataFormApi;
import com.yandex.go.scooters.passes.purchase.superpasses.h;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.b0;
import com.yandex.go.taxi.order.promotions.modal_default.interactor.c;
import com.yandex.go.taxi.order.queue.interactor.d;
import com.yandex.go.taxi.order.queue.interactor.l;
import com.yandex.go.timer.k;
import com.yandex.go.zone.repository.o;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import java.util.Map;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.requirements.interactor.u;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.summary.personalaction.popup.f;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class q150 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public q150(n3w n3wVar, gv8 gv8Var, xvf0 xvf0Var, zni0 zni0Var, t6g t6gVar, u6g u6gVar, r6g r6gVar) {
        this.a = 15;
        this.b = n3wVar;
        this.g = gv8Var;
        this.c = xvf0Var;
        this.d = zni0Var;
        this.h = t6gVar;
        this.e = u6gVar;
        this.f = r6gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.h;
        xvf0 xvf0Var6 = this.c;
        xvf0 xvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new p150((Context) xvf0Var7.get(), (o1b0) xvf0Var6.get(), (at2) xvf0Var3.get(), (oeb) ((peb) xvf0Var5).get(), (rp21) xvf0Var.get(), (z5z) xvf0Var2.get(), i5m.a(xvf0Var4));
            case 1:
                return new ch50((ji50) ((n3w) xvf0Var3).a, (ih50) xvf0Var7.get(), (mi50) xvf0Var6.get(), (w4l0) ((n3w) xvf0Var).a, (o) ((o4g) xvf0Var2).get(), (xl10) ((lq40) xvf0Var4).get(), (jei) ((n4g) xvf0Var5).get());
            case 2:
                return new c((pwy0) ((r4g) xvf0Var6).get(), (e) ((r4g) xvf0Var3).get(), (k7x0) ((r4g) xvf0Var).get(), (oxu0) ((r4g) xvf0Var2).get(), (irs0) ((r4g) xvf0Var4).get(), (my20) xvf0Var7.get(), (p2y0) ((r4g) xvf0Var5).get());
            case 3:
                return new a((e2t) xvf0Var7.get(), (qf80) xvf0Var6.get(), (tt2) xvf0Var3.get(), (wnt) xvf0Var.get(), (com.yandex.go.places.organization.card.impl.data.mappers.a) ((ahu) xvf0Var4).get(), (b) xvf0Var2.get(), (d3a) ((qzb) xvf0Var5).get());
            case 4:
                return new com.yandex.go.places.impl.ui.organizations.e((com.yandex.go.places.impl.domain.interactors.organizations.a) xvf0Var7.get(), (cn80) xvf0Var6.get(), (com.yandex.go.places.impl.data.repositories.organizations.b) xvf0Var3.get(), (g) ((hs30) xvf0Var5).get(), (xk80) xvf0Var.get(), (com.yandex.go.places.impl.domain.interactors.common.a) xvf0Var2.get(), ((Boolean) xvf0Var4.get()).booleanValue());
            case 5:
                return new f((tse) xvf0Var7.get(), (ru.yandex.taxi.personalstate.data.remote.a) xvf0Var6.get(), (amc) xvf0Var3.get(), (wiq0) xvf0Var.get(), (vqv0) xvf0Var2.get(), (ol3) ((vqa0) xvf0Var5).get(), (n3b0) xvf0Var4.get());
            case 6:
                return new v7b0((k7x0) xvf0Var7.get(), (j51) ((k51) xvf0Var2).get(), (hju) ((xat) xvf0Var4).get(), (k3o) ((hbn) xvf0Var5).get(), (gu11) xvf0Var6.get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (pdc) xvf0Var.get());
            case 7:
                return new com.yandex.go.pickup_from_photo.data.b((atd0) ((n5g) xvf0Var6).get(), (h2t) ((n5g) xvf0Var3).get(), (po21) ((n5g) xvf0Var).get(), (e2t) ((n5g) xvf0Var2).get(), (i) ((z4g) xvf0Var4).get(), (y4a0) ((g680) xvf0Var5).get(), (vmb0) xvf0Var7.get());
            case 8:
                return new com.yandex.go.places.map.ui.configs.cluster.a((zfc0) xvf0Var7.get(), (e8c) ((f8c) xvf0Var5).get(), (tcc0) xvf0Var6.get(), (pav) xvf0Var3.get(), (tse) xvf0Var.get(), (pwy0) xvf0Var2.get(), (odc0) xvf0Var4.get());
            case 9:
                return new l((tt2) ((i9g) xvf0Var7).get(), (com.yandex.go.navigation.screen.c) ((i9g) xvf0Var6).get(), (n20) ((i9g) xvf0Var3).get(), (com.yandex.go.taxi.order.queue.mapper.a) ((tgb0) xvf0Var).get(), (com.yandex.go.taxi.order.domain.repositories.e) ((j9g) xvf0Var2).get(), (com.yandex.go.taxi.order.queue.interactor.e) ((fy30) xvf0Var4).get(), (d) ((j9g) xvf0Var5).get());
            case 10:
                mlg0 mlg0Var = (mlg0) xvf0Var7.get();
                o1w o1wVar = (o1w) xvf0Var6.get();
                h3y a = i5m.a(xvf0Var3);
                xzq xzqVar = (xzq) xvf0Var.get();
                noy0 noy0Var = (noy0) xvf0Var2.get();
                return new wlg0(mlg0Var, o1wVar, a, xzqVar, noy0Var, (zg10) ((h0z) xvf0Var5).get());
            case 11:
                return new com.ybsdk.screens.registration.a((hri0) xvf0Var7.get(), (kg51) ((k6g) xvf0Var3).get(), (com.ybsdk.screens.registration.data.c) xvf0Var6.get(), (com.ybsdk.rconfig.b) ((k6g) xvf0Var).get(), (com.ybsdk.common.repositiories.onboarding.a) ((lq40) xvf0Var2).get(), (a3h) ((k6g) xvf0Var4).get(), (Map) ((eqh) xvf0Var5).get());
            case 12:
                return new b0((vfx0) xvf0Var7.get(), (caj0) ((n7i0) xvf0Var2).get(), (maj0) xvf0Var6.get(), (lci) xvf0Var3.get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var4).get(), (viv0) xvf0Var.get(), (wiq0) ((w0g) xvf0Var5).get());
            case 13:
                return new u((dqe0) ((w0g) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var5).get(), (ck31) xvf0Var7.get(), (cjj0) xvf0Var6.get(), (hqj0) xvf0Var3.get(), (bqj0) xvf0Var.get(), (ewi0) xvf0Var2.get());
            case 14:
                return new com.yandex.go.taxi.order.details.v2.state.elements.driver.c((o2y0) xvf0Var7.get(), (t48) xvf0Var6.get(), i5m.a(xvf0Var3), (ru.yandex.taxi.widget.c) xvf0Var.get(), (com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.a) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.a) ((zni0) xvf0Var4).get(), (pgk0) ((zni0) xvf0Var5).get());
            case 15:
                return new com.yandex.go.taxi.order.details.v2.core.c((o2y0) xvf0Var7.get(), (com.yandex.go.taxi.order.details.v2.state.a) ((gv8) xvf0Var4).get(), (jkk0) xvf0Var6.get(), (cgk0) xvf0Var3.get(), (yxf0) ((t6g) xvf0Var5).get(), (pwy0) xvf0Var.get(), (tt2) xvf0Var2.get());
            case 16:
                return new umk0((Context) ((r6g) xvf0Var5).get(), (o2y0) xvf0Var7.get(), (sqs0) xvf0Var6.get(), (e) xvf0Var3.get(), (jgv) xvf0Var.get(), (tt2) xvf0Var2.get(), (pwy0) xvf0Var4.get());
            case 17:
                return new com.yandex.go.taxi.order.details.v2.state.elements.status_progress.a((lbk0) xvf0Var7.get(), (pdc) xvf0Var6.get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (crg) xvf0Var.get(), (k) xvf0Var2.get(), (fok0) ((jzi0) xvf0Var4).get(), (jtq0) ((u6g) xvf0Var5).get());
            case 18:
                return new com.ybsdk.feature.savings.internal.data.b((SavingsApi) xvf0Var7.get(), (ucm0) ((g7g) xvf0Var6).get(), (mdm0) ((g7g) xvf0Var3).get(), (com.ybsdk.feature.savings.internal.mapper.b) ((jpj0) xvf0Var).get(), (com.ybsdk.feature.savings.internal.mapper.c) ((mam0) xvf0Var2).get(), (com.ybsdk.feature.savings.internal.network.dto.a) ((h69) xvf0Var4).get(), (com.ybsdk.feature.savings.internal.entities.c) ((h69) xvf0Var5).get());
            case 19:
                return new oy7((gum0) xvf0Var7.get(), (com.yandex.go.scooters.passes.active.v3.d) ((vfg0) xvf0Var4).get(), (Context) xvf0Var6.get(), (w030) xvf0Var3.get(), this.e, this.f, (m580) xvf0Var5);
            case 20:
                return new com.yandex.go.scooters.offers.v2.domain.a((com.yandex.go.scooters.data.a) xvf0Var7.get(), (com.yandex.go.scooters.data.mapper.b) ((p8k0) xvf0Var4).get(), (qoo0) xvf0Var6.get(), (com.yandex.go.scooters.payments.data.c) xvf0Var3.get(), (i5n0) xvf0Var.get(), (q4o0) xvf0Var2.get(), (d3a) ((upk0) xvf0Var5).get());
            case 21:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.a((Context) xvf0Var7.get(), (tse) xvf0Var6.get(), (edh) xvf0Var3.get(), this.e, (kan0) xvf0Var2.get(), (kdd0) ((rx4) xvf0Var5).get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d) xvf0Var4.get());
            case 22:
                wnt wntVar = (wnt) xvf0Var7.get();
                return new v920(wntVar, (com.yandex.go.scooters.misc.web.a) xvf0Var3.get(), (ScootersDataFormApi) ((bwn0) xvf0Var5).get(), (kkn0) xvf0Var.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var2.get(), (v0n0) xvf0Var4.get());
            case 23:
                return new com.yandex.go.scooters.ignition.panel.c((yrn0) ((ph70) xvf0Var2).get(), (trn0) ((g1n0) xvf0Var4).get(), (Context) xvf0Var7.get(), (w030) xvf0Var6.get(), (brn0) xvf0Var3.get(), this.e, (m580) xvf0Var5);
            case 24:
                return new com.yandex.go.scooters.insurance.f((w030) xvf0Var7.get(), (MapNotificationsMuteRepository) xvf0Var6.get(), (jtn0) xvf0Var3.get(), (rtn0) xvf0Var.get(), this.f, this.g, (qx5) xvf0Var5);
            case 25:
                return new iun0((tun0) ((zmm0) xvf0Var4).get(), (com.yandex.go.scooters.insurance.suggest.v2.d) ((g1n0) xvf0Var5).get(), (Context) xvf0Var7.get(), (w030) xvf0Var6.get(), this.d, this.e, this.f);
            case 26:
                return new iun0((q8o0) ((u6o0) xvf0Var4).get(), (com.yandex.go.scooters.passes.purchase.packages.g) ((pmn0) xvf0Var5).get(), (Context) xvf0Var7.get(), (w030) xvf0Var6.get(), this.d, this.e, this.f);
            case 27:
                return new t1p0((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var7.get(), (lbn0) xvf0Var6.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var3.get(), (ufo0) xvf0Var.get(), (h) ((pmn0) xvf0Var5).get(), (l0p0) xvf0Var2.get());
            case 28:
                return new itp0((b) xvf0Var7.get(), (avp0) xvf0Var6.get(), (vvp0) ((n3w) xvf0Var4).a, (w030) ((x4g) xvf0Var5).get(), (mg80) xvf0Var3.get(), (wbc0) xvf0Var.get(), (kn80) xvf0Var2.get());
            default:
                return new qtp0((o2y0) ((n3w) xvf0Var).a, (ndl0) ((z1n0) xvf0Var2).get(), (jzf0) xvf0Var7.get(), (com.yandex.go.taxi.order.search.ui.search_views.d) xvf0Var6.get(), (ru.yandex.taxi.search.overlay.legacy.animations.a) ((rut) xvf0Var4).get(), (ah00) ((i9g) xvf0Var5).get(), (l390) xvf0Var3.get());
        }
    }

    public /* synthetic */ q150(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.h = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ q150(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.h = v7pVar;
        this.g = xvf0Var6;
    }

    public /* synthetic */ q150(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ q150(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i, boolean z) {
        this.a = i;
        this.g = xvf0Var;
        this.h = xvf0Var2;
        this.b = xvf0Var3;
        this.c = xvf0Var4;
        this.d = xvf0Var5;
        this.e = xvf0Var6;
        this.f = xvf0Var7;
    }

    public /* synthetic */ q150(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = i;
        this.b = v7pVar;
        this.g = v7pVar2;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.h = v7pVar3;
    }

    public q150(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar2, o4g o4gVar, lq40 lq40Var, n4g n4gVar) {
        this.a = 1;
        this.d = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = n3wVar2;
        this.f = o4gVar;
        this.g = lq40Var;
        this.h = n4gVar;
    }

    public q150(n3w n3wVar, z1n0 z1n0Var, xvf0 xvf0Var, xvf0 xvf0Var2, rut rutVar, i9g i9gVar, xvf0 xvf0Var3) {
        this.a = 29;
        this.e = n3wVar;
        this.f = z1n0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = rutVar;
        this.h = i9gVar;
        this.d = xvf0Var3;
    }

    public q150(fy30 fy30Var, f8c f8cVar, g680 g680Var, x4g x4gVar, n3w n3wVar, z4g z4gVar, n3w n3wVar2) {
        this.a = 8;
        this.b = fy30Var;
        this.h = f8cVar;
        this.c = g680Var;
        this.d = x4gVar;
        this.e = n3wVar;
        this.f = z4gVar;
        this.g = n3wVar2;
    }

    public q150(r4g r4gVar, r4g r4gVar2, r4g r4gVar3, r4g r4gVar4, r4g r4gVar5, xvf0 xvf0Var, r4g r4gVar6) {
        this.a = 2;
        this.c = r4gVar;
        this.d = r4gVar2;
        this.e = r4gVar3;
        this.f = r4gVar4;
        this.g = r4gVar5;
        this.b = xvf0Var;
        this.h = r4gVar6;
    }

    public q150(x4g x4gVar, xvf0 xvf0Var, o4g o4gVar, x4g x4gVar2, ahu ahuVar, n3w n3wVar, qzb qzbVar) {
        this.a = 3;
        this.b = x4gVar;
        this.c = xvf0Var;
        this.d = o4gVar;
        this.e = x4gVar2;
        this.g = ahuVar;
        this.f = n3wVar;
        this.h = qzbVar;
    }

    public q150(n5g n5gVar, n5g n5gVar2, n5g n5gVar3, n5g n5gVar4, z4g z4gVar, g680 g680Var, xvf0 xvf0Var) {
        this.a = 7;
        this.c = n5gVar;
        this.d = n5gVar2;
        this.e = n5gVar3;
        this.f = n5gVar4;
        this.g = z4gVar;
        this.h = g680Var;
        this.b = xvf0Var;
    }

    public q150(e7g e7gVar, n7g n7gVar, xvf0 xvf0Var, l7g l7gVar, xvf0 xvf0Var2, pmn0 pmn0Var, ivo0 ivo0Var) {
        this.a = 27;
        this.g = e7gVar;
        this.b = n7gVar;
        this.c = xvf0Var;
        this.d = l7gVar;
        this.e = xvf0Var2;
        this.h = pmn0Var;
        this.f = ivo0Var;
    }

    public q150(xvf0 xvf0Var, k51 k51Var, xat xatVar, hbn hbnVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 6;
        this.b = xvf0Var;
        this.f = k51Var;
        this.g = xatVar;
        this.h = hbnVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public q150(xvf0 xvf0Var, k6g k6gVar, xvf0 xvf0Var2, k6g k6gVar2, lq40 lq40Var, k6g k6gVar3, eqh eqhVar) {
        this.a = 11;
        this.b = xvf0Var;
        this.d = k6gVar;
        this.c = xvf0Var2;
        this.e = k6gVar2;
        this.f = lq40Var;
        this.g = k6gVar3;
        this.h = eqhVar;
    }

    public q150(r6g r6gVar, n3w n3wVar, xvf0 xvf0Var, s6g s6gVar, s6g s6gVar2, r6g r6gVar2, u6g u6gVar) {
        this.a = 16;
        this.h = r6gVar;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = s6gVar;
        this.e = s6gVar2;
        this.f = r6gVar2;
        this.g = u6gVar;
    }

    public q150(n3w n3wVar, n3w n3wVar2, n3w n3wVar3, x4g x4gVar, xvf0 xvf0Var, xvf0 xvf0Var2, g970 g970Var) {
        this.a = 28;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.g = n3wVar3;
        this.h = x4gVar;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = g970Var;
    }

    public q150(xvf0 xvf0Var, n7i0 n7i0Var, z0g z0gVar, u0g u0gVar, s3f0 s3f0Var, b1g b1gVar, w0g w0gVar) {
        this.a = 12;
        this.b = xvf0Var;
        this.f = n7i0Var;
        this.c = z0gVar;
        this.d = u0gVar;
        this.g = s3f0Var;
        this.e = b1gVar;
        this.h = w0gVar;
    }

    public q150(ph70 ph70Var, g1n0 g1n0Var, j7g j7gVar, k7g k7gVar, yxm0 yxm0Var, l7g l7gVar, m580 m580Var) {
        this.a = 23;
        this.f = ph70Var;
        this.g = g1n0Var;
        this.b = j7gVar;
        this.c = k7gVar;
        this.d = yxm0Var;
        this.e = l7gVar;
        this.h = m580Var;
    }
}
