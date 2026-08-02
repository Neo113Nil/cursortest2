package com.yandex.go.pickup_from_photo.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/pickup_from_photo/data/OrientationAccuracy;", "", "HIGH", "MEDIUM", "LOW", "UNRELIABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrientationAccuracy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrientationAccuracy[] $VALUES;
    public static final OrientationAccuracy HIGH;
    public static final OrientationAccuracy LOW;
    public static final OrientationAccuracy MEDIUM;
    public static final OrientationAccuracy UNRELIABLE;

    static {
        OrientationAccuracy orientationAccuracy = new OrientationAccuracy("HIGH", 0);
        HIGH = orientationAccuracy;
        OrientationAccuracy orientationAccuracy2 = new OrientationAccuracy("MEDIUM", 1);
        MEDIUM = orientationAccuracy2;
        OrientationAccuracy orientationAccuracy3 = new OrientationAccuracy("LOW", 2);
        LOW = orientationAccuracy3;
        OrientationAccuracy orientationAccuracy4 = new OrientationAccuracy("UNRELIABLE", 3);
        UNRELIABLE = orientationAccuracy4;
        OrientationAccuracy[] orientationAccuracyArr = {orientationAccuracy, orientationAccuracy2, orientationAccuracy3, orientationAccuracy4};
        $VALUES = orientationAccuracyArr;
        $ENTRIES = kotlin.enums.a.a(orientationAccuracyArr);
    }

    public static OrientationAccuracy valueOf(String str) {
        return (OrientationAccuracy) Enum.valueOf(OrientationAccuracy.class, str);
    }

    public static OrientationAccuracy[] values() {
        return (OrientationAccuracy[]) $VALUES.clone();
    }
}
