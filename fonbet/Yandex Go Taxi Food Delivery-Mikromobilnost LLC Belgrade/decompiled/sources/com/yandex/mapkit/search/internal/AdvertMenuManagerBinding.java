package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.AdvertMenuInfo;
import com.yandex.mapkit.search.AdvertMenuListener;
import com.yandex.mapkit.search.AdvertMenuManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class AdvertMenuManagerBinding implements AdvertMenuManager {
    protected Subscription<AdvertMenuListener> advertMenuListenerSubscription = new Subscription<AdvertMenuListener>(this) { // from class: com.yandex.mapkit.search.internal.AdvertMenuManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AdvertMenuListener advertMenuListener) {
            return AdvertMenuManagerBinding.createAdvertMenuListener(advertMenuListener);
        }
    };
    private final NativeObject nativeObject;

    public AdvertMenuManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAdvertMenuListener(AdvertMenuListener advertMenuListener);

    @Override // com.yandex.mapkit.search.AdvertMenuManager
    public native void addListener(AdvertMenuListener advertMenuListener);

    @Override // com.yandex.mapkit.search.AdvertMenuManager
    public native AdvertMenuInfo getAdvertMenuInfo();

    @Override // com.yandex.mapkit.search.AdvertMenuManager
    public native void removeListener(AdvertMenuListener advertMenuListener);

    @Override // com.yandex.mapkit.search.AdvertMenuManager
    public native void setPosition(Point point);
}
