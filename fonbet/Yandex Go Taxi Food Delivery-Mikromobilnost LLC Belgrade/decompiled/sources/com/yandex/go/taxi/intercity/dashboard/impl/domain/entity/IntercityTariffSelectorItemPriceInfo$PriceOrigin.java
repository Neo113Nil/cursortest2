package com.yandex.go.taxi.intercity.dashboard.impl.domain.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/domain/entity/IntercityTariffSelectorItemPriceInfo$PriceOrigin", "", "Lcom/yandex/go/taxi/intercity/dashboard/impl/domain/entity/IntercityTariffSelectorItemPriceInfo$PriceOrigin;", "ROUTE_STATS", "FALLBACK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityTariffSelectorItemPriceInfo$PriceOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityTariffSelectorItemPriceInfo$PriceOrigin[] $VALUES;
    public static final IntercityTariffSelectorItemPriceInfo$PriceOrigin FALLBACK;
    public static final IntercityTariffSelectorItemPriceInfo$PriceOrigin ROUTE_STATS;

    static {
        IntercityTariffSelectorItemPriceInfo$PriceOrigin intercityTariffSelectorItemPriceInfo$PriceOrigin = new IntercityTariffSelectorItemPriceInfo$PriceOrigin("ROUTE_STATS", 0);
        ROUTE_STATS = intercityTariffSelectorItemPriceInfo$PriceOrigin;
        IntercityTariffSelectorItemPriceInfo$PriceOrigin intercityTariffSelectorItemPriceInfo$PriceOrigin2 = new IntercityTariffSelectorItemPriceInfo$PriceOrigin("FALLBACK", 1);
        FALLBACK = intercityTariffSelectorItemPriceInfo$PriceOrigin2;
        IntercityTariffSelectorItemPriceInfo$PriceOrigin[] intercityTariffSelectorItemPriceInfo$PriceOriginArr = {intercityTariffSelectorItemPriceInfo$PriceOrigin, intercityTariffSelectorItemPriceInfo$PriceOrigin2};
        $VALUES = intercityTariffSelectorItemPriceInfo$PriceOriginArr;
        $ENTRIES = a.a(intercityTariffSelectorItemPriceInfo$PriceOriginArr);
    }

    public static IntercityTariffSelectorItemPriceInfo$PriceOrigin valueOf(String str) {
        return (IntercityTariffSelectorItemPriceInfo$PriceOrigin) Enum.valueOf(IntercityTariffSelectorItemPriceInfo$PriceOrigin.class, str);
    }

    public static IntercityTariffSelectorItemPriceInfo$PriceOrigin[] values() {
        return (IntercityTariffSelectorItemPriceInfo$PriceOrigin[]) $VALUES.clone();
    }
}
