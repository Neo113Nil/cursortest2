package com.yandex.go.taxi.order.details.v1.elements.live_location;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/elements/live_location/DetailsCardLiveLocationUiState;", "", Card.ACTIVE, "INACTIVE", "UNAVAILABLE", "GONE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsCardLiveLocationUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DetailsCardLiveLocationUiState[] $VALUES;
    public static final DetailsCardLiveLocationUiState ACTIVE;
    public static final DetailsCardLiveLocationUiState GONE;
    public static final DetailsCardLiveLocationUiState INACTIVE;
    public static final DetailsCardLiveLocationUiState UNAVAILABLE;

    static {
        DetailsCardLiveLocationUiState detailsCardLiveLocationUiState = new DetailsCardLiveLocationUiState(Card.ACTIVE, 0);
        ACTIVE = detailsCardLiveLocationUiState;
        DetailsCardLiveLocationUiState detailsCardLiveLocationUiState2 = new DetailsCardLiveLocationUiState("INACTIVE", 1);
        INACTIVE = detailsCardLiveLocationUiState2;
        DetailsCardLiveLocationUiState detailsCardLiveLocationUiState3 = new DetailsCardLiveLocationUiState("UNAVAILABLE", 2);
        UNAVAILABLE = detailsCardLiveLocationUiState3;
        DetailsCardLiveLocationUiState detailsCardLiveLocationUiState4 = new DetailsCardLiveLocationUiState("GONE", 3);
        GONE = detailsCardLiveLocationUiState4;
        DetailsCardLiveLocationUiState[] detailsCardLiveLocationUiStateArr = {detailsCardLiveLocationUiState, detailsCardLiveLocationUiState2, detailsCardLiveLocationUiState3, detailsCardLiveLocationUiState4};
        $VALUES = detailsCardLiveLocationUiStateArr;
        $ENTRIES = a.a(detailsCardLiveLocationUiStateArr);
    }

    public static DetailsCardLiveLocationUiState valueOf(String str) {
        return (DetailsCardLiveLocationUiState) Enum.valueOf(DetailsCardLiveLocationUiState.class, str);
    }

    public static DetailsCardLiveLocationUiState[] values() {
        return (DetailsCardLiveLocationUiState[]) $VALUES.clone();
    }
}
