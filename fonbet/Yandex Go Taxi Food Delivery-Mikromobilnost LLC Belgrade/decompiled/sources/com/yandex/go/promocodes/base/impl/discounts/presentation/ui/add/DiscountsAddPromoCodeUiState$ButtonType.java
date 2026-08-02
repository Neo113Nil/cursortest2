package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeUiState$ButtonType", "", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeUiState$ButtonType;", "ACTIVATE", "CARD_ADD", "CARD_SELECT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsAddPromoCodeUiState$ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsAddPromoCodeUiState$ButtonType[] $VALUES;
    public static final DiscountsAddPromoCodeUiState$ButtonType ACTIVATE;
    public static final DiscountsAddPromoCodeUiState$ButtonType CARD_ADD;
    public static final DiscountsAddPromoCodeUiState$ButtonType CARD_SELECT;

    static {
        DiscountsAddPromoCodeUiState$ButtonType discountsAddPromoCodeUiState$ButtonType = new DiscountsAddPromoCodeUiState$ButtonType("ACTIVATE", 0);
        ACTIVATE = discountsAddPromoCodeUiState$ButtonType;
        DiscountsAddPromoCodeUiState$ButtonType discountsAddPromoCodeUiState$ButtonType2 = new DiscountsAddPromoCodeUiState$ButtonType("CARD_ADD", 1);
        CARD_ADD = discountsAddPromoCodeUiState$ButtonType2;
        DiscountsAddPromoCodeUiState$ButtonType discountsAddPromoCodeUiState$ButtonType3 = new DiscountsAddPromoCodeUiState$ButtonType("CARD_SELECT", 2);
        CARD_SELECT = discountsAddPromoCodeUiState$ButtonType3;
        DiscountsAddPromoCodeUiState$ButtonType[] discountsAddPromoCodeUiState$ButtonTypeArr = {discountsAddPromoCodeUiState$ButtonType, discountsAddPromoCodeUiState$ButtonType2, discountsAddPromoCodeUiState$ButtonType3};
        $VALUES = discountsAddPromoCodeUiState$ButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(discountsAddPromoCodeUiState$ButtonTypeArr);
    }

    public static DiscountsAddPromoCodeUiState$ButtonType valueOf(String str) {
        return (DiscountsAddPromoCodeUiState$ButtonType) Enum.valueOf(DiscountsAddPromoCodeUiState$ButtonType.class, str);
    }

    public static DiscountsAddPromoCodeUiState$ButtonType[] values() {
        return (DiscountsAddPromoCodeUiState$ButtonType[]) $VALUES.clone();
    }
}
