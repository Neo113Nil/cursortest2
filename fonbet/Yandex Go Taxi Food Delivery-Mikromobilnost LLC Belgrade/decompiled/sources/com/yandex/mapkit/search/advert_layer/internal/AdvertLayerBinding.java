package com.yandex.mapkit.search.advert_layer.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.search.advert_layer.AdvertLayer;
import com.yandex.mapkit.search.advert_layer.AdvertLayerListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class AdvertLayerBinding implements AdvertLayer {
    protected Subscription<AdvertLayerListener> advertLayerListenerSubscription = new Subscription<AdvertLayerListener>(this) { // from class: com.yandex.mapkit.search.advert_layer.internal.AdvertLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AdvertLayerListener advertLayerListener) {
            return AdvertLayerBinding.createAdvertLayerListener(advertLayerListener);
        }
    };
    private final NativeObject nativeObject;

    public AdvertLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAdvertLayerListener(AdvertLayerListener advertLayerListener);

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void addListener(AdvertLayerListener advertLayerListener);

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void clearSelection();

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void removeListener(AdvertLayerListener advertLayerListener);

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void resetRoute();

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void setRoute(Polyline polyline);

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void setRoutePosition(PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayer
    public native void showLabels(boolean z);
}
