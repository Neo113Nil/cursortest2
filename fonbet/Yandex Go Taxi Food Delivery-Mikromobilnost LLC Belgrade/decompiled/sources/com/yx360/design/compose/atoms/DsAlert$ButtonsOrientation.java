package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsAlert$ButtonsOrientation", "", "Lcom/yx360/design/compose/atoms/DsAlert$ButtonsOrientation;", "Horizontal", "Vertical", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsAlert$ButtonsOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsAlert$ButtonsOrientation[] $VALUES;
    public static final DsAlert$ButtonsOrientation Horizontal;
    public static final DsAlert$ButtonsOrientation Vertical;

    static {
        DsAlert$ButtonsOrientation dsAlert$ButtonsOrientation = new DsAlert$ButtonsOrientation("Horizontal", 0);
        Horizontal = dsAlert$ButtonsOrientation;
        DsAlert$ButtonsOrientation dsAlert$ButtonsOrientation2 = new DsAlert$ButtonsOrientation("Vertical", 1);
        Vertical = dsAlert$ButtonsOrientation2;
        DsAlert$ButtonsOrientation[] dsAlert$ButtonsOrientationArr = {dsAlert$ButtonsOrientation, dsAlert$ButtonsOrientation2};
        $VALUES = dsAlert$ButtonsOrientationArr;
        $ENTRIES = kotlin.enums.a.a(dsAlert$ButtonsOrientationArr);
    }

    public static DsAlert$ButtonsOrientation valueOf(String str) {
        return (DsAlert$ButtonsOrientation) Enum.valueOf(DsAlert$ButtonsOrientation.class, str);
    }

    public static DsAlert$ButtonsOrientation[] values() {
        return (DsAlert$ButtonsOrientation[]) $VALUES.clone();
    }
}
