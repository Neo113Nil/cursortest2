package com.yandex.smartcamera.arscene.ar_core.helpers;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/smartcamera/arscene/ar_core/helpers/ObjectRotationHelper$AxisType", "", "Lcom/yandex/smartcamera/arscene/ar_core/helpers/ObjectRotationHelper$AxisType;", "TYPE_1", "TYPE_2", "TYPE_3", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ObjectRotationHelper$AxisType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ObjectRotationHelper$AxisType[] $VALUES;
    public static final ObjectRotationHelper$AxisType TYPE_1;
    public static final ObjectRotationHelper$AxisType TYPE_2;
    public static final ObjectRotationHelper$AxisType TYPE_3;

    static {
        ObjectRotationHelper$AxisType objectRotationHelper$AxisType = new ObjectRotationHelper$AxisType("TYPE_1", 0);
        TYPE_1 = objectRotationHelper$AxisType;
        ObjectRotationHelper$AxisType objectRotationHelper$AxisType2 = new ObjectRotationHelper$AxisType("TYPE_2", 1);
        TYPE_2 = objectRotationHelper$AxisType2;
        ObjectRotationHelper$AxisType objectRotationHelper$AxisType3 = new ObjectRotationHelper$AxisType("TYPE_3", 2);
        TYPE_3 = objectRotationHelper$AxisType3;
        ObjectRotationHelper$AxisType[] objectRotationHelper$AxisTypeArr = {objectRotationHelper$AxisType, objectRotationHelper$AxisType2, objectRotationHelper$AxisType3};
        $VALUES = objectRotationHelper$AxisTypeArr;
        $ENTRIES = kotlin.enums.a.a(objectRotationHelper$AxisTypeArr);
    }

    public static ObjectRotationHelper$AxisType valueOf(String str) {
        return (ObjectRotationHelper$AxisType) Enum.valueOf(ObjectRotationHelper$AxisType.class, str);
    }

    public static ObjectRotationHelper$AxisType[] values() {
        return (ObjectRotationHelper$AxisType[]) $VALUES.clone();
    }
}
