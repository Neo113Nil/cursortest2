package com.yandex.go.scooters.ignition.panel;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/ignition/panel/ScootersIgnitionPanelUiState$Banner$Action", "", "Lcom/yandex/go/scooters/ignition/panel/ScootersIgnitionPanelUiState$Banner$Action;", "PROMOTION", "START_RIDE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersIgnitionPanelUiState$Banner$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersIgnitionPanelUiState$Banner$Action[] $VALUES;
    public static final ScootersIgnitionPanelUiState$Banner$Action PROMOTION;
    public static final ScootersIgnitionPanelUiState$Banner$Action START_RIDE;

    static {
        ScootersIgnitionPanelUiState$Banner$Action scootersIgnitionPanelUiState$Banner$Action = new ScootersIgnitionPanelUiState$Banner$Action("PROMOTION", 0);
        PROMOTION = scootersIgnitionPanelUiState$Banner$Action;
        ScootersIgnitionPanelUiState$Banner$Action scootersIgnitionPanelUiState$Banner$Action2 = new ScootersIgnitionPanelUiState$Banner$Action("START_RIDE", 1);
        START_RIDE = scootersIgnitionPanelUiState$Banner$Action2;
        ScootersIgnitionPanelUiState$Banner$Action[] scootersIgnitionPanelUiState$Banner$ActionArr = {scootersIgnitionPanelUiState$Banner$Action, scootersIgnitionPanelUiState$Banner$Action2};
        $VALUES = scootersIgnitionPanelUiState$Banner$ActionArr;
        $ENTRIES = kotlin.enums.a.a(scootersIgnitionPanelUiState$Banner$ActionArr);
    }

    public static ScootersIgnitionPanelUiState$Banner$Action valueOf(String str) {
        return (ScootersIgnitionPanelUiState$Banner$Action) Enum.valueOf(ScootersIgnitionPanelUiState$Banner$Action.class, str);
    }

    public static ScootersIgnitionPanelUiState$Banner$Action[] values() {
        return (ScootersIgnitionPanelUiState$Banner$Action[]) $VALUES.clone();
    }
}
