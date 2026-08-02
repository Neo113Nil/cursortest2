package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yx360/design/compose/atoms/UserState;", "", "Default", "Pressed", "Disabled", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserState[] $VALUES;
    public static final UserState Default;
    public static final UserState Disabled;
    public static final UserState Pressed;

    static {
        UserState userState = new UserState("Default", 0);
        Default = userState;
        UserState userState2 = new UserState("Pressed", 1);
        Pressed = userState2;
        UserState userState3 = new UserState("Disabled", 2);
        Disabled = userState3;
        UserState[] userStateArr = {userState, userState2, userState3};
        $VALUES = userStateArr;
        $ENTRIES = kotlin.enums.a.a(userStateArr);
    }

    public static UserState valueOf(String str) {
        return (UserState) Enum.valueOf(UserState.class, str);
    }

    public static UserState[] values() {
        return (UserState[]) $VALUES.clone();
    }
}
