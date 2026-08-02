package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.flex.common.ui.theme.f;
import com.yandex.go.order.ui.card.linked.a;
import com.yandex.go.route.interactor.b;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.taxi.order.domain.interactors.s;
import com.yandex.go.timer.k;
import com.yandex.go.timer.l;
import ru.yandex.taxi.layers.api.TrackerApi;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class jwx0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ jwx0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new iwx0((c) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 1:
                return new s((g8h) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 2:
                return new q0y0(i5m.a(xvf0Var2), (hq70) xvf0Var.get());
            case 3:
                return new u0y0((y72) xvf0Var2.get(), (vq70) xvf0Var.get());
            case 4:
                return new k1y0((h) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 5:
                return new u7y0((dm21) xvf0Var2.get(), (wuz) xvf0Var.get());
            case 6:
                return new l9y0((lx4) xvf0Var2.get(), (ma1) xvf0Var.get());
            case 7:
                return new y9y0((com.yandex.go.route.interactor.c) xvf0Var2.get(), (b) xvf0Var.get());
            case 8:
                return new hay0((e2t) xvf0Var2.get(), (j2t) xvf0Var.get());
            case 9:
                return new a((zuj0) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 10:
                SharedPreferences sharedPreferences = (SharedPreferences) xvf0Var2.get();
                return new xcy0(sharedPreferences);
            case 11:
                return new poy0((by00) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 12:
                return new f((tse) xvf0Var2.get(), (yqq) xvf0Var.get());
            case 13:
                return new dwy0((Context) xvf0Var2.get(), (rz10) xvf0Var.get());
            case 14:
                return new jxy0((mxy0) xvf0Var2.get(), (dbv) xvf0Var.get());
            case 15:
                return new rfw0((oep0) xvf0Var2.get(), xvf0Var);
            case 16:
                return new rm5((zuj0) xvf0Var2.get(), (c4z0) xvf0Var.get());
            case 17:
                return new a8z0((gtk) xvf0Var2.get(), (wa90) xvf0Var.get());
            case 18:
                return new k((zuj0) xvf0Var2.get(), (l) xvf0Var.get());
            case 19:
                return new l((jtq0) xvf0Var2.get(), (tse) xvf0Var.get());
            case 20:
                return new ii3((w030) xvf0Var2.get(), (tfz0) xvf0Var.get(), 2);
            case 21:
                return new ru.yandex.taxi.notifications.tips.b((Application) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 22:
                return new lgz0((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 23:
                return new qgz0((jaa0) xvf0Var2.get(), (fga0) xvf0Var.get());
            case 24:
                return new yhz0((Context) xvf0Var2.get(), i5m.a(xvf0Var));
            case 25:
                return new c2n0((Activity) xvf0Var2.get(), (nf7) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.layers.domain.links.a((TrackerApi) xvf0Var2.get(), (d001) xvf0Var.get());
            case 27:
                return new d001((tt2) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 28:
                return new com.yandex.go.superapp.tracking.domain.f((pdc) xvf0Var2.get(), (y) xvf0Var.get());
            default:
                return new h601((umx) xvf0Var2.get(), (y) xvf0Var.get());
        }
    }
}
