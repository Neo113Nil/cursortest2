package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsListItem$Divider", "", "Lcom/yx360/design/compose/atoms/DsListItem$Divider;", "Default", "Compact", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsListItem$Divider {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsListItem$Divider[] $VALUES;
    public static final DsListItem$Divider Compact;
    public static final DsListItem$Divider Default;

    static {
        DsListItem$Divider dsListItem$Divider = new DsListItem$Divider("Default", 0);
        Default = dsListItem$Divider;
        DsListItem$Divider dsListItem$Divider2 = new DsListItem$Divider("Compact", 1);
        Compact = dsListItem$Divider2;
        DsListItem$Divider[] dsListItem$DividerArr = {dsListItem$Divider, dsListItem$Divider2};
        $VALUES = dsListItem$DividerArr;
        $ENTRIES = kotlin.enums.a.a(dsListItem$DividerArr);
    }

    public static DsListItem$Divider valueOf(String str) {
        return (DsListItem$Divider) Enum.valueOf(DsListItem$Divider.class, str);
    }

    public static DsListItem$Divider[] values() {
        return (DsListItem$Divider[]) $VALUES.clone();
    }
}
