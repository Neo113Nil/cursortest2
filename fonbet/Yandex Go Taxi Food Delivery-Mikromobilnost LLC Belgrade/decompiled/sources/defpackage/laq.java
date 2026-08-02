package defpackage;

import com.yandex.go.preorder.suggested.menu.experiment.SuggestMenuExperiment;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferExperiment;
import com.yandex.go.scooters.data.model.ScootersLegalTermsExperiment;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import com.yandex.go.settings.email.EmailRequireExperiment;
import com.yandex.go.settings.experiments.SuperAppConfigAppSettingsExperiment;
import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import com.yandex.go.shortcuts.experiments.superapp_flow.SuperAppFlowExperiment;
import com.yandex.go.shortcuts.impl.experiments.OrderNotificationsSettingsExperiment;
import com.yandex.go.shortcuts.impl.experiments.SuperAppShortcutsExperiment;
import com.yandex.go.shortcuts.impl.experiments.SuperappCurrentModeSettingsExperiment;
import com.yandex.go.shortcuts.impl.experiments.SuperappFlowRequestsDistanceThreshold;
import com.yandex.go.shortcuts.impl.experiments.TurboButtonExperiment;
import com.yandex.go.shortcuts.impl.next.button.NextButtonInShortcut;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import com.yandex.go.special_needs_menu.experiment.SpecialNeedsMenuItemExperiment;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment;
import com.yandex.go.splash.v2.SplashScreenV2Experiment;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestCartButtonExperiment;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestGeoDependentExperiment;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class laq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ laq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ScootersLegalTermsExperiment.Companion.serializer();
            case 1:
                return ScootersSurgeExperiment.Companion.serializer();
            case 2:
                return ScootersAlternativeOfferExperiment.Companion.serializer();
            case 3:
                return ScootersOnboardingExperiment.Companion.serializer();
            case 4:
                return ScootersQrUnavailableScooterExperiment.Companion.serializer();
            case 5:
                return ml50.Companion.serializer();
            case 6:
                return SuperAppConfigAppSettingsExperiment.Companion.serializer();
            case 7:
                return InAppOnlySettingsToggleExperiment.Companion.serializer();
            case 8:
                return EmailRequireExperiment.Companion.serializer();
            case 9:
                return v0t.Companion.serializer();
            case 10:
                return ljr0.Companion.serializer();
            case 11:
                return SuperAppFlowExperiment.Companion.serializer();
            case 12:
                return OrderShortcutsParamsExperiment.Companion.serializer();
            case 13:
                return TurboButtonExperiment.Companion.serializer();
            case 14:
                return SuperappFlowRequestsDistanceThreshold.Companion.serializer();
            case 15:
                return SuperappCurrentModeSettingsExperiment.Companion.serializer();
            case 16:
                return NextButtonInShortcut.Companion.serializer();
            case 17:
                return OrderNotificationsSettingsExperiment.Companion.serializer();
            case 18:
                return SuperAppShortcutsExperiment.Companion.serializer();
            case 19:
                return SomethingWrongScreenExperiment.Companion.serializer();
            case 20:
                return SpecialNeedsMenuItemExperiment.Companion.serializer();
            case 21:
                return SplashScreenV2Experiment.Companion.serializer();
            case 22:
                return AnimatedSplashScreenExperiment.Companion.serializer();
            case 23:
                return b9p.Companion.serializer();
            case 24:
                return DarkThemeSwitchExperiment.Companion.serializer();
            case 25:
                return SuperappSuggestCartButtonExperiment.Companion.serializer();
            case 26:
                return SuperappSuggestExperiment.Companion.serializer();
            case 27:
                return SuperappSuggestGeoDependentExperiment.Companion.serializer();
            case 28:
                return SuggestMenuExperiment.Companion.serializer();
            default:
                return wav0.Companion.serializer();
        }
    }
}
