package com.yandex.go.requirements.comment.summary.ui.v3.ui.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/requirements/comment/summary/ui/v3/ui/model/ButtonUiState$LoadingState", "", "Lcom/yandex/go/requirements/comment/summary/ui/v3/ui/model/ButtonUiState$LoadingState;", "LOADING", "ENABLED", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonUiState$LoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonUiState$LoadingState[] $VALUES;
    public static final ButtonUiState$LoadingState DISABLED;
    public static final ButtonUiState$LoadingState ENABLED;
    public static final ButtonUiState$LoadingState LOADING;

    static {
        ButtonUiState$LoadingState buttonUiState$LoadingState = new ButtonUiState$LoadingState("LOADING", 0);
        LOADING = buttonUiState$LoadingState;
        ButtonUiState$LoadingState buttonUiState$LoadingState2 = new ButtonUiState$LoadingState("ENABLED", 1);
        ENABLED = buttonUiState$LoadingState2;
        ButtonUiState$LoadingState buttonUiState$LoadingState3 = new ButtonUiState$LoadingState("DISABLED", 2);
        DISABLED = buttonUiState$LoadingState3;
        ButtonUiState$LoadingState[] buttonUiState$LoadingStateArr = {buttonUiState$LoadingState, buttonUiState$LoadingState2, buttonUiState$LoadingState3};
        $VALUES = buttonUiState$LoadingStateArr;
        $ENTRIES = a.a(buttonUiState$LoadingStateArr);
    }

    public static ButtonUiState$LoadingState valueOf(String str) {
        return (ButtonUiState$LoadingState) Enum.valueOf(ButtonUiState$LoadingState.class, str);
    }

    public static ButtonUiState$LoadingState[] values() {
        return (ButtonUiState$LoadingState[]) $VALUES.clone();
    }
}
