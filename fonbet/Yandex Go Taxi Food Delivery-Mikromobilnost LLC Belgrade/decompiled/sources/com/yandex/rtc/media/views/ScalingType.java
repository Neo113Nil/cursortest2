package com.yandex.rtc.media.views;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/rtc/media/views/ScalingType;", "", "SCALE_ASPECT_FIT", "SCALE_ASPECT_FILL", "SCALE_ASPECT_BALANCED", "media-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScalingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScalingType[] $VALUES;
    public static final ScalingType SCALE_ASPECT_BALANCED;
    public static final ScalingType SCALE_ASPECT_FILL;
    public static final ScalingType SCALE_ASPECT_FIT;

    static {
        ScalingType scalingType = new ScalingType("SCALE_ASPECT_FIT", 0);
        SCALE_ASPECT_FIT = scalingType;
        ScalingType scalingType2 = new ScalingType("SCALE_ASPECT_FILL", 1);
        SCALE_ASPECT_FILL = scalingType2;
        ScalingType scalingType3 = new ScalingType("SCALE_ASPECT_BALANCED", 2);
        SCALE_ASPECT_BALANCED = scalingType3;
        ScalingType[] scalingTypeArr = {scalingType, scalingType2, scalingType3};
        $VALUES = scalingTypeArr;
        $ENTRIES = a.a(scalingTypeArr);
    }

    public static ScalingType valueOf(String str) {
        return (ScalingType) Enum.valueOf(ScalingType.class, str);
    }

    public static ScalingType[] values() {
        return (ScalingType[]) $VALUES.clone();
    }
}
