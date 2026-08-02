package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.driving.c0;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.z;
import com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.d;
import com.yandex.go.taxi.summary.shared.lifecycle.a;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.surge.interactor.s;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class fat0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ fat0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new hhs0(5, (mbt0) xvf0Var2.get(), (cbt0) xvf0Var.get());
            case 1:
                return new xet0((bk4) xvf0Var2.get(), (mkv0) xvf0Var.get());
            case 2:
                return new d800((ufb0) xvf0Var2.get(), (i130) xvf0Var.get(), 1);
            case 3:
                return new ght0((pd61) xvf0Var2.get(), (jjt0) xvf0Var.get());
            case 4:
                return new pit0((cg5) xvf0Var2.get(), (rf5) xvf0Var.get());
            case 5:
                return new zxs0((wiq0) xvf0Var2.get(), (cwb) xvf0Var.get());
            case 6:
                return new c0((o) xvf0Var2.get(), (t) xvf0Var.get());
            case 7:
                return new ewt0((Context) xvf0Var2.get(), (b) xvf0Var.get());
            case 8:
                return new lcv0((xcv0) xvf0Var2.get(), (arv0) xvf0Var.get());
            case 9:
                return new fgv0((kgl0) xvf0Var2.get(), (vfv0) xvf0Var.get());
            case 10:
                return new akv0((c) xvf0Var2.get(), (a) xvf0Var.get());
            case 11:
                return new imv0((tt2) xvf0Var2.get(), (e) xvf0Var.get());
            case 12:
                return new fov0((wiq0) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 13:
                return new z((usd0) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 14:
                return new com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.c((d) xvf0Var2.get(), (stv0) xvf0Var.get());
            case 15:
                return new zxs0((s) xvf0Var2.get(), (vpw0) xvf0Var.get());
            case 16:
                return new s2x0((Context) xvf0Var2.get(), (cce) xvf0Var.get());
            case 17:
                return new tbx0((xcv0) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 18:
                return new hhs0(22, (mqv0) xvf0Var2.get(), (as21) xvf0Var.get());
            case 19:
                return new com.yandex.go.taxi.summary.shared.expanded.repository.c((ck31) xvf0Var2.get(), (b8r) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.summary.requirements.list.mapper.b((k7x0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 21:
                return new dpx0((Context) xvf0Var2.get(), (ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a) xvf0Var.get());
            case 22:
                return new v2y0(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 23:
                return new zxs0((Context) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 24:
                return new c7y0((y980) xvf0Var2.get(), (h760) xvf0Var.get());
            case 25:
                return oey0.a;
            case 26:
                return new jwy0((rz10) xvf0Var2.get(), (dwy0) xvf0Var.get());
            case 27:
                return new gzy0((at2) xvf0Var2.get(), (x22) xvf0Var.get());
            case 28:
                return new aaz0((Context) xvf0Var2.get(), (qbz0) xvf0Var.get());
            default:
                return new z9z0((Activity) xvf0Var2.get(), (aaz0) xvf0Var.get());
        }
    }
}
