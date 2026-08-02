package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsInputInline$FocusPosition", "", "Lcom/yx360/design/compose/atoms/DsInputInline$FocusPosition;", "TapPosition", "End", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsInputInline$FocusPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsInputInline$FocusPosition[] $VALUES;
    public static final DsInputInline$FocusPosition End;
    public static final DsInputInline$FocusPosition TapPosition;

    static {
        DsInputInline$FocusPosition dsInputInline$FocusPosition = new DsInputInline$FocusPosition("TapPosition", 0);
        TapPosition = dsInputInline$FocusPosition;
        DsInputInline$FocusPosition dsInputInline$FocusPosition2 = new DsInputInline$FocusPosition("End", 1);
        End = dsInputInline$FocusPosition2;
        DsInputInline$FocusPosition[] dsInputInline$FocusPositionArr = {dsInputInline$FocusPosition, dsInputInline$FocusPosition2};
        $VALUES = dsInputInline$FocusPositionArr;
        $ENTRIES = kotlin.enums.a.a(dsInputInline$FocusPositionArr);
    }

    public static DsInputInline$FocusPosition valueOf(String str) {
        return (DsInputInline$FocusPosition) Enum.valueOf(DsInputInline$FocusPosition.class, str);
    }

    public static DsInputInline$FocusPosition[] values() {
        return (DsInputInline$FocusPosition[]) $VALUES.clone();
    }
}
