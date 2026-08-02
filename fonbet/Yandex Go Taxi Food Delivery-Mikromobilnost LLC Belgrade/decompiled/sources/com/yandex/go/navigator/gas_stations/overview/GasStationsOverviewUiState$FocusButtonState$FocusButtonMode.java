package com.yandex.go.navigator.gas_stations.overview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$FocusButtonState$FocusButtonMode", "", "Lcom/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$FocusButtonState$FocusButtonMode;", "USER_LOCATION", "ROUTE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationsOverviewUiState$FocusButtonState$FocusButtonMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GasStationsOverviewUiState$FocusButtonState$FocusButtonMode[] $VALUES;
    public static final GasStationsOverviewUiState$FocusButtonState$FocusButtonMode ROUTE;
    public static final GasStationsOverviewUiState$FocusButtonState$FocusButtonMode USER_LOCATION;

    static {
        GasStationsOverviewUiState$FocusButtonState$FocusButtonMode gasStationsOverviewUiState$FocusButtonState$FocusButtonMode = new GasStationsOverviewUiState$FocusButtonState$FocusButtonMode("USER_LOCATION", 0);
        USER_LOCATION = gasStationsOverviewUiState$FocusButtonState$FocusButtonMode;
        GasStationsOverviewUiState$FocusButtonState$FocusButtonMode gasStationsOverviewUiState$FocusButtonState$FocusButtonMode2 = new GasStationsOverviewUiState$FocusButtonState$FocusButtonMode("ROUTE", 1);
        ROUTE = gasStationsOverviewUiState$FocusButtonState$FocusButtonMode2;
        GasStationsOverviewUiState$FocusButtonState$FocusButtonMode[] gasStationsOverviewUiState$FocusButtonState$FocusButtonModeArr = {gasStationsOverviewUiState$FocusButtonState$FocusButtonMode, gasStationsOverviewUiState$FocusButtonState$FocusButtonMode2};
        $VALUES = gasStationsOverviewUiState$FocusButtonState$FocusButtonModeArr;
        $ENTRIES = kotlin.enums.a.a(gasStationsOverviewUiState$FocusButtonState$FocusButtonModeArr);
    }

    public static GasStationsOverviewUiState$FocusButtonState$FocusButtonMode valueOf(String str) {
        return (GasStationsOverviewUiState$FocusButtonState$FocusButtonMode) Enum.valueOf(GasStationsOverviewUiState$FocusButtonState$FocusButtonMode.class, str);
    }

    public static GasStationsOverviewUiState$FocusButtonState$FocusButtonMode[] values() {
        return (GasStationsOverviewUiState$FocusButtonState$FocusButtonMode[]) $VALUES.clone();
    }
}
