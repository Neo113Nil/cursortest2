package com.yandex.go.taxi.order.details.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/details/common/TaxiCardAppearanceMode;", "", "LEGACY", "RIDE_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiCardAppearanceMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiCardAppearanceMode[] $VALUES;
    public static final TaxiCardAppearanceMode LEGACY;
    public static final TaxiCardAppearanceMode RIDE_CARD;

    static {
        TaxiCardAppearanceMode taxiCardAppearanceMode = new TaxiCardAppearanceMode("LEGACY", 0);
        LEGACY = taxiCardAppearanceMode;
        TaxiCardAppearanceMode taxiCardAppearanceMode2 = new TaxiCardAppearanceMode("RIDE_CARD", 1);
        RIDE_CARD = taxiCardAppearanceMode2;
        TaxiCardAppearanceMode[] taxiCardAppearanceModeArr = {taxiCardAppearanceMode, taxiCardAppearanceMode2};
        $VALUES = taxiCardAppearanceModeArr;
        $ENTRIES = a.a(taxiCardAppearanceModeArr);
    }

    public static TaxiCardAppearanceMode valueOf(String str) {
        return (TaxiCardAppearanceMode) Enum.valueOf(TaxiCardAppearanceMode.class, str);
    }

    public static TaxiCardAppearanceMode[] values() {
        return (TaxiCardAppearanceMode[]) $VALUES.clone();
    }
}
