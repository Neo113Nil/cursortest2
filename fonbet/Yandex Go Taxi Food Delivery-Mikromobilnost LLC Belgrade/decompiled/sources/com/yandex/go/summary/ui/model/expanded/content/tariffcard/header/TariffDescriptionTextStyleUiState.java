package com.yandex.go.summary.ui.model.expanded.content.tariffcard.header;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/summary/ui/model/expanded/content/tariffcard/header/TariffDescriptionTextStyleUiState;", "", "CAR_HEADER_TEXT_STYLE", "CAR_HEADER_REDESIGNED_TEXT_STYLE", "BACKGROUND_HEADER_TEXT_STYLE", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffDescriptionTextStyleUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffDescriptionTextStyleUiState[] $VALUES;
    public static final TariffDescriptionTextStyleUiState BACKGROUND_HEADER_TEXT_STYLE;
    public static final TariffDescriptionTextStyleUiState CAR_HEADER_REDESIGNED_TEXT_STYLE;
    public static final TariffDescriptionTextStyleUiState CAR_HEADER_TEXT_STYLE;

    static {
        TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState = new TariffDescriptionTextStyleUiState("CAR_HEADER_TEXT_STYLE", 0);
        CAR_HEADER_TEXT_STYLE = tariffDescriptionTextStyleUiState;
        TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState2 = new TariffDescriptionTextStyleUiState("CAR_HEADER_REDESIGNED_TEXT_STYLE", 1);
        CAR_HEADER_REDESIGNED_TEXT_STYLE = tariffDescriptionTextStyleUiState2;
        TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState3 = new TariffDescriptionTextStyleUiState("BACKGROUND_HEADER_TEXT_STYLE", 2);
        BACKGROUND_HEADER_TEXT_STYLE = tariffDescriptionTextStyleUiState3;
        TariffDescriptionTextStyleUiState[] tariffDescriptionTextStyleUiStateArr = {tariffDescriptionTextStyleUiState, tariffDescriptionTextStyleUiState2, tariffDescriptionTextStyleUiState3};
        $VALUES = tariffDescriptionTextStyleUiStateArr;
        $ENTRIES = a.a(tariffDescriptionTextStyleUiStateArr);
    }

    public static TariffDescriptionTextStyleUiState valueOf(String str) {
        return (TariffDescriptionTextStyleUiState) Enum.valueOf(TariffDescriptionTextStyleUiState.class, str);
    }

    public static TariffDescriptionTextStyleUiState[] values() {
        return (TariffDescriptionTextStyleUiState[]) $VALUES.clone();
    }
}
