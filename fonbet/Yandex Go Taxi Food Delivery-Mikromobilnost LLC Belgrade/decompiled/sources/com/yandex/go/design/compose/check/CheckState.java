package com.yandex.go.design.compose.check;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/design/compose/check/CheckState;", "", "Checked", "Unchecked", "Mixed", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckState[] $VALUES;
    public static final CheckState Checked;
    public static final CheckState Mixed;
    public static final CheckState Unchecked;

    static {
        CheckState checkState = new CheckState("Checked", 0);
        Checked = checkState;
        CheckState checkState2 = new CheckState("Unchecked", 1);
        Unchecked = checkState2;
        CheckState checkState3 = new CheckState("Mixed", 2);
        Mixed = checkState3;
        CheckState[] checkStateArr = {checkState, checkState2, checkState3};
        $VALUES = checkStateArr;
        $ENTRIES = a.a(checkStateArr);
    }

    public static CheckState valueOf(String str) {
        return (CheckState) Enum.valueOf(CheckState.class, str);
    }

    public static CheckState[] values() {
        return (CheckState[]) $VALUES.clone();
    }
}
