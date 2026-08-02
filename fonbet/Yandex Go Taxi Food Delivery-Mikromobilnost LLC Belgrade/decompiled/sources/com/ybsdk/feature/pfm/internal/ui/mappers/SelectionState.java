package com.ybsdk.feature.pfm.internal.ui.mappers;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/mappers/SelectionState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SELECTED", "DISABLED", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectionState[] $VALUES;
    public static final SelectionState IDLE = new SelectionState("IDLE", 0);
    public static final SelectionState SELECTED = new SelectionState("SELECTED", 1);
    public static final SelectionState DISABLED = new SelectionState("DISABLED", 2);

    private static final /* synthetic */ SelectionState[] $values() {
        return new SelectionState[]{IDLE, SELECTED, DISABLED};
    }

    static {
        SelectionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SelectionState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SelectionState valueOf(String str) {
        return (SelectionState) Enum.valueOf(SelectionState.class, str);
    }

    public static SelectionState[] values() {
        return (SelectionState[]) $VALUES.clone();
    }
}
