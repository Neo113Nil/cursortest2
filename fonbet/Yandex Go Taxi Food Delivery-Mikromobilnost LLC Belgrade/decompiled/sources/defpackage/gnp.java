package defpackage;

import com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class gnp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("force_phonish_account_upgrade", ForcePhonishUpgradeExperiment.class, new fsn(28), ExperimentSource.LAUNCH, true);
    }
}
