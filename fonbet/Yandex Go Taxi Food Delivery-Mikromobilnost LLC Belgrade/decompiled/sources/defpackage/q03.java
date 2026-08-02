package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterTitleExperiment;
import com.yandex.go.benefits_center.benefits.sdk.actions.ActivateTaxiPromoCodeAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ActivateTaxiPromoCodeAction$$serializer;
import com.yandex.go.benefits_center.benefits.sdk.actions.ClaimBenefitAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ClaimBenefitAction$$serializer;
import com.yandex.go.benefits_center.benefits.sdk.actions.DeactivateTaxiPromoCodeAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.DeactivateTaxiPromoCodeAction$$serializer;
import com.yandex.go.benefits_center.benefits.sdk.actions.OpenActivatingScreenAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.OpenActivatingScreenAction$$serializer;
import com.yandex.go.benefits_center.benefits.sdk.actions.ScootersUseAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ScootersUseAction$$serializer;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowNotificationAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowNotificationAction$$serializer;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowTicketBannerAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowTicketBannerAction$$serializer;
import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import com.yandex.go.blur.experiments.a;
import com.yandex.go.payments.data.model.PaymentMethodsBankIcons$$serializer;
import com.yandex.go.payments.domain.BankModel;
import com.yandex.go.payments.domain.b;
import com.yandex.go.zone.dto.objects.AuctionConditionalSliderSettings$$serializer;
import com.yandex.go.zone.dto.objects.AuctionDisplaySettings;
import com.yandex.go.zone.dto.objects.e;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.c;
import ru.yandex.taxi.communications.api.dto.d;
import ru.yandex.taxi.communications.api.dto.g;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;
import ru.yandex.taxi.persuggest.api.MainScreenVersion;
import ru.yandex.taxi.shortcuts.dto.response.AuthType;

/* loaded from: classes9.dex */
public final /* synthetic */ class q03 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ q03(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                t03 t03Var = v03.Companion;
                return MainScreenVersion.Companion.serializer();
            case 1:
                t03 t03Var2 = v03.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 2:
                t03 t03Var3 = v03.Companion;
                return new p53(ugb0.a, 0);
            case 3:
                t03 t03Var4 = v03.Companion;
                return new p53(c9r.e, 0);
            case 4:
                return new o4o("ru.yandex.taxi.delivery.experiments.Attribute.Postcard", pc3.INSTANCE, new Annotation[0]);
            case 5:
                return new o4o("ru.yandex.taxi.delivery.experiments.Attribute.Unknown", tc3.INSTANCE, new Annotation[0]);
            case 6:
                e eVar = AuctionDisplaySettings.Companion;
                return new p53(AuctionConditionalSliderSettings$$serializer.INSTANCE, 0);
            case 7:
                return vez0.g("ru.yandex.taxi.shortcuts.dto.response.AuthType", AuthType.values(), new String[]{"cookies_auth", "oauth_token"}, new Annotation[][]{null, null});
            case 8:
                a34 a34Var = AutoUpdateUserLocationStrategyExperiment.Companion;
                return AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.Companion.serializer();
            case 9:
                a34 a34Var2 = AutoUpdateUserLocationStrategyExperiment.Companion;
                return AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.Companion.serializer();
            case 10:
                return vez0.g("ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType", AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.values(), new String[]{"throttle_strategy", "time_interval_strategy", "warmup_cooldown_strategy"}, new Annotation[][]{null, null, null});
            case 11:
                ma4 ma4Var = na4.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 12:
                ma4 ma4Var2 = na4.Companion;
                return new p53(auu0.a, 1);
            case 13:
                b bVar = BankModel.Companion;
                return new k8u(auu0.a, PaymentMethodsBankIcons$$serializer.INSTANCE, 1);
            case 14:
                kt4 kt4Var = BannerWidgets.Companion;
                return new p53(d.a, 0);
            case 15:
                c cVar = BannerWidgets.a.Companion;
                return BannerWidgets.ActionType.Companion.serializer();
            case 16:
                ru.yandex.taxi.communications.api.dto.e eVar2 = BannerWidgets.b.Companion;
                return new p53(auu0.a, 1);
            case 17:
                ru.yandex.taxi.communications.api.dto.e eVar3 = BannerWidgets.b.Companion;
                return new p53(pt4.e, 0);
            case 18:
                ru.yandex.taxi.communications.api.dto.e eVar4 = BannerWidgets.b.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 19:
                g gVar = BannerWidgets.c.Companion;
                return BannerWidgets.NamedActionType.Companion.serializer();
            case 20:
                return vez0.g("ru.yandex.taxi.communications.api.dto.BannerWidgets.ActionType", BannerWidgets.ActionType.values(), new String[]{Constants.DEEPLINK, "web_view", "clipboard_copy", "named", "save_benefit", "deactivate_promo"}, new Annotation[][]{null, null, null, null, null, null});
            case 21:
                return vez0.g("ru.yandex.taxi.communications.api.dto.BannerWidgets.NamedActionType", BannerWidgets.NamedActionType.values(), new String[]{"scooters_use", "taxi_use", null}, new Annotation[][]{null, null, null});
            case 22:
                return new puc();
            case 23:
                return kotlin.collections.b.f();
            case 24:
                return new ssp0("com.yandex.go.benefits_center.benefits.sdk.actions.BenefitsCenterActions", qoi0.a(com.yandex.go.benefits_center.benefits.sdk.actions.c.class), new lfx[]{qoi0.a(ActivateTaxiPromoCodeAction.class), qoi0.a(ClaimBenefitAction.class), qoi0.a(DeactivateTaxiPromoCodeAction.class), qoi0.a(OpenActivatingScreenAction.class), qoi0.a(ScootersUseAction.class), qoi0.a(ShowNotificationAction.class), qoi0.a(ShowTicketBannerAction.class)}, new KSerializer[]{ActivateTaxiPromoCodeAction$$serializer.INSTANCE, ClaimBenefitAction$$serializer.INSTANCE, DeactivateTaxiPromoCodeAction$$serializer.INSTANCE, OpenActivatingScreenAction$$serializer.INSTANCE, ScootersUseAction$$serializer.INSTANCE, ShowNotificationAction$$serializer.INSTANCE, ShowTicketBannerAction$$serializer.INSTANCE}, new Annotation[0]);
            case 25:
                return new o4o("com.yandex.go.benefits_center.benefits.sdk.scaffold.BenefitsCenterPreviewScaffold", un5.INSTANCE, new Annotation[0]);
            case 26:
                com.yandex.go.benefits_center.benefits.data.experiment.b bVar2 = BenefitsCenterTitleExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 27:
                return m16.b;
            case 28:
                j56 j56Var = k56.Companion;
                return new p53(t46.a, 0);
            default:
                a aVar = BlurConfigurationExperiment.AgslRenderEffect.Companion;
                return BlurConfigurationExperiment.DevicePerformanceClass.Companion.serializer();
        }
    }
}
