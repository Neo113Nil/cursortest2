package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yx360/design/compose/atoms/DsCheckbox$State", "", "Lcom/yx360/design/compose/atoms/DsCheckbox$State;", "Selected", "Indeterminate", "Unselected", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCheckbox$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsCheckbox$State[] $VALUES;
    public static final DsCheckbox$State Indeterminate;
    public static final DsCheckbox$State Selected;
    public static final DsCheckbox$State Unselected;

    static {
        DsCheckbox$State dsCheckbox$State = new DsCheckbox$State("Selected", 0);
        Selected = dsCheckbox$State;
        DsCheckbox$State dsCheckbox$State2 = new DsCheckbox$State("Indeterminate", 1);
        Indeterminate = dsCheckbox$State2;
        DsCheckbox$State dsCheckbox$State3 = new DsCheckbox$State("Unselected", 2);
        Unselected = dsCheckbox$State3;
        DsCheckbox$State[] dsCheckbox$StateArr = {dsCheckbox$State, dsCheckbox$State2, dsCheckbox$State3};
        $VALUES = dsCheckbox$StateArr;
        $ENTRIES = kotlin.enums.a.a(dsCheckbox$StateArr);
    }

    public static DsCheckbox$State valueOf(String str) {
        return (DsCheckbox$State) Enum.valueOf(DsCheckbox$State.class, str);
    }

    public static DsCheckbox$State[] values() {
        return (DsCheckbox$State[]) $VALUES.clone();
    }
}
