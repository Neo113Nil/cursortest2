package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.search.data.repositories.d;
import com.yandex.go.scooters.misc.vehicle_actual_photo.data.ScootersVehicleActualPhotoApi;
import com.yandex.go.scooters.subscription.data.mapper.c;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.b;
import com.ybsdk.rconfig.SimpleIdValidation;
import defpackage.b2e0;
import defpackage.tyo0;
import defpackage.uyo0;
import defpackage.vyo0;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.g;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.scooters.data.ScootersSlowdownApi;
import ru.yandex.taxi.scooters.data.a0;
import ru.yandex.taxi.scooters.presentation.notification.a;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class oto0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public oto0(bxo0 bxo0Var, gzn0 gzn0Var, xvf0 xvf0Var) {
        this.a = 4;
        this.b = gzn0Var;
        this.c = xvf0Var;
    }

    public static oto0 a(eqh eqhVar, xvf0 xvf0Var) {
        return new oto0(xvf0Var, eqhVar, 20);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a((okv) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 1:
                return new krl0((a3v) xvf0Var2.get(), (obn0) xvf0Var.get());
            case 2:
                return new ru.yandex.taxi.scooters.presentation.share_location.data.a((e) xvf0Var2.get(), (hvo0) xvf0Var.get());
            case 3:
                return new a0((ScootersSlowdownApi) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 4:
                final com.yandex.go.scooters.subscription.data.a aVar = (com.yandex.go.scooters.subscription.data.a) xvf0Var2.get();
                final vyo0 vyo0Var = (vyo0) xvf0Var.get();
                return hz91.b("subscription", 2000L, new tls() { // from class: com.yandex.go.scooters.subscription.data.polling.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b2e0 b2e0Var = (b2e0) obj;
                        com.yandex.go.scooters.subscription.data.a aVar2 = com.yandex.go.scooters.subscription.data.a.this;
                        vyo0 vyo0Var2 = vyo0Var;
                        b2e0Var.a = new ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1(aVar2, vyo0Var2, null);
                        b2e0Var.b = new tyo0(0);
                        b2e0Var.d = new uyo0(0, vyo0Var2);
                        return zy11.a;
                    }
                });
            case 5:
                return new c((wnt) xvf0Var2.get(), (com.yandex.go.scooters.subscription.data.mapper.a) xvf0Var.get());
            case 6:
                return new d0p0((xvn0) xvf0Var2.get(), (z2o0) xvf0Var.get());
            case 7:
                return new com.yandex.go.scooters.offers.v2.surge.info.e((k7x0) xvf0Var2.get(), (e) xvf0Var.get());
            case 8:
                return new c4p0((ah00) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 9:
                return new krl0((Context) xvf0Var2.get(), (e) xvf0Var.get());
            case 10:
                return new cjm0(17, (yfo0) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.mapper.e) xvf0Var.get());
            case 11:
                return new com.yandex.go.scooters.misc.vehicle_actual_photo.data.mapper.a((k7x0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 12:
                return new com.yandex.go.scooters.misc.vehicle_actual_photo.data.a((ru.yandex.taxi.scooters.data.a) xvf0Var2.get(), (ScootersVehicleActualPhotoApi) xvf0Var.get());
            case 13:
                return new com.yandex.go.scooters.qr.data.mapper.a((zuj0) xvf0Var2.get(), (e) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.logistics.utils.a((com.yandex.go.navigation.screen.c) xvf0Var2.get(), (hit) xvf0Var.get());
            case 15:
                return new g((goe) xvf0Var2.get(), (a2y) xvf0Var.get());
            case 16:
                return new com.ybsdk.utils.poller.a((vru) xvf0Var.get(), (nop0) xvf0Var2.get());
            case 17:
                return new r621();
            case 18:
                return new com.yandex.go.places.impl.ui.search.data.repositories.c((d) xvf0Var2.get(), (com.yandex.go.places.impl.analytics.a) xvf0Var.get());
            case 19:
                return new com.yandex.go.taxi.order.search.domain.interactor.a((iup0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 20:
                return new wxp0((acz) xvf0Var2.get(), i5m.a(xvf0Var));
            case 21:
                return new t3q0((zuj0) xvf0Var2.get(), (viv0) xvf0Var.get());
            case 22:
                return new ryh((Context) xvf0Var2.get(), (qz4) xvf0Var.get());
            case 23:
                return new ofq0((ChatRequest) xvf0Var.get(), (b) xvf0Var2.get());
            case 24:
                return new xoq0((b00) xvf0Var2.get(), (ax80) xvf0Var.get());
            case 25:
                return new krl0((rbs) xvf0Var2.get(), (ybp0) xvf0Var.get());
            case 26:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.creditlimit.a((ns31) xvf0Var2.get(), (fp51) xvf0Var.get());
            case 27:
                return new k7s0((h450) xvf0Var2.get(), (rwo) xvf0Var.get());
            case 28:
                return new des0((SimpleIdValidation) xvf0Var2.get(), (na21) xvf0Var.get());
            default:
                return new x5t0((fjj0) xvf0Var2.get(), (x) xvf0Var.get());
        }
    }

    public /* synthetic */ oto0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
