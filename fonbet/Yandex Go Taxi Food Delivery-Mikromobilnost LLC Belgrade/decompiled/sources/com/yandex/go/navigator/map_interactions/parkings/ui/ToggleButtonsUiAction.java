package com.yandex.go.navigator.map_interactions.parkings.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/map_interactions/parkings/ui/ToggleButtonsUiAction;", "", "PARKING_TOGGLE", "TRAFFIC_TOGGLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ToggleButtonsUiAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ToggleButtonsUiAction[] $VALUES;
    public static final ToggleButtonsUiAction PARKING_TOGGLE;
    public static final ToggleButtonsUiAction TRAFFIC_TOGGLE;

    static {
        ToggleButtonsUiAction toggleButtonsUiAction = new ToggleButtonsUiAction("PARKING_TOGGLE", 0);
        PARKING_TOGGLE = toggleButtonsUiAction;
        ToggleButtonsUiAction toggleButtonsUiAction2 = new ToggleButtonsUiAction("TRAFFIC_TOGGLE", 1);
        TRAFFIC_TOGGLE = toggleButtonsUiAction2;
        ToggleButtonsUiAction[] toggleButtonsUiActionArr = {toggleButtonsUiAction, toggleButtonsUiAction2};
        $VALUES = toggleButtonsUiActionArr;
        $ENTRIES = a.a(toggleButtonsUiActionArr);
    }

    public static ToggleButtonsUiAction valueOf(String str) {
        return (ToggleButtonsUiAction) Enum.valueOf(ToggleButtonsUiAction.class, str);
    }

    public static ToggleButtonsUiAction[] values() {
        return (ToggleButtonsUiAction[]) $VALUES.clone();
    }
}
