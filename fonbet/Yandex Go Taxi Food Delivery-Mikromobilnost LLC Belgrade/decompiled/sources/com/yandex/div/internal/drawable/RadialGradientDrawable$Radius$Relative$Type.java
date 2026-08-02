package com.yandex.div.internal.drawable;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type", "", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "NEAREST_CORNER", "FARTHEST_CORNER", "NEAREST_SIDE", "FARTHEST_SIDE", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadialGradientDrawable$Radius$Relative$Type {
    private static final /* synthetic */ RadialGradientDrawable$Radius$Relative$Type[] $VALUES;
    public static final RadialGradientDrawable$Radius$Relative$Type FARTHEST_CORNER;
    public static final RadialGradientDrawable$Radius$Relative$Type FARTHEST_SIDE;
    public static final RadialGradientDrawable$Radius$Relative$Type NEAREST_CORNER;
    public static final RadialGradientDrawable$Radius$Relative$Type NEAREST_SIDE;

    static {
        RadialGradientDrawable$Radius$Relative$Type radialGradientDrawable$Radius$Relative$Type = new RadialGradientDrawable$Radius$Relative$Type("NEAREST_CORNER", 0);
        NEAREST_CORNER = radialGradientDrawable$Radius$Relative$Type;
        RadialGradientDrawable$Radius$Relative$Type radialGradientDrawable$Radius$Relative$Type2 = new RadialGradientDrawable$Radius$Relative$Type("FARTHEST_CORNER", 1);
        FARTHEST_CORNER = radialGradientDrawable$Radius$Relative$Type2;
        RadialGradientDrawable$Radius$Relative$Type radialGradientDrawable$Radius$Relative$Type3 = new RadialGradientDrawable$Radius$Relative$Type("NEAREST_SIDE", 2);
        NEAREST_SIDE = radialGradientDrawable$Radius$Relative$Type3;
        RadialGradientDrawable$Radius$Relative$Type radialGradientDrawable$Radius$Relative$Type4 = new RadialGradientDrawable$Radius$Relative$Type("FARTHEST_SIDE", 3);
        FARTHEST_SIDE = radialGradientDrawable$Radius$Relative$Type4;
        $VALUES = new RadialGradientDrawable$Radius$Relative$Type[]{radialGradientDrawable$Radius$Relative$Type, radialGradientDrawable$Radius$Relative$Type2, radialGradientDrawable$Radius$Relative$Type3, radialGradientDrawable$Radius$Relative$Type4};
    }

    public static RadialGradientDrawable$Radius$Relative$Type valueOf(String str) {
        return (RadialGradientDrawable$Radius$Relative$Type) Enum.valueOf(RadialGradientDrawable$Radius$Relative$Type.class, str);
    }

    public static RadialGradientDrawable$Radius$Relative$Type[] values() {
        return (RadialGradientDrawable$Radius$Relative$Type[]) $VALUES.clone();
    }
}
