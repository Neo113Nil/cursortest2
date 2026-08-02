package defpackage;

import android.content.Context;
import com.yandex.go.navigator.providers.b;
import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.taxi.order.details.v2.state.d;
import com.yandex.go.taxi.order.details.v2.state.elements.companion.icon.a;
import com.yandex.go.taxi.order.map.n;
import com.yandex.go.taxi.order.map.r;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class n7i0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ n7i0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new b((Context) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get());
            case 1:
                return new x9j0((wiq0) xvf0Var2.get(), (maj0) xvf0Var.get());
            case 2:
                return new caj0((tt2) xvf0Var2.get(), (ici) xvf0Var.get());
            case 3:
                return new haj0((tt2) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 4:
                return new o8g0((k0) xvf0Var2.get(), (f580) xvf0Var.get());
            case 5:
                return new qjj0((tt2) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 6:
                return new sxj0((to3) xvf0Var2.get(), (k020) xvf0Var.get());
            case 7:
                return new e7k0((e1g) xvf0Var2.get(), (wev0) xvf0Var.get());
            case 8:
                return new a((tt2) xvf0Var2.get(), (e) xvf0Var.get());
            case 9:
                return new lfk0((xdf) xvf0Var2.get(), (wze0) xvf0Var.get());
            case 10:
                return new pfk0((xdf) xvf0Var2.get(), (rck0) xvf0Var.get());
            case 11:
                return new com.yandex.go.taxi.order.details.v2.state.elements.decorations.b((e) xvf0Var2.get(), (jgv) xvf0Var.get());
            case 12:
                return new yfk0(iwh0.ride_card_complete_value, (Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 13:
                return new zfk0(iwh0.ride_card_initial_value, (Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 14:
                return new agk0((ndk0) xvf0Var2.get(), (ddk0) xvf0Var.get());
            case 15:
                return new com.yandex.go.taxi.order.details.v2.state.elements.pickup_code.a((lbk0) xvf0Var2.get(), (c) xvf0Var.get());
            case 16:
                return new com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector.a((o2y0) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.a) xvf0Var.get());
            case 17:
                return new o8g0((d) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 18:
                return new rpk0((o2y0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 19:
                return new etk0((tt2) xvf0Var2.get(), (o2y0) xvf0Var.get());
            case 20:
                return new r((n) xvf0Var2.get(), (kf00) xvf0Var.get());
            case 21:
                return new t((Context) xvf0Var2.get(), (w030) xvf0Var.get(), 6);
            case 22:
                return new c9l0(i5m.a(xvf0Var), (i130) xvf0Var2.get());
            case 23:
                return new yxf0((re50) xvf0Var2.get(), (lg50) xvf0Var.get());
            case 24:
                return new com.yandex.go.tariffcard.ui.adapter.header.multiclass.c((e) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 25:
                return new com.yandex.go.safety.center.sos.b((SafetyCenterApi) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 26:
                return new mnm0((axm) xvf0Var2.get(), (set0) xvf0Var.get());
            case 27:
                return new com.yandex.go.scooters.passes.active.domain.c((pwy0) xvf0Var2.get(), (lbn0) xvf0Var.get());
            case 28:
                return new com.yandex.go.scooters.misc.attention.domain.c((e) xvf0Var2.get(), (com.yandex.go.scooters.misc.attention.data.e) xvf0Var.get());
            default:
                return ((mjr) xvf0Var2.get()).a(kjr.b, (com.yandex.div.core.expression.variables.a) xvf0Var.get());
        }
    }
}
