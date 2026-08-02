package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.search.AdvertRouteListener;
import com.yandex.mapkit.search.BillboardRouteManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class BillboardRouteManagerBinding implements BillboardRouteManager {
    protected Subscription<AdvertRouteListener> advertRouteListenerSubscription = new Subscription<AdvertRouteListener>(this) { // from class: com.yandex.mapkit.search.internal.BillboardRouteManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AdvertRouteListener advertRouteListener) {
            return BillboardRouteManagerBinding.createAdvertRouteListener(advertRouteListener);
        }
    };
    private final NativeObject nativeObject;

    public BillboardRouteManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAdvertRouteListener(AdvertRouteListener advertRouteListener);

    @Override // com.yandex.mapkit.search.BillboardRouteManager
    public native void addListener(AdvertRouteListener advertRouteListener);

    @Override // com.yandex.mapkit.search.BillboardRouteManager
    public native List<GeoObject> getAdvertObjects();

    @Override // com.yandex.mapkit.search.BillboardRouteManager
    public native void removeListener(AdvertRouteListener advertRouteListener);

    @Override // com.yandex.mapkit.search.BillboardRouteManager
    public native void resetRoute();

    @Override // com.yandex.mapkit.search.BillboardRouteManager
    public native void setRoute(Polyline polyline);

    @Override // com.yandex.mapkit.search.BillboardRouteManager
    public native void setRoutePosition(PolylinePosition polylinePosition);
}
