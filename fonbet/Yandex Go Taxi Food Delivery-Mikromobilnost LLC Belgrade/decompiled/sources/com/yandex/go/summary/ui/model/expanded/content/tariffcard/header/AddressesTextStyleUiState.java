package com.yandex.go.summary.ui.model.expanded.content.tariffcard.header;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/summary/ui/model/expanded/content/tariffcard/header/AddressesTextStyleUiState;", "", "HEADER_TEXT_STYLE", "HEADER_REDESIGNED_TEXT_STYLE", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AddressesTextStyleUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressesTextStyleUiState[] $VALUES;
    public static final AddressesTextStyleUiState HEADER_REDESIGNED_TEXT_STYLE;
    public static final AddressesTextStyleUiState HEADER_TEXT_STYLE;

    static {
        AddressesTextStyleUiState addressesTextStyleUiState = new AddressesTextStyleUiState("HEADER_TEXT_STYLE", 0);
        HEADER_TEXT_STYLE = addressesTextStyleUiState;
        AddressesTextStyleUiState addressesTextStyleUiState2 = new AddressesTextStyleUiState("HEADER_REDESIGNED_TEXT_STYLE", 1);
        HEADER_REDESIGNED_TEXT_STYLE = addressesTextStyleUiState2;
        AddressesTextStyleUiState[] addressesTextStyleUiStateArr = {addressesTextStyleUiState, addressesTextStyleUiState2};
        $VALUES = addressesTextStyleUiStateArr;
        $ENTRIES = a.a(addressesTextStyleUiStateArr);
    }

    public static AddressesTextStyleUiState valueOf(String str) {
        return (AddressesTextStyleUiState) Enum.valueOf(AddressesTextStyleUiState.class, str);
    }

    public static AddressesTextStyleUiState[] values() {
        return (AddressesTextStyleUiState[]) $VALUES.clone();
    }
}
