package defpackage;

import com.yandex.go.dto.response.ActionType;
import com.yandex.go.flex.common.api.actions.ShowOnboardingAction;
import com.yandex.go.flex.common.api.actions.m0;
import com.yandex.go.payments.paymentlist.experiments.change_payment_modal.ShowChangePaymentMethodOnSummaryExperiment;
import com.yandex.go.payments.paymentlist.experiments.change_payment_modal.g;
import com.yandex.go.payments.shared.SharedPaymentExperiment;
import com.yandex.go.payments.shared.SharedPaymentExperiment$AccountAction$$serializer;
import com.yandex.go.payments.shared.SharedPaymentExperiment$RawType$$serializer;
import com.yandex.go.payments.shared.SharedPaymentExperiment$RawTypeDescription$$serializer;
import com.yandex.go.payments.shared.k;
import com.yandex.go.payments.shared.n;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.ShortcutTitleSize;
import com.yandex.go.shortcuts.models.ShortcutClickAction;
import com.yandex.go.shortcuts.models.ShortcutClickInfo;
import com.yandex.go.shortcuts.models.a;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.ServiceLevel$TariffCard$Bullet$$serializer;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.y4;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.eatskit.dto.ServicePromo;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.persuggest.api.ShouldFinalizeEvent;
import ru.yandex.taxi.shortcuts.dto.response.AuthType;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceManifest;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes8.dex */
public final /* synthetic */ class dwq0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ dwq0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                y4 y4Var = ServiceLevel.TariffCard.Companion;
                return new p53(ServiceLevel$TariffCard$Bullet$$serializer.INSTANCE, 0);
            case 1:
                return new o4o("com.yandex.go.zone.dto.objects.ServiceLevelWidget.Unsupported", e5.INSTANCE, new Annotation[0]);
            case 2:
                owq0 owq0Var = ServiceManifest.Companion;
                return ServiceManifest.Type.Companion.serializer();
            case 3:
                return vez0.g("ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceManifest.Type", ServiceManifest.Type.values(), new String[]{"unknown", "eatskit"}, new Annotation[][]{null, null});
            case 4:
                twq0 twq0Var = uwq0.Companion;
                return ServicePromo.Companion.serializer();
            case 5:
                twq0 twq0Var2 = uwq0.Companion;
                return AuthType.Companion.serializer();
            case 6:
                twq0 twq0Var3 = uwq0.Companion;
                return RequiredAccount.Companion.serializer();
            case 7:
                twq0 twq0Var4 = uwq0.Companion;
                return WebViewThemeChangeMode.Companion.serializer();
            case 8:
                return vez0.g("ru.yandex.taxi.eatskit.dto.ServicePromo", ServicePromo.values(), new String[]{"stories", "banner"}, new Annotation[][]{null, null});
            case 9:
                t7r0 t7r0Var = u7r0.Companion;
                return new p53(qke.n(q5r0.Companion.serializer()), 0);
            case 10:
                return nir0.Companion.serializer();
            case 11:
                return nir0.Companion.serializer();
            case 12:
                return nir0.Companion.serializer();
            case 13:
                return nir0.Companion.serializer();
            case 14:
                return new o4o("HalfHeight", mir0.INSTANCE, new Annotation[0]);
            case 15:
                return new wir0(nhr0.a, nhr0.b, nhr0.c, nhr0.d, nhr0.f);
            case 16:
                k kVar = SharedPaymentExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 17:
                k kVar2 = SharedPaymentExperiment.Companion;
                return new p53(SharedPaymentExperiment$RawType$$serializer.INSTANCE, 0);
            case 18:
                n nVar = SharedPaymentExperiment.RawType.Companion;
                return new p53(SharedPaymentExperiment$RawTypeDescription$$serializer.INSTANCE, 0);
            case 19:
                n nVar2 = SharedPaymentExperiment.RawType.Companion;
                return new p53(SharedPaymentExperiment$AccountAction$$serializer.INSTANCE, 0);
            case 20:
                return new tmx(ActionType.Companion.serializer());
            case 21:
                a aVar = ShortcutClickInfo.Companion;
                return ShortcutClickAction.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.shortcuts.dto.response.ShortcutIconSize", ShortcutIconSize.values(), new String[]{"medium", "big"}, new Annotation[][]{null, null});
            case 23:
                return vez0.g("com.yandex.go.shortcuts.dto.response.ShortcutTitleSize", ShortcutTitleSize.values(), new String[]{"regular", "extended"}, new Annotation[][]{null, null});
            case 24:
                return vez0.g("ru.yandex.taxi.persuggest.api.ShouldFinalizeEvent", ShouldFinalizeEvent.values(), new String[]{"tariff_changed", "requirements_changed"}, new Annotation[][]{null, null});
            case 25:
                g gVar = ShowChangePaymentMethodOnSummaryExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 26:
                g gVar2 = ShowChangePaymentMethodOnSummaryExperiment.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 27:
                g gVar3 = ShowChangePaymentMethodOnSummaryExperiment.Companion;
                return new p53(PaymentMethod$Type.Companion.serializer(), 0);
            case 28:
                return new o4o("com.yandex.go.flex.common.api.actions.ShowErrorDocument", r6s0.INSTANCE, new Annotation[0]);
            default:
                m0 m0Var = ShowOnboardingAction.Companion;
                return new oke(qoi0.a(FormattedText.class), w7s.a, new KSerializer[0]);
        }
    }
}
