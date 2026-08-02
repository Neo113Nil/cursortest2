package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import com.yandex.go.promocodes.base.api.domain.entities.status.PromoCodeStatus;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.values().length];
        try {
            iArr[DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.NEED_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.VALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[PromoCodeStatus.values().length];
        try {
            iArr2[PromoCodeStatus.INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PromoCodeStatus.RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[DiscountsButtonAction.values().length];
        try {
            iArr3[DiscountsButtonAction.GO_TO_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[DiscountsButtonAction.REMOVE_PROMO_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DiscountsButtonAction.ADD_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DiscountsButtonAction.SELECT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
