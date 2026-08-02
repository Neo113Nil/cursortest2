package com.yandex.go.navigator.order;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/navigator/order/NavigationOrder$NavigationType", "", "Lcom/yandex/go/navigator/order/NavigationOrder$NavigationType;", "AUTO", "WALKING", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationOrder$NavigationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationOrder$NavigationType[] $VALUES;
    public static final NavigationOrder$NavigationType AUTO;
    public static final NavigationOrder$NavigationType WALKING;

    static {
        NavigationOrder$NavigationType navigationOrder$NavigationType = new NavigationOrder$NavigationType("AUTO", 0);
        AUTO = navigationOrder$NavigationType;
        NavigationOrder$NavigationType navigationOrder$NavigationType2 = new NavigationOrder$NavigationType("WALKING", 1);
        WALKING = navigationOrder$NavigationType2;
        NavigationOrder$NavigationType[] navigationOrder$NavigationTypeArr = {navigationOrder$NavigationType, navigationOrder$NavigationType2};
        $VALUES = navigationOrder$NavigationTypeArr;
        $ENTRIES = kotlin.enums.a.a(navigationOrder$NavigationTypeArr);
    }

    public static NavigationOrder$NavigationType valueOf(String str) {
        return (NavigationOrder$NavigationType) Enum.valueOf(NavigationOrder$NavigationType.class, str);
    }

    public static NavigationOrder$NavigationType[] values() {
        return (NavigationOrder$NavigationType[]) $VALUES.clone();
    }
}
