package com.yandex.go.summary.ui.model.common.tariffcell;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/summary/ui/model/common/tariffcell/TariffNameUiState$TextStyle", "", "Lcom/yandex/go/summary/ui/model/common/tariffcell/TariffNameUiState$TextStyle;", "CAPTION1_MEDIUM", "CAPTION1_REGULAR", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffNameUiState$TextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffNameUiState$TextStyle[] $VALUES;
    public static final TariffNameUiState$TextStyle CAPTION1_MEDIUM;
    public static final TariffNameUiState$TextStyle CAPTION1_REGULAR;

    static {
        TariffNameUiState$TextStyle tariffNameUiState$TextStyle = new TariffNameUiState$TextStyle("CAPTION1_MEDIUM", 0);
        CAPTION1_MEDIUM = tariffNameUiState$TextStyle;
        TariffNameUiState$TextStyle tariffNameUiState$TextStyle2 = new TariffNameUiState$TextStyle("CAPTION1_REGULAR", 1);
        CAPTION1_REGULAR = tariffNameUiState$TextStyle2;
        TariffNameUiState$TextStyle[] tariffNameUiState$TextStyleArr = {tariffNameUiState$TextStyle, tariffNameUiState$TextStyle2};
        $VALUES = tariffNameUiState$TextStyleArr;
        $ENTRIES = a.a(tariffNameUiState$TextStyleArr);
    }

    public static TariffNameUiState$TextStyle valueOf(String str) {
        return (TariffNameUiState$TextStyle) Enum.valueOf(TariffNameUiState$TextStyle.class, str);
    }

    public static TariffNameUiState$TextStyle[] values() {
        return (TariffNameUiState$TextStyle[]) $VALUES.clone();
    }
}
