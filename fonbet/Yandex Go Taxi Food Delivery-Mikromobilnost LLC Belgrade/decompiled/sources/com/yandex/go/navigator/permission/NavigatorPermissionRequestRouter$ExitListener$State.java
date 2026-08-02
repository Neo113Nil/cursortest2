package com.yandex.go.navigator.permission;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/navigator/permission/NavigatorPermissionRequestRouter$ExitListener$State", "", "Lcom/yandex/go/navigator/permission/NavigatorPermissionRequestRouter$ExitListener$State;", "GRANTED", "DENIED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorPermissionRequestRouter$ExitListener$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorPermissionRequestRouter$ExitListener$State[] $VALUES;
    public static final NavigatorPermissionRequestRouter$ExitListener$State DENIED;
    public static final NavigatorPermissionRequestRouter$ExitListener$State GRANTED;

    static {
        NavigatorPermissionRequestRouter$ExitListener$State navigatorPermissionRequestRouter$ExitListener$State = new NavigatorPermissionRequestRouter$ExitListener$State("GRANTED", 0);
        GRANTED = navigatorPermissionRequestRouter$ExitListener$State;
        NavigatorPermissionRequestRouter$ExitListener$State navigatorPermissionRequestRouter$ExitListener$State2 = new NavigatorPermissionRequestRouter$ExitListener$State("DENIED", 1);
        DENIED = navigatorPermissionRequestRouter$ExitListener$State2;
        NavigatorPermissionRequestRouter$ExitListener$State[] navigatorPermissionRequestRouter$ExitListener$StateArr = {navigatorPermissionRequestRouter$ExitListener$State, navigatorPermissionRequestRouter$ExitListener$State2};
        $VALUES = navigatorPermissionRequestRouter$ExitListener$StateArr;
        $ENTRIES = a.a(navigatorPermissionRequestRouter$ExitListener$StateArr);
    }

    public static NavigatorPermissionRequestRouter$ExitListener$State valueOf(String str) {
        return (NavigatorPermissionRequestRouter$ExitListener$State) Enum.valueOf(NavigatorPermissionRequestRouter$ExitListener$State.class, str);
    }

    public static NavigatorPermissionRequestRouter$ExitListener$State[] values() {
        return (NavigatorPermissionRequestRouter$ExitListener$State[]) $VALUES.clone();
    }
}
