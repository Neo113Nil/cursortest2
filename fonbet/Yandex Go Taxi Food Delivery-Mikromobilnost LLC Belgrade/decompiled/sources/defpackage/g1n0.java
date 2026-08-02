package defpackage;

import android.content.Context;
import com.yandex.go.scooters.data.ScootersSettingsApi;
import com.yandex.go.scooters.domain.r;
import com.yandex.go.scooters.domain.x;
import com.yandex.go.scooters.driver_license.data.ScootersDriverLicenseApi;
import com.yandex.go.scooters.driver_license.data.a;
import com.yandex.go.scooters.insurance.suggest.v2.d;
import com.yandex.go.scooters.passes.model.ScootersPassesPendingPurchaseStatus$PackageType;
import defpackage.b2e0;
import defpackage.iin0;
import defpackage.pzn0;
import defpackage.ufo0;
import defpackage.zy11;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.data.w;
import ru.yandex.taxi.scooters.domain.c;
import ru.yandex.taxi.scooters.domain.k;
import ru.yandex.taxi.scooters.domain.l;
import ru.yandex.taxi.scooters.domain.o;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.b;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class g1n0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ g1n0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new f1n0((Context) xvf0Var2.get(), (c1n0) xvf0Var.get());
            case 1:
                return new c((ah00) xvf0Var2.get(), (po21) xvf0Var.get());
            case 2:
                return new cjm0(3, (qvq0) xvf0Var2.get(), (qxm0) xvf0Var.get());
            case 3:
                return new a((ScootersDriverLicenseApi) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 4:
                return new krl0((oso0) xvf0Var2.get(), (y3n0) xvf0Var.get());
            case 5:
                return new uqn0((zuj0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 6:
                return new trn0((qxm0) xvf0Var2.get(), (qwo0) xvf0Var.get());
            case 7:
                return new com.yandex.go.scooters.data.c((ScootersSettingsApi) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 8:
                return new d((qxm0) xvf0Var2.get(), (r) xvf0Var.get());
            case 9:
                return new com.yandex.go.scooters.data.d((h) xvf0Var2.get(), (u1o0) xvf0Var.get());
            case 10:
                return new ru.yandex.taxi.scooters.presentation.ontheway.lock.domain.a((qwo0) xvf0Var2.get(), (ukn0) xvf0Var.get());
            case 11:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.c((n6n0) xvf0Var2.get(), (znn0) xvf0Var.get());
            case 12:
                return new q((rqo) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 13:
                return new krl0((p2o0) xvf0Var2.get(), (q4o0) xvf0Var.get());
            case 14:
                return new com.yandex.go.scooters.offers.v2.analytics.c((czf0) xvf0Var2.get(), (lx4) xvf0Var.get());
            case 15:
                return new x((r) xvf0Var2.get(), (com.yandex.go.scooters.payments.data.c) xvf0Var.get());
            case 16:
                return new z3o0((iu4) xvf0Var2.get(), (w030) xvf0Var.get());
            case 17:
                return new dwn0(scc.g((k) xvf0Var2.get(), (l) xvf0Var.get()));
            case 18:
                return new b((rqo) xvf0Var2.get(), (qwo0) xvf0Var.get());
            case 19:
                return new o5o0((wnt) xvf0Var2.get(), (cyx) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.c((u) xvf0Var2.get(), (euo0) xvf0Var.get());
            case 21:
                return new com.yandex.go.scooters.packages.upsale_on_book.data.a((eex) xvf0Var2.get(), (j6p0) xvf0Var.get());
            case 22:
                return new com.yandex.go.scooters.parking.data.a((dqt) xvf0Var2.get(), (nbo0) xvf0Var.get());
            case 23:
                final com.yandex.go.scooters.passes.data.a aVar = (com.yandex.go.scooters.passes.data.a) xvf0Var2.get();
                final ufo0 ufo0Var = (ufo0) xvf0Var.get();
                final ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType = ScootersPassesPendingPurchaseStatus$PackageType.MINUTES_PACKAGE;
                return hz91.b("package", 2000L, new tls() { // from class: com.yandex.go.scooters.passes.data.polling.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b2e0 b2e0Var = (b2e0) obj;
                        ufo0 ufo0Var2 = ufo0.this;
                        ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType2 = scootersPassesPendingPurchaseStatus$PackageType;
                        b2e0Var.a = new ScootersPassPurchasingPollingContractKt$buildPassContract$1$1(ufo0Var2, scootersPassesPendingPurchaseStatus$PackageType2, aVar, null);
                        b2e0Var.b = new pzn0(18);
                        b2e0Var.c = new pzn0(19);
                        b2e0Var.d = new iin0(ufo0Var2, scootersPassesPendingPurchaseStatus$PackageType2);
                        return zy11.a;
                    }
                });
            case 24:
                final com.yandex.go.scooters.passes.data.a aVar2 = (com.yandex.go.scooters.passes.data.a) xvf0Var2.get();
                final ufo0 ufo0Var2 = (ufo0) xvf0Var.get();
                final ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType2 = ScootersPassesPendingPurchaseStatus$PackageType.SUPER_PASS;
                return hz91.b("superpass", 2000L, new tls() { // from class: com.yandex.go.scooters.passes.data.polling.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b2e0 b2e0Var = (b2e0) obj;
                        ufo0 ufo0Var22 = ufo0.this;
                        ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType22 = scootersPassesPendingPurchaseStatus$PackageType2;
                        b2e0Var.a = new ScootersPassPurchasingPollingContractKt$buildPassContract$1$1(ufo0Var22, scootersPassesPendingPurchaseStatus$PackageType22, aVar2, null);
                        b2e0Var.b = new pzn0(18);
                        b2e0Var.c = new pzn0(19);
                        b2e0Var.d = new iin0(ufo0Var22, scootersPassesPendingPurchaseStatus$PackageType22);
                        return zy11.a;
                    }
                });
            case 25:
                return new o((v7j0) xvf0Var2.get(), (ugo0) xvf0Var.get());
            case 26:
                return new com.yandex.go.scooters.photocontrol.domain.h((w) xvf0Var2.get(), (ijo0) xvf0Var.get());
            case 27:
                return new com.yandex.go.scooters.promotions.data.mapper.a((k7x0) xvf0Var2.get(), (e) xvf0Var.get());
            case 28:
                return new com.yandex.go.scooters.qr.domain.e((ru.yandex.taxi.scooters.domain.q) xvf0Var2.get(), (com.yandex.go.scooters.qr.unavailable_scooter.data.a) xvf0Var.get());
            default:
                return new ru.yandex.taxi.scooters.data.x((rqo) xvf0Var2.get(), (ato0) xvf0Var.get());
        }
    }

    public /* synthetic */ g1n0(cfo0 cfo0Var, mam0 mam0Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = mam0Var;
        this.c = xvf0Var;
    }
}
