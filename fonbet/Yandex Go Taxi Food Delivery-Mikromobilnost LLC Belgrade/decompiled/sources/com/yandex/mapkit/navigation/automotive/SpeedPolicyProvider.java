package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes15.dex */
public interface SpeedPolicyProvider {
    void addListener(SpeedPolicyListener speedPolicyListener);

    SpeedLimitsPolicy getSpeedLimitsPolicy();

    void removeListener(SpeedPolicyListener speedPolicyListener);

    void updateSpeedLimitsPolicy(Point point);
}
