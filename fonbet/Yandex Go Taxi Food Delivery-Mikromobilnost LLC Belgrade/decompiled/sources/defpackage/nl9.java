package defpackage;

import com.yandex.go.benefits_center.benefits.sdk.actions.b;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.dvizh_subscription.data.ChargersDvizhSubscriptionUrlApi;
import com.yandex.go.chargers.order.data.ChargersActiveOrdersApi;
import com.yandex.go.chargers.payments.data.a;
import com.yandex.go.clarify_address.ClarifiedAddressCacheTimeExperiment;
import com.yandex.go.copter.city_tour.api.CityToursApi;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.checkin.d;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes.dex */
public final class nl9 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ nl9(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ml9((e) xvf0Var.get());
            case 1:
                return new em9((pho) xvf0Var.get());
            case 2:
                return new x3i(i2, (c) xvf0Var.get());
            case 3:
                return new vit(10, (a) xvf0Var.get());
            case 4:
                ChargersDvizhSubscriptionUrlApi e = thb1.e((on2) xvf0Var.get());
                q5z.i(e);
                return e;
            case 5:
                return new g((rqo) xvf0Var.get());
            case 6:
                return new y2a(xvf0Var);
            case 7:
                return new z2a((rqo) xvf0Var.get());
            case 8:
                ChargersActiveOrdersApi b = xhb1.b((on2) xvf0Var.get());
                q5z.i(b);
                return b;
            case 9:
                xhb1.c((on2) xvf0Var.get());
                q5z.i(null);
                throw null;
            case 10:
                return new com.yandex.go.chargers.multiorder.domain.a((ru.yandex.taxi.widget.c) xvf0Var.get());
            case 11:
                return new o6a((p6a) xvf0Var.get());
            case 12:
                return new jma((rqo) xvf0Var.get());
            case 13:
                return new ysa((dne0) xvf0Var.get());
            case 14:
                return new dy6((rqo) xvf0Var.get(), 1);
            case 15:
                return new com.yandex.go.charity.js.a((sh41) xvf0Var.get());
            case 16:
                return new yfa((com.yandex.go.charity.repository.a) xvf0Var.get());
            case 17:
                return new m3b((kse) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.checkin.a((d) xvf0Var.get());
            case 19:
                return new igb((i) xvf0Var.get());
            case 20:
                return new kgb((x780) xvf0Var.get());
            case 21:
                return new fob((pho) xvf0Var.get());
            case 22:
                return new dwb((com.yandex.go.route.interactor.c) xvf0Var.get());
            case 23:
                return new o61((pho) xvf0Var.get());
            case 24:
                CityToursApi a = jwb.a((on2) xvf0Var.get());
                q5z.i(a);
                return a;
            case 25:
                return new twb(xvf0Var);
            case 26:
                return new com.yandex.go.benefits_center.benefits.sdk.descriptors.a((b) xvf0Var.get(), 1);
            case 27:
                rqo rqoVar = (rqo) xvf0Var.get();
                com.yandex.go.clarify_address.c cVar = new com.yandex.go.clarify_address.c();
                ClarifiedAddressCacheTimeExperiment.Companion.getClass();
                cVar.a = ((jbh) rqoVar).e(ClarifiedAddressCacheTimeExperiment.e);
                return cVar;
            case 28:
                return new mxb((com.yandex.go.navigation.screen.c) xvf0Var.get());
            default:
                return new ayb((pho) xvf0Var.get());
        }
    }
}
