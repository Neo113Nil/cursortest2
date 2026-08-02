package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.dto.b;
import com.yandex.go.address.models.AddressFinalizeTrigger;
import com.yandex.go.address.models.EditAction;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.dto.response.Action$WebApp;
import com.yandex.go.dto.response.ActionType;
import com.yandex.go.dto.response.h1;
import com.yandex.go.dto.response.j1;
import com.yandex.go.dto.response.l1;
import com.yandex.go.dto.response.m1;
import com.yandex.go.dto.response.n1;
import com.yandex.go.flex.common.api.actions.ActionWithOnTapOnboarding;
import com.yandex.go.flex.common.api.actions.a;
import com.yandex.go.flex.common.api.actions.n;
import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import com.yandex.go.payments.data.model.response.g;
import com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperiment;
import com.yandex.go.zone.dto.objects.AdjustConfig;
import com.yandex.go.zone.dto.objects.AdjustConfig$ConfigRule$$serializer;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import java.lang.annotation.Annotation;
import kotlin.random.Random;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.delivery.models.data.experiment.StepType;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;

/* loaded from: classes.dex */
public final /* synthetic */ class ar implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ar(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new o4o("com.yandex.go.dto.response.Action.SuperappSearch", h1.INSTANCE, new Annotation[0]);
            case 1:
                j1 j1Var = Action$TaxiExpectedDestination.Companion;
                return Action$TaxiExpectedDestination.Prefetch.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.dto.response.Action.TaxiExpectedDestination.Prefetch", Action$TaxiExpectedDestination.Prefetch.values(), new String[]{"route_eta", null}, new Annotation[][]{null, null});
            case 3:
                return new o4o("com.yandex.go.dto.response.Action.TaxiMainScreen", l1.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("com.yandex.go.dto.response.Action.TaxiProceed", m1.INSTANCE, new Annotation[0]);
            case 5:
                n1 n1Var = Action$WebApp.Companion;
                return Action$WebApp.WebAppType.Companion.serializer();
            case 6:
                ks ksVar = ls.Companion;
                return ButtonAction.Companion.serializer();
            case 7:
                ks ksVar2 = ls.Companion;
                return new p53(f37.a, 0);
            case 8:
                return Long.valueOf(System.currentTimeMillis());
            case 9:
                return new o4o("JustInteract", mv.INSTANCE, new Annotation[0]);
            case 10:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new p53(auu0Var, 0), 1);
            case 11:
                return vez0.g("com.yandex.go.dto.response.ActionType", ActionType.values(), new String[]{null, null, null, "taxi:route-input", "masstransit:route-input", "navigator", "superapp_search", Constants.DEEPLINK, "taxi:summary-redirect", "taxi_main_screen", "service_catalog", "discovery", "delivery_dashboard", "taxi:proceed", null, "city_mode", "intercity_main", "scooters_qr_scan", FoldersConfig.SUPPORT_FILTER_ID, "scooters_coupons", "scooters_passes", "scooters_super_passes", "scooters_active_super_passes", "scooters_insurance", "scooters_mos_ru", "chargers_qr_scan", "chargers_subscription", "chargers_dvizh_subscription", "plus_home", "chargers_partner_subscription", "chargers_passes", "chargers_discounts", "charity", "webapp", "sdc:route-selection", "open_tariff_card", "open_organization_list", "zoom_layers_feature", "scroll_up", "taxi:expected-destination", "orders_list", "yango_marketplace", "car_tech", "org_discovery"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 12:
                a aVar = ActionWithOnTapOnboarding.Companion;
                return n.Companion.serializer();
            case 13:
                return new pgu();
            case 14:
                return new qgu();
            case 15:
                Random.a.getClass();
                return Integer.valueOf(Random.b.c(2147418112) + 65536);
            case 16:
                rd0 rd0Var = qd0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 17:
                rd0 rd0Var2 = qd0.Companion;
                return new p53(od0.a, 0);
            case 18:
                return vez0.g("com.yandex.go.payments.data.model.response.AddPaymentMethodButton.AddButtonType", AddPaymentMethodButton.AddButtonType.values(), new String[]{"mbank_account", "sbp_token", "yape_token", "transport_card", "transport_external", "nequi_token", "fastshift_account", "jazzcash_wallet", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
            case 19:
                com.yandex.go.payments.experiments.a aVar2 = AddPaymentMethodButtonInMenuExperiment.Companion;
                return AddPaymentMethodButtonInMenuExperiment.PaymentMethodType.Companion.serializer();
            case 20:
                return vez0.g("com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperiment.PaymentMethodType", AddPaymentMethodButtonInMenuExperiment.PaymentMethodType.values(), new String[]{"card", "sbp_token"}, new Annotation[][]{null, null});
            case 21:
                g gVar = AddSbpTokenButtonDto.Companion;
                return AddSbpTokenButtonDto.StateType.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto.StateType", AddSbpTokenButtonDto.StateType.values(), new String[]{BackendConfig.Restrictions.ENABLED, "busy", BackendConfig.Restrictions.DISABLED}, new Annotation[][]{null, null, null});
            case 23:
                wn0 wn0Var = xn0.Companion;
                return StepType.Companion.serializer();
            case 24:
                b bVar = AddressDTO.Companion;
                return GeoObjectType.Companion.serializer();
            case 25:
                b bVar2 = AddressDTO.Companion;
                return new p53(auu0.a, 0);
            case 26:
                b bVar3 = AddressDTO.Companion;
                return EditAction.Companion.serializer();
            case 27:
                b bVar4 = AddressDTO.Companion;
                return new tmx(GeoObjectType.Companion.serializer());
            case 28:
                b bVar5 = AddressDTO.Companion;
                return new tmx(AddressFinalizeTrigger.Companion.serializer());
            default:
                com.yandex.go.zone.dto.objects.a aVar3 = AdjustConfig.Companion;
                return new p53(AdjustConfig$ConfigRule$$serializer.INSTANCE, 0);
        }
    }
}
