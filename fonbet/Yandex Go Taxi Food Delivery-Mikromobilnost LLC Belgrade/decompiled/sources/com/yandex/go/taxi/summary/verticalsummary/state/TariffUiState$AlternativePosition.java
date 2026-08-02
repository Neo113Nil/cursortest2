package com.yandex.go.taxi.summary.verticalsummary.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/verticalsummary/state/TariffUiState$AlternativePosition", "", "Lcom/yandex/go/taxi/summary/verticalsummary/state/TariffUiState$AlternativePosition;", "TOP", "BOTTOM", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffUiState$AlternativePosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffUiState$AlternativePosition[] $VALUES;
    public static final TariffUiState$AlternativePosition BOTTOM;
    public static final TariffUiState$AlternativePosition TOP;

    static {
        TariffUiState$AlternativePosition tariffUiState$AlternativePosition = new TariffUiState$AlternativePosition("TOP", 0);
        TOP = tariffUiState$AlternativePosition;
        TariffUiState$AlternativePosition tariffUiState$AlternativePosition2 = new TariffUiState$AlternativePosition("BOTTOM", 1);
        BOTTOM = tariffUiState$AlternativePosition2;
        TariffUiState$AlternativePosition[] tariffUiState$AlternativePositionArr = {tariffUiState$AlternativePosition, tariffUiState$AlternativePosition2};
        $VALUES = tariffUiState$AlternativePositionArr;
        $ENTRIES = a.a(tariffUiState$AlternativePositionArr);
    }

    public static TariffUiState$AlternativePosition valueOf(String str) {
        return (TariffUiState$AlternativePosition) Enum.valueOf(TariffUiState$AlternativePosition.class, str);
    }

    public static TariffUiState$AlternativePosition[] values() {
        return (TariffUiState$AlternativePosition[]) $VALUES.clone();
    }
}
