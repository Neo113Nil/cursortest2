package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsActionBar$Variant", "", "Lcom/yx360/design/compose/atoms/DsActionBar$Variant;", "Horizontal", "Vertical", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsActionBar$Variant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsActionBar$Variant[] $VALUES;
    public static final DsActionBar$Variant Horizontal;
    public static final DsActionBar$Variant Vertical;

    static {
        DsActionBar$Variant dsActionBar$Variant = new DsActionBar$Variant("Horizontal", 0);
        Horizontal = dsActionBar$Variant;
        DsActionBar$Variant dsActionBar$Variant2 = new DsActionBar$Variant("Vertical", 1);
        Vertical = dsActionBar$Variant2;
        DsActionBar$Variant[] dsActionBar$VariantArr = {dsActionBar$Variant, dsActionBar$Variant2};
        $VALUES = dsActionBar$VariantArr;
        $ENTRIES = kotlin.enums.a.a(dsActionBar$VariantArr);
    }

    public static DsActionBar$Variant valueOf(String str) {
        return (DsActionBar$Variant) Enum.valueOf(DsActionBar$Variant.class, str);
    }

    public static DsActionBar$Variant[] values() {
        return (DsActionBar$Variant[]) $VALUES.clone();
    }
}
