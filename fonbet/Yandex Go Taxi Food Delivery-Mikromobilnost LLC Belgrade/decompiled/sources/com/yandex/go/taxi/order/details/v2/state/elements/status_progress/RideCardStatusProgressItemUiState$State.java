package com.yandex.go.taxi.order.details.v2.state.elements.status_progress;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/details/v2/state/elements/status_progress/RideCardStatusProgressItemUiState$State", "", "Lcom/yandex/go/taxi/order/details/v2/state/elements/status_progress/RideCardStatusProgressItemUiState$State;", "LOADING", "REGULAR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardStatusProgressItemUiState$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardStatusProgressItemUiState$State[] $VALUES;
    public static final RideCardStatusProgressItemUiState$State LOADING;
    public static final RideCardStatusProgressItemUiState$State REGULAR;

    static {
        RideCardStatusProgressItemUiState$State rideCardStatusProgressItemUiState$State = new RideCardStatusProgressItemUiState$State("LOADING", 0);
        LOADING = rideCardStatusProgressItemUiState$State;
        RideCardStatusProgressItemUiState$State rideCardStatusProgressItemUiState$State2 = new RideCardStatusProgressItemUiState$State("REGULAR", 1);
        REGULAR = rideCardStatusProgressItemUiState$State2;
        RideCardStatusProgressItemUiState$State[] rideCardStatusProgressItemUiState$StateArr = {rideCardStatusProgressItemUiState$State, rideCardStatusProgressItemUiState$State2};
        $VALUES = rideCardStatusProgressItemUiState$StateArr;
        $ENTRIES = kotlin.enums.a.a(rideCardStatusProgressItemUiState$StateArr);
    }

    public static RideCardStatusProgressItemUiState$State valueOf(String str) {
        return (RideCardStatusProgressItemUiState$State) Enum.valueOf(RideCardStatusProgressItemUiState$State.class, str);
    }

    public static RideCardStatusProgressItemUiState$State[] values() {
        return (RideCardStatusProgressItemUiState$State[]) $VALUES.clone();
    }
}
