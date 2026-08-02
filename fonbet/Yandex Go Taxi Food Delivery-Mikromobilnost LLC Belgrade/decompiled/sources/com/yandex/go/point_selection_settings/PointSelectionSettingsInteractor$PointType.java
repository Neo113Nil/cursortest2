package com.yandex.go.point_selection_settings;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/point_selection_settings/PointSelectionSettingsInteractor$PointType", "", "Lcom/yandex/go/point_selection_settings/PointSelectionSettingsInteractor$PointType;", "SOURCE", "DESTINATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PointSelectionSettingsInteractor$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointSelectionSettingsInteractor$PointType[] $VALUES;
    public static final PointSelectionSettingsInteractor$PointType DESTINATION;
    public static final PointSelectionSettingsInteractor$PointType SOURCE;

    static {
        PointSelectionSettingsInteractor$PointType pointSelectionSettingsInteractor$PointType = new PointSelectionSettingsInteractor$PointType("SOURCE", 0);
        SOURCE = pointSelectionSettingsInteractor$PointType;
        PointSelectionSettingsInteractor$PointType pointSelectionSettingsInteractor$PointType2 = new PointSelectionSettingsInteractor$PointType("DESTINATION", 1);
        DESTINATION = pointSelectionSettingsInteractor$PointType2;
        PointSelectionSettingsInteractor$PointType[] pointSelectionSettingsInteractor$PointTypeArr = {pointSelectionSettingsInteractor$PointType, pointSelectionSettingsInteractor$PointType2};
        $VALUES = pointSelectionSettingsInteractor$PointTypeArr;
        $ENTRIES = kotlin.enums.a.a(pointSelectionSettingsInteractor$PointTypeArr);
    }

    public static PointSelectionSettingsInteractor$PointType valueOf(String str) {
        return (PointSelectionSettingsInteractor$PointType) Enum.valueOf(PointSelectionSettingsInteractor$PointType.class, str);
    }

    public static PointSelectionSettingsInteractor$PointType[] values() {
        return (PointSelectionSettingsInteractor$PointType[]) $VALUES.clone();
    }
}
