package defpackage;

import com.yandex.go.blockeduser.data.EnableBlockedUserFlowExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class ppp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("superapp_check_blocks_on_client", EnableBlockedUserFlowExperiment.class, new jnp(28), ExperimentSource.LAUNCH, true);
    }
}
