package defpackage;

import com.ybsdk.feature.main.internal.screens.products.ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ccf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType.values().length];
        try {
            iArr[ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType.QR_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
