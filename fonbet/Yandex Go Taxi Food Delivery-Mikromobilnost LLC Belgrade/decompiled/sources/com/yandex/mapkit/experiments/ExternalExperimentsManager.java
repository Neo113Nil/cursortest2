package com.yandex.mapkit.experiments;

import com.yandex.runtime.config.ExternalExperimentalParameter;
import java.util.List;

/* loaded from: classes6.dex */
public interface ExternalExperimentsManager {
    boolean isValid();

    void requestUpdate();

    void setStickyExperimentsByTestIds(List<Integer> list, SetExperimentsErrorListener setExperimentsErrorListener);

    void setValues(List<ExternalExperimentalParameter> list);
}
