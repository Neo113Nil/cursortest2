package defpackage;

import com.yandex.go.scooters.subscription.data.b;
import com.yandex.go.scooters.subscription.data.mapper.a;
import com.yandex.go.scooters.subscription.pci_dss.data.ScootersSubscriptionUrlApi;
import ru.yandex.taxi.layers.source.d;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class ivo0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ ivo0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static ivo0 a(eqh eqhVar) {
        return new ivo0(eqhVar, 22);
    }

    public static ivo0 b(xvf0 xvf0Var) {
        return new ivo0(xvf0Var, 25);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new hvo0((rqo) xvf0Var.get());
            case 1:
                return new yvo0((zuj0) xvf0Var.get());
            case 2:
                return new zvo0((zuj0) xvf0Var.get());
            case 3:
                return new u8w((pho) xvf0Var.get());
            case 4:
                return new a((c) xvf0Var.get());
            case 5:
                return new b((ywm0) xvf0Var.get());
            case 6:
                return new dzo0((rqo) xvf0Var.get());
            case 7:
                return new yp1((yp2) xvf0Var.get());
            case 8:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ScootersSubscriptionUrlApi scootersSubscriptionUrlApi = (ScootersSubscriptionUrlApi) on2Var.a(GoApiName.TaxiV4, ScootersSubscriptionUrlApi.class);
                q5z.i(scootersSubscriptionUrlApi);
                return scootersSubscriptionUrlApi;
            case 9:
                return new d3a((rqo) xvf0Var.get(), 10);
            case 10:
                return new l0p0((rqo) xvf0Var.get());
            case 11:
                return new x770((pho) xvf0Var.get());
            case 12:
                return new f3p0((rqo) xvf0Var.get());
            case 13:
                return new co40((pho) xvf0Var.get());
            case 14:
                return new y5p0((gvn0) xvf0Var.get());
            case 15:
                return new j6p0((rqo) xvf0Var.get());
            case 16:
                return new k6p0((rqo) xvf0Var.get());
            case 17:
                return new m6p0((rqo) xvf0Var.get());
            case 18:
                return new d3a((rqo) xvf0Var.get(), 11);
            case 19:
                return new com.yandex.go.scooters.offers.v2.data.b((d) xvf0Var.get());
            case 20:
                return new p8p0((rqo) xvf0Var.get());
            case 21:
                return new j9p0((rqo) xvf0Var.get());
            case 22:
                return new u8w((pho) xvf0Var.get());
            case 23:
                return new c0h((pev0) xvf0Var.get());
            case 24:
                return new ndl0(21, (ck31) xvf0Var.get());
            case 25:
                return new ypp0();
            case 26:
                lu51 lu51Var = (lu51) xvf0Var.get();
                com.ybsdk.core.navigation.cicerone.b bVar = lu51Var.f;
                if (bVar != null) {
                    return bVar;
                }
                com.ybsdk.core.navigation.cicerone.b bVar2 = new com.ybsdk.core.navigation.cicerone.b(new qq31(27, lu51Var), new l131(9, lu51Var));
                lu51Var.f = bVar2;
                return bVar2;
            case 27:
                return new msp0();
            case 28:
                return new u8w((pho) xvf0Var.get());
            default:
                return new wdz((x22) xvf0Var.get());
        }
    }
}
