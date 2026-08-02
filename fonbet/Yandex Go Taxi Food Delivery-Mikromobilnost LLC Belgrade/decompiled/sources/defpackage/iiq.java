package defpackage;

import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackExperiment;
import com.yandex.go.taxi.order.chat.experiments.RideWebMessengerEnabledExperiment;
import com.yandex.go.taxi.order.details.v1.elements.support.experiment.SupportOnCompleteExperiment;
import com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardA11yExperiment;
import com.yandex.go.taxi.order.details.v2.fallback.defaults.RideCardDefaultsExperiment;
import com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.experiment.UsePressedNoTipOptionExperiment;
import com.yandex.go.taxi.order.experiments.ColorizedCarIconExperiment;
import com.yandex.go.taxi.order.experiments.ForceRerouteExperiment;
import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;
import com.yandex.go.taxi.order.experiments.RideCardComposeExperiment;
import com.yandex.go.taxi.order.experiments.RideCardOrderTrackingVisibilityExperiment;
import com.yandex.go.taxi.order.experiments.TaxiOrderButtonPositionExperiment;
import com.yandex.go.taxi.order.experiments.TaxiTravelerPassengerGpsExperiment;
import com.yandex.go.taxi.order.experiments.TrackingTariffIconOverlayExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsButtonExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsPresentationExperiment;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.TrackingFeedClientFeaturesExperiment;
import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;
import com.yandex.go.taxi.order.net.xiva.WebSocketTrackingExperiment;
import com.yandex.go.taxi.order.overlay.LogMapKitRouteExperiment;
import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.recalculation.experiment.PriceRecalculationExperiment;
import com.yandex.go.taxi.order.report_driver_position.experiment.ReportDriverPositionExperiment;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class iiq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ iiq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return gbl0.Companion.serializer();
            case 1:
                return nmx0.Companion.serializer();
            case 2:
                return ddv.Companion.serializer();
            case 3:
                return uvy0.Companion.serializer();
            case 4:
                return CallFeedbackExperiment.Companion.serializer();
            case 5:
                return RideWebMessengerEnabledExperiment.Companion.serializer();
            case 6:
                return TrackingFeedClientFeaturesExperiment.Companion.serializer();
            case 7:
                return TrackingTariffIconOverlayExperiment.Companion.serializer();
            case 8:
                return ForceRerouteExperiment.Companion.serializer();
            case 9:
                return TaxiOrderButtonPositionExperiment.Companion.serializer();
            case 10:
                return UsePressedNoTipOptionExperiment.Companion.serializer();
            case 11:
                return TaxiTravelerPassengerGpsExperiment.Companion.serializer();
            case 12:
                return OnlyV2RideCardExperiment.Companion.serializer();
            case 13:
                return ColorizedCarIconExperiment.Companion.serializer();
            case 14:
                return WebSocketTrackingExperiment.Companion.serializer();
            case 15:
                return TipsSuggestModalExperiment.Companion.serializer();
            case 16:
                return LogMapKitRouteExperiment.Companion.serializer();
            case 17:
                return OrderDetailsDriverExperiment.Companion.serializer();
            case 18:
                return OrderDetailsPresentationExperiment.Companion.serializer();
            case 19:
                return RideCardOrderTrackingVisibilityExperiment.Companion.serializer();
            case 20:
                return OrderDetailsButtonExperiment.Companion.serializer();
            case 21:
                return TaxiOrderFeedStateSettingsExperiment.Companion.serializer();
            case 22:
                return TaxiOrderPerfTweaksExperiment.Companion.serializer();
            case 23:
                return ReportDriverPositionExperiment.Companion.serializer();
            case 24:
                return SupportOnCompleteExperiment.Companion.serializer();
            case 25:
                return RideCardA11yExperiment.Companion.serializer();
            case 26:
                return RideCardComposeExperiment.Companion.serializer();
            case 27:
                return PriceRecalculationExperiment.Companion.serializer();
            case 28:
                return RideCardDefaultsExperiment.Companion.serializer();
            default:
                return ChangeSourcePointExperiment.Companion.serializer();
        }
    }
}
