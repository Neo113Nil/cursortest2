package defpackage;

import com.yandex.go.scooters.data.ScootersConfigApi;
import com.yandex.go.scooters.data.ScootersOfferApi;
import com.yandex.go.scooters.data.ScootersSettingsApi;
import com.yandex.go.scooters.data.e;
import com.yandex.go.scooters.data_form.data.ScootersDataFormApi;
import com.yandex.go.scooters.misc.vehicle_actual_photo.data.ScootersVehicleActualPhotoApi;
import com.yandex.go.scooters.mosru.data.ScootersMosRuApi;
import com.yandex.go.scooters.mosru.data.b;
import com.yandex.go.scooters.mosru.mapper.a;
import com.yandex.go.scooters.qr.data.ScootersScooterAvailabilityApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.ScootersPhotoApi;
import ru.yandex.taxi.scooters.data.ScootersSlowdownApi;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.presentation.feedback.data.ScootersFeedbackApi;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class bwn0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public bwn0(o3o0 o3o0Var, xvf0 xvf0Var) {
        this.a = 20;
        this.b = xvf0Var;
    }

    public static bwn0 a(eqh eqhVar) {
        return new bwn0(eqhVar, 25);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new e((rqo) xvf0Var.get());
            case 1:
                return new czn0((qxm0) xvf0Var.get());
            case 2:
                return new b((rqo) xvf0Var.get());
            case 3:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ScootersMosRuApi scootersMosRuApi = (ScootersMosRuApi) on2Var.a(GoApiName.TaxiV4, ScootersMosRuApi.class);
                q5z.i(scootersMosRuApi);
                return scootersMosRuApi;
            case 4:
                return new a((c) xvf0Var.get());
            case 5:
                return new co40((pho) xvf0Var.get());
            case 6:
                on2 on2Var2 = (on2) xvf0Var.get();
                on2Var2.getClass();
                ScootersConfigApi scootersConfigApi = (ScootersConfigApi) on2Var2.a(GoApiName.TaxiV4, ScootersConfigApi.class);
                q5z.i(scootersConfigApi);
                return scootersConfigApi;
            case 7:
                on2 on2Var3 = (on2) xvf0Var.get();
                on2Var3.getClass();
                ScootersDataFormApi scootersDataFormApi = (ScootersDataFormApi) on2Var3.a(GoApiName.TaxiV4, ScootersDataFormApi.class);
                q5z.i(scootersDataFormApi);
                return scootersDataFormApi;
            case 8:
                on2 on2Var4 = (on2) xvf0Var.get();
                on2Var4.getClass();
                ScootersFeedbackApi scootersFeedbackApi = (ScootersFeedbackApi) on2Var4.a(GoApiName.TaxiV4, ScootersFeedbackApi.class);
                q5z.i(scootersFeedbackApi);
                return scootersFeedbackApi;
            case 9:
                on2 on2Var5 = (on2) xvf0Var.get();
                on2Var5.getClass();
                ScootersOfferApi scootersOfferApi = (ScootersOfferApi) on2Var5.a(GoApiName.TaxiV4, ScootersOfferApi.class);
                q5z.i(scootersOfferApi);
                return scootersOfferApi;
            case 10:
                on2 on2Var6 = (on2) xvf0Var.get();
                on2Var6.getClass();
                ScootersPhotoApi scootersPhotoApi = (ScootersPhotoApi) on2Var6.a(GoApiName.TaxiV4, ScootersPhotoApi.class);
                q5z.i(scootersPhotoApi);
                return scootersPhotoApi;
            case 11:
                on2 on2Var7 = (on2) xvf0Var.get();
                on2Var7.getClass();
                ScootersScooterAvailabilityApi scootersScooterAvailabilityApi = (ScootersScooterAvailabilityApi) on2Var7.a(GoApiName.TaxiV4, ScootersScooterAvailabilityApi.class);
                q5z.i(scootersScooterAvailabilityApi);
                return scootersScooterAvailabilityApi;
            case 12:
                on2 on2Var8 = (on2) xvf0Var.get();
                on2Var8.getClass();
                ScootersSettingsApi scootersSettingsApi = (ScootersSettingsApi) on2Var8.a(GoApiName.TaxiV4, ScootersSettingsApi.class);
                q5z.i(scootersSettingsApi);
                return scootersSettingsApi;
            case 13:
                on2 on2Var9 = (on2) xvf0Var.get();
                on2Var9.getClass();
                ScootersVehicleActualPhotoApi scootersVehicleActualPhotoApi = (ScootersVehicleActualPhotoApi) on2Var9.a(GoApiName.TaxiV4, ScootersVehicleActualPhotoApi.class);
                q5z.i(scootersVehicleActualPhotoApi);
                return scootersVehicleActualPhotoApi;
            case 14:
                on2 on2Var10 = (on2) xvf0Var.get();
                on2Var10.getClass();
                ScootersSlowdownApi scootersSlowdownApi = (ScootersSlowdownApi) on2Var10.a(GoApiName.TaxiV4, ScootersSlowdownApi.class);
                q5z.i(scootersSlowdownApi);
                return scootersSlowdownApi;
            case 15:
                return new u1o0((rqo) xvf0Var.get());
            case 16:
                return new p2o0((pho) xvf0Var.get());
            case 17:
                return new d3a((rqo) xvf0Var.get(), 7);
            case 18:
                return new com.yandex.go.scooters.offers.v2.details.mapper.a((c) xvf0Var.get());
            case 19:
                return new c3o0((pho) xvf0Var.get());
            case 20:
                return new ewn0(new l0b(i5m.a(xvf0Var), 6));
            case 21:
                return new cvn0(1, (a850) xvf0Var.get());
            case 22:
                return new com.yandex.go.scooters.offers.v2.components.bottom.data.a((z2o0) xvf0Var.get());
            case 23:
                return new b5o0((wnt) xvf0Var.get());
            case 24:
                return new ewn0(new l0b(i5m.a(xvf0Var), 7));
            case 25:
                return new u8w((pho) xvf0Var.get());
            case 26:
                return new p5o0((pho) xvf0Var.get());
            case 27:
                return new i6o0((com.yandex.go.scooters.promotions.domain.a) xvf0Var.get());
            case 28:
                return new u((g) xvf0Var.get());
            default:
                return new d3a((rqo) xvf0Var.get(), 8);
        }
    }

    public /* synthetic */ bwn0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
