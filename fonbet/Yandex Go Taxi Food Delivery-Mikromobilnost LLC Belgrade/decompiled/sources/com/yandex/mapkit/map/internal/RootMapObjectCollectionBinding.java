package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.PlacemarkVisibilityListener;
import com.yandex.mapkit.map.RootMapObjectCollection;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes8.dex */
public class RootMapObjectCollectionBinding extends MapObjectCollectionBinding implements RootMapObjectCollection {
    protected Subscription<PlacemarkVisibilityListener> placemarkVisibilityListenerSubscription;

    public RootMapObjectCollectionBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.placemarkVisibilityListenerSubscription = new Subscription<PlacemarkVisibilityListener>(this) { // from class: com.yandex.mapkit.map.internal.RootMapObjectCollectionBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(PlacemarkVisibilityListener placemarkVisibilityListener) {
                return RootMapObjectCollectionBinding.createPlacemarkVisibilityListener(placemarkVisibilityListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createPlacemarkVisibilityListener(PlacemarkVisibilityListener placemarkVisibilityListener);

    @Override // com.yandex.mapkit.map.RootMapObjectCollection
    public native void addPlacemarkVisibilityListener(PlacemarkVisibilityListener placemarkVisibilityListener);

    @Override // com.yandex.mapkit.map.RootMapObjectCollection
    public native ConflictResolutionMode getConflictResolutionMode();

    @Override // com.yandex.mapkit.map.RootMapObjectCollection
    public native void removePlacemarkVisibilityListener(PlacemarkVisibilityListener placemarkVisibilityListener);

    @Override // com.yandex.mapkit.map.RootMapObjectCollection
    public native void setConflictResolutionMode(ConflictResolutionMode conflictResolutionMode);
}
