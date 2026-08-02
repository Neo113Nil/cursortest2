package defpackage;

import com.yandex.go.diagnostic_qr.experiment.QrDiagnosticExperiment;
import com.yandex.go.drive.DriveSdkExperiment;
import com.yandex.go.drive.experiments.DriveLazyInitExperiment;
import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;
import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;
import com.yandex.go.feedsdk.log.experiments.FeedSdkErrorReportingExperiment;
import com.yandex.go.flex.common.insets.experiments.HandleInsetsInFlexExperiment;
import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenDocumentLoaderExperiment;
import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenFeaturesExperiment;
import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenPreWarmExperiment;
import com.yandex.go.flex.main_screen.experiments.SuperappMainFeedClientFeaturesExperiment;
import com.yandex.go.payments.cards.experiments.CreditCard3dsVerificationRetryPollicyExperiment;
import com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperiment;
import com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment;
import com.yandex.go.payments.paymentlist.experiments.GPayAllowedCardNetworksExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsAddButtonExperiment;
import com.yandex.go.payments.paymentlist.experiments.SelectedPaymentMethodButtonUIExperiment;
import com.yandex.go.payments.paymentlist.experiments.info_modal.PaymentMethodSelectionInfoModalExperiment;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;
import com.yandex.go.payments.shared.SharedPaymentExperiment;
import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;
import ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class dsp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ dsp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return DevicePerformanceClassExperiment.Companion.serializer();
            case 1:
                return QrDiagnosticExperiment.Companion.serializer();
            case 2:
                return DriveLazyInitExperiment.Companion.serializer();
            case 3:
                return DriveSdkExperiment.Companion.serializer();
            case 4:
                return EboksObjectsParamsExperiment.Companion.serializer();
            case 5:
                return ExplorerExperiment.Companion.serializer();
            case 6:
                return SuperAppConfigEatsKitStaticExperiment.Companion.serializer();
            case 7:
                return tdp.Companion.serializer();
            case 8:
                return FavoritesCreateRegularAddressExperiment.Companion.serializer();
            case 9:
                return xhp.Companion.serializer();
            case 10:
                return SaveFavoriteRideModalExperiment.Companion.serializer();
            case 11:
                return agp.Companion.serializer();
            case 12:
                return SuperappMainFeedClientFeaturesExperiment.Companion.serializer();
            case 13:
                return SuperAppMainScreenDocumentLoaderExperiment.Companion.serializer();
            case 14:
                return SuperAppMainScreenFeaturesExperiment.Companion.serializer();
            case 15:
                return SuperAppMainScreenPreWarmExperiment.Companion.serializer();
            case 16:
                return FeedSdkErrorReportingExperiment.Companion.serializer();
            case 17:
                return HandleInsetsInFlexExperiment.Companion.serializer();
            case 18:
                return rvy.Companion.serializer();
            case 19:
                return nqt.Companion.serializer();
            case 20:
                return PaymentMethodSelectionInfoModalExperiment.Companion.serializer();
            case 21:
                return PaymentMethodsAddButtonExperiment.Companion.serializer();
            case 22:
                return CreditCard3dsVerificationRetryPollicyExperiment.Companion.serializer();
            case 23:
                return FamilyGroupV2Experiment.Companion.serializer();
            case 24:
                return AddPaymentMethodButtonInMenuExperiment.Companion.serializer();
            case 25:
                return SharedPaymentExperiment.Companion.serializer();
            case 26:
                return GPayAllowedCardNetworksExperiment.Companion.serializer();
            case 27:
                return PaymentMethodsPromoBannerExperiment.Companion.serializer();
            case 28:
                return PaymentMethodsServiceExperiment.Companion.serializer();
            default:
                return SelectedPaymentMethodButtonUIExperiment.Companion.serializer();
        }
    }
}
