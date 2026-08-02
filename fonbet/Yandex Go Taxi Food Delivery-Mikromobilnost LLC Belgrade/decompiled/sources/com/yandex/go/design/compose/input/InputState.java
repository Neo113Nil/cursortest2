package com.yandex.go.design.compose.input;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/design/compose/input/InputState;", "", "EmptyUnfocused", "EmptyFocused", "FillUnfocused", "FillFocused", "ErrorUnfocused", "ErrorFocused", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputState[] $VALUES;
    public static final InputState EmptyFocused;
    public static final InputState EmptyUnfocused;
    public static final InputState ErrorFocused;
    public static final InputState ErrorUnfocused;
    public static final InputState FillFocused;
    public static final InputState FillUnfocused;

    static {
        InputState inputState = new InputState("EmptyUnfocused", 0);
        EmptyUnfocused = inputState;
        InputState inputState2 = new InputState("EmptyFocused", 1);
        EmptyFocused = inputState2;
        InputState inputState3 = new InputState("FillUnfocused", 2);
        FillUnfocused = inputState3;
        InputState inputState4 = new InputState("FillFocused", 3);
        FillFocused = inputState4;
        InputState inputState5 = new InputState("ErrorUnfocused", 4);
        ErrorUnfocused = inputState5;
        InputState inputState6 = new InputState("ErrorFocused", 5);
        ErrorFocused = inputState6;
        InputState[] inputStateArr = {inputState, inputState2, inputState3, inputState4, inputState5, inputState6};
        $VALUES = inputStateArr;
        $ENTRIES = a.a(inputStateArr);
    }

    public static InputState valueOf(String str) {
        return (InputState) Enum.valueOf(InputState.class, str);
    }

    public static InputState[] values() {
        return (InputState[]) $VALUES.clone();
    }
}
