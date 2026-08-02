package com.yandex.go.navigator.gas_stations.overview;

import defpackage.k4o;
import defpackage.svs;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$ExpansionState", "Lsvs;", "", "Lcom/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$ExpansionState;", "EXPANDED", "COLLAPSED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationsOverviewUiState$ExpansionState implements svs {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GasStationsOverviewUiState$ExpansionState[] $VALUES;
    public static final GasStationsOverviewUiState$ExpansionState COLLAPSED;
    public static final GasStationsOverviewUiState$ExpansionState EXPANDED;

    static {
        GasStationsOverviewUiState$ExpansionState gasStationsOverviewUiState$ExpansionState = new GasStationsOverviewUiState$ExpansionState("EXPANDED", 0);
        EXPANDED = gasStationsOverviewUiState$ExpansionState;
        GasStationsOverviewUiState$ExpansionState gasStationsOverviewUiState$ExpansionState2 = new GasStationsOverviewUiState$ExpansionState("COLLAPSED", 1);
        COLLAPSED = gasStationsOverviewUiState$ExpansionState2;
        GasStationsOverviewUiState$ExpansionState[] gasStationsOverviewUiState$ExpansionStateArr = {gasStationsOverviewUiState$ExpansionState, gasStationsOverviewUiState$ExpansionState2};
        $VALUES = gasStationsOverviewUiState$ExpansionStateArr;
        $ENTRIES = kotlin.enums.a.a(gasStationsOverviewUiState$ExpansionStateArr);
    }

    public static GasStationsOverviewUiState$ExpansionState valueOf(String str) {
        return (GasStationsOverviewUiState$ExpansionState) Enum.valueOf(GasStationsOverviewUiState$ExpansionState.class, str);
    }

    public static GasStationsOverviewUiState$ExpansionState[] values() {
        return (GasStationsOverviewUiState$ExpansionState[]) $VALUES.clone();
    }
}
