package com.yandex.mapkit.navigation.automotive;

/* loaded from: classes7.dex */
public interface SpeedLimitsPolicy {
    SpeedLimits customSpeedLimits(double d);

    SpeedLimits getLegalSpeedLimits();

    SpeedLimitsRules getSpeedLimitsRules();
}
