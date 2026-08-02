package defpackage;

import com.yandex.go.navigator.driving.experiment.NavigatorControlsExperiment;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.experiment.NavigatorMapInteractionsExperiment;
import com.yandex.go.navigator.experiment.NavigatorShareRouteExperiment;
import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto;
import com.yandex.go.navigator.gas_stations.experiment.NavigatorGasStationsExperiment;
import com.yandex.go.navigator.incidents.experiment.IncidentsAvailabilityExperiment;
import com.yandex.go.navigator.main_screen.experiement.NavigatorMainScreenExperiment;
import com.yandex.go.navigator.rate_route.experiement.NavigatorRateScreenExperiment;
import com.yandex.go.navigator.settings.debug_panel.experiment.NavigatorDebugPanelExperiment;
import com.yandex.go.navigator.user_placemark.UserArrowToggleExperiment;
import com.yandex.go.network_metrics.experiment.NetworkReportingExperiment;
import com.yandex.go.order.ui.order_list_modal_height.data.OrderListModalRatioHeightExperiment;
import com.yandex.go.order.ui.presentation.routing.CopyCarNumberByTapExperiment;
import com.yandex.go.overdraft.experiments.DebtsAutoChangePaymentExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class o1q implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ o1q(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return szv0.Companion.serializer();
            case 1:
                return NavigatorMapInteractionsExperiment.Companion.serializer();
            case 2:
                return NavigatorShareRouteExperiment.Companion.serializer();
            case 3:
                return NavigatorLanguageSettingAvailabilityExperiment.Companion.serializer();
            case 4:
                return UserArrowToggleExperiment.Companion.serializer();
            case 5:
                return NavigatorFavoritesConfigDto.Companion.serializer();
            case 6:
                return NavigatorRateScreenExperiment.Companion.serializer();
            case 7:
                return IncidentsAvailabilityExperiment.Companion.serializer();
            case 8:
                return NavigatorControlsExperiment.Companion.serializer();
            case 9:
                return NavigatorDebugPanelExperiment.Companion.serializer();
            case 10:
                return NavigatorMainScreenExperiment.Companion.serializer();
            case 11:
                return NavigatorGasStationsExperiment.Companion.serializer();
            case 12:
                return rhu.Companion.serializer();
            case 13:
                return NetworkReportingExperiment.Companion.serializer();
            case 14:
                return ci11.Companion.serializer();
            case 15:
                return t280.Companion.serializer();
            case 16:
                return ygx.Companion.serializer();
            case 17:
                return dc11.Companion.serializer();
            case 18:
                return lzx0.Companion.serializer();
            case 19:
                return smk0.Companion.serializer();
            case 20:
                return g280.Companion.serializer();
            case 21:
                return vc11.Companion.serializer();
            case 22:
                return cxo.Companion.serializer();
            case 23:
                return s1g0.Companion.serializer();
            case 24:
                return iae0.Companion.serializer();
            case 25:
                return p3g0.Companion.serializer();
            case 26:
                return bid.Companion.serializer();
            case 27:
                return CopyCarNumberByTapExperiment.Companion.serializer();
            case 28:
                return OrderListModalRatioHeightExperiment.Companion.serializer();
            default:
                return DebtsAutoChangePaymentExperiment.Companion.serializer();
        }
    }
}
