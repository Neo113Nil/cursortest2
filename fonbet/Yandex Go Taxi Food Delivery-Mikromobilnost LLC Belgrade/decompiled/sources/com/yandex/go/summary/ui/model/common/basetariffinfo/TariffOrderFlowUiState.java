package com.yandex.go.summary.ui.model.common.basetariffinfo;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/summary/ui/model/common/basetariffinfo/TariffOrderFlowUiState;", "", "DRIVE_FLOW", "TAXI_FLOW", "SHUTTLE_FLOW", "DELIVERY_FLOW", "COPTER_FLOW", "COPTER_CITY_TOUR_FLOW", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffOrderFlowUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffOrderFlowUiState[] $VALUES;
    public static final TariffOrderFlowUiState COPTER_CITY_TOUR_FLOW;
    public static final TariffOrderFlowUiState COPTER_FLOW;
    public static final TariffOrderFlowUiState DELIVERY_FLOW;
    public static final TariffOrderFlowUiState DRIVE_FLOW;
    public static final TariffOrderFlowUiState SHUTTLE_FLOW;
    public static final TariffOrderFlowUiState TAXI_FLOW;

    static {
        TariffOrderFlowUiState tariffOrderFlowUiState = new TariffOrderFlowUiState("DRIVE_FLOW", 0);
        DRIVE_FLOW = tariffOrderFlowUiState;
        TariffOrderFlowUiState tariffOrderFlowUiState2 = new TariffOrderFlowUiState("TAXI_FLOW", 1);
        TAXI_FLOW = tariffOrderFlowUiState2;
        TariffOrderFlowUiState tariffOrderFlowUiState3 = new TariffOrderFlowUiState("SHUTTLE_FLOW", 2);
        SHUTTLE_FLOW = tariffOrderFlowUiState3;
        TariffOrderFlowUiState tariffOrderFlowUiState4 = new TariffOrderFlowUiState("DELIVERY_FLOW", 3);
        DELIVERY_FLOW = tariffOrderFlowUiState4;
        TariffOrderFlowUiState tariffOrderFlowUiState5 = new TariffOrderFlowUiState("COPTER_FLOW", 4);
        COPTER_FLOW = tariffOrderFlowUiState5;
        TariffOrderFlowUiState tariffOrderFlowUiState6 = new TariffOrderFlowUiState("COPTER_CITY_TOUR_FLOW", 5);
        COPTER_CITY_TOUR_FLOW = tariffOrderFlowUiState6;
        TariffOrderFlowUiState[] tariffOrderFlowUiStateArr = {tariffOrderFlowUiState, tariffOrderFlowUiState2, tariffOrderFlowUiState3, tariffOrderFlowUiState4, tariffOrderFlowUiState5, tariffOrderFlowUiState6};
        $VALUES = tariffOrderFlowUiStateArr;
        $ENTRIES = a.a(tariffOrderFlowUiStateArr);
    }

    public static TariffOrderFlowUiState valueOf(String str) {
        return (TariffOrderFlowUiState) Enum.valueOf(TariffOrderFlowUiState.class, str);
    }

    public static TariffOrderFlowUiState[] values() {
        return (TariffOrderFlowUiState[]) $VALUES.clone();
    }
}
