package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.search.BillboardListener;
import com.yandex.mapkit.search.BillboardWindowManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class BillboardWindowManagerBinding implements BillboardWindowManager {
    protected Subscription<BillboardListener> billboardListenerSubscription = new Subscription<BillboardListener>(this) { // from class: com.yandex.mapkit.search.internal.BillboardWindowManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(BillboardListener billboardListener) {
            return BillboardWindowManagerBinding.createBillboardListener(billboardListener);
        }
    };
    private final NativeObject nativeObject;

    public BillboardWindowManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createBillboardListener(BillboardListener billboardListener);

    @Override // com.yandex.mapkit.search.BillboardWindowManager
    public native void addListener(BillboardListener billboardListener);

    @Override // com.yandex.mapkit.search.BillboardWindowManager
    public native List<GeoObject> getAdvertObjects();

    @Override // com.yandex.mapkit.search.BillboardWindowManager
    public native void removeListener(BillboardListener billboardListener);

    @Override // com.yandex.mapkit.search.BillboardWindowManager
    public native void resetSearchArea();

    @Override // com.yandex.mapkit.search.BillboardWindowManager
    public native void setSearchArea(BoundingBox boundingBox);
}
