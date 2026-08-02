package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.domain.a0;
import com.yandex.go.scooters.domain.h0;
import com.yandex.go.superapp.unified_polling.k;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.repository.r;
import com.yandex.passport.data.network.e9;
import com.yandex.passport.data.network.ea;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.reporters.j;
import com.yandex.passport.internal.usecase.ui.x;
import com.ybsdk.common.repositiories.payment.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.network.Api;
import com.ybsdk.network.UzApi;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.personalstate.data.local.a;
import ru.yandex.taxi.personalstate.domain.interactor.i;
import ru.yandex.taxi.scooters.data.l;
import ru.yandex.taxi.scooters.data.y;
import ru.yandex.taxi.scooters.domain.e;
import ru.yandex.taxi.web.deeplink.m;

/* loaded from: classes8.dex */
public final class n4j0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final xvf0 h;
    public final v7p i;

    public n4j0(h420 h420Var, xvf0 xvf0Var, l20 l20Var, xvf0 xvf0Var2, vrt0 vrt0Var, xvf0 xvf0Var3, h420 h420Var2, jc60 jc60Var) {
        this.a = 9;
        this.b = h420Var;
        this.c = xvf0Var;
        this.d = l20Var;
        this.e = xvf0Var2;
        this.i = vrt0Var;
        this.f = xvf0Var3;
        this.g = h420Var2;
        this.h = jc60Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v7p v7pVar = this.i;
        xvf0 xvf0Var = this.h;
        yvf0 yvf0Var = this.g;
        yvf0 yvf0Var2 = this.f;
        yvf0 yvf0Var3 = this.e;
        yvf0 yvf0Var4 = this.d;
        yvf0 yvf0Var5 = this.c;
        yvf0 yvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new b((Context) ((xvf0) yvf0Var6).get(), (Api) ((xvf0) yvf0Var5).get(), (UzApi) ((xvf0) yvf0Var4).get(), (AppAnalyticsReporter) ((xvf0) yvf0Var3).get(), (nbp0) ((xvf0) yvf0Var2).get(), (com.ybsdk.utils.poller.b) ((u800) v7pVar).get(), (com.ybsdk.rconfig.b) ((xvf0) yvf0Var).get(), (w530) xvf0Var.get());
            case 1:
                return new i((hit) ((xvf0) yvf0Var6).get(), (tt2) ((xvf0) yvf0Var5).get(), (c) ((xvf0) yvf0Var4).get(), (ru.yandex.taxi.personalstate.data.remote.b) ((xkw) v7pVar).get(), (a) ((xvf0) yvf0Var3).get(), (ck31) ((xvf0) yvf0Var2).get(), (g) ((xvf0) yvf0Var).get(), (k6b0) xvf0Var.get());
            case 2:
                return new com.yandex.go.beginners.safety.photo.main.c((Context) ((xvf0) yvf0Var6).get(), (w030) ((xvf0) yvf0Var5).get(), (epl0) ((xvf0) yvf0Var4).get(), (ji3) yvf0Var, (com.yandex.go.beginners.safety.photo.main.ui.c) ((gwb0) xvf0Var).get(), (com.yandex.go.beginners.safety.photo.domain.a) ((e8b0) v7pVar).get(), (fjb0) ((xvf0) yvf0Var3).get(), (gjb0) ((xvf0) yvf0Var2).get());
            case 3:
                return new ru.yandex.taxi.scooters.domain.b((zuj0) ((xvf0) yvf0Var6).get(), (ru.yandex.taxi.scooters.data.mapper.c) ((xvf0) yvf0Var5).get(), (ru.yandex.taxi.scooters.data.b) ((xvf0) yvf0Var4).get(), (ukn0) ((xvf0) yvf0Var3).get(), (l) ((xvf0) yvf0Var2).get(), (e) ((xvf0) yvf0Var).get(), (bbn0) xvf0Var.get(), (y) ((lwl0) v7pVar).get());
            case 4:
                return new com.yandex.go.scooters.misc.support.b((w030) ((xvf0) yvf0Var6).get(), (fva0) ((xvf0) yvf0Var5).get(), (an41) ((xvf0) yvf0Var4).get(), (ukn0) ((xvf0) yvf0Var3).get(), (xvf0) yvf0Var2, (MapNotificationsMuteRepository) ((xvf0) yvf0Var).get(), (q2p0) ((n3w) xvf0Var).a, (com.yandex.go.scooters.misc.support.c) ((rsn0) v7pVar).get());
            case 5:
                return new a0((tse) ((xvf0) yvf0Var6).get(), (tt2) ((xvf0) yvf0Var5).get(), (ukn0) ((xvf0) yvf0Var4).get(), (com.yandex.go.scooters.domain.a) ((xvf0) yvf0Var3).get(), (com.yandex.go.scooters.live.domain.b) ((xvf0) yvf0Var2).get(), (iy11) ((xvf0) yvf0Var).get(), (e) ((n0k0) v7pVar).get(), (h0) xvf0Var.get());
            case 6:
                return new fwq0((jgv) ((xvf0) yvf0Var6).get(), (cti) ((xvf0) yvf0Var5).get(), (sze0) ((xyd0) v7pVar).get(), (pdc) ((xvf0) yvf0Var4).get(), (bco) ((xvf0) yvf0Var3).get(), (yp2) ((xvf0) yvf0Var2).get(), (pmw0) ((xvf0) yvf0Var).get(), (xdf) xvf0Var.get());
            case 7:
                return new w040((Context) ((xvf0) yvf0Var6).get(), (tt2) ((xvf0) yvf0Var5).get(), (irs0) ((xvf0) yvf0Var4).get(), (jgv) ((xvf0) yvf0Var3).get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) yvf0Var2).get(), (bts0) ((i5s0) v7pVar).get(), (pwy0) ((xvf0) yvf0Var).get(), (pho) xvf0Var.get());
            case 8:
                return new com.yandex.go.preorder.suggested.menu.router.a((w030) ((xvf0) yvf0Var6).get(), (q6v0) ((xvf0) yvf0Var5).get(), (z6v0) ((xvf0) yvf0Var4).get(), (oep0) ((xvf0) yvf0Var3).get(), (c6v0) ((xvf0) yvf0Var2).get(), (vd) yvf0Var, (com.yandex.go.preorder.suggested.menu.ui.c) ((rxm0) xvf0Var).get(), (ze0) ((e6v0) v7pVar).get());
            case 9:
                return new piv0((Context) ((xvf0) yvf0Var6).get(), (wff0) ((xvf0) yvf0Var5).get(), (w220) ((xvf0) yvf0Var4).get(), (vjv0) ((xvf0) yvf0Var3).get(), (abe) ((vrt0) v7pVar).get(), (x22) ((xvf0) yvf0Var2).get(), (z120) ((xvf0) yvf0Var).get(), (wi60) xvf0Var.get());
            case 10:
                return new lfw0((ogw0) ((n3w) yvf0Var4).a, (gfw0) ((xvf0) yvf0Var6).get(), (u7r) ((p9p) yvf0Var3).get(), (mfw0) ((oag) yvf0Var2).get(), (tse) ((n3w) yvf0Var).a, (pwy0) ((oag) xvf0Var).get(), (swp0) ((xvf0) yvf0Var5).get(), (f8v0) ((n3w) v7pVar).a);
            case 11:
                return new n((tse) ((xvf0) yvf0Var6).get(), (Lifecycle) ((xvf0) yvf0Var5).get(), (tt2) ((xvf0) yvf0Var4).get(), (ru.yandex.taxi.am.g) ((xvf0) yvf0Var3).get(), (bux0) ((xvf0) yvf0Var2).get(), (o) ((xvf0) yvf0Var).get(), (ji3) xvf0Var, i5m.a((vve) v7pVar));
            case 12:
                return new com.yandex.go.taxi.order.listener.b((Lifecycle) ((xvf0) yvf0Var6).get(), (tse) ((xvf0) yvf0Var5).get(), (com.yandex.go.taxi.order.y) ((xvf0) yvf0Var4).get(), i5m.a((jc60) v7pVar), (xvf0) yvf0Var3, (ra00) ((xvf0) yvf0Var2).get(), (com.yandex.go.taxi.order.interactors.a) ((xvf0) yvf0Var).get(), (l3w0) xvf0Var.get());
            case 13:
                return new k((tse) ((xvf0) yvf0Var6).get(), (tt2) ((xvf0) yvf0Var5).get(), i5m.a((xvf0) yvf0Var4), i5m.a((xvf0) yvf0Var3), i5m.a((xvf0) yvf0Var2), i5m.a((xvf0) yvf0Var), i5m.a(xvf0Var), i5m.a((d701) v7pVar));
            case 14:
                return new yx1((gk31) ((xvf0) yvf0Var6).get(), (xjx0) ((xvf0) yvf0Var5).get(), (uer) ((xvf0) yvf0Var4).get(), (fb31) ((xvf0) yvf0Var3).get(), (ck31) ((xvf0) yvf0Var2).get(), (ye31) ((xvf0) yvf0Var).get(), (q) xvf0Var.get(), (au50) ((dt00) v7pVar).get());
            case 15:
                return new m((tse) ((xvf0) yvf0Var6).get(), (gf41) ((xvf0) yvf0Var5).get(), (ru.yandex.taxi.am.token.a) ((xvf0) yvf0Var4).get(), (ru.yandex.taxi.web.deeplink.b) ((xvf0) yvf0Var3).get(), (gq41) ((xvf0) yvf0Var2).get(), (xvf0) yvf0Var, (ru.yandex.taxi.web.deeplink.i) xvf0Var.get(), (o9p) ((t6i) v7pVar).get());
            case 16:
                return new r((on2) ((xvf0) yvf0Var6).get(), (c) ((xvf0) yvf0Var5).get(), (tt2) ((xvf0) yvf0Var4).get(), (ae61) ((xvf0) yvf0Var3).get(), (dne0) ((xvf0) yvf0Var2).get(), (ed61) ((xvf0) yvf0Var).get(), (fd61) xvf0Var.get(), (com.yandex.go.zone.repository.l) ((fq21) v7pVar).get());
            default:
                return new com.yandex.passport.internal.autologin.g((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.internal.storage.i) yvf0Var5.get(), (p) yvf0Var4.get(), (j) yvf0Var3.get(), (com.yandex.passport.internal.usecase.h0) yvf0Var2.get(), (com.yandex.passport.internal.autologin.k) yvf0Var.get(), (com.yandex.passport.internal.usecase.ui.g) ((ea) xvf0Var).get(), (x) ((e9) v7pVar).get());
        }
    }

    public /* synthetic */ n4j0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.i = v7pVar;
        this.g = xvf0Var6;
        this.h = v7pVar2;
    }

    public /* synthetic */ n4j0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, xvf0 xvf0Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = xvf0Var;
        this.i = v7pVar;
    }

    public /* synthetic */ n4j0(int i, eqh eqhVar, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.i = v7pVar;
        this.e = v7pVar2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
    }

    public n4j0(rqt rqtVar, qii qiiVar, xyd0 xyd0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 6;
        this.b = rqtVar;
        this.c = qiiVar;
        this.i = xyd0Var;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
    }

    public n4j0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n0k0 n0k0Var, e8b0 e8b0Var, xvf0 xvf0Var4, n0k0 n0k0Var2, z4k0 z4k0Var) {
        this.a = 5;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = n0k0Var;
        this.f = e8b0Var;
        this.g = xvf0Var4;
        this.i = n0k0Var2;
        this.h = z4k0Var;
    }

    public n4j0(n3w n3wVar, xvf0 xvf0Var, p9p p9pVar, oag oagVar, n3w n3wVar2, oag oagVar2, xvf0 xvf0Var2, n3w n3wVar3) {
        this.a = 10;
        this.d = n3wVar;
        this.b = xvf0Var;
        this.e = p9pVar;
        this.f = oagVar;
        this.g = n3wVar2;
        this.h = oagVar2;
        this.c = xvf0Var2;
        this.i = n3wVar3;
    }

    public n4j0(xvf0 xvf0Var, eqh eqhVar, ggl0 ggl0Var, ji3 ji3Var, gwb0 gwb0Var, e8b0 e8b0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 2;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = ggl0Var;
        this.g = ji3Var;
        this.h = gwb0Var;
        this.i = e8b0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
    }
}
