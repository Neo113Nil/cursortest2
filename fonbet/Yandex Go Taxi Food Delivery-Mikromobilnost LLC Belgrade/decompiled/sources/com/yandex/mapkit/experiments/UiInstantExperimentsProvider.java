package com.yandex.mapkit.experiments;

import java.util.Map;

/* loaded from: classes15.dex */
public interface UiInstantExperimentsProvider {
    Map<String, String> getParameters();

    boolean isValid();

    void subscribe(UiExperimentsListener uiExperimentsListener);

    void unsubscribe(UiExperimentsListener uiExperimentsListener);
}
