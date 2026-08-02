package defpackage;

import android.content.Context;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.n;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.messaging.ChatRequest;
import com.ybsdk.common.a;
import com.ybsdk.core.common.data.cache.b;
import com.ybsdk.feature.dashboard.internal.data.DashboardApi;
import com.ybsdk.feature.dashboard.internal.data.c;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.eatskit.internal.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f;
import ru.yandex.taxi.masstransit.overlay.onmap.i;

/* loaded from: classes5.dex */
public final class epf implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public epf(mzf mzfVar, oti otiVar, t9n t9nVar, xvf0 xvf0Var, flx0 flx0Var, peb pebVar, gbg gbgVar) {
        this.a = 16;
        this.c = mzfVar;
        this.d = otiVar;
        this.e = t9nVar;
        this.b = xvf0Var;
        this.f = flx0Var;
        this.g = pebVar;
        this.h = gbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.h;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.b;
        xvf0 xvf0Var7 = this.e;
        switch (i) {
            case 0:
                return new j4n((t8i) xvf0Var6.get(), (zof) xvf0Var.get(), (xl10) ((t160) xvf0Var5).get(), (wiq0) xvf0Var4.get(), (c4r0) xvf0Var7.get(), (a9i) xvf0Var3, (zch) ((rwh) xvf0Var2).get());
            case 1:
                return new c((DashboardApi) ((srb) xvf0Var6).get(), (b) ((ayf) xvf0Var).get(), (n860) ((ayf) xvf0Var4).get(), (fdr) ((ayf) xvf0Var7).get(), (tvv) ((ayf) xvf0Var5).get(), (a) ((oxf) xvf0Var3).get(), (y1r0) ((ayf) xvf0Var2).get());
            case 2:
                return new l3h((tfl0) ((byf) xvf0Var6).get(), (zgf) ((ayf) xvf0Var).get(), i5m.a((ayf) xvf0Var4), (a3h) ((ayf) xvf0Var7).get(), (xjg) ((wif) xvf0Var5).get(), (wwf) ((f2b) xvf0Var3).get(), (r0h) ((ayf) xvf0Var2).get());
            case 3:
                return new j5i((m4v) ((xat) xvf0Var4).get(), (jhg) ((f2b) xvf0Var7).get(), (vdc) xvf0Var6.get(), (bh4) ((tl3) xvf0Var5).get(), (tj20) ((di20) xvf0Var3).get(), (gd3) xvf0Var.get(), (whf0) ((vm80) xvf0Var2).get());
            case 4:
                return new ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.c((ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper.a) ((ut) xvf0Var7).get(), (hwy0) ((jyf) xvf0Var5).b.j, (flg) xvf0Var6.get(), (q4i) xvf0Var.get(), (zch) ((kyf) xvf0Var3).b.a, (ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.a) ((wif) xvf0Var2).get(), (lw) xvf0Var4.get());
            case 5:
                return new w8i((j9i) ((fwc) xvf0Var).get(), (pwy0) ((myf) xvf0Var4).get(), (zch) ((rwh) xvf0Var2).get(), (b8r) ((myf) xvf0Var7).get(), (ymi) ((myf) xvf0Var5).get(), (w15) xvf0Var6.get(), (myf) xvf0Var3);
            case 6:
                return new nki((wiq0) xvf0Var6.get(), this.c, (g580) xvf0Var4.get(), (hvi) xvf0Var7.get(), (jvi) xvf0Var5.get(), (kbi) ((rwh) xvf0Var3).get(), (oep0) ((gyf) xvf0Var2).get());
            case 7:
                return new bmi((com.yandex.go.delivery.rental_duration_selector.requirement.c) ((wrh) xvf0Var6).get(), (czi0) ((tyf) xvf0Var).b.f, (wiq0) ((tyf) xvf0Var4).get(), (tyf) xvf0Var7, (gmi) ((wif) xvf0Var5).get(), (pwy0) ((tyf) xvf0Var3).get(), (oep0) ((tyf) xvf0Var2).get());
            case 8:
                return new j4n((Context) ((t0g) xvf0Var5).get(), (rqo) ((u0g) xvf0Var3).get(), (n3h) xvf0Var6.get(), (lx4) xvf0Var.get(), (pho) xvf0Var4.get(), (wiq0) ((w0g) xvf0Var2).get(), (uze0) xvf0Var7.get());
            case 9:
                return new n((wiq0) ((w0g) xvf0Var5).get(), (yli) xvf0Var6.get(), (com.yandex.go.delivery.rental_duration_selector.requirement.c) ((wrh) xvf0Var3).get(), (viv0) xvf0Var.get(), (vfx0) xvf0Var4.get(), (com.yandex.go.summary.mapper.a) xvf0Var7.get(), (gmi) ((wif) xvf0Var2).get());
            case 10:
                return new ptj((en10) ((iag) xvf0Var5).get(), (tt2) xvf0Var6.get(), (f600) ((iag) xvf0Var3).get(), (iag) xvf0Var2, (oep0) xvf0Var.get(), (com.yandex.go.route.interactor.b) xvf0Var4.get(), (p) xvf0Var7.get());
            case 11:
                return new r((Context) ((h4g) xvf0Var).get(), (zuj0) xvf0Var6.get(), (x1l0) ((s3f0) xvf0Var4).get(), (gpv) ((h1t) xvf0Var7).get(), (pav) ((l4g) xvf0Var5).get(), (i19) ((t4) xvf0Var3).get(), (wsk0) ((l4g) xvf0Var2).get());
            case 12:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.c((st2) ((gbg) xvf0Var6).get(), (g701) ((hbg) xvf0Var).b.b, (j) ((k4) xvf0Var4).get(), (kcz0) ((flx0) xvf0Var7).get(), (wwf) ((pgi) xvf0Var5).get(), (y4a0) ((g680) xvf0Var3).get(), (amp0) ((y2s0) xvf0Var2).get());
            case 13:
                return new com.yandex.go.external_service.deeplink.a((xsv0) ((szf) xvf0Var7).get(), (y3p) xvf0Var6.get(), (com.yandex.go.superapp.impl.presenter_delegate.a) xvf0Var.get(), (ru.yandex.taxi.deeplinks.b) ((jzf) xvf0Var5).get(), (h1p) xvf0Var4.get(), (com.yandex.go.superapp.impl.delegate.a) ((szf) xvf0Var3).get(), (edn) ((upj) xvf0Var2).get());
            case 14:
                h1p h1pVar = (h1p) xvf0Var6.get();
                pdn pdnVar = (pdn) xvf0Var.get();
                adn adnVar = (adn) xvf0Var4.get();
                fen fenVar = (fen) ((c7n) xvf0Var5).get();
                pwy0 pwy0Var = (pwy0) ((tzf) xvf0Var3).get();
                com.yandex.go.order.external.tracking.c cVar = (com.yandex.go.order.external.tracking.c) ((jzf) xvf0Var2).get();
                x1p x1pVar = (x1p) xvf0Var7.get();
                LinkedHashMap linkedHashMap = pdnVar.a;
                Object obj = linkedHashMap.get(h1pVar);
                if (obj == null) {
                    obj = new e();
                    linkedHashMap.put(h1pVar, obj);
                }
                ru.yandex.taxi.eatskit.c cVar2 = new ru.yandex.taxi.eatskit.c(h1pVar, fenVar, adnVar, pdnVar, (e) obj, cVar, pwy0Var, EmptyList.a);
                x1pVar.a(new wgk(3, cVar2, x1pVar));
                return cVar2;
            case 15:
                return new com.yandex.go.requirements.order.a((tse) ((y0g) xvf0Var5).get(), (yfx0) xvf0Var6.get(), (wiq0) ((w0g) xvf0Var3).get(), (kdr) xvf0Var.get(), (e380) xvf0Var4.get(), (vqv0) xvf0Var7.get(), (biv0) ((b1g) xvf0Var2).get());
            case 16:
                return new f((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var).get(), (j8n) ((oti) xvf0Var4).get(), (vau) ((t9n) xvf0Var7).get(), (vhf0) xvf0Var6.get(), (kcz0) ((flx0) xvf0Var5).get(), (vr) ((peb) xvf0Var3).get(), (bi60) ((gbg) xvf0Var2).get());
            case 17:
                return new ocw((gir) xvf0Var6.get(), (Context) ((d2g) xvf0Var5).get(), (w030) xvf0Var.get(), (k6x) xvf0Var4.get(), (Set) ((y2r0) xvf0Var3).get(), (com.yandex.div.core.expression.variables.a) xvf0Var7.get(), (hpq) ((d2g) xvf0Var2).get());
            case 18:
                return new cpw((w030) xvf0Var6.get(), (ufb0) ((f2g) xvf0Var4).get(), (b9w) ((d2g) xvf0Var7).get(), (cir) ((n3w) xvf0Var5).a, (d9w) ((d2g) xvf0Var3).get(), (uow) ((f2g) xvf0Var2).get(), (oep0) xvf0Var.get());
            case 19:
                return new h9x((yh3) ((ze) xvf0Var5).get(), (an90) xvf0Var6.get(), (b40) xvf0Var.get(), (bo3) ((tl3) xvf0Var3).get(), (ChatRequest) xvf0Var4.get(), (k0b) xvf0Var7.get(), (fcf) xvf0Var2.get());
            case 20:
                return new f8z((ah00) xvf0Var6.get(), (ru.yandex.taxi.map.overlay.diagnostic.a) ((c0j) xvf0Var5).get(), (hdu) ((h0z) xvf0Var3).get(), (xm00) xvf0Var.get(), (i130) xvf0Var4.get(), (Context) xvf0Var7.get(), (uqx) xvf0Var2.get());
            case 21:
                return new rqz((gf41) xvf0Var6.get(), (nqz) xvf0Var.get(), (oqz) ((n3w) xvf0Var5).a, (n3h) xvf0Var4.get(), (w030) ((s2g) xvf0Var3).get(), (bqz) xvf0Var7.get(), (oep0) ((s2g) xvf0Var2).get());
            case 22:
                Context context = (Context) xvf0Var6.get();
                w030 w030Var = (w030) xvf0Var.get();
                zgf zgfVar = (zgf) ((p6f) xvf0Var5).get();
                z830 z830Var = (z830) ((ys10) xvf0Var3).get();
                boj0 boj0Var = (boj0) ((wvq) xvf0Var2).get();
                tt2 tt2Var = (tt2) xvf0Var4.get();
                m1p m1pVar = (m1p) ((h410) xvf0Var7.get()).c.getValue();
                m1pVar.getClass();
                return new np30(context, w030Var, new kp30(), new com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.b((pwy0) m1pVar.a.j, tt2Var, new pp30()), zgfVar, new lp30(), z830Var, boj0Var);
            case 23:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.a((u3s) ((n3w) xvf0Var6).a, (hwy0) ((gxf) xvf0Var).get(), (e100) ((di20) xvf0Var4).get(), (is0) ((js0) xvf0Var7).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.domain.a) ((ys10) xvf0Var5).get(), (sae) ((srb) xvf0Var3).get(), (p6s) ((p1g) xvf0Var2).get());
            case 24:
                return new sv20((ah00) xvf0Var6.get(), (a3v) xvf0Var.get(), (et00) xvf0Var4.get(), (fvr) xvf0Var7.get(), (pwy0) xvf0Var5.get(), (com.yandex.go.taxi.summary.mobilityhub.mapper.a) ((c0j) xvf0Var3).get(), (com.yandex.go.route.interactor.b) ((l3g) xvf0Var2).get());
            case 25:
                return new com.yandex.go.taxi.summary.mobilityhub.mapper.b((Context) xvf0Var6.get(), (com.yandex.go.pin.api.widget.b) xvf0Var.get(), (ru.yandex.taxi.design.utils.b) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var7.get(), (pdc) xvf0Var5.get(), (hdu) ((xat) xvf0Var3).get(), (ru.yandex.taxi.design.utils.a) xvf0Var2.get());
            case 26:
                return new wrr((Context) ((jyf) xvf0Var6).get(), (dci) ((jyf) xvf0Var).get(), (jwh) ((jyf) xvf0Var4).get(), (hwy0) ((jyf) xvf0Var7).get(), (l7x0) ((jyf) xvf0Var5).get(), (qcp0) ((jyf) xvf0Var3).get(), (q8s) ((jyf) xvf0Var2).get(), 9);
            case 27:
                return new ru.yandex.taxi.masstransit.stoproute.interactor.a((tt2) xvf0Var6.get(), (ru.yandex.taxi.masstransit.datasource.thread.a) ((h0z) xvf0Var7).get(), (ru.yandex.taxi.masstransit.datasource.vehicle.a) ((h0z) xvf0Var5).get(), (ru.yandex.taxi.masstransit.datasource.schedule.b) ((i020) xvf0Var3).get(), (s240) ((wz30) xvf0Var2).get(), (en30) xvf0Var.get(), (dz00) xvf0Var4.get());
            case 28:
                return new ru.yandex.taxi.masstransit.stoproute.interactor.p((ah00) ((f3g) xvf0Var5).get(), (tt2) xvf0Var6.get(), (ru.yandex.taxi.masstransit.stoproute.mapper.a) ((ret) xvf0Var3).get(), (m010) xvf0Var.get(), (f340) xvf0Var4.get(), (dz00) xvf0Var7.get(), (i) ((zw30) xvf0Var2).get());
            default:
                return new iq40((g) ((w0g) xvf0Var7).get(), (cjj0) xvf0Var6.get(), (hqj0) xvf0Var.get(), (dqe0) ((w0g) xvf0Var5).get(), (lw90) xvf0Var4.get(), (dy6) ((s730) xvf0Var3).get(), (tbx0) ((fat0) xvf0Var2).get());
        }
    }

    public /* synthetic */ epf(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ epf(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i, boolean z) {
        this.a = i;
        this.f = xvf0Var;
        this.b = xvf0Var2;
        this.g = xvf0Var3;
        this.c = xvf0Var4;
        this.d = xvf0Var5;
        this.e = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ epf(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.f = xvf0Var4;
        this.d = xvf0Var5;
        this.g = xvf0Var6;
        this.h = v7pVar;
    }

    public epf(xvf0 xvf0Var, c0j c0jVar, h0z h0zVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 20;
        this.b = xvf0Var;
        this.f = c0jVar;
        this.g = h0zVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.h = xvf0Var5;
    }

    public epf(d441 d441Var, n3w n3wVar, n3w n3wVar2, if9 if9Var, s2g s2gVar, qx5 qx5Var, s2g s2gVar2) {
        this.a = 21;
        this.b = d441Var;
        this.c = n3wVar;
        this.f = n3wVar2;
        this.d = if9Var;
        this.g = s2gVar;
        this.e = qx5Var;
        this.h = s2gVar2;
    }

    public epf(ze zeVar, xvf0 xvf0Var, xvf0 xvf0Var2, tl3 tl3Var, v8c0 v8c0Var, mu7 mu7Var, xvf0 xvf0Var3) {
        this.a = 19;
        this.f = zeVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = tl3Var;
        this.d = v8c0Var;
        this.e = mu7Var;
        this.h = xvf0Var3;
    }

    public epf(ut utVar, jyf jyfVar, xvf0 xvf0Var, xvf0 xvf0Var2, kyf kyfVar, wif wifVar, xvf0 xvf0Var3) {
        this.a = 4;
        this.e = utVar;
        this.f = jyfVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = kyfVar;
        this.h = wifVar;
        this.d = xvf0Var3;
    }

    public epf(t0g t0gVar, u0g u0gVar, s0g s0gVar, t0g t0gVar2, u0g u0gVar2, w0g w0gVar, w0g w0gVar2) {
        this.a = 8;
        this.f = t0gVar;
        this.g = u0gVar;
        this.b = s0gVar;
        this.c = t0gVar2;
        this.d = u0gVar2;
        this.h = w0gVar;
        this.e = w0gVar2;
    }

    public epf(b3g b3gVar, h0z h0zVar, h0z h0zVar2, i020 i020Var, wz30 wz30Var, f3g f3gVar, f3g f3gVar2) {
        this.a = 27;
        this.b = b3gVar;
        this.e = h0zVar;
        this.f = h0zVar2;
        this.g = i020Var;
        this.h = wz30Var;
        this.c = f3gVar;
        this.d = f3gVar2;
    }

    public epf(h4g h4gVar, l4g l4gVar, s3f0 s3f0Var, h1t h1tVar, l4g l4gVar2, t4 t4Var, l4g l4gVar3) {
        this.a = 11;
        this.c = h4gVar;
        this.b = l4gVar;
        this.d = s3f0Var;
        this.e = h1tVar;
        this.f = l4gVar2;
        this.g = t4Var;
        this.h = l4gVar3;
    }

    public epf(xat xatVar, f2b f2bVar, xvf0 xvf0Var, tl3 tl3Var, di20 di20Var, xvf0 xvf0Var2, vm80 vm80Var) {
        this.a = 3;
        this.d = xatVar;
        this.e = f2bVar;
        this.b = xvf0Var;
        this.f = tl3Var;
        this.g = di20Var;
        this.c = xvf0Var2;
        this.h = vm80Var;
    }

    public epf(kk kkVar, szf szfVar, xvf0 xvf0Var, c7n c7nVar, tzf tzfVar, jzf jzfVar, xvf0 xvf0Var2) {
        this.a = 14;
        this.b = kkVar;
        this.c = szfVar;
        this.d = xvf0Var;
        this.f = c7nVar;
        this.g = tzfVar;
        this.h = jzfVar;
        this.e = xvf0Var2;
    }

    public epf(fwc fwcVar, myf myfVar, rwh rwhVar, myf myfVar2, myf myfVar3, xvf0 xvf0Var, myf myfVar4) {
        this.a = 5;
        this.c = fwcVar;
        this.d = myfVar;
        this.h = rwhVar;
        this.e = myfVar2;
        this.f = myfVar3;
        this.b = xvf0Var;
        this.g = myfVar4;
    }

    public epf(f2g f2gVar, f2g f2gVar2, d2g d2gVar, n3w n3wVar, d2g d2gVar2, f2g f2gVar3, f2g f2gVar4) {
        this.a = 18;
        this.b = f2gVar;
        this.d = f2gVar2;
        this.e = d2gVar;
        this.f = n3wVar;
        this.g = d2gVar2;
        this.h = f2gVar3;
        this.c = f2gVar4;
    }

    public epf(iag iagVar, xvf0 xvf0Var, iag iagVar2, iag iagVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 10;
        this.f = iagVar;
        this.b = xvf0Var;
        this.g = iagVar2;
        this.h = iagVar3;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public epf(xvf0 xvf0Var, xvf0 xvf0Var2, t160 t160Var, xvf0 xvf0Var3, xvf0 xvf0Var4, a9i a9iVar, rwh rwhVar) {
        this.a = 0;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = t160Var;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = a9iVar;
        this.h = rwhVar;
    }

    public epf(b3g b3gVar, f3g f3gVar, p6f p6fVar, ys10 ys10Var, wvq wvqVar, b3g b3gVar2, f3g f3gVar2) {
        this.a = 22;
        this.b = b3gVar;
        this.c = f3gVar;
        this.f = p6fVar;
        this.g = ys10Var;
        this.h = wvqVar;
        this.d = b3gVar2;
        this.e = f3gVar2;
    }

    public epf(e3u e3uVar, d2g d2gVar, f2g f2gVar, n3w n3wVar, y2r0 y2r0Var, xvf0 xvf0Var, d2g d2gVar2) {
        this.a = 17;
        this.b = e3uVar;
        this.f = d2gVar;
        this.c = f2gVar;
        this.d = n3wVar;
        this.g = y2r0Var;
        this.e = xvf0Var;
        this.h = d2gVar2;
    }
}
