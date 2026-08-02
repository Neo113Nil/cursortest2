package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/navigator/analitycs/RouteCompletionType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ORGANIC", "FORCED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RouteCompletionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteCompletionType[] $VALUES;
    public static final RouteCompletionType FORCED;
    public static final RouteCompletionType ORGANIC;
    private final String value;

    static {
        RouteCompletionType routeCompletionType = new RouteCompletionType("ORGANIC", 0, "organic");
        ORGANIC = routeCompletionType;
        RouteCompletionType routeCompletionType2 = new RouteCompletionType("FORCED", 1, "forced");
        FORCED = routeCompletionType2;
        RouteCompletionType[] routeCompletionTypeArr = {routeCompletionType, routeCompletionType2};
        $VALUES = routeCompletionTypeArr;
        $ENTRIES = kotlin.enums.a.a(routeCompletionTypeArr);
    }

    public RouteCompletionType(String str, int i, String str2) {
        this.value = str2;
    }

    public static RouteCompletionType valueOf(String str) {
        return (RouteCompletionType) Enum.valueOf(RouteCompletionType.class, str);
    }

    public static RouteCompletionType[] values() {
        return (RouteCompletionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
