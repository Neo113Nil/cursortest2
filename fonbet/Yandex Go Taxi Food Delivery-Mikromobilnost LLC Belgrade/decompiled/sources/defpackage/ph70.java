package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.data.mappers.organizations.e;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.scooters.ignition.domain.k;
import com.yandex.go.scooters.ignition.domain.l;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.taxi.order.f0;
import com.yandex.go.taxi.order.g0;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import com.yandex.go.taxi.order.popup.navigation.a;
import com.yandex.go.taxi.order.search.overlay.ordinary.domain.d;
import com.yandex.messaging.MessengerEnvironment;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class ph70 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public ph70(x4g x4gVar, x4g x4gVar2, z4g z4gVar, n3w n3wVar, g680 g680Var, fy30 fy30Var, int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.e = x4gVar;
                this.b = x4gVar2;
                this.c = z4gVar;
                this.d = n3wVar;
                this.f = g680Var;
                this.g = fy30Var;
                break;
            default:
                this.g = x4gVar;
                this.b = x4gVar2;
                this.c = z4gVar;
                this.d = n3wVar;
                this.e = g680Var;
                this.f = fy30Var;
                break;
        }
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.g;
        switch (i) {
            case 0:
                return new oh70((w030) xvf0Var2.get(), (f) xvf0Var.get(), (x980) xvf0Var3.get(), (b) xvf0Var5.get(), (c) xvf0Var4.get(), (ru.yandex.taxi.search.address.view.c) ((ht0) xvf0Var6).get());
            case 1:
                return new a((w030) xvf0Var2.get(), this.c, (ru.yandex.taxi.modal.popup.ui.model.a) xvf0Var3.get(), (z380) ((n3w) xvf0Var4).a, (com.yandex.go.taxi.order.cancel.similar.notification.a) ((js0) xvf0Var6).get(), (Context) xvf0Var5.get());
            case 2:
                return new d((iup0) ((j9g) xvf0Var2).get(), (gpc) ((tgb0) xvf0Var).get(), (ud80) ((j9g) xvf0Var3).get(), (ru.yandex.taxi.map.a) ((i9g) xvf0Var5).get(), (com.yandex.go.navigation.screen.c) ((i9g) xvf0Var4).get(), (tt2) ((i9g) xvf0Var6).get());
            case 3:
                return new com.yandex.go.taxi.order.search.overlay.ordinary.mvp.b((o2y0) ((n3w) xvf0Var2).a, (wz8) ((i9g) xvf0Var).get(), (cv00) ((i9g) xvf0Var3).get(), (d) ((ph70) xvf0Var5).get(), (ud80) ((j9g) xvf0Var4).get(), (ru.yandex.taxi.single.a) ((j9g) xvf0Var6).get());
            case 4:
                return new e((com.yandex.go.places.impl.data.mappers.organizations.c) ((jc50) xvf0Var5).get(), (pdc) xvf0Var2.get(), (com.yandex.go.places.models.data.mappers.e) ((peb) xvf0Var4).get(), (com.yandex.go.places.impl.data.mappers.organizations.b) ((jc50) xvf0Var6).get(), (dbv) xvf0Var.get(), (com.yandex.go.places.models.data.mappers.f) xvf0Var3.get());
            case 5:
                return new wrr((Context) xvf0Var2.get(), (bbj) ((faj) xvf0Var6).get(), (q6v) xvf0Var.get(), (k020) xvf0Var3.get(), (MessengerEnvironment) xvf0Var5.get(), (rcy0) xvf0Var4.get());
            case 6:
                return new qt90((String) xvf0Var2.get(), (ot90) ((n3w) xvf0Var3).a, (kcz0) ((flx0) xvf0Var5).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var4).get(), (j00) ((c1) xvf0Var6).get(), (j770) xvf0Var.get());
            case 7:
                return new v920((wop0) ((l5g) xvf0Var2).get(), (Context) ((l5g) xvf0Var).get(), (ecb0) ((l5g) xvf0Var3).get(), (yj70) ((s9b0) xvf0Var5).get(), (uab0) ((s9b0) xvf0Var4).get(), (aq80) ((s9b0) xvf0Var6).get());
            case 8:
                return new o7c0((Context) ((x4g) xvf0Var6).get(), (pav) xvf0Var2.get(), (pwy0) xvf0Var.get(), (ofc0) xvf0Var3.get(), (tcc0) xvf0Var5.get(), (zfc0) xvf0Var4.get());
            case 9:
                return new gdc0((Context) ((x4g) xvf0Var5).get(), (pav) xvf0Var2.get(), (pwy0) xvf0Var.get(), (ofc0) xvf0Var3.get(), (tcc0) ((g680) xvf0Var4).get(), (zfc0) ((fy30) xvf0Var6).get());
            case 10:
                return new hvd0((zit0) xvf0Var2.get(), (r) xvf0Var.get(), (uq40) xvf0Var3.get(), (nzb0) xvf0Var5.get(), (lgt0) ((ubq0) xvf0Var6).get(), (net0) xvf0Var4.get());
            case 11:
                return new com.yandex.go.vault.router.a((Context) ((sag) xvf0Var).get(), (w030) ((jcg) xvf0Var3).get(), (q4f0) ((vm80) xvf0Var5).get(), (k7x0) ((jcg) xvf0Var4).get(), (pav) ((jcg) xvf0Var6).get(), (i331) xvf0Var2.get());
            case 12:
                return new boj0((g191) ((c1) xvf0Var2).get(), (v920) ((ncb) xvf0Var).get(), (oh4) ((qh4) xvf0Var3).get(), (xk4) ((yk4) xvf0Var5).get(), (yfa) ((peb) xvf0Var4).get(), (oh4) ((qh4) xvf0Var6).get(), 27);
            case 13:
                return new v6g0((mfg0) xvf0Var2.get(), (hgg0) ((p5g) xvf0Var).get(), (jdg0) ((p5g) xvf0Var3).get(), (sue0) ((p5g) xvf0Var5).get(), (ff8) ((p5g) xvf0Var4).get(), (j3h) ((p5g) xvf0Var6).get());
            case 14:
                mfg0 mfg0Var = (mfg0) xvf0Var2.get();
                jdg0 jdg0Var = (jdg0) ((p5g) xvf0Var3).get();
                d7g0 d7g0Var = (d7g0) ((p5g) xvf0Var5).get();
                ((p5g) xvf0Var4).get();
                return new c7g0(mfg0Var, jdg0Var, d7g0Var, (j6g0) xvf0Var.get(), ((br00) xvf0Var6).a);
            case 15:
                return new ygi0((Context) ((z4g) xvf0Var3).get(), (w030) ((n5g) xvf0Var5).get(), (ahi0) ((tgb0) xvf0Var4).get(), (sue0) ((jde0) xvf0Var6).get(), (umb0) xvf0Var2.get(), (epb0) xvf0Var.get());
            case 16:
                return new g0((tse) ((f4g) xvf0Var3).get(), (String) xvf0Var2.get(), (ozi0) ((dag) xvf0Var5).get(), (xzi0) ((dag) xvf0Var4).get(), (p2y0) xvf0Var.get(), (f0) ((bea0) xvf0Var6).get());
            case 17:
                return new ojj0((Context) ((t0g) xvf0Var3).get(), (tse) ((y0g) xvf0Var5).get(), (iqj0) xvf0Var2.get(), (fjj0) ((ju9) xvf0Var4).get(), (ljj0) ((jzi0) xvf0Var6).get(), (g580) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.summary.requirements.list.mapper.a((bpj0) ((hs30) xvf0Var3).get(), (w15) xvf0Var2.get(), (ymi) ((rwh) xvf0Var5).get(), (g580) xvf0Var.get(), (jhu0) ((rbx0) xvf0Var4).get(), (n3a) ((miv0) xvf0Var6).get());
            case 19:
                return new com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.b((gic) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) ((s6g) xvf0Var).get(), (zuj0) ((t6g) xvf0Var3).get(), (tt2) ((r6g) xvf0Var5).get(), (edk0) ((r6g) xvf0Var4).get(), (Context) ((r6g) xvf0Var6).get());
            case 20:
                return new n0l0((wdt0) ((kpp0) xvf0Var5).get(), (zzi) ((if9) xvf0Var4).get(), (qgu0) xvf0Var2.get(), (com.yandex.go.taxi.summary.shared.sourcedestination.c) ((mz70) xvf0Var6).get(), (pwy0) xvf0Var.get(), (pav) xvf0Var3.get());
            case 21:
                return new a6l0((w5l0) ((z6g) xvf0Var).b.a, (u5l0) ((z6g) xvf0Var3).b.b, (f4l0) ((z6g) xvf0Var5).get(), (ucl0) xvf0Var2.get(), (yuj0) ((y6g) xvf0Var4).get(), (ij20) ((jzi0) xvf0Var6).get());
            case 22:
                return new u8l0((x9l0) xvf0Var2.get(), (ck31) ((b7g) xvf0Var).get(), (zuj0) ((a7g) xvf0Var3).get(), (tt2) ((g6g) xvf0Var5).get(), (w0c0) ((a7g) xvf0Var4).get(), (a3v) ((g6g) xvf0Var6).get());
            case 23:
                return new com.yandex.go.scooters.passes.active.v3.renew.menu.c((po21) xvf0Var2.get(), (com.yandex.go.scooters.passes.active.domain.f) ((elo0) xvf0Var6).get(), (ru.yandex.taxi.scooters.domain.r) xvf0Var.get(), (i) xvf0Var3.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var5.get(), (g) xvf0Var4.get());
            case 24:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.a((q) xvf0Var2.get(), i5m.a(xvf0Var), (u) xvf0Var3.get(), (ru.yandex.taxi.deeplinks.b) xvf0Var5.get(), (vwn0) ((yxm0) xvf0Var4).get(), i5m.a((yxm0) xvf0Var6));
            case 25:
                return new com.yandex.go.scooters.driver_license.a((e2e0) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var.get(), this.d, (com.yandex.go.scooters.driver_license.domain.a) ((s3f0) xvf0Var6).get(), this.e, this.f);
            case 26:
                return new sqn0((tt2) ((e7g) xvf0Var3).get(), (qwo0) xvf0Var2.get(), (brn0) xvf0Var.get(), (com.yandex.go.scooters.ignition.data.d) ((m7g) xvf0Var5).get(), (uqn0) ((g1n0) xvf0Var4).get(), (l) ((z1n0) xvf0Var6).get());
            case 27:
                return new yrn0((tt2) ((e7g) xvf0Var3).get(), (qwo0) xvf0Var2.get(), (k) ((ur3) xvf0Var5).get(), (com.yandex.go.scooters.ignition.panel.e) ((s3f0) xvf0Var4).get(), (brn0) xvf0Var.get(), (com.yandex.go.scooters.ignition.data.d) ((m7g) xvf0Var6).get());
            case 28:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.b((n6n0) xvf0Var2.get(), (y5p0) xvf0Var.get(), (com.yandex.go.scooters.domain.r) xvf0Var3.get(), (znn0) xvf0Var5.get(), (com.yandex.go.scooters.offers.v2.components.bottom.data.a) ((bwn0) xvf0Var6).get(), (com.yandex.go.scooters.insurance.data.c) xvf0Var4.get());
            default:
                h3y a = i5m.a((n7g) xvf0Var6);
                i7n0 i7n0Var = (i7n0) xvf0Var3.get();
                return new i4o0((krl0) ((oto0) xvf0Var5).get(), this.b, this.c, (z8n0) xvf0Var4, a, i7n0Var);
        }
    }

    public /* synthetic */ ph70(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
    }

    public /* synthetic */ ph70(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ ph70(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i, boolean z) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.c = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ ph70(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.g = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public ph70(z6g z6gVar, z6g z6gVar2, z6g z6gVar3, xvf0 xvf0Var, y6g y6gVar, jzi0 jzi0Var) {
        this.a = 21;
        this.c = z6gVar;
        this.d = z6gVar2;
        this.e = z6gVar3;
        this.b = xvf0Var;
        this.f = y6gVar;
        this.g = jzi0Var;
    }

    public ph70(jc50 jc50Var, o4g o4gVar, peb pebVar, jc50 jc50Var2, y1u y1uVar, y501 y501Var) {
        this.a = 4;
        this.e = jc50Var;
        this.b = o4gVar;
        this.f = pebVar;
        this.g = jc50Var2;
        this.c = y1uVar;
        this.d = y501Var;
    }

    public ph70(xvf0 xvf0Var, n3w n3wVar, flx0 flx0Var, mzf mzfVar, c1 c1Var, xvf0 xvf0Var2) {
        this.a = 6;
        this.b = xvf0Var;
        this.d = n3wVar;
        this.e = flx0Var;
        this.f = mzfVar;
        this.g = c1Var;
        this.c = xvf0Var2;
    }

    public ph70(t0g t0gVar, y0g y0gVar, xvf0 xvf0Var, ju9 ju9Var, jzi0 jzi0Var, xvf0 xvf0Var2) {
        this.a = 17;
        this.d = t0gVar;
        this.e = y0gVar;
        this.b = xvf0Var;
        this.f = ju9Var;
        this.g = jzi0Var;
        this.c = xvf0Var2;
    }

    public ph70(e7g e7gVar, xvf0 xvf0Var, yxm0 yxm0Var, m7g m7gVar, g1n0 g1n0Var, z1n0 z1n0Var) {
        this.a = 26;
        this.d = e7gVar;
        this.b = xvf0Var;
        this.c = yxm0Var;
        this.e = m7gVar;
        this.f = g1n0Var;
        this.g = z1n0Var;
    }

    public ph70(xvf0 xvf0Var, p5g p5gVar, p5g p5gVar2, p5g p5gVar3, xvf0 xvf0Var2, br00 br00Var) {
        this.a = 14;
        this.b = xvf0Var;
        this.d = p5gVar;
        this.e = p5gVar2;
        this.f = p5gVar3;
        this.c = xvf0Var2;
        this.g = br00Var;
    }

    public ph70(hs30 hs30Var, xvf0 xvf0Var, rwh rwhVar, xvf0 xvf0Var2, rbx0 rbx0Var, miv0 miv0Var) {
        this.a = 18;
        this.d = hs30Var;
        this.b = xvf0Var;
        this.e = rwhVar;
        this.c = xvf0Var2;
        this.f = rbx0Var;
        this.g = miv0Var;
    }

    public ph70(mbo0 mbo0Var, k7g k7gVar, gzn0 gzn0Var, s3f0 s3f0Var, qx5 qx5Var, l7g l7gVar) {
        this.a = 25;
        this.b = mbo0Var;
        this.c = k7gVar;
        this.d = gzn0Var;
        this.g = s3f0Var;
        this.e = qx5Var;
        this.f = l7gVar;
    }

    public ph70(kpp0 kpp0Var, if9 if9Var, x0g x0gVar, mz70 mz70Var, x0g x0gVar2, u0g u0gVar) {
        this.a = 20;
        this.e = kpp0Var;
        this.f = if9Var;
        this.b = x0gVar;
        this.g = mz70Var;
        this.c = x0gVar2;
        this.d = u0gVar;
    }

    public ph70(sag sagVar, jcg jcgVar, vm80 vm80Var, jcg jcgVar2, jcg jcgVar3, xvf0 xvf0Var) {
        this.a = 11;
        this.c = sagVar;
        this.d = jcgVar;
        this.e = vm80Var;
        this.f = jcgVar2;
        this.g = jcgVar3;
        this.b = xvf0Var;
    }

    public ph70(z4g z4gVar, n5g n5gVar, tgb0 tgb0Var, jde0 jde0Var, qta0 qta0Var, xvf0 xvf0Var) {
        this.a = 15;
        this.d = z4gVar;
        this.e = n5gVar;
        this.f = tgb0Var;
        this.g = jde0Var;
        this.b = qta0Var;
        this.c = xvf0Var;
    }

    public ph70(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, js0 js0Var, xvf0 xvf0Var4) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = n3wVar;
        this.g = js0Var;
        this.e = xvf0Var4;
    }

    public ph70(oto0 oto0Var, xvf0 xvf0Var, gzn0 gzn0Var, z8n0 z8n0Var, n7g n7gVar, qzm0 qzm0Var) {
        this.a = 29;
        this.e = oto0Var;
        this.b = xvf0Var;
        this.c = gzn0Var;
        this.f = z8n0Var;
        this.g = n7gVar;
        this.d = qzm0Var;
    }
}
