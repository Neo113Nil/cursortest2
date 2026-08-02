package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.agreement.repository.g;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.payments.data.p;
import com.yandex.go.payments.domain.j0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.route.analytics.e;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.tariffs.interactor.s;
import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.logistics.sdk.management.deliveries.d;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.router.i;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes8.dex */
public final class l20 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public l20(n3w n3wVar, xvf0 xvf0Var, eqh eqhVar, oto0 oto0Var, eqh eqhVar2, rk21 rk21Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 29;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = eqhVar;
        this.h = oto0Var;
        this.e = eqhVar2;
        this.i = rk21Var;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.i;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.c;
        xvf0 xvf0Var8 = this.b;
        switch (i) {
            case 0:
                return new a(i5m.a(xvf0Var8), (uw40) xvf0Var7.get(), i5m.a(xvf0Var3), (ci70) xvf0Var5.get(), (kw2) xvf0Var2.get(), (nid) xvf0Var.get(), (dgs) xvf0Var6.get(), (gh60) ((c660) xvf0Var4).get());
            case 1:
                return new e((wnt) xvf0Var8.get(), (k99) xvf0Var7.get(), (wiq0) xvf0Var3.get(), (qbl0) xvf0Var5.get(), (zet0) xvf0Var2.get(), (b) xvf0Var.get(), (tt2) xvf0Var6.get(), (zz2) ((xv2) xvf0Var4).get());
            case 2:
                return new g((com.yandex.go.permission.location_with_agreement.interactor.e) xvf0Var8.get(), (ege0) xvf0Var7.get(), (k) xvf0Var3.get(), (k) xvf0Var5.get(), (AuthStateRepository) xvf0Var2.get(), (of) xvf0Var.get(), (com.yandex.go.agreement.trackable.repository.b) xvf0Var6.get(), (ru.yandex.taxi.sdc.a) ((can) xvf0Var4).get());
            case 3:
                return new com.yandex.go.analytics.a((Activity) xvf0Var8.get(), (j) xvf0Var7.get(), (zf) ((wnw) xvf0Var4).get(), (zz2) xvf0Var3.get(), (b) xvf0Var5.get(), (a32) xvf0Var2.get(), (tse) xvf0Var.get(), (Lifecycle) xvf0Var6.get());
            case 4:
                return new com.yandex.go.shortcuts.impl.view.adapter.model.a((xih) xvf0Var8.get(), (d2s0) xvf0Var7.get(), (pdc) xvf0Var3.get(), (lg31) xvf0Var5.get(), (xj11) xvf0Var2.get(), (Context) xvf0Var.get(), (xdf) ((u9g) xvf0Var6).get(), (wa90) ((u9g) xvf0Var4).get());
            case 5:
                return new com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a((tse) xvf0Var8.get(), (y50) xvf0Var7.get(), (k1w0) ((alv0) xvf0Var4).get(), (x8z) xvf0Var3.get(), (n) xvf0Var5.get(), (oep0) xvf0Var2.get(), this.g, (lg21) xvf0Var6.get());
            case 6:
                return new com.yandex.go.taxi.tariffs.factory.a((tjx0) xvf0Var8.get(), (yax0) xvf0Var7.get(), (qex0) xvf0Var3.get(), (gq40) xvf0Var5.get(), (ru.yandex.taxi.yaplus.b) xvf0Var2.get(), (tt2) xvf0Var.get(), (q7s) xvf0Var6.get(), (yx1) ((n4j0) xvf0Var4).get());
            case 7:
                return new com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.a((Context) xvf0Var8.get(), (w030) xvf0Var7.get(), (tt2) xvf0Var3.get(), (n3h) xvf0Var5.get(), (o61) ((xv2) xvf0Var).get(), (com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.domain.a) ((x2b) xvf0Var6).get(), (fte) xvf0Var2.get(), (r10) xvf0Var4);
            case 8:
                return new ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.a((ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.e) xvf0Var8.get(), (ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b) xvf0Var7.get(), (d) xvf0Var3.get(), (j2s) xvf0Var5.get(), (c) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.b) ((jv21) xvf0Var4).get(), (sfi) xvf0Var6.get());
            case 9:
                return new ru.yandex.taxi.push.handlers.a(i5m.a(xvf0Var8), i5m.a(xvf0Var7), i5m.a(xvf0Var3), i5m.a((ee) xvf0Var4), i5m.a(xvf0Var5), i5m.a(xvf0Var2), (c1g0) xvf0Var.get(), (wnt) xvf0Var6.get());
            case 10:
                return new com.yandex.go.payments.paymentlist.experiments.g((tse) xvf0Var8.get(), (tt2) xvf0Var7.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (kug) ((cer) xvf0Var4).get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var5.get(), (fga0) xvf0Var2.get(), (ycq0) xvf0Var.get(), (dne0) xvf0Var6.get());
            case 11:
                return new com.yandex.go.inapp_calls.preload.a((q) xvf0Var8.get(), (gp50) ((ziv) xvf0Var4).get(), (tt2) xvf0Var7.get(), i5m.a(xvf0Var3), (njv) xvf0Var5.get(), (com.yandex.go.proxyprovision.j) xvf0Var2.get(), (tse) xvf0Var.get(), (dne0) xvf0Var6.get());
            case 12:
                return new w3i((ru.yandex.taxi.discovery.b) xvf0Var8.get(), (Context) xvf0Var7.get(), (ah00) xvf0Var3.get(), (rqo) xvf0Var5.get(), (umw) ((l20) xvf0Var6).get(), (r8w) ((r2i) xvf0Var4).get(), (w030) xvf0Var2.get(), (wd7) xvf0Var.get(), 24);
            case 13:
                return new umw((Context) xvf0Var8.get(), (tse) xvf0Var7.get(), (kqe) xvf0Var3.get(), (ru.yandex.taxi.intercity.data.g) xvf0Var5.get(), (smw) ((n3w) xvf0Var).a, (vmw) ((ziv) xvf0Var6).get(), (a22) ((ziv) xvf0Var4).get(), (uxr0) xvf0Var2.get());
            case 14:
                return new hyx(i5m.a(xvf0Var8), i5m.a(xvf0Var7), i5m.a(xvf0Var3), i5m.a(xvf0Var5), i5m.a(xvf0Var2), i5m.a(xvf0Var), i5m.a(xvf0Var6), i5m.a((ei00) xvf0Var4));
            case 15:
                return new s((com.yandex.go.zone.interactors.b) xvf0Var8.get(), (mxf0) xvf0Var7.get(), (ae61) xvf0Var3.get(), (com.yandex.go.taxi.tariffs.repository.d) ((etx) xvf0Var4).get(), (zuj0) xvf0Var5.get(), (tt2) xvf0Var2.get(), i5m.a(xvf0Var), i5m.a(xvf0Var6));
            case 16:
                return new com.yandex.go.safety.center.lost_item.modal.interactor.c((com.yandex.go.safety.center.lost_item.data.a) xvf0Var8.get(), (ypk0) xvf0Var7.get(), (lrz) ((kqz) xvf0Var6).get(), (com.yandex.go.safety.center.lost_item.modal.mapper.a) ((kqz) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (ppl0) xvf0Var5.get(), (yqg) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 17:
                return new com.yandex.go.flex.main_screen.presentation.d((Context) xvf0Var8.get(), (nbw0) xvf0Var7.get(), (com.yandex.go.flex.main_screen.experiments.j) xvf0Var3.get(), (zbw0) xvf0Var5.get(), (ob00) xvf0Var2.get(), (tse) ((n2g) xvf0Var6).get(), (com.yandex.div.core.expression.variables.a) xvf0Var.get(), (ipq) ((y2g) xvf0Var4).get());
            case 18:
                return new wr00((u501) ((sx2) xvf0Var2).get(), (u501) xvf0Var8.get(), (u501) xvf0Var7.get(), (u501) ((lwl0) xvf0Var).get(), (u501) ((w7u) xvf0Var6).get(), (u501) ((jwx0) xvf0Var4).get(), (u501) xvf0Var3.get(), (u501) xvf0Var5.get());
            case 19:
                return new dm10(i5m.a(xvf0Var8), (n20) xvf0Var7.get(), (nm10) ((gk10) xvf0Var4).get(), this.d, (ra00) xvf0Var5.get(), this.f, (oep0) xvf0Var.get(), (b600) xvf0Var6.get());
            case 20:
                return new kn10((Context) xvf0Var8.get(), (xdf) xvf0Var7.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (pwy0) xvf0Var5.get(), (yu11) xvf0Var2.get(), (pho) xvf0Var.get(), (com.yandex.go.ultima_mode.action.a) ((d701) xvf0Var4).get(), (tv11) xvf0Var6.get());
            case 21:
                Context context = (Context) xvf0Var8.get();
                x22 x22Var = (x22) xvf0Var7.get();
                return new w220(context, x22Var, (String) xvf0Var5.get(), (ch60) xvf0Var2.get(), i5m.a((eqh) xvf0Var), (l420) ((bhx) xvf0Var6).get(), (ume) ((kyd) xvf0Var4).get());
            case 22:
                return new i((gy30) ((hy30) xvf0Var4).get(), (tq30) xvf0Var8.get(), (ru.yandex.taxi.masstransit.address.interactor.i) xvf0Var7.get(), (zz2) xvf0Var3.get(), (ru.yandex.taxi.masstransit.deeplink.g) xvf0Var5.get(), (e631) xvf0Var2.get(), (tse) xvf0Var.get(), (sy00) xvf0Var6.get());
            case 23:
                return new ru.yandex.taxi.masstransit.threadvariants.b((d0) xvf0Var8.get(), (dzy0) xvf0Var7.get(), (tt2) xvf0Var3.get(), (ru.yandex.taxi.masstransit.domain.q) xvf0Var5.get(), (dc4) xvf0Var2.get(), (jt30) ((i020) xvf0Var4).get(), (MtPurchaseMapper) xvf0Var.get(), (wr30) xvf0Var6.get());
            case 24:
                return new com.yandex.go.taxi.order.network.b((tse) xvf0Var8.get(), (tt2) xvf0Var7.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var5), i5m.a(xvf0Var2), i5m.a(xvf0Var), i5m.a(xvf0Var6), i5m.a((bea0) xvf0Var4));
            case 25:
                return new j0((i200) xvf0Var8.get(), (fvt) xvf0Var7.get(), (fga0) xvf0Var3.get(), (qgz0) xvf0Var5.get(), (c200) xvf0Var2.get(), (gda0) xvf0Var.get(), (com.yandex.go.payments.domain.a) xvf0Var6.get(), (cxq0) ((xcz) xvf0Var4).get());
            case 26:
                return new k0((lw90) xvf0Var8.get(), (fga0) xvf0Var7.get(), (drd) xvf0Var3.get(), (p) ((swo0) xvf0Var6).get(), (qea0) xvf0Var5.get(), (tea0) xvf0Var2.get(), (kjz) ((icc0) xvf0Var4).get(), (gda0) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.preorder.source.pickup.a((u8w) ((t160) xvf0Var6).get(), (zuj0) xvf0Var8.get(), (pav) xvf0Var7.get(), (k7x0) xvf0Var3.get(), (hmb0) ((gga0) xvf0Var4).get(), (eqb0) xvf0Var5.get(), (hit) xvf0Var2.get(), (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 28:
                return new a46((w030) xvf0Var8.get(), (ComponentActivity) xvf0Var7.get(), (spp0) xvf0Var3.get(), (pwy0) xvf0Var5.get(), (oqd0) xvf0Var2.get(), (s3d0) xvf0Var.get(), (e8b0) xvf0Var4, (ney) xvf0Var6.get());
            default:
                return iuf0.c().b((Context) xvf0Var8.get(), i5m.a(xvf0Var7), (lx4) xvf0Var3.get(), i5m.a((oto0) xvf0Var6), i5m.a(xvf0Var5), (ru.yandex.taxi.security.c) ((rk21) xvf0Var4).get(), (tt2) xvf0Var2.get(), (hit) xvf0Var.get());
        }
    }

    public /* synthetic */ l20(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.i = v7pVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ l20(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.i = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ l20(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, v7p v7pVar, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.i = v7pVar;
        this.h = xvf0Var7;
    }

    public /* synthetic */ l20(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    public l20(xvf0 xvf0Var, xvf0 xvf0Var2, w10 w10Var, wnw wnwVar, n3w n3wVar, ziv zivVar, ziv zivVar2, b900 b900Var) {
        this.a = 13;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = w10Var;
        this.e = wnwVar;
        this.g = n3wVar;
        this.h = zivVar;
        this.i = zivVar2;
        this.f = b900Var;
    }

    public l20(t160 t160Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, gga0 gga0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 27;
        this.h = t160Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.i = gga0Var;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public l20(n2g n2gVar, p7w0 p7w0Var, a3g a3gVar, a3g a3gVar2, xvf0 xvf0Var, n2g n2gVar2, xvf0 xvf0Var2, y2g y2gVar) {
        this.a = 17;
        this.b = n2gVar;
        this.c = p7w0Var;
        this.d = a3gVar;
        this.e = a3gVar2;
        this.f = xvf0Var;
        this.h = n2gVar2;
        this.g = xvf0Var2;
        this.i = y2gVar;
    }

    public l20(etx etxVar, zlf0 zlf0Var, kqz kqzVar, kqz kqzVar2, xvf0 xvf0Var, ggl0 ggl0Var, e4f e4fVar, xvf0 xvf0Var2) {
        this.a = 16;
        this.b = etxVar;
        this.c = zlf0Var;
        this.h = kqzVar;
        this.i = kqzVar2;
        this.d = xvf0Var;
        this.e = ggl0Var;
        this.f = e4fVar;
        this.g = xvf0Var2;
    }

    public l20(zw30 zw30Var, xvf0 xvf0Var, bt2 bt2Var, swo0 swo0Var, l20 l20Var, xvf0 xvf0Var2, icc0 icc0Var, zw30 zw30Var2) {
        this.a = 26;
        this.b = zw30Var;
        this.c = xvf0Var;
        this.d = bt2Var;
        this.h = swo0Var;
        this.e = l20Var;
        this.f = xvf0Var2;
        this.i = icc0Var;
        this.g = zw30Var2;
    }

    public l20(hy30 hy30Var, xvf0 xvf0Var, xvf0 xvf0Var2, xv2 xv2Var, y0y0 y0y0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, bvx bvxVar) {
        this.a = 22;
        this.i = hy30Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xv2Var;
        this.e = y0y0Var;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = bvxVar;
    }

    public l20(d701 d701Var, y0y0 y0y0Var, xvf0 xvf0Var, bhx bhxVar, xv2 xv2Var, i020 i020Var, xvf0 xvf0Var2, bhx bhxVar2) {
        this.a = 23;
        this.b = d701Var;
        this.c = y0y0Var;
        this.d = xvf0Var;
        this.e = bhxVar;
        this.f = xv2Var;
        this.i = i020Var;
        this.g = xvf0Var2;
        this.h = bhxVar2;
    }

    public l20(sx2 sx2Var, xvf0 xvf0Var, xvf0 xvf0Var2, lwl0 lwl0Var, w7u w7uVar, jwx0 jwx0Var, hro hroVar, xvf0 xvf0Var3) {
        this.a = 18;
        this.f = sx2Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = lwl0Var;
        this.h = w7uVar;
        this.i = jwx0Var;
        this.d = hroVar;
        this.e = xvf0Var3;
    }

    public l20(eqh eqhVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, l20 l20Var, r2i r2iVar, eqh eqhVar2, xvf0 xvf0Var4) {
        this.a = 12;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.h = l20Var;
        this.i = r2iVar;
        this.f = eqhVar2;
        this.g = xvf0Var4;
    }

    public l20(ziv zivVar, ziv zivVar2, xvf0 xvf0Var, xvf0 xvf0Var2, mwq mwqVar, cnt cntVar, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 11;
        this.b = zivVar;
        this.i = zivVar2;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = mwqVar;
        this.f = cntVar;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
    }

    public l20(xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, if9 if9Var, xv2 xv2Var, x2b x2bVar, xvf0 xvf0Var3, r10 r10Var) {
        this.a = 7;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = xvf0Var2;
        this.e = if9Var;
        this.g = xv2Var;
        this.h = x2bVar;
        this.f = xvf0Var3;
        this.i = r10Var;
    }
}
