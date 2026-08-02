package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView$LayoutConfig$WidthSpec", "", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView$LayoutConfig$WidthSpec;", "FULL", "HALF", "BY_CONTENT", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffView$LayoutConfig$WidthSpec {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersTariffView$LayoutConfig$WidthSpec[] $VALUES;
    public static final ScootersTariffView$LayoutConfig$WidthSpec BY_CONTENT;
    public static final ScootersTariffView$LayoutConfig$WidthSpec FULL;
    public static final ScootersTariffView$LayoutConfig$WidthSpec HALF;

    static {
        ScootersTariffView$LayoutConfig$WidthSpec scootersTariffView$LayoutConfig$WidthSpec = new ScootersTariffView$LayoutConfig$WidthSpec("FULL", 0);
        FULL = scootersTariffView$LayoutConfig$WidthSpec;
        ScootersTariffView$LayoutConfig$WidthSpec scootersTariffView$LayoutConfig$WidthSpec2 = new ScootersTariffView$LayoutConfig$WidthSpec("HALF", 1);
        HALF = scootersTariffView$LayoutConfig$WidthSpec2;
        ScootersTariffView$LayoutConfig$WidthSpec scootersTariffView$LayoutConfig$WidthSpec3 = new ScootersTariffView$LayoutConfig$WidthSpec("BY_CONTENT", 2);
        BY_CONTENT = scootersTariffView$LayoutConfig$WidthSpec3;
        ScootersTariffView$LayoutConfig$WidthSpec[] scootersTariffView$LayoutConfig$WidthSpecArr = {scootersTariffView$LayoutConfig$WidthSpec, scootersTariffView$LayoutConfig$WidthSpec2, scootersTariffView$LayoutConfig$WidthSpec3};
        $VALUES = scootersTariffView$LayoutConfig$WidthSpecArr;
        $ENTRIES = kotlin.enums.a.a(scootersTariffView$LayoutConfig$WidthSpecArr);
    }

    public static ScootersTariffView$LayoutConfig$WidthSpec valueOf(String str) {
        return (ScootersTariffView$LayoutConfig$WidthSpec) Enum.valueOf(ScootersTariffView$LayoutConfig$WidthSpec.class, str);
    }

    public static ScootersTariffView$LayoutConfig$WidthSpec[] values() {
        return (ScootersTariffView$LayoutConfig$WidthSpec[]) $VALUES.clone();
    }
}
