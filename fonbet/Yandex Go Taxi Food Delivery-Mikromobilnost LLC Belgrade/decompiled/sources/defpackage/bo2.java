package defpackage;

import android.content.Context;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.order.completion.pre_finish.domain.b;
import com.yandex.go.chargers.order.domain.f;
import com.yandex.go.navigator.driving.c0;
import com.yandex.go.navigator.main_screen.l;
import com.yandex.go.navigator.repository.o;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import java.util.concurrent.Executor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.d;
import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.masstransit.domain.v;
import ru.yandex.taxi.masstransit.domain.y;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes14.dex */
public final class bo2 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final Object g;
    public final xvf0 h;
    public final xvf0 i;

    public bo2(t160 t160Var, t160 t160Var2, xvf0 xvf0Var, ig7 ig7Var, uc50 uc50Var, oto0 oto0Var, m7q0 m7q0Var, t160 t160Var3) {
        this.a = 10;
        this.g = t160Var;
        this.c = t160Var2;
        this.b = xvf0Var;
        this.d = ig7Var;
        this.e = uc50Var;
        this.f = oto0Var;
        this.h = m7q0Var;
        this.i = t160Var3;
    }

    public static DivKitApi a(ao2 ao2Var, Merchant merchant, Payer payer, Context context, pcy pcyVar, u870 u870Var, rwo rwoVar, boolean z) {
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.a(new zn2(z, context, merchant, rwoVar, u870Var, payer));
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
        httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.BODY;
        aVar.a(httpLoggingInterceptor);
        OkHttpClient okHttpClient = new OkHttpClient(aVar);
        s0k0 s0k0Var = new s0k0();
        int i = ocy.a[pcyVar.a.ordinal()];
        String str = "https://tt-renderer-test.yandex-team.ru/api/";
        if (i != 1) {
            if (i == 2) {
                str = "http://127.0.0.1:8080/api/";
            } else if (i != 3) {
                str = "https://tt-renderer.yandex.net/api/";
                if (i != 4 && i != 5) {
                    w511.b();
                    return null;
                }
            }
        }
        s0k0Var.b(str);
        s0k0Var.a = okHttpClient;
        return (DivKitApi) s0k0Var.c().b(DivKitApi.class);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.i;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.f;
        Object obj = this.g;
        xvf0 xvf0Var6 = this.e;
        xvf0 xvf0Var7 = this.c;
        switch (i) {
            case 0:
                return a((ao2) obj, (Merchant) xvf0Var2.get(), (Payer) xvf0Var7.get(), (Context) xvf0Var.get(), (pcy) xvf0Var6.get(), (u870) ((n3w) xvf0Var3).a, (rwo) xvf0Var5.get(), ((Boolean) xvf0Var4.get()).booleanValue());
            case 1:
                return new a((l7x0) xvf0Var2.get(), (q8s) xvf0Var7.get(), (c) ((eqh) obj).get(), (htg) xvf0Var.get(), (fhu) xvf0Var6.get(), (yuj0) xvf0Var5.get(), (yfa) ((peb) xvf0Var4).get(), (p370) ((tgb0) xvf0Var3).get());
            case 2:
                return new f((tt2) ((lxf) obj).get(), (ney) xvf0Var2.get(), (g) ((nl9) xvf0Var).get(), (com.yandex.go.chargers.domain.a) xvf0Var7.get(), (com.yandex.go.chargers.order.domain.a) ((pw) xvf0Var6).get(), (iy11) ((rxf) xvf0Var5).get(), (e) ((lxf) xvf0Var4).get(), (lxf) xvf0Var3);
            case 3:
                return new b((tt2) ((lxf) obj).get(), (em9) xvf0Var2.get(), (pwy0) xvf0Var7.get(), (com.yandex.go.chargers.error.data.a) xvf0Var.get(), (ena) xvf0Var6.get(), (com.yandex.go.chargers.order.completion.pre_finish.data.a) xvf0Var5.get(), (v1a) xvf0Var4.get(), (saa) ((kj7) xvf0Var3).get());
            case 4:
                return new com.yandex.go.chargers.domain.c((tt2) ((lxf) obj).get(), (com.yandex.go.zone.interactors.b) xvf0Var2.get(), (ru.yandex.taxi.location.user.c) xvf0Var7.get(), (po21) xvf0Var.get(), (o8h) xvf0Var6.get(), (com.yandex.go.chargers.domain.b) xvf0Var5.get(), (rya) xvf0Var4.get(), (y5a) xvf0Var3.get());
            case 5:
                return new nyb((i130) xvf0Var2.get(), (uyb) ((so4) obj).get(), (tjt0) xvf0Var7.get(), this.d, (oep0) xvf0Var6.get(), (rft0) xvf0Var5.get(), (y9y0) xvf0Var4.get(), (y4k0) xvf0Var3.get());
            case 6:
                return new qyc((String) xvf0Var2.get(), (x201) ((mzf) obj).get(), (kcz0) ((flx0) xvf0Var6).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.data.c) xvf0Var7.get(), (y47) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.management.localstate.e) ((gbg) xvf0Var5).get(), (ru.yandex.taxi.logistics.sdk.management.f) ((gbg) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var3).get());
            case 7:
                return new w3i(this.b, (x) xvf0Var7.get(), (aqj0) xvf0Var.get(), (yfx0) xvf0Var6.get(), (f580) xvf0Var5.get(), (wiq0) ((w0g) obj).get(), (oep0) xvf0Var4.get(), (iev0) xvf0Var3.get(), 13);
            case 8:
                return new w3i((Context) ((t0g) obj).get(), (i130) xvf0Var2.get(), (d770) xvf0Var7.get(), (z880) xvf0Var.get(), (gwe) ((vd) xvf0Var5).get(), (zwe) ((g0g) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var3).get(), (wwe) xvf0Var6.get(), 14);
            case 9:
                return new zmi((vsi) xvf0Var2.get(), (g580) xvf0Var7.get(), (xjj0) xvf0Var.get(), (wmi) xvf0Var6.get(), (n3a) ((rwh) obj).get(), (kbi) xvf0Var5.get(), (wiq0) xvf0Var4.get(), (k7x0) ((gyf) xvf0Var3).get());
            case 10:
                return new w3i((sml) ((t160) obj).get(), (x870) ((t160) xvf0Var7).get(), (ddb) xvf0Var2.get(), (vr) ((ig7) xvf0Var).get(), (at20) ((uc50) xvf0Var6).get(), (xoq0) ((oto0) xvf0Var5).get(), (ndl0) ((m7q0) xvf0Var4).get(), (xl10) ((t160) xvf0Var3).get(), 18);
            case 11:
                return new zym((axm) xvf0Var2.get(), (y1s) xvf0Var7.get(), (l0n) xvf0Var.get(), (c4r0) ((jzf) obj).get(), (b8r) ((fzf) xvf0Var4).get(), (dqe0) xvf0Var6.get(), (w3r0) ((jzf) xvf0Var3).get(), (ibn) xvf0Var5.get());
            case 12:
                return new com.yandex.go.eboks.objects.data.mapper.a((ah00) ((kzf) obj).get(), (tt2) ((kzf) xvf0Var7).get(), (pwy0) ((kzf) xvf0Var).get(), (com.yandex.go.eboks.objects.data.mapper.c) ((c7n) xvf0Var6).get(), (yzh) ((kk) xvf0Var5).get(), (com.yandex.go.eboks.objects.data.mapper.b) ((oti) xvf0Var4).get(), (bin) ((f2i) xvf0Var3).get(), (din) xvf0Var2.get());
            case 13:
                return new uun((sb7) xvf0Var2.get(), (MessengerEnvironment) xvf0Var7.get(), (com.yandex.messaging.data.e) xvf0Var.get(), (lqo) xvf0Var6.get(), (fjs) xvf0Var5.get(), (jl21) ((y101) obj).get(), (kse) xvf0Var4.get(), (at2) xvf0Var3.get());
            case 14:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui.c((jwo) ((rzf) obj).b.b, (hwo) ((rzf) xvf0Var7).b.c, (com.yandex.delivery.utils.dialogmanager.impl.b) ((qzf) xvf0Var).get(), (fwo) xvf0Var2.get(), (m8h) ((hbn) xvf0Var6).get(), (st2) ((qzf) xvf0Var5).get(), (com.yandex.delivery.utils.dialogmanager.a) ((can) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.b) ((hbn) xvf0Var3).get());
            case 15:
                gym gymVar = (gym) ((szf) obj).get();
                h1p h1pVar = (h1p) xvf0Var2.get();
                ru.yandex.taxi.eatskit.c cVar = (ru.yandex.taxi.eatskit.c) xvf0Var7.get();
                ru.yandex.taxi.superapp.address.f fVar = (ru.yandex.taxi.superapp.address.f) xvf0Var.get();
                y3p y3pVar = (y3p) ((n3w) xvf0Var3).a;
                tse tseVar = (tse) xvf0Var6.get();
                com.yandex.go.superapp.impl.interactor.c cVar2 = (com.yandex.go.superapp.impl.interactor.c) xvf0Var5.get();
                rvq0 rvq0Var = (rvq0) xvf0Var4.get();
                m mVar = (m) gymVar.a;
                h1pVar.getClass();
                cVar.getClass();
                tseVar.getClass();
                fVar.getClass();
                y3pVar.getClass();
                cVar2.getClass();
                rvq0Var.getClass();
                return new vzf(mVar, h1pVar, cVar, tseVar, fVar, y3pVar, cVar2, rvq0Var);
            case 16:
                return new com.yandex.go.navigator.favorites.f((com.yandex.go.navigator.favorites.repository.b) xvf0Var2.get(), (com.yandex.go.navigator.favorites.repository.a) xvf0Var7.get(), (bzw) xvf0Var.get(), (ah00) xvf0Var6.get(), (lgq0) xvf0Var5.get(), (Context) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) obj).get(), (com.yandex.go.navigator.favorites.analylics.a) ((cto) xvf0Var3).get());
            case 17:
                return new com.yandex.go.taxi.order.details.v2.domain.feedback.a((o2y0) xvf0Var2.get(), (tse) xvf0Var7.get(), (alk0) ((n3w) xvf0Var3).a, (ufz0) ((u6g) obj).get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a) ((u6g) xvf0Var).get(), (ine0) ((t6g) xvf0Var6).get(), (dm21) ((u6g) xvf0Var5).get(), (ysg) ((t6g) xvf0Var4).get());
            case 18:
                return new com.yandex.messaging.internal.authorized.f((Context) xvf0Var2.get(), (to3) xvf0Var7.get(), (Executor) xvf0Var.get(), (oyq) xvf0Var6.get(), (kse) xvf0Var5.get(), (vse) xvf0Var4.get(), (doc) ((xvf0) obj).get(), (jln) ((njp) xvf0Var3).get());
            case 19:
                return new nru((u3s) ((n3w) xvf0Var3).a, (hwy0) ((gxf) obj).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.a) ((wvq) xvf0Var2).get(), (z4s) ((p1g) xvf0Var7).get(), (p6s) ((p1g) xvf0Var).get(), (s5s) ((p1g) xvf0Var6).get(), (sae) ((srb) xvf0Var5).get(), (vv0) ((p1g) xvf0Var4).get());
            case 20:
                return new com.yandex.go.intercity.flex.dashboard.presentation.g((xdw) ((n3w) xvf0Var3).a, (dqe0) ((f2g) obj).get(), (iu70) ((f2g) xvf0Var7).get(), (wnt) ((d2g) xvf0Var).get(), (fvt) ((d2g) xvf0Var6).get(), (rbl0) ((f2g) xvf0Var5).get(), (wiq0) ((f2g) xvf0Var4).get(), (cir) xvf0Var2.get());
            case 21:
                return new l((com.yandex.go.navigator.main_screen.f) ((zo0) obj).get(), (re50) xvf0Var2.get(), (tt2) xvf0Var7.get(), (com.yandex.go.navigator.main_screen.experiement.e) xvf0Var.get(), (com.yandex.go.navigator.floating_control_buttons.a) ((cto) xvf0Var3).get(), (c0) xvf0Var6.get(), (o) xvf0Var5.get(), (q850) xvf0Var4.get());
            case 22:
                return new w3i((y30) xvf0Var2.get(), (hwy0) xvf0Var7.get(), (tgg) xvf0Var.get(), (p030) ((h0z) obj).get(), (dci) xvf0Var6.get(), (t6s) xvf0Var5.get(), (oy60) xvf0Var4.get(), (le6) xvf0Var3.get());
            case 23:
                return new w3i((tgg) xvf0Var2.get(), (o5s) xvf0Var7.get(), (u1n) ((k0n) obj).get(), (b4s) ((cto) xvf0Var4).get(), (t6s) xvf0Var.get(), (yfa) ((peb) xvf0Var3).get(), (oy60) xvf0Var6.get(), (le6) xvf0Var5.get());
            case 24:
                return new t230((y30) xvf0Var2.get(), (hwy0) xvf0Var7.get(), (tgg) xvf0Var.get(), (d) ((bo2) obj).get(), (dci) ((o3g) xvf0Var6).get(), (t6s) ((p3g) xvf0Var5).get(), (oy60) ((p3g) xvf0Var4).get(), (le6) ((p3g) xvf0Var3).get());
            case 25:
                return new d((b4s) xvf0Var2.get(), (u3s) xvf0Var7.get(), (l030) xvf0Var.get(), (s030) ((n3w) xvf0Var3).a, (k130) xvf0Var6.get(), (o5s) xvf0Var5.get(), (u1n) ((p3g) obj).get(), (yfa) ((p3g) xvf0Var4).get());
            case 26:
                return new w3i((Context) xvf0Var2.get(), (tse) xvf0Var7.get(), (kqe) xvf0Var.get(), (vz30) ((n3w) xvf0Var3).a, (uxr0) ((g3g) obj).get(), (ru.yandex.taxi.masstransit.ui.discovery.c) ((x0z) xvf0Var6).get(), (xz30) ((wz30) xvf0Var5).get(), (i47) ((wz30) xvf0Var4).get(), 29);
            case 27:
                return new v((ru.yandex.taxi.masstransit.datasource.routing.f) xvf0Var2.get(), (tt2) ((u3g) obj).get(), (tu30) xvf0Var7.get(), (ru.yandex.taxi.masstransit.mapper.e) ((ys10) xvf0Var).get(), (cv00) ((v3g) xvf0Var6).get(), (ru.yandex.taxi.masstransit.domain.f) ((xkw) xvf0Var5).get(), (pwy0) ((w3g) xvf0Var4).get(), (d0) ((d701) xvf0Var3).get());
            case 28:
                return new y((gs30) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var7.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var.get(), (pdc) ((u3g) obj).get(), (k540) xvf0Var6.get(), (gei0) ((v3g) xvf0Var3).get(), (b040) xvf0Var5.get(), (tu30) xvf0Var4.get());
            default:
                return new cv30((Context) xvf0Var2.get(), (w030) xvf0Var7.get(), (dv30) xvf0Var.get(), (xu30) xvf0Var6.get(), (qx4) obj, (n7i0) xvf0Var5, i5m.a((y3g) xvf0Var4), (h) ((r3g) xvf0Var3).get());
        }
    }

    public /* synthetic */ bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, v7p v7pVar2, xvf0 xvf0Var5, v7p v7pVar3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.g = xvf0Var2;
        this.c = xvf0Var3;
        this.d = v7pVar;
        this.e = xvf0Var4;
        this.f = v7pVar2;
        this.h = xvf0Var5;
        this.i = v7pVar3;
    }

    public /* synthetic */ bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = v7pVar;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
    }

    public /* synthetic */ bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
    }

    public /* synthetic */ bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = v7pVar2;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
    }

    public /* synthetic */ bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, xvf0 xvf0Var6, v7p v7pVar2, int i) {
        this.a = i;
        this.g = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.i = v7pVar;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.h = v7pVar2;
    }

    public /* synthetic */ bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.h = xvf0Var6;
        this.g = xvf0Var7;
        this.i = v7pVar;
    }

    public /* synthetic */ bo2(lxf lxfVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.g = lxfVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
    }

    public bo2(kzf kzfVar, kzf kzfVar2, kzf kzfVar3, c7n c7nVar, kk kkVar, oti otiVar, f2i f2iVar, xvf0 xvf0Var) {
        this.a = 12;
        this.g = kzfVar;
        this.c = kzfVar2;
        this.d = kzfVar3;
        this.e = c7nVar;
        this.f = kkVar;
        this.h = otiVar;
        this.i = f2iVar;
        this.b = xvf0Var;
    }

    public bo2(b3g b3gVar, f3g f3gVar, g3g g3gVar, n3w n3wVar, g3g g3gVar2, x0z x0zVar, wz30 wz30Var, wz30 wz30Var2) {
        this.a = 26;
        this.b = b3gVar;
        this.c = f3gVar;
        this.d = g3gVar;
        this.i = n3wVar;
        this.g = g3gVar2;
        this.e = x0zVar;
        this.f = wz30Var;
        this.h = wz30Var2;
    }

    public bo2(t0g t0gVar, v0g v0gVar, v0g v0gVar2, eqh eqhVar, vd vdVar, g0g g0gVar, w0g w0gVar, xvf0 xvf0Var) {
        this.a = 8;
        this.g = t0gVar;
        this.b = v0gVar;
        this.c = v0gVar2;
        this.d = eqhVar;
        this.f = vdVar;
        this.h = g0gVar;
        this.i = w0gVar;
        this.e = xvf0Var;
    }

    public bo2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, xvf0 xvf0Var4, xvf0 xvf0Var5, p3g p3gVar, p3g p3gVar2) {
        this.a = 25;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.i = n3wVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = p3gVar;
        this.h = p3gVar2;
    }

    public bo2(rzf rzfVar, rzf rzfVar2, qzf qzfVar, xvf0 xvf0Var, hbn hbnVar, qzf qzfVar2, can canVar, hbn hbnVar2) {
        this.a = 14;
        this.g = rzfVar;
        this.c = rzfVar2;
        this.d = qzfVar;
        this.b = xvf0Var;
        this.e = hbnVar;
        this.f = qzfVar2;
        this.h = canVar;
        this.i = hbnVar2;
    }

    public bo2(n3w n3wVar, s6g s6gVar, n3w n3wVar2, u6g u6gVar, u6g u6gVar2, t6g t6gVar, u6g u6gVar3, t6g t6gVar2) {
        this.a = 17;
        this.b = n3wVar;
        this.c = s6gVar;
        this.i = n3wVar2;
        this.g = u6gVar;
        this.d = u6gVar2;
        this.e = t6gVar;
        this.f = u6gVar3;
        this.h = t6gVar2;
    }

    public bo2(hs30 hs30Var, u3g u3gVar, v3g v3gVar, u3g u3gVar2, xvf0 xvf0Var, v3g v3gVar2, xvf0 xvf0Var2, v3g v3gVar3) {
        this.a = 28;
        this.b = hs30Var;
        this.c = u3gVar;
        this.d = v3gVar;
        this.g = u3gVar2;
        this.e = xvf0Var;
        this.i = v3gVar2;
        this.f = xvf0Var2;
        this.h = v3gVar3;
    }

    public bo2(xvf0 xvf0Var, mzf mzfVar, flx0 flx0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, gbg gbgVar, gbg gbgVar2, mzf mzfVar2) {
        this.a = 6;
        this.b = xvf0Var;
        this.g = mzfVar;
        this.e = flx0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = gbgVar;
        this.h = gbgVar2;
        this.i = mzfVar2;
    }

    public bo2(lxf lxfVar, pxf pxfVar, nl9 nl9Var, fr3 fr3Var, pw pwVar, rxf rxfVar, lxf lxfVar2, lxf lxfVar3) {
        this.a = 2;
        this.g = lxfVar;
        this.b = pxfVar;
        this.d = nl9Var;
        this.c = fr3Var;
        this.e = pwVar;
        this.f = rxfVar;
        this.h = lxfVar2;
        this.i = lxfVar3;
    }

    public bo2(fzf fzfVar, fzf fzfVar2, xvf0 xvf0Var, jzf jzfVar, fzf fzfVar3, fzf fzfVar4, jzf jzfVar2, fzf fzfVar5) {
        this.a = 11;
        this.b = fzfVar;
        this.c = fzfVar2;
        this.d = xvf0Var;
        this.g = jzfVar;
        this.h = fzfVar3;
        this.e = fzfVar4;
        this.i = jzfVar2;
        this.f = fzfVar5;
    }

    public bo2(n3w n3wVar, gxf gxfVar, wvq wvqVar, p1g p1gVar, p1g p1gVar2, p1g p1gVar3, srb srbVar, p1g p1gVar4) {
        this.a = 19;
        this.i = n3wVar;
        this.g = gxfVar;
        this.b = wvqVar;
        this.c = p1gVar;
        this.d = p1gVar2;
        this.e = p1gVar3;
        this.f = srbVar;
        this.h = p1gVar4;
    }

    public bo2(n3w n3wVar, f2g f2gVar, f2g f2gVar2, d2g d2gVar, d2g d2gVar2, f2g f2gVar3, f2g f2gVar4, n3w n3wVar2) {
        this.a = 20;
        this.i = n3wVar;
        this.g = f2gVar;
        this.c = f2gVar2;
        this.d = d2gVar;
        this.e = d2gVar2;
        this.f = f2gVar3;
        this.h = f2gVar4;
        this.b = n3wVar2;
    }

    public bo2(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, peb pebVar, tgb0 tgb0Var) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = eqhVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.h = pebVar;
        this.i = tgb0Var;
    }

    public bo2(xvf0 xvf0Var, xvf0 xvf0Var2, k0n k0nVar, cto ctoVar, xvf0 xvf0Var3, peb pebVar, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 23;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = k0nVar;
        this.h = ctoVar;
        this.d = xvf0Var3;
        this.i = pebVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public bo2(ao2 ao2Var, n3w n3wVar, n3w n3wVar2, kk kkVar, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6) {
        this.a = 0;
        this.g = ao2Var;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = kkVar;
        this.e = n3wVar3;
        this.i = n3wVar4;
        this.f = n3wVar5;
        this.h = n3wVar6;
    }
}
