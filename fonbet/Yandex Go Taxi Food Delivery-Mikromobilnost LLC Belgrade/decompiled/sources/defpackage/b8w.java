package defpackage;

import android.os.PowerManager;
import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import java.util.Set;
import ru.yandex.taxi.layers.experiments.f;
import ru.yandex.taxi.layers.source.factory.b;
import ru.yandex.taxi.main.map.d;
import ru.yandex.taxi.startup.launch.k;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.widget.c;

/* loaded from: classes.dex */
public final class b8w implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public b8w(t800 t800Var, xvf0 xvf0Var, y2g y2gVar) {
        this.a = 16;
        this.b = xvf0Var;
        this.c = y2gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a8w((j0g) ((b0g) xvf0Var2).get(), (x111) ((x7y0) xvf0Var).get());
            case 1:
                gew x = vvb1.x((klr) ((uq2) xvf0Var2).get(), (hew) ((ziv) xvf0Var).get());
                q5z.i(x);
                return x;
            case 2:
                return new c9v(2, (pj) ((wnw) xvf0Var2).get(), (a) xvf0Var.get());
            case 3:
                return new yrw(i5m.a((i5g) xvf0Var2), i5m.a((i5g) xvf0Var));
            case 4:
                return new ezw((hay0) xvf0Var2.get(), (a5s0) ((wjr0) xvf0Var).get());
            case 5:
                h3y a = i5m.a((ei00) xvf0Var);
                hzk hzkVar = new hzk();
                hzkVar.a = a;
                hzkVar.b = kotlin.a.a(new ppr(17, hzkVar));
                return hzkVar;
            case 6:
                return new tgx((lx4) xvf0Var2.get(), (jc4) ((wnw) xvf0Var).get());
            case 7:
                return new ru.yandex.taxi.order.services.a((PowerManager) xvf0Var2.get(), (s66) ((wnw) xvf0Var).get());
            case 8:
                return new dr7((w030) xvf0Var2.get(), (rqt) xvf0Var, 4);
            case 9:
                return new k((t61) ((oux) xvf0Var2).get(), (mux) xvf0Var.get());
            case 10:
                return new lcz((reu) ((cnt) xvf0Var2).get(), (n) xvf0Var.get());
            case 11:
                return new srz((bhx) xvf0Var2, (com.yandex.go.safety.center.lost_item.data.a) xvf0Var.get());
            case 12:
                return new com.yandex.go.lottie_loader.a((com.yandex.go.lottie_loader.domain.interactors.a) ((bsz) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 13:
                return new com.yandex.go.loyalty.impl.selector.data.a((LoyaltyApi) xvf0Var2.get(), (kqz) xvf0Var);
            case 14:
                return new t000(xvf0Var2, (xcz) xvf0Var);
            case 15:
                return new d((ru.yandex.taxi.experiments.addressttl.a) ((y500) xvf0Var2).get(), (jtq0) xvf0Var.get());
            case 16:
                return new s800((com.yandex.div.core.expression.variables.a) xvf0Var2.get(), (Set) ((y2g) xvf0Var).get(), 0);
            case 17:
                return new com.yandex.go.flex.main_screen.interactors.d(i5m.a((t6i) xvf0Var2), (w9w0) ((a3g) xvf0Var).get());
            case 18:
                return new k900((tt2) xvf0Var2.get(), (qc20) ((z2g) xvf0Var).get());
            case 19:
                ((a3g) xvf0Var2).get();
                return new i2s0((com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 20:
                return new ql00((ah00) xvf0Var2.get(), (rl00) ((y500) xvf0Var).get());
            case 21:
                return new b((pav) ((m2g) xvf0Var2).get(), (c) ((m2g) xvf0Var).get());
            case 22:
                return new ru.yandex.taxi.layers.source.factory.c((Set) ((y2r0) xvf0Var2).get(), (f) ((ayx) xvf0Var).get());
            case 23:
                return new uy00((vy00) ((sp00) xvf0Var2).get(), (dyx) xvf0Var.get());
            case 24:
                return new lz00((ffe) xvf0Var2.get(), (sp00) xvf0Var);
            case 25:
                return new h010((nq2) xvf0Var2, (oep0) xvf0Var.get());
            case 26:
                ((s730) xvf0Var2).get();
                ((on11) xvf0Var).get();
                return new jzz();
            case 27:
                return new m420((hit) xvf0Var2.get(), (vit) ((dt00) xvf0Var).get());
            case 28:
                return new es20((com.yandex.go.ads.mobile_ads_sdk.data.a) xvf0Var2.get(), i5m.a((w7u) xvf0Var));
            default:
                return new ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.a((com.yandex.delivery.utils.storage.impl.b) ((wjr0) xvf0Var2).get(), (st2) xvf0Var.get());
        }
    }

    public /* synthetic */ b8w(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
