package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsHeading$Align", "", "Lcom/yx360/design/compose/atoms/DsHeading$Align;", "Start", "Center", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsHeading$Align {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsHeading$Align[] $VALUES;
    public static final DsHeading$Align Center;
    public static final DsHeading$Align Start;

    static {
        DsHeading$Align dsHeading$Align = new DsHeading$Align("Start", 0);
        Start = dsHeading$Align;
        DsHeading$Align dsHeading$Align2 = new DsHeading$Align("Center", 1);
        Center = dsHeading$Align2;
        DsHeading$Align[] dsHeading$AlignArr = {dsHeading$Align, dsHeading$Align2};
        $VALUES = dsHeading$AlignArr;
        $ENTRIES = kotlin.enums.a.a(dsHeading$AlignArr);
    }

    public static DsHeading$Align valueOf(String str) {
        return (DsHeading$Align) Enum.valueOf(DsHeading$Align.class, str);
    }

    public static DsHeading$Align[] values() {
        return (DsHeading$Align[]) $VALUES.clone();
    }
}
