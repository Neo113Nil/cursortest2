package defpackage;

import com.yandex.go.scooters.data.model.ScootersUsePointAExperiment;
import com.yandex.go.scooters.deposit.experiments.model.ScootersDepositCommunicationExperiment;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.live.data.model.ScootersLiveActivityExperiment;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment;
import com.yandex.go.scooters.offers.v2.data.model.ScootersOfferCardHeightConfigExperiment;
import com.yandex.go.scooters.packages.upsale_on_book.data.model.ScootersUpsalePackageOnBookExperiment;
import com.yandex.go.scooters.parking.data.model.ScootersParkingDescriptionExperiment;
import com.yandex.go.scooters.passes.data.model.ScootersPackagesLegalTermsExperiment;
import com.yandex.go.scooters.passes.data.model.ScootersPassesAutoRenewExperiment;
import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import com.yandex.go.scooters.passes.experiments.model.ScootersFireworkForSuperPassPurchaseExperiment;
import com.yandex.go.scooters.passes.super_pass.experiments.ScootersSuperPassGracePeriodExperiment;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolExperiment;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolRecognitionExperiment;
import com.yandex.go.scooters.promocodes.data.ScootersPromocodesPromoLinksExperiment;
import com.yandex.go.scooters.subscription.upsale_on_book.data.model.ScootersSubscriptionUpsaleOnBookExperiment;
import com.yandex.go.scooters.super_passes.upsale_on_book.data.model.ScootersUpsaleSuperPassOnBookExperiment;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class k8q implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ k8q(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return pko0.Companion.serializer();
            case 1:
                return j8p0.Companion.serializer();
            case 2:
                return n1o0.Companion.serializer();
            case 3:
                return ScootersDepositCommunicationExperiment.Companion.serializer();
            case 4:
                return ScootersIgnitionExperiment.Companion.serializer();
            case 5:
                return ScootersMosRuIntegrationExperiment.Companion.serializer();
            case 6:
                return jso0.Companion.serializer();
            case 7:
                return wnn0.Companion.serializer();
            case 8:
                return zso0.Companion.serializer();
            case 9:
                return hto0.Companion.serializer();
            case 10:
                return ScootersLiveActivityExperiment.Companion.serializer();
            case 11:
                return ico0.Companion.serializer();
            case 12:
                return o8p0.Companion.serializer();
            case 13:
                return i9n0.Companion.serializer();
            case 14:
                return fvo0.Companion.serializer();
            case 15:
                return ScootersOnboardingOnActiveRideExperiment.Companion.serializer();
            case 16:
                return ScootersParkingDescriptionExperiment.Companion.serializer();
            case 17:
                return ScootersPassesAutoRenewExperiment.Companion.serializer();
            case 18:
                return ScootersPhotocontrolRecognitionExperiment.Companion.serializer();
            case 19:
                return ScootersPhotocontrolExperiment.Companion.serializer();
            case 20:
                return ScootersSuperPassGracePeriodExperiment.Companion.serializer();
            case 21:
                return ScootersUpsalePackageOnBookExperiment.Companion.serializer();
            case 22:
                return ScootersSuperPassLegalTermsExperiment.Companion.serializer();
            case 23:
                return ScootersUsePointAExperiment.Companion.serializer();
            case 24:
                return ScootersSubscriptionUpsaleOnBookExperiment.Companion.serializer();
            case 25:
                return ScootersOfferCardHeightConfigExperiment.Companion.serializer();
            case 26:
                return ScootersFireworkForSuperPassPurchaseExperiment.Companion.serializer();
            case 27:
                return ScootersPromocodesPromoLinksExperiment.Companion.serializer();
            case 28:
                return ScootersUpsaleSuperPassOnBookExperiment.Companion.serializer();
            default:
                return ScootersPackagesLegalTermsExperiment.Companion.serializer();
        }
    }
}
