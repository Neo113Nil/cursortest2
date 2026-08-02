package com.yandex.go.due_timetable.experiment.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mze0;
import defpackage.vye0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/model/PriceHeightCalculationStrategyType;", "", "Companion", "mze0", "PER_DAY_WITH_ON_DEMAND_AS_MAX_VALUE", "ALL_DAYS_IGNORE_ON_DEMAND", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PriceHeightCalculationStrategyType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PriceHeightCalculationStrategyType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PriceHeightCalculationStrategyType ALL_DAYS_IGNORE_ON_DEMAND;
    public static final mze0 Companion;
    public static final PriceHeightCalculationStrategyType PER_DAY_WITH_ON_DEMAND_AS_MAX_VALUE;

    static {
        PriceHeightCalculationStrategyType priceHeightCalculationStrategyType = new PriceHeightCalculationStrategyType("PER_DAY_WITH_ON_DEMAND_AS_MAX_VALUE", 0);
        PER_DAY_WITH_ON_DEMAND_AS_MAX_VALUE = priceHeightCalculationStrategyType;
        PriceHeightCalculationStrategyType priceHeightCalculationStrategyType2 = new PriceHeightCalculationStrategyType("ALL_DAYS_IGNORE_ON_DEMAND", 1);
        ALL_DAYS_IGNORE_ON_DEMAND = priceHeightCalculationStrategyType2;
        PriceHeightCalculationStrategyType[] priceHeightCalculationStrategyTypeArr = {priceHeightCalculationStrategyType, priceHeightCalculationStrategyType2};
        $VALUES = priceHeightCalculationStrategyTypeArr;
        $ENTRIES = kotlin.enums.a.a(priceHeightCalculationStrategyTypeArr);
        Companion = new mze0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(4));
    }

    public static PriceHeightCalculationStrategyType valueOf(String str) {
        return (PriceHeightCalculationStrategyType) Enum.valueOf(PriceHeightCalculationStrategyType.class, str);
    }

    public static PriceHeightCalculationStrategyType[] values() {
        return (PriceHeightCalculationStrategyType[]) $VALUES.clone();
    }
}
