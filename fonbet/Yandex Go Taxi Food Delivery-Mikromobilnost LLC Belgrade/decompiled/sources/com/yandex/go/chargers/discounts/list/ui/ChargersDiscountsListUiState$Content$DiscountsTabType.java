package com.yandex.go.chargers.discounts.list.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/chargers/discounts/list/ui/ChargersDiscountsListUiState$Content$DiscountsTabType", "", "Lcom/yandex/go/chargers/discounts/list/ui/ChargersDiscountsListUiState$Content$DiscountsTabType;", "RENTAL_PROMO", "PARTNER_PROMO", "TASKS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsListUiState$Content$DiscountsTabType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersDiscountsListUiState$Content$DiscountsTabType[] $VALUES;
    public static final ChargersDiscountsListUiState$Content$DiscountsTabType PARTNER_PROMO;
    public static final ChargersDiscountsListUiState$Content$DiscountsTabType RENTAL_PROMO;
    public static final ChargersDiscountsListUiState$Content$DiscountsTabType TASKS;

    static {
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType = new ChargersDiscountsListUiState$Content$DiscountsTabType("RENTAL_PROMO", 0);
        RENTAL_PROMO = chargersDiscountsListUiState$Content$DiscountsTabType;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType2 = new ChargersDiscountsListUiState$Content$DiscountsTabType("PARTNER_PROMO", 1);
        PARTNER_PROMO = chargersDiscountsListUiState$Content$DiscountsTabType2;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType3 = new ChargersDiscountsListUiState$Content$DiscountsTabType("TASKS", 2);
        TASKS = chargersDiscountsListUiState$Content$DiscountsTabType3;
        ChargersDiscountsListUiState$Content$DiscountsTabType[] chargersDiscountsListUiState$Content$DiscountsTabTypeArr = {chargersDiscountsListUiState$Content$DiscountsTabType, chargersDiscountsListUiState$Content$DiscountsTabType2, chargersDiscountsListUiState$Content$DiscountsTabType3};
        $VALUES = chargersDiscountsListUiState$Content$DiscountsTabTypeArr;
        $ENTRIES = kotlin.enums.a.a(chargersDiscountsListUiState$Content$DiscountsTabTypeArr);
    }

    public static ChargersDiscountsListUiState$Content$DiscountsTabType valueOf(String str) {
        return (ChargersDiscountsListUiState$Content$DiscountsTabType) Enum.valueOf(ChargersDiscountsListUiState$Content$DiscountsTabType.class, str);
    }

    public static ChargersDiscountsListUiState$Content$DiscountsTabType[] values() {
        return (ChargersDiscountsListUiState$Content$DiscountsTabType[]) $VALUES.clone();
    }
}
