package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsButtonClose$Type", "", "Lcom/yx360/design/compose/atoms/DsButtonClose$Type;", "Back", "Close", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsButtonClose$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsButtonClose$Type[] $VALUES;
    public static final DsButtonClose$Type Back;
    public static final DsButtonClose$Type Close;

    static {
        DsButtonClose$Type dsButtonClose$Type = new DsButtonClose$Type("Back", 0);
        Back = dsButtonClose$Type;
        DsButtonClose$Type dsButtonClose$Type2 = new DsButtonClose$Type("Close", 1);
        Close = dsButtonClose$Type2;
        DsButtonClose$Type[] dsButtonClose$TypeArr = {dsButtonClose$Type, dsButtonClose$Type2};
        $VALUES = dsButtonClose$TypeArr;
        $ENTRIES = kotlin.enums.a.a(dsButtonClose$TypeArr);
    }

    public static DsButtonClose$Type valueOf(String str) {
        return (DsButtonClose$Type) Enum.valueOf(DsButtonClose$Type.class, str);
    }

    public static DsButtonClose$Type[] values() {
        return (DsButtonClose$Type[]) $VALUES.clone();
    }
}
