package com.yx360.design.compose.atoms.carousel;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/carousel/DsCarousel$Variant", "", "Lcom/yx360/design/compose/atoms/carousel/DsCarousel$Variant;", "Neutral", "Accent", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCarousel$Variant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsCarousel$Variant[] $VALUES;
    public static final DsCarousel$Variant Accent;
    public static final DsCarousel$Variant Neutral;

    static {
        DsCarousel$Variant dsCarousel$Variant = new DsCarousel$Variant("Neutral", 0);
        Neutral = dsCarousel$Variant;
        DsCarousel$Variant dsCarousel$Variant2 = new DsCarousel$Variant("Accent", 1);
        Accent = dsCarousel$Variant2;
        DsCarousel$Variant[] dsCarousel$VariantArr = {dsCarousel$Variant, dsCarousel$Variant2};
        $VALUES = dsCarousel$VariantArr;
        $ENTRIES = a.a(dsCarousel$VariantArr);
    }

    public static DsCarousel$Variant valueOf(String str) {
        return (DsCarousel$Variant) Enum.valueOf(DsCarousel$Variant.class, str);
    }

    public static DsCarousel$Variant[] values() {
        return (DsCarousel$Variant[]) $VALUES.clone();
    }
}
