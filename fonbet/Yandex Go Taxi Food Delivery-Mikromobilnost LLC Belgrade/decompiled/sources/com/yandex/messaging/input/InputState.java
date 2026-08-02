package com.yandex.messaging.input;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/input/InputState;", "", "EMPTY", "WRITING_WITHOUT_AUTH", "WRITING_WITH_AUTH", "CHANNEL", "EDIT", "JOIN", "UNBLOCKING", "AUTHORIZATION", "AUTHORIZATION_WITHOUT_PHONE", "SEARCH_NAVIGATION", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputState[] $VALUES;
    public static final InputState AUTHORIZATION;
    public static final InputState AUTHORIZATION_WITHOUT_PHONE;
    public static final InputState CHANNEL;
    public static final InputState EDIT;
    public static final InputState EMPTY;
    public static final InputState JOIN;
    public static final InputState SEARCH_NAVIGATION;
    public static final InputState UNBLOCKING;
    public static final InputState WRITING_WITHOUT_AUTH;
    public static final InputState WRITING_WITH_AUTH;

    static {
        InputState inputState = new InputState("EMPTY", 0);
        EMPTY = inputState;
        InputState inputState2 = new InputState("WRITING_WITHOUT_AUTH", 1);
        WRITING_WITHOUT_AUTH = inputState2;
        InputState inputState3 = new InputState("WRITING_WITH_AUTH", 2);
        WRITING_WITH_AUTH = inputState3;
        InputState inputState4 = new InputState("CHANNEL", 3);
        CHANNEL = inputState4;
        InputState inputState5 = new InputState("EDIT", 4);
        EDIT = inputState5;
        InputState inputState6 = new InputState("JOIN", 5);
        JOIN = inputState6;
        InputState inputState7 = new InputState("UNBLOCKING", 6);
        UNBLOCKING = inputState7;
        InputState inputState8 = new InputState("AUTHORIZATION", 7);
        AUTHORIZATION = inputState8;
        InputState inputState9 = new InputState("AUTHORIZATION_WITHOUT_PHONE", 8);
        AUTHORIZATION_WITHOUT_PHONE = inputState9;
        InputState inputState10 = new InputState("SEARCH_NAVIGATION", 9);
        SEARCH_NAVIGATION = inputState10;
        InputState[] inputStateArr = {inputState, inputState2, inputState3, inputState4, inputState5, inputState6, inputState7, inputState8, inputState9, inputState10};
        $VALUES = inputStateArr;
        $ENTRIES = kotlin.enums.a.a(inputStateArr);
    }

    public static InputState valueOf(String str) {
        return (InputState) Enum.valueOf(InputState.class, str);
    }

    public static InputState[] values() {
        return (InputState[]) $VALUES.clone();
    }
}
