package defpackage;

import com.yandex.go.due.experiment.EarlyOptionConfigExperiment;
import com.yandex.go.due.experiment.MulticlassPreorderExperiment;
import com.yandex.go.due.experiment.PreorderTitleByTariffExperiment;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import com.yandex.go.due_timetable.experiment.PreorderViewTypeExperiment;
import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SuggestForCommentExperiment;
import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SummaryCommentValidationExperiment;
import com.yandex.go.requirements.experiment.ComposeCompoundOptionSelectExperiment;
import com.yandex.go.route.experiment.MapRouteAppearanceExperiment;
import com.yandex.go.route.experiment.RouteTariffVehicleTypeExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterOrderButtonExperiment;
import com.yandex.go.safety.center.sos.SafetyCenterSosExperiment;
import com.yandex.go.summary.requirements.list.requirementgroup.experiment.ComposeSpecialRequirementsExperiment;
import ru.yandex.taxi.requirements.models.net.experiment.c;
import ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;
import ru.yandex.taxi.scooters.experiments.g0;

/* loaded from: classes9.dex */
public final /* synthetic */ class j6q implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ j6q(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return SuggestForCommentExperiment.Companion.serializer();
            case 1:
                return SummaryCommentValidationExperiment.Companion.serializer();
            case 2:
                return EarlyOptionConfigExperiment.Companion.serializer();
            case 3:
                return MulticlassPreorderExperiment.Companion.serializer();
            case 4:
                return PreorderTitleByTariffExperiment.Companion.serializer();
            case 5:
                return PreorderViewTypeExperiment.Companion.serializer();
            case 6:
                return IntercityTimetableConfigExperiment.Companion.serializer();
            case 7:
                return ComposeCompoundOptionSelectExperiment.Companion.serializer();
            case 8:
                return pnj0.Companion.serializer();
            case 9:
                return ykv0.Companion.serializer();
            case 10:
                return dhu.Companion.serializer();
            case 11:
                return ComposeSpecialRequirementsExperiment.Companion.serializer();
            case 12:
                return awm.Companion.serializer();
            case 13:
                return wmj0.Companion.serializer();
            case 14:
                return oqj0.Companion.serializer();
            case 15:
                return c.Companion.serializer();
            case 16:
                return wvd.Companion.serializer();
            case 17:
                return tlw.Companion.serializer();
            case 18:
                return LocationSdkAndroidGoExperiment.Companion.serializer();
            case 19:
                return MapRouteAppearanceExperiment.Companion.serializer();
            case 20:
                return RouteTariffVehicleTypeExperiment.Companion.serializer();
            case 21:
                return qyb.Companion.serializer();
            case 22:
                return RouteStatsPrefetchExperiment.Companion.serializer();
            case 23:
                return SafetyCenterOrderButtonExperiment.Companion.serializer();
            case 24:
                return SafetyCenterExperiment.Companion.serializer();
            case 25:
                return SafetyCenterSosExperiment.Companion.serializer();
            case 26:
                return ScootersClientInsuranceNewExperiment.Companion.serializer();
            case 27:
                return ScootersMultiOrderExperiment.Companion.serializer();
            case 28:
                return ygo0.Companion.serializer();
            default:
                return g0.Companion.serializer();
        }
    }
}
