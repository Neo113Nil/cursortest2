package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment$Card$RulesSectionDto$RulesItem$$serializer;
import com.yandex.go.transfer_requirement.experiment.c;
import com.yandex.go.transfer_requirement.experiment.h;
import com.yandex.go.transfer_requirement.experiment.o;
import com.yandex.go.transfer_requirement.experiment.q;
import defpackage.td01;
import java.lang.annotation.Annotation;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;
import ru.yandex.taxi.masstransit.experiment.j;
import ru.yandex.taxi.masstransit.experiment.l;
import ru.yandex.taxi.masstransit.experiment.n;
import ru.yandex.taxi.masstransit.experiment.p;
import ru.yandex.taxi.masstransit.experiment.t;
import ru.yandex.taxi.masstransit.experiment.w;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.TransportQrScannerExperiment;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.b;

/* loaded from: classes8.dex */
public final /* synthetic */ class k801 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ k801(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto", TrackingsGroupMethodDto.values(), new String[]{"inapp-widgets", "aggregate"}, new Annotation[][]{null, null});
            case 1:
                ud01 ud01Var = td01.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 2:
                sd01 sd01Var = td01.a.Companion;
                return new p53(auu0.a, 0);
            case 3:
                sd01 sd01Var2 = td01.a.Companion;
                return new p53(auu0.a, 0);
            case 4:
                q qVar = TransferRequirementExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 5:
                q qVar2 = TransferRequirementExperiment.Companion;
                return TransferRequirementExperiment.TransferKind.Companion.serializer();
            case 6:
                c cVar = TransferRequirementExperiment.Card.DatePicker.Companion;
                return TransferRequirementExperiment.Card.FirstSelectableDate.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment.Card.FirstSelectableDate", TransferRequirementExperiment.Card.FirstSelectableDate.values(), new String[]{"today", "yesterday"}, new Annotation[][]{null, null});
            case 8:
                h hVar = TransferRequirementExperiment.Card.RulesSectionDto.Companion;
                return new p53(TransferRequirementExperiment$Card$RulesSectionDto$RulesItem$$serializer.INSTANCE, 0);
            case 9:
                o oVar = TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto.Companion;
                return TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType.Companion.serializer();
            case 10:
                return vez0.g("com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType", TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType.values(), new String[]{"count", "switcher"}, new Annotation[][]{null, null});
            case 11:
                return vez0.g("com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment.TransferKind", TransferRequirementExperiment.TransferKind.values(), new String[]{"avia", "train"}, new Annotation[][]{null, null});
            case 12:
                l lVar = TransportOnSummaryExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 13:
                l lVar2 = TransportOnSummaryExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 14:
                l lVar3 = TransportOnSummaryExperiment.Companion;
                return new k8u(auu0.a, t.a, 1);
            case 15:
                n nVar = TransportOnSummaryExperiment.c.Companion;
                return new p53(j.a, 0);
            case 16:
                p pVar = TransportOnSummaryExperiment.LiveTagsSettings.Companion;
                return TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType.Companion.serializer();
            case 17:
                return vez0.g("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType", TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType.values(), new String[]{"first", "full"}, new Annotation[][]{null, null});
            case 18:
                w wVar = TransportOnSummaryExperiment.f.Companion;
                return new p53(j.a, 0);
            case 19:
                k411 k411Var = j411.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 20:
                y411 y411Var = TransportQrScannerExperiment.Companion;
                return new p53(b.a, 0);
            case 21:
                ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.c cVar2 = TransportQrScannerExperiment.a.Companion;
                return TransportQrScannerExperiment.QrTarget.Companion.serializer();
            case 22:
                ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.c cVar3 = TransportQrScannerExperiment.a.Companion;
                return new p53(auu0.a, 0);
            case 23:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.TransportQrScannerExperiment.QrTarget", TransportQrScannerExperiment.QrTarget.values(), new String[]{"transport_payment"}, new Annotation[][]{null});
            case 24:
                cc11 cc11Var = dc11.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 25:
                return Boolean.TRUE;
            case 26:
                try {
                    return CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
                } catch (CertificateException unused) {
                    return null;
                }
            case 27:
                bi11 bi11Var = ci11.Companion;
                return new p53(auu0.a, 0);
            case 28:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.Type", Type.values(), new String[]{"show_popup", "change_zone_mode", "tariff_change", "show_webview", Constants.DEEPLINK, "drive_card", "show_screen_through_promo", "stop_card", "select_intercity_shuttle_point", "finalize", "pull_out_of_zone", "show_point_clarification_screen", "drive_summary_offer", "walk_route", "walk_to_delivery_point", "organization_card", "pick_scooter", "pick_scooter_parking", "show_description", "pick_chargers_station", "drive_select_from_cluster", "choose_where_you_are", "zoom_map_bbox", "show_navigation", "repeat_request", "select_as_destination", "select_as_navigation_destination", "build_route_navigation", "address_selection", "select_scooters_zone", "position_confirmation", "call_link_background", "additional_request", "select_ndd_pickup_point", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            default:
                fn11 fn11Var = TypedContentWidget.Companion;
                return TypedContentWidget.Type.Companion.serializer();
        }
    }
}
