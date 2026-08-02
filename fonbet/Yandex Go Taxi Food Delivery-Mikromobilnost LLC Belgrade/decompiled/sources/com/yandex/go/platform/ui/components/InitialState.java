package com.yandex.go.platform.ui.components;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/ui/components/InitialState;", "", "None", "Spinner", "Animation", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InitialState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InitialState[] $VALUES;
    public static final InitialState Animation;
    public static final InitialState None;
    public static final InitialState Spinner;

    static {
        InitialState initialState = new InitialState("None", 0);
        None = initialState;
        InitialState initialState2 = new InitialState("Spinner", 1);
        Spinner = initialState2;
        InitialState initialState3 = new InitialState("Animation", 2);
        Animation = initialState3;
        InitialState[] initialStateArr = {initialState, initialState2, initialState3};
        $VALUES = initialStateArr;
        $ENTRIES = a.a(initialStateArr);
    }

    public static InitialState valueOf(String str) {
        return (InitialState) Enum.valueOf(InitialState.class, str);
    }

    public static InitialState[] values() {
        return (InitialState[]) $VALUES.clone();
    }
}
