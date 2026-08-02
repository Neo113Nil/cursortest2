package defpackage;

import android.content.Context;
import com.yandex.go.analytics.b;
import com.yandex.go.flex.main_screen.domain.h;
import com.yandex.go.lottie_loader.data.repositories.d;
import com.yandex.go.order.ui.presentation.car.a;
import com.yandex.go.taxi.order.y;
import com.yandex.go.user_profile.fullscreen.models.l;
import ru.yandex.taxi.am.b0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.internal.c;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.layers.presentation.mapnotification.e;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.superapp.address.i;

/* loaded from: classes.dex */
public final class axy implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public axy(m2g m2gVar, b8w b8wVar, m2g m2gVar2, m2g m2gVar3, xvf0 xvf0Var) {
        this.a = 9;
        this.c = m2gVar;
        this.d = b8wVar;
        this.e = m2gVar2;
        this.f = m2gVar3;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new zwy((tt2) xvf0Var5.get(), (cot) ((fn5) xvf0Var4).get(), (jpr) ((i5s0) xvf0Var2).get(), (h) xvf0Var.get(), (n9p) xvf0Var3.get());
            case 1:
                return new a((Context) xvf0Var5.get(), (gic) xvf0Var.get(), (c58) ((cg7) xvf0Var4).get(), (y48) ((of7) xvf0Var2).get(), (tt2) xvf0Var3.get());
            case 2:
                return new fhz((lx4) xvf0Var5.get(), (k) xvf0Var.get(), (ma1) xvf0Var3.get(), (cug) ((bwy) xvf0Var4).get(), (rx2) ((zd51) xvf0Var2).get());
            case 3:
                return new c((k) xvf0Var5.get(), (no90) xvf0Var.get(), (fgb0) xvf0Var3.get(), (jc4) ((bwy) xvf0Var4).get(), (im51) xvf0Var2.get());
            case 4:
                return new b0((g) xvf0Var5.get(), (ru.yandex.taxi.startup.launch.c) xvf0Var.get(), (vo90) xvf0Var3.get(), (ru.yandex.taxi.am.internal.g) ((le30) xvf0Var4).get(), (mrj0) xvf0Var2.get());
            case 5:
                return new d(i5m.a(xvf0Var5), i5m.a(xvf0Var), i5m.a((kqz) xvf0Var4), i5m.a((kqz) xvf0Var2), (hit) xvf0Var3.get());
            case 6:
                yj21 yj21Var = (yj21) xvf0Var5.get();
                lx4 lx4Var = (lx4) xvf0Var.get();
                return new m500(yj21Var, lx4Var, (x770) ((upk0) xvf0Var4).get(), (jj10) xvf0Var2.get());
            case 7:
                return new com.yandex.go.user_profile.main_menu.profile.domain.c((m) xvf0Var5.get(), (l) xvf0Var.get(), (m600) ((yly) xvf0Var3).get(), (com.yandex.go.user_profile.main_menu.profile.repository.d) ((yly) xvf0Var4).get(), (com.yandex.go.user_profile.main_menu.profile.repository.a) ((yly) xvf0Var2).get());
            case 8:
                return new com.yandex.go.taxi.tariffs.internal.routestats.interactor.c((t7j0) ((ci3) xvf0Var4).get(), (ru.yandex.taxi.provider.a) xvf0Var5.get(), (uze0) xvf0Var.get(), (ru.yandex.taxi.routestats.prefetch.m) xvf0Var3.get(), (b) xvf0Var2.get());
            case 9:
                return new ru.yandex.taxi.layers.presentation.mapnotification.c((tt2) ((m2g) xvf0Var).get(), (ru.yandex.taxi.layers.source.factory.b) ((b8w) xvf0Var3).get(), (tyx) ((m2g) xvf0Var4).get(), (MapNotificationsMuteRepository) ((m2g) xvf0Var2).get(), (e) xvf0Var5.get());
            case 10:
                return new ru.yandex.taxi.layers.source.e((dne0) ((n2g) xvf0Var5).get(), (wnt) ((m2g) xvf0Var).get(), (tt2) ((m2g) xvf0Var3).get(), (ru.yandex.taxi.layers.source.factory.c) ((b8w) xvf0Var4).get(), (fn21) ((n2g) xvf0Var2).get());
            case 11:
                return new vx00((wnt) xvf0Var5.get(), i5m.a((etx) xvf0Var4), i5m.a((c660) xvf0Var2), i5m.a(xvf0Var), i5m.a(xvf0Var3));
            case 12:
                return new bn10((lx4) xvf0Var5.get(), (l8w0) xvf0Var.get(), i5m.a(xvf0Var3), i5m.a((xsi) xvf0Var4), i5m.a(xvf0Var2));
            case 13:
                return new n220((z320) xvf0Var5.get(), (z320) xvf0Var.get(), (z320) xvf0Var3.get(), (o120) xvf0Var4.get(), (x020) ((gve) xvf0Var2).get());
            case 14:
                return new com.yandex.go.multimodal_route.store.a((on2) xvf0Var5.get(), (yu40) xvf0Var.get(), (com.yandex.go.multimodal_route.experiement.c) ((s730) xvf0Var4).get(), (tt2) xvf0Var3.get(), (wr40) xvf0Var2.get());
            case 15:
                return new com.yandex.go.multimodal_route.deeplink.a((s730) xvf0Var4, (p) xvf0Var5.get(), (xes0) xvf0Var.get(), (yu40) xvf0Var3.get(), (n20) xvf0Var2.get());
            case 16:
                return new ru.yandex.taxi.new_history.a((q560) xvf0Var5.get(), this.c, (q3u0) xvf0Var3.get(), (ru.yandex.taxi.experiments.history.a) xvf0Var4.get(), (gym) ((cer) xvf0Var2).get());
            case 17:
                return new ng60((lx4) xvf0Var5.get(), (yqg) xvf0Var.get(), (p1g0) xvf0Var3.get(), (p0g0) ((eqf0) xvf0Var4).get(), (mg60) ((c660) xvf0Var2).get());
            case 18:
                return new ru.yandex.taxi.am.token.internal.a((ep90) xvf0Var5.get(), (u02) xvf0Var.get(), (mrj0) ((nrj0) xvf0Var4).get(), (ru11) xvf0Var3.get(), (mo60) xvf0Var2.get());
            case 19:
                return new i((ru.yandex.taxi.superapp.orders.multi.a) xvf0Var5.get(), (ru.yandex.taxi.search.suggest.i) xvf0Var.get(), (uk10) ((s730) xvf0Var4).get(), (com.yandex.go.route.interactor.b) xvf0Var3.get(), (ru.yandex.taxi.preorder.source.domain.a) xvf0Var2.get());
            case 20:
                return new com.yandex.go.taxi.order.cancel.v2.data.d((xdf) xvf0Var5.get(), (com.yandex.go.taxi.order.cancel.v2.data.c) ((tj70) xvf0Var3).get(), (com.yandex.go.taxi.order.cancel.v2.data.b) ((tj70) xvf0Var4).get(), (xj70) ((jc60) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 21:
                return new lo70((wnt) xvf0Var5.get(), i5m.a(xvf0Var), i5m.a((m5v0) xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2));
            case 22:
                return new ru.yandex.taxi.order.k((tse) xvf0Var5.get(), (y180) xvf0Var.get(), (tgx) xvf0Var3.get(), (ahx) xvf0Var4.get(), (ru.yandex.taxi.order.services.a) ((b8w) xvf0Var2).get());
            case 23:
                return new f580((dqe0) xvf0Var5.get(), (arv0) xvf0Var.get(), (xcv0) xvf0Var3.get(), (mb30) xvf0Var4.get(), (ps21) ((q720) xvf0Var2).get());
            case 24:
                return new g980((zuj0) xvf0Var5.get(), (xdf) xvf0Var.get(), (pdc) xvf0Var3.get(), (crg) xvf0Var4.get(), (jom0) ((n0k0) xvf0Var2).get());
            case 25:
                return new vo80((nmx) xvf0Var5.get(), (gcc0) xvf0Var.get(), (cyx) xvf0Var3.get(), (qc20) ((jqz0) xvf0Var4).get(), (avi) xvf0Var2.get());
            case 26:
                return new xus((Context) xvf0Var5.get(), (ysg) xvf0Var.get(), (m2v) ((o10) xvf0Var4).get(), (oxu0) xvf0Var3.get(), (y) xvf0Var2.get(), 3);
            case 27:
                return new dl90((ru.yandex.taxi.profile.a) xvf0Var5.get(), (zuj0) xvf0Var.get(), (g) xvf0Var3.get(), (ddf0) xvf0Var4.get(), (com.yandex.go.account.user_verification.domain.i) ((n0k0) xvf0Var2).get());
            case 28:
                return new ru.yandex.taxi.am.internal.d((ep90) xvf0Var5.get(), (u02) xvf0Var.get(), (k) xvf0Var3.get(), (fgb0) ((qta0) xvf0Var4).get(), (go90) xvf0Var2.get());
            default:
                return new g1a0((zuj0) xvf0Var5.get(), (tma0) ((tj70) xvf0Var4).get(), (pav) xvf0Var.get(), (k7x0) xvf0Var3.get(), (u0a0) ((jc60) xvf0Var2).get());
        }
    }

    public /* synthetic */ axy(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar, int i) {
        this.a = i;
        this.e = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = eqhVar;
    }

    public /* synthetic */ axy(xvf0 xvf0Var, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var2, v7p v7pVar3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.f = v7pVar2;
        this.c = xvf0Var2;
        this.d = v7pVar3;
    }

    public /* synthetic */ axy(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
    }

    public /* synthetic */ axy(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ axy(v7p v7pVar, xvf0 xvf0Var, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.e = v7pVar2;
        this.f = v7pVar3;
        this.d = xvf0Var2;
    }

    public axy(xvf0 xvf0Var, tj70 tj70Var, tj70 tj70Var2, jc60 jc60Var, xvf0 xvf0Var2) {
        this.a = 20;
        this.b = xvf0Var;
        this.d = tj70Var;
        this.e = tj70Var2;
        this.f = jc60Var;
        this.c = xvf0Var2;
    }

    public axy(xvf0 xvf0Var, tj70 tj70Var, xvf0 xvf0Var2, xvf0 xvf0Var3, jc60 jc60Var) {
        this.a = 29;
        this.b = xvf0Var;
        this.e = tj70Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = jc60Var;
    }
}
