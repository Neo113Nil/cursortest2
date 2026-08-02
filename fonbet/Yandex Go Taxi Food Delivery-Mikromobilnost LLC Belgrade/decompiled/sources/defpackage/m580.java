package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.go.places.impl.domain.interactors.organizations.a;
import com.yandex.go.preorder.lifecycle.p;
import com.yandex.go.scooters.ignition.controlling.f;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.superapp_favorites.flex.actions.PreviewBackwardAction;
import com.yandex.go.taxi.order.popup.b;
import com.yandex.go.taxi.order.promotions.router.c;
import com.yandex.messaging.internal.view.timeline.g0;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;
import ru.yandex.taxi.preorder.source.domain.q;
import ru.yandex.taxi.settings.domain.d;

/* loaded from: classes14.dex */
public final class m580 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;

    public m580(y0g y0gVar, cys0 cys0Var, a1g a1gVar, pso0 pso0Var, l9t0 l9t0Var, fat0 fat0Var, b1g b1gVar, a1g a1gVar2, w0g w0gVar) {
        this.a = 25;
        this.f = y0gVar;
        this.b = cys0Var;
        this.c = a1gVar;
        this.d = pso0Var;
        this.g = l9t0Var;
        this.h = fat0Var;
        this.i = b1gVar;
        this.e = a1gVar2;
        this.j = w0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.g;
        xvf0 xvf0Var6 = this.f;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.i;
        xvf0 xvf0Var9 = this.b;
        switch (i) {
            case 0:
                return new c((y10) xvf0Var9.get(), this.c, this.d, this.e, (u2y0) ((fat0) xvf0Var8).get(), (wc80) xvf0Var6.get(), (n20) xvf0Var5.get(), (b) ((mz70) xvf0Var7).get(), (tt2) xvf0Var4.get());
            case 1:
                return new a((com.yandex.go.places.impl.data.repositories.organizations.a) xvf0Var9.get(), (e2t) xvf0Var3.get(), (h0w) ((p4) xvf0Var8).get(), (tt2) xvf0Var2.get(), (h) xvf0Var.get(), (com.yandex.go.places.impl.data.repositories.organizations.b) xvf0Var6.get(), (mg80) xvf0Var5.get(), (wbc0) xvf0Var4.get(), (fg5) xvf0Var7.get());
            case 2:
                return new v1f0((g701) ((hbg) xvf0Var6).b.b, (e) ((mzf) xvf0Var5).get(), (ru.yandex.taxi.logistics.sdk.delivery.edit.b) ((gbg) xvf0Var4).get(), (ov7) xvf0Var9.get(), (p1b) ((dx9) xvf0Var8).get(), (uy31) xvf0Var3.get(), (s1f0) xvf0Var2.get(), (i) xvf0Var.get(), (v6s) ((gbg) xvf0Var7).get());
            case 3:
                return new d((i4g0) xvf0Var9.get(), (ru.yandex.taxi.settings.domain.e) ((c8w) xvf0Var2).get(), (yxf0) ((jpf0) xvf0Var).get(), (y4g0) ((zlf0) xvf0Var6).get(), (i1g0) ((vm80) xvf0Var5).get(), (wh9) xvf0Var3.get(), (tzu0) ((uzu0) xvf0Var4).get(), (tt2) ((a6g) xvf0Var8).get(), (ru.yandex.taxi.settings.domain.factory.b) ((y2s0) xvf0Var7).get());
            case 4:
                return new QrReaderFragment((ocg0) ((n3w) xvf0Var3).a, (ubg0) ((p5g) xvf0Var2).get(), (j6g0) xvf0Var9.get(), (jdg0) ((p5g) xvf0Var).get(), (ifg0) ((nwf) xvf0Var6).get(), (AppAnalyticsReporter) ((p5g) xvf0Var5).get(), (rfg0) ((p5g) xvf0Var4).get(), (QrScannerPreviewDependencies) ((p5g) xvf0Var8).get(), (qg6) ((p5g) xvf0Var7).get());
            case 5:
                return new rai0((Activity) xvf0Var9.get(), (yai0) ((hs30) xvf0Var4).get(), (pai0) ((s3f0) xvf0Var8).get(), (q6c0) ((vu) xvf0Var7).get(), (g0) xvf0Var3.get(), (vai0) xvf0Var2.get(), i5m.a(xvf0Var), (nai0) xvf0Var6.get(), (kai0) xvf0Var5.get());
            case 6:
                return new fyj0((uxj0) ((q720) xvf0Var2).get(), (ro6) ((br10) xvf0Var).get(), (ueb) ((br10) xvf0Var6).get(), (wdb) ((nt0) xvf0Var5).get(), (mv21) ((q720) xvf0Var4).get(), (fqr0) ((q720) xvf0Var8).get(), (bv21) ((q720) xvf0Var7).get(), (nu21) xvf0Var9.get(), (ph9) xvf0Var3.get());
            case 7:
                return new com.yandex.go.taxi.order.map.route.a((cv00) ((u4g) xvf0Var9).get(), (olm) ((t4g) xvf0Var3).get(), (o7r0) ((uzu0) xvf0Var2).get(), (x4s0) ((t4g) xvf0Var).get(), (o2y0) ((n3w) xvf0Var6).a, (kgl0) ((ggl0) xvf0Var5).get(), (u1s) ((cer) xvf0Var4).get(), (l3l0) ((v4g) xvf0Var8).get(), i5m.a((w7y0) xvf0Var7));
            case 8:
                return new com.ybsdk.feature.main.internal.screens.sbpPartners.a((com.ybsdk.feature.main.internal.data.network.c) ((jzi0) xvf0Var9).get(), (n800) ((u1g) xvf0Var3).get(), (tfl0) ((u2g) xvf0Var2).get(), (a8g0) ((u2g) xvf0Var).get(), (c9v) ((u1g) xvf0Var6).get(), (shm0) ((n3w) xvf0Var5).a, (b3z) ((u2g) xvf0Var4).get(), (krl0) ((w400) xvf0Var8).get(), (Context) ((u1g) xvf0Var7).get());
            case 9:
                return new com.yandex.go.due_timetable.domain.interactor.a((tt2) ((fzf) xvf0Var3).get(), (com.yandex.go.due.data.repository.a) ((fzf) xvf0Var2).get(), (wiq0) ((jzf) xvf0Var).get(), (wjm) ((bpf) xvf0Var6).get(), (axm) ((fzf) xvf0Var5).get(), (ibn) ((fzf) xvf0Var4).get(), (dqe0) ((fzf) xvf0Var8).get(), (fzm) xvf0Var9.get(), (mum) ((gmh) xvf0Var7).get());
            case 10:
                return new ygi0((dtm0) ((zmm0) xvf0Var6).get(), (com.yandex.go.scooters.passes.active.v3.renew.menu.c) ((ph70) xvf0Var5).get(), (Context) xvf0Var9.get(), (w030) xvf0Var3.get(), this.d, this.e, (zmm0) xvf0Var4, (zmm0) xvf0Var8, (zmm0) xvf0Var7);
            case 11:
                return new ru.yandex.taxi.scooters.presentation.feedback.newbie.a((jtq0) ((n7g) xvf0Var8).get(), (pav) xvf0Var9.get(), (ytz) xvf0Var3.get(), (tt2) ((e7g) xvf0Var7).get(), (k7x0) xvf0Var2.get(), (pwy0) xvf0Var.get(), (ru.yandex.taxi.widget.c) xvf0Var6.get(), (qwo0) xvf0Var5.get(), (u1o0) xvf0Var4.get());
            case 12:
                return new com.yandex.go.scooters.ignition.controlling.c((sqn0) ((ph70) xvf0Var6).get(), (f) ((h0l0) xvf0Var5).get(), (Context) xvf0Var9.get(), (w030) xvf0Var3.get(), this.d, i5m.a((ur3) xvf0Var4), this.e, (jpj0) xvf0Var8, (z8n0) xvf0Var7);
            case 13:
                return new com.yandex.go.scooters.data.mapper.d((tt2) ((e7g) xvf0Var6).get(), (pdc) ((e7g) xvf0Var5).get(), (xdf) ((j7g) xvf0Var4).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var9.get(), (q3p0) xvf0Var3.get(), (com.yandex.go.scooters.data.mapper.c) ((z8n0) xvf0Var8).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (cno0) ((lwl0) xvf0Var7).get(), (f3p0) xvf0Var.get());
            case 14:
                return new com.yandex.go.scooters.qr.a((w030) xvf0Var9.get(), (fva0) xvf0Var3.get(), (ipo0) xvf0Var2.get(), (upo0) xvf0Var.get(), (MapNotificationsMuteRepository) xvf0Var6.get(), (com.yandex.go.scooters.qr.domain.d) xvf0Var5.get(), this.h, (xpo0) xvf0Var8.get(), (rx4) xvf0Var7);
            case 15:
                return new com.yandex.go.scooters.passes.purchase.superpasses.c((qxm0) xvf0Var9.get(), (t1p0) ((q150) xvf0Var8).get(), (com.yandex.go.scooters.passes.purchase.superpasses.d) ((pmn0) xvf0Var7).get(), (Context) xvf0Var3.get(), (w030) xvf0Var2.get(), this.e, this.f, this.g, (g) xvf0Var4.get());
            case 16:
                Context n0 = ((x2g) xvf0Var9).b.n0();
                v2g v2gVar = (v2g) ((n3w) xvf0Var3).a;
                ru.yandex.taxi.multiorder.e eVar = (ru.yandex.taxi.multiorder.e) ((w2g) xvf0Var2).get();
                p2s0 p2s0Var = (p2s0) ((m580) xvf0Var).get();
                n050 n050Var = (n050) ((w2g) xvf0Var6).get();
                ((w2g) xvf0Var5).get();
                return new t9g(v2gVar, (x2s0) ((y2s0) xvf0Var8).get(), p2s0Var, n0, n050Var, (yb00) ((x2g) xvf0Var4).get(), eVar, ((x2g) xvf0Var7).b.k1(), v2gVar.U0());
            case 17:
                return new p2s0(((w2g) xvf0Var9).b.B(), ((w2g) xvf0Var3).b.j1(), i5m.a((eqh) xvf0Var2), ((x2g) xvf0Var).b.B0(), ((x2g) xvf0Var6).b.a1(), ((x2g) xvf0Var5).b.V0(), (w2g) xvf0Var4, ((x2g) xvf0Var8).b.E(), (oep0) ((w2g) xvf0Var7).get());
            case 18:
                return new set0((ah00) xvf0Var9.get(), (dqe0) xvf0Var3.get(), (rft0) xvf0Var2.get(), (lxg) xvf0Var.get(), (net0) xvf0Var6.get(), (c8r) xvf0Var5.get(), (q) xvf0Var4.get(), i5m.a((px4) xvf0Var8), i5m.a(xvf0Var7));
            case 19:
                return new com.yandex.go.preorder.map.b((git0) xvf0Var9.get(), (biv0) xvf0Var3.get(), (brb0) xvf0Var2.get(), i5m.a((lok0) xvf0Var8), (ru.yandex.taxi.preorder.source.pickup.a) xvf0Var.get(), (z3g0) xvf0Var6.get(), i5m.a(xvf0Var5), (tit0) xvf0Var4.get(), (com.yandex.go.route.interactor.c) xvf0Var7.get());
            case 20:
                return new ygt0((Context) xvf0Var9.get(), (Lifecycle) xvf0Var3.get(), (ah00) xvf0Var2.get(), (po21) xvf0Var.get(), (qwc) xvf0Var6.get(), (ru.yandex.taxi.bubbles.interactors.a) ((p4) xvf0Var8).get(), (yuf0) ((r10) xvf0Var7).get(), (jgt0) xvf0Var5.get(), (o050) xvf0Var4.get());
            case 21:
                return new p((pd61) xvf0Var9.get(), (ru.yandex.taxi.sdc.router.e) xvf0Var3.get(), (ru.yandex.taxi.sdc.route.presentation.f) xvf0Var2.get(), (wj0) xvf0Var8, this.e, (oep0) xvf0Var6.get(), (rft0) xvf0Var5.get(), (jjt0) xvf0Var4.get(), (s6k0) ((wun0) xvf0Var7).get());
            case 22:
                return new rpt0((mhf) xvf0Var9.get(), this.c, (cgt0) ((xv8) xvf0Var8).get(), (w030) xvf0Var2.get(), (oft0) xvf0Var.get(), (ru.yandex.taxi.preorder.source.domain.p) xvf0Var6.get(), (bwx0) xvf0Var5.get(), (git0) xvf0Var4.get(), (oep0) xvf0Var7.get());
            case 23:
                return new mbv0((ah00) xvf0Var9.get(), (lx4) xvf0Var3.get(), (e51) xvf0Var2.get(), (r8h) xvf0Var.get(), (rwp0) ((lk) xvf0Var6).get(), (SourcePicker) ((s51) xvf0Var5).get(), (ec00) ((v7p) xvf0Var4).get(), (b5v0) ((t51) xvf0Var8).get(), (pj) ((k1w) xvf0Var7).get());
            case 24:
                return new ru.yandex.taxi.summary.deeplink.a(i5m.a((wi7) xvf0Var9), i5m.a((mvy) xvf0Var3), i5m.a((t0g) xvf0Var2), i5m.a((c1g) xvf0Var), i5m.a((zi60) xvf0Var6), i5m.a((nt0) xvf0Var5), i5m.a((z6x0) xvf0Var4), i5m.a((di20) xvf0Var8), i5m.a((vfg0) xvf0Var7));
            case 25:
                return new ru.yandex.taxi.summary.solid.modal_on_order.domain.c((tse) ((y0g) xvf0Var6).get(), (dmv0) xvf0Var9.get(), (jas0) xvf0Var3.get(), (emv0) xvf0Var2.get(), (llv0) ((l9t0) xvf0Var5).get(), (imv0) ((fat0) xvf0Var4).get(), (b1g) xvf0Var8, (oep0) xvf0Var.get(), (wiq0) ((w0g) xvf0Var7).get());
            case 26:
                String str = (String) xvf0Var9.get();
                c1m0 c1m0Var = (c1m0) xvf0Var3.get();
                o3l0 o3l0Var = (o3l0) xvf0Var2.get();
                k6x k6xVar = (k6x) ((nag) xvf0Var5).get();
                daw0 daw0Var = (daw0) xvf0Var.get();
                com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) xvf0Var6.get();
                jaw0 jaw0Var = (jaw0) ((v8c0) xvf0Var4).get();
                com.yandex.go.superapp_favorites.flex.document.a aVar2 = (com.yandex.go.superapp_favorites.flex.document.a) ((uzu0) xvf0Var8).get();
                t6o t6oVar = (t6o) ((naw0) xvf0Var7).get();
                zm5 zm5Var = new zm5(aVar, 7);
                List singletonList = Collections.singletonList(jaw0Var);
                n2v0 n2v0Var = new n2v0(4, o3l0Var);
                daw0Var.getClass();
                return new vlr(str, zm5Var, t6oVar, new g0p(null, null, Collections.singletonList(new mu("PreviewBackwardAction", qoi0.a(PreviewBackwardAction.class), new cyv0(8), kotlin.a.b(LazyThreadSafetyMode.NONE, new caw0(daw0Var, 0)), EmptyList.a, false)), null, null, Collections.singletonList(daw0Var.b), null, null, 951), n2v0Var, null, null, c1m0Var, singletonList, Collections.singletonList(aVar2), k6xVar, null, null, null, null, null, null, null, null, 1044674);
            case 27:
                return new com.yandex.messaging.support.a((i720) xvf0Var9.get(), (g220) xvf0Var3.get(), (b6u) xvf0Var2.get(), (up60) xvf0Var.get(), (cb6) ((rs0) xvf0Var8).get(), (t2r) xvf0Var6.get(), (kse) xvf0Var5.get(), (xdf0) xvf0Var4.get(), (o1b0) xvf0Var7.get());
            case 28:
                return new lox0((wiq0) ((w0g) xvf0Var2).get(), (dqe0) ((w0g) xvf0Var).get(), (ynm0) ((a1g) xvf0Var6).get(), (ddf) ((q02) xvf0Var5).get(), (v920) ((yc) xvf0Var4).get(), (ad) xvf0Var8, (oep0) xvf0Var9.get(), (o61) ((njp) xvf0Var7).get(), (t380) xvf0Var3.get());
            default:
                com.yandex.go.taxi.summary.router.a aVar3 = (com.yandex.go.taxi.summary.router.a) xvf0Var9.get();
                wiq0 wiq0Var = (wiq0) ((w0g) xvf0Var6).get();
                xcv0 xcv0Var = (xcv0) xvf0Var3.get();
                h3y a = i5m.a((nt0) xvf0Var5);
                ru.yandex.taxi.summary.deeplink.a aVar4 = (ru.yandex.taxi.summary.deeplink.a) ((m580) xvf0Var4).get();
                set0 set0Var = (set0) xvf0Var2.get();
                hdu hduVar = (hdu) ((y0g) xvf0Var8).get();
                ((y0g) xvf0Var7).get();
                return new wox0(aVar3, wiq0Var, xcv0Var, a, aVar4, set0Var, hduVar);
        }
    }

    public /* synthetic */ m580(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.i = v7pVar;
        this.d = xvf0Var3;
        this.e = v7pVar2;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.j = xvf0Var7;
    }

    public /* synthetic */ m580(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
    }

    public m580(q720 q720Var, br10 br10Var, br10 br10Var2, nt0 nt0Var, q720 q720Var2, q720 q720Var3, q720 q720Var4, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 6;
        this.d = q720Var;
        this.e = br10Var;
        this.f = br10Var2;
        this.g = nt0Var;
        this.h = q720Var2;
        this.i = q720Var3;
        this.j = q720Var4;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public m580(xvf0 xvf0Var, c8w c8wVar, jpf0 jpf0Var, zlf0 zlf0Var, vm80 vm80Var, xvf0 xvf0Var2, uzu0 uzu0Var, a6g a6gVar, y2s0 y2s0Var) {
        this.a = 3;
        this.b = xvf0Var;
        this.d = c8wVar;
        this.e = jpf0Var;
        this.f = zlf0Var;
        this.g = vm80Var;
        this.c = xvf0Var2;
        this.h = uzu0Var;
        this.i = a6gVar;
        this.j = y2s0Var;
    }

    public /* synthetic */ m580(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, v7p v7pVar4, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.i = v7pVar2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = v7pVar3;
        this.h = xvf0Var5;
        this.j = v7pVar4;
    }

    public m580(w0g w0gVar, w0g w0gVar2, a1g a1gVar, q02 q02Var, yc ycVar, ad adVar, a1g a1gVar2, njp njpVar, g430 g430Var) {
        this.a = 28;
        this.d = w0gVar;
        this.e = w0gVar2;
        this.f = a1gVar;
        this.g = q02Var;
        this.h = ycVar;
        this.i = adVar;
        this.b = a1gVar2;
        this.j = njpVar;
        this.c = g430Var;
    }

    public m580(e7g e7gVar, e7g e7gVar2, j7g j7gVar, k7g k7gVar, xvf0 xvf0Var, z8n0 z8n0Var, j7g j7gVar2, lwl0 lwl0Var, ivo0 ivo0Var) {
        this.a = 13;
        this.f = e7gVar;
        this.g = e7gVar2;
        this.h = j7gVar;
        this.b = k7gVar;
        this.c = xvf0Var;
        this.i = z8n0Var;
        this.d = j7gVar2;
        this.j = lwl0Var;
        this.e = ivo0Var;
    }

    public m580(n7g n7gVar, j7g j7gVar, k7g k7gVar, e7g e7gVar, n7g n7gVar2, n7g n7gVar3, j7g j7gVar2, xvf0 xvf0Var, bwn0 bwn0Var) {
        this.a = 11;
        this.i = n7gVar;
        this.b = j7gVar;
        this.c = k7gVar;
        this.j = e7gVar;
        this.d = n7gVar2;
        this.e = n7gVar3;
        this.f = j7gVar2;
        this.g = xvf0Var;
        this.h = bwn0Var;
    }

    public m580(n3w n3wVar, p5g p5gVar, xvf0 xvf0Var, p5g p5gVar2, nwf nwfVar, p5g p5gVar3, p5g p5gVar4, p5g p5gVar5, p5g p5gVar6) {
        this.a = 4;
        this.c = n3wVar;
        this.d = p5gVar;
        this.b = xvf0Var;
        this.e = p5gVar2;
        this.f = nwfVar;
        this.g = p5gVar3;
        this.h = p5gVar4;
        this.i = p5gVar5;
        this.j = p5gVar6;
    }

    public m580(xvf0 xvf0Var, p7w0 p7w0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, rs0 rs0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, n3w n3wVar) {
        this.a = 27;
        this.b = xvf0Var;
        this.c = p7w0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.i = rs0Var;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.j = n3wVar;
    }

    public m580(hbg hbgVar, mzf mzfVar, gbg gbgVar, xvf0 xvf0Var, dx9 dx9Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, gbg gbgVar2) {
        this.a = 2;
        this.f = hbgVar;
        this.g = mzfVar;
        this.h = gbgVar;
        this.b = xvf0Var;
        this.i = dx9Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.j = gbgVar2;
    }

    public m580(n3w n3wVar, hs30 hs30Var, s3f0 s3f0Var, vu vuVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 5;
        this.b = n3wVar;
        this.h = hs30Var;
        this.i = s3f0Var;
        this.j = vuVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    public m580(z10 z10Var, ph70 ph70Var, umt0 umt0Var, rx4 rx4Var, fat0 fat0Var, xvf0 xvf0Var, eqh eqhVar, mz70 mz70Var, xvf0 xvf0Var2) {
        this.a = 0;
        this.b = z10Var;
        this.c = ph70Var;
        this.d = umt0Var;
        this.e = rx4Var;
        this.i = fat0Var;
        this.f = xvf0Var;
        this.g = eqhVar;
        this.j = mz70Var;
        this.h = xvf0Var2;
    }

    public m580(fzf fzfVar, fzf fzfVar2, jzf jzfVar, bpf bpfVar, fzf fzfVar3, fzf fzfVar4, fzf fzfVar5, xvf0 xvf0Var, gmh gmhVar) {
        this.a = 9;
        this.c = fzfVar;
        this.d = fzfVar2;
        this.e = jzfVar;
        this.f = bpfVar;
        this.g = fzfVar3;
        this.h = fzfVar4;
        this.i = fzfVar5;
        this.b = xvf0Var;
        this.j = gmhVar;
    }

    public m580(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar, xvf0 xvf0Var4, p4 p4Var, r10 r10Var, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 20;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = eqhVar;
        this.f = xvf0Var4;
        this.i = p4Var;
        this.j = r10Var;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
    }

    public m580(ggl0 ggl0Var, q150 q150Var, pmn0 pmn0Var, j7g j7gVar, k7g k7gVar, gzn0 gzn0Var, n7g n7gVar, m7g m7gVar, mbo0 mbo0Var) {
        this.a = 15;
        this.b = ggl0Var;
        this.i = q150Var;
        this.j = pmn0Var;
        this.c = j7gVar;
        this.d = k7gVar;
        this.e = gzn0Var;
        this.f = n7gVar;
        this.g = m7gVar;
        this.h = mbo0Var;
    }

    public m580(zmm0 zmm0Var, ph70 ph70Var, j7g j7gVar, k7g k7gVar, n7g n7gVar, m7g m7gVar, zmm0 zmm0Var2, zmm0 zmm0Var3, zmm0 zmm0Var4) {
        this.a = 10;
        this.f = zmm0Var;
        this.g = ph70Var;
        this.b = j7gVar;
        this.c = k7gVar;
        this.d = n7gVar;
        this.e = m7gVar;
        this.h = zmm0Var2;
        this.i = zmm0Var3;
        this.j = zmm0Var4;
    }

    public m580(xvf0 xvf0Var, w0g w0gVar, vrt0 vrt0Var, nt0 nt0Var, m580 m580Var, a1g a1gVar, y0g y0gVar, xvf0 xvf0Var2, y0g y0gVar2) {
        this.a = 29;
        this.b = xvf0Var;
        this.f = w0gVar;
        this.c = vrt0Var;
        this.g = nt0Var;
        this.h = m580Var;
        this.d = a1gVar;
        this.i = y0gVar;
        this.e = xvf0Var2;
        this.j = y0gVar2;
    }

    public m580(ph70 ph70Var, h0l0 h0l0Var, j7g j7gVar, k7g k7gVar, gzn0 gzn0Var, ur3 ur3Var, l7g l7gVar, jpj0 jpj0Var, z8n0 z8n0Var) {
        this.a = 12;
        this.f = ph70Var;
        this.g = h0l0Var;
        this.b = j7gVar;
        this.c = k7gVar;
        this.d = gzn0Var;
        this.h = ur3Var;
        this.e = l7gVar;
        this.i = jpj0Var;
        this.j = z8n0Var;
    }

    public m580(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, nag nagVar, xvf0 xvf0Var4, xvf0 xvf0Var5, v8c0 v8c0Var, uzu0 uzu0Var, naw0 naw0Var) {
        this.a = 26;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = nagVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.h = v8c0Var;
        this.i = uzu0Var;
        this.j = naw0Var;
    }
}
