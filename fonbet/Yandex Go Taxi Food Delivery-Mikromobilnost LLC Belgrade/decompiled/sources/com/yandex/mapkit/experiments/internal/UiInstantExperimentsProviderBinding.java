package com.yandex.mapkit.experiments.internal;

import com.yandex.mapkit.experiments.UiExperimentsListener;
import com.yandex.mapkit.experiments.UiInstantExperimentsProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.Map;

/* loaded from: classes15.dex */
public class UiInstantExperimentsProviderBinding implements UiInstantExperimentsProvider {
    private final NativeObject nativeObject;
    protected Subscription<UiExperimentsListener> uiExperimentsListenerSubscription = new Subscription<UiExperimentsListener>(this) { // from class: com.yandex.mapkit.experiments.internal.UiInstantExperimentsProviderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(UiExperimentsListener uiExperimentsListener) {
            return UiInstantExperimentsProviderBinding.createUiExperimentsListener(uiExperimentsListener);
        }
    };

    public UiInstantExperimentsProviderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUiExperimentsListener(UiExperimentsListener uiExperimentsListener);

    @Override // com.yandex.mapkit.experiments.UiInstantExperimentsProvider
    public native Map<String, String> getParameters();

    @Override // com.yandex.mapkit.experiments.UiInstantExperimentsProvider
    public native boolean isValid();

    @Override // com.yandex.mapkit.experiments.UiInstantExperimentsProvider
    public native void subscribe(UiExperimentsListener uiExperimentsListener);

    @Override // com.yandex.mapkit.experiments.UiInstantExperimentsProvider
    public native void unsubscribe(UiExperimentsListener uiExperimentsListener);
}
