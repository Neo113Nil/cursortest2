package defpackage;

import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.experiment.b;
import com.yandex.go.navigator.experiment.c;
import com.yandex.go.navigator.gas_stations.experiment.NavigatorGasStationsExperiment;
import com.yandex.go.navigator.gas_stations.experiment.d;
import com.yandex.go.navigator.main_screen.experiement.NavigatorMainScreenExperiment;
import com.yandex.go.navigator.rate_route.experiement.NavigatorRateScreenExperiment;
import com.yandex.go.network_metrics.experiment.NetworkReportingExperiment;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import com.yandex.go.taxi.order.models.api.response.v0;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes8.dex */
public final /* synthetic */ class ic50 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ic50(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d dVar = NavigatorGasStationsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                break;
            case 1:
                b bVar = NavigatorLanguageSettingAvailabilityExperiment.Companion;
                break;
            case 2:
                b bVar2 = NavigatorLanguageSettingAvailabilityExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                break;
            case 3:
                c cVar = NavigatorLanguageSettingAvailabilityExperiment.Language.Companion;
                break;
            case 4:
                com.yandex.go.navigator.main_screen.experiement.b bVar3 = NavigatorMainScreenExperiment.Companion;
                break;
            case 5:
                com.yandex.go.navigator.main_screen.experiement.b bVar4 = NavigatorMainScreenExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                break;
            case 6:
                com.yandex.go.navigator.rate_route.experiement.b bVar5 = NavigatorRateScreenExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                break;
            case 7:
                com.yandex.go.navigator.rate_route.experiement.b bVar6 = NavigatorRateScreenExperiment.Companion;
                break;
            case 8:
                v0 v0Var = NearestDrivers.Companion;
                break;
            case 9:
                ll50 ll50Var = ml50.Companion;
                auu0 auu0Var5 = auu0.a;
                break;
            case 10:
                ll50 ll50Var2 = ml50.Companion;
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                rt50 rt50Var = st50.Companion;
                break;
            case 19:
                rt50 rt50Var2 = st50.Companion;
                break;
            case 20:
                rt50 rt50Var3 = st50.Companion;
                auu0 auu0Var6 = auu0.a;
                break;
            case 21:
                com.yandex.go.network_metrics.experiment.b bVar7 = NetworkReportingExperiment.Companion;
                break;
            case 22:
                com.yandex.go.network_metrics.experiment.b bVar8 = NetworkReportingExperiment.Companion;
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                k660 k660Var = NewbiesRedesignPointsABExperiment.Companion;
                auu0 auu0Var7 = auu0.a;
                break;
            case 28:
                k660 k660Var2 = NewbiesRedesignPointsABExperiment.Companion;
                break;
            default:
                k660 k660Var3 = NewbiesRedesignPointsABExperiment.Companion;
                break;
        }
        return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
    }
}
