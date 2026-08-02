package com.yandex.mapkit.experiments.internal;

import com.yandex.mapkit.experiments.ExternalExperimentsManager;
import com.yandex.mapkit.experiments.SetExperimentsErrorListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.config.ExternalExperimentalParameter;
import java.util.List;

/* loaded from: classes8.dex */
public class ExternalExperimentsManagerBinding implements ExternalExperimentsManager {
    private final NativeObject nativeObject;

    public ExternalExperimentsManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.experiments.ExternalExperimentsManager
    public native boolean isValid();

    @Override // com.yandex.mapkit.experiments.ExternalExperimentsManager
    public native void requestUpdate();

    @Override // com.yandex.mapkit.experiments.ExternalExperimentsManager
    public native void setStickyExperimentsByTestIds(List<Integer> list, SetExperimentsErrorListener setExperimentsErrorListener);

    @Override // com.yandex.mapkit.experiments.ExternalExperimentsManager
    public native void setValues(List<ExternalExperimentalParameter> list);
}
