package com.yandex.go.shortcuts.models;

import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vel0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/shortcuts/models/RouteType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "vel0", "Auto", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RouteType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final RouteType Auto;
    public static final vel0 Companion;
    private final String type = "auto";

    static {
        RouteType routeType = new RouteType();
        Auto = routeType;
        RouteType[] routeTypeArr = {routeType};
        $VALUES = routeTypeArr;
        $ENTRIES = kotlin.enums.a.a(routeTypeArr);
        Companion = new vel0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(9));
    }

    public static RouteType valueOf(String str) {
        return (RouteType) Enum.valueOf(RouteType.class, str);
    }

    public static RouteType[] values() {
        return (RouteType[]) $VALUES.clone();
    }
}
