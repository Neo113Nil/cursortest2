package com.ybsdk.feature.main.internal.screens.products;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/main/internal/screens/products/ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType", "", "Lcom/ybsdk/feature/main/internal/screens/products/ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType;", "<init>", "(Ljava/lang/String;I)V", "QR_PAYMENT", "DEFAULT", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType[] $VALUES;
    public static final ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType QR_PAYMENT = new ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType("QR_PAYMENT", 0);
    public static final ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType DEFAULT = new ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType("DEFAULT", 1);

    private static final /* synthetic */ ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType[] $values() {
        return new ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType[]{QR_PAYMENT, DEFAULT};
    }

    static {
        ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType valueOf(String str) {
        return (ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType) Enum.valueOf(ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType.class, str);
    }

    public static ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType[] values() {
        return (ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType[]) $VALUES.clone();
    }
}
