package defpackage;

import com.yandex.go.chargers.discounts.data.ChargersDiscountsApi;
import com.yandex.go.chargers.offer.data.b;
import com.yandex.go.chargers.offer.passes.data.g;
import com.yandex.go.chargers.offer.plus_dvizh.data.f;
import com.yandex.go.chargers.station.data.e;
import com.yandex.go.morphlex.action.change_requirement.d;
import com.yandex.go.places.impl.ui.main.actions.change_address.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.change.payment.method.internal.network.ChangePaymentMethodsApi;
import defpackage.b2e0;
import defpackage.rfa;
import defpackage.zy11;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class ba9 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ ba9(t8a t8aVar, v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((kj7) xvf0Var);
            case 1:
                return new com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.change_current_address.a((da9) ((s90) xvf0Var).get());
            case 2:
                return new ds0((jwh) ((mxf) xvf0Var).get());
            case 3:
                return new c29(3, (bc) ((g6) xvf0Var).get());
            case 4:
                return new com.yandex.go.taxi.order.change.due.data.repository.a((on2) ((s6g) xvf0Var).get());
            case 5:
                return (ChangePaymentMethodsApi) ((t0k0) ((oxf) xvf0Var).get()).b(ChangePaymentMethodsApi.class);
            case 6:
                return new us3((AppAnalyticsReporter) ((k6g) xvf0Var).get());
            case 7:
                return new d(i5m.a((kj7) xvf0Var));
            case 8:
                return new wf9((o61) ((ig7) xvf0Var).get());
            case 9:
                return new an8((gg9) ((ig7) xvf0Var).get());
            case 10:
                return new jg9(i5m.a((ig7) xvf0Var), 0);
            case 11:
                return new bh9((x770) ((uzu0) xvf0Var).get());
            case 12:
                return new rm5((bn9) ((ig7) xvf0Var).get());
            case 13:
                return new fn9((g6) xvf0Var);
            case 14:
                return new iq9((md6) ((dx7) xvf0Var).get());
            case 15:
                return new pya((r820) ((pxf) xvf0Var).get());
            case 16:
                return new com.yandex.go.chargers.discounts.discount_stations.data.a((com.yandex.go.chargers.discounts.discount_stations.data.mappers.a) ((ba9) xvf0Var).get());
            case 17:
                return new com.yandex.go.chargers.discounts.discount_stations.data.mappers.a((c) ((txf) xvf0Var).get());
            case 18:
                ChargersDiscountsApi chargersDiscountsApi = (ChargersDiscountsApi) ((on2) ((txf) xvf0Var).get()).a(GoApiName.TaxiV4, ChargersDiscountsApi.class);
                q5z.i(chargersDiscountsApi);
                return chargersDiscountsApi;
            case 19:
                return new n3a((rqo) ((uxf) xvf0Var).get(), 0);
            case 20:
                return new b((tse) ((uxf) xvf0Var).get());
            case 21:
                final f fVar = (f) ((ba9) xvf0Var).get();
                return hz91.b("PLUS_DVIZH_PURCHASING_POLLING_SERVICE", 2000L, new tls() { // from class: com.yandex.go.chargers.offer.plus_dvizh.data.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b2e0 b2e0Var = (b2e0) obj;
                        b2e0Var.a = new ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1(f.this, null);
                        b2e0Var.b = new rfa(4);
                        return zy11.a;
                    }
                });
            case 22:
                final g gVar = (g) ((dx9) xvf0Var).get();
                return hz91.b("SUPER_PASS_PURCHASING_POLLING_SERVICE", 2000L, new tls() { // from class: com.yandex.go.chargers.offer.passes.data.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b2e0 b2e0Var = (b2e0) obj;
                        b2e0Var.a = new ChargersPassPurchasingPollingContractKt$buildPassContract$1$1(g.this, null);
                        b2e0Var.b = new rfa(0);
                        return zy11.a;
                    }
                });
            case 23:
                return new f((com.yandex.go.chargers.offer.plus_dvizh.data.a) ((zfa) xvf0Var).get());
            case 24:
                return new dz30(i5m.a((qxf) xvf0Var), 1);
            case 25:
                return new nna((dei0) ((qxf) xvf0Var).get());
            case 26:
                return new yfa((e) ((lu9) xvf0Var).get());
            case 27:
                return new lta((com.yandex.go.chargers.subscription.data.a) ((xea) xvf0Var).get());
            case 28:
                return new h2b((xav) ((bzf) xvf0Var).get());
            default:
                return new m4b((q4g) ((ywf) xvf0Var).get());
        }
    }

    public /* synthetic */ ba9(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
