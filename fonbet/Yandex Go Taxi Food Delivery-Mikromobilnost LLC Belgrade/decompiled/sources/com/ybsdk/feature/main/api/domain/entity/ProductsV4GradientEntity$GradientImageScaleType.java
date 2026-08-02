package com.ybsdk.feature.main.api.domain.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/main/api/domain/entity/ProductsV4GradientEntity$GradientImageScaleType", "", "Lcom/ybsdk/feature/main/api/domain/entity/ProductsV4GradientEntity$GradientImageScaleType;", "<init>", "(Ljava/lang/String;I)V", "FIT_START", "FIT_END", "feature-main-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsV4GradientEntity$GradientImageScaleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductsV4GradientEntity$GradientImageScaleType[] $VALUES;
    public static final ProductsV4GradientEntity$GradientImageScaleType FIT_START = new ProductsV4GradientEntity$GradientImageScaleType("FIT_START", 0);
    public static final ProductsV4GradientEntity$GradientImageScaleType FIT_END = new ProductsV4GradientEntity$GradientImageScaleType("FIT_END", 1);

    private static final /* synthetic */ ProductsV4GradientEntity$GradientImageScaleType[] $values() {
        return new ProductsV4GradientEntity$GradientImageScaleType[]{FIT_START, FIT_END};
    }

    static {
        ProductsV4GradientEntity$GradientImageScaleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductsV4GradientEntity$GradientImageScaleType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductsV4GradientEntity$GradientImageScaleType valueOf(String str) {
        return (ProductsV4GradientEntity$GradientImageScaleType) Enum.valueOf(ProductsV4GradientEntity$GradientImageScaleType.class, str);
    }

    public static ProductsV4GradientEntity$GradientImageScaleType[] values() {
        return (ProductsV4GradientEntity$GradientImageScaleType[]) $VALUES.clone();
    }
}
