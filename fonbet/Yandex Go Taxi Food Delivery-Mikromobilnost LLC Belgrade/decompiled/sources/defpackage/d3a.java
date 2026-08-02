package defpackage;

import com.yandex.go.chargers.qr.experiment.ChargersManualEnterExperiment;
import com.yandex.go.places.complaint.experiment.ComplaintExperiment;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferExperiment;
import com.yandex.go.scooters.offers.v2.data.model.ScootersOfferCardHeightConfigExperiment;
import com.yandex.go.scooters.passes.data.model.ScootersPackagesLegalTermsExperiment;
import com.yandex.go.scooters.passes.super_pass.experiments.ScootersSuperPassGracePeriodExperiment;
import com.yandex.go.taxi.order.chat.experiments.RideWebMessengerEnabledExperiment;
import com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardA11yExperiment;
import com.yandex.go.taxi.order.details.v2.fallback.defaults.RideCardDefaultsExperiment;
import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final class d3a implements q {
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public d3a(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ComplaintExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ComplaintExperiment.f);
                break;
            case 2:
                OnlyV2RideCardExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(OnlyV2RideCardExperiment.e);
                break;
            case 3:
                RideCardA11yExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(RideCardA11yExperiment.c);
                break;
            case 4:
                RideCardDefaultsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(RideCardDefaultsExperiment.c);
                break;
            case 5:
                ScootersAlternativeOfferExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ScootersAlternativeOfferExperiment.e);
                break;
            case 6:
                i9n0.Companion.getClass();
                this.b = ((jbh) rqoVar).d(i9n0.i);
                break;
            case 7:
                ScootersOfferCardHeightConfigExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ScootersOfferCardHeightConfigExperiment.d);
                break;
            case 8:
                ScootersPackagesLegalTermsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ScootersPackagesLegalTermsExperiment.g);
                break;
            case 9:
                pko0.Companion.getClass();
                this.b = ((jbh) rqoVar).d(pko0.f);
                break;
            case 10:
                ScootersSuperPassGracePeriodExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ScootersSuperPassGracePeriodExperiment.g);
                break;
            case 11:
                ScootersVehicleDetectionOnPhotoExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ScootersVehicleDetectionOnPhotoExperiment.d);
                break;
            case 12:
                RideWebMessengerEnabledExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(RideWebMessengerEnabledExperiment.c);
                break;
            default:
                ChargersManualEnterExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ChargersManualEnterExperiment.d);
                break;
        }
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        switch (this.a) {
            case 0:
                return (ChargersManualEnterExperiment) this.b.c();
            case 1:
                return (ComplaintExperiment) this.b.c();
            case 2:
                return (OnlyV2RideCardExperiment) this.b.c();
            case 3:
                return (RideCardA11yExperiment) this.b.c();
            case 4:
                return (RideCardDefaultsExperiment) this.b.c();
            case 5:
                return (ScootersAlternativeOfferExperiment) this.b.c();
            case 6:
                return (i9n0) this.b.c();
            case 7:
                return (ScootersOfferCardHeightConfigExperiment) this.b.c();
            case 8:
                return (ScootersPackagesLegalTermsExperiment) this.b.c();
            case 9:
                return (pko0) this.b.c();
            case 10:
                return (ScootersSuperPassGracePeriodExperiment) this.b.c();
            case 11:
                return (ScootersVehicleDetectionOnPhotoExperiment) this.b.c();
            default:
                return (RideWebMessengerEnabledExperiment) this.b.c();
        }
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.f(continuation);
    }
}
