package com.yandex.mapkit.experiments.internal;

import com.yandex.mapkit.experiments.UiExperimentsListener;
import com.yandex.mapkit.experiments.UiExperimentsProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.config.ExperimentData;
import com.yandex.runtime.config.UIExperiment;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class UiExperimentsProviderBinding implements UiExperimentsProvider {
    private final NativeObject nativeObject;
    protected Subscription<UiExperimentsListener> uiExperimentsListenerSubscription = new Subscription<UiExperimentsListener>(this) { // from class: com.yandex.mapkit.experiments.internal.UiExperimentsProviderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(UiExperimentsListener uiExperimentsListener) {
            return UiExperimentsProviderBinding.createUiExperimentsListener(uiExperimentsListener);
        }
    };

    public UiExperimentsProviderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUiExperimentsListener(UiExperimentsListener uiExperimentsListener);

    @Override // com.yandex.mapkit.experiments.UiExperimentsProvider
    public native List<UIExperiment> getExperiments();

    @Override // com.yandex.mapkit.experiments.UiExperimentsProvider
    public native boolean isValid();

    @Override // com.yandex.mapkit.experiments.UiExperimentsProvider
    public native void setAppliedExperiments(List<ExperimentData> list);

    @Override // com.yandex.mapkit.experiments.UiExperimentsProvider
    public native void subscribe(UiExperimentsListener uiExperimentsListener);

    @Override // com.yandex.mapkit.experiments.UiExperimentsProvider
    public native void unsubscribe(UiExperimentsListener uiExperimentsListener);
}
