package defpackage;

import com.yandex.go.analytics.rythm.RythmSendEventsRequest;
import com.yandex.go.analytics.rythm.b;
import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterOrderButtonExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig$Button$$serializer;
import com.yandex.go.safety.center.experiment.q;
import com.yandex.go.safety.center.experiment.u;
import com.yandex.go.safety.center.experiment.w;
import com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebChangeResult;
import com.yandex.go.safety.center.safetycenter_web.domain.web.a;
import com.yandex.go.shortcuts.dto.request.SavedPlace;
import com.yandex.go.shortcuts.dto.request.r;
import com.yandex.go.shortcuts.models.RouteType;
import com.yandex.go.shortcuts.models.RouteUserContext;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDriveOfferParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubServiceLevelParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.RouteStatsData;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.x0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubDriveOfferParamV2$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubServiceLevelParamV2$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinStateDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RouteStatsDataV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.e2;
import com.ybsdk.feature.divkit.api.ui.SafeYbDivView;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.delivery.experiments.FormType;
import ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;

/* loaded from: classes13.dex */
public final /* synthetic */ class b7l0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ b7l0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        boolean onAttach$lambda$6;
        boolean data$lambda$4;
        int i = 0;
        switch (this.a) {
            case 0:
                a2 a2Var = RoutePartItemDto$MultimodalTransportRoutePart.Companion;
                return new p53(PinStateDto$$serializer.INSTANCE, 0);
            case 1:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto.Unsupported", b2.INSTANCE, new Annotation[0]);
            case 2:
                return "car lost route, force reroute";
            case 3:
                onAttach$lambda$6 = RouteSelectorDestinationFragment.onAttach$lambda$6();
                return Boolean.valueOf(onAttach$lambda$6);
            case 4:
                x0 x0Var = RouteStatsData.Companion;
                return new p53(HubServiceLevelParam$$serializer.INSTANCE, 0);
            case 5:
                x0 x0Var2 = RouteStatsData.Companion;
                return new p53(HubDriveOfferParam$$serializer.INSTANCE, 0);
            case 6:
                e2 e2Var = RouteStatsDataV2.Companion;
                return new p53(HubServiceLevelParamV2$$serializer.INSTANCE, 0);
            case 7:
                e2 e2Var2 = RouteStatsDataV2.Companion;
                return new p53(HubDriveOfferParamV2$$serializer.INSTANCE, 0);
            case 8:
                return new m1l0();
            case 9:
                return vez0.g("com.yandex.go.shortcuts.models.RouteType", RouteType.values(), new String[]{"auto"}, new Annotation[][]{null});
            case 10:
                return vez0.g("com.yandex.go.shortcuts.models.RouteUserContext", RouteUserContext.values(), new String[]{"shortcuts"}, new Annotation[][]{null});
            case 11:
                yjl0 yjl0Var = zjl0.Companion;
                return FormType.Companion.serializer();
            case 12:
                b bVar = RythmSendEventsRequest.Companion;
                return new p53(rcx.a, 0);
            case 13:
                data$lambda$4 = SafeYbDivView.setData$lambda$4();
                return Boolean.valueOf(data$lambda$4);
            case 14:
                q qVar = SafetyCenterOrderButtonExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 15:
                q qVar2 = SafetyCenterOrderButtonExperiment.Companion;
                return SafetyCenterOrderButtonExperiment.SafetyCenterOrderButtonState.Companion.serializer();
            case 16:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterOrderButtonExperiment.SafetyCenterOrderButtonState", SafetyCenterOrderButtonExperiment.SafetyCenterOrderButtonState.values(), new String[]{"default", "only_expanded", "only_collapsed"}, new Annotation[][]{null, null, null});
            case 17:
                a aVar = SafetyCenterWebChangeResult.Companion;
                return SafetyCenterWebChangeResult.Result.Companion.serializer();
            case 18:
                return vez0.g("com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebChangeResult.Result", SafetyCenterWebChangeResult.Result.values(), new String[]{"unchanged", "changed"}, new Annotation[][]{null, null});
            case 19:
                w wVar = SafetyCenterWebConfig.Companion;
                return new p53(auu0.a, 0);
            case 20:
                w wVar2 = SafetyCenterWebConfig.Companion;
                return new p53(SafetyCenterWebConfig$Button$$serializer.INSTANCE, 0);
            case 21:
                u uVar = SafetyCenterWebConfig.Button.Companion;
                return SafetyCenterWebConfig.Button.Type.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterWebConfig.Button.Type", SafetyCenterWebConfig.Button.Type.values(), new String[]{null, "emergency", "support_chat", "share_route"}, new Annotation[][]{null, null, null, null});
            case 23:
                com.yandex.go.beginners.safety.experiments.b bVar2 = SafetyNewbiesVerificationExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 24:
                vzl0 vzl0Var = SaveFavoriteRideModalExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 25:
                vzl0 vzl0Var2 = SaveFavoriteRideModalExperiment.Companion;
                return new p53(ru.yandex.taxi.favorites.rides.save_modal.experiment.a.a, 0);
            case 26:
                ru.yandex.taxi.favorites.rides.save_modal.experiment.b bVar3 = SaveFavoriteRideModalExperiment.Modal.Companion;
                return SaveFavoriteRideModalExperiment.Modal.ModalType.Companion.serializer();
            case 27:
                return vez0.g("ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment.Modal.ModalType", SaveFavoriteRideModalExperiment.Modal.ModalType.values(), new String[]{"save", "edit"}, new Annotation[][]{null, null});
            case 28:
                return new j1m0(i);
            default:
                r rVar = SavedPlace.Location.Companion;
                return new p53(e6m.a, 0);
        }
    }
}
