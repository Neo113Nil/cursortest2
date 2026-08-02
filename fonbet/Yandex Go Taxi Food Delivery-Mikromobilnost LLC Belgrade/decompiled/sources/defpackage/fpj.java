package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeUiState$ButtonType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class fpj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscountsAddPromoCodeUiState$ButtonType.values().length];
        try {
            iArr[DiscountsAddPromoCodeUiState$ButtonType.ACTIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscountsAddPromoCodeUiState$ButtonType.CARD_ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiscountsAddPromoCodeUiState$ButtonType.CARD_SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
