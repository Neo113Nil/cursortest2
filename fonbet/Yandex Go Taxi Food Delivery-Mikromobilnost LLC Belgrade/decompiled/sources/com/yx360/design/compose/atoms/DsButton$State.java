package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yx360/design/compose/atoms/DsButton$State", "", "Lcom/yx360/design/compose/atoms/DsButton$State;", "Default", "Pressed", "Disabled", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsButton$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsButton$State[] $VALUES;
    public static final DsButton$State Default;
    public static final DsButton$State Disabled;
    public static final DsButton$State Pressed;

    static {
        DsButton$State dsButton$State = new DsButton$State("Default", 0);
        Default = dsButton$State;
        DsButton$State dsButton$State2 = new DsButton$State("Pressed", 1);
        Pressed = dsButton$State2;
        DsButton$State dsButton$State3 = new DsButton$State("Disabled", 2);
        Disabled = dsButton$State3;
        DsButton$State[] dsButton$StateArr = {dsButton$State, dsButton$State2, dsButton$State3};
        $VALUES = dsButton$StateArr;
        $ENTRIES = kotlin.enums.a.a(dsButton$StateArr);
    }

    public static DsButton$State valueOf(String str) {
        return (DsButton$State) Enum.valueOf(DsButton$State.class, str);
    }

    public static DsButton$State[] values() {
        return (DsButton$State[]) $VALUES.clone();
    }
}
