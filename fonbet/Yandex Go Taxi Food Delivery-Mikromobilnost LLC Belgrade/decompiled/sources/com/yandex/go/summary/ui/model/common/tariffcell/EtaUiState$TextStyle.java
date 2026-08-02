package com.yandex.go.summary.ui.model.common.tariffcell;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/summary/ui/model/common/tariffcell/EtaUiState$TextStyle", "", "Lcom/yandex/go/summary/ui/model/common/tariffcell/EtaUiState$TextStyle;", "CAPTION2_MEDIUM", "CAPTION2_REGULAR", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EtaUiState$TextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EtaUiState$TextStyle[] $VALUES;
    public static final EtaUiState$TextStyle CAPTION2_MEDIUM;
    public static final EtaUiState$TextStyle CAPTION2_REGULAR;

    static {
        EtaUiState$TextStyle etaUiState$TextStyle = new EtaUiState$TextStyle("CAPTION2_MEDIUM", 0);
        CAPTION2_MEDIUM = etaUiState$TextStyle;
        EtaUiState$TextStyle etaUiState$TextStyle2 = new EtaUiState$TextStyle("CAPTION2_REGULAR", 1);
        CAPTION2_REGULAR = etaUiState$TextStyle2;
        EtaUiState$TextStyle[] etaUiState$TextStyleArr = {etaUiState$TextStyle, etaUiState$TextStyle2};
        $VALUES = etaUiState$TextStyleArr;
        $ENTRIES = a.a(etaUiState$TextStyleArr);
    }

    public static EtaUiState$TextStyle valueOf(String str) {
        return (EtaUiState$TextStyle) Enum.valueOf(EtaUiState$TextStyle.class, str);
    }

    public static EtaUiState$TextStyle[] values() {
        return (EtaUiState$TextStyle[]) $VALUES.clone();
    }
}
