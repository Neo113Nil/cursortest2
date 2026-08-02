package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;

/* loaded from: classes9.dex */
public final class fkq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("feed_state_settings", TaxiOrderFeedStateSettingsExperiment.class, new iiq(21), ExperimentSource.ROUTESTATS, true);
    }
}
