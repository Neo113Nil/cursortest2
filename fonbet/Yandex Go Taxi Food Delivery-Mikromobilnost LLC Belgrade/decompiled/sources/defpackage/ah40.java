package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtVehiclesParam;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtVehiclesParam$BleInfo$$serializer;
import com.yandex.go.masstransit.sdk.ble.impl.network.d;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainSchedulerRequestPayloadDto;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.t;
import com.yandex.go.multimodal_route.network.models.MultimodalFeedbackDto;
import com.yandex.go.multimodal_route.network.models.j;
import com.yandex.go.navigator.experiment.NavigatorShareRouteExperiment;
import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto;
import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto$ZoomAppearanceDto$$serializer;
import com.yandex.go.navigator.favorites.experiment.c;
import com.yandex.go.tariffcard.experiment.MulticlassTariffPromoDescriptionExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffPromoDescriptionExperiment$Description$$serializer;
import com.yandex.go.tariffcard.experiment.f;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers$Position$$serializer;
import com.yandex.go.taxi.order.models.api.response.w0;
import com.ybsdk.navigation.NavigationFragment;
import java.lang.annotation.Annotation;
import java.util.Collections;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;
import ru.yandex.taxi.masstransit.geopayment.network.e;
import ru.yandex.taxi.masstransit.geopayment.network.g;
import ru.yandex.taxi.masstransit.geopayment.network.h;
import ru.yandex.taxi.masstransit.geopayment.network.i;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class ah40 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ah40(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        pz40 themeType_delegate$lambda$8;
        igp0 screenshotsDetector_delegate$lambda$9;
        hep0 screenRecordingDetector_delegate$lambda$10;
        switch (this.a) {
            case 0:
                ch40 ch40Var = dh40.Companion;
                return MtScheduleScenario.Companion.serializer();
            case 1:
                t tVar = MtTrainSchedulerRequestPayloadDto.Companion;
                return com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtScheduleScenario.Companion.serializer();
            case 2:
                return new o4o("ru.yandex.taxi.masstransit.model.MtUnknownAnimation", nj40.INSTANCE, new Annotation[0]);
            case 3:
                return new o4o("ru.yandex.taxi.masstransit.model.MtUnknownSource", oj40.INSTANCE, new Annotation[0]);
            case 4:
                zj40 zj40Var = g.Companion;
                return new p53(e.a, 0);
            case 5:
                d dVar = MtVehiclesParam.Companion;
                return new p53(MtVehiclesParam$BleInfo$$serializer.INSTANCE, 0);
            case 6:
                bk40 bk40Var = MtVehiclesResponse.Companion;
                return new p53(h.a, 0);
            case 7:
                i iVar = MtVehiclesResponse.BLEItem.Companion;
                return MtVehiclesResponse.BLEItem.TransportType.Companion.serializer();
            case 8:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse.BLEItem.TransportType", MtVehiclesResponse.BLEItem.TransportType.values(), new String[]{"bus", "trolley", "tram", "water", "electrobus"}, new Annotation[][]{null, null, null, null, null});
            case 9:
                dp40 dp40Var = gp40.Companion;
                return new p53(auu0.a, 0);
            case 10:
                f fVar = MulticlassTariffPromoDescriptionExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 11:
                f fVar2 = MulticlassTariffPromoDescriptionExperiment.Companion;
                return new p53(MulticlassTariffPromoDescriptionExperiment$Description$$serializer.INSTANCE, 0);
            case 12:
                fr40 fr40Var = ir40.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 13:
                j jVar = MultimodalFeedbackDto.Companion;
                return new p53(auu0.a, 0);
            case 14:
                return new p53(auu0.a, 0);
            case 15:
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length != 0) {
                    return j73.d0(strArr);
                }
                String str = Build.CPU_ABI2;
                return (str == null || evu0.J(str)) ? Collections.singletonList(Build.CPU_ABI) : scc.g(Build.CPU_ABI, str);
            case 16:
                return LinkMovementMethod.getInstance();
            case 17:
                themeType_delegate$lambda$8 = NavigationFragment.themeType_delegate$lambda$8();
                return themeType_delegate$lambda$8;
            case 18:
                screenshotsDetector_delegate$lambda$9 = NavigationFragment.screenshotsDetector_delegate$lambda$9();
                return screenshotsDetector_delegate$lambda$9;
            case 19:
                screenRecordingDetector_delegate$lambda$10 = NavigationFragment.screenRecordingDetector_delegate$lambda$10();
                return screenRecordingDetector_delegate$lambda$10;
            case 20:
                return vez0.g("com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto.PlaceTypeDto", NavigatorFavoritesConfigDto.PlaceTypeDto.values(), new String[]{"home", "work", "favorite", null}, new Annotation[][]{null, null, null, null});
            case 21:
                c cVar = NavigatorFavoritesConfigDto.PlacemarkVariantDto.Companion;
                return NavigatorFavoritesConfigDto.PlaceTypeDto.Companion.serializer();
            case 22:
                c cVar2 = NavigatorFavoritesConfigDto.PlacemarkVariantDto.Companion;
                return new p53(NavigatorFavoritesConfigDto$ZoomAppearanceDto$$serializer.INSTANCE, 0);
            case 23:
                return new Handler(Looper.getMainLooper());
            case 24:
                com.yandex.go.navigator.experiment.f fVar3 = NavigatorShareRouteExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 25:
                w0 w0Var = NearestDrivers.Driver.Companion;
                return new p53(NearestDrivers$Position$$serializer.INSTANCE, 0);
            case 26:
                return new p53(auu0.a, 1);
            case 27:
                return new p53(auu0.a, 0);
            case 28:
                return RequirementsParam.Companion.serializer();
            default:
                tk50 tk50Var = uk50.Companion;
                return new p53(k7u0.a, 0);
        }
    }
}
