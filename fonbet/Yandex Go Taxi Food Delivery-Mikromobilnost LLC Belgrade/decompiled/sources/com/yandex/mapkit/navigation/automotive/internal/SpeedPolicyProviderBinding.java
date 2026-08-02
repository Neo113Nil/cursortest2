package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.navigation.automotive.SpeedLimitsPolicy;
import com.yandex.mapkit.navigation.automotive.SpeedPolicyListener;
import com.yandex.mapkit.navigation.automotive.SpeedPolicyProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class SpeedPolicyProviderBinding implements SpeedPolicyProvider {
    private final NativeObject nativeObject;
    protected Subscription<SpeedPolicyListener> speedPolicyListenerSubscription = new Subscription<SpeedPolicyListener>(this) { // from class: com.yandex.mapkit.navigation.automotive.internal.SpeedPolicyProviderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(SpeedPolicyListener speedPolicyListener) {
            return SpeedPolicyProviderBinding.createSpeedPolicyListener(speedPolicyListener);
        }
    };

    public SpeedPolicyProviderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSpeedPolicyListener(SpeedPolicyListener speedPolicyListener);

    @Override // com.yandex.mapkit.navigation.automotive.SpeedPolicyProvider
    public native void addListener(SpeedPolicyListener speedPolicyListener);

    @Override // com.yandex.mapkit.navigation.automotive.SpeedPolicyProvider
    public native SpeedLimitsPolicy getSpeedLimitsPolicy();

    @Override // com.yandex.mapkit.navigation.automotive.SpeedPolicyProvider
    public native void removeListener(SpeedPolicyListener speedPolicyListener);

    @Override // com.yandex.mapkit.navigation.automotive.SpeedPolicyProvider
    public native void updateSpeedLimitsPolicy(Point point);
}
