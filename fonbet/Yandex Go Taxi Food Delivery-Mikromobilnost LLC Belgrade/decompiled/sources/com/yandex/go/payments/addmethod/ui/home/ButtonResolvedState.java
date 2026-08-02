package com.yandex.go.payments.addmethod.ui.home;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/ui/home/ButtonResolvedState;", "", "ENABLED", "DISABLED", "BUSY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonResolvedState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonResolvedState[] $VALUES;
    public static final ButtonResolvedState BUSY;
    public static final ButtonResolvedState DISABLED;
    public static final ButtonResolvedState ENABLED;

    static {
        ButtonResolvedState buttonResolvedState = new ButtonResolvedState("ENABLED", 0);
        ENABLED = buttonResolvedState;
        ButtonResolvedState buttonResolvedState2 = new ButtonResolvedState("DISABLED", 1);
        DISABLED = buttonResolvedState2;
        ButtonResolvedState buttonResolvedState3 = new ButtonResolvedState("BUSY", 2);
        BUSY = buttonResolvedState3;
        ButtonResolvedState[] buttonResolvedStateArr = {buttonResolvedState, buttonResolvedState2, buttonResolvedState3};
        $VALUES = buttonResolvedStateArr;
        $ENTRIES = kotlin.enums.a.a(buttonResolvedStateArr);
    }

    public static ButtonResolvedState valueOf(String str) {
        return (ButtonResolvedState) Enum.valueOf(ButtonResolvedState.class, str);
    }

    public static ButtonResolvedState[] values() {
        return (ButtonResolvedState[]) $VALUES.clone();
    }
}
