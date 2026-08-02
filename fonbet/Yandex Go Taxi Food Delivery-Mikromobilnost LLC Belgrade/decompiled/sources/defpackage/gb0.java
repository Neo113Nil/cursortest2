package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.address.address_map_picker.domain.d;
import com.yandex.go.address.address_map_picker.navigation.j;
import com.yandex.go.flex.main_screen.interactors.q;
import com.yandex.go.inapp_calls.experiment.p;
import com.yandex.go.pin.repository.o;
import com.yandex.go.preload.e;
import com.yandex.go.taxi.main.f;
import com.yandex.go.yb.domain.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Set;
import java.util.concurrent.Executor;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.client.api.LaunchApi;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.delivery.pin.k;
import ru.yandex.taxi.layers.domain.r;
import ru.yandex.taxi.linked_order.provider.i;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.startup.launch.l;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes8.dex */
public final class gb0 implements v7p {
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
    public final xvf0 k;

    public gb0(m2g m2gVar, m2g m2gVar2, ove oveVar, m2g m2gVar3, gd gdVar, m2g m2gVar4, m2g m2gVar5, m9a0 m9a0Var, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 21;
        this.d = m2gVar;
        this.e = m2gVar2;
        this.f = oveVar;
        this.g = m2gVar3;
        this.h = gdVar;
        this.i = m2gVar4;
        this.j = m2gVar5;
        this.k = m9a0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.i;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.f;
        xvf0 xvf0Var8 = this.j;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.k;
        switch (i) {
            case 0:
                h3y a = i5m.a(xvf0Var3);
                co40 co40Var = (co40) ((nup0) xvf0Var10).get();
                return new fb0(this.b, (lx4) xvf0Var4.get(), (ycq0) xvf0Var9.get(), this.e, i5m.a(xvf0Var7), i5m.a(xvf0Var), (b) xvf0Var6.get(), (sii) xvf0Var8, a, co40Var);
            case 1:
                return new e21(this.b, this.c, (cyx) xvf0Var9.get(), (qx60) xvf0Var2.get(), (j11) xvf0Var7.get(), (g21) xvf0Var.get(), (ayb) xvf0Var6.get(), (d) ((lf) xvf0Var8).get(), (a) xvf0Var3.get(), (jy0) xvf0Var10.get());
            case 2:
                c cVar = (c) xvf0Var4.get();
                AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository = (AddressMapPickerAddressStateRepository) xvf0Var9.get();
                g21 g21Var = (g21) xvf0Var2.get();
                com.yandex.go.navigation.screen.c cVar2 = (com.yandex.go.navigation.screen.c) xvf0Var6.get();
                ayb aybVar = (ayb) xvf0Var3.get();
                return new j(this.b, cVar, addressMapPickerAddressStateRepository, g21Var, this.g, (c8w) xvf0Var8, (lf) xvf0Var10, cVar2, aybVar);
            case 3:
                return new wf4(i5m.a((qsn) xvf0Var8), (Context) xvf0Var5.get(), (x22) xvf0Var4.get(), i5m.a(xvf0Var9), (Looper) xvf0Var2.get(), (Executor) xvf0Var7.get(), (w3c) xvf0Var.get(), (wff0) xvf0Var6.get(), (rz10) xvf0Var3.get(), (gsu) xvf0Var10.get());
            case 4:
                com.yandex.go.beginners.domain.interactor.b bVar = (com.yandex.go.beginners.domain.interactor.b) ((o10) xvf0Var10).get();
                return new qk5((e) xvf0Var5.get(), (ra00) xvf0Var4.get(), (k941) xvf0Var9.get(), this.e, this.f, this.g, this.h, this.i, (kxl0) xvf0Var8, bVar);
            case 5:
                return new rrj((w030) xvf0Var5.get(), this.c, this.d, (oqj) xvf0Var2.get(), this.f, (asj) xvf0Var.get(), (qqj) xvf0Var6.get(), this.i, (l3e) xvf0Var8, (zlf0) xvf0Var10);
            case 6:
                return new ygs((w030) xvf0Var5.get(), (Context) xvf0Var4.get(), (zuj0) xvf0Var9.get(), (oz01) xvf0Var2.get(), (dfm0) xvf0Var7.get(), (g9a0) xvf0Var.get(), (fga0) xvf0Var6.get(), (c1x0) ((x7y0) xvf0Var8).get(), (vrh) xvf0Var3.get(), (qnh) ((zzg) xvf0Var10).get(), 0);
            case 7:
                return new hls((Context) xvf0Var5.get(), (rqo) xvf0Var4.get(), (com.yandex.go.repositories.e) xvf0Var9.get(), (gf41) xvf0Var2.get(), (sh41) xvf0Var7.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get(), (fn21) xvf0Var6.get(), (tt2) xvf0Var3.get(), (wnt) xvf0Var8.get(), (acy0) ((n2y0) xvf0Var10).get());
            case 8:
                return new m((Application) xvf0Var5.get(), (tt2) xvf0Var4.get(), (rs2) xvf0Var9.get(), (zch) ((qii) xvf0Var).get(), (mb20) ((i020) xvf0Var6).get(), (oa1) ((qy0) xvf0Var3).get(), (com.yandex.taxi.go_platform.delegates.c) ((eqf0) xvf0Var8).get(), (tqt) xvf0Var2.get(), (oax) ((wnw) xvf0Var10).get(), (o3h) xvf0Var7.get());
            case 9:
                Context context = (Context) xvf0Var5.get();
                uq1 uq1Var = (uq1) xvf0Var4.get();
                lg21 lg21Var = (lg21) xvf0Var9.get();
                on2 on2Var = (on2) xvf0Var2.get();
                return new bu0(context, uq1Var, lg21Var, on2Var, (r1s) ((mwq) xvf0Var8).get(), (com.yandex.go.zone.interactors.a) xvf0Var.get(), (tt2) xvf0Var6.get(), (e2t) xvf0Var3.get(), (pho) xvf0Var10.get());
            case 10:
                return new com.yandex.go.inapp_calls.push_handler.a(i5m.a(xvf0Var5), (com.yandex.go.inapp_calls.interactor.a) xvf0Var4.get(), (ky2) xvf0Var9.get(), (tt2) xvf0Var2.get(), (njv) xvf0Var7.get(), i5m.a(xvf0Var), (com.yandex.go.proxyprovision.j) xvf0Var6.get(), (p2y0) xvf0Var3.get(), (com.yandex.go.taxi.order.domain.a) ((kxl0) xvf0Var8).get(), (Context) xvf0Var10.get());
            case 11:
                return new ru.yandex.taxi.linked_order.interactor.e((s10) xvf0Var5.get(), (ipy) xvf0Var4.get(), (ru.yandex.taxi.am.m) xvf0Var9.get(), (com.yandex.go.lifecycle.a) xvf0Var2.get(), (ru.yandex.taxi.linked_order.provider.e) xvf0Var7.get(), (uny) xvf0Var.get(), (qoy) xvf0Var6.get(), (i) ((ove) xvf0Var8).get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var10.get());
            case 12:
                return new l((LaunchApi) xvf0Var5.get(), (zux) xvf0Var4.get(), (ru.yandex.taxi.startup.launch.j) xvf0Var9.get(), (bk1) xvf0Var2.get(), (bpt) xvf0Var7.get(), (kb20) xvf0Var.get(), (ru.yandex.taxi.am.token.a) xvf0Var6.get(), (yd1) ((r10) xvf0Var8).get(), (blh) ((swb) xvf0Var10).get(), (tt2) xvf0Var3.get());
            case 13:
                ru.yandex.taxi.persuggest.api.a aVar = (ru.yandex.taxi.persuggest.api.a) xvf0Var5.get();
                ru.yandex.taxi.persuggest.source.a aVar2 = (ru.yandex.taxi.persuggest.source.a) xvf0Var4.get();
                sta0 sta0Var = (sta0) xvf0Var9.get();
                ru.yandex.taxi.polling.c cVar3 = (ru.yandex.taxi.polling.c) ((etx) xvf0Var8).get();
                ru.yandex.taxi.polling.e eVar = (ru.yandex.taxi.polling.e) xvf0Var2.get();
                k0b0 k0b0Var = (k0b0) xvf0Var7.get();
                return new ru.yandex.taxi.polling.d(aVar, aVar2, sta0Var, cVar3, eVar, k0b0Var, (g9z) xvf0Var6.get(), (Lifecycle) xvf0Var3.get(), (tse) xvf0Var10.get());
            case 14:
                qnr0 qnr0Var = (qnr0) xvf0Var5.get();
                wnt wntVar = (wnt) xvf0Var4.get();
                kf00 kf00Var = (kf00) xvf0Var9.get();
                c6i c6iVar = (c6i) xvf0Var2.get();
                onr0 onr0Var = (onr0) xvf0Var7.get();
                yxe0 yxe0Var = (yxe0) xvf0Var.get();
                pnr0 pnr0Var = (pnr0) xvf0Var3.get();
                ((peb) xvf0Var10).get();
                return new fjz(qnr0Var, wntVar, kf00Var, c6iVar, onr0Var, yxe0Var, pnr0Var);
            case 15:
                return new o((com.yandex.go.navigation.screen.c) xvf0Var5.get(), (ta4) xvf0Var4.get(), (s0c0) ((gwb0) xvf0Var6).get(), (r0c0) xvf0Var9.get(), (com.yandex.go.pin.interactor.a) ((g430) xvf0Var3).get(), (wiq0) xvf0Var2.get(), (k) ((t6i) xvf0Var8).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var7.get(), (nj6) ((fr3) xvf0Var10).get(), (pwy0) xvf0Var.get());
            case 16:
                return new f((Lifecycle) xvf0Var5.get(), (g) xvf0Var4.get(), (e) xvf0Var9.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var7.get(), this.g, i5m.a((d441) xvf0Var8), (lux) xvf0Var6.get(), (ofb) ((w10) xvf0Var10).get(), this.i);
            case 17:
                return new x540((Context) xvf0Var5.get(), (w030) xvf0Var4.get(), (ah00) xvf0Var9.get(), (ru.yandex.taxi.masstransit.threadschedule.e) ((xcz) xvf0Var8).get(), (dc4) xvf0Var2.get(), (jt30) xvf0Var7.get(), (MtPurchaseMapper) xvf0Var.get(), (wr30) xvf0Var6.get(), (ls30) xvf0Var3.get(), (y50) xvf0Var10.get());
            case 18:
                return new com.yandex.go.taxi.order.network.a(i5m.a(xvf0Var5), i5m.a(xvf0Var4), (d1t) xvf0Var9.get(), (sfa0) xvf0Var2.get(), (rq80) xvf0Var7.get(), (acz) xvf0Var.get(), (wnt) xvf0Var6.get(), (i4u) ((wnw) xvf0Var3).get(), (rkv) ((ziv) xvf0Var8).get(), (p) ((y1u) xvf0Var10).get());
            case 19:
                return new h980((Context) xvf0Var5.get(), (tse) xvf0Var4.get(), (pzf) ((my0) xvf0Var6).get(), (t580) ((f870) xvf0Var3).get(), (zuj0) xvf0Var9.get(), (vze0) xvf0Var2.get(), (t48) xvf0Var7.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var.get(), (ixx0) ((abx0) xvf0Var8).get(), (zxs0) ((yvr0) xvf0Var10).get());
            case 20:
                return new yy80((lx4) xvf0Var5.get(), (ql21) xvf0Var4.get(), (zf) ((e4f) xvf0Var2).get(), (rx2) ((e4f) xvf0Var7).get(), (zf) ((e4f) xvf0Var).get(), (cug) ((e4f) xvf0Var6).get(), (t61) ((e4f) xvf0Var3).get(), (jc4) ((e4f) xvf0Var8).get(), (rx2) ((ec80) xvf0Var10).get(), (ru.yandex.taxi.perf.b) xvf0Var9.get());
            case 21:
                return new r((com.yandex.go.lifecycle.a) ((m2g) xvf0Var9).get(), (e2t) ((m2g) xvf0Var2).get(), (oo2) ((ove) xvf0Var7).get(), (cyx) ((m2g) xvf0Var).get(), (ru.yandex.taxi.layers.source.requesttrigger.g) ((gd) xvf0Var6).get(), (com.yandex.go.navigation.screen.c) ((m2g) xvf0Var3).get(), (tt2) ((m2g) xvf0Var8).get(), (ru.yandex.taxi.layers.source.factory.d) ((m9a0) xvf0Var10).get(), (ru.yandex.taxi.layers.source.m) xvf0Var5.get(), (a3e0) xvf0Var4.get());
            case 22:
                return new com.yandex.go.intentprocessor.l((ru.yandex.taxi.deeplinks.f) xvf0Var5.get(), (Set) xvf0Var4.get(), (Set) xvf0Var9.get(), (com.yandex.go.blockeduser.data.c) xvf0Var2.get(), (y) xvf0Var7.get(), (com.yandex.go.ypay.impl.a) xvf0Var.get(), (ha1) xvf0Var6.get(), (cxq0) ((o10) xvf0Var8).get(), (com.yandex.go.intentprocessor.d) ((xsi) xvf0Var10).get(), (b) xvf0Var3.get());
            case 23:
                return new com.yandex.go.environment.b((com.yandex.go.zone.repository.o) xvf0Var5.get(), (com.yandex.go.zone.interactors.b) xvf0Var4.get(), (z110) xvf0Var9.get(), (cda0) xvf0Var2.get(), (atd0) xvf0Var7.get(), (h) xvf0Var.get(), (tt2) xvf0Var6.get(), (ru.yandex.taxi.favorites.data.repo.a) xvf0Var3.get(), (nfh) ((t6i) xvf0Var8).get(), (ru.yandex.taxi.scooters.domain.e) xvf0Var10.get());
            case 24:
                return new com.yandex.go.scooters.ignition.domain.m((tt2) xvf0Var5.get(), (m2o0) xvf0Var4.get(), (tsn0) xvf0Var9.get(), (com.yandex.go.scooters.ignition.data.e) xvf0Var2.get(), (com.yandex.go.scooters.ignition.data.b) xvf0Var7.get(), (com.yandex.go.scooters.ignition.analytics.a) xvf0Var.get(), (brn0) xvf0Var6.get(), (qsn0) xvf0Var3.get(), (gsn0) xvf0Var8.get(), (com.yandex.go.scooters.ignition.data.h) ((n0k0) xvf0Var10).get());
            case 25:
                return new com.yandex.go.service_catalog.router.b((wgr) xvf0Var5.get(), this.c, (c1m0) xvf0Var9.get(), (pgk0) ((nup0) xvf0Var6).get(), (w97) ((nup0) xvf0Var3).get(), (com.yandex.go.flex.main_screen.api.query.a) ((t6i) xvf0Var8).get(), (zuj0) xvf0Var2.get(), (puq0) xvf0Var7.get(), (smp) ((p9p) xvf0Var10).get(), (mjr) xvf0Var.get());
            case 26:
                return new q((com.yandex.go.flex.main_screen.presentation.feed.e) xvf0Var5.get(), (qcw0) xvf0Var4.get(), (gye0) xvf0Var9.get(), (yw11) xvf0Var2.get(), (com.yandex.go.flex.main_screen.domain.h) xvf0Var7.get(), (vit) ((of7) xvf0Var8).get(), (atx) xvf0Var.get(), (dd00) xvf0Var6.get(), (tt2) xvf0Var3.get(), (flex.engine.a) xvf0Var10.get());
            case 27:
                return new ru.yandex.taxi.summary.promotions.factory.a((ru.yandex.taxi.promotions.factory.a) ((vd) xvf0Var6).get(), (com.yandex.go.zone.repository.o) xvf0Var5.get(), (ck31) xvf0Var4.get(), (lng) xvf0Var9.get(), (cot) ((kyd) xvf0Var3).get(), (vkv0) ((vrt0) xvf0Var8).get(), (ulv0) ((alv0) xvf0Var10).get(), (f0) xvf0Var2.get(), (xv11) xvf0Var7.get(), (bg5) xvf0Var.get());
            case 28:
                return new e0w0((rqo) xvf0Var5.get(), (tt2) xvf0Var4.get(), (e) xvf0Var9.get(), (en10) ((w7u) xvf0Var8).get(), (ehe0) ((xyd0) xvf0Var10).get(), (x8z) xvf0Var2.get(), (k0b0) xvf0Var7.get(), (mr0) xvf0Var.get(), (n) xvf0Var6.get(), i5m.a(xvf0Var3));
            default:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.f((y50) xvf0Var5.get(), (com.yandex.go.navigation.screen.c) xvf0Var4.get(), (com.yandex.go.route.interactor.b) xvf0Var9.get(), this.e, (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.h) xvf0Var7.get(), this.g, this.h, (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) xvf0Var3.get(), this.j, (ove) xvf0Var10);
        }
    }

    public /* synthetic */ gb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, v7p v7pVar2, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.j = v7pVar;
        this.e = xvf0Var4;
        this.f = v7pVar2;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.k = xvf0Var8;
    }

    public /* synthetic */ gb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.j = v7pVar;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.k = xvf0Var9;
    }

    public /* synthetic */ gb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, v7p v7pVar, xvf0 xvf0Var8, v7p v7pVar2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.j = v7pVar;
        this.i = xvf0Var8;
        this.k = v7pVar2;
    }

    public /* synthetic */ gb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, v7p v7pVar, int i) {
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
        this.k = v7pVar;
    }

    public gb0(my0 my0Var, mz0 mz0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, r10 r10Var, c8w c8wVar, lf lfVar, xvf0 xvf0Var4, nl9 nl9Var) {
        this.a = 2;
        this.b = my0Var;
        this.c = mz0Var;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = r10Var;
        this.j = c8wVar;
        this.k = lfVar;
        this.h = xvf0Var4;
        this.i = nl9Var;
    }

    public /* synthetic */ gb0(xvf0 xvf0Var, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar3, v7p v7pVar4, v7p v7pVar5, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = v7pVar2;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = v7pVar3;
        this.j = v7pVar4;
        this.k = v7pVar5;
        this.i = xvf0Var5;
    }

    public gb0(eqh eqhVar, xvf0 xvf0Var, e4f e4fVar, e4f e4fVar2, e4f e4fVar3, e4f e4fVar4, e4f e4fVar5, e4f e4fVar6, ec80 ec80Var, xvf0 xvf0Var2) {
        this.a = 20;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.e = e4fVar;
        this.f = e4fVar2;
        this.g = e4fVar3;
        this.h = e4fVar4;
        this.i = e4fVar5;
        this.j = e4fVar6;
        this.k = ec80Var;
        this.d = xvf0Var2;
    }

    public gb0(xvf0 xvf0Var, xvf0 xvf0Var2, my0 my0Var, f870 f870Var, xvf0 xvf0Var3, xvf0 xvf0Var4, gw7 gw7Var, xvf0 xvf0Var5, abx0 abx0Var, yvr0 yvr0Var) {
        this.a = 19;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.h = my0Var;
        this.i = f870Var;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = gw7Var;
        this.g = xvf0Var5;
        this.j = abx0Var;
        this.k = yvr0Var;
    }

    public gb0(qsn qsnVar, h420 h420Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, h420 h420Var2, pw pwVar) {
        this.a = 3;
        this.j = qsnVar;
        this.b = h420Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = h420Var2;
        this.k = pwVar;
    }

    public gb0(n3w n3wVar, xvf0 xvf0Var, m7q0 m7q0Var, qii qiiVar, i020 i020Var, qy0 qy0Var, eqf0 eqf0Var, xsi xsiVar, wnw wnwVar, xvf0 xvf0Var2) {
        this.a = 8;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = m7q0Var;
        this.g = qiiVar;
        this.h = i020Var;
        this.i = qy0Var;
        this.j = eqf0Var;
        this.e = xsiVar;
        this.k = wnwVar;
        this.f = xvf0Var2;
    }

    public gb0(xvf0 xvf0Var, xvf0 xvf0Var2, gwb0 gwb0Var, qta0 qta0Var, g430 g430Var, xvf0 xvf0Var3, t6i t6iVar, xvf0 xvf0Var4, fr3 fr3Var, xvf0 xvf0Var5) {
        this.a = 15;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.h = gwb0Var;
        this.d = qta0Var;
        this.i = g430Var;
        this.e = xvf0Var3;
        this.j = t6iVar;
        this.f = xvf0Var4;
        this.k = fr3Var;
        this.g = xvf0Var5;
    }

    public gb0(vd vdVar, xvf0 xvf0Var, xvf0 xvf0Var2, e4f e4fVar, kyd kydVar, vrt0 vrt0Var, alv0 alv0Var, le30 le30Var, d701 d701Var, xvf0 xvf0Var3) {
        this.a = 27;
        this.h = vdVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = e4fVar;
        this.i = kydVar;
        this.j = vrt0Var;
        this.k = alv0Var;
        this.e = le30Var;
        this.f = d701Var;
        this.g = xvf0Var3;
    }

    public gb0(xvf0 xvf0Var, g3p g3pVar, xvf0 xvf0Var2, nup0 nup0Var, nup0 nup0Var2, t6i t6iVar, xvf0 xvf0Var3, nup0 nup0Var3, p9p p9pVar, cer cerVar) {
        this.a = 25;
        this.b = xvf0Var;
        this.c = g3pVar;
        this.d = xvf0Var2;
        this.h = nup0Var;
        this.i = nup0Var2;
        this.j = t6iVar;
        this.e = xvf0Var3;
        this.f = nup0Var3;
        this.k = p9pVar;
        this.g = cerVar;
    }

    public gb0(xvf0 xvf0Var, eqh eqhVar, yly ylyVar, eqh eqhVar2, xvf0 xvf0Var2, eqh eqhVar3, d441 d441Var, xvf0 xvf0Var3, w10 w10Var, eqh eqhVar4) {
        this.a = 16;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = ylyVar;
        this.e = eqhVar2;
        this.f = xvf0Var2;
        this.g = eqhVar3;
        this.j = d441Var;
        this.h = xvf0Var3;
        this.k = w10Var;
        this.i = eqhVar4;
    }

    public gb0(xvf0 xvf0Var, xvf0 xvf0Var2, yly ylyVar, w7u w7uVar, xyd0 xyd0Var, xvf0 xvf0Var3, i0b0 i0b0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, jwx0 jwx0Var) {
        this.a = 28;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = ylyVar;
        this.j = w7uVar;
        this.k = xyd0Var;
        this.e = xvf0Var3;
        this.f = i0b0Var;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = jwx0Var;
    }
}
