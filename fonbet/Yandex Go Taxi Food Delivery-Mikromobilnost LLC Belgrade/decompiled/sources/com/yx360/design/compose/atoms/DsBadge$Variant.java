package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yx360/design/compose/atoms/DsBadge$Variant", "", "Lcom/yx360/design/compose/atoms/DsBadge$Variant;", "Primary", "Secondary", "Brand", "Danger", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsBadge$Variant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsBadge$Variant[] $VALUES;
    public static final DsBadge$Variant Brand;
    public static final DsBadge$Variant Danger;
    public static final DsBadge$Variant Primary;
    public static final DsBadge$Variant Secondary;

    static {
        DsBadge$Variant dsBadge$Variant = new DsBadge$Variant("Primary", 0);
        Primary = dsBadge$Variant;
        DsBadge$Variant dsBadge$Variant2 = new DsBadge$Variant("Secondary", 1);
        Secondary = dsBadge$Variant2;
        DsBadge$Variant dsBadge$Variant3 = new DsBadge$Variant("Brand", 2);
        Brand = dsBadge$Variant3;
        DsBadge$Variant dsBadge$Variant4 = new DsBadge$Variant("Danger", 3);
        Danger = dsBadge$Variant4;
        DsBadge$Variant[] dsBadge$VariantArr = {dsBadge$Variant, dsBadge$Variant2, dsBadge$Variant3, dsBadge$Variant4};
        $VALUES = dsBadge$VariantArr;
        $ENTRIES = kotlin.enums.a.a(dsBadge$VariantArr);
    }

    public static DsBadge$Variant valueOf(String str) {
        return (DsBadge$Variant) Enum.valueOf(DsBadge$Variant.class, str);
    }

    public static DsBadge$Variant[] values() {
        return (DsBadge$Variant[]) $VALUES.clone();
    }
}
