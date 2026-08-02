package com.yandex.mapkit.location.external_providers.internal;

import com.yandex.mapkit.location.external_providers.LocationProvider;
import com.yandex.mapkit.location.external_providers.LocationProviderListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class LocationProviderBinding implements LocationProvider {
    protected Subscription<LocationProviderListener> locationProviderListenerSubscription = new Subscription<LocationProviderListener>(this) { // from class: com.yandex.mapkit.location.external_providers.internal.LocationProviderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(LocationProviderListener locationProviderListener) {
            return LocationProviderBinding.createLocationProviderListener(locationProviderListener);
        }
    };
    private final NativeObject nativeObject;

    public LocationProviderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createLocationProviderListener(LocationProviderListener locationProviderListener);

    @Override // com.yandex.mapkit.location.external_providers.LocationProvider
    public native void resume();

    @Override // com.yandex.mapkit.location.external_providers.LocationProvider
    public native void subscribe(LocationProviderListener locationProviderListener);

    @Override // com.yandex.mapkit.location.external_providers.LocationProvider
    public native void suspend();

    @Override // com.yandex.mapkit.location.external_providers.LocationProvider
    public native void unsubscribe(LocationProviderListener locationProviderListener);
}
