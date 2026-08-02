package com.yandex.passport.common.resources;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/common/resources/DeviceDensity;", "", "LOW", "MEDIUM", "HIGH", "EXTRA_HIGH", "EXTRA_EXTRA_HIGH", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeviceDensity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeviceDensity[] $VALUES;
    public static final DeviceDensity EXTRA_EXTRA_HIGH;
    public static final DeviceDensity EXTRA_HIGH;
    public static final DeviceDensity HIGH;
    public static final DeviceDensity LOW;
    public static final DeviceDensity MEDIUM;

    static {
        DeviceDensity deviceDensity = new DeviceDensity("LOW", 0);
        LOW = deviceDensity;
        DeviceDensity deviceDensity2 = new DeviceDensity("MEDIUM", 1);
        MEDIUM = deviceDensity2;
        DeviceDensity deviceDensity3 = new DeviceDensity("HIGH", 2);
        HIGH = deviceDensity3;
        DeviceDensity deviceDensity4 = new DeviceDensity("EXTRA_HIGH", 3);
        EXTRA_HIGH = deviceDensity4;
        DeviceDensity deviceDensity5 = new DeviceDensity("EXTRA_EXTRA_HIGH", 4);
        EXTRA_EXTRA_HIGH = deviceDensity5;
        DeviceDensity[] deviceDensityArr = {deviceDensity, deviceDensity2, deviceDensity3, deviceDensity4, deviceDensity5};
        $VALUES = deviceDensityArr;
        $ENTRIES = kotlin.enums.a.a(deviceDensityArr);
    }

    public static DeviceDensity valueOf(String str) {
        return (DeviceDensity) Enum.valueOf(DeviceDensity.class, str);
    }

    public static DeviceDensity[] values() {
        return (DeviceDensity[]) $VALUES.clone();
    }
}
