package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsCheckbox$Variant", "", "Lcom/yx360/design/compose/atoms/DsCheckbox$Variant;", "Brand", "User", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCheckbox$Variant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsCheckbox$Variant[] $VALUES;
    public static final DsCheckbox$Variant Brand;
    public static final DsCheckbox$Variant User;

    static {
        DsCheckbox$Variant dsCheckbox$Variant = new DsCheckbox$Variant("Brand", 0);
        Brand = dsCheckbox$Variant;
        DsCheckbox$Variant dsCheckbox$Variant2 = new DsCheckbox$Variant("User", 1);
        User = dsCheckbox$Variant2;
        DsCheckbox$Variant[] dsCheckbox$VariantArr = {dsCheckbox$Variant, dsCheckbox$Variant2};
        $VALUES = dsCheckbox$VariantArr;
        $ENTRIES = kotlin.enums.a.a(dsCheckbox$VariantArr);
    }

    public static DsCheckbox$Variant valueOf(String str) {
        return (DsCheckbox$Variant) Enum.valueOf(DsCheckbox$Variant.class, str);
    }

    public static DsCheckbox$Variant[] values() {
        return (DsCheckbox$Variant[]) $VALUES.clone();
    }
}
