package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/promocodes/base/impl/discounts/presentation/ui/details/DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus", "", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/details/DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus;", "VALID", "RESTRICTED", "INVALID", "NEED_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus[] $VALUES;
    public static final DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus INVALID;
    public static final DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus NEED_CARD;
    public static final DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus RESTRICTED;
    public static final DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus VALID;

    static {
        DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus = new DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus("VALID", 0);
        VALID = discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus;
        DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus2 = new DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus("RESTRICTED", 1);
        RESTRICTED = discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus2;
        DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus3 = new DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus("INVALID", 2);
        INVALID = discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus3;
        DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus4 = new DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus("NEED_CARD", 3);
        NEED_CARD = discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus4;
        DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus[] discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatusArr = {discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus, discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus2, discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus3, discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus4};
        $VALUES = discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatusArr;
        $ENTRIES = kotlin.enums.a.a(discountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatusArr);
    }

    public static DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus valueOf(String str) {
        return (DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus) Enum.valueOf(DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.class, str);
    }

    public static DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus[] values() {
        return (DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus[]) $VALUES.clone();
    }
}
