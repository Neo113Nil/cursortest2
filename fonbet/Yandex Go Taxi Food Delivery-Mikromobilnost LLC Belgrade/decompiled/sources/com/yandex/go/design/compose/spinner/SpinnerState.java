package com.yandex.go.design.compose.spinner;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/design/compose/spinner/SpinnerState;", "", "LOADING", "DONE", "ERROR", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SpinnerState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SpinnerState[] $VALUES;
    public static final SpinnerState DONE;
    public static final SpinnerState ERROR;
    public static final SpinnerState LOADING;

    static {
        SpinnerState spinnerState = new SpinnerState("LOADING", 0);
        LOADING = spinnerState;
        SpinnerState spinnerState2 = new SpinnerState("DONE", 1);
        DONE = spinnerState2;
        SpinnerState spinnerState3 = new SpinnerState("ERROR", 2);
        ERROR = spinnerState3;
        SpinnerState[] spinnerStateArr = {spinnerState, spinnerState2, spinnerState3};
        $VALUES = spinnerStateArr;
        $ENTRIES = a.a(spinnerStateArr);
    }

    public static SpinnerState valueOf(String str) {
        return (SpinnerState) Enum.valueOf(SpinnerState.class, str);
    }

    public static SpinnerState[] values() {
        return (SpinnerState[]) $VALUES.clone();
    }
}
