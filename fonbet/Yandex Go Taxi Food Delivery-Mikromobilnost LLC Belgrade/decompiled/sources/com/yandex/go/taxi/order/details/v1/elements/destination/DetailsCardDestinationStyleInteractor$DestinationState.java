package com.yandex.go.taxi.order.details.v1.elements.destination;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/details/v1/elements/destination/DetailsCardDestinationStyleInteractor$DestinationState", "", "Lcom/yandex/go/taxi/order/details/v1/elements/destination/DetailsCardDestinationStyleInteractor$DestinationState;", "ADD", "EDIT", "STATIC", "GONE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsCardDestinationStyleInteractor$DestinationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DetailsCardDestinationStyleInteractor$DestinationState[] $VALUES;
    public static final DetailsCardDestinationStyleInteractor$DestinationState ADD;
    public static final DetailsCardDestinationStyleInteractor$DestinationState EDIT;
    public static final DetailsCardDestinationStyleInteractor$DestinationState GONE;
    public static final DetailsCardDestinationStyleInteractor$DestinationState STATIC;

    static {
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState = new DetailsCardDestinationStyleInteractor$DestinationState("ADD", 0);
        ADD = detailsCardDestinationStyleInteractor$DestinationState;
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState2 = new DetailsCardDestinationStyleInteractor$DestinationState("EDIT", 1);
        EDIT = detailsCardDestinationStyleInteractor$DestinationState2;
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState3 = new DetailsCardDestinationStyleInteractor$DestinationState("STATIC", 2);
        STATIC = detailsCardDestinationStyleInteractor$DestinationState3;
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState4 = new DetailsCardDestinationStyleInteractor$DestinationState("GONE", 3);
        GONE = detailsCardDestinationStyleInteractor$DestinationState4;
        DetailsCardDestinationStyleInteractor$DestinationState[] detailsCardDestinationStyleInteractor$DestinationStateArr = {detailsCardDestinationStyleInteractor$DestinationState, detailsCardDestinationStyleInteractor$DestinationState2, detailsCardDestinationStyleInteractor$DestinationState3, detailsCardDestinationStyleInteractor$DestinationState4};
        $VALUES = detailsCardDestinationStyleInteractor$DestinationStateArr;
        $ENTRIES = kotlin.enums.a.a(detailsCardDestinationStyleInteractor$DestinationStateArr);
    }

    public static DetailsCardDestinationStyleInteractor$DestinationState valueOf(String str) {
        return (DetailsCardDestinationStyleInteractor$DestinationState) Enum.valueOf(DetailsCardDestinationStyleInteractor$DestinationState.class, str);
    }

    public static DetailsCardDestinationStyleInteractor$DestinationState[] values() {
        return (DetailsCardDestinationStyleInteractor$DestinationState[]) $VALUES.clone();
    }
}
