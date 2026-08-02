package com.yandex.go.walking.navigation.impl.navigation_core.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/navigation_core/repository/RoutesRequestStatus;", "", "INITIAL", "LOADING", "SUCCESS", "FAILURE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RoutesRequestStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoutesRequestStatus[] $VALUES;
    public static final RoutesRequestStatus FAILURE;
    public static final RoutesRequestStatus INITIAL;
    public static final RoutesRequestStatus LOADING;
    public static final RoutesRequestStatus SUCCESS;

    static {
        RoutesRequestStatus routesRequestStatus = new RoutesRequestStatus("INITIAL", 0);
        INITIAL = routesRequestStatus;
        RoutesRequestStatus routesRequestStatus2 = new RoutesRequestStatus("LOADING", 1);
        LOADING = routesRequestStatus2;
        RoutesRequestStatus routesRequestStatus3 = new RoutesRequestStatus("SUCCESS", 2);
        SUCCESS = routesRequestStatus3;
        RoutesRequestStatus routesRequestStatus4 = new RoutesRequestStatus("FAILURE", 3);
        FAILURE = routesRequestStatus4;
        RoutesRequestStatus[] routesRequestStatusArr = {routesRequestStatus, routesRequestStatus2, routesRequestStatus3, routesRequestStatus4};
        $VALUES = routesRequestStatusArr;
        $ENTRIES = kotlin.enums.a.a(routesRequestStatusArr);
    }

    public static RoutesRequestStatus valueOf(String str) {
        return (RoutesRequestStatus) Enum.valueOf(RoutesRequestStatus.class, str);
    }

    public static RoutesRequestStatus[] values() {
        return (RoutesRequestStatus[]) $VALUES.clone();
    }
}
