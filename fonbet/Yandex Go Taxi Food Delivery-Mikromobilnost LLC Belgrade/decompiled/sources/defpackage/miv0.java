package defpackage;

import android.app.Activity;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.superapp.discovery.map.impl.ui.main.filters.data.SuperAppMapCategoryFiltersStateRepository;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.summary.deeplink.a;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tooltips.repository.b;

/* loaded from: classes14.dex */
public final class miv0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ miv0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static miv0 a(eqh eqhVar) {
        return new miv0(eqhVar, 12);
    }

    public static miv0 b(xvf0 xvf0Var) {
        return new miv0(xvf0Var, 10);
    }

    public static miv0 c(eqh eqhVar) {
        return new miv0(eqhVar, 17);
    }

    public static miv0 d(xvf0 xvf0Var) {
        return new miv0(xvf0Var, 18);
    }

    public static miv0 e(eqh eqhVar) {
        return new miv0(eqhVar, 21);
    }

    public static miv0 f(eqh eqhVar) {
        return new miv0(eqhVar, 29);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new liv0((rqo) xvf0Var.get());
            case 1:
                return new gde(i2, (lx4) xvf0Var.get());
            case 2:
                return new kkv0((akv0) xvf0Var.get());
            case 3:
                return new n3a((rqo) xvf0Var.get(), 11);
            case 4:
                final a aVar = (a) xvf0Var.get();
                return new rqw0() { // from class: pov0
                    @Override // defpackage.rqw0
                    public final void handle(String str) {
                        a aVar2 = a.this;
                        aVar2.getClass();
                        aVar2.a(str, v770.b, SelectionOrigin.DEEPLINK);
                    }
                };
            case 5:
                return new qov0((e) xvf0Var.get());
            case 6:
                return new aqv0((b) xvf0Var.get());
            case 7:
                return new lqv0((zuj0) xvf0Var.get());
            case 8:
                return new wor0((n6w0) xvf0Var.get());
            case 9:
                return new btv0((com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 10:
                return new ayv0((rqo) xvf0Var.get());
            case 11:
                return new dzv0((ezv0) xvf0Var.get());
            case 12:
                return new d0w0((pho) xvf0Var.get());
            case 13:
                return new r4w0((SuperAppMapCategoryFiltersStateRepository) xvf0Var.get());
            case 14:
                return new t6w0((k7x0) xvf0Var.get());
            case 15:
                return new u6w0((k7x0) xvf0Var.get());
            case 16:
                return new f7w0((rqo) xvf0Var.get());
            case 17:
                return new v8w0((pho) xvf0Var.get());
            case 18:
                return new gkt(i2, (com.yandex.go.flex.main_screen.presentation.divkit.azimuth.e) xvf0Var.get());
            case 19:
                c1m0 c1m0Var = (c1m0) xvf0Var.get();
                aaw0 aaw0Var = new aaw0();
                c1m0Var.d(new s5w0(2, aaw0Var));
                return aaw0Var;
            case 20:
                return new iaw0((aaw0) xvf0Var.get());
            case 21:
                return new x770((pho) xvf0Var.get());
            case 22:
                return new l7s0((com.yandex.go.taxi.order.support.data.repositories.a) xvf0Var.get());
            case 23:
                return new vwm((wiq0) xvf0Var.get());
            case 24:
                return new yow0((cj70) xvf0Var.get());
            case 25:
                return new mww0((ru.yandex.taxi.surge.interactor.e) xvf0Var.get());
            case 26:
                return new jhu0((yp2) xvf0Var.get());
            case 27:
                return new tzw0((t) xvf0Var.get());
            case 28:
                return new x1x0((Activity) xvf0Var.get());
            default:
                return new o7r0((pho) xvf0Var.get());
        }
    }
}
