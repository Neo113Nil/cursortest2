package com.yandex.go.summary.ui.model.expanded.content.tariffcard.header;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/summary/ui/model/expanded/content/tariffcard/header/TariffNameTextStyleUiState;", "", "CAR_HEADER_TEXT_STYLE", "CAR_HEADER_REDESIGNED_TEXT_STYLE", "BACKGROUND_HEADER_TEXT_STYLE", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffNameTextStyleUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffNameTextStyleUiState[] $VALUES;
    public static final TariffNameTextStyleUiState BACKGROUND_HEADER_TEXT_STYLE;
    public static final TariffNameTextStyleUiState CAR_HEADER_REDESIGNED_TEXT_STYLE;
    public static final TariffNameTextStyleUiState CAR_HEADER_TEXT_STYLE;

    static {
        TariffNameTextStyleUiState tariffNameTextStyleUiState = new TariffNameTextStyleUiState("CAR_HEADER_TEXT_STYLE", 0);
        CAR_HEADER_TEXT_STYLE = tariffNameTextStyleUiState;
        TariffNameTextStyleUiState tariffNameTextStyleUiState2 = new TariffNameTextStyleUiState("CAR_HEADER_REDESIGNED_TEXT_STYLE", 1);
        CAR_HEADER_REDESIGNED_TEXT_STYLE = tariffNameTextStyleUiState2;
        TariffNameTextStyleUiState tariffNameTextStyleUiState3 = new TariffNameTextStyleUiState("BACKGROUND_HEADER_TEXT_STYLE", 2);
        BACKGROUND_HEADER_TEXT_STYLE = tariffNameTextStyleUiState3;
        TariffNameTextStyleUiState[] tariffNameTextStyleUiStateArr = {tariffNameTextStyleUiState, tariffNameTextStyleUiState2, tariffNameTextStyleUiState3};
        $VALUES = tariffNameTextStyleUiStateArr;
        $ENTRIES = a.a(tariffNameTextStyleUiStateArr);
    }

    public static TariffNameTextStyleUiState valueOf(String str) {
        return (TariffNameTextStyleUiState) Enum.valueOf(TariffNameTextStyleUiState.class, str);
    }

    public static TariffNameTextStyleUiState[] values() {
        return (TariffNameTextStyleUiState[]) $VALUES.clone();
    }
}
