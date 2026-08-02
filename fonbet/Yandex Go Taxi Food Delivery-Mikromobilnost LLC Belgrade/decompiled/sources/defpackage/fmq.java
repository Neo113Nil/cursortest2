package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.user_profile.settings.profile.data.LogoutAvailabilityForServiceOrdersExperiment;

/* loaded from: classes9.dex */
public final class fmq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("logout_availability_for_services_orders", LogoutAvailabilityForServiceOrdersExperiment.class, new xiq(20), ExperimentSource.LAUNCH, false);
    }
}
