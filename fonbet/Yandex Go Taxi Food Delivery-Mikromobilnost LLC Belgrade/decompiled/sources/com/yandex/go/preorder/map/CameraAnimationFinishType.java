package com.yandex.go.preorder.map;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/preorder/map/CameraAnimationFinishType;", "", "ANIMATE_GESTURE_CHANGED", "ANIMATE_TAP_ON_PICKUP_POINT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraAnimationFinishType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraAnimationFinishType[] $VALUES;
    public static final CameraAnimationFinishType ANIMATE_GESTURE_CHANGED;
    public static final CameraAnimationFinishType ANIMATE_TAP_ON_PICKUP_POINT;

    static {
        CameraAnimationFinishType cameraAnimationFinishType = new CameraAnimationFinishType("ANIMATE_GESTURE_CHANGED", 0);
        ANIMATE_GESTURE_CHANGED = cameraAnimationFinishType;
        CameraAnimationFinishType cameraAnimationFinishType2 = new CameraAnimationFinishType("ANIMATE_TAP_ON_PICKUP_POINT", 1);
        ANIMATE_TAP_ON_PICKUP_POINT = cameraAnimationFinishType2;
        CameraAnimationFinishType[] cameraAnimationFinishTypeArr = {cameraAnimationFinishType, cameraAnimationFinishType2};
        $VALUES = cameraAnimationFinishTypeArr;
        $ENTRIES = kotlin.enums.a.a(cameraAnimationFinishTypeArr);
    }

    public static CameraAnimationFinishType valueOf(String str) {
        return (CameraAnimationFinishType) Enum.valueOf(CameraAnimationFinishType.class, str);
    }

    public static CameraAnimationFinishType[] values() {
        return (CameraAnimationFinishType[]) $VALUES.clone();
    }
}
