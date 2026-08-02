package defpackage;

import com.yandex.go.address.address_map_picker.experiment.AddressMapPickerExperiment;
import com.yandex.go.address.search.perf.experiment.SuggestsPerformanceOptimizationExperiment;
import com.yandex.go.ads.mobile_ads_sdk.data.experiment.MobileAdsSdkOptionsExperiment;
import com.yandex.go.ads.prefetch.impl.AdvertPrefetchExperiment;
import com.yandex.go.agreement.photoupload.experiments.PhotoUploadEulaExperiment;
import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment;
import com.yandex.go.antirobot.experiment.AntirobotExperiment;
import com.yandex.go.app.icon.experiments.AppDynamicIconExperiment;
import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import com.yandex.go.beginners.experiments.BeginnersOnboardingExperiment;
import com.yandex.go.beginners.safety.experiments.DisableSafetyNewbiesRegistrationActionCheckExperiment;
import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterLoyaltyViewAvailabilityExperiment;
import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterTitleExperiment;
import com.yandex.go.blockeduser.data.EnableBlockedUserFlowExperiment;
import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import com.yandex.go.lifecycle.experiments.AppLifecycleLcpExperiment;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.panorama.d;

/* loaded from: classes9.dex */
public final /* synthetic */ class jnp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jnp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return usr0.Companion.serializer();
            case 1:
                return qd0.Companion.serializer();
            case 2:
                return AddressMapPickerExperiment.Companion.serializer();
            case 3:
                return ir40.Companion.serializer();
            case 4:
                return d.Companion.serializer();
            case 5:
                return q3o.Companion.serializer();
            case 6:
                return tgd.Companion.serializer();
            case 7:
                return e1c0.Companion.serializer();
            case 8:
                return tb80.Companion.serializer();
            case 9:
                return SuggestsPerformanceOptimizationExperiment.Companion.serializer();
            case 10:
                return wd60.Companion.serializer();
            case 11:
                return kks.Companion.serializer();
            case 12:
                return NewbiesRedesignPointsABExperiment.Companion.serializer();
            case 13:
                return MobileAdsSdkOptionsExperiment.Companion.serializer();
            case 14:
                return AdvertPrefetchExperiment.Companion.serializer();
            case 15:
                return PhotoUploadEulaExperiment.Companion.serializer();
            case 16:
                return InAppRealtimeAnalyticsExperiment.Companion.serializer();
            case 17:
                return RythmEventGroupsExperiment.Companion.serializer();
            case 18:
                return b3w.Companion.serializer();
            case 19:
                return AntirobotExperiment.Companion.serializer();
            case 20:
                return AppDynamicIconExperiment.Companion.serializer();
            case 21:
                return AppLifecycleLcpExperiment.Companion.serializer();
            case 22:
                return SafetyNewbiesVerificationExperiment.Companion.serializer();
            case 23:
                return BeginnersAuthPostloadExperiment.Companion.serializer();
            case 24:
                return DisableSafetyNewbiesRegistrationActionCheckExperiment.Companion.serializer();
            case 25:
                return BeginnersOnboardingExperiment.Companion.serializer();
            case 26:
                return BenefitsCenterLoyaltyViewAvailabilityExperiment.Companion.serializer();
            case 27:
                return BenefitsCenterTitleExperiment.Companion.serializer();
            case 28:
                return EnableBlockedUserFlowExperiment.Companion.serializer();
            default:
                return BlurConfigurationExperiment.Companion.serializer();
        }
    }
}
