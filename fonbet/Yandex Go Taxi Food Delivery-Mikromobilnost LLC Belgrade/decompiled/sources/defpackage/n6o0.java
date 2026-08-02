package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.payments.superapp.payment.b;
import com.yandex.go.scooters.payments.data.c;
import com.yandex.go.scooters.promocodes.data.ScootersPromocodesApi;
import com.yandex.go.scooters.promocodes.data.e;
import com.yandex.go.superapp.searchbar.impl.ui.scroll_up.ScrollUpButtonView;
import ru.yandex.taxi.layers.experiments.p;
import ru.yandex.taxi.scooters.utils.timers.h;
import ru.yandex.taxi.sdc.route.repository.a;

/* loaded from: classes9.dex */
public final class n6o0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ n6o0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new sin0((n5o0) xvf0Var.get());
            case 1:
                return new ngo0((b) xvf0Var.get());
            case 2:
                return new c((ngo0) xvf0Var.get());
            case 3:
                return new ugo0((k0b0) xvf0Var.get());
            case 4:
                return new s66((rqo) xvf0Var.get(), 10);
            case 5:
                return new tko0((Context) xvf0Var.get());
            case 6:
                return new sin0((n5o0) xvf0Var.get());
            case 7:
                return new j19((wnt) xvf0Var.get());
            case 8:
                ScootersPromocodesApi b = a4b1.b((on2) xvf0Var.get());
                q5z.i(b);
                return b;
            case 9:
                return new e((rqo) xvf0Var.get());
            case 10:
                return new qwo0((dne0) xvf0Var.get());
            case 11:
                return new h((tse) xvf0Var.get());
            case 12:
                return new x770((pho) xvf0Var.get());
            case 13:
                return new f6p0(i5m.a(xvf0Var));
            case 14:
                return new k8p0((rqo) xvf0Var.get());
            case 15:
                return new co40((pho) xvf0Var.get());
            case 16:
                return new com.yandex.go.scooters.zones.legend.ui.b((ru.yandex.taxi.widget.utils.e) xvf0Var.get());
            case 17:
                return y4b1.b((Activity) xvf0Var.get());
            case 18:
                return new p((rqo) xvf0Var.get());
            case 19:
                return new yo40((rqo) xvf0Var.get());
            case 20:
                return new rfp0((Context) xvf0Var.get());
            case 21:
                return new cgp0((pho) xvf0Var.get());
            case 22:
                return new dgp0((ru.yandex.taxi.superapp.shortcuts.b) xvf0Var.get());
            case 23:
                return new ogp0((dne0) xvf0Var.get());
            case 24:
                return new co40((pho) xvf0Var.get());
            case 25:
                return new ScrollUpButtonView((Context) xvf0Var.get());
            case 26:
                return new com.yandex.go.places.searchbar.impl.ui.scroll_up.ScrollUpButtonView((Context) xvf0Var.get());
            case 27:
                return new ulp0((dne0) xvf0Var.get());
            case 28:
                return new a((on2) xvf0Var.get());
            default:
                return new o370((y50) xvf0Var.get());
        }
    }
}
