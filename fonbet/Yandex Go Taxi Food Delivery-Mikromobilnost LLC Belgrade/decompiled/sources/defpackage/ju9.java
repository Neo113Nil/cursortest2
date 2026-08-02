package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.domain.mapper.a;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.navigator.main_screen.o;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.b;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.d;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.o0;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.report.reporters.n;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.ui.bouncer.i;
import com.yandex.passport.internal.ui.bouncer.l;
import com.yandex.passport.internal.ui.bouncer.t;
import ru.yandex.taxi.orderbutton.summary.base.interactors.j;
import ru.yandex.taxi.preorder.interactor.g;
import ru.yandex.taxi.summary.solid.interactor.s;
import ru.yandex.taxi.summary.solid.p;
import ru.yandex.taxi.ui.recenter.RecenterButton;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class ju9 implements v7p {
    public final /* synthetic */ int a = 3;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;
    public final yvf0 l;
    public final yvf0 m;
    public final yvf0 n;
    public final yvf0 o;
    public final yvf0 p;
    public final yvf0 q;
    public final yvf0 r;
    public final yvf0 s;

    public ju9(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, yvf0 yvf0Var13, yvf0 yvf0Var14, yvf0 yvf0Var15, yvf0 yvf0Var16, yvf0 yvf0Var17, yvf0 yvf0Var18) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.i = yvf0Var8;
        this.j = yvf0Var9;
        this.k = yvf0Var10;
        this.l = yvf0Var11;
        this.m = yvf0Var12;
        this.n = yvf0Var13;
        this.o = yvf0Var14;
        this.p = yvf0Var15;
        this.q = yvf0Var16;
        this.r = yvf0Var17;
        this.s = yvf0Var18;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.s;
        yvf0 yvf0Var2 = this.r;
        yvf0 yvf0Var3 = this.q;
        yvf0 yvf0Var4 = this.p;
        yvf0 yvf0Var5 = this.o;
        yvf0 yvf0Var6 = this.n;
        yvf0 yvf0Var7 = this.m;
        yvf0 yvf0Var8 = this.l;
        yvf0 yvf0Var9 = this.k;
        yvf0 yvf0Var10 = this.j;
        yvf0 yvf0Var11 = this.i;
        yvf0 yvf0Var12 = this.h;
        yvf0 yvf0Var13 = this.g;
        yvf0 yvf0Var14 = this.f;
        yvf0 yvf0Var15 = this.e;
        yvf0 yvf0Var16 = this.d;
        yvf0 yvf0Var17 = this.c;
        yvf0 yvf0Var18 = this.b;
        switch (i) {
            case 0:
                return new ke8((Context) ((xvf0) yvf0Var18).get(), (lg21) ((xvf0) yvf0Var17).get(), (on2) ((pxf) yvf0Var2).get(), (zuj0) ((xvf0) yvf0Var16).get(), (em9) ((xvf0) yvf0Var15).get(), (qy9) ((xvf0) yvf0Var14).get(), (e) ((xvf0) yvf0Var13).get(), (c) ((xvf0) yvf0Var12).get(), (a) ((xvf0) yvf0Var11).get(), (pwy0) ((xvf0) yvf0Var10).get(), (f) ((xvf0) yvf0Var9).get(), (com.yandex.go.chargers.error.data.a) ((xvf0) yvf0Var8).get(), (lpa) ((xvf0) yvf0Var7).get(), (po21) ((xvf0) yvf0Var6).get(), (rpa) ((xvf0) yvf0Var5).get(), (com.yandex.go.chargers.payments.navigation.a) ((kj7) yvf0Var).get(), (com.yandex.go.chargers.payments.data.a) ((xvf0) yvf0Var4).get(), (w030) ((xvf0) yvf0Var3).get());
            case 1:
                return new b((wiq0) ((w0g) yvf0Var5).get(), (vfx0) ((xvf0) yvf0Var18).get(), (uze0) ((xvf0) yvf0Var17).get(), (viv0) ((xvf0) yvf0Var16).get(), (com.yandex.go.route.interactor.c) ((xvf0) yvf0Var15).get(), (zuj0) ((xvf0) yvf0Var14).get(), (fkx0) ((xvf0) yvf0Var13).get(), (com.yandex.go.tariffcard.ui.f) ((xvf0) yvf0Var12).get(), (hh4) ((xvf0) yvf0Var11).get(), (pwy0) ((xvf0) yvf0Var10).get(), (o0) ((jdu) yvf0Var4).get(), (v9u) ((xat) yvf0Var3).get(), (sjp) ((q02) yvf0Var2).get(), (d) ((wz30) yvf0Var).get(), (com.yandex.go.pin.api.widget.b) ((xvf0) yvf0Var9).get(), (s0c0) ((xvf0) yvf0Var8).get(), (sfx0) ((xvf0) yvf0Var7).get(), (e) ((xvf0) yvf0Var6).get());
            case 2:
                return new o((ut) yvf0Var3, (re50) ((xvf0) yvf0Var18).get(), (v) ((xvf0) yvf0Var17).get(), (com.yandex.go.navigator.events.f) ((xvf0) yvf0Var16).get(), (xvf0) yvf0Var15, (xvf0) yvf0Var14, (com.yandex.go.navigator.address.a) ((h0z) yvf0Var2).get(), (com.yandex.go.navigator.domain.b) ((xvf0) yvf0Var13).get(), (jpj0) yvf0Var, (tt2) ((xvf0) yvf0Var12).get(), (xvf0) yvf0Var11, (com.yandex.go.navigator.main_screen.experiement.e) ((xvf0) yvf0Var10).get(), (lg50) ((xvf0) yvf0Var9).get(), (tz60) ((xvf0) yvf0Var8).get(), i5m.a((xvf0) yvf0Var7), (zuj0) ((xvf0) yvf0Var6).get(), (xvf0) yvf0Var5, (ah00) ((xvf0) yvf0Var4).get());
            case 3:
                return new cqe0((cv00) ((xvf0) yvf0Var18).get(), (rjt0) ((xvf0) yvf0Var17).get(), (tt2) ((xvf0) yvf0Var16).get(), (noe) ((xvf0) yvf0Var15).get(), (leh) ((xvf0) yvf0Var14).get(), (com.yandex.go.zone.repository.o) ((xvf0) yvf0Var13).get(), (mqz0) ((xvf0) yvf0Var12).get(), (wiq0) ((xvf0) yvf0Var11).get(), (kt00) ((xvf0) yvf0Var10).get(), (com.yandex.go.route.interactor.c) ((xvf0) yvf0Var9).get(), (pei) ((xvf0) yvf0Var8).get(), (iv70) ((xvf0) yvf0Var7).get(), (lr00) ((xvf0) yvf0Var6).get(), (opz0) ((xvf0) yvf0Var5).get(), (iqz0) ((xvf0) yvf0Var4).get(), (g) ((wj0) yvf0Var2).get(), (com.yandex.go.network.connectivity.a) ((xvf0) yvf0Var3).get(), (rqo) ((xvf0) yvf0Var).get());
            case 4:
                return new fjj0((lx4) ((xvf0) yvf0Var18).get(), (pho) ((xvf0) yvf0Var17).get(), (tt2) ((xvf0) yvf0Var16).get(), (dqe0) ((w0g) yvf0Var6).get(), (phj0) ((xvf0) yvf0Var15).get(), (mnc) ((xvf0) yvf0Var14).get(), (Context) ((t0g) yvf0Var5).get(), (pwy0) ((xvf0) yvf0Var13).get(), (com.yandex.go.taxi.tariffs.repository.g) ((w0g) yvf0Var4).get(), (arv0) ((xvf0) yvf0Var12).get(), zzf.Z0(), (pdc) ((xvf0) yvf0Var11).get(), (aqj0) ((zni0) yvf0Var3).get(), (wiq0) ((w0g) yvf0Var2).get(), (gmx0) ((abx0) yvf0Var).get(), (iev0) ((xvf0) yvf0Var10).get(), (oep0) ((xvf0) yvf0Var9).get(), (pav) ((xvf0) yvf0Var8).get(), i5m.a((xvf0) yvf0Var7));
            case 5:
                return new RideCardModalView((Context) ((r6g) yvf0Var2).get(), (ykk0) ((xvf0) yvf0Var18).get(), (tse) ((xvf0) yvf0Var17).get(), (ars0) ((xvf0) yvf0Var16).get(), (k030) ((xvf0) yvf0Var15).get(), (z0a0) ((xvf0) yvf0Var14).get(), (ukk0) ((xvf0) yvf0Var13).get(), (okk0) ((xvf0) yvf0Var12).get(), (wa80) ((xvf0) yvf0Var11).get(), (com.yandex.go.taxi.order.details.v2.analytics.g) ((xvf0) yvf0Var10).get(), (com.yandex.go.taxi.order.details.v2.analytics.perf.a) ((xvf0) yvf0Var9).get(), (RecenterButton) ((xvf0) yvf0Var8).get(), (gok0) ((xvf0) yvf0Var7).get(), i5m.a((xvf0) yvf0Var6), (ydk0) ((xvf0) yvf0Var5).get(), (ckk0) ((n3w) yvf0Var).a, (g6y0) ((xvf0) yvf0Var4).get(), (y4k0) ((xvf0) yvf0Var3).get());
            case 6:
                return new p((tse) ((y0g) yvf0Var9).get(), (ru.yandex.taxi.summary.promotions.interactor.a) ((t4v0) yvf0Var8).get(), (ru.yandex.taxi.summary.solid.interactor.p) ((so4) yvf0Var7).get(), (oo6) ((g6) yvf0Var6).get(), (s) ((s3f0) yvf0Var5).get(), (ff9) ((xvf0) yvf0Var18).get(), (mrj) ((c4) yvf0Var4).get(), (com.yandex.go.taxi.auction.domain.a) ((xvf0) yvf0Var17).get(), (an8) ((f2b) yvf0Var3).get(), (wiq0) ((w0g) yvf0Var2).get(), (tt2) ((xvf0) yvf0Var16).get(), (s0g) yvf0Var, (oep0) ((xvf0) yvf0Var15).get(), (ajj0) ((xvf0) yvf0Var14).get(), (kdr) ((xvf0) yvf0Var13).get(), (xvf0) yvf0Var12, (z880) ((xvf0) yvf0Var11).get(), (vqv0) ((xvf0) yvf0Var10).get());
            case 7:
                return new j(i5m.a((xvf0) yvf0Var18), i5m.a((h0z) yvf0Var13), i5m.a((rwh) yvf0Var12), i5m.a((uc50) yvf0Var11), i5m.a((mu7) yvf0Var10), i5m.a((xvf0) yvf0Var17), i5m.a((xvf0) yvf0Var16), i5m.a((l180) yvf0Var9), i5m.a((jde0) yvf0Var8), i5m.a((x851) yvf0Var7), i5m.a((k1w) yvf0Var6), i5m.a((ibz0) yvf0Var5), i5m.a((p6f) yvf0Var4), i5m.a((c7n) yvf0Var3), i5m.a((ze) yvf0Var2), i5m.a((t4v0) yvf0Var), i5m.a((xvf0) yvf0Var15), (j7h) ((xvf0) yvf0Var14).get());
            default:
                return new i((Activity) yvf0Var18.get(), (com.yandex.passport.internal.ui.bouncer.sloth.g) yvf0Var17.get(), (l) yvf0Var16.get(), (t) yvf0Var15.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.v) yvf0Var14.get(), (com.yandex.passport.internal.ui.bouncer.loading.c) yvf0Var13.get(), (com.yandex.passport.internal.ui.bouncer.loading.f) yvf0Var12.get(), (com.yandex.passport.internal.ui.bouncer.error.a) yvf0Var11.get(), (com.yandex.passport.internal.ui.bouncer.fallback.c) yvf0Var10.get(), i5m.a(cma1.i(yvf0Var9)), (com.yandex.passport.internal.ui.bouncer.error.p) yvf0Var8.get(), (com.yandex.passport.internal.ui.bouncer.loading.j) yvf0Var7.get(), (n) yvf0Var6.get(), (zd) yvf0Var5.get(), (com.yandex.passport.internal.flags.j) yvf0Var4.get(), (ProgressPropertiesImpl) yvf0Var3.get(), (com.yandex.passport.internal.ui.bouncer.chooser.l) yvf0Var2.get(), (com.yandex.passport.internal.ui.bouncer.sloth.f) yvf0Var.get());
        }
    }

    public ju9(xvf0 xvf0Var, h0z h0zVar, rwh rwhVar, uc50 uc50Var, mu7 mu7Var, xvf0 xvf0Var2, xvf0 xvf0Var3, l180 l180Var, jde0 jde0Var, x851 x851Var, k1w k1wVar, ibz0 ibz0Var, p6f p6fVar, c7n c7nVar, ze zeVar, t4v0 t4v0Var, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.b = xvf0Var;
        this.g = h0zVar;
        this.h = rwhVar;
        this.i = uc50Var;
        this.j = mu7Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.k = l180Var;
        this.l = jde0Var;
        this.m = x851Var;
        this.n = k1wVar;
        this.o = ibz0Var;
        this.p = p6fVar;
        this.q = c7nVar;
        this.r = zeVar;
        this.s = t4v0Var;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public ju9(w0g w0gVar, xvf0 xvf0Var, w0g w0gVar2, b1g b1gVar, b1g b1gVar2, w0g w0gVar3, rbx0 rbx0Var, t4v0 t4v0Var, xvf0 xvf0Var2, x0g x0gVar, jdu jduVar, xat xatVar, q02 q02Var, wz30 wz30Var, w0g w0gVar4, w0g w0gVar5, b1g b1gVar3, xvf0 xvf0Var3) {
        this.o = w0gVar;
        this.b = xvf0Var;
        this.c = w0gVar2;
        this.d = b1gVar;
        this.e = b1gVar2;
        this.f = w0gVar3;
        this.g = rbx0Var;
        this.h = t4v0Var;
        this.i = xvf0Var2;
        this.j = x0gVar;
        this.p = jduVar;
        this.q = xatVar;
        this.r = q02Var;
        this.s = wz30Var;
        this.k = w0gVar4;
        this.l = w0gVar5;
        this.m = b1gVar3;
        this.n = xvf0Var3;
    }

    public ju9(bsz bszVar, xvf0 xvf0Var, xvf0 xvf0Var2, gw7 gw7Var, xvf0 xvf0Var3, xvf0 xvf0Var4, dby0 dby0Var, xvf0 xvf0Var5, xvf0 xvf0Var6, qxu0 qxu0Var, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, wj0 wj0Var, xvf0 xvf0Var12, xvf0 xvf0Var13) {
        this.b = bszVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = gw7Var;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = dby0Var;
        this.i = xvf0Var5;
        this.j = xvf0Var6;
        this.k = qxu0Var;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = xvf0Var9;
        this.o = xvf0Var10;
        this.p = xvf0Var11;
        this.r = wj0Var;
        this.q = xvf0Var12;
        this.s = xvf0Var13;
    }

    public ju9(ut utVar, j4g j4gVar, xvf0 xvf0Var, l4g l4gVar, pp0 pp0Var, ge50 ge50Var, h0z h0zVar, fwc fwcVar, jpj0 jpj0Var, h4g h4gVar, z9n z9nVar, uc50 uc50Var, xvf0 xvf0Var2, xvf0 xvf0Var3, k4g k4gVar, l4g l4gVar2, ii9 ii9Var, k4g k4gVar2) {
        this.q = utVar;
        this.b = j4gVar;
        this.c = xvf0Var;
        this.d = l4gVar;
        this.e = pp0Var;
        this.f = ge50Var;
        this.r = h0zVar;
        this.g = fwcVar;
        this.s = jpj0Var;
        this.h = h4gVar;
        this.i = z9nVar;
        this.j = uc50Var;
        this.k = xvf0Var2;
        this.l = xvf0Var3;
        this.m = k4gVar;
        this.n = l4gVar2;
        this.o = ii9Var;
        this.p = k4gVar2;
    }

    public ju9(y0g y0gVar, t4v0 t4v0Var, so4 so4Var, g6 g6Var, s3f0 s3f0Var, g0g g0gVar, c4 c4Var, xvf0 xvf0Var, f2b f2bVar, w0g w0gVar, t0g t0gVar, s0g s0gVar, a1g a1gVar, cta0 cta0Var, prq prqVar, y0g y0gVar2, eqh eqhVar, xvf0 xvf0Var2) {
        this.k = y0gVar;
        this.l = t4v0Var;
        this.m = so4Var;
        this.n = g6Var;
        this.o = s3f0Var;
        this.b = g0gVar;
        this.p = c4Var;
        this.c = xvf0Var;
        this.q = f2bVar;
        this.r = w0gVar;
        this.d = t0gVar;
        this.s = s0gVar;
        this.e = a1gVar;
        this.f = cta0Var;
        this.g = prqVar;
        this.h = y0gVar2;
        this.i = eqhVar;
        this.j = xvf0Var2;
    }

    public ju9(pxf pxfVar, rxf rxfVar, pxf pxfVar2, qxf qxfVar, lxf lxfVar, rx4 rx4Var, pxf pxfVar3, pxf pxfVar4, mu7 mu7Var, qxf qxfVar2, fr3 fr3Var, cg7 cg7Var, xvf0 xvf0Var, rxf rxfVar2, xvf0 xvf0Var2, kj7 kj7Var, lxf lxfVar2, qxf qxfVar3) {
        this.b = pxfVar;
        this.c = rxfVar;
        this.r = pxfVar2;
        this.d = qxfVar;
        this.e = lxfVar;
        this.f = rx4Var;
        this.g = pxfVar3;
        this.h = pxfVar4;
        this.i = mu7Var;
        this.j = qxfVar2;
        this.k = fr3Var;
        this.l = cg7Var;
        this.m = xvf0Var;
        this.n = rxfVar2;
        this.o = xvf0Var2;
        this.s = kj7Var;
        this.p = lxfVar2;
        this.q = qxfVar3;
    }

    public ju9(r6g r6gVar, xvf0 xvf0Var, s6g s6gVar, u6g u6gVar, n3w n3wVar, t6g t6gVar, qx4 qx4Var, n3w n3wVar2, u6g u6gVar2, wj0 wj0Var, xvf0 xvf0Var2, t6g t6gVar2, t6g t6gVar3, t6g t6gVar4, r6g r6gVar2, n3w n3wVar3, t6g t6gVar5, t6g t6gVar6) {
        this.r = r6gVar;
        this.b = xvf0Var;
        this.c = s6gVar;
        this.d = u6gVar;
        this.e = n3wVar;
        this.f = t6gVar;
        this.g = qx4Var;
        this.h = n3wVar2;
        this.i = u6gVar2;
        this.j = wj0Var;
        this.k = xvf0Var2;
        this.l = t6gVar2;
        this.m = t6gVar3;
        this.n = t6gVar4;
        this.o = r6gVar2;
        this.s = n3wVar3;
        this.p = t6gVar5;
        this.q = t6gVar6;
    }

    public ju9(t0g t0gVar, u0g u0gVar, t0g t0gVar2, w0g w0gVar, ad adVar, g0g g0gVar, t0g t0gVar3, x0g x0gVar, w0g w0gVar2, x0g x0gVar2, nwf nwfVar, a1g a1gVar, zni0 zni0Var, w0g w0gVar3, abx0 abx0Var, y0g y0gVar, a1g a1gVar2, u0g u0gVar2, g0g g0gVar2) {
        this.b = t0gVar;
        this.c = u0gVar;
        this.d = t0gVar2;
        this.n = w0gVar;
        this.e = adVar;
        this.f = g0gVar;
        this.o = t0gVar3;
        this.g = x0gVar;
        this.p = w0gVar2;
        this.h = x0gVar2;
        this.i = a1gVar;
        this.q = zni0Var;
        this.r = w0gVar3;
        this.s = abx0Var;
        this.j = y0gVar;
        this.k = a1gVar2;
        this.l = u0gVar2;
        this.m = g0gVar2;
    }
}
