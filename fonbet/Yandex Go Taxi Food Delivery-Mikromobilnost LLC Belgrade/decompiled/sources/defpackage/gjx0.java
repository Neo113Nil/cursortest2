package defpackage;

import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;
import com.yandex.go.flex.common.api.actions.p0;
import com.yandex.go.flex.common.api.actions.r0;
import com.yandex.go.flex.common.api.actions.s0;
import com.yandex.go.taxi.order.experiments.TaxiOrderButtonPositionExperiment;
import com.yandex.go.taxi.order.experiments.i;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.TariffOverride;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.d;
import com.yandex.go.zone.dto.objects.SuffixSpanType;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.TariffViewSectionItemType;
import com.yandex.go.zone.dto.objects.n6;
import defpackage.uvy0;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.common_models.net.TextMetaStyle;
import ru.yandex.taxi.map_common.style.source.model.Theme;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.panorama.d;
import ru.yandex.taxi.panorama.h;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final /* synthetic */ class gjx0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ gjx0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.tariffs.model.TariffOrderFlow", TariffOrderFlow.values(), new String[]{"DRIVE_FLOW", "TAXI_FLOW", "SHUTTLE_FLOW", "DELIVERY_FLOW", "COPTER_FLOW", "COPTER_CITY_TOUR_FLOW"}, new Annotation[][]{null, null, null, null, null, null});
            case 1:
                d dVar = TariffOverride.Companion;
                return new p53(auu0.a, 0);
            case 2:
                emx0 emx0Var = fmx0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 3:
                return RequirementsParam.Companion.serializer();
            case 4:
                n6 n6Var = TariffUnavailable.Companion;
                return SuffixSpanType.Companion.serializer();
            case 5:
                return vez0.g("com.yandex.go.zone.dto.objects.TariffViewSectionItemType", TariffViewSectionItemType.values(), new String[]{"group", "requirement", "virtual_group", null}, new Annotation[][]{null, null, null, null});
            case 6:
                p0 p0Var = TaxiExpectedDestinationAction.Companion;
                return vez0.g("com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction.Prefetch", TaxiExpectedDestinationAction.Prefetch.values(), new String[]{"route_eta", "none"}, new Annotation[][]{null, null});
            case 7:
                return new o4o("TaxiMainScreenAction", r0.INSTANCE, new Annotation[]{new tfr()});
            case 8:
                i iVar = TaxiOrderButtonPositionExperiment.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 9:
                i iVar2 = TaxiOrderButtonPositionExperiment.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 10:
                return new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "TaxiOrderFeedbackParamMapper");
            case 11:
                d8y0 d8y0Var = ru.yandex.taxi.panorama.d.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 12:
                d8y0 d8y0Var2 = ru.yandex.taxi.panorama.d.Companion;
                return new p53(auu0.a, 0);
            case 13:
                d8y0 d8y0Var3 = ru.yandex.taxi.panorama.d.Companion;
                return new p53(auu0.a, 0);
            case 14:
                h hVar = d.c.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 15:
                h hVar2 = d.c.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 16:
                h hVar3 = d.c.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 17:
                return new o4o("TaxiProceedAction", s0.INSTANCE, new Annotation[]{new tfr()});
            case 18:
                return scc.g(Integer.valueOf(w7h0.menu_button), Integer.valueOf(w7h0.content_frame), Integer.valueOf(w7h0.banners_container), Integer.valueOf(w7h0.agreement_container), Integer.valueOf(w7h0.yandex_bank_screen_container));
            case 19:
                return new o4o("com.yandex.go.flex.main_screen.presentation.controllers.skaffold.TaxiUnavailableScaffold", wby0.INSTANCE, new Annotation[0]);
            case 20:
                return hq11.a;
            case 21:
                return vez0.g("ru.yandex.taxi.common_models.net.TextMetaStyle", TextMetaStyle.values(), new String[]{"headline-header", "headline-title-1", "headline-title-2", "headline-title-3", "headline-title-4", "headline-title-5", "condensed-header", "condensed-title-1", "condensed-title-2", "condensed-title-3", "condensed-title-4", "condensed-title-5"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
            case 22:
                return emh.a();
            case 23:
                return vez0.g("ru.yandex.taxi.map_common.style.source.model.Theme", Theme.values(), new String[]{"light", "dark"}, new Annotation[][]{null, null});
            case 24:
                rvy0 rvy0Var = uvy0.Companion;
                return new p53(svy0.a, 0);
            case 25:
                rvy0 rvy0Var2 = uvy0.Companion;
                return new p53(svy0.a, 0);
            case 26:
                rvy0 rvy0Var3 = uvy0.Companion;
                return new p53(svy0.a, 0);
            case 27:
                rvy0 rvy0Var4 = uvy0.Companion;
                return new p53(svy0.a, 0);
            case 28:
                tvy0 tvy0Var = uvy0.a.Companion;
                return new p53(auu0.a, 0);
            default:
                return new ThreadLocal();
        }
    }
}
