package com.yandex.messaging.input.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class Keyboarder$KeyboardState {
    private static final /* synthetic */ Keyboarder$KeyboardState[] $VALUES;
    public static final Keyboarder$KeyboardState CLOSED;
    public static final Keyboarder$KeyboardState OPEN;

    static {
        Keyboarder$KeyboardState keyboarder$KeyboardState = new Keyboarder$KeyboardState("OPEN", 0);
        OPEN = keyboarder$KeyboardState;
        Keyboarder$KeyboardState keyboarder$KeyboardState2 = new Keyboarder$KeyboardState("CLOSED", 1);
        CLOSED = keyboarder$KeyboardState2;
        $VALUES = new Keyboarder$KeyboardState[]{keyboarder$KeyboardState, keyboarder$KeyboardState2};
    }

    public static Keyboarder$KeyboardState valueOf(String str) {
        return (Keyboarder$KeyboardState) Enum.valueOf(Keyboarder$KeyboardState.class, str);
    }

    public static Keyboarder$KeyboardState[] values() {
        return (Keyboarder$KeyboardState[]) $VALUES.clone();
    }
}
