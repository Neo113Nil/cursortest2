package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView$LayoutConfig$Appearance", "", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView$LayoutConfig$Appearance;", "AS_SINGLE", "AS_ONE_OF_MANY", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffView$LayoutConfig$Appearance {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersTariffView$LayoutConfig$Appearance[] $VALUES;
    public static final ScootersTariffView$LayoutConfig$Appearance AS_ONE_OF_MANY;
    public static final ScootersTariffView$LayoutConfig$Appearance AS_SINGLE;

    static {
        ScootersTariffView$LayoutConfig$Appearance scootersTariffView$LayoutConfig$Appearance = new ScootersTariffView$LayoutConfig$Appearance("AS_SINGLE", 0);
        AS_SINGLE = scootersTariffView$LayoutConfig$Appearance;
        ScootersTariffView$LayoutConfig$Appearance scootersTariffView$LayoutConfig$Appearance2 = new ScootersTariffView$LayoutConfig$Appearance("AS_ONE_OF_MANY", 1);
        AS_ONE_OF_MANY = scootersTariffView$LayoutConfig$Appearance2;
        ScootersTariffView$LayoutConfig$Appearance[] scootersTariffView$LayoutConfig$AppearanceArr = {scootersTariffView$LayoutConfig$Appearance, scootersTariffView$LayoutConfig$Appearance2};
        $VALUES = scootersTariffView$LayoutConfig$AppearanceArr;
        $ENTRIES = kotlin.enums.a.a(scootersTariffView$LayoutConfig$AppearanceArr);
    }

    public static ScootersTariffView$LayoutConfig$Appearance valueOf(String str) {
        return (ScootersTariffView$LayoutConfig$Appearance) Enum.valueOf(ScootersTariffView$LayoutConfig$Appearance.class, str);
    }

    public static ScootersTariffView$LayoutConfig$Appearance[] values() {
        return (ScootersTariffView$LayoutConfig$Appearance[]) $VALUES.clone();
    }
}
