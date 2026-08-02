package com.ybsdk.feature.main.internal.widgets;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/main/internal/widgets/ProductCardView$State$SubtitleType", "", "Lcom/ybsdk/feature/main/internal/widgets/ProductCardView$State$SubtitleType;", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "DEFAULT", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductCardView$State$SubtitleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductCardView$State$SubtitleType[] $VALUES;
    public static final ProductCardView$State$SubtitleType ULTRA = new ProductCardView$State$SubtitleType("ULTRA", 0);
    public static final ProductCardView$State$SubtitleType DEFAULT = new ProductCardView$State$SubtitleType("DEFAULT", 1);

    private static final /* synthetic */ ProductCardView$State$SubtitleType[] $values() {
        return new ProductCardView$State$SubtitleType[]{ULTRA, DEFAULT};
    }

    static {
        ProductCardView$State$SubtitleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductCardView$State$SubtitleType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductCardView$State$SubtitleType valueOf(String str) {
        return (ProductCardView$State$SubtitleType) Enum.valueOf(ProductCardView$State$SubtitleType.class, str);
    }

    public static ProductCardView$State$SubtitleType[] values() {
        return (ProductCardView$State$SubtitleType[]) $VALUES.clone();
    }
}
