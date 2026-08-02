package defpackage;

import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.l1;
import com.yandex.go.places.experiments.flex.PlacesClientFlexScreensExperimentDto;
import com.yandex.go.places.experiments.flex.PlacesFlexScreenDto$$serializer;
import com.yandex.go.places.experiments.flex.a;
import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment$CardOption$$serializer;
import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment$CategoryFilter$$serializer;
import com.yandex.go.places.experiments.map.b;
import com.yandex.go.places.experiments.map.d;
import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import com.yandex.go.places.searchbar.impl.experiments.PlacesSearchbarExperiment;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class l1b0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ l1b0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.requirements.models.net.PersistenceTypeDto", PersistenceTypeDto.values(), new String[]{"local", null}, new Annotation[][]{null, null});
            case 1:
                l1 l1Var = PersonalAccount.ComplementAttributes.Companion;
                return jsq0.Companion.serializer(PaymentMethod$Type.Companion.serializer());
            case 2:
                g7b0 g7b0Var = j7b0.Companion;
                return d580.Companion.serializer();
            case 3:
                g7b0 g7b0Var2 = j7b0.Companion;
                return new p53(o7b0.a, 0);
            case 4:
                g7b0 g7b0Var3 = j7b0.Companion;
                return new k8u(auu0.a, mf31.a, 1);
            case 5:
                zfb0 zfb0Var = agb0.Companion;
                return new p53(mfb0.a, 0);
            case 6:
                vpb0 vpb0Var = xpb0.Companion;
                return MapObjectType.Companion.serializer();
            case 7:
                vpb0 vpb0Var2 = xpb0.Companion;
                return new p53(sud0.a, 0);
            case 8:
                qtb0 qtb0Var = rtb0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 9:
                rxb0 rxb0Var = sxb0.Companion;
                return new p53(auu0.a, 0);
            case 10:
                return new o4o("ru.yandex.taxi.address.experiments.PinOverrideRule.UnknownOverride", txb0.INSTANCE, new Annotation[0]);
            case 11:
                vxb0 vxb0Var = wxb0.Companion;
                return new p53(auu0.a, 0);
            case 12:
                d1c0 d1c0Var = e1c0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 13:
                d1c0 d1c0Var2 = e1c0.Companion;
                return new p53(yxb0.e, 0);
            case 14:
                a aVar = PlacesClientFlexScreensExperimentDto.Companion;
                return new p53(PlacesFlexScreenDto$$serializer.INSTANCE, 0);
            case 15:
                d dVar = PlacesMapScreenExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 16:
                d dVar2 = PlacesMapScreenExperiment.Companion;
                return new p53(PlacesMapScreenExperiment$CardOption$$serializer.INSTANCE, 0);
            case 17:
                com.yandex.go.places.experiments.map.a aVar2 = PlacesMapScreenExperiment.CardOption.Companion;
                return PlacesMapScreenExperiment.Screen.Companion.serializer();
            case 18:
                com.yandex.go.places.experiments.map.a aVar3 = PlacesMapScreenExperiment.CardOption.Companion;
                return PlacesMapScreenExperiment.RevealingState.Companion.serializer();
            case 19:
                com.yandex.go.places.experiments.map.a aVar4 = PlacesMapScreenExperiment.CardOption.Companion;
                return new p53(PlacesMapScreenExperiment$CategoryFilter$$serializer.INSTANCE, 0);
            case 20:
                b bVar = PlacesMapScreenExperiment.CategoryFilter.Companion;
                return CategoryFilterType.Companion.serializer();
            case 21:
                return vez0.g("com.yandex.go.places.experiments.map.PlacesMapScreenExperiment.RevealingState", PlacesMapScreenExperiment.RevealingState.values(), new String[]{"expanded", "compact", "collapsed"}, new Annotation[][]{null, null, null});
            case 22:
                return vez0.g("com.yandex.go.places.experiments.map.PlacesMapScreenExperiment.Screen", PlacesMapScreenExperiment.Screen.values(), new String[]{"main", "organization_list", "organization_list_v2", "organization_card", null}, new Annotation[][]{null, null, null, null, null});
            case 23:
                com.yandex.go.places.experiments.map.pin_war_v2.b bVar2 = PlacesPinWarV2Experiment.CameraRedrawMode.Companion;
                return PlacesPinWarV2Experiment.CameraRedrawMode.Mode.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment.CameraRedrawMode.Mode", PlacesPinWarV2Experiment.CameraRedrawMode.Mode.values(), new String[]{"immediate", "never", "deferred_with_timeout"}, new Annotation[][]{null, null, null});
            case 25:
                com.yandex.go.places.experiments.map.pin_war_v2.d dVar3 = PlacesPinWarV2Experiment.Clustering.Companion;
                return PlacesPinWarV2Experiment.ZoomStep.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment.ZoomStep", PlacesPinWarV2Experiment.ZoomStep.values(), new String[]{"full", "half", "quarter", "eighth"}, new Annotation[][]{null, null, null, null});
            case 27:
                com.yandex.go.places.searchbar.impl.experiments.b bVar3 = PlacesSearchbarExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 28:
                return new p53(y251.Companion.serializer(), 0);
            default:
                return new p53(oyd.a, 0);
        }
    }
}
