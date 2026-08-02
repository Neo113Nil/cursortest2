package com.yandex.mapkit.experiments;

import com.yandex.runtime.config.ExperimentData;
import com.yandex.runtime.config.UIExperiment;
import java.util.List;

/* loaded from: classes15.dex */
public interface UiExperimentsProvider {
    List<UIExperiment> getExperiments();

    boolean isValid();

    void setAppliedExperiments(List<ExperimentData> list);

    void subscribe(UiExperimentsListener uiExperimentsListener);

    void unsubscribe(UiExperimentsListener uiExperimentsListener);
}
