package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsAvatar$Form", "", "Lcom/yx360/design/compose/atoms/DsAvatar$Form;", "Circle", "Square", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsAvatar$Form {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsAvatar$Form[] $VALUES;
    public static final DsAvatar$Form Circle;
    public static final DsAvatar$Form Square;

    static {
        DsAvatar$Form dsAvatar$Form = new DsAvatar$Form("Circle", 0);
        Circle = dsAvatar$Form;
        DsAvatar$Form dsAvatar$Form2 = new DsAvatar$Form("Square", 1);
        Square = dsAvatar$Form2;
        DsAvatar$Form[] dsAvatar$FormArr = {dsAvatar$Form, dsAvatar$Form2};
        $VALUES = dsAvatar$FormArr;
        $ENTRIES = kotlin.enums.a.a(dsAvatar$FormArr);
    }

    public static DsAvatar$Form valueOf(String str) {
        return (DsAvatar$Form) Enum.valueOf(DsAvatar$Form.class, str);
    }

    public static DsAvatar$Form[] values() {
        return (DsAvatar$Form[]) $VALUES.clone();
    }
}
