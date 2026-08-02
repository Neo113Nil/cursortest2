package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.domain.interactor.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.order.network.c;
import com.yandex.go.taxi.order.network.d;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.lack_of_order.domain.l;
import com.yandex.go.zone.repository.r;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.communications.common.repository.a;
import ru.yandex.taxi.communications.data.b;
import ru.yandex.taxi.jobs.push.j;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.net.taxi.TaxiApi;
import ru.yandex.taxi.requirements.interactor.j0;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.superapp.f;
import ru.yandex.taxi.widgets.data.repository.t;

/* loaded from: classes8.dex */
public final class dqx0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ dqx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new f28(xvf0Var3.get(), xvf0Var2.get(), (w030) xvf0Var4.get(), (Object) this.e, 15);
            case 1:
                return new a((on2) xvf0Var4.get(), (sa7) xvf0Var3.get(), (r) xvf0Var2.get(), (b) xvf0Var.get());
            case 2:
                return new p((Context) xvf0Var4.get(), i5m.a(xvf0Var3), (fva0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 3:
                return new c((TaxiApi) xvf0Var4.get(), (g6y0) xvf0Var3.get(), (p2y0) xvf0Var2.get(), (h) xvf0Var.get());
            case 4:
                return new com.yandex.go.taxi.order.deeplink.a((com.yandex.go.taxi.order.multi.a) xvf0Var4.get(), xvf0Var3, (com.yandex.go.taxi.order.deeplink.b) xvf0Var2.get(), i5m.a(xvf0Var));
            case 5:
                return new d((TaxiApi) xvf0Var4.get(), (iu70) xvf0Var3.get(), (wnt) xvf0Var2.get(), (g6y0) xvf0Var.get());
            case 6:
                return new l((u) xvf0Var4.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var3.get(), (g) xvf0Var2.get(), i5m.a(xvf0Var));
            case 7:
                return new y5y0((Context) xvf0Var4.get(), (Lifecycle) xvf0Var3.get(), xvf0Var2, i5m.a(xvf0Var));
            case 8:
                return new com.yandex.go.taxi.order.net.xiva.d((tse) xvf0Var4.get(), (com.yandex.go.taxi_order.ws.d) xvf0Var3.get(), (p2y0) xvf0Var2.get(), (dw41) xvf0Var.get());
            case 9:
                return new gay0((cda0) xvf0Var4.get(), (fga0) xvf0Var3.get(), (ycq0) xvf0Var2.get(), (lw90) xvf0Var.get());
            case 10:
                return new tgz0((zuj0) xvf0Var4.get(), (ine0) xvf0Var3.get(), (vze0) xvf0Var2.get(), (xdf) xvf0Var.get());
            case 11:
                return new a301((c151) xvf0Var4.get(), (s55) xvf0Var3.get(), (n17) xvf0Var2.get(), (sw00) xvf0Var.get());
            case 12:
                return new com.yandex.go.flex.main_screen.data.widgets.tracking.c((Lifecycle) xvf0Var4.get(), (tse) xvf0Var3.get(), (j551) xvf0Var2.get(), (com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 13:
                return new com.yandex.go.loyalty.impl.common.lcp.a((tse) xvf0Var4.get(), (tt2) xvf0Var3.get(), (n20) xvf0Var2.get(), (zvz) xvf0Var.get());
            case 14:
                return new j0((w3r0) xvf0Var4.get(), (tt2) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (tse) xvf0Var.get());
            case 15:
                return new com.yandex.go.data.repositories.a((d9v) xvf0Var4.get(), (tt2) xvf0Var3.get(), (vtx0) xvf0Var2.get(), (rq21) xvf0Var.get());
            case 16:
                return new com.yandex.go.deeplink.a(xvf0Var4, (fx60) xvf0Var3.get(), (wq21) xvf0Var2.get(), (eq21) xvf0Var.get());
            case 17:
                return new e((tse) xvf0Var4.get(), xvf0Var3, (oep0) xvf0Var2.get(), (fr21) xvf0Var.get());
            case 18:
                return new pb31((bk31) xvf0Var4.get(), (im4) xvf0Var3.get(), (q) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 19:
                return new com.yandex.go.walking.navigation.impl.a((p) xvf0Var4.get(), xvf0Var3, (xes0) xvf0Var2.get(), (ra00) xvf0Var.get());
            case 20:
                return new c441((tse) xvf0Var4.get(), (com.yandex.go.walking.navigation.impl.location_mock.simulator.a) xvf0Var3.get(), (e441) xvf0Var2.get(), (a341) xvf0Var.get());
            case 21:
                return new q541((tse) xvf0Var4.get(), (y141) xvf0Var3.get(), (com.yandex.go.walking.navigation.impl.navigation_core.b) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.cashback.push.a((wnt) xvf0Var4.get(), (rqo) xvf0Var3.get(), (cda0) xvf0Var2.get(), (h9y0) xvf0Var.get());
            case 23:
                return new com.yandex.go.wallet.data.a((tt2) xvf0Var4.get(), (ajr) xvf0Var3.get(), (Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 24:
                return new ofa0((Context) xvf0Var4.get(), (cd00) xvf0Var3.get(), (vc00) xvf0Var2.get(), (l3w0) xvf0Var.get());
            case 25:
                return new com.yandex.go.wallet.divkit.a(i5m.a(xvf0Var4), i5m.a(xvf0Var3), (tt2) xvf0Var2.get(), (c941) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.web.deeplink.a((ru.yandex.taxi.am.token.a) xvf0Var4.get(), (o) xvf0Var3.get(), (f) xvf0Var2.get(), (fn21) xvf0Var.get());
            case 27:
                return new j551((tt2) xvf0Var4.get(), (xvr0) xvf0Var3.get(), (t) xvf0Var2.get(), (ru.yandex.taxi.widgets.data.repository.widget_models.c) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.jobs.e((as21) xvf0Var4.get(), (j) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ru.yandex.taxi.jobs.b) xvf0Var.get());
            default:
                return new com.yandex.go.xiva.data.a((on2) xvf0Var4.get(), (nq20) xvf0Var3.get(), (fn21) xvf0Var2.get(), (ge51) xvf0Var.get());
        }
    }
}
