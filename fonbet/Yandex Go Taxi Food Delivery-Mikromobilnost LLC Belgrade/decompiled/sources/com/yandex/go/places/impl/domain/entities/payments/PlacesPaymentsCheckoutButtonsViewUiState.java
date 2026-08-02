package com.yandex.go.places.impl.domain.entities.payments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/entities/payments/PlacesPaymentsCheckoutButtonsViewUiState;", "", "LOADING", "SUCCESS", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPaymentsCheckoutButtonsViewUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPaymentsCheckoutButtonsViewUiState[] $VALUES;
    public static final PlacesPaymentsCheckoutButtonsViewUiState ERROR;
    public static final PlacesPaymentsCheckoutButtonsViewUiState LOADING;
    public static final PlacesPaymentsCheckoutButtonsViewUiState SUCCESS;

    static {
        PlacesPaymentsCheckoutButtonsViewUiState placesPaymentsCheckoutButtonsViewUiState = new PlacesPaymentsCheckoutButtonsViewUiState("LOADING", 0);
        LOADING = placesPaymentsCheckoutButtonsViewUiState;
        PlacesPaymentsCheckoutButtonsViewUiState placesPaymentsCheckoutButtonsViewUiState2 = new PlacesPaymentsCheckoutButtonsViewUiState("SUCCESS", 1);
        SUCCESS = placesPaymentsCheckoutButtonsViewUiState2;
        PlacesPaymentsCheckoutButtonsViewUiState placesPaymentsCheckoutButtonsViewUiState3 = new PlacesPaymentsCheckoutButtonsViewUiState("ERROR", 2);
        ERROR = placesPaymentsCheckoutButtonsViewUiState3;
        PlacesPaymentsCheckoutButtonsViewUiState[] placesPaymentsCheckoutButtonsViewUiStateArr = {placesPaymentsCheckoutButtonsViewUiState, placesPaymentsCheckoutButtonsViewUiState2, placesPaymentsCheckoutButtonsViewUiState3};
        $VALUES = placesPaymentsCheckoutButtonsViewUiStateArr;
        $ENTRIES = kotlin.enums.a.a(placesPaymentsCheckoutButtonsViewUiStateArr);
    }

    public static PlacesPaymentsCheckoutButtonsViewUiState valueOf(String str) {
        return (PlacesPaymentsCheckoutButtonsViewUiState) Enum.valueOf(PlacesPaymentsCheckoutButtonsViewUiState.class, str);
    }

    public static PlacesPaymentsCheckoutButtonsViewUiState[] values() {
        return (PlacesPaymentsCheckoutButtonsViewUiState[]) $VALUES.clone();
    }
}
