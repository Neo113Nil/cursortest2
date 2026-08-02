package com.yandex.go.summary.ui.model.common.tariffcell;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/summary/ui/model/common/tariffcell/PriceUiState$TextStyle", "", "Lcom/yandex/go/summary/ui/model/common/tariffcell/PriceUiState$TextStyle;", "BODY2_MEDIUM", "BODY2_REGULAR", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PriceUiState$TextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PriceUiState$TextStyle[] $VALUES;
    public static final PriceUiState$TextStyle BODY2_MEDIUM;
    public static final PriceUiState$TextStyle BODY2_REGULAR;

    static {
        PriceUiState$TextStyle priceUiState$TextStyle = new PriceUiState$TextStyle("BODY2_MEDIUM", 0);
        BODY2_MEDIUM = priceUiState$TextStyle;
        PriceUiState$TextStyle priceUiState$TextStyle2 = new PriceUiState$TextStyle("BODY2_REGULAR", 1);
        BODY2_REGULAR = priceUiState$TextStyle2;
        PriceUiState$TextStyle[] priceUiState$TextStyleArr = {priceUiState$TextStyle, priceUiState$TextStyle2};
        $VALUES = priceUiState$TextStyleArr;
        $ENTRIES = a.a(priceUiState$TextStyleArr);
    }

    public static PriceUiState$TextStyle valueOf(String str) {
        return (PriceUiState$TextStyle) Enum.valueOf(PriceUiState$TextStyle.class, str);
    }

    public static PriceUiState$TextStyle[] values() {
        return (PriceUiState$TextStyle[]) $VALUES.clone();
    }
}
