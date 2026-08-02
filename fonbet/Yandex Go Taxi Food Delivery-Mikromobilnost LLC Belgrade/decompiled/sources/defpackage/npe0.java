package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import com.yandex.go.external_service.preloader.a;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import com.yandex.go.scooters.domain.i0;
import com.yandex.go.scooters.promocodes.data.f;
import com.yandex.go.taxi.order.promotions.notification.ui.b;
import com.yandex.go.taxi.tariffs.repository.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.network.Api;
import ru.yandex.taxi.domain.s0;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes.dex */
public final class npe0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public npe0(l3e l3eVar, xvf0 xvf0Var, kxa0 kxa0Var) {
        this.a = 10;
        this.c = l3eVar;
        this.b = xvf0Var;
        this.d = kxa0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new a((tt2) xvf0Var2.get(), (hit) xvf0Var3.get(), i5m.a((w7u) xvf0Var));
            case 1:
                return new ere0((ycq0) xvf0Var3.get(), (i) xvf0Var2.get(), (xma0) ((gga0) xvf0Var).get());
            case 2:
                return new idf0(i5m.a((i5g) xvf0Var3), i5m.a((u5g) xvf0Var2), i5m.a((u5g) xvf0Var));
            case 3:
                return new kdf0((Looper) xvf0Var3.get(), (xwc) ((if9) xvf0Var).get(), (wff0) xvf0Var2.get());
            case 4:
                return new rgf0((s0) ((u5g) xvf0Var3).get(), (tse) ((u5g) xvf0Var2).get(), (tt2) ((i5g) xvf0Var).get());
            case 5:
                return new d((c) xvf0Var3.get(), (com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c) xvf0Var2.get(), (gno0) ((n6o0) xvf0Var).get());
            case 6:
                return new ru.yandex.taxi.main_screen_custom.domain.a((Context) xvf0Var3.get(), (ru.yandex.taxi.utils.d) ((y1u) xvf0Var).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get());
            case 7:
                return new qdx((Context) xvf0Var3.get(), (a3v) xvf0Var2.get(), (x3s) xvf0Var);
            case 8:
                return new b((Context) xvf0Var3.get(), (com.yandex.go.taxi.order.promotions.notification.ui.a) ((x4) xvf0Var).get(), (tt2) xvf0Var2.get());
            case 9:
                return new v2g0((v7j) ((eqf0) xvf0Var).get(), (q3g0) xvf0Var3.get(), (jae0) xvf0Var2.get());
            case 10:
                return new hhg0((v7n) ((l3e) xvf0Var2).get(), (zgg0) xvf0Var3.get(), (com.yandex.go.quark.impl.data.b) ((kxa0) xvf0Var).get());
            case 11:
                return new jni0((u8w) ((kqz) xvf0Var).get(), (xcv0) xvf0Var3.get(), (arv0) xvf0Var2.get());
            case 12:
                return new com.ybsdk.common.repositiories.balance.a((Context) xvf0Var3.get(), (w530) ((fpp0) xvf0Var).get(), (Api) xvf0Var2.get());
            case 13:
                return new ijj0((g) xvf0Var3.get(), (cq40) xvf0Var2.get(), (hct) ((qsn) xvf0Var).get());
            case 14:
                return new rrj0((tvw) ((vw2) xvf0Var).get(), (dqe0) xvf0Var3.get(), i5m.a(xvf0Var2));
            case 15:
                return new ej1(15, (i130) xvf0Var3.get(), (s6k0) ((n0k0) xvf0Var).get(), (y4k0) xvf0Var2.get());
            case 16:
                return new odl0((i130) xvf0Var3.get(), (ycl0) xvf0Var2.get(), (xj) xvf0Var);
            case 17:
                return new jxl0((n4j0) xvf0Var2, (kxl0) xvf0Var, (rq21) xvf0Var3.get());
            case 18:
                return new ru.yandex.taxi.notification.a((Context) xvf0Var3.get(), (tj60) xvf0Var2.get(), (d6i) ((p7r0) xvf0Var).get());
            case 19:
                return new dfm0((lx4) xvf0Var3.get(), (g9a0) xvf0Var2.get(), (t61) ((ggl0) xvf0Var).get());
            case 20:
                return new ru.yandex.taxi.scheduleride.deeplink.a((nnm0) xvf0Var3.get(), (fx60) xvf0Var2.get(), (lnm0) ((lwl0) xvf0Var).get());
            case 21:
                return new h6o0((ma1) xvf0Var3.get(), (lx4) xvf0Var2.get(), (u8w) ((bwn0) xvf0Var).get());
            case 22:
                return new f((com.yandex.go.scooters.promocodes.data.mapper.a) ((lwl0) xvf0Var3).get(), (j19) ((n6o0) xvf0Var2).get(), (com.yandex.go.scooters.promocodes.data.g) ((z4k0) xvf0Var).get());
            case 23:
                return new q((zuj0) xvf0Var3.get(), (pw2) xvf0Var2.get(), (k8p0) ((n6o0) xvf0Var).get());
            case 24:
                return new i0((tse) xvf0Var3.get(), (r) ((z4k0) xvf0Var).get(), (com.yandex.go.scooters.domain.a) xvf0Var2.get());
            case 25:
                return ((lqo) xvf0Var3.get()).a(tz10.P) ? (xjh) i5m.a((jwx0) xvf0Var2).get() : (xjh) i5m.a((gk10) xvf0Var).get();
            case 26:
                return new pep0((ComponentActivity) xvf0Var3.get(), (nfh) ((gm) xvf0Var).get(), i5m.a(xvf0Var2));
            case 27:
                return new qyd0((com.ybsdk.rconfig.b) xvf0Var3.get(), (o370) ((xyd0) xvf0Var).get(), (AppAnalyticsReporter) xvf0Var2.get());
            case 28:
                return new ru.yandex.taxi.cashback.router.f((tse) xvf0Var3.get(), i5m.a(xvf0Var2), (ru.yandex.taxi.cashback.international.c) ((gga0) xvf0Var).get());
            default:
                return new rtp0((wiq0) xvf0Var3.get(), (qbl0) xvf0Var2.get(), (com.yandex.go.taxi.order.state.search.b) ((swo0) xvf0Var).get());
        }
    }

    public /* synthetic */ npe0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.c = xvf0Var2;
    }

    public /* synthetic */ npe0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ npe0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.d = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public npe0(n4j0 n4j0Var, kxl0 kxl0Var, xvf0 xvf0Var) {
        this.a = 17;
        this.c = n4j0Var;
        this.d = kxl0Var;
        this.b = xvf0Var;
    }

    public npe0(epp0 epp0Var, xvf0 xvf0Var, xyd0 xyd0Var, xvf0 xvf0Var2) {
        this.a = 27;
        this.b = xvf0Var;
        this.d = xyd0Var;
        this.c = xvf0Var2;
    }

    public npe0(xdp0 xdp0Var, h420 h420Var, jwx0 jwx0Var, gk10 gk10Var) {
        this.a = 25;
        this.b = h420Var;
        this.c = jwx0Var;
        this.d = gk10Var;
    }
}
