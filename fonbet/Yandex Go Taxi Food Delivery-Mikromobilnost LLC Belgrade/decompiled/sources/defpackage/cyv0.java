package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties$SuggestMapPin$$serializer;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.b;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment$Button$$serializer;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.h;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.j;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.l;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.m;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment$TaxiTracking$Tariff$$serializer;
import com.yandex.go.superapp.orders.card.experiments.a;
import com.yandex.go.superapp.orders.card.experiments.c;
import com.yandex.go.superapp.orders.card.experiments.k;
import com.yandex.go.superapp.orders.card.experiments.n;
import com.yandex.go.superapp.orders.card.experiments.o;
import com.yandex.go.superapp.orders.card.experiments.p;
import com.yandex.go.superapp.orders.card.experiments.r;
import com.yandex.go.superapp.orders.card.experiments.s;
import com.yandex.go.superapp.orders.card.experiments.t;
import com.yandex.go.superapp.orders.card.experiments.u;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment$Searchbar$AnimatedText$Item$$serializer;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment$Searchbar$AnimatedText$Keyframe$$serializer;
import com.yandex.go.superapp.searchbar.impl.experiments.e;
import com.yandex.go.superapp.searchbar.impl.experiments.g;
import com.yandex.go.superapp_carts.ui.preview.PreviewBackwardAction;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto;

/* loaded from: classes14.dex */
public final /* synthetic */ class cyv0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ cyv0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                h hVar = SuperAppDiscoveryMapV2Experiment.SearchBarConfig.Companion;
                return new p53(SuperAppDiscoveryMapV2Experiment$Button$$serializer.INSTANCE, 0);
            case 1:
                h hVar2 = SuperAppDiscoveryMapV2Experiment.SearchBarConfig.Companion;
                return new p53(SuperAppDiscoveryMapV2Experiment$Button$$serializer.INSTANCE, 0);
            case 2:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment.SearchbarAction.Close", j.INSTANCE, new Annotation[0]);
            case 3:
                return vez0.g("com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment.SearchbarAction.SearchbarActionType", SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType.values(), new String[]{null, null, "superapp_search", Constants.DEEPLINK}, new Annotation[][]{null, null, null, null});
            case 4:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment.SearchbarAction.SuperappSearch", l.INSTANCE, new Annotation[0]);
            case 5:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment.SearchbarAction.Unknown", m.INSTANCE, new Annotation[0]);
            case 6:
                return vez0.g("ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto", SuperPassesDisplayVersionDto.values(), new String[]{"v1", "v2"}, new Annotation[][]{null, null});
            case 7:
                return PreviewBackwardAction.Companion.serializer();
            case 8:
                return com.yandex.go.superapp_favorites.flex.actions.PreviewBackwardAction.Companion.serializer();
            case 9:
                e eVar = SuperappSearchbarExperiment.Searchbar.AnimatedText.Companion;
                return new k8u(auu0.a, SuperappSearchbarExperiment$Searchbar$AnimatedText$Item$$serializer.INSTANCE, 1);
            case 10:
                e eVar2 = SuperappSearchbarExperiment.Searchbar.AnimatedText.Companion;
                return new p53(SuperappSearchbarExperiment$Searchbar$AnimatedText$Keyframe$$serializer.INSTANCE, 0);
            case 11:
                g gVar = SuperappSearchbarExperiment.Searchbar.AnimatedText.Keyframe.Companion;
                return new p53(auu0.a, 0);
            case 12:
                com.yandex.go.suggest.impl.data.experiments.g gVar2 = SuperappSuggestExperiment.SearchTrailButton.Companion;
                return SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour", SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.values(), new String[]{"none", "change_visible", "change_enable"}, new Annotation[][]{null, null, null});
            case 14:
                b bVar = SuperappSuggestMapItemViewProperties.Companion;
                return new p53(SuperappSuggestMapItemViewProperties$SuggestMapPin$$serializer.INSTANCE, 0);
            case 15:
                a aVar = SuperappTrackingCardExperiment.ChargersTracking.Companion;
                return vez0.g("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.HorizontalPlacement", SuperappTrackingCardExperiment.HorizontalPlacement.values(), new String[]{"lead", "trail"}, new Annotation[][]{null, null});
            case 16:
                a aVar2 = SuperappTrackingCardExperiment.ChargersTracking.Companion;
                return ahw0.Companion.serializer();
            case 17:
                c cVar = SuperappTrackingCardExperiment.DeliveryTracking.Companion;
                return vez0.g("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.HorizontalPlacement", SuperappTrackingCardExperiment.HorizontalPlacement.values(), new String[]{"lead", "trail"}, new Annotation[][]{null, null});
            case 18:
                c cVar2 = SuperappTrackingCardExperiment.DeliveryTracking.Companion;
                return com.yandex.go.superapp.orders.card.experiments.g.Companion.serializer();
            case 19:
                return new o4o("filled_plate_number", com.yandex.go.superapp.orders.card.experiments.e.INSTANCE, new Annotation[]{new com.yandex.go.superapp.orders.card.experiments.j()});
            case 20:
                com.yandex.go.superapp.orders.card.experiments.h hVar3 = SuperappTrackingCardExperiment.DriveTracking.Companion;
                return com.yandex.go.superapp.orders.card.experiments.m.Companion.serializer();
            case 21:
                return new o4o("filled_plate_number", k.INSTANCE, new Annotation[]{new com.yandex.go.superapp.orders.card.experiments.j()});
            case 22:
                com.yandex.go.superapp.orders.card.experiments.l lVar = SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber.Companion;
                return vez0.g("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.DriveTracking.ObjectWithPlateNumber.OutlinedPlateNumber.Placement", SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber.Placement.values(), new String[]{"original", "redesign_2026"}, new Annotation[][]{null, null});
            case 23:
                n nVar = SuperappTrackingCardExperiment.ExternalServiceTracking.Companion;
                return vez0.g("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.HorizontalPlacement", SuperappTrackingCardExperiment.HorizontalPlacement.values(), new String[]{"lead", "trail"}, new Annotation[][]{null, null});
            case 24:
                o oVar = SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline.Companion;
                return vez0.g("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline.Type", SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline.Type.values(), new String[]{"none", "circle"}, new Annotation[][]{null, null});
            case 25:
                p pVar = SuperappTrackingCardExperiment.NavigatorTracking.Companion;
                return vez0.g("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.HorizontalPlacement", SuperappTrackingCardExperiment.HorizontalPlacement.values(), new String[]{"lead", "trail"}, new Annotation[][]{null, null});
            case 26:
                return new o4o("filled_plate_number", r.INSTANCE, new Annotation[]{new com.yandex.go.superapp.orders.card.experiments.j()});
            case 27:
                return new o4o("outlined_plate_number", s.INSTANCE, new Annotation[]{new com.yandex.go.superapp.orders.card.experiments.j()});
            case 28:
                t tVar = SuperappTrackingCardExperiment.ScootersTracking.Companion;
                return ahw0.Companion.serializer();
            default:
                u uVar = SuperappTrackingCardExperiment.TaxiTracking.Companion;
                return new k8u(auu0.a, SuperappTrackingCardExperiment$TaxiTracking$Tariff$$serializer.INSTANCE, 1);
        }
    }
}
